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
package org.robovm.apple.metalfx;

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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MetalFX") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MTLFXTemporalScalerDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MTLFXTemporalScalerDescriptorPtr extends Ptr<MTLFXTemporalScalerDescriptor, MTLFXTemporalScalerDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MTLFXTemporalScalerDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public MTLFXTemporalScalerDescriptor() {}
    protected MTLFXTemporalScalerDescriptor(Handle h, long handle) { super(h, handle); }
    protected MTLFXTemporalScalerDescriptor(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "colorTextureFormat")
    public native MTLPixelFormat getColorTextureFormat();
    @Property(selector = "setColorTextureFormat:")
    public native void setColorTextureFormat(MTLPixelFormat v);
    @Property(selector = "depthTextureFormat")
    public native MTLPixelFormat getDepthTextureFormat();
    @Property(selector = "setDepthTextureFormat:")
    public native void setDepthTextureFormat(MTLPixelFormat v);
    @Property(selector = "motionTextureFormat")
    public native MTLPixelFormat getMotionTextureFormat();
    @Property(selector = "setMotionTextureFormat:")
    public native void setMotionTextureFormat(MTLPixelFormat v);
    @Property(selector = "outputTextureFormat")
    public native MTLPixelFormat getOutputTextureFormat();
    @Property(selector = "setOutputTextureFormat:")
    public native void setOutputTextureFormat(MTLPixelFormat v);
    @Property(selector = "inputWidth")
    public native @MachineSizedUInt long getInputWidth();
    @Property(selector = "setInputWidth:")
    public native void setInputWidth(@MachineSizedUInt long v);
    @Property(selector = "inputHeight")
    public native @MachineSizedUInt long getInputHeight();
    @Property(selector = "setInputHeight:")
    public native void setInputHeight(@MachineSizedUInt long v);
    @Property(selector = "outputWidth")
    public native @MachineSizedUInt long getOutputWidth();
    @Property(selector = "setOutputWidth:")
    public native void setOutputWidth(@MachineSizedUInt long v);
    @Property(selector = "outputHeight")
    public native @MachineSizedUInt long getOutputHeight();
    @Property(selector = "setOutputHeight:")
    public native void setOutputHeight(@MachineSizedUInt long v);
    @Property(selector = "isAutoExposureEnabled")
    public native boolean isAutoExposureEnabled();
    @Property(selector = "setAutoExposureEnabled:")
    public native void setAutoExposureEnabled(boolean v);
    @Property(selector = "isInputContentPropertiesEnabled")
    public native boolean isInputContentPropertiesEnabled();
    @Property(selector = "setInputContentPropertiesEnabled:")
    public native void setInputContentPropertiesEnabled(boolean v);
    @Property(selector = "inputContentMinScale")
    public native float getInputContentMinScale();
    @Property(selector = "setInputContentMinScale:")
    public native void setInputContentMinScale(float v);
    @Property(selector = "inputContentMaxScale")
    public native float getInputContentMaxScale();
    @Property(selector = "setInputContentMaxScale:")
    public native void setInputContentMaxScale(float v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "newTemporalScalerWithDevice:")
    public native MTLFXTemporalScaler newTemporalScaler(MTLDevice device);
    @Method(selector = "supportsDevice:")
    public static native boolean supportsDevice(MTLDevice device);
    /*</methods>*/
}
