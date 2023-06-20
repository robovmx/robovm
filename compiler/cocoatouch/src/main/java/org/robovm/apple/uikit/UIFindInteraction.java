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
/*</imports>*/

/*<javadoc>*/
/**
 * @since Available in iOS 16.0 and later.
 */
/*</javadoc>*/
/*<annotations>*/@Library("UIKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/UIFindInteraction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*/implements UIInteraction/*</implements>*/ {

    /*<ptr>*/public static class UIFindInteractionPtr extends Ptr<UIFindInteraction, UIFindInteractionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(UIFindInteraction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    protected UIFindInteraction() {}
    protected UIFindInteraction(Handle h, long handle) { super(h, handle); }
    protected UIFindInteraction(SkipInit skipInit) { super(skipInit); }
    @Method(selector = "initWithSessionDelegate:")
    public UIFindInteraction(UIFindInteractionDelegate sessionDelegate) { super((SkipInit) null); initObject(init(sessionDelegate)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "isFindNavigatorVisible")
    public native boolean isFindNavigatorVisible();
    @Property(selector = "activeFindSession")
    public native UIFindSession getActiveFindSession();
    @Property(selector = "searchText")
    public native String getSearchText();
    @Property(selector = "setSearchText:")
    public native void setSearchText(String v);
    @Property(selector = "replacementText")
    public native String getReplacementText();
    @Property(selector = "setReplacementText:")
    public native void setReplacementText(String v);
    @Property(selector = "optionsMenuProvider")
    public native @Block Block1<NSArray<UIMenuElement>, UIMenu> getOptionsMenuProvider();
    @Property(selector = "setOptionsMenuProvider:")
    public native void setOptionsMenuProvider(@Block Block1<NSArray<UIMenuElement>, UIMenu> v);
    @Property(selector = "delegate")
    public native UIFindInteractionDelegate getDelegate();
    @Property(selector = "view")
    public native UIView getView();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithSessionDelegate:")
    protected native @Pointer long init(UIFindInteractionDelegate sessionDelegate);
    @Method(selector = "presentFindNavigatorShowingReplace:")
    public native void presentFindNavigatorShowingReplace(boolean showingReplace);
    @Method(selector = "dismissFindNavigator")
    public native void dismissFindNavigator();
    @Method(selector = "findNext")
    public native void findNext();
    @Method(selector = "findPrevious")
    public native void findPrevious();
    @Method(selector = "updateResultCount")
    public native void updateResultCount();
    @Method(selector = "willMoveToView:")
    public native void willMoveToView(UIView view);
    @Method(selector = "didMoveToView:")
    public native void didMoveToView(UIView view);
    /*</methods>*/
}
