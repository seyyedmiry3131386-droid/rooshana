package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class jz6 extends iz6 {
    public static final sk6 C;
    public static final SparseIntArray D;
    public long B;

    static {
        sk6 sk6Var = new sk6(6);
        C = sk6Var;
        sk6Var.J(1, new String[]{"filter_view"}, new int[]{2}, new int[]{js6.filter_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(rr6.bottom_inset_view, 3);
        sparseIntArray.put(rr6.recycler_view, 4);
        sparseIntArray.put(rr6.shadow, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.B = 0L;
        }
        this.w.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.B != 0) {
                    return true;
                }
                return this.w.e0();
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
        this.w.g0();
        k0();
    }
}
