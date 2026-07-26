package io.sentry.okhttp;

import defpackage.dp2;
import defpackage.g77;
import defpackage.js3;
import defpackage.se3;
import defpackage.w47;
import io.sentry.c4;
import io.sentry.f;
import io.sentry.h0;
import io.sentry.h4;
import io.sentry.k;
import io.sentry.k1;
import io.sentry.k6;
import io.sentry.n4;
import io.sentry.util.h;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final w47 a;
    public final ConcurrentHashMap b;
    public final f c;
    public final k1 d;
    public g77 e;
    public g77 f;
    public io.sentry.util.network.c g;
    public final AtomicBoolean h;
    public String i;
    public String j;

    public a(w47 w47Var) {
        js3.p(w47Var, "request");
        this.a = w47Var;
        this.b = new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        String str = (String) io.sentry.config.a.R(w47Var.a.i).b;
        this.i = str == null ? "unknown" : str;
        this.j = w47Var.b;
        k1 k1VarO = h.a ? h4.b().o() : h4.b().d();
        k1 k1VarU = k1VarO != null ? k1VarO.u("http.client") : null;
        this.d = k1VarU;
        k6 k6VarX = k1VarU != null ? k1VarU.x() : null;
        if (k6VarX != null) {
            k6VarX.i = "auto.http.okhttp";
        }
        f fVar = new f();
        fVar.e = "http";
        fVar.g = "http";
        fVar.c(Long.valueOf(System.currentTimeMillis()), "http.start_timestamp");
        this.c = fVar;
        d(w47Var);
    }

    public final void a(dp2 dp2Var) {
        if (this.h.getAndSet(true)) {
            return;
        }
        this.b.clear();
        h0 h0Var = new h0();
        h0Var.d(this.a, "okHttp:request");
        g77 g77Var = this.e;
        if (g77Var != null) {
            h0Var.d(g77Var, "okHttp:response");
        }
        io.sentry.util.network.c cVar = this.g;
        if (cVar != null) {
            h0Var.d(cVar, "sentry:replayNetworkDetails");
        }
        Long lValueOf = Long.valueOf(System.currentTimeMillis());
        f fVar = this.c;
        fVar.c(lValueOf, "http.end_timestamp");
        c4 c4Var = c4.a;
        c4Var.h(fVar, h0Var);
        k1 k1Var = this.d;
        if (k1Var != null && dp2Var != null) {
            ((SentryOkHttpEventListener$callFailed$1) dp2Var).invoke(k1Var);
        }
        g77 g77Var2 = this.f;
        if (g77Var2 != null) {
            d.a(c4Var, g77Var2.a, g77Var2);
        }
        if (k1Var != null) {
            k1Var.n();
        }
    }

    public final void b(String str, dp2 dp2Var) {
        k1 k1Var;
        n4 n4Var = (n4) this.b.remove(str);
        if (n4Var == null || (k1Var = this.d) == null) {
            return;
        }
        if (dp2Var != null) {
            dp2Var.invoke(k1Var);
        }
        k1Var.p(Long.valueOf(TimeUnit.NANOSECONDS.toMillis(h4.b().m().getDateProvider().a().b(n4Var))), str);
    }

    public final void c(String str) {
        if (str != null) {
            this.c.c(str, "error_message");
            k1 k1Var = this.d;
            if (k1Var != null) {
                k1Var.p(str, "error_message");
            }
        }
    }

    public final void d(w47 w47Var) {
        js3.p(w47Var, "request");
        se3 se3Var = w47Var.a;
        k kVarR = io.sentry.config.a.R(se3Var.i);
        String str = (String) kVarR.d;
        String str2 = (String) kVarR.c;
        String str3 = (String) kVarR.b;
        this.i = str3 == null ? "unknown" : str3;
        String str4 = se3Var.d;
        String strB = se3Var.b();
        this.j = w47Var.b;
        k1 k1Var = this.d;
        if (k1Var != null) {
            k1Var.s(this.j + ' ' + this.i);
        }
        if (k1Var != null) {
            if (str2 != null) {
                k1Var.p(str2, "http.query");
            }
            if (str != null) {
                k1Var.p(str, "http.fragment");
            }
        }
        f fVar = this.c;
        fVar.c(str4, "host");
        fVar.c(strB, "path");
        if (str3 != null) {
            fVar.c(str3, "url");
        }
        String str5 = this.j;
        Locale locale = Locale.ROOT;
        String upperCase = str5.toUpperCase(locale);
        js3.o(upperCase, "toUpperCase(...)");
        fVar.c(upperCase, "method");
        if (str2 != null) {
            fVar.c(str2, "http.query");
        }
        if (str != null) {
            fVar.c(str, "http.fragment");
        }
        if (k1Var != null) {
            k1Var.p(this.i, "url");
        }
        if (k1Var != null) {
            k1Var.p(str4, "host");
        }
        if (k1Var != null) {
            k1Var.p(strB, "path");
        }
        if (k1Var != null) {
            String upperCase2 = this.j.toUpperCase(locale);
            js3.o(upperCase2, "toUpperCase(...)");
            k1Var.p(upperCase2, "http.request.method");
        }
    }

    public final void onEventStart(String str) {
        js3.p(str, "event");
        if (this.d == null) {
            return;
        }
        n4 n4VarA = h4.b().m().getDateProvider().a();
        js3.o(n4VarA, "now(...)");
        this.b.put(str, n4VarA);
    }
}
