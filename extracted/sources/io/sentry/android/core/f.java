package io.sentry.android.core;

import android.content.Context;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.g4;
import io.sentry.x3;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements x3, g4 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // io.sentry.x3
    public void c(io.sentry.m1 m1Var) {
        ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) this.a;
        io.sentry.a1 a1Var = (io.sentry.a1) this.b;
        io.sentry.m1 m1Var2 = (io.sentry.m1) this.c;
        if (m1Var == null) {
            a1Var.J(m1Var2);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().i(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", m1Var2.getName());
        }
    }

    @Override // io.sentry.g4
    public void d(b6 b6Var) {
        f1.a((t) this.a, (Context) this.b, (g4) this.c, (SentryAndroidOptions) b6Var);
    }
}
