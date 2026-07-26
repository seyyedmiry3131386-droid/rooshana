package defpackage;

import android.content.res.ColorStateList;
import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class xn2 extends wn2 {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(rr6.phone_verify, 11);
        sparseIntArray.put(rr6.next, 12);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().A;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().v;
            i4 = sj8.b().n;
            i5 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.w.setPlaceholderTextColor(ColorStateList.valueOf(i4));
            this.A.setTextColor(i4);
            uy6.p(this.B, i2, null);
            this.C.setTextColor(i4);
            uy6.p(this.D, i2, null);
            t61.s(i3, this.E);
            this.F.setTextColor(i4);
            uy6.m(i2, this.F);
            this.G.setTextColor(i5);
            this.H.setTextColor(i4);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.J = 1L;
        }
        k0();
    }
}
