package io.sentry.android.core.internal.util;

import android.net.ConnectivityManager;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.android.core.c0;
import io.sentry.n0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.r rVarA;
        io.sentry.r rVarA2;
        switch (this.a) {
            case 0:
                this.b.P(false);
                return;
            case 1:
                c cVar = this.b;
                cVar.P(true);
                rVarA = c.n.a();
                try {
                    c.o.clear();
                    rVarA.close();
                    rVarA2 = c.l.a();
                    try {
                        c.m = null;
                        rVarA2.close();
                        c0.e.k(cVar);
                        return;
                    } finally {
                        try {
                            rVarA2.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        rVarA.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 2:
                c cVar2 = this.b;
                cVar2.R(null);
                IConnectionStatusProvider$ConnectionStatus iConnectionStatusProvider$ConnectionStatusU = cVar2.u();
                if (iConnectionStatusProvider$ConnectionStatusU == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED) {
                    cVar2.k.set(false);
                    rVarA2 = c.n.a();
                    try {
                        Iterator it = c.o.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                            break;
                        }
                        rVarA2.close();
                    } finally {
                        try {
                            break;
                        } catch (Throwable th3) {
                        }
                    }
                }
                rVarA = cVar2.f.a();
                try {
                    Iterator it2 = cVar2.e.iterator();
                    while (it2.hasNext()) {
                        ((n0) it2.next()).g(iConnectionStatusProvider$ConnectionStatusU);
                        break;
                    }
                    rVarA.close();
                    cVar2.k();
                    return;
                } finally {
                    try {
                        break;
                    } catch (Throwable th22) {
                    }
                }
            default:
                this.b.k();
                return;
        }
    }
}
