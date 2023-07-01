/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class PlistRefOut {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected PlistRefOut(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(PlistRefOut obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(PlistRefOut obj) {
    long ptr = 0;
    if (obj != null) {
      if (!obj.swigCMemOwn)
        throw new RuntimeException("Cannot release ownership as memory is not owned");
      ptr = obj.swigCPtr;
      obj.swigCMemOwn = false;
      obj.delete();
    }
    return ptr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        LibIMobileDeviceJNI.delete_PlistRefOut(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public PlistRef getValue() {
    long cPtr = LibIMobileDeviceJNI.PlistRefOut_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new PlistRef(cPtr, false);
  }

  public PlistRefOut() {
    this(LibIMobileDeviceJNI.new_PlistRefOut(), true);
  }

}
