// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Local response normalization for backward propagation.  Implements
 *  descriptor, primitive descriptor, and primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class lrn_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public lrn_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public lrn_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public lrn_backward position(long position) {
        return (lrn_backward)super.position(position);
    }


    /** Descriptor for local response normalization backward propagation. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        public native @ByRef dnnl_lrn_desc_t data(); public native desc data(dnnl_lrn_desc_t setter);

        /** Initializes a descriptor for backward propagation using \p aalgorithm,
         *  memory descriptors \p data_desc and \p diff_data_desc, and
         *  regularization parameters \p local_size, \p alpha, \p beta, and
         *  \p k. */
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta, k); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta); }
        private native void allocate(algorithm aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta, k); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta, float k/*=1.f*/);
        public desc(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta) { super((Pointer)null); allocate(aalgorithm, data_desc, diff_data_desc, local_size, alpha, beta); }
        private native void allocate(@Cast("dnnl::algorithm") int aalgorithm, @Const @ByRef memory.desc data_desc,
                        @Const @ByRef memory.desc diff_data_desc, @Cast("dnnl::memory::dim") long local_size,
                        float alpha, float beta);
    }

    /** Primitive descriptor for local response normalization backward
     *  propagation. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
    
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, e, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef engine e,
                        @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e, @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e, @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e, @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(desc, attr, e, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc desc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine e, @Const @ByRef lrn_forward.primitive_desc hint_fwd_pd);

        /** Initializes a primitive descriptor for local response
         *  normalization backward propagation from a C primitive descriptor
         *  \p pd. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** Queries diff source memory descriptor. */
        public native @ByVal memory.desc diff_src_desc();

        /** Queries diff destination memory descriptor. */
        
        ///
        public native @ByVal memory.desc diff_dst_desc();

        /** Queries workspace memory descriptor.
         * 
         *  Returns a zero_md if no worspace is required. */
        public native @ByVal memory.desc workspace_desc();
    }

    public lrn_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    public lrn_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}
