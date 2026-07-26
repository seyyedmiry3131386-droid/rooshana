package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class e93 extends md {
    public static final sk6 y;
    public static final SparseIntArray z;
    public long x;

    static {
        sk6 sk6Var = new sk6(3);
        y = sk6Var;
        sk6Var.J(0, new String[]{"holder_shimmer_application_horizontal"}, new int[]{1}, new int[]{js6.holder_shimmer_application_horizontal});
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.screenshots_skeleton, 2);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.x = 0L;
        }
        ((v83) this.v).c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.x != 0) {
                    return true;
                }
                return ((v83) this.v).e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 2L;
        }
        ((v83) this.v).g0();
        k0();
    }
}
