// Targeted by JavaCPP version 1.5.3: DO NOT EDIT THIS FILE

package org.bytedeco.arrow.global;

import org.bytedeco.arrow_dataset.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

public class arrow_dataset extends org.bytedeco.arrow.presets.arrow_dataset {
    static { Loader.load(); }

// Targeting ../../arrow_dataset/ExpressionVector.java


// Targeting ../../arrow_dataset/SourceFactoryVector.java


// Parsed from arrow/util/iterator.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <cassert>
// #include <functional>
// #include <memory>
// #include <tuple>
// #include <type_traits>
// #include <utility>
// #include <vector>

// #include "arrow/result.h"
// #include "arrow/status.h"
// #include "arrow/util/compare.h"
// #include "arrow/util/functional.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/optional.h"
// #include "arrow/util/visibility.h"
// Targeting ../../arrow_dataset/ScanTaskIterator.java



/** \brief Construct an Iterator which invokes a callable on Next() */

/** \brief Simple iterator which yields the elements of a std::vector */

/** \brief Simple iterator which yields the elements of a std::vector<T> as optional<T>.
 *  This is provided to support T where IterationTraits<T>::End is not specialized */

/** \brief MapIterator takes ownership of an iterator and a function to apply
 *  on every element. The mapped function is not allowed to fail. */

/** \brief MapIterator takes ownership of an iterator and a function to apply
 *  on every element. The mapped function is not allowed to fail. */
// Targeting ../../arrow_dataset/FilterIterator.java



/** \brief Like MapIterator, but where the function can fail or reject elements. */

/** \brief FlattenIterator takes an iterator generating iterators and yields a
 *  unified iterator that flattens/concatenates in a single stream. */
// Targeting ../../arrow_dataset/ReadaheadPromise.java


// Targeting ../../arrow_dataset/ReadaheadQueue.java



  // namespace detail

/** \brief Readahead iterator that iterates on the underlying iterator in a
 *  separate thread, getting up to N values in advance. */

  // namespace arrow


// Parsed from arrow/util/thread_pool.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #ifndef ARROW_UTIL_THREAD_POOL_H
// #define ARROW_UTIL_THREAD_POOL_H

// #ifndef _WIN32
// #include <unistd.h>
// #endif

// #include <cstdlib>
// #include <functional>
// #include <future>
// #include <memory>
// #include <string>
// #include <type_traits>
// #include <utility>

// #include "arrow/result.h"
// #include "arrow/status.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/visibility.h"

/** \brief Get the capacity of the global thread pool
 * 
 *  Return the number of worker threads in the thread pool to which
 *  Arrow dispatches various CPU-bound tasks.  This is an ideal number,
 *  not necessarily the exact number of threads at a given point in time.
 * 
 *  You can change this number using SetCpuThreadPoolCapacity(). */

///
///
@Namespace("arrow") public static native int GetCpuThreadPoolCapacity();

/** \brief Set the capacity of the global thread pool
 * 
 *  Set the number of worker threads int the thread pool to which
 *  Arrow dispatches various CPU-bound tasks.
 * 
 *  The current number is returned by GetCpuThreadPoolCapacity(). */
@Namespace("arrow") public static native @ByVal Status SetCpuThreadPoolCapacity(int threads);

// Needed because std::packaged_task is not copyable and hence not convertible
// to std::function.


// Targeting ../../arrow_dataset/ThreadPool.java



// Return the process-global thread pool for CPU-bound tasks.
@Namespace("arrow::internal") public static native ThreadPool GetCpuThreadPool();

