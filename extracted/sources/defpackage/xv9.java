package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv9 implements wv9 {
    public static final or9 a;
    public static final or9 b;
    public static final or9 c;
    public static final or9 d;
    public static final or9 e;
    public static final or9 f;

    static {
        xe1 xe1Var = new xe1(nr9.a(), true, true);
        a = xe1Var.C("measurement.test.boolean_flag", false);
        b = xe1Var.A(-1L, "measurement.test.cached_long_flag");
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = or9.g;
        c = new or9(xe1Var, "measurement.test.double_flag", dValueOf, 2);
        d = xe1Var.A(-2L, "measurement.test.int_flag");
        e = xe1Var.A(-1L, "measurement.test.long_flag");
        f = xe1Var.D("measurement.test.string_flag", "---");
    }
}
