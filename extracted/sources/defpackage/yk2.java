package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class yk2 extends wk2 {
    public static final sk6 C;
    public static final SparseIntArray D;
    public long B;

    static {
        sk6 sk6Var = new sk6(7);
        C = sk6Var;
        sk6Var.J(0, new String[]{"empty_view_button"}, new int[]{3}, new int[]{js6.empty_view_button});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.search_view, 4);
        sparseIntArray.put(rr6.guideline, 5);
        sparseIntArray.put(rr6.shadow, 6);
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 2;
        if (j2 != 0) {
            i = sj8.b().q;
            i2 = sj8.b().l;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setBackground(new ColorDrawable(i2));
            this.y.setBackground(new ColorDrawable(i));
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.v.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 2L;
        }
        this.v.g0();
        k0();
    }
}
