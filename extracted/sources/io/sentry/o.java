package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends TimerTask {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ q b;

    public o(q qVar, ArrayList arrayList) {
        this.b = qVar;
        this.a = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        q qVar = this.b;
        if (jCurrentTimeMillis - qVar.i <= 10) {
            return;
        }
        ArrayList arrayList = this.a;
        arrayList.clear();
        qVar.i = jCurrentTimeMillis;
        k3 k3Var = new k3(qVar.g.getDateProvider().a().d());
        Iterator it = qVar.d.iterator();
        while (it.hasNext()) {
            ((y0) it.next()).a(k3Var);
        }
        for (p pVar : qVar.c.values()) {
            ArrayList arrayList2 = pVar.a;
            m1 m1Var = pVar.b;
            arrayList2.add(k3Var);
            if (m1Var != null) {
                if (pVar.d.g.getDateProvider().a().d() > TimeUnit.MILLISECONDS.toNanos(30000L) + pVar.c) {
                    arrayList.add(m1Var);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            qVar.f((m1) it2.next());
        }
    }
}
