package com.microsoft.clarity.q;

import com.microsoft.clarity.g.h0;
import com.microsoft.clarity.i.C0093o;
import com.microsoft.clarity.models.LogLevel;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static /* synthetic */ void a(bp2 bp2Var, dp2 dp2Var, bp2 bp2Var2, int i) {
        if ((i & 4) != 0) {
            dp2Var = null;
        }
        if ((i & 8) != 0) {
            bp2Var2 = null;
        }
        a(bp2Var, false, dp2Var, bp2Var2);
    }

    public static boolean a(bp2 bp2Var, boolean z, dp2 dp2Var, bp2 bp2Var2) {
        js3.p(bp2Var, "logic");
        try {
            try {
                bp2Var.invoke();
                if (bp2Var2 == null) {
                    return true;
                }
                bp2Var2.invoke();
                return true;
            } catch (Exception e) {
                if (dp2Var != null) {
                    try {
                        dp2Var.invoke(e);
                    } catch (Exception e2) {
                        LogLevel logLevel = l.a;
                        String message = e2.getMessage();
                        if (l.a(LogLevel.Error)) {
                            l.a(message);
                        }
                    }
                }
                if (z) {
                    throw e;
                }
                if (bp2Var2 == null) {
                    return false;
                }
                bp2Var2.invoke();
                return false;
            }
        } catch (Throwable th) {
            if (bp2Var2 != null) {
                bp2Var2.invoke();
            }
            throw th;
        }
    }

    public static boolean a(bp2 bp2Var, dp2 dp2Var, C0093o c0093o, int i) {
        h0 h0Var = null;
        if ((i & 4) != 0) {
            dp2Var = null;
        }
        if ((i & 8) != 0) {
            c0093o = null;
        }
        js3.p(bp2Var, "logic");
        try {
            h0Var = com.microsoft.clarity.b.a.d;
        } catch (Exception unused) {
        }
        return ((Boolean) x.a("Clarity_UIThreadWork", h0Var, new f(bp2Var, false, dp2Var, c0093o))).booleanValue();
    }
}
