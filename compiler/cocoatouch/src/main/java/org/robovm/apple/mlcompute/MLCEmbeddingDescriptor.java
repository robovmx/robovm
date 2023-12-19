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
package org.robovm.apple.mlcompute;

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
/**
 * @since Available in iOS 14.0 and later.
 * @deprecated Use Metal Performance Shaders Graph or BNNS instead.
 */
/*</javadoc>*/
/*<annotations>*/@Library("MLCompute") @NativeClass @Deprecated/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/MLCEmbeddingDescriptor/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class MLCEmbeddingDescriptorPtr extends Ptr<MLCEmbeddingDescriptor, MLCEmbeddingDescriptorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(MLCEmbeddingDescriptor.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected MLCEmbeddingDescriptor() {}
    protected MLCEmbeddingDescriptor(Handle h, long handle) { super(h, handle); }
    protected MLCEmbeddingDescriptor(SkipInit skipInit) { super(skipInit); }
    public MLCEmbeddingDescriptor(NSNumber embeddingCount, NSNumber embeddingDimension) { super((Handle) null, create(embeddingCount, embeddingDimension)); retain(getHandle()); }
    public MLCEmbeddingDescriptor(NSNumber embeddingCount, NSNumber embeddingDimension, NSNumber paddingIndex, NSNumber maximumNorm, NSNumber pNorm, boolean scalesGradientByFrequency) { super((Handle) null, create(embeddingCount, embeddingDimension, paddingIndex, maximumNorm, pNorm, scalesGradientByFrequency)); retain(getHandle()); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "embeddingCount")
    public native NSNumber getEmbeddingCount();
    @Property(selector = "embeddingDimension")
    public native NSNumber getEmbeddingDimension();
    @Property(selector = "paddingIndex")
    public native NSNumber getPaddingIndex();
    @Property(selector = "maximumNorm")
    public native NSNumber getMaximumNorm();
    @Property(selector = "pNorm")
    public native NSNumber getPNorm();
    @Property(selector = "scalesGradientByFrequency")
    public native boolean isScalesGradientByFrequency();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "descriptorWithEmbeddingCount:embeddingDimension:")
    protected static native @Pointer long create(NSNumber embeddingCount, NSNumber embeddingDimension);
    @Method(selector = "descriptorWithEmbeddingCount:embeddingDimension:paddingIndex:maximumNorm:pNorm:scalesGradientByFrequency:")
    protected static native @Pointer long create(NSNumber embeddingCount, NSNumber embeddingDimension, NSNumber paddingIndex, NSNumber maximumNorm, NSNumber pNorm, boolean scalesGradientByFrequency);
    /*</methods>*/
}
