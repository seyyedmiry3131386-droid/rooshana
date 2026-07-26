package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.ja1;
import defpackage.oq6;
import defpackage.t80;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public final class CircularProgressIndicatorSpec extends t80 {
    public int o;
    public int p;
    public int q;
    public int r;
    public final boolean s;

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.circularProgressIndicatorStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = CircularProgressIndicator.q;
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(oq6.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(oq6.mtrl_progress_circular_inset_medium);
        int[] iArr = yt6.CircularProgressIndicator;
        vj8.a(context, attributeSet, i, i2);
        vj8.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.o = typedArrayObtainStyledAttributes.getInt(yt6.CircularProgressIndicator_indeterminateAnimationTypeCircular, 0);
        this.p = Math.max(ja1.s(context, typedArrayObtainStyledAttributes, yt6.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.a * 2);
        this.q = ja1.s(context, typedArrayObtainStyledAttributes, yt6.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.r = typedArrayObtainStyledAttributes.getInt(yt6.CircularProgressIndicator_indicatorDirectionCircular, 0);
        this.s = typedArrayObtainStyledAttributes.getBoolean(yt6.CircularProgressIndicator_indeterminateTrackVisible, true);
        typedArrayObtainStyledAttributes.recycle();
        d();
    }
}
