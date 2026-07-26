package defpackage;

import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes3.dex */
public final class ec3 extends dc3 {
    public static final SparseIntArray A;
    public static final sk6 z;
    public long y;

    static {
        sk6 sk6Var = new sk6(3);
        z = sk6Var;
        sk6Var.J(0, new String[]{"multi_app_card_digested"}, new int[]{1}, new int[]{js6.multi_app_card_digested});
        SparseIntArray sparseIntArray = new SparseIntArray();
        A = sparseIntArray;
        sparseIntArray.put(rr6.video_view, 2);
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.y = 0L;
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.y != 0) {
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
            this.y = 2L;
        }
        this.v.g0();
        k0();
    }
}
