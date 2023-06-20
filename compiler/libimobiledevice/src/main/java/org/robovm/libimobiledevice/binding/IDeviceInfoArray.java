/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class IDeviceInfoArray {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IDeviceInfoArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IDeviceInfoArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IDeviceInfoArray obj) {
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
        LibIMobileDeviceJNI.delete_IDeviceInfoArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setValue(IDeviceInfo value) {
    LibIMobileDeviceJNI.IDeviceInfoArray_value_set(swigCPtr, this, IDeviceInfo.getCPtr(value), value);
  }

  public IDeviceInfo getValue() {
    long cPtr = LibIMobileDeviceJNI.IDeviceInfoArray_value_get(swigCPtr, this);
    return (cPtr == 0) ? null : new IDeviceInfo(cPtr, false);
  }

  public IDeviceInfoArray(int nelements) {
    this(LibIMobileDeviceJNI.new_IDeviceInfoArray(nelements), true);
  }

  public IDeviceInfo get(int index) {
    long cPtr = LibIMobileDeviceJNI.IDeviceInfoArray_get(swigCPtr, this, index);
    return (cPtr == 0) ? null : new IDeviceInfo(cPtr, false);
  }

  public void set(int index, IDeviceInfo value) {
    LibIMobileDeviceJNI.IDeviceInfoArray_set(swigCPtr, this, index, IDeviceInfo.getCPtr(value), value);
  }

}
