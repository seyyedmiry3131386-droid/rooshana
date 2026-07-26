package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class dz6 extends cz6 {
    public static final sk6 E;
    public static final SparseIntArray F;
    public long D;

    static {
        sk6 sk6Var = new sk6(8);
        E = sk6Var;
        sk6Var.J(1, new String[]{"filter_view"}, new int[]{2}, new int[]{js6.filter_view});
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.swipe_layout, 3);
        sparseIntArray.put(rr6.bottom_inset_view, 4);
        sparseIntArray.put(rr6.recycler_view, 5);
        sparseIntArray.put(rr6.try_again, 6);
        sparseIntArray.put(rr6.shadow, 7);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.D = 0L;
        }
        this.w.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.D != 0) {
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
            this.D = 2L;
        }
        this.w.g0();
        k0();
    }
}
