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
package org.robovm.apple.uikit;

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
import org.robovm.apple.coreanimation.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coredata.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.coretext.*;
import org.robovm.apple.corelocation.*;
import org.robovm.apple.cloudkit.*;
import org.robovm.apple.fileprovider.*;
import org.robovm.apple.intents.*;
import org.robovm.apple.usernotifications.*;
import org.robovm.apple.linkpresentation.*;
import org.robovm.apple.symbols.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.4 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Marshaler(Bits.AsMachineSizedIntMarshaler.class)/*</annotations>*/
public final class /*<name>*/UIAxis/*</name>*/ extends Bits</*<name>*/UIAxis/*</name>*/> {
    /*<values>*/
    public static final UIAxis None = new UIAxis(0L);
    public static final UIAxis Neither = new UIAxis(0L);
    public static final UIAxis Horizontal = new UIAxis(1L);
    public static final UIAxis Vertical = new UIAxis(2L);
    public static final UIAxis Both = new UIAxis(3L);
    /*</values>*/

    /*<bind>*/
    /*</bind>*/
    /*<constants>*//*</constants>*/
    /*<methods>*//*</methods>*/

    private static final /*<name>*/UIAxis/*</name>*/[] values = _values(/*<name>*/UIAxis/*</name>*/.class);

    public /*<name>*/UIAxis/*</name>*/(long value) { super(value); }
    private /*<name>*/UIAxis/*</name>*/(long value, long mask) { super(value, mask); }
    protected /*<name>*/UIAxis/*</name>*/ wrap(long value, long mask) {
        return new /*<name>*/UIAxis/*</name>*/(value, mask);
    }
    protected /*<name>*/UIAxis/*</name>*/[] _values() {
        return values;
    }
    public static /*<name>*/UIAxis/*</name>*/[] values() {
        return values.clone();
    }
}
