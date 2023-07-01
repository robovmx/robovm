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
package org.robovm.apple.shazamkit;

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
import org.robovm.apple.avfoundation.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("ShazamKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SHSignatureGenerator/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SHSignatureGeneratorPtr extends Ptr<SHSignatureGenerator, SHSignatureGeneratorPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SHSignatureGenerator.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SHSignatureGenerator() {}
    protected SHSignatureGenerator(Handle h, long handle) { super(h, handle); }
    protected SHSignatureGenerator(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    public boolean appendBuffer(AVAudioPCMBuffer buffer, AVAudioTime time) throws NSErrorException {
       NSError.NSErrorPtr ptr = new NSError.NSErrorPtr();
       boolean result = appendBuffer(buffer, time, ptr);
       if (ptr.get() != null) { throw new NSErrorException(ptr.get()); }
       return result;
    }
    @Method(selector = "appendBuffer:atTime:error:")
    private native boolean appendBuffer(AVAudioPCMBuffer buffer, AVAudioTime time, NSError.NSErrorPtr error);
    @Method(selector = "signature")
    public native SHSignature signature();
    /**
     * @since Available in iOS 16.0 and later.
     */
    @Method(selector = "generateSignatureFromAsset:completionHandler:")
    public static native void generateSignature(AVAsset asset, @Block VoidBlock2<SHSignature, NSError> completionHandler);
    /*</methods>*/
}
