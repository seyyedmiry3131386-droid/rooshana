package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class z53 extends x53 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.clickable_layout, 5);
        sparseIntArray.put(rr6.blur_banner, 6);
        sparseIntArray.put(rr6.blur_banner_foreground, 7);
        sparseIntArray.put(rr6.banner, 8);
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
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().I;
            Ripple ripple = sj8.b().O;
            i = alphaColor != null ? alphaColor.a : 0;
            i = ripple.c;
        } else {
            i = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            uy6.p(this.w, i, null);
            this.B.setTextColor(i);
            this.C.setTextColor(i);
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
