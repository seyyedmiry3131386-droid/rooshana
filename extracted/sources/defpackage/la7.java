package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class la7 {
    public static final ka7 a;

    static {
        s46 s46VarH = yq2.H(50);
        a = new ka7(s46VarH, s46VarH, s46VarH, s46VarH);
    }

    public static final ka7 a(float f) {
        bu1 bu1Var = new bu1(f);
        return new ka7(bu1Var, bu1Var, bu1Var, bu1Var);
    }

    public static ka7 b(float f, float f2, float f3, int i) {
        if ((i & 2) != 0) {
            f2 = 0;
        }
        float f4 = 0;
        if ((i & 8) != 0) {
            f3 = 0;
        }
        return new ka7(new bu1(f), new bu1(f2), new bu1(f4), new bu1(f3));
    }
}