  // namespace internal
  // namespace arrow

// #endif  // ARROW_UTIL_THREAD_POOL_H


// Parsed from arrow/result.h

//
// Copyright 2017 Asylo authors
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

// Adapted from Asylo

// #pragma once

// #include <string>
// #include <utility>

// #include "arrow/status.h"
// #include "arrow/util/compare.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/variant.h"

@Namespace("arrow::internal") public static native void DieWithMessage(@StdString String msg);
@Namespace("arrow::internal") public static native void DieWithMessage(@StdString BytePointer msg);


// Targeting ../../arrow_dataset/DatasetResult.java


// Targeting ../../arrow_dataset/DatasetFactoryResult.java


// Targeting ../../arrow_dataset/ExpressionResult.java


// Targeting ../../arrow_dataset/FragmentResult.java


// Targeting ../../arrow_dataset/ScannerResult.java


// Targeting ../../arrow_dataset/ScannerBuilderResult.java


// Targeting ../../arrow_dataset/ScanTaskResult.java


// Targeting ../../arrow_dataset/SourceResult.java


// Targeting ../../arrow_dataset/SourceFactoryResult.java


// Targeting ../../arrow_dataset/ThreadPoolResult.java


// Targeting ../../arrow_dataset/ScanTaskIteratorResult.java



// #define ARROW_ASSIGN_OR_RAISE_IMPL(result_name, lhs, rexpr)
//   auto result_name = (rexpr);
//   ARROW_RETURN_NOT_OK((result_name).status());
//   lhs = std::move(result_name).ValueOrDie();


///
///
///
// #define ARROW_ASSIGN_OR_RAISE_NAME(x, y) ARROW_CONCAT(x, y)

/** \brief Execute an expression that returns a Result, extracting its value
 *  into the variable defined by {@code lhs} (or returning a Status on error).
 * 
 *  Example: Assigning to a new value:
 *    ARROW_ASSIGN_OR_RAISE(auto value, MaybeGetValue(arg));
 * 
 *  Example: Assigning to an existing value:
 *    ValueType value;
 *    ARROW_ASSIGN_OR_RAISE(value, MaybeGetValue(arg));
 * 
 *  WARNING: ARROW_ASSIGN_OR_RAISE expands into multiple statements;
 *  it cannot be used in a single statement (e.g. as the body of an if
 *  statement without {})! */
// #define ARROW_ASSIGN_OR_RAISE(lhs, rexpr)
//   ARROW_ASSIGN_OR_RAISE_IMPL(ARROW_ASSIGN_OR_RAISE_NAME(_error_or_value, __COUNTER__),
//                              lhs, rexpr);

  // namespace internal

  // namespace arrow


// Parsed from arrow/dataset/api.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/discovery.h"
// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/file_ipc.h"
// #include "arrow/dataset/file_parquet.h"
// #include "arrow/dataset/filter.h"
// #include "arrow/dataset/scanner.h"


// Parsed from arrow/dataset/visibility.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #if defined(_WIN32) || defined(__CYGWIN__)
// #if defined(_MSC_VER)
// #pragma warning(push)
// #pragma warning(disable : 4251)
// #else
// #pragma GCC diagnostic ignored "-Wattributes"
// #endif

// #ifdef ARROW_DS_STATIC
// #define ARROW_DS_EXPORT
// #elif defined(ARROW_DS_EXPORTING)
// #define ARROW_DS_EXPORT __declspec(dllexport)
// #else
// #define ARROW_DS_EXPORT __declspec(dllimport)
// #endif

// #define ARROW_DS_NO_EXPORT
// #else  // Not Windows
// #ifndef ARROW_DS_EXPORT
// #define ARROW_DS_EXPORT __attribute__((visibility("default")))
// #endif
// #ifndef ARROW_DS_NO_EXPORT
// #define ARROW_DS_NO_EXPORT __attribute__((visibility("hidden")))
// #endif
// #endif  // Non-Windows

// #if defined(_MSC_VER)
// #pragma warning(pop)
// #endif


// Parsed from arrow/dataset/type_fwd.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <vector>

// #include "arrow/dataset/visibility.h"
// #include "arrow/type_fwd.h"  // IWYU pragma: export

  // namespace compute

