package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class a53 extends i7 {
    public static final sk6 x;
    public static final SparseIntArray y;
    public final g53 v;
    public long w;

    static {
        sk6 sk6Var = new sk6(3);
        x = sk6Var;
        sk6Var.J(0, new String[]{"holder_movie_list_title"}, new int[]{1}, new int[]{js6.holder_movie_list_title});
        SparseIntArray sparseIntArray = new SparseIntArray();
        y = sparseIntArray;
        sparseIntArray.put(rr6.recycler_view, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a53(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 3, x, y);
        this.w = -1L;
        g53 g53Var = (g53) objArrI0[1];
        this.v = g53Var;
        if (g53Var != null) {
            g53Var.q = this;
        }
        ((LinearLayout) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.w != 0) {
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
            this.w = 1L;
        }
        this.v.g0();
        k0();
    }
}
