// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** \}
 <p>
 *  An auxiliary structure to specify primitive's inputs/outputs at execution
 * 
 *  \warning
 *       With this API it's impossible to preserve constness of memory, so all
 *       memories are passed w/o const qualifier. However only memories with
 *       output semantics might be changed during the execution */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_exec_arg_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_exec_arg_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_exec_arg_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_exec_arg_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_exec_arg_t position(long position) {
        return (dnnl_exec_arg_t)super.position(position);
    }

    /** An argument index, e.g. DNNL_ARG_SRC */
    public native int arg(); public native dnnl_exec_arg_t arg(int setter);
    /** Input/output memory */
    public native dnnl_memory memory(); public native dnnl_exec_arg_t memory(dnnl_memory setter);
}
