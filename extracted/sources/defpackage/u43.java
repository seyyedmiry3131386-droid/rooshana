package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class u43 extends t43 {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.card_view, 6);
        sparseIntArray.put(rr6.series_background, 7);
        sparseIntArray.put(rr6.banner, 8);
        sparseIntArray.put(rr6.barrier, 9);
        sparseIntArray.put(rr6.download, 10);
        sparseIntArray.put(rr6.download_icon, 11);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
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
            uy6.p(this.w, i2, null);
            this.z.setTextColor(i);
            this.A.setTextColor(i);
            this.B.setTextColor(i);
            this.D.setTextColor(i);
            this.E.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.F = 1L;
        }
        k0();
    }
}
