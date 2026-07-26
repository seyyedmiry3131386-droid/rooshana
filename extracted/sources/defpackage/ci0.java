package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ci0 {
    public static final wy5 a;
    public static final float b;
    public static final float c;

    static {
        float f = z90.a;
        float f2 = z90.b;
        float f3 = 16;
        float f4 = hi0.a;
        float f5 = 8;
        a = new wy5(f, f5, f2, f5);
        yh0.e(f3, f5, f2, f5);
        float f6 = 12;
        yh0.e(f6, f5, f6, f5);
        yh0.e(f6, f5, f3, f5);
        b = 58;
        c = hi0.a;
    }

    public static bi0 a(long j, long j2, long j3, long j4, qz0 qz0Var, int i) {
        return b((lv0) qz0Var.j(mv0.a)).a(j, j2, (i & 4) != 0 ? zu0.h : j3, (i & 8) != 0 ? zu0.h : j4);
    }

    public static bi0 b(lv0 lv0Var) {
        bi0 bi0Var = lv0Var.W;
        if (bi0Var != null) {
            return bi0Var;
        }
        bi0 bi0Var2 = new bi0(mv0.c(lv0Var, hc2.a), mv0.c(lv0Var, hc2.j), zu0.b(hc2.e, mv0.c(lv0Var, hc2.c)), zu0.b(hc2.g, mv0.c(lv0Var, hc2.f)));
        lv0Var.W = bi0Var2;
        return bi0Var2;
    }
}
