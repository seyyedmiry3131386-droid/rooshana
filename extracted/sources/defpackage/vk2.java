package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class vk2 extends uk2 {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.message_box_background, 4);
        sparseIntArray.put(rr6.space_1, 5);
        sparseIntArray.put(rr6.vpn_animation, 6);
        sparseIntArray.put(rr6.vpn_background, 7);
        sparseIntArray.put(rr6.connect_toggle, 8);
        sparseIntArray.put(rr6.space_2, 9);
        sparseIntArray.put(rr6.state, 10);
        sparseIntArray.put(rr6.try_again, 11);
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
            this.w.setTextColor(i3);
            uy6.m(i2, this.y);
            this.A.setTextColor(i);
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
