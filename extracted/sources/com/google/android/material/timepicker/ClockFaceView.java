package com.google.android.material.timepicker;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import defpackage.dq6;
import defpackage.is6;
import defpackage.ja1;
import defpackage.mt6;
import defpackage.oq6;
import defpackage.pt2;
import defpackage.q69;
import defpackage.qr6;
import defpackage.vp6;
import defpackage.yt6;
import defpackage.zt0;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends RadialViewGroup implements zt0 {
    public final float[] A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public String[] F;
    public float G;
    public final ColorStateList H;
    public final ClockHandView t;
    public final Rect u;
    public final RectF v;
    public final Rect w;
    public final SparseArray x;
    public final b y;
    public final int[] z;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialClockStyle);
    }

    @Override // defpackage.zt0
    public final void b(float f, boolean z) {
        if (Math.abs(this.G - f) > 0.001f) {
            this.G = f;
            u();
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) pt2.v(1, this.F.length, 1).b);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iMax = (int) (this.E / Math.max(Math.max(this.C / displayMetrics.heightPixels, this.D / displayMetrics.widthPixels), 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
        setMeasuredDimension(iMax, iMax);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public final void t() {
        super.t();
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.x;
            if (i >= sparseArray.size()) {
                return;
            }
            ((TextView) sparseArray.get(i)).setVisibility(0);
            i++;
        }
    }

    public final void u() {
        SparseArray sparseArray;
        Rect rect;
        RectF rectF;
        RectF rectF2 = this.t.n;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.x;
            int size = sparseArray.size();
            rect = this.u;
            rectF = this.v;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float fHeight = rectF.height() * rectF.width();
                if (fHeight < f) {
                    textView = textView2;
                    f = fHeight;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.w);
                rectF.inset(r8.left, r8.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.z, this.A, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }

    public final void v(String[] strArr, int i) {
        this.F = strArr;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        SparseArray sparseArray = this.x;
        int size = sparseArray.size();
        boolean z = false;
        for (int i2 = 0; i2 < Math.max(this.F.length, size); i2++) {
            TextView textView = (TextView) sparseArray.get(i2);
            if (i2 >= this.F.length) {
                removeView(textView);
                sparseArray.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(is6.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i2, textView);
                    addView(textView);
                }
                textView.setText(this.F[i2]);
                textView.setTag(qr6.material_value_index, Integer.valueOf(i2));
                int i3 = (i2 / 12) + 1;
                textView.setTag(qr6.material_clock_level, Integer.valueOf(i3));
                if (i3 > 1) {
                    z = true;
                }
                q69.q(textView, this.y);
                textView.setTextColor(this.H);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.F[i2]));
                }
            }
        }
        ClockHandView clockHandView = this.t;
        if (clockHandView.i && !z) {
            clockHandView.u = 1;
        }
        clockHandView.i = z;
        clockHandView.invalidate();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = new Rect();
        this.v = new RectF();
        this.w = new Rect();
        this.x = new SparseArray();
        this.A = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.ClockFaceView, i, mt6.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList colorStateListR = ja1.r(context, typedArrayObtainStyledAttributes, yt6.ClockFaceView_clockNumberTextColor);
        this.H = colorStateListR;
        LayoutInflater.from(context).inflate(is6.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(qr6.material_clock_hand);
        this.t = clockHandView;
        this.B = resources.getDimensionPixelSize(oq6.material_clock_hand_padding);
        int colorForState = colorStateListR.getColorForState(new int[]{R.attr.state_selected}, colorStateListR.getDefaultColor());
        this.z = new int[]{colorForState, colorForState, colorStateListR.getDefaultColor()};
        clockHandView.j.add(this);
        int defaultColor = ContextCompat.getColorStateList(context, dq6.material_timepicker_clockface).getDefaultColor();
        ColorStateList colorStateListR2 = ja1.r(context, typedArrayObtainStyledAttributes, yt6.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(colorStateListR2 != null ? colorStateListR2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a(this));
        setFocusable(false);
        typedArrayObtainStyledAttributes.recycle();
        this.y = new b(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        v(strArr, 0);
        this.C = resources.getDimensionPixelSize(oq6.material_time_picker_minimum_screen_height);
        this.D = resources.getDimensionPixelSize(oq6.material_time_picker_minimum_screen_width);
        this.E = resources.getDimensionPixelSize(oq6.material_clock_size);
    }
}
