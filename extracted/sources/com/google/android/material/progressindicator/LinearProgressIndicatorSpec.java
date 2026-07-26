package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import defpackage.t80;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public final class LinearProgressIndicatorSpec extends t80 {
    public int o;
    public int p;
    public boolean q;
    public int r;
    public Integer s;
    public int t;
    public float u;
    public boolean v;
    public boolean w;

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.linearProgressIndicatorStyle);
    }

    @Override // defpackage.t80
    public final boolean c() {
        return super.c() && e() == a();
    }

    @Override // defpackage.t80
    public final void d() {
        super.d();
        if (this.r < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.o == 0) {
            if ((a() > 0 || (this.w && e() > 0)) && this.i == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.e.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public final int e() {
        return !this.w ? a() : this.v ? (int) (this.a * this.u) : this.t;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = LinearProgressIndicator.q;
        super(context, attributeSet, i, i2);
        int[] iArr = yt6.LinearProgressIndicator;
        int i3 = vp6.linearProgressIndicatorStyle;
        vj8.a(context, attributeSet, i3, i2);
        vj8.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        this.o = typedArrayObtainStyledAttributes.getInt(yt6.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.p = typedArrayObtainStyledAttributes.getInt(yt6.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.r = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.LinearProgressIndicator_trackStopIndicatorSize, 0), this.a);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.LinearProgressIndicator_trackStopIndicatorPadding)) {
            this.s = Integer.valueOf(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.LinearProgressIndicator_trackStopIndicatorPadding, 0));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(yt6.LinearProgressIndicator_trackInnerCornerRadius);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                this.t = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.v = false;
                this.w = true;
            } else if (i4 == 6) {
                this.u = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.v = true;
                this.w = true;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        d();
        this.q = this.p == 1;
    }
}
