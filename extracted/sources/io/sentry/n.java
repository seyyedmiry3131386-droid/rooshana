package io.sentry;

import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends TimerTask {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Iterator it = ((q) this.b).d.iterator();
                while (it.hasNext()) {
                    ((y0) it.next()).c();
                }
                break;
            case 1:
                io.sentry.android.core.s0 s0Var = (io.sentry.android.core.s0) this.b;
                c4 c4Var = s0Var.f;
                if (s0Var.g) {
                    c4Var.p();
                }
                c4Var.m().getReplayController().stop();
                c4Var.m().getContinuousProfiler().a(false);
                break;
            default:
                io.sentry.transport.p pVar = (io.sentry.transport.p) this.b;
                Iterator it2 = pVar.d.iterator();
                while (it2.hasNext()) {
                    ((io.sentry.transport.o) it2.next()).I(pVar);
                }
                break;
        }
    }
}
