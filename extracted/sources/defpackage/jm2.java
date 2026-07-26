package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class jm2 extends im2 {
    public static final sk6 F;
    public static final SparseIntArray G;
    public long E;

    static {
        sk6 sk6Var = new sk6(11);
        F = sk6Var;
        sk6Var.J(1, new String[]{"holder_own_profile_header"}, new int[]{2}, new int[]{js6.holder_own_profile_header});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.scroll_view, 3);
        sparseIntArray.put(rr6.profile_surface, 4);
        sparseIntArray.put(rr6.profile_subheader_layout, 5);
        sparseIntArray.put(rr6.profile_tabs, 6);
        sparseIntArray.put(rr6.apps, 7);
        sparseIntArray.put(rr6.movies, 8);
        sparseIntArray.put(rr6.profile_header_tabs, 9);
        sparseIntArray.put(rr6.try_again, 10);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.E = 0L;
        }
        this.x.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.x.e0();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.E = 2L;
        }
        this.x.g0();
        k0();
    }
}
