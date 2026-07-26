package defpackage;

import android.util.SparseIntArray;
import ir.mservices.market.theme.AlphaColor;

/* JADX INFO: loaded from: classes3.dex */
public final class r53 extends q53 {
    public static final SparseIntArray z;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.banner, 2);
        sparseIntArray.put(rr6.clickable_layout, 3);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        AlphaColor alphaColor;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = (j2 == 0 || (alphaColor = sj8.b().I) == null) ? 0 : alphaColor.a;
        if (j2 != 0) {
            this.x.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
