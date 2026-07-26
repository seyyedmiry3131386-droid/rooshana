package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class z63 extends y63 {
    public static final SparseIntArray S;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(rr6.layout, 14);
        sparseIntArray.put(rr6.verify_icon, 15);
        sparseIntArray.put(rr6.rate, 16);
        sparseIntArray.put(rr6.avatar, 17);
        sparseIntArray.put(rr6.like, 18);
        sparseIntArray.put(rr6.dislike, 19);
        sparseIntArray.put(rr6.developer_layout, 20);
        sparseIntArray.put(rr6.developer_like, 21);
        sparseIntArray.put(rr6.developer_dislike, 22);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.R;
            this.R = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().v;
            i3 = sj8.b().n;
            i4 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i4);
            this.y.setTextColor(i3);
            this.z.setTextColor(i4);
            this.A.setTextColor(i3);
            this.C.setTextColor(i4);
            this.F.setTextColor(i4);
            this.G.setTextColor(i4);
            this.I.setTextColor(i3);
            uy6.m(i2, this.J);
            this.M.setTextColor(i3);
            t61.s(i, this.N);
            this.O.setTextColor(i4);
            uy6.m(i2, this.Q);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.R = 1L;
        }
        k0();
    }
}
