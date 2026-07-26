package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;

/* JADX INFO: loaded from: classes3.dex */
public final class g92 extends f92 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.attach_content, 6);
        sparseIntArray.put(rr6.screenshot_bg, 7);
        sparseIntArray.put(rr6.screenshot_layout, 8);
        sparseIntArray.put(rr6.screenshot_loading, 9);
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
            int i4 = sj8.b().c;
            AlphaColor alphaColor = sj8.b().J;
            Ripple ripple = sj8.b().O;
            i3 = sj8.b().n;
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
            this.v.setTextColor(i);
            uy6.n(i2, this.x);
            this.y.setTextColor(i3);
            uy6.n(i2, this.z);
            this.A.setBackground(new ColorDrawable(i));
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
