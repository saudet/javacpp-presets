// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \}
 <p>
 *  \addtogroup cpp_api_concat Concat
 *  A primitive to concatenate data by arbitrary dimension.
 * 
 *  @see \ref c_api_concat in \ref c_api
 *  \{ */

@Namespace("mkldnn") @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class concat extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public concat(Pointer p) { super(p); }

    public static class primitive_desc extends mkldnn_primitive_desc_handle {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
    
        public native @ByVal @Cast("std::vector<const_mkldnn_primitive_desc_t>*") mkldnn_primitive_desc_vector cpp_to_c(
                        @ByVal memory_primitive_desc_vector inputs);

        public primitive_desc(@Const @ByRef memory.desc output, int concat_dimension,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(output, concat_dimension, inputs); }
        private native void allocate(@Const @ByRef memory.desc output, int concat_dimension,
                        @ByVal memory_primitive_desc_vector inputs);

        public primitive_desc(int concat_dimension,
                        @ByVal memory_primitive_desc_vector inputs) { super((Pointer)null); allocate(concat_dimension, inputs); }
        private native void allocate(int concat_dimension,
                        @ByVal memory_primitive_desc_vector inputs);

        public native @ByVal memory.primitive_desc dst_primitive_desc();

        public native @ByVal engine get_engine();
    }

    public concat(@Const @ByRef primitive_desc concat_pd,
                @StdVector primitive.at inputs, @Const @ByRef memory output) { super((Pointer)null); allocate(concat_pd, inputs, output); }
    private native void allocate(@Const @ByRef primitive_desc concat_pd,
                @StdVector primitive.at inputs, @Const @ByRef memory output);
}