package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.o37;
import defpackage.rf0;
import defpackage.sk6;
import defpackage.sv0;
import defpackage.te;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int G0 = mt6.Widget_Material3_CompoundButton_MaterialSwitch;
    public static final int[] H0 = {vp6.state_with_icon};
    public PorterDuff.Mode A0;
    public ColorStateList B0;
    public ColorStateList C0;
    public PorterDuff.Mode D0;
    public int[] E0;
    public int[] F0;
    public Drawable T;
    public Drawable U;
    public int V;
    public Drawable W;
    public Drawable x0;
    public ColorStateList y0;
    public ColorStateList z0;

    public MaterialSwitch(Context context) {
        this(context, null);
    }

    public static void h(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(sv0.b(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    public final void f() {
        this.T = te.d(this.T, this.y0, getThumbTintMode());
        this.U = te.d(this.U, this.z0, this.A0);
        i();
        Drawable drawable = this.T;
        Drawable drawable2 = this.U;
        int i = this.V;
        super.setThumbDrawable(te.c(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void g() {
        this.W = te.d(this.W, this.B0, getTrackTintMode());
        this.x0 = te.d(this.x0, this.C0, this.D0);
        i();
        Drawable layerDrawable = this.W;
        if (layerDrawable != null && this.x0 != null) {
            layerDrawable = new LayerDrawable(new Drawable[]{this.W, this.x0});
        } else if (layerDrawable == null) {
            layerDrawable = this.x0;
        }
        if (layerDrawable != null) {
            setSwitchMinWidth(layerDrawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(layerDrawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getThumbDrawable() {
        return this.T;
    }

    public Drawable getThumbIconDrawable() {
        return this.U;
    }

    public int getThumbIconSize() {
        return this.V;
    }

    public ColorStateList getThumbIconTintList() {
        return this.z0;
    }

    public PorterDuff.Mode getThumbIconTintMode() {
        return this.A0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getThumbTintList() {
        return this.y0;
    }

    public Drawable getTrackDecorationDrawable() {
        return this.x0;
    }

    public ColorStateList getTrackDecorationTintList() {
        return this.C0;
    }

    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.D0;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public Drawable getTrackDrawable() {
        return this.W;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public ColorStateList getTrackTintList() {
        return this.B0;
    }

    public final void i() {
        if (this.y0 == null && this.z0 == null && this.B0 == null && this.C0 == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.y0;
        if (colorStateList != null) {
            h(this.T, colorStateList, this.E0, this.F0, thumbPosition);
        }
        ColorStateList colorStateList2 = this.z0;
        if (colorStateList2 != null) {
            h(this.U, colorStateList2, this.E0, this.F0, thumbPosition);
        }
        ColorStateList colorStateList3 = this.B0;
        if (colorStateList3 != null) {
            h(this.W, colorStateList3, this.E0, this.F0, thumbPosition);
        }
        ColorStateList colorStateList4 = this.C0;
        if (colorStateList4 != null) {
            h(this.x0, colorStateList4, this.E0, this.F0, thumbPosition);
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        i();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.U != null) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, H0);
        }
        int[] iArr = new int[iArrOnCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : iArrOnCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.E0 = iArr;
        this.F0 = te.r(iArrOnCreateDrawableState);
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.T = drawable;
        f();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.U = drawable;
        f();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(rf0.v(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.V != i) {
            this.V = i;
            f();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.z0 = colorStateList;
        f();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.A0 = mode;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.y0 = colorStateList;
        f();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        f();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.x0 = drawable;
        g();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(rf0.v(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        g();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.D0 = mode;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.W = drawable;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        g();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        g();
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        int i2 = G0;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.V = -1;
        Context context2 = getContext();
        this.T = super.getThumbDrawable();
        this.y0 = super.getThumbTintList();
        super.setThumbTintList(null);
        this.W = super.getTrackDrawable();
        this.B0 = super.getTrackTintList();
        super.setTrackTintList(null);
        sk6 sk6VarE = vj8.e(context2, attributeSet, yt6.MaterialSwitch, i, i2, new int[0]);
        this.U = sk6VarE.v(yt6.MaterialSwitch_thumbIcon);
        int i3 = yt6.MaterialSwitch_thumbIconSize;
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        this.V = typedArray.getDimensionPixelSize(i3, -1);
        this.z0 = sk6VarE.t(yt6.MaterialSwitch_thumbIconTint);
        int i4 = typedArray.getInt(yt6.MaterialSwitch_thumbIconTintMode, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.A0 = o37.t(i4, mode);
        this.x0 = sk6VarE.v(yt6.MaterialSwitch_trackDecoration);
        this.C0 = sk6VarE.t(yt6.MaterialSwitch_trackDecorationTint);
        this.D0 = o37.t(typedArray.getInt(yt6.MaterialSwitch_trackDecorationTintMode, -1), mode);
        sk6VarE.G();
        setEnforceSwitchWidth(false);
        f();
        g();
    }
}
