package io.sentry.android.core;

import android.content.BroadcastReceiver;
import defpackage.fv1;

/* JADX INFO: loaded from: classes3.dex */
public final class u1 extends BroadcastReceiver {
    public final io.sentry.c1 a;
    public final SentryAndroidOptions b;
    public final fv1 c = new fv1(0, 60000);
    public final char[] d = new char[64];
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration e;

    public u1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.c1 c1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.e = systemEventsBreadcrumbsIntegration;
        this.a = c1Var;
        this.b = sentryAndroidOptions;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
    
        r2 = r13;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r13, android.content.Intent r14) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.core.u1.onReceive(android.content.Context, android.content.Intent):void");
    }
}
