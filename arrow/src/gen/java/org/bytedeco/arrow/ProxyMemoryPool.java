// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Derived class for memory allocation.
 * 
 *  Tracks the number of bytes and maximum memory allocated through its direct
 *  calls. Actual allocation is delegated to MemoryPool class. */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ProxyMemoryPool extends MemoryPool {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProxyMemoryPool(Pointer p) { super(p); }

  public ProxyMemoryPool(MemoryPool pool) { super((Pointer)null); allocate(pool); }
  private native void allocate(MemoryPool pool);

  public native @ByVal Status Allocate(@Cast("int64_t") long size, @Cast("uint8_t**") PointerPointer out);
  public native @ByVal Status Allocate(@Cast("int64_t") long size, @Cast("uint8_t**") @ByPtrPtr BytePointer out);
  public native @ByVal Status Allocate(@Cast("int64_t") long size, @Cast("uint8_t**") @ByPtrPtr ByteBuffer out);
  public native @ByVal Status Allocate(@Cast("int64_t") long size, @Cast("uint8_t**") @ByPtrPtr byte[] out);
  public native @ByVal Status Reallocate(@Cast("int64_t") long old_size, @Cast("int64_t") long new_size, @Cast("uint8_t**") PointerPointer ptr);
  public native @ByVal Status Reallocate(@Cast("int64_t") long old_size, @Cast("int64_t") long new_size, @Cast("uint8_t**") @ByPtrPtr BytePointer ptr);
  public native @ByVal Status Reallocate(@Cast("int64_t") long old_size, @Cast("int64_t") long new_size, @Cast("uint8_t**") @ByPtrPtr ByteBuffer ptr);
  public native @ByVal Status Reallocate(@Cast("int64_t") long old_size, @Cast("int64_t") long new_size, @Cast("uint8_t**") @ByPtrPtr byte[] ptr);

  public native void Free(@Cast("uint8_t*") BytePointer buffer, @Cast("int64_t") long size);
  public native void Free(@Cast("uint8_t*") ByteBuffer buffer, @Cast("int64_t") long size);
  public native void Free(@Cast("uint8_t*") byte[] buffer, @Cast("int64_t") long size);

  public native @Cast("int64_t") long bytes_allocated();

  public native @Cast("int64_t") long max_memory();

  public native @StdString String backend_name();
}