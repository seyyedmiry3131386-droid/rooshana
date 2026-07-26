package io.sentry.android.core;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.DataCategory;
import io.sentry.IConnectionStatusProvider$ConnectionStatus;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.d4;
import io.sentry.m3;
import io.sentry.n3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 4;
        this.b = systemEventsBreadcrumbsIntegration;
        this.d = c1Var;
        this.c = sentryAndroidOptions;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        io.sentry.r rVarA;
        switch (this.a) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                io.sentry.c1 c1Var = (io.sentry.c1) this.d;
                try {
                    if (sendCachedEnvelopeIntegration.i.get()) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.h.getAndSet(true)) {
                        io.sentry.o0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.d = connectionStatusProvider;
                        connectionStatusProvider.E0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.g = sendCachedEnvelopeIntegration.a.a(c1Var, sentryAndroidOptions);
                    }
                    io.sentry.o0 o0Var = sendCachedEnvelopeIntegration.d;
                    if (o0Var != null && o0Var.A0() == IConnectionStatusProvider$ConnectionStatus.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.transport.p pVarE = c1Var.e();
                    if (pVarE != null && pVarE.d(DataCategory.All)) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    d4 d4Var = sendCachedEnvelopeIntegration.g;
                    if (d4Var == null) {
                        sentryAndroidOptions.getLogger().i(SentryLevel.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        d4Var.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().f(SentryLevel.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                String str = (String) this.d;
                dVar.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        dVar.b.getLogger().i(SentryLevel.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                h hVar = (h) this.b;
                b6 b6Var = (b6) this.c;
                io.sentry.c1 c1Var2 = (io.sentry.c1) this.d;
                ArrayList<m3> arrayList = hVar.m;
                if (hVar.p.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                rVarA = hVar.w.a();
                try {
                    for (m3 m3Var : arrayList) {
                        arrayList2.add(new n3(m3Var.a, m3Var.b, m3Var.d, m3Var.c, Double.valueOf(m3Var.e), m3Var.f, b6Var));
                    }
                    arrayList.clear();
                    rVarA.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        c1Var2.l((n3) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.b;
                b6 b6Var2 = (b6) this.c;
                String str2 = (String) this.d;
                rVarA = envelopeFileObserverIntegration.d.a();
                try {
                    if (!envelopeFileObserverIntegration.c) {
                        envelopeFileObserverIntegration.b(b6Var2, str2);
                        break;
                    }
                    rVarA.close();
                    return;
                } finally {
                    try {
                        rVarA.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.b;
                io.sentry.c1 c1Var3 = (io.sentry.c1) this.d;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.c;
                rVarA = systemEventsBreadcrumbsIntegration.k.a();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f && !systemEventsBreadcrumbsIntegration.g && systemEventsBreadcrumbsIntegration.b == null) {
                        systemEventsBreadcrumbsIntegration.b = new u1(systemEventsBreadcrumbsIntegration, c1Var3, sentryAndroidOptions2);
                        if (systemEventsBreadcrumbsIntegration.h == null) {
                            systemEventsBreadcrumbsIntegration.h = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.e) {
                                systemEventsBreadcrumbsIntegration.h.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.i == null) {
                            systemEventsBreadcrumbsIntegration.i = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.i.start();
                        }
                        try {
                            i0.j(systemEventsBreadcrumbsIntegration.a, new j0(sentryAndroidOptions2.getLogger()), systemEventsBreadcrumbsIntegration.b, systemEventsBreadcrumbsIntegration.h, new Handler(systemEventsBreadcrumbsIntegration.i.getLooper()));
                            if (!systemEventsBreadcrumbsIntegration.j.getAndSet(true)) {
                                sentryAndroidOptions2.getLogger().i(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                io.sentry.config.a.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th4) {
                            sentryAndroidOptions2.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions2.getLogger().f(SentryLevel.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th4);
                        }
                        break;
                    }
                    rVarA.close();
                    return;
                } finally {
                }
        }
    }

    public /* synthetic */ e1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
