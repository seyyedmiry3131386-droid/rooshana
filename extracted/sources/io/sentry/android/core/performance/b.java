package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.Instrumenter;
import io.sentry.k1;
import io.sentry.n4;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final String a;
    public n4 b = null;
    public n4 c = null;
    public k1 d = null;
    public k1 e = null;

    public b(String str) {
        this.a = str;
    }

    public static k1 a(k1 k1Var, String str, n4 n4Var) {
        k1 k1VarM = k1Var.m("activity.load", str, n4Var, Instrumenter.SENTRY);
        k1VarM.p(Long.valueOf(io.sentry.android.core.internal.util.f.d(Looper.getMainLooper().getThread())), "thread.id");
        k1VarM.p("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        k1VarM.p(bool, "ui.contributes_to_ttid");
        k1VarM.p(bool, "ui.contributes_to_ttfd");
        return k1VarM;
    }
}