  // namespace fs
// Targeting ../../arrow_dataset/FieldReferenceExpression.java


// Targeting ../../arrow_dataset/Partitioning.java


// Targeting ../../arrow_dataset/PartitioningFactory.java


// Targeting ../../arrow_dataset/PartitioningOrFactory.java


// Targeting ../../arrow_dataset/RecordBatchProjector.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/dataset.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/util/macros.h"
// Targeting ../../arrow_dataset/Fragment.java


// Targeting ../../arrow_dataset/InMemoryFragment.java


// Targeting ../../arrow_dataset/Source.java


// Targeting ../../arrow_dataset/InMemorySource.java


// Targeting ../../arrow_dataset/TreeSource.java


// Targeting ../../arrow_dataset/Dataset.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/discovery.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

/** Logic for automatically determining the structure of multi-file
 *  dataset with possible partitioning according to available
 *  partitioning */

// #pragma once

// #include <memory>
// #include <string>
// #include <vector>

// #include "arrow/dataset/partition.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/filesystem/filesystem.h"
// #include "arrow/filesystem/path_forest.h"
// #include "arrow/result.h"
// #include "arrow/util/macros.h"
// #include "arrow/util/variant.h"
// Targeting ../../arrow_dataset/SourceFactory.java


// Targeting ../../arrow_dataset/DatasetFactory.java


// Targeting ../../arrow_dataset/FileSystemFactoryOptions.java


// Targeting ../../arrow_dataset/FileSystemSourceFactory.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/scanner.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <unordered_set>
// #include <utility>
// #include <vector>

// #include "arrow/compute/context.h"
// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/projector.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/memory_pool.h"
// #include "arrow/util/thread_pool.h"
// Targeting ../../arrow_dataset/TaskGroup.java



// Targeting ../../arrow_dataset/ScanContext.java


// Targeting ../../arrow_dataset/ScanOptions.java


// Targeting ../../arrow_dataset/ScanTask.java


// Targeting ../../arrow_dataset/InMemoryScanTask.java




///
@Namespace("arrow::dataset") public static native @ByVal ScanTaskIteratorResult ScanTaskIteratorFromRecordBatch(
    @ByVal RecordBatchVector batches,
    @SharedPtr ScanOptions options, @SharedPtr ScanContext arg2);
// Targeting ../../arrow_dataset/Scanner.java


// Targeting ../../arrow_dataset/ScannerBuilder.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_base.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>
// #include <unordered_map>
// #include <utility>
// #include <vector>

// #include "arrow/buffer.h"
// #include "arrow/dataset/dataset.h"
// #include "arrow/dataset/partition.h"
// #include "arrow/dataset/scanner.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/filesystem/filesystem.h"
// #include "arrow/filesystem/path_forest.h"
// #include "arrow/io/file.h"
// #include "arrow/util/compression.h"
// #include "arrow/util/variant.h"
// Targeting ../../arrow_dataset/Filter.java


// Targeting ../../arrow_dataset/FileSource.java


// Targeting ../../arrow_dataset/FileFormat.java


// Targeting ../../arrow_dataset/FileFragment.java


// Targeting ../../arrow_dataset/FileSystemSource.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_ipc.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// Targeting ../../arrow_dataset/IpcFileFormat.java


// Targeting ../../arrow_dataset/IpcFragment.java



  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/file_parquet.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <memory>
// #include <string>

// #include "arrow/dataset/file_base.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
  // namespace parquet
// Targeting ../../arrow_dataset/ParquetFileFormat.java


// Targeting ../../arrow_dataset/ParquetFragment.java





