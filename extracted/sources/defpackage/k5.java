package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class k5 extends j5 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.arrow, 2);
        sparseIntArray.put(rr6.scroll_view, 3);
        sparseIntArray.put(rr6.description, 4);
        sparseIntArray.put(rr6.input, 5);
        sparseIntArray.put(rr6.link, 6);
        sparseIntArray.put(rr6.description2, 7);
        sparseIntArray.put(rr6.error_message, 8);
        sparseIntArray.put(rr6.buttons, 9);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        AlphaColor alphaColor;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        int i = (j2 == 0 || (alphaColor = sj8.b().J) == null) ? 0 : alphaColor.a;
        if (j2 != 0) {
            this.C.setTextColor(i);
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
