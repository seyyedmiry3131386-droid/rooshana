package defpackage;

import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class cs5 extends at2 implements pz3 {
    public final gs5 D = ((hs5) ((lf7) at2.getKoin().c.e).b(g27.a(hs5.class), null, new a88("BASE_OK_HTTP"))).a();

    public static void o0(Map map, rb4 rb4Var) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                rb4Var.j((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    @Override // defpackage.at2
    public final aj0 X(x47 x47Var, Map map) {
        a57 a57VarM;
        dt4 dt4VarA;
        int i = x47Var.k.a;
        rb4 rb4Var = new rb4(15);
        String str = x47Var.c;
        js3.o(str, "getUrl(...)");
        rb4Var.P(str);
        o0(x47Var.i(), rb4Var);
        o0(map, rb4Var);
        byte[] bArrF = x47Var.f();
        if (bArrF != null) {
            int i2 = b57.a;
            Regex regex = dt4.e;
            String strG = x47Var.g();
            js3.o(strG, "getBodyContentType(...)");
            try {
                dt4VarA = ok4.A(strG);
            } catch (IllegalArgumentException unused) {
                dt4VarA = null;
            }
            a57VarM = ol3.m(bArrF, dt4VarA, 0, 6);
        } else {
            a57VarM = null;
        }
        int i3 = x47Var.b;
        if (i3 == 0) {
            rb4Var.F("GET", null);
        } else if (i3 == 1) {
            lw.d("request body must not be null", null, a57VarM);
            if (a57VarM != null) {
                rb4Var.F("POST", a57VarM);
            }
        } else if (i3 == 2) {
            lw.d("request body must not be null", null, a57VarM);
            if (a57VarM != null) {
                rb4Var.F("PUT", a57VarM);
            }
        } else {
            if (i3 != 3) {
                throw new IllegalStateException("Unknown method type.");
            }
            rb4Var.F("DELETE", a57VarM);
        }
        long j = i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gs5 gs5Var = this.D;
        gs5Var.getClass();
        js3.p(timeUnit, "unit");
        gs5Var.y = ih9.b(j, timeUnit);
        gs5Var.z = ih9.b(j, timeUnit);
        gs5Var.A = ih9.b(j, timeUnit);
        g77 g77VarD = new hs5(gs5Var).b(new w47(rb4Var)).d();
        int i4 = g77VarD.d;
        j77 j77Var = g77VarD.g;
        InputStream inputStreamN1 = j77Var.d1().n1();
        int iD = (int) j77Var.d();
        by2 by2Var = g77VarD.f;
        ListBuilder listBuilderS = br9.s();
        Iterator it = by2Var.iterator();
        while (true) {
            w0 w0Var = (w0) it;
            if (!w0Var.hasNext()) {
                return new aj0(i4, iD, 4, br9.q(listBuilderS), inputStreamN1);
            }
            Pair pair = (Pair) w0Var.next();
            listBuilderS.add(new qx2((String) pair.a, (String) pair.b));
        }
    }

    @Override // defpackage.pz3
    public final /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }
}
