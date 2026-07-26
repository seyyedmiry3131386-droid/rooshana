package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import defpackage.fk4;
import defpackage.ja1;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.oq6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public static final int f = mt6.Widget_MaterialComponents_MaterialDivider;
    public final fk4 a;
    public int b;
    public int c;
    public int d;
    public int e;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.c;
    }

    public int getDividerInsetEnd() {
        return this.e;
    }

    public int getDividerInsetStart() {
        return this.d;
    }

    public int getDividerThickness() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.e : this.d;
        if (z) {
            width = getWidth();
            i = this.d;
        } else {
            width = getWidth();
            i = this.e;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        fk4 fk4Var = this.a;
        fk4Var.setBounds(i2, 0, i3, bottom);
        fk4Var.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.b;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.c != i) {
            this.c = i;
            this.a.s(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(ContextCompat.getColor(getContext(), i));
    }

    public void setDividerInsetEnd(int i) {
        this.e = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.d = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.b != i) {
            this.b = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = f;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.a = new fk4();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.MaterialDivider, i, i2, new int[0]);
        this.b = typedArrayD.getDimensionPixelSize(yt6.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(oq6.material_divider_thickness));
        this.d = typedArrayD.getDimensionPixelOffset(yt6.MaterialDivider_dividerInsetStart, 0);
        this.e = typedArrayD.getDimensionPixelOffset(yt6.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(ja1.r(context2, typedArrayD, yt6.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayD.recycle();
    }
}
