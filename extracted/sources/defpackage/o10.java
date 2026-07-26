package defpackage;

import com.google.android.datatransport.cct.internal.QosTier;

/* JADX INFO: loaded from: classes.dex */
public final class o10 implements uq5 {
    public static final o10 a = new o10();
    public static final xa2 b = xa2.a("requestTimeMs");
    public static final xa2 c = xa2.a("requestUptimeMs");
    public static final xa2 d = xa2.a("clientInfo");
    public static final xa2 e = xa2.a("logSource");
    public static final xa2 f = xa2.a("logSourceName");
    public static final xa2 g = xa2.a("logEvent");
    public static final xa2 h = xa2.a("qosTier");

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        vq5 vq5Var = (vq5) obj2;
        s20 s20Var = (s20) ((kd4) obj);
        vq5Var.e(b, s20Var.a);
        vq5Var.e(c, s20Var.b);
        vq5Var.a(d, s20Var.c);
        vq5Var.a(e, s20Var.d);
        vq5Var.a(f, s20Var.e);
        vq5Var.a(g, s20Var.f);
        vq5Var.a(h, QosTier.a);
    }
}
