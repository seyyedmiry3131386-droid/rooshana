package defpackage;

import android.os.Handler;
import androidx.media3.ui.DefaultTimeBar;
import ir.mservices.market.version2.manager.player.IbexController;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class wg3 implements kl8 {
    public final /* synthetic */ xg3 a;
    public final /* synthetic */ IbexController b;

    public wg3(xg3 xg3Var, IbexController ibexController) {
        this.a = xg3Var;
        this.b = ibexController;
    }

    @Override // defpackage.kl8
    public final void f(DefaultTimeBar defaultTimeBar, long j, boolean z) {
        IbexController.w(this.b);
    }

    @Override // defpackage.kl8
    public final void g(DefaultTimeBar defaultTimeBar, long j) {
        Handler handler;
        MyketTextView myketTextView = this.a.B;
        IbexController ibexController = this.b;
        lw8 lw8Var = ibexController.e;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView.setText(lw8Var.c((int) j));
        if (ibexController.g == null || (handler = ibexController.f) == null) {
            return;
        }
        handler.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.kl8
    public final void b(DefaultTimeBar defaultTimeBar, long j) {
    }
}
