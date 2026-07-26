package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.bl4;
import io.sentry.SentryLevel;
import io.sentry.j3;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends FileObserver {
    public final String a;
    public final j3 b;
    public final io.sentry.u0 c;
    public final long d;

    public p0(String str, j3 j3Var, io.sentry.u0 u0Var, long j) {
        super(str);
        this.a = str;
        this.b = j3Var;
        io.sentry.config.a.W(u0Var, "Logger is required.");
        this.c = u0Var;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        String str2 = this.a;
        Object[] objArr = {Integer.valueOf(i), str2, str};
        io.sentry.u0 u0Var = this.c;
        u0Var.i(sentryLevel, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", objArr);
        io.sentry.h0 h0VarO = io.sentry.config.a.o(new o0(this.d, u0Var));
        StringBuilder sbC = bl4.C(str2);
        sbC.append(File.separator);
        sbC.append(str);
        String string = sbC.toString();
        j3 j3Var = this.b;
        j3Var.getClass();
        io.sentry.config.a.W(string, "Path is required.");
        j3Var.b(new File(string), h0VarO);
    }
}
