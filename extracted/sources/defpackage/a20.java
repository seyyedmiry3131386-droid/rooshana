package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements uq5 {
    public static final a20 a = new a20();
    public static final xa2 b = new xa2(t61.p(t61.o(fn6.class, new xx(1))), "currentCacheSizeBytes");
    public static final xa2 c = new xa2(t61.p(t61.o(fn6.class, new xx(2))), "maxCacheSizeBytes");

    @Override // defpackage.p12
    public final void a(Object obj, Object obj2) {
        g68 g68Var = (g68) obj;
        vq5 vq5Var = (vq5) obj2;
        vq5Var.e(b, g68Var.a);
        vq5Var.e(c, g68Var.b);
    }
}
