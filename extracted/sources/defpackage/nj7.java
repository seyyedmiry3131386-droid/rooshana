package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class nj7 extends i7 {
    public static final sk6 y;
    public static final SparseIntArray z;
    public final FrameLayout v;
    public final r28 w;
    public long x;

    static {
        sk6 sk6Var = new sk6(4);
        y = sk6Var;
        sk6Var.J(1, new String[]{"special_main_card"}, new int[]{2}, new int[]{js6.special_main_card});
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.recycler_view, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj7(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 4, y, z);
        this.x = -1L;
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.v = frameLayout;
        frameLayout.setTag(null);
        ((RelativeLayout) objArrI0[1]).setTag(null);
        r28 r28Var = (r28) objArrI0[2];
        this.w = r28Var;
        if (r28Var != null) {
            r28Var.q = this;
        }
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.p(this.v, i, null);
        }
        this.w.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.x != 0) {
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
            this.x = 1L;
        }
        this.w.g0();
        k0();
    }
}
