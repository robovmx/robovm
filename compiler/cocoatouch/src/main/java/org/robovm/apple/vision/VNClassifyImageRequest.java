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
package org.robovm.apple.vision;

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
import org.robovm.apple.coreml.*;
import org.robovm.apple.coregraphics.*;
import org.robovm.apple.coremedia.*;
import org.robovm.apple.corevideo.*;
import org.robovm.apple.metal.*;
import org.robovm.apple.coreimage.*;
import org.robovm.apple.imageio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 13.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("Vision") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/VNClassifyImageRequest/*</name>*/ 
    extends /*<extends>*/VNImageBasedRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class VNClassifyImageRequestPtr extends Ptr<VNClassifyImageRequest, VNClassifyImageRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(VNClassifyImageRequest.class); }/*</bind>*/
    /*<constants>*/
    public static final int Revision1 = 1;
    public static final int Revision2 = 2;
    /*</constants>*/
    /*<constructors>*/
    public VNClassifyImageRequest() {}
    protected VNClassifyImageRequest(Handle h, long handle) { super(h, handle); }
    protected VNClassifyImageRequest(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithCompletionHandler:")
    public VNClassifyImageRequest(@Block VoidBlock2<VNRequest, NSError> completionHandler) { super(completionHandler); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "results")
    public native NSArray<VNClassificationObservation> getResults();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "supportedRevisions")
    public static native NSIndexSet getSupportedRevisions();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "defaultRevision")
    public static native @MachineSizedUInt long getDefaultRevision();
    /**
     * @since Available in iOS 12.0 and later.
     */
    @Property(selector = "currentRevision")
    public static native @MachineSizedUInt long getCurrentRevision();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /**
     * @since Available in iOS 15.0 and later.
     */
    @Method(selector = "supportedIdentifiersAndReturnError:")
    public native NSArray<NSString> supportedIdentifiersAndReturnError(NSError.NSErrorPtr error);
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -supportedIdentifiersAndReturnError:
     */
    @Deprecated
    public static NSArray<VNClassificationObservation> getKnownClassificationsForRevision(@MachineSizedUInt long requestRevision) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       NSArray<VNClassificationObservation> result = getKnownClassificationsForRevision(requestRevision, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    /**
     * @since Available in iOS 13.0 and later.
     * @deprecated Deprecated in iOS 15.0. Use -supportedIdentifiersAndReturnError:
     */
    @Deprecated
    @Method(selector = "knownClassificationsForRevision:error:")
    private static native NSArray<VNClassificationObservation> getKnownClassificationsForRevision(@MachineSizedUInt long requestRevision, NSError.NSErrorPtr error);
    /*</methods>*/
}
