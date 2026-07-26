package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class lm2 extends km2 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.progress_layout, 4);
        sparseIntArray.put(rr6.loading, 5);
        sparseIntArray.put(rr6.top_shadow, 6);
        sparseIntArray.put(rr6.back, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        int i2 = 0;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().J;
            AlphaColor alphaColor2 = sj8.b().I;
            i = alphaColor != null ? alphaColor.a : 0;
            if (alphaColor2 != null) {
                i2 = alphaColor2.a;
            }
        } else {
            i = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i2);
            this.z.setTextColor(i2);
            this.B.setBackground(new ColorDrawable(i));
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
