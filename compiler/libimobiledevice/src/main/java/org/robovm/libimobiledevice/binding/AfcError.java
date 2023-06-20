/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.robovm.libimobiledevice.binding;

public enum AfcError {
  AFC_E_SUCCESS(0),
  AFC_E_UNKNOWN_ERROR(1),
  AFC_E_OP_HEADER_INVALID(2),
  AFC_E_NO_RESOURCES(3),
  AFC_E_READ_ERROR(4),
  AFC_E_WRITE_ERROR(5),
  AFC_E_UNKNOWN_PACKET_TYPE(6),
  AFC_E_INVALID_ARG(7),
  AFC_E_OBJECT_NOT_FOUND(8),
  AFC_E_OBJECT_IS_DIR(9),
  AFC_E_PERM_DENIED(10),
  AFC_E_SERVICE_NOT_CONNECTED(11),
  AFC_E_OP_TIMEOUT(12),
  AFC_E_TOO_MUCH_DATA(13),
  AFC_E_END_OF_DATA(14),
  AFC_E_OP_NOT_SUPPORTED(15),
  AFC_E_OBJECT_EXISTS(16),
  AFC_E_OBJECT_BUSY(17),
  AFC_E_NO_SPACE_LEFT(18),
  AFC_E_OP_WOULD_BLOCK(19),
  AFC_E_IO_ERROR(20),
  AFC_E_OP_INTERRUPTED(21),
  AFC_E_OP_IN_PROGRESS(22),
  AFC_E_INTERNAL_ERROR(23),
  AFC_E_MUX_ERROR(30),
  AFC_E_NO_MEM(31),
  AFC_E_NOT_ENOUGH_DATA(32),
  AFC_E_DIR_NOT_EMPTY(33),
  AFC_E_FORCE_SIGNED_TYPE(-1);

  public final int swigValue() {
    return swigValue;
  }

  public static AfcError swigToEnum(int swigValue) {
    AfcError[] swigValues = AfcError.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (AfcError swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + AfcError.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private AfcError() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private AfcError(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private AfcError(AfcError swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

