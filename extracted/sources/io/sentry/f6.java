package io.sentry;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class f6 extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ h6 b;

    public /* synthetic */ f6(h6 h6Var, int i) {
        this.a = i;
        this.b = h6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h6 h6Var = this.b;
                SpanStatus spanStatusD = h6Var.d();
                if (spanStatusD == null) {
                    spanStatusD = SpanStatus.OK;
                }
                h6Var.k(spanStatusD);
                h6Var.l.set(false);
                break;
            default:
                h6 h6Var2 = this.b;
                SpanStatus spanStatusD2 = h6Var2.d();
                if (spanStatusD2 == null) {
                    spanStatusD2 = SpanStatus.DEADLINE_EXCEEDED;
                }
                h6Var2.g(spanStatusD2, h6Var2.r.i != null, null);
                h6Var2.m.set(false);
                break;
        }
    }
}
