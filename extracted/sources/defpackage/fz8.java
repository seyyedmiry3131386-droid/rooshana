package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class fz8 extends ez8 {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(rr6.myket_new_version_icon, 9);
        sparseIntArray.put(rr6.app_icon, 10);
        sparseIntArray.put(rr6.app_detail, 11);
        sparseIntArray.put(rr6.size, 12);
        sparseIntArray.put(rr6.arrow_layout, 13);
        sparseIntArray.put(rr6.download_layout, 14);
        sparseIntArray.put(rr6.fast_download_view, 15);
        sparseIntArray.put(rr6.whats_new_layout, 16);
        sparseIntArray.put(rr6.rating_section, 17);
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
            j = this.H;
            this.H = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().f;
            i3 = sj8.b().c;
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
            uy6.o(i2, this.v);
            uy6.n(i2, this.w);
            this.x.setTextColor(i5);
            this.y.setBackground(new ColorDrawable(i));
            this.B.setTextColor(i3);
            this.C.setTextColor(i4);
            this.D.setTextColor(i4);
            this.F.setTextColor(i5);
            this.G.setTextColor(i5);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.H = 1L;
        }
        k0();
    }
}
