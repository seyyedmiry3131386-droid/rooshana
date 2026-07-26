package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class w53 extends v53 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(rr6.banner, 5);
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
            AlphaColor alphaColor = sj8.b().I;
            int i2 = sj8.c(sj8.f).m;
            i = alphaColor != null ? alphaColor.a : 0;
            i = i2;
        } else {
            i = 0;
        }
        if (j2 != 0) {
            this.x.setTextColor(i);
            this.y.setTextColor(i);
            this.z.setTextColor(i);
            this.A.setTextColor(i);
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
