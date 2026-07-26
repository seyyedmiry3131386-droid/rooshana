package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public abstract class t80 {
    public int a;
    public int b;
    public float c;
    public boolean d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public float n;

    public t80(Context context, AttributeSet attributeSet, int i, int i2) {
        this.e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(oq6.mtrl_progress_track_thickness);
        int[] iArr = yt6.BaseProgressIndicator;
        vj8.a(context, attributeSet, i, i2);
        vj8.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.a = ja1.s(context, typedArrayObtainStyledAttributes, yt6.BaseProgressIndicator_trackThickness, dimensionPixelSize);
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(yt6.BaseProgressIndicator_trackCornerRadius);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                this.b = Math.min(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainStyledAttributes.getResources().getDisplayMetrics()), this.a / 2);
                this.d = false;
            } else if (i3 == 6) {
                this.c = Math.min(typedValuePeekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.d = true;
            }
        }
        this.g = typedArrayObtainStyledAttributes.getInt(yt6.BaseProgressIndicator_showAnimationBehavior, 0);
        this.h = typedArrayObtainStyledAttributes.getInt(yt6.BaseProgressIndicator_hideAnimationBehavior, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_indicatorTrackGapSize, 0);
        int iAbs = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_wavelength, 0));
        this.j = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_wavelengthDeterminate, iAbs));
        this.k = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_wavelengthIndeterminate, iAbs));
        this.l = Math.abs(typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_waveAmplitude, 0));
        this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.BaseProgressIndicator_waveSpeed, 0);
        this.n = typedArrayObtainStyledAttributes.getFloat(yt6.BaseProgressIndicator_indeterminateAnimatorDurationScale, 1.0f);
        if (!typedArrayObtainStyledAttributes.hasValue(yt6.BaseProgressIndicator_indicatorColor)) {
            this.e = new int[]{m91.q(context, xp6.colorPrimary, -1)};
        } else if (typedArrayObtainStyledAttributes.peekValue(yt6.BaseProgressIndicator_indicatorColor).type != 1) {
            this.e = new int[]{typedArrayObtainStyledAttributes.getColor(yt6.BaseProgressIndicator_indicatorColor, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArrayObtainStyledAttributes.getResourceId(yt6.BaseProgressIndicator_indicatorColor, -1));
            this.e = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.BaseProgressIndicator_trackColor)) {
            this.f = typedArrayObtainStyledAttributes.getColor(yt6.BaseProgressIndicator_trackColor, -1);
        } else {
            this.f = this.e[0];
            TypedArray typedArrayObtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{R.attr.disabledAlpha});
            float f = typedArrayObtainStyledAttributes2.getFloat(0, 0.2f);
            typedArrayObtainStyledAttributes2.recycle();
            this.f = m91.j(this.f, (int) (f * 255.0f));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.d ? (int) (this.a * this.c) : this.b;
    }

    public final boolean b(boolean z) {
        if (this.l <= 0) {
            return false;
        }
        if (z || this.k <= 0) {
            return z && this.j > 0;
        }
        return true;
    }

    public boolean c() {
        return this.d && this.c == 0.5f;
    }

    public void d() {
        if (this.i < 0) {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }
}
