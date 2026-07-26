package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class g83 extends a79 {
    public final MyketTextView v;
    public final MyketTextView w;
    public final FrameLayout x;
    public long y;

    public g83(ea1 ea1Var, View view, MyketTextView myketTextView, MyketTextView myketTextView2, FrameLayout frameLayout) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = frameLayout;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().c;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i);
            this.w.setTextColor(i2);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
