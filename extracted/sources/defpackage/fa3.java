package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketVideoView;

/* JADX INFO: loaded from: classes3.dex */
public final class fa3 extends a79 {
    public final MyketVideoView v;
    public long w;

    public fa3(ea1 ea1Var, View view, MyketVideoView myketVideoView) {
        super(0, view, ea1Var);
        this.v = myketVideoView;
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
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
        k0();
    }
}
