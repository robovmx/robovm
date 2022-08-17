/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  The Android Open Source
 * Project designates this particular file as subject to the "Classpath"
 * exception as provided by The Android Open Source Project in the LICENSE
 * file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */

#include "jni.h"
#include "jvm.h"
#include <nativehelper/JNIHelp.h>
#include "nativehelper/jni_macros.h"
#include "unicode/uchar.h"
#include <math.h>
#include <stdio.h> // For BUFSIZ

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isLowerCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_islower(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isUpperCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isupper(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isTitleCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_istitle(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isDigitImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isdigit(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isLetterImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isalpha(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isLetterOrDigitImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isalnum(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isAlphabeticImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_hasBinaryProperty(codePoint, UCHAR_ALPHABETIC);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isIdeographicImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_hasBinaryProperty(codePoint, UCHAR_IDEOGRAPHIC);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_getTypeImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_charType(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isUnicodeIdentifierStartImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isIDStart(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isUnicodeIdentifierPartImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isIDPart(codePoint);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_toLowerCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_tolower(codePoint);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_toUpperCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_toupper(codePoint);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_toTitleCaseImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_totitle(codePoint);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_digitImpl(JNIEnv* env, jclass, jint codePoint, jint radix) {
  return u_digit(codePoint, radix);
}

extern "C" JNIEXPORT jint JNICALL
Java_java_lang_Character_getNumericValueImpl(JNIEnv* env, jclass, jint codePoint) {
  double result = u_getNumericValue(codePoint);
  if (result == U_NO_NUMERIC_VALUE) {
    return -1;
  } else if (result < 0 || floor(result + 0.5) != result) {
    return -2;
  }
  return static_cast<jint>(result);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isWhitespaceImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isWhitespace(codePoint);
}

extern "C" JNIEXPORT jbyte JNICALL
Java_java_lang_Character_getDirectionalityImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_charDirection(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isMirroredImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isMirrored(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isDefinedImpl(JNIEnv* env, jclass, jint codePoint) {
  return u_isdefined(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isIdentifierIgnorableImpl(JNIEnv* env, jclass, jint codePoint) {
    return u_isIDIgnorable(codePoint);
}

extern "C" JNIEXPORT jboolean JNICALL
Java_java_lang_Character_isSpaceCharImpl(JNIEnv*, jclass, jint codePoint) {
    return u_isJavaSpaceChar(codePoint);
}

extern "C" JNIEXPORT jstring JNICALL
Java_java_lang_Character_getNameImpl(JNIEnv* env, jclass, jint codePoint) {
    // U_UNICODE_CHAR_NAME gives us the modern names for characters. For control characters,
    // we need U_EXTENDED_CHAR_NAME to get "NULL" rather than "BASIC LATIN 0" and so on.
    // We could just use U_EXTENDED_CHAR_NAME except that it returns strings for characters
    // that aren't unassigned but that don't have names, and those strings aren't in the form
    // Java specifies.
    bool isControl = (codePoint <= 0x1f || (codePoint >= 0x7f && codePoint <= 0x9f));
    UCharNameChoice nameType = isControl ? U_EXTENDED_CHAR_NAME : U_UNICODE_CHAR_NAME;
    UErrorCode status = U_ZERO_ERROR;
    char buf[BUFSIZ]; // TODO: is there a more sensible upper bound?
    int32_t byteCount = u_charName(codePoint, nameType, &buf[0], sizeof(buf), &status);
    return (U_FAILURE(status) || byteCount == 0) ? NULL : env->NewStringUTF(buf);
}

// RoboVM Note: Using fully qualified JNI names
//static JNINativeMethod gMethods[] = {
//  FAST_NATIVE_METHOD(Character, digitImpl, "(II)I"),
//  FAST_NATIVE_METHOD(Character, getDirectionalityImpl, "(I)B"),
//  NATIVE_METHOD(Character, getNameImpl, "(I)Ljava/lang/String;"),
//  FAST_NATIVE_METHOD(Character, getNumericValueImpl, "(I)I"),
//  FAST_NATIVE_METHOD(Character, getTypeImpl, "(I)I"),
//  FAST_NATIVE_METHOD(Character, isAlphabeticImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isDefinedImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isDigitImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isIdentifierIgnorableImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isIdeographicImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isLetterImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isLetterOrDigitImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isLowerCaseImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isMirroredImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isSpaceCharImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isTitleCaseImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isUnicodeIdentifierPartImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isUnicodeIdentifierStartImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isUpperCaseImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, isWhitespaceImpl, "(I)Z"),
//  FAST_NATIVE_METHOD(Character, toLowerCaseImpl, "(I)I"),
//  FAST_NATIVE_METHOD(Character, toTitleCaseImpl, "(I)I"),
//  FAST_NATIVE_METHOD(Character, toUpperCaseImpl, "(I)I"),
//};
//
//void register_java_lang_Character(JNIEnv* env) {
//  jniRegisterNativeMethods(env, "java/lang/Character", gMethods, NELEM(gMethods));
//}
