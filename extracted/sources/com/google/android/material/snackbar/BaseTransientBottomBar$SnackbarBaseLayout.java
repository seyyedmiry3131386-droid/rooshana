package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.as7;
import defpackage.fk4;
import defpackage.ja1;
import defpackage.m90;
import defpackage.m91;
import defpackage.mk4;
import defpackage.o37;
import defpackage.o77;
import defpackage.o90;
import defpackage.oq6;
import defpackage.q90;
import defpackage.r90;
import defpackage.vp6;
import defpackage.w82;
import defpackage.yt6;
import defpackage.yz7;

/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$SnackbarBaseLayout extends FrameLayout {
    public static final q90 l = new q90(0);
    public r90 a;
    public final as7 b;
    public int c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public Rect j;
    public boolean k;

    public BaseTransientBottomBar$SnackbarBaseLayout(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(mk4.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, yt6.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.SnackbarLayout_elevation)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.SnackbarLayout_elevation, 0));
        }
        this.c = typedArrayObtainStyledAttributes.getInt(yt6.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(yt6.SnackbarLayout_shapeAppearanceOverlay)) {
            this.b = as7.d(context2, attributeSet, 0, 0).a();
        }
        this.d = typedArrayObtainStyledAttributes.getFloat(yt6.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(o37.t(typedArrayObtainStyledAttributes.getInt(yt6.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.e = typedArrayObtainStyledAttributes.getFloat(yt6.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.SnackbarLayout_android_maxWidth, -1);
        this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(l);
        setFocusable(true);
        if (getBackground() == null) {
            int iY = m91.y(getBackgroundOverlayColorAlpha(), m91.p(vp6.colorSurface, this), m91.p(vp6.colorOnSurface, this));
            as7 as7Var = this.b;
            if (as7Var != null) {
                w82 w82Var = r90.y;
                fk4 fk4Var = new fk4(as7Var);
                fk4Var.s(ColorStateList.valueOf(iY));
                drawable = fk4Var;
            } else {
                Resources resources = getResources();
                w82 w82Var2 = r90.y;
                float dimension = resources.getDimension(oq6.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iY);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.h;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(r90 r90Var) {
        this.a = r90Var;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.d;
    }

    public int getMaxInlineActionWidth() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r90 r90Var = this.a;
        if (r90Var != null) {
            r90Var.c();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        r90 r90Var = this.a;
        if (r90Var != null) {
            o77 o77VarT = o77.t();
            o90 o90Var = r90Var.x;
            synchronized (o77VarT.a) {
                z = true;
                if (!o77VarT.v(o90Var)) {
                    yz7 yz7Var = (yz7) o77VarT.d;
                    if (!(yz7Var != null && yz7Var.a.get() == o90Var)) {
                        z = false;
                    }
                }
            }
            if (z) {
                r90.B.post(new m90(r90Var, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        r90 r90Var = this.a;
        if (r90Var == null || !r90Var.u) {
            return;
        }
        r90Var.f();
        r90Var.u = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.h);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        r90 r90Var = this.a;
        if (r90Var != null) {
            w82 w82Var = r90.y;
            r90Var.g();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : l);
        super.setOnClickListener(onClickListener);
    }
}
