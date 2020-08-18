// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.qt.Qt5Core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.qt.global.Qt5Core.*;


@NoOffset @Properties(inherit = org.bytedeco.qt.presets.Qt5Core.class)
public class QDeferredDeleteEvent extends QEvent {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QDeferredDeleteEvent(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QDeferredDeleteEvent(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public QDeferredDeleteEvent position(long position) {
        return (QDeferredDeleteEvent)super.position(position);
    }
    @Override public QDeferredDeleteEvent getPointer(long i) {
        return new QDeferredDeleteEvent(this).position(position + i);
    }

    public QDeferredDeleteEvent() { super((Pointer)null); allocate(); }
    private native void allocate();
    public native int loopLevel();
}
