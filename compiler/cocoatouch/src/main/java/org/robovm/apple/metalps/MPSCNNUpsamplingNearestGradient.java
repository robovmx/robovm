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
package org.robovm.apple.metalps;

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
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.metal.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 11.3 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalPerformanceShaders") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MPSCNNUpsamplingNearestGradient/*</name>*/ 
    extends /*<extends>*/MPSCNNUpsamplingGradient/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MPSCNNUpsamplingNearestGradientPtr extends Ptr<MPSCNNUpsamplingNearestGradient, MPSCNNUpsamplingNearestGradientPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MPSCNNUpsamplingNearestGradient.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MPSCNNUpsamplingNearestGradient() {}
    protected MPSCNNUpsamplingNearestGradient(Handle h, long handle) { super(h, handle); }
    protected MPSCNNUpsamplingNearestGradient(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithDevice:integerScaleFactorX:integerScaleFactorY:")
    public MPSCNNUpsamplingNearestGradient(MTLDevice device, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY) { super((SkipInit) null); initObject(init(device, integerScaleFactorX, integerScaleFactorY)); }
    @Method(selector = "initWithCoder:device:")
    public MPSCNNUpsamplingNearestGradient(NSCoder decoder, MTLDevice device) { super(decoder, device); }
    @Method(selector = "initWithCoder:")
    public MPSCNNUpsamplingNearestGradient(NSCoder coder) { super(coder); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "supportsSecureCoding")
    public static native boolean supportsSecureCoding();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithDevice:integerScaleFactorX:integerScaleFactorY:")
    protected native @Pointer long init(MTLDevice device, @MachineSizedUInt long integerScaleFactorX, @MachineSizedUInt long integerScaleFactorY);
    /*</methods>*/
}
