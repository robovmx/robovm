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
package org.robovm.apple.corenfc;

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
import org.robovm.apple.dispatch.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/NFCPollingOption/*</name>*/ extends Bits</*<name>*/NFCPollingOption/*</name>*/> {
    /*<values>*/
    public static final NFCPollingOption None = new NFCPollingOption(0L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NFCPollingOption ISO14443 = new NFCPollingOption(1L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NFCPollingOption ISO15693 = new NFCPollingOption(2L);
    /**
     * @since Available in iOS 13.0 and later.
     */
    public static final NFCPollingOption ISO18092 = new NFCPollingOption(4L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/NFCPollingOption/*</name>*/[] values = _values(/*<name>*/NFCPollingOption/*</name>*/.class);

    public /*<name>*/NFCPollingOption/*</name>*/(long value) { super(value); }
    private /*<name>*/NFCPollingOption/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/NFCPollingOption/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/NFCPollingOption/*</name>*/(value, mask);
    }
    protected /*<name>*/NFCPollingOption/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/NFCPollingOption/*</name>*/[] values() {
        return values.clone();
    }
}
