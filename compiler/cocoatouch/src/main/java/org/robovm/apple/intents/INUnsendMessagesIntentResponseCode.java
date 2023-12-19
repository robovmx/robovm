/*
 * Copyright (C) 2013-2015 RoboVM AB
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.intents;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import org.robovm.objc.*;
import org.robovm.objc.annotation.*;
import org.robovm.objc.block.*;
import org.robovm.rt.*;
import org.robovm.rt.annotation.*;
import org.robovm.rt.bro.*;
import org.robovm.rt.bro.annotation.*;
import org.robovm.rt.bro.ptr.*;
import org.robovm.apple.foundation.*;
import org.robovm.apple.eventkit.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.coregraphics.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 17.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedSIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/INUnsendMessagesIntentResponseCode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    Unspecified(0L),
    Ready(1L),
    InProgress(2L),
    Success(3L),
    Failure(4L),
    FailureRequiringAppLaunch(5L),
    FailureMessageNotFound(6L),
    FailurePastUnsendTimeLimit(7L),
    FailureMessageTypeUnsupported(8L),
    FailureUnsupportedOnService(9L),
    FailureMessageServiceNotAvailable(10L),
    FailureRequiringInAppAuthentication(11L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/INUnsendMessagesIntentResponseCode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/INUnsendMessagesIntentResponseCode/*</name>*/ valueOf(long n) {
        for (/*<name>*/INUnsendMessagesIntentResponseCode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/INUnsendMessagesIntentResponseCode/*</name>*/.class.getName());
    }
}
