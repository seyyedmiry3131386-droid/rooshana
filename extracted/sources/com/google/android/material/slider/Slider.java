package com.google.android.material.slider;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.content.ContextCompat;
import defpackage.fk4;
import defpackage.rf0;
import defpackage.vp6;
import defpackage.xz3;

/* JADX INFO: loaded from: classes.dex */
public class Slider extends BaseSlider<Slider, Object, Object> {
    public Slider(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    public int getActiveThumbIndex() {
        return this.J0;
    }

    public int getFocusedThumbIndex() {
        return this.K0;
    }

    public int getHaloRadius() {
        return this.H;
    }

    public ColorStateList getHaloTintList() {
        return this.T0;
    }

    public int getLabelBehavior() {
        return this.C;
    }

    public float getStepSize() {
        return this.L0;
    }

    public float getThumbElevation() {
        return this.h1.b.n;
    }

    public int getThumbHeight() {
        return this.G;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public int getThumbRadius() {
        return this.F / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.h1.b.e;
    }

    public float getThumbStrokeWidth() {
        return this.h1.b.k;
    }

    public ColorStateList getThumbTintList() {
        return this.h1.b.d;
    }

    public int getThumbTrackGapSize() {
        return this.I;
    }

    public int getThumbWidth() {
        return this.F;
    }

    public int getTickActiveRadius() {
        return this.O0;
    }

    public ColorStateList getTickActiveTintList() {
        return this.U0;
    }

    public int getTickInactiveRadius() {
        return this.P0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.V0;
    }

    public ColorStateList getTickTintList() {
        if (this.V0.equals(this.U0)) {
            return this.U0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public int getTickVisibilityMode() {
        return this.N0;
    }

    public ColorStateList getTrackActiveTintList() {
        return this.W0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ int getTrackCornerSize() {
        return super.getTrackCornerSize();
    }

    public int getTrackHeight() {
        return this.D;
    }

    public ColorStateList getTrackIconActiveColor() {
        return this.T;
    }

    public Drawable getTrackIconActiveEnd() {
        return this.R;
    }

    public Drawable getTrackIconActiveStart() {
        return this.P;
    }

    public ColorStateList getTrackIconInactiveColor() {
        return this.y0;
    }

    public Drawable getTrackIconInactiveEnd() {
        return this.W;
    }

    public Drawable getTrackIconInactiveStart() {
        return this.U;
    }

    public int getTrackIconSize() {
        return this.z0;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.X0;
    }

    public int getTrackInsideCornerSize() {
        return this.N;
    }

    public int getTrackSidePadding() {
        return this.E;
    }

    public int getTrackStopIndicatorSize() {
        return this.L;
    }

    public ColorStateList getTrackTintList() {
        if (this.X0.equals(this.W0)) {
            return this.W0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.Q0;
    }

    public float getValue() {
        return getValues().get(0).floatValue();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueFrom() {
        return this.G0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public float getValueTo() {
        return this.H0;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean o() {
        return this.O;
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setCentered(boolean z) {
        super.setCentered(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public void setCustomThumbDrawable(Drawable drawable) {
        super.setCustomThumbDrawable(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider, android.view.View
    public /* bridge */ /* synthetic */ void setEnabled(boolean z) {
        super.setEnabled(z);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setFocusedThumbIndex(int i) {
        super.setFocusedThumbIndex(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloRadius(int i) {
        super.setHaloRadius(i);
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setHaloTintList(ColorStateList colorStateList) {
        super.setHaloTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setLabelBehavior(int i) {
        super.setLabelBehavior(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setOrientation(int i) {
        super.setOrientation(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setStepSize(float f) {
        super.setStepSize(f);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbElevation(float f) {
        super.setThumbElevation(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbHeight(int i) {
        super.setThumbHeight(i);
    }

    public void setThumbHeightResource(int i) {
        setThumbHeight(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbRadius(int i) {
        super.setThumbRadius(i);
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeColor(ColorStateList colorStateList) {
        super.setThumbStrokeColor(colorStateList);
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(ContextCompat.getColorStateList(getContext(), i));
        }
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbStrokeWidth(float f) {
        super.setThumbStrokeWidth(f);
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        fk4 fk4Var = this.h1;
        if (colorStateList.equals(fk4Var.b.d)) {
            return;
        }
        fk4Var.s(colorStateList);
        invalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbTrackGapSize(int i) {
        super.setThumbTrackGapSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setThumbWidth(int i) {
        super.setThumbWidth(i);
    }

    public void setThumbWidthResource(int i) {
        setThumbWidth(getResources().getDimensionPixelSize(i));
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveRadius(int i) {
        super.setTickActiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickActiveTintList(ColorStateList colorStateList) {
        super.setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveRadius(int i) {
        super.setTickInactiveRadius(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickInactiveTintList(ColorStateList colorStateList) {
        super.setTickInactiveTintList(colorStateList);
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTickVisibilityMode(int i) {
        super.setTickVisibilityMode(i);
    }

    @Deprecated
    public void setTickVisible(boolean z) {
        setTickVisibilityMode(z ? 0 : 2);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackActiveTintList(ColorStateList colorStateList) {
        super.setTrackActiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackCornerSize(int i) {
        super.setTrackCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackHeight(int i) {
        super.setTrackHeight(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveColor(ColorStateList colorStateList) {
        super.setTrackIconActiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveEnd(Drawable drawable) {
        super.setTrackIconActiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconActiveStart(Drawable drawable) {
        super.setTrackIconActiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveColor(ColorStateList colorStateList) {
        super.setTrackIconInactiveColor(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveEnd(Drawable drawable) {
        super.setTrackIconInactiveEnd(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconInactiveStart(Drawable drawable) {
        super.setTrackIconInactiveStart(drawable);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackIconSize(int i) {
        super.setTrackIconSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInactiveTintList(ColorStateList colorStateList) {
        super.setTrackInactiveTintList(colorStateList);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackInsideCornerSize(int i) {
        super.setTrackInsideCornerSize(i);
    }

    @Override // com.google.android.material.slider.BaseSlider
    public /* bridge */ /* synthetic */ void setTrackStopIndicatorSize(int i) {
        super.setTrackStopIndicatorSize(i);
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValue(float f) {
        setValues(Float.valueOf(f));
    }

    public void setValueFrom(float f) {
        this.G0 = f;
        this.S0 = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.H0 = f;
        this.S0 = true;
        postInvalidate();
    }

    @Override // com.google.android.material.slider.BaseSlider
    public final boolean y() {
        if (getActiveThumbIndex() != -1) {
            return true;
        }
        setActiveThumbIndex(0);
        return true;
    }

    public Slider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.sliderStyle);
    }

    public void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    public void setTrackIconActiveEnd(int i) {
        setTrackIconActiveEnd(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public void setTrackIconActiveStart(int i) {
        setTrackIconActiveStart(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public void setTrackIconInactiveEnd(int i) {
        setTrackIconInactiveEnd(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public void setTrackIconInactiveStart(int i) {
        setTrackIconInactiveStart(i != 0 ? rf0.v(getContext(), i) : null);
    }

    public Slider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.value});
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            setValue(typedArrayObtainStyledAttributes.getFloat(0, 0.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* bridge */ /* synthetic */ void setLabelFormatter(xz3 xz3Var) {
    }
}
