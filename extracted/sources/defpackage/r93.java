package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class r93 extends q93 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.series_background, 3);
        sparseIntArray.put(rr6.poster, 4);
        sparseIntArray.put(rr6.watchProgressBackground, 5);
        sparseIntArray.put(rr6.watchProgress, 6);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            uy6.m(i2, this.v);
            this.w.setTextColor(i);
            this.z.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.C = 1L;
        }
        k0();
    }
}
