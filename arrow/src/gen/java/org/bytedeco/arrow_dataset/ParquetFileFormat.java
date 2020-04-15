// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A FileFormat implementation that reads from Parquet files */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ParquetFileFormat extends FileFormat {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParquetFileFormat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetFileFormat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFileFormat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParquetFileFormat position(long position) {
        return (ParquetFileFormat)super.position(position);
    }

  public native @StdString String type_name();

  public native @ByVal BoolResult IsSupported(@Const @ByRef FileSource source);

  /** \brief Return the schema of the file if possible. */
  public native @ByVal SchemaResult Inspect(@Const @ByRef FileSource source);

  /** \brief Open a file for scanning */
  public native @ByVal ScanTaskIteratorResult ScanFile(@Const @ByRef FileSource source,
                                      @SharedPtr ScanOptions options,
                                      @SharedPtr ScanContext context);

  public native @ByVal FragmentResult MakeFragment(
        @Const @ByRef FileSource source, @SharedPtr ScanOptions options);
}