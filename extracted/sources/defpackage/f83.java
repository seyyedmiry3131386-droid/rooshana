package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class f83 extends a79 {
    public final MyketTextView v;
    public final FrameLayout w;
    public long x;

    public f83(ea1 ea1Var, View view, FrameLayout frameLayout, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = frameLayout;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
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
        k0();
    }
}
