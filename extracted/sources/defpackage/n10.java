package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n10 implements uq5 {
    public static final n10 a = new n10();
    public static final xa2 b = xa2.a("eventTimeMs");
    public static final xa2 c = xa2.a("eventCode");
    public static final xa2 d = xa2.a("eventUptimeMs");
    public static final xa2 e = xa2.a("sourceExtension");
    public static final xa2 f = xa2.a("sourceExtensionJsonProto3");
    public static final xa2 g = xa2.a("timezoneOffsetSeconds");
    public static final xa2 h = xa2.a("networkConnectionInfo");

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        vq5 vq5Var = (vq5) obj2;
        r20 r20Var = (r20) ((id4) obj);
        vq5Var.e(b, r20Var.a);
        vq5Var.a(c, r20Var.b);
        vq5Var.e(d, r20Var.c);
        vq5Var.a(e, r20Var.d);
        vq5Var.a(f, r20Var.e);
        vq5Var.e(g, r20Var.f);
        vq5Var.a(h, r20Var.g);
    }
}
