package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class fz6 extends ez6 {
    public static final sk6 D;
    public static final SparseIntArray E;
    public long C;

    static {
        sk6 sk6Var = new sk6(6);
        D = sk6Var;
        sk6Var.J(0, new String[]{"filter_view"}, new int[]{1}, new int[]{js6.filter_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.bottom_inset_view, 2);
        sparseIntArray.put(rr6.recycler_view, 3);
        sparseIntArray.put(rr6.try_again, 4);
        sparseIntArray.put(rr6.shadow, 5);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.C = 0L;
        }
        this.w.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.C != 0) {
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
            this.C = 2L;
        }
        this.w.g0();
        k0();
    }
}
