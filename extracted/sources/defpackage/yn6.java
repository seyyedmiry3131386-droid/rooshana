package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class yn6 extends xn6 {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.app_icon, 9);
        sparseIntArray.put(rr6.appLayout, 10);
        sparseIntArray.put(rr6.status_text, 11);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().c;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().v;
            i4 = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.x.setTextColor(i4);
            t61.s(i3, this.y);
            this.z.setTextColor(i);
            this.A.setTextColor(i4);
            uy6.n(i2, this.B);
            this.C.setTextColor(i4);
            this.D.setTextColor(i4);
            this.E.setTextColor(i4);
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
