package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import defpackage.d1;
import io.sentry.SentryLevel;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;
    public final /* synthetic */ Window c;

    public /* synthetic */ n(s sVar, Window window, int i) {
        this.a = i;
        this.b = sVar;
        this.c = window;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                s sVar = this.b;
                CopyOnWriteArraySet copyOnWriteArraySet = sVar.b;
                Window window = this.c;
                if (copyOnWriteArraySet.add(window)) {
                    try {
                        d dVar = sVar.h;
                        p pVar = sVar.i;
                        Handler handler = sVar.d;
                        dVar.getClass();
                        d1.a(window, pVar, handler);
                    } catch (Throwable th) {
                        sVar.c.f(SentryLevel.ERROR, "Failed to add frameMetricsAvailableListener", th);
                        return;
                    }
                }
                break;
            default:
                s sVar2 = this.b;
                Window window2 = this.c;
                try {
                    if (sVar2.b.remove(window2)) {
                        d dVar2 = sVar2.h;
                        p pVar2 = sVar2.i;
                        dVar2.getClass();
                        d1.b(window2, pVar2);
                    }
                } catch (Throwable th2) {
                    sVar2.c.f(SentryLevel.ERROR, "Failed to remove frameMetricsAvailableListener", th2);
                }
                break;
        }
    }
}
