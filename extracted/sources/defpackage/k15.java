package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class k15 extends j15 {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(rr6.banner_small, 5);
        sparseIntArray.put(rr6.download, 6);
        sparseIntArray.put(rr6.barrier, 7);
        sparseIntArray.put(rr6.button_layout, 8);
        sparseIntArray.put(rr6.button, 9);
        sparseIntArray.put(rr6.flow_layout, 10);
        sparseIntArray.put(rr6.title_flow_layout, 11);
        sparseIntArray.put(rr6.streamer_name, 12);
        sparseIntArray.put(rr6.arrow, 13);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            AlphaColor alphaColor = sj8.b().I;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().l;
            int i4 = sj8.b().m;
            i = alphaColor != null ? alphaColor.a : 0;
            i2 = ripple.c;
            i = i;
            i = i4;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.C.setTextColor(i);
            this.D.setTextColor(i);
            this.E.setBorderColor(i3);
            uy6.m(i2, this.F);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.I = 1L;
        }
        k0();
    }
}
