package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.ag4;
import defpackage.aw4;
import defpackage.bg4;
import defpackage.bl4;
import defpackage.cg4;
import defpackage.df4;
import defpackage.dw1;
import defpackage.eg4;
import defpackage.ff4;
import defpackage.gf4;
import defpackage.hh2;
import defpackage.if4;
import defpackage.jw7;
import defpackage.jy3;
import defpackage.l01;
import defpackage.lf4;
import defpackage.lh2;
import defpackage.rb4;
import defpackage.sf4;
import defpackage.sg8;
import defpackage.u03;
import defpackage.up6;
import defpackage.vt6;
import defpackage.wf4;
import defpackage.wv8;
import defpackage.x46;
import defpackage.xh3;
import defpackage.za1;
import defpackage.zf4;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final df4 q = new df4();
    public final ff4 d;
    public final ff4 e;
    public zf4 f;
    public int g;
    public final b h;
    public String i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final HashSet n;
    public final HashSet o;
    public cg4 p;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class UserActionTaken {
        public static final UserActionTaken a;
        public static final UserActionTaken b;
        public static final UserActionTaken c;
        public static final UserActionTaken d;
        public static final UserActionTaken e;
        public static final UserActionTaken f;
        public static final /* synthetic */ UserActionTaken[] g;

        static {
            UserActionTaken userActionTaken = new UserActionTaken("SET_ANIMATION", 0);
            a = userActionTaken;
            UserActionTaken userActionTaken2 = new UserActionTaken("SET_PROGRESS", 1);
            b = userActionTaken2;
            UserActionTaken userActionTaken3 = new UserActionTaken("SET_REPEAT_MODE", 2);
            c = userActionTaken3;
            UserActionTaken userActionTaken4 = new UserActionTaken("SET_REPEAT_COUNT", 3);
            d = userActionTaken4;
            UserActionTaken userActionTaken5 = new UserActionTaken("SET_IMAGE_ASSETS", 4);
            e = userActionTaken5;
            UserActionTaken userActionTaken6 = new UserActionTaken("PLAY_OPTION", 5);
            f = userActionTaken6;
            g = new UserActionTaken[]{userActionTaken, userActionTaken2, userActionTaken3, userActionTaken4, userActionTaken5, userActionTaken6};
        }

        public static UserActionTaken valueOf(String str) {
            return (UserActionTaken) Enum.valueOf(UserActionTaken.class, str);
        }

        public static UserActionTaken[] values() {
            return (UserActionTaken[]) g.clone();
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        this.d = new ff4(this, 1);
        this.e = new ff4(this, 0);
        this.g = 0;
        this.h = new b();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        d(null, up6.lottieAnimationViewStyle);
    }

    private void setCompositionTask(cg4 cg4Var) {
        bg4 bg4Var = cg4Var.d;
        b bVar = this.h;
        if (bg4Var != null && bVar == getDrawable() && bVar.a == bg4Var.a) {
            return;
        }
        this.n.add(UserActionTaken.a);
        this.h.d();
        c();
        cg4Var.b(this.d);
        cg4Var.a(this.e);
        this.p = cg4Var;
    }

    public final void c() {
        cg4 cg4Var = this.p;
        if (cg4Var != null) {
            ff4 ff4Var = this.d;
            synchronized (cg4Var) {
                cg4Var.a.remove(ff4Var);
            }
            this.p.e(this.e);
        }
    }

    public final void d(AttributeSet attributeSet, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vt6.LottieAnimationView, i, 0);
        this.m = typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_url);
        if (zHasValue && zHasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (zHasValue) {
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(vt6.LottieAnimationView_lottie_rawRes, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (zHasValue2) {
            String string2 = typedArrayObtainStyledAttributes.getString(vt6.LottieAnimationView_lottie_fileName);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (zHasValue3 && (string = typedArrayObtainStyledAttributes.getString(vt6.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(vt6.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_autoPlay, false)) {
            this.l = true;
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_loop, false);
        b bVar = this.h;
        if (z) {
            bVar.b.setRepeatCount(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(vt6.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(vt6.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(vt6.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_clipTextToBoundingBox)) {
            setClipTextToBoundingBox(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_clipTextToBoundingBox, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(typedArrayObtainStyledAttributes.getString(vt6.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(typedArrayObtainStyledAttributes.getString(vt6.LottieAnimationView_lottie_imageAssetsFolder));
        boolean zHasValue4 = typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_progress);
        float f = typedArrayObtainStyledAttributes.getFloat(vt6.LottieAnimationView_lottie_progress, 0.0f);
        if (zHasValue4) {
            this.n.add(UserActionTaken.b);
        }
        bVar.y(f);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false);
        HashSet hashSet = (HashSet) bVar.m.b;
        LottieFeatureFlag lottieFeatureFlag = LottieFeatureFlag.a;
        boolean zAdd = z2 ? hashSet.add(lottieFeatureFlag) : hashSet.remove(lottieFeatureFlag);
        if (bVar.a != null && zAdd) {
            bVar.c();
        }
        setApplyingOpacityToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_applyOpacityToLayers, false));
        setApplyingShadowToLayersEnabled(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_applyShadowToLayers, true));
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_colorFilter)) {
            bVar.a(new jy3("**"), ag4.I, new hh2(new jw7(ContextCompat.getColorStateList(getContext(), typedArrayObtainStyledAttributes.getResourceId(vt6.LottieAnimationView_lottie_colorFilter, -1)).getDefaultColor(), PorterDuff.Mode.SRC_ATOP)));
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_renderMode)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(vt6.LottieAnimationView_lottie_renderMode, 0);
            if (i2 >= RenderMode.values().length) {
                i2 = 0;
            }
            setRenderMode(RenderMode.values()[i2]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_asyncUpdates)) {
            int i3 = typedArrayObtainStyledAttributes.getInt(vt6.LottieAnimationView_lottie_asyncUpdates, 0);
            if (i3 >= RenderMode.values().length) {
                i3 = 0;
            }
            setAsyncUpdates(AsyncUpdates.values()[i3]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(vt6.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(vt6.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f() {
        this.n.add(UserActionTaken.f);
        this.h.m();
    }

    public final void g() {
        this.n.add(UserActionTaken.f);
        this.h.o();
    }

    public AsyncUpdates getAsyncUpdates() {
        AsyncUpdates asyncUpdates = this.h.M;
        return asyncUpdates != null ? asyncUpdates : AsyncUpdates.a;
    }

    public boolean getAsyncUpdatesEnabled() {
        AsyncUpdates asyncUpdates = this.h.M;
        if (asyncUpdates == null) {
            asyncUpdates = AsyncUpdates.a;
        }
        return asyncUpdates == AsyncUpdates.b;
    }

    public boolean getClipTextToBoundingBox() {
        return this.h.v;
    }

    public boolean getClipToCompositionBounds() {
        return this.h.o;
    }

    public gf4 getComposition() {
        Drawable drawable = getDrawable();
        b bVar = this.h;
        if (drawable == bVar) {
            return bVar.a;
        }
        return null;
    }

    public long getDuration() {
        gf4 composition = getComposition();
        if (composition != null) {
            return (long) composition.b();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.h.b.h;
    }

    public String getImageAssetsFolder() {
        return this.h.i;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.h.n;
    }

    public float getMaxFrame() {
        return this.h.b.e();
    }

    public float getMinFrame() {
        return this.h.b.f();
    }

    public x46 getPerformanceTracker() {
        gf4 gf4Var = this.h.a;
        if (gf4Var != null) {
            return gf4Var.a;
        }
        return null;
    }

    public float getProgress() {
        return this.h.b.d();
    }

    public RenderMode getRenderMode() {
        return this.h.x ? RenderMode.c : RenderMode.b;
    }

    public int getRepeatCount() {
        return this.h.b.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.h.b.getRepeatMode();
    }

    public float getSpeed() {
        return this.h.b.d;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof b) {
            boolean z = ((b) drawable).x;
            RenderMode renderMode = RenderMode.c;
            if ((z ? renderMode : RenderMode.b) == renderMode) {
                this.h.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        b bVar = this.h;
        if (drawable2 == bVar) {
            super.invalidateDrawable(bVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.l) {
            return;
        }
        this.h.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.a;
        HashSet hashSet = this.n;
        UserActionTaken userActionTaken = UserActionTaken.a;
        if (!hashSet.contains(userActionTaken) && !TextUtils.isEmpty(this.i)) {
            setAnimation(this.i);
        }
        this.j = savedState.b;
        if (!hashSet.contains(userActionTaken) && (i = this.j) != 0) {
            setAnimation(i);
        }
        if (!hashSet.contains(UserActionTaken.b)) {
            this.h.y(savedState.c);
        }
        if (!hashSet.contains(UserActionTaken.f) && savedState.d) {
            f();
        }
        if (!hashSet.contains(UserActionTaken.e)) {
            setImageAssetsFolder(savedState.e);
        }
        if (!hashSet.contains(UserActionTaken.c)) {
            setRepeatMode(savedState.f);
        }
        if (hashSet.contains(UserActionTaken.d)) {
            return;
        }
        setRepeatCount(savedState.g);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        savedState.b = this.j;
        b bVar = this.h;
        eg4 eg4Var = bVar.b;
        eg4 eg4Var2 = bVar.b;
        savedState.c = eg4Var.d();
        if (bVar.isVisible()) {
            z = eg4Var2.m;
        } else {
            LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = bVar.f;
            z = lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.b || lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.c;
        }
        savedState.d = z;
        savedState.e = bVar.i;
        savedState.f = eg4Var2.getRepeatMode();
        savedState.g = eg4Var2.getRepeatCount();
        return savedState;
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(lf4.a(str, new za1(inputStream, str, 4), new u03(2, inputStream)));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        cg4 cg4VarA;
        int i = 0;
        Object obj = null;
        if (this.m) {
            Context context = getContext();
            HashMap map = lf4.a;
            String strN = dw1.n("url_", str);
            cg4VarA = lf4.a(strN, new if4(context, str, strN, i), null);
        } else {
            cg4VarA = lf4.a(null, new if4(getContext(), str, obj, i), null);
        }
        setCompositionTask(cg4VarA);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.h.t = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this.h.u = z;
    }

    public void setAsyncUpdates(AsyncUpdates asyncUpdates) {
        this.h.M = asyncUpdates;
    }

    public void setCacheComposition(boolean z) {
        this.m = z;
    }

    public void setClipTextToBoundingBox(boolean z) {
        b bVar = this.h;
        if (z != bVar.v) {
            bVar.v = z;
            bVar.invalidateSelf();
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        b bVar = this.h;
        if (z != bVar.o) {
            bVar.o = z;
            l01 l01Var = bVar.p;
            if (l01Var != null) {
                l01Var.L = z;
            }
            bVar.invalidateSelf();
        }
    }

    public void setComposition(gf4 gf4Var) {
        b bVar = this.h;
        bVar.setCallback(this);
        boolean z = true;
        this.k = true;
        ArrayList arrayList = bVar.g;
        eg4 eg4Var = bVar.b;
        if (bVar.a == gf4Var) {
            z = false;
        } else {
            bVar.L = true;
            bVar.d();
            bVar.a = gf4Var;
            bVar.c();
            boolean z2 = eg4Var.l == null;
            eg4Var.l = gf4Var;
            if (z2) {
                eg4Var.j(Math.max(eg4Var.j, gf4Var.l), Math.min(eg4Var.k, gf4Var.m));
            } else {
                eg4Var.j((int) gf4Var.l, (int) gf4Var.m);
            }
            float f = eg4Var.h;
            eg4Var.h = 0.0f;
            eg4Var.g = 0.0f;
            eg4Var.i((int) f);
            eg4Var.c();
            bVar.y(eg4Var.getAnimatedFraction());
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                wf4 wf4Var = (wf4) it.next();
                if (wf4Var != null) {
                    wf4Var.run();
                }
                it.remove();
            }
            arrayList.clear();
            gf4Var.a.a = bVar.r;
            bVar.e();
            Drawable.Callback callback = bVar.getCallback();
            if (callback instanceof ImageView) {
                ImageView imageView = (ImageView) callback;
                imageView.setImageDrawable(null);
                imageView.setImageDrawable(bVar);
            }
        }
        if (this.l) {
            bVar.m();
        }
        this.k = false;
        if (getDrawable() != bVar || z) {
            if (!z) {
                boolean zJ = bVar.j();
                setImageDrawable(null);
                setImageDrawable(bVar);
                if (zJ) {
                    bVar.o();
                }
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it2 = this.o.iterator();
            if (it2.hasNext()) {
                throw bl4.o(it2);
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        b bVar = this.h;
        bVar.l = str;
        rb4 rb4VarI = bVar.i();
        if (rb4VarI != null) {
            rb4VarI.f = str;
        }
    }

    public void setFailureListener(zf4 zf4Var) {
        this.f = zf4Var;
    }

    public void setFallbackResource(int i) {
        this.g = i;
    }

    public void setFontAssetDelegate(lh2 lh2Var) {
        rb4 rb4Var = this.h.j;
    }

    public void setFontMap(Map<String, Typeface> map) {
        b bVar = this.h;
        if (map == bVar.k) {
            return;
        }
        bVar.k = map;
        bVar.invalidateSelf();
    }

    public void setFrame(int i) {
        this.h.p(i);
    }

    @Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.h.d = z;
    }

    public void setImageAssetDelegate(xh3 xh3Var) {
        wv8 wv8Var = this.h.h;
    }

    public void setImageAssetsFolder(String str) {
        this.h.i = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        this.j = 0;
        this.i = null;
        c();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.h.n = z;
    }

    public void setMaxFrame(int i) {
        this.h.q(i);
    }

    public void setMaxProgress(float f) {
        b bVar = this.h;
        gf4 gf4Var = bVar.a;
        if (gf4Var == null) {
            bVar.g.add(new sf4(bVar, f, 0));
            return;
        }
        eg4 eg4Var = bVar.b;
        eg4Var.j(eg4Var.j, aw4.f(gf4Var.l, gf4Var.m, f));
    }

    public void setMinAndMaxFrame(String str) {
        this.h.t(str);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.h.v(f, f2);
    }

    public void setMinFrame(int i) {
        this.h.w(i);
    }

    public void setMinProgress(float f) {
        b bVar = this.h;
        gf4 gf4Var = bVar.a;
        if (gf4Var == null) {
            bVar.g.add(new sf4(bVar, f, 1));
        } else {
            bVar.w((int) aw4.f(gf4Var.l, gf4Var.m, f));
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        b bVar = this.h;
        if (bVar.s == z) {
            return;
        }
        bVar.s = z;
        l01 l01Var = bVar.p;
        if (l01Var != null) {
            l01Var.q(z);
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        b bVar = this.h;
        bVar.r = z;
        gf4 gf4Var = bVar.a;
        if (gf4Var != null) {
            gf4Var.a.a = z;
        }
    }

    public void setProgress(float f) {
        this.n.add(UserActionTaken.b);
        this.h.y(f);
    }

    public void setRenderMode(RenderMode renderMode) {
        b bVar = this.h;
        bVar.w = renderMode;
        bVar.e();
    }

    public void setRepeatCount(int i) {
        this.n.add(UserActionTaken.d);
        this.h.b.setRepeatCount(i);
    }

    public void setRepeatMode(int i) {
        this.n.add(UserActionTaken.c);
        this.h.b.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.h.e = z;
    }

    public void setSpeed(float f) {
        this.h.b.d = f;
    }

    public void setTextDelegate(sg8 sg8Var) {
        this.h.getClass();
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.h.b.n = z;
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        b bVar;
        if (!this.k && drawable == (bVar = this.h) && bVar.j()) {
            this.l = false;
            bVar.l();
        } else if (!this.k && (drawable instanceof b)) {
            b bVar2 = (b) drawable;
            if (bVar2.j()) {
                bVar2.l();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.h.r(str);
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.h.u(str, str2, z);
    }

    public void setMinFrame(String str) {
        this.h.x(str);
    }

    public void setAnimation(final int i) {
        cg4 cg4VarA;
        this.j = i;
        final String str = null;
        this.i = null;
        if (isInEditMode()) {
            cg4VarA = new cg4(new Callable() { // from class: ef4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    LottieAnimationView lottieAnimationView = this.a;
                    boolean z = lottieAnimationView.m;
                    int i2 = i;
                    if (!z) {
                        return lf4.f(i2, lottieAnimationView.getContext(), null);
                    }
                    Context context = lottieAnimationView.getContext();
                    return lf4.f(i2, context, lf4.k(context, i2));
                }
            }, true);
        } else if (this.m) {
            Context context = getContext();
            final String strK = lf4.k(context, i);
            final WeakReference weakReference = new WeakReference(context);
            final Context applicationContext = context.getApplicationContext();
            cg4VarA = lf4.a(strK, new Callable() { // from class: kf4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = (Context) weakReference.get();
                    if (context2 == null) {
                        context2 = applicationContext;
                    }
                    return lf4.f(i, context2, strK);
                }
            }, null);
        } else {
            Context context2 = getContext();
            HashMap map = lf4.a;
            final WeakReference weakReference2 = new WeakReference(context2);
            final Context applicationContext2 = context2.getApplicationContext();
            cg4VarA = lf4.a(null, new Callable() { // from class: kf4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context22 = (Context) weakReference2.get();
                    if (context22 == null) {
                        context22 = applicationContext2;
                    }
                    return lf4.f(i, context22, str);
                }
            }, null);
        }
        setCompositionTask(cg4VarA);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.h.s(i, i2);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new ff4(this, 1);
        this.e = new ff4(this, 0);
        this.g = 0;
        this.h = new b();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        d(attributeSet, up6.lottieAnimationViewStyle);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(lf4.a(str2, new if4(getContext(), str, str2, 0), null));
    }

    public void setAnimation(String str) {
        cg4 cg4VarA;
        this.i = str;
        this.j = 0;
        int i = 1;
        if (isInEditMode()) {
            cg4VarA = new cg4(new za1(this, str, 3), true);
        } else {
            Object obj = null;
            if (this.m) {
                Context context = getContext();
                HashMap map = lf4.a;
                String strN = dw1.n("asset_", str);
                cg4VarA = lf4.a(strN, new if4(context.getApplicationContext(), str, strN, i), null);
            } else {
                Context context2 = getContext();
                HashMap map2 = lf4.a;
                cg4VarA = lf4.a(null, new if4(context2.getApplicationContext(), str, obj, i), null);
            }
        }
        setCompositionTask(cg4VarA);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new ff4(this, 1);
        this.e = new ff4(this, 0);
        this.g = 0;
        this.h = new b();
        this.k = false;
        this.l = false;
        this.m = true;
        this.n = new HashSet();
        this.o = new HashSet();
        d(attributeSet, i);
    }

    public void setAnimation(ZipInputStream zipInputStream, String str) {
        setCompositionTask(lf4.a(str, new za1(zipInputStream, str, 5), new u03(3, zipInputStream)));
    }
}
