package com.microsoft.clarity.models.observers;

import android.graphics.Picture;
import android.view.Window;
import com.microsoft.clarity.models.viewhierarchy.ViewHierarchy;
import defpackage.dp2;
import defpackage.js3;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class FramePicture extends ObservedEvent {
    private final float density;
    private final dp2 forceStartNewSessionCallback;
    private final boolean isForceStartNewSessionFirstFrame;
    private final boolean isKeyFrame;
    private final boolean isNewPageFirstFrame;
    private final int keyboardHeight;
    private final Picture picture;
    private int screenHeight;
    private final ScreenMetadata screenMetadata;
    private int screenWidth;
    private final int systemBackgroundColor;
    private final ViewHierarchy viewHierarchy;
    private final List<WeakReference<Window>> windows;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FramePicture(Picture picture, ViewHierarchy viewHierarchy, boolean z, boolean z2, dp2 dp2Var, boolean z3, long j, ScreenMetadata screenMetadata, int i, int i2, int i3, int i4, float f, List<? extends WeakReference<Window>> list) {
        super(j);
        js3.p(picture, "picture");
        js3.p(viewHierarchy, "viewHierarchy");
        js3.p(screenMetadata, "screenMetadata");
        js3.p(list, "windows");
        this.picture = picture;
        this.viewHierarchy = viewHierarchy;
        this.isKeyFrame = z;
        this.isForceStartNewSessionFirstFrame = z2;
        this.forceStartNewSessionCallback = dp2Var;
        this.isNewPageFirstFrame = z3;
        this.screenMetadata = screenMetadata;
        this.screenWidth = i;
        this.screenHeight = i2;
        this.keyboardHeight = i3;
        this.systemBackgroundColor = i4;
        this.density = f;
        this.windows = list;
    }

    public final float getDensity() {
        return this.density;
    }

    public final dp2 getForceStartNewSessionCallback() {
        return this.forceStartNewSessionCallback;
    }

    public final int getKeyboardHeight() {
        return this.keyboardHeight;
    }

    public final Picture getPicture() {
        return this.picture;
    }

    public final int getScreenHeight() {
        return this.screenHeight;
    }

    public final ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    public final int getScreenWidth() {
        return this.screenWidth;
    }

    public final int getSystemBackgroundColor() {
        return this.systemBackgroundColor;
    }

    public final ViewHierarchy getViewHierarchy() {
        return this.viewHierarchy;
    }

    public final List<WeakReference<Window>> getWindows() {
        return this.windows;
    }

    public final boolean isForceStartNewSessionFirstFrame() {
        return this.isForceStartNewSessionFirstFrame;
    }

    public final boolean isKeyFrame() {
        return this.isKeyFrame;
    }

    public final boolean isNewPageFirstFrame() {
        return this.isNewPageFirstFrame;
    }

    public final void setScreenHeight(int i) {
        this.screenHeight = i;
    }

    public final void setScreenWidth(int i) {
        this.screenWidth = i;
    }
}
