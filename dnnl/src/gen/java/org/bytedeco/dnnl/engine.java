// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;

/** \endcond
 <p>
 *  An execution engine. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class engine extends dnnl_engine_handle {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public engine(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public engine(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public engine position(long position) {
        return (engine)super.position(position);
    }


    /** Kinds of engines. */
    public enum kind {
        /** An unspecified engine */
        any(dnnl_any_engine),
        /** CPU engine */
        cpu(dnnl_cpu),
        /** GPU engine */
        gpu(dnnl_gpu);

        public final int value;
        private kind(int v) { this.value = v; }
        private kind(kind e) { this.value = e.value; }
        public kind intern() { for (kind e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    
    ///
    public engine() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Returns the number of engines of a certain kind.
     * 
     *  @param akind The kind of engines to count. */
    
    ///
    public static native @Cast("size_t") long get_count(kind akind);
    public static native @Cast("size_t") long get_count(@Cast("dnnl::engine::kind") int akind);

    /** Constructs an engine.
     * 
     *  @param akind The kind of engine to construct.
     *  @param index The index of the engine. Must be less than the value
     *               returned by #get_count() for this particular kind
     *               of engine. */
    public engine(kind akind, @Cast("size_t") long index) { super((Pointer)null); allocate(akind, index); }
    private native void allocate(kind akind, @Cast("size_t") long index);
    public engine(@Cast("dnnl::engine::kind") int akind, @Cast("size_t") long index) { super((Pointer)null); allocate(akind, index); }
    private native void allocate(@Cast("dnnl::engine::kind") int akind, @Cast("size_t") long index);

// #if DNNL_GPU_RUNTIME == DNNL_RUNTIME_OCL
// #endif

    /** Constructs an engine from other engine \p aengine. */
    public engine(dnnl_engine aengine) { super((Pointer)null); allocate(aengine); }
    private native void allocate(dnnl_engine aengine);

    /** Constructs an engine from the primitive descriptor \p pd
     *  by querying its engine. */
    public engine(@Const @ByRef dnnl_primitive_desc_handle pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef dnnl_primitive_desc_handle pd);

    /** Returns the kind of the engine. */
    public native kind get_kind();

// #if DNNL_GPU_RUNTIME == DNNL_RUNTIME_OCL
// #endif
}
