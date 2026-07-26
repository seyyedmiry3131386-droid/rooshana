package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class e75 extends d75 {
    public static final SparseIntArray Q;
    public long P;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(rr6.review_background, 10);
        sparseIntArray.put(rr6.avatar, 11);
        sparseIntArray.put(rr6.like_label, 12);
        sparseIntArray.put(rr6.like_button, 13);
        sparseIntArray.put(rr6.dislike_button, 14);
        sparseIntArray.put(rr6.like_icon, 15);
        sparseIntArray.put(rr6.dislike_icon, 16);
        sparseIntArray.put(rr6.like_count_group, 17);
        sparseIntArray.put(rr6.submit_button, 18);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.P;
            this.P = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().l;
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
            this.w.setTextColor(i3);
            this.x.setTextColor(i4);
            this.y.setTextColor(i3);
            this.A.setTextColor(i3);
            uy6.m(i2, this.C);
            o40.D(i, this.D);
            this.F.setTextColor(i3);
            this.H.setTextColor(i4);
            this.K.setTextColor(i4);
            this.N.setTextColor(i4);
            this.N.setHintTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.P != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.P = 1L;
        }
        k0();
    }
}
