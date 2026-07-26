package io.sentry.okhttp;

import defpackage.b57;
import defpackage.br9;
import defpackage.by2;
import defpackage.dp2;
import defpackage.dt4;
import defpackage.g77;
import defpackage.hr3;
import defpackage.j77;
import defpackage.js3;
import defpackage.tx8;
import defpackage.w47;
import defpackage.zp0;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.c1;
import io.sentry.c4;
import io.sentry.e5;
import io.sentry.f;
import io.sentry.h0;
import io.sentry.k;
import io.sentry.l0;
import io.sentry.u0;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements hr3 {
    public final c1 a;
    public final boolean b;
    public final List c;
    public final List d;

    static {
        e5.d().b("maven:io.sentry:sentry-okhttp", "8.43.1");
    }

    public c(int i) {
        boolean z = (i & 4) != 0;
        List listB = br9.B(new l0(500, 599));
        List listB2 = br9.B(b6.DEFAULT_PROPAGATION_TARGETS);
        this.a = c4.a;
        this.b = z;
        this.c = listB;
        this.d = listB2;
        io.sentry.config.a.a("OkHttp");
    }

    public static io.sentry.internal.debugmeta.c b(c cVar, g77 g77Var) throws Throwable {
        Charset charsetA;
        js3.p(g77Var, "resp");
        u0 logger = cVar.a.m().getLogger();
        js3.o(logger, "getLogger(...)");
        j77 j77Var = g77Var.g;
        if (j77Var != null) {
            try {
                dt4 dt4VarG = j77Var.g();
                String str = dt4VarG != null ? dt4VarG.a : null;
                byte[] bArrB = g77Var.g(((long) 153600) + 1).b();
                String strName = (dt4VarG == null || (charsetA = dt4VarG.a(zp0.a)) == null) ? null : charsetA.name();
                if (strName == null) {
                    strName = "UTF-8";
                }
                return io.sentry.config.a.v(bArrB, str, strName, logger);
            } catch (Exception e) {
                logger.i(SentryLevel.ERROR, "Failed to read http response body for Network Details: " + e.getMessage(), new Object[0]);
            }
        }
        return null;
    }

    public static LinkedHashMap e(by2 by2Var) {
        js3.p(by2Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = by2Var.size();
        for (int i = 0; i < size; i++) {
            String strC = by2Var.c(i);
            String strF = by2Var.f(i);
            String str = (String) linkedHashMap.get(strC);
            if (str != null) {
                linkedHashMap.put(strC, str + "; " + strF);
            } else {
                linkedHashMap.put(strC, strF);
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0293 A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #6 {all -> 0x01cf, blocks: (B:84:0x01c9, B:97:0x01ed, B:98:0x01f0, B:131:0x0293, B:132:0x029b), top: B:158:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fa A[EDGE_INSN: B:166:0x00fa->B:58:0x00fa BREAK  A[LOOP:0: B:41:0x00c0->B:167:0x00c0], PHI: r10
      0x00fa: PHI (r10v11 ??) = (r10v15 ??), (r10v1 ??), (r10v16 ??) binds: [B:48:0x00d7, B:170:0x00fa, B:166:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8, types: [g77] */
    /* JADX WARN: Type inference failed for: r17v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r23v0, types: [io.sentry.okhttp.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14, types: [g77] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g77] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v6, types: [g77] */
    /* JADX WARN: Type inference failed for: r4v7, types: [g77] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v8, types: [io.sentry.k1] */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.hr3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.g77 a(defpackage.cw6 r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.okhttp.c.a(cw6):g77");
    }

    public final void c(w47 w47Var, Integer num, g77 g77Var, long j, io.sentry.util.network.c cVar) {
        j77 j77Var;
        SentryLevel sentryLevel;
        String str = w47Var.a.i;
        String str2 = w47Var.b;
        final f fVar = new f();
        k kVarR = io.sentry.config.a.R(str);
        fVar.e = "http";
        fVar.g = "http";
        String str3 = (String) kVarR.b;
        if (str3 != null) {
            fVar.c(str3, "url");
        }
        fVar.c(str2.toUpperCase(Locale.ROOT), "method");
        String str4 = (String) kVarR.c;
        if (str4 != null) {
            fVar.c(str4, "http.query");
        }
        String str5 = (String) kVarR.d;
        if (str5 != null) {
            fVar.c(str5, "http.fragment");
        }
        Long lValueOf = null;
        if (num != null) {
            fVar.c(num, "status_code");
            int iIntValue = num.intValue();
            l0 l0Var = io.sentry.util.a.b;
            if (iIntValue < l0Var.a || iIntValue > l0Var.b) {
                int iIntValue2 = num.intValue();
                l0 l0Var2 = io.sentry.util.a.c;
                sentryLevel = (iIntValue2 < l0Var2.a || iIntValue2 > l0Var2.b) ? null : SentryLevel.ERROR;
            } else {
                sentryLevel = SentryLevel.WARNING;
            }
            fVar.i = sentryLevel;
        }
        b57 b57Var = w47Var.d;
        Long lValueOf2 = b57Var != null ? Long.valueOf(b57Var.a()) : null;
        dp2 dp2Var = new dp2() { // from class: io.sentry.okhttp.SentryOkHttpInterceptor$sendBreadcrumb$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                fVar.c(Long.valueOf(((Number) obj).longValue()), "http.request_content_length");
                return tx8.a;
            }
        };
        if (lValueOf2 != null && lValueOf2.longValue() != -1) {
            dp2Var.invoke(lValueOf2);
        }
        if (g77Var != null && (j77Var = g77Var.g) != null) {
            lValueOf = Long.valueOf(j77Var.d());
        }
        dp2 dp2Var2 = new dp2() { // from class: io.sentry.okhttp.SentryOkHttpInterceptor$sendBreadcrumb$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                fVar.c(Long.valueOf(((Number) obj).longValue()), "http.response_content_length");
                return tx8.a;
            }
        };
        if (lValueOf != null && lValueOf.longValue() != -1) {
            dp2Var2.invoke(lValueOf);
        }
        h0 h0Var = new h0();
        h0Var.d(w47Var, "okHttp:request");
        if (g77Var != null) {
            h0Var.d(g77Var, "okHttp:response");
        }
        if (cVar != null) {
            h0Var.d(cVar, "sentry:replayNetworkDetails");
        }
        fVar.c(Long.valueOf(j), "http.start_timestamp");
        fVar.c(Long.valueOf(System.currentTimeMillis()), "http.end_timestamp");
        this.a.h(fVar, h0Var);
    }

    public final boolean d(w47 w47Var, g77 g77Var) {
        int i = g77Var.d;
        if (!this.b) {
            return false;
        }
        for (l0 l0Var : this.c) {
            if (i >= l0Var.a && i <= l0Var.b) {
                if (io.sentry.config.a.f(w47Var.a.i, this.d)) {
                    return (i == 504 && w47Var.a().j) ? false : true;
                }
                return false;
            }
        }
        return false;
    }
}
