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
package org.robovm.apple.metalpsgraph;

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
import org.robovm.apple.metal.*;
import org.robovm.apple.metalps.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/MPSGraphNonMaximumSuppressionCoordinateMode/*</name>*/ implements ValuedEnum {
    /*<values>*/
    /**
     * @since Available in iOS 17.0 and later.
     */
    CornersHeightFirst(0L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    CornersWidthFirst(1L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    CentersHeightFirst(2L),
    /**
     * @since Available in iOS 17.0 and later.
     */
    CentersWidthFirst(3L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private final long n;

    private /*<name>*/MPSGraphNonMaximumSuppressionCoordinateMode/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/MPSGraphNonMaximumSuppressionCoordinateMode/*</name>*/ valueOf(long n) {
        for (/*<name>*/MPSGraphNonMaximumSuppressionCoordinateMode/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/MPSGraphNonMaximumSuppressionCoordinateMode/*</name>*/.class.getName());
    }
}
