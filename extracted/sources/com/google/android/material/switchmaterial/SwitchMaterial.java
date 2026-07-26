package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.oq6;
import defpackage.pz1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int x0 = mt6.Widget_MaterialComponents_CompoundButton_Switch;
    public static final int[][] y0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final pz1 T;
    public ColorStateList U;
    public ColorStateList V;
    public boolean W;

    public SwitchMaterial(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.U == null) {
            int iP = m91.p(vp6.colorSurface, this);
            int iP2 = m91.p(xp6.colorControlActivated, this);
            float dimension = getResources().getDimension(oq6.mtrl_switch_thumb_elevation);
            pz1 pz1Var = this.T;
            if (pz1Var.a) {
                float elevation = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    elevation += ((View) parent).getElevation();
                }
                dimension += elevation;
            }
            int iA = pz1Var.a(iP, dimension);
            this.U = new ColorStateList(y0, new int[]{m91.y(1.0f, iP, iP2), iA, m91.y(0.38f, iP, iP2), iA});
        }
        return this.U;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.V == null) {
            int iP = m91.p(vp6.colorSurface, this);
            int iP2 = m91.p(xp6.colorControlActivated, this);
            int iP3 = m91.p(vp6.colorOnSurface, this);
            this.V = new ColorStateList(y0, new int[]{m91.y(0.54f, iP, iP2), m91.y(0.32f, iP, iP3), m91.y(0.12f, iP, iP2), m91.y(0.12f, iP, iP3)});
        }
        return this.V;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.W && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.W && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.W = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        int i2 = x0;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.T = new pz1(context2);
        int[] iArr = yt6.SwitchMaterial;
        vj8.a(context2, attributeSet, i, i2);
        vj8.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.W = typedArrayObtainStyledAttributes.getBoolean(yt6.SwitchMaterial_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
