package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class bl2 extends al2 {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(rr6.message_box_background, 5);
        sparseIntArray.put(rr6.space_1, 6);
        sparseIntArray.put(rr6.vpn_animation, 7);
        sparseIntArray.put(rr6.vpn_background, 8);
        sparseIntArray.put(rr6.connect_toggle, 9);
        sparseIntArray.put(rr6.space_2, 10);
        sparseIntArray.put(rr6.state, 11);
        sparseIntArray.put(rr6.app_icon, 12);
        sparseIntArray.put(rr6.app_status, 13);
        sparseIntArray.put(rr6.cheetah_group, 14);
        sparseIntArray.put(rr6.try_again, 15);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
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
            t61.s(i, this.z);
            this.A.setTextColor(i4);
            uy6.m(i2, this.C);
            this.E.setTextColor(i3);
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
