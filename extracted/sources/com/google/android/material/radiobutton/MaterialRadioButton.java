package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import defpackage.ja1;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    public static final int g = mt6.Widget_MaterialComponents_CompoundButton_RadioButton;
    public static final int[][] h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public ColorStateList e;
    public boolean f;

    public MaterialRadioButton(Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.e == null) {
            int iP = m91.p(xp6.colorControlActivated, this);
            int iP2 = m91.p(vp6.colorOnSurface, this);
            int iP3 = m91.p(vp6.colorSurface, this);
            this.e = new ColorStateList(h, new int[]{m91.y(1.0f, iP3, iP), m91.y(0.54f, iP3, iP2), m91.y(0.38f, iP3, iP2), m91.y(0.38f, iP3, iP2)});
        }
        return this.e;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList(null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = g;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayD.hasValue(yt6.MaterialRadioButton_buttonTint)) {
            setButtonTintList(ja1.r(context2, typedArrayD, yt6.MaterialRadioButton_buttonTint));
        }
        this.f = typedArrayD.getBoolean(yt6.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayD.recycle();
    }
}