  // namespace dataset
  // namespace arrow


// Parsed from arrow/dataset/filter.h

// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

// #pragma once

// #include <functional>
// #include <memory>
// #include <string>
// #include <utility>
// #include <vector>

// #include "arrow/compute/context.h"
// #include "arrow/compute/kernel.h"
// #include "arrow/compute/kernels/cast.h"
// #include "arrow/compute/kernels/compare.h"
// #include "arrow/dataset/type_fwd.h"
// #include "arrow/dataset/visibility.h"
// #include "arrow/result.h"
// #include "arrow/scalar.h"
// #include "arrow/type_fwd.h"
// #include "arrow/util/checked_cast.h"
// #include "arrow/util/variant.h"
// Targeting ../../arrow_dataset/ExpressionType.java


// Targeting ../../arrow_dataset/Expression.java


// Targeting ../../arrow_dataset/CastExpressionImpl.java


// Targeting ../../arrow_dataset/InExpressionImpl.java


// Targeting ../../arrow_dataset/IsValidExpressionImpl.java


// Targeting ../../arrow_dataset/NotExpressionImpl.java


// Targeting ../../arrow_dataset/OrExpressionImpl.java


// Targeting ../../arrow_dataset/AndExpressionImpl.java


// Targeting ../../arrow_dataset/ComparisonExpressionImpl.java


// Targeting ../../arrow_dataset/UnaryExpression.java


// Targeting ../../arrow_dataset/BinaryExpression.java


// Targeting ../../arrow_dataset/ComparisonExpression.java


// Targeting ../../arrow_dataset/AndExpression.java


// Targeting ../../arrow_dataset/OrExpression.java


// Targeting ../../arrow_dataset/NotExpression.java


// Targeting ../../arrow_dataset/IsValidExpression.java


// Targeting ../../arrow_dataset/InExpression.java


// Targeting ../../arrow_dataset/CastExpression.java


// Targeting ../../arrow_dataset/ScalarExpression.java


// Targeting ../../arrow_dataset/FieldExpression.java


// Targeting ../../arrow_dataset/CustomExpression.java



@Namespace("arrow::dataset") public static native @SharedPtr AndExpression and_(@SharedPtr @ByVal Expression lhs,
                                                    @SharedPtr @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr @ByVal Expression and_(@Const @ByRef ExpressionVector subexpressions);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator &&") AndExpression and(@Const @ByRef Expression lhs, @Const @ByRef Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr OrExpression or_(@SharedPtr @ByVal Expression lhs,
                                                  @SharedPtr @ByVal Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr @ByVal Expression or_(@Const @ByRef ExpressionVector subexpressions);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator ||") OrExpression or(@Const @ByRef Expression lhs, @Const @ByRef Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr NotExpression not_(@SharedPtr @ByVal Expression operand);

@Namespace("arrow::dataset") public static native @ByVal @Name("operator !") NotExpression not(@Const @ByRef Expression rhs);

@Namespace("arrow::dataset") public static native @SharedPtr ScalarExpression scalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::Scalar>"}) Scalar value);



// #define COMPARISON_FACTORY(NAME, FACTORY_NAME, OP)
//   inline std::shared_ptr<ComparisonExpression> FACTORY_NAME(
//       const std::shared_ptr<Expression>& lhs, const std::shared_ptr<Expression>& rhs) {
//     return std::make_shared<ComparisonExpression>(compute::CompareOperator::NAME, lhs,
//                                                   rhs);
//   }
// 
//   template <typename T, typename Enable = typename std::enable_if<!std::is_base_of<
//                             Expression, typename std::decay<T>::type>::value>::type>
//   ComparisonExpression operator OP(const Expression& lhs, T&& rhs) {
//     return ComparisonExpression(compute::CompareOperator::NAME, lhs.Copy(),
//                                 scalar(std::forward<T>(rhs)));
//   }
// 
//   inline ComparisonExpression operator OP(const Expression& lhs,
//                                           const Expression& rhs) {
//     return ComparisonExpression(compute::CompareOperator::NAME, lhs.Copy(), rhs.Copy());
//   }
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression equal(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator ==") ComparisonExpression equals(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression not_equal(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator !=") ComparisonExpression notEquals(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression greater(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator >") ComparisonExpression greaterThan(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression greater_equal(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator >=") ComparisonExpression greaterThanEquals(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression less(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator <") ComparisonExpression lessThan(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
@Namespace("arrow::dataset") public static native @SharedPtr ComparisonExpression less_equal(
      @Const @SharedPtr @ByRef Expression lhs, @Const @SharedPtr @ByRef Expression rhs);

  @Namespace("arrow::dataset") public static native @ByVal @Name("operator <=") ComparisonExpression lessThanEquals(@Const @ByRef Expression lhs,
                                            @Const @ByRef Expression rhs);
// #undef COMPARISON_FACTORY

@Namespace("arrow::dataset") public static native @SharedPtr FieldExpression field_ref(@StdString String name);
@Namespace("arrow::dataset") public static native @SharedPtr FieldExpression field_ref(@StdString BytePointer name);
// clang-format off

  // namespace string_literals





/** \brief Insert CastExpressions where necessary to make a valid expression. */
@Namespace("arrow::dataset") public static native @ByVal ExpressionResult InsertImplicitCasts(
    @Const @ByRef Expression expr, @Const @ByRef Schema schema);

/** \brief Returns field names referenced in the expression. */
@Namespace("arrow::dataset") public static native @ByVal StringVector FieldsInExpression(@Const @ByRef Expression expr);
// Targeting ../../arrow_dataset/ExpressionEvaluator.java


// Targeting ../../arrow_dataset/TreeEvaluator.java



  // namespace dataset
  // namespace arrow


}