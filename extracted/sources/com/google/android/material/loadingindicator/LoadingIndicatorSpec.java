package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.m91;
import defpackage.oq6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.yt6;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingIndicatorSpec {
    public int a;
    public int b;
    public int c;
    public int[] d;
    public int e;

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.loadingIndicatorStyle);
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        int i2 = LoadingIndicator.c;
        this.d = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(oq6.m3_loading_indicator_shape_size);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(oq6.m3_loading_indicator_container_size);
        int[] iArr = yt6.LoadingIndicator;
        vj8.a(context, attributeSet, i, i2);
        vj8.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.LoadingIndicator_indicatorSize, dimensionPixelSize);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.LoadingIndicator_containerWidth, dimensionPixelSize2);
        this.c = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.LoadingIndicator_containerHeight, dimensionPixelSize2);
        if (!typedArrayObtainStyledAttributes.hasValue(yt6.LoadingIndicator_indicatorColor)) {
            this.d = new int[]{m91.q(context, xp6.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(yt6.LoadingIndicator_indicatorColor).type != 1) {
            this.d = new int[]{typedArrayObtainStyledAttributes.getColor(yt6.LoadingIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(yt6.LoadingIndicator_indicatorColor, -1));
            this.d = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        this.e = typedArrayObtainStyledAttributes.getColor(yt6.LoadingIndicator_containerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
