// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libfreenect2.global.freenect2.*;


@Namespace("libfreenect2") @Opaque @Properties(inherit = org.bytedeco.libfreenect2.presets.freenect2.class)
public class Freenect2Impl extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public Freenect2Impl() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Freenect2Impl(Pointer p) { super(p); }
}