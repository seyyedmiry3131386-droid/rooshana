package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class m53 extends l53 {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(rr6.layout, 7);
        sparseIntArray.put(rr6.avatar, 8);
        sparseIntArray.put(rr6.like_label, 9);
        sparseIntArray.put(rr6.like_button, 10);
        sparseIntArray.put(rr6.dislike_button, 11);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
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
            this.w.setTextColor(i3);
            this.y.setTextColor(i);
            this.A.setTextColor(i3);
            this.C.setTextColor(i3);
            uy6.n(i2, this.E);
            this.F.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.G = 1L;
        }
        k0();
    }
}
