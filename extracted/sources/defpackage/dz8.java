package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class dz8 extends cz8 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 8);
        sparseIntArray.put(rr6.app_detail, 9);
        sparseIntArray.put(rr6.size, 10);
        sparseIntArray.put(rr6.arrow_layout, 11);
        sparseIntArray.put(rr6.download_layout, 12);
        sparseIntArray.put(rr6.fast_download_view, 13);
        sparseIntArray.put(rr6.whats_new_layout, 14);
        sparseIntArray.put(rr6.rating_section, 15);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
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
            uy6.o(i2, this.v);
            uy6.n(i2, this.w);
            this.x.setTextColor(i3);
            this.z.setTextColor(i);
            this.A.setTextColor(i);
            this.C.setTextColor(i3);
            this.D.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.E = 1L;
        }
        k0();
    }
}
