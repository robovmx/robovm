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
package org.robovm.apple.phase;

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
import org.robovm.apple.coreaudio.*;
import org.robovm.apple.avfoundation.*;
import org.robovm.apple.modelio.*;
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 15.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("PHASE") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/PHASESpatialMixerDefinition/*</name>*/ 
    extends /*<extends>*/PHASEMixerDefinition/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class PHASESpatialMixerDefinitionPtr extends Ptr<PHASESpatialMixerDefinition, PHASESpatialMixerDefinitionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(PHASESpatialMixerDefinition.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected PHASESpatialMixerDefinition() {}
    protected PHASESpatialMixerDefinition(Handle h, long handle) { super(h, handle); }
    protected PHASESpatialMixerDefinition(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSpatialPipeline:")
    public PHASESpatialMixerDefinition(PHASESpatialPipeline spatialPipeline) { super((SkipInit) null); initObject(init(spatialPipeline)); }
    @Method(selector = "initWithSpatialPipeline:identifier:")
    public PHASESpatialMixerDefinition(PHASESpatialPipeline spatialPipeline, String identifier) { super((SkipInit) null); initObject(init(spatialPipeline, identifier)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "spatialPipeline")
    public native PHASESpatialPipeline getSpatialPipeline();
    @Property(selector = "distanceModelParameters")
    public native PHASEDistanceModelParameters getDistanceModelParameters();
    @Property(selector = "setDistanceModelParameters:")
    public native void setDistanceModelParameters(PHASEDistanceModelParameters v);
    @Property(selector = "listenerDirectivityModelParameters")
    public native PHASEDirectivityModelParameters getListenerDirectivityModelParameters();
    @Property(selector = "setListenerDirectivityModelParameters:")
    public native void setListenerDirectivityModelParameters(PHASEDirectivityModelParameters v);
    @Property(selector = "sourceDirectivityModelParameters")
    public native PHASEDirectivityModelParameters getSourceDirectivityModelParameters();
    @Property(selector = "setSourceDirectivityModelParameters:")
    public native void setSourceDirectivityModelParameters(PHASEDirectivityModelParameters v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSpatialPipeline:")
    protected native @Pointer long init(PHASESpatialPipeline spatialPipeline);
    @Method(selector = "initWithSpatialPipeline:identifier:")
    protected native @Pointer long init(PHASESpatialPipeline spatialPipeline, String identifier);
    /*</methods>*/
}
