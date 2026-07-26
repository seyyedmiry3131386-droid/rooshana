package defpackage;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class aj7 extends i7 {
    public static final sk6 y;
    public final r28 v;
    public final FrameLayout w;
    public long x;

    static {
        sk6 sk6Var = new sk6(2);
        y = sk6Var;
        sk6Var.J(0, new String[]{"special_main_card"}, new int[]{1}, new int[]{js6.special_main_card});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj7(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 2, y, null);
        this.x = -1L;
        r28 r28Var = (r28) objArrI0[1];
        this.v = r28Var;
        if (r28Var != null) {
            r28Var.q = this;
        }
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        this.w = frameLayout;
        frameLayout.setTag(null);
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
            uy6.p(this.w, i, null);
        }
        this.v.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.x != 0) {
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
            this.x = 1L;
        }
        this.v.g0();
        k0();
    }
}
