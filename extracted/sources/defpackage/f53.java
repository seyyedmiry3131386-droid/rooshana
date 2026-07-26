package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class f53 extends e53 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.image_background, 3);
        sparseIntArray.put(rr6.header_shimmer, 4);
        sparseIntArray.put(rr6.header_title, 5);
        sparseIntArray.put(rr6.section_more_title, 6);
        sparseIntArray.put(rr6.recycler_view, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().J;
            Ripple ripple = sj8.b().O;
            i = alphaColor != null ? alphaColor.a : 0;
            i = ripple.c;
        } else {
            i = 0;
        }
        if (j2 != 0) {
            uy6.m(i, this.w);
            t61.s(i, this.A);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
