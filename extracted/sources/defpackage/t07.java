package defpackage;

import android.animation.ValueAnimator;
import androidx.media3.ui.DefaultTimeBar;
import ir.mservices.market.reels.ui.recycler.b;

/* JADX INFO: loaded from: classes3.dex */
public final class t07 implements kl8 {
    public final /* synthetic */ b a;

    public t07(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.kl8
    public final void b(DefaultTimeBar defaultTimeBar, long j) {
        b bVar = this.a;
        bVar.y0 = true;
        ValueAnimator valueAnimator = bVar.x0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gb6 gb6VarJ = bVar.J();
        if (gb6VarJ != null) {
            gb6VarJ.x(j);
        }
        bVar.N(true);
    }

    @Override // defpackage.kl8
    public final void f(DefaultTimeBar defaultTimeBar, long j, boolean z) {
        b bVar = this.a;
        bVar.y0 = false;
        gb6 gb6VarJ = bVar.J();
        if (gb6VarJ != null) {
            gb6VarJ.x(j);
        }
        bVar.Z = j;
        q07 q07Var = bVar.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        if (q07Var.y.isShown()) {
            return;
        }
        bVar.N(false);
    }

    @Override // defpackage.kl8
    public final void g(DefaultTimeBar defaultTimeBar, long j) {
        gb6 gb6VarJ = this.a.J();
        if (gb6VarJ != null) {
            gb6VarJ.x(j);
        }
    }
}
