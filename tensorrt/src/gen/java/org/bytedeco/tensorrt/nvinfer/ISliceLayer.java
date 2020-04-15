// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \brief Slices an input tensor into an output tensor based on the offset and strides.
 * 
 *  The slice layer has two variants, static and dynamic. Static slice specifies the start, size, and stride
 *  dimensions at layer creation time via Dims and can use the get/set accessor functions of the ISliceLayer.
 *  Dynamic slice specifies one or more of start, size or stride as ITensors, by using ILayer::setTensor to add
 *  a second, third, or fourth input respectively. The corresponding Dims are used if an input
 *  is missing or null.
 * 
 *  An application can determine if the ISliceLayer has a dynamic output shape based on whether
 *  the size input (third input) is present and non-null.
 * 
 *  The slice layer selects for each dimension a start location from within the input tensor, and
 *  copies elements to the output tensor using the specified stride across the input tensor.
 *  Start, size, and stride tensors must be 1D shape tensors if not specified via Dims.
 * 
 *  Furthermore, if the slice layer must produce a shape tensor, then start, size, and stride must be
 *  build time constants, i.e. as static Dims, or be computable by constant folding.
 * 
 *  For example using slice on a tensor:
 *  input = {{0, 2, 4}, {1, 3, 5}}
 *  start = {1, 0}
 *  size = {1, 2}
 *  stride = {1, 2}
 *  output = {{1, 5}}
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ISliceLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ISliceLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the start offset that the slice layer uses to create the output slice.
     * 
     *  @param start The start offset to read data from the input tensor.
     * 
     *  If the second input is set, it is reset to null.
     * 
     *  @see getStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void setStart(@ByVal Dims start);

    /**
     *  \brief Get the start offset for the slice layer.
     * 
     *  @return The start offset, or an invalid Dims structure.
     * 
     *  If the second input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStart
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getStart();

    /**
     *  \brief Set the dimensions of the output slice.
     * 
     *  @param size The dimensions of the output slice.
     * 
     *  If the third input is set, it is reset to null.
     * 
     *  @see getSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void setSize(@ByVal Dims size);

    /**
     *  \brief Get dimensions of the output slice.
     * 
     *  @return The output dimension, or an invalid Dims structure.
     * 
     *  If the third input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setSize
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal Dims getSize();

    /**
     *  \brief Set the stride for computing the output slice data.
     * 
     *  @param stride The dimensions of the stride to compute the values to store in the output slice.
     * 
     *  If the fourth input is set, it is reset to null.
     * 
     *  @see getStride
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native void setStride(@ByVal Dims stride);

    /**
     *  \brief Get the stride for the output slice.
     * 
     *  @return The slicing stride, or an invalid Dims structure.
     * 
     *  If the fourth input is present and non-null,
     *  this function returns a Dims with nbDims = -1.
     * 
     *  @see setStride
     *  */
    
    
    //!
    //!
    //!
    public native @ByVal Dims getStride();

    /**
     *  \brief Set the slice mode.
     * 
     *  @see getMode()
     *  */
    
    
    //!
    //!
    //!
    public native void setMode(SliceMode mode);
    public native void setMode(@Cast("nvinfer1::SliceMode") int mode);

    /**
     *  \brief Get the slice mode.
     * 
     *  @see setMode()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native SliceMode getMode();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  For a slice layer, the values 0-3 are valid. The values 1-3 override start, size or stride
     *  dimensions, respectively. Conversely, this input tensor can be overridden via appropriate set call.
     *  The indices are as follows:
     * 
     *  Index | Description
     *    0   | Data or Shape tensor to be sliced.
     *    1   | The start tensor to begin slicing, as a 1D shape tensor.
     *    2   | The size tensor of the resulting slice, as a 1D shape tensor.
     *    3   | The stride of the slicing operation, as a 1D shape tensor.
     * 
     *  If this function is called with a value greater than 0, then the function getNbInputs() changes
     *  from returning 1 to index + 1.
     *  */
    public native void setInput(int index, @ByRef ITensor tensor);
}