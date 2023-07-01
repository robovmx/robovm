/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public class IDeviceEvent {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected IDeviceEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(IDeviceEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected static long swigRelease(IDeviceEvent obj) {
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
        LibIMobileDeviceJNI.delete_IDeviceEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEvent(IDeviceEventType value) {
    LibIMobileDeviceJNI.IDeviceEvent_event_set(swigCPtr, this, value.swigValue());
  }

  public IDeviceEventType getEvent() {
    return IDeviceEventType.swigToEnum(LibIMobileDeviceJNI.IDeviceEvent_event_get(swigCPtr, this));
  }

  public void setUdid(String value) {
    LibIMobileDeviceJNI.IDeviceEvent_udid_set(swigCPtr, this, value);
  }

  public String getUdid() {
    return LibIMobileDeviceJNI.IDeviceEvent_udid_get(swigCPtr, this);
  }

  public void setConnectionType(IDeviceConnectiontype value) {
    LibIMobileDeviceJNI.IDeviceEvent_connectionType_set(swigCPtr, this, value.swigValue());
  }

  public IDeviceConnectiontype getConnectionType() {
    return IDeviceConnectiontype.swigToEnum(LibIMobileDeviceJNI.IDeviceEvent_connectionType_get(swigCPtr, this));
  }

  public IDeviceEvent() {
    this(LibIMobileDeviceJNI.new_IDeviceEvent(), true);
  }

}
