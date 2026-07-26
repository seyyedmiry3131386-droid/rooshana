package io.sentry.okhttp;

import defpackage.b57;
import defpackage.by2;
import defpackage.dp2;
import defpackage.g77;
import defpackage.j77;
import defpackage.js3;
import defpackage.tx8;
import defpackage.w47;
import io.sentry.c1;
import io.sentry.exception.ExceptionMechanismException;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.h0;
import io.sentry.k;
import io.sentry.protocol.n;
import io.sentry.protocol.q;
import io.sentry.protocol.r;
import io.sentry.w4;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {
    public static void a(c1 c1Var, w47 w47Var, g77 g77Var) {
        js3.p(c1Var, "scopes");
        js3.p(w47Var, "request");
        by2 by2Var = w47Var.c;
        js3.p(g77Var, "response");
        by2 by2Var2 = g77Var.f;
        k kVarR = io.sentry.config.a.R(w47Var.a.i);
        n nVar = new n();
        nVar.a = "SentryOkHttpInterceptor";
        StringBuilder sb = new StringBuilder("HTTP Client Error with status code: ");
        int i = g77Var.d;
        sb.append(i);
        w4 w4Var = new w4(new ExceptionMechanismException(nVar, new SentryHttpClientException(sb.toString()), Thread.currentThread(), true));
        h0 h0Var = new h0();
        h0Var.d(w47Var, "okHttp:request");
        h0Var.d(g77Var, "okHttp:response");
        final q qVar = new q();
        qVar.a = (String) kVarR.b;
        qVar.c = (String) kVarR.c;
        qVar.j = (String) kVarR.d;
        qVar.e = c1Var.m().isSendDefaultPii() ? by2Var.a("Cookie") : null;
        qVar.b = w47Var.b;
        qVar.f = io.sentry.config.a.Q(b(c1Var, by2Var));
        b57 b57Var = w47Var.d;
        Long lValueOf = b57Var != null ? Long.valueOf(b57Var.a()) : null;
        dp2 dp2Var = new dp2() { // from class: io.sentry.okhttp.SentryOkHttpUtils$captureClientError$sentryRequest$1$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                long jLongValue = ((Number) obj).longValue();
                qVar.h = Long.valueOf(jLongValue);
                return tx8.a;
            }
        };
        if (lValueOf != null && lValueOf.longValue() != -1) {
            dp2Var.invoke(lValueOf);
        }
        final r rVar = new r();
        rVar.a = c1Var.m().isSendDefaultPii() ? by2Var2.a("Set-Cookie") : null;
        rVar.b = io.sentry.config.a.Q(b(c1Var, by2Var2));
        rVar.c = Integer.valueOf(i);
        j77 j77Var = g77Var.g;
        Long lValueOf2 = j77Var != null ? Long.valueOf(j77Var.d()) : null;
        dp2 dp2Var2 = new dp2() { // from class: io.sentry.okhttp.SentryOkHttpUtils$captureClientError$sentryResponse$1$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                long jLongValue = ((Number) obj).longValue();
                rVar.d = Long.valueOf(jLongValue);
                return tx8.a;
            }
        };
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            dp2Var2.invoke(lValueOf2);
        }
        w4Var.d = qVar;
        w4Var.b.s(rVar);
        c1Var.C(w4Var, h0Var);
    }

    public static LinkedHashMap b(c1 c1Var, by2 by2Var) {
        if (!c1Var.m().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = by2Var.size();
        for (int i = 0; i < size; i++) {
            String strC = by2Var.c(i);
            if (!io.sentry.util.a.a.contains(strC.toUpperCase(Locale.ROOT))) {
                linkedHashMap.put(strC, by2Var.f(i));
            }
        }
        return linkedHashMap;
    }
}
