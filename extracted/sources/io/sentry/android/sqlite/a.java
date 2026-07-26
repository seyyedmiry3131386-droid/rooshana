package io.sentry.android.sqlite;

import android.database.CrossProcessCursor;
import defpackage.bp2;
import defpackage.js3;
import io.sentry.Instrumenter;
import io.sentry.SpanStatus;
import io.sentry.c1;
import io.sentry.c4;
import io.sentry.e5;
import io.sentry.k1;
import io.sentry.k6;
import io.sentry.n4;
import io.sentry.t;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final c1 a;
    public final String b;
    public final t c;

    public a(String str) {
        c4 c4Var = c4.a;
        this.a = c4Var;
        this.b = str;
        this.c = new t(c4Var.m(), 2);
        e5.d().a("SQLite");
    }

    public final Object a(String str, bp2 bp2Var) {
        k1 k1VarM;
        t tVar;
        Object obj;
        k6 k6VarX;
        t tVar2 = this.c;
        String str2 = this.b;
        js3.p(str, "sql");
        c1 c1Var = this.a;
        n4 n4VarA = c1Var.m().getDateProvider().a();
        try {
            Object objInvoke = bp2Var.invoke();
            if (objInvoke instanceof CrossProcessCursor) {
                return new b((CrossProcessCursor) objInvoke, this, str);
            }
            k1 k1VarD = c1Var.d();
            if (k1VarD != null) {
                obj = objInvoke;
                k1VarM = k1VarD.m("db.sql.query", str, n4VarA, Instrumenter.SENTRY);
            } else {
                obj = objInvoke;
                k1VarM = null;
            }
            if (k1VarM != null) {
                try {
                    k6VarX = k1VarM.x();
                } catch (Throwable th) {
                    th = th;
                    try {
                        k1 k1VarD2 = c1Var.d();
                        if (k1VarD2 != null) {
                            tVar = tVar2;
                            try {
                                k1VarM = k1VarD2.m("db.sql.query", str, n4VarA, Instrumenter.SENTRY);
                            } catch (Throwable th2) {
                                th = th2;
                                if (k1VarM != null) {
                                    boolean zC = c1Var.m().getThreadChecker().c();
                                    k1VarM.p(Boolean.valueOf(zC), "blocked_main_thread");
                                    if (zC) {
                                        k1VarM.p(tVar.b(), "call_stack");
                                    }
                                    if (str2 != null) {
                                        k1VarM.p("sqlite", "db.system");
                                        k1VarM.p(str2, "db.name");
                                    } else {
                                        k1VarM.p("in-memory", "db.system");
                                    }
                                    k1VarM.n();
                                }
                                throw th;
                            }
                        } else {
                            tVar = tVar2;
                            k1VarM = null;
                        }
                        k6 k6VarX2 = k1VarM != null ? k1VarM.x() : null;
                        if (k6VarX2 != null) {
                            k6VarX2.i = "auto.db.sqlite";
                        }
                        if (k1VarM != null) {
                            k1VarM.a(SpanStatus.INTERNAL_ERROR);
                        }
                        if (k1VarM != null) {
                            k1VarM.i(th);
                        }
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        tVar = tVar2;
                    }
                }
            } else {
                k6VarX = null;
            }
            if (k6VarX != null) {
                k6VarX.i = "auto.db.sqlite";
            }
            if (k1VarM != null) {
                k1VarM.a(SpanStatus.OK);
            }
            if (k1VarM != null) {
                boolean zC2 = c1Var.m().getThreadChecker().c();
                k1VarM.p(Boolean.valueOf(zC2), "blocked_main_thread");
                if (zC2) {
                    k1VarM.p(tVar2.b(), "call_stack");
                }
                if (str2 != null) {
                    k1VarM.p("sqlite", "db.system");
                    k1VarM.p(str2, "db.name");
                } else {
                    k1VarM.p("in-memory", "db.system");
                }
                k1VarM.n();
            }
            return obj;
        } catch (Throwable th4) {
            th = th4;
            k1VarM = null;
        }
    }
}
