package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m5 implements io.sentry.util.d, a5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b6 b;

    public /* synthetic */ m5(b6 b6Var, int i) {
        this.a = i;
        this.b = b6Var;
    }

    @Override // io.sentry.util.d
    public Object c() {
        switch (this.a) {
            case 0:
                return b6.b(this.b);
            case 1:
                b6 b6Var = this.b;
                b6Var.getClass();
                return new h2(b6Var);
            case 2:
                return b6.c(this.b);
            default:
                return Boolean.valueOf(io.sentry.hints.i.i(this.b, "androidx.core.view.ScrollingView"));
        }
    }

    @Override // io.sentry.a5
    public void d() {
        this.b.logger.i(SentryLevel.WARNING, "showForm() can only be called in Android.", new Object[0]);
    }

    public /* synthetic */ m5(io.sentry.hints.i iVar, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 4;
        this.b = sentryAndroidOptions;
    }
}
