package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: loaded from: classes.dex */
public final class a74 implements LineHeightSpan {
    public final float a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final float e;
    public final int f;
    public int g = Integer.MIN_VALUE;
    public int h = Integer.MIN_VALUE;
    public int i = Integer.MIN_VALUE;
    public int j = Integer.MIN_VALUE;
    public int k;
    public int l;

    public a74(float f, int i, boolean z, boolean z2, float f2, int i2) {
        this.a = f;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = f2;
        this.f = i2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            sn3.b("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.b;
        int i7 = this.f;
        boolean z3 = this.d;
        boolean z4 = this.c;
        if (z && z2 && z4 && z3 && i7 != 2) {
            return;
        }
        if (this.g == Integer.MIN_VALUE) {
            int i8 = i5 - i6;
            int iCeil = (int) Math.ceil(this.a);
            int i9 = iCeil - i8;
            if (i7 != 1 || i9 > 0) {
                float fAbs = this.e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                int iCeil2 = (int) (i9 <= 0 ? Math.ceil(i9 * fAbs) : Math.ceil((1.0f - fAbs) * i9));
                int i10 = fontMetricsInt.descent;
                int i11 = iCeil2 + i10;
                this.i = i11;
                int i12 = i11 - iCeil;
                this.h = i12;
                if (i7 == 0 || i9 >= 0) {
                    if (z4) {
                        i12 = fontMetricsInt.ascent;
                    }
                    this.g = i12;
                    if (z3) {
                        i11 = i10;
                    }
                    this.j = i11;
                    this.k = fontMetricsInt.ascent - i12;
                    this.l = i11 - i10;
                } else if (i7 == 2) {
                    this.g = z4 ? Math.max(fontMetricsInt.ascent, i12) : Math.min(fontMetricsInt.ascent, i12);
                    this.j = z3 ? Math.min(fontMetricsInt.descent, this.i) : Math.max(fontMetricsInt.descent, this.i);
                    this.k = 0;
                    this.l = 0;
                }
            } else {
                int i13 = fontMetricsInt.ascent;
                this.h = i13;
                int i14 = fontMetricsInt.descent;
                this.i = i14;
                this.g = i13;
                this.j = i14;
                this.k = 0;
                this.l = 0;
            }
        }
        fontMetricsInt.ascent = z ? this.g : this.h;
        fontMetricsInt.descent = z2 ? this.j : this.i;
    }
}
