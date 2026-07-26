package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ty2 {
    public static final ty2 d;
    public final boolean a;
    public final ry2 b;
    public final sy2 c;

    static {
        ry2 ry2Var = ry2.a;
        sy2 sy2Var = sy2.b;
        d = new ty2(false, ry2Var, sy2Var);
        new ty2(true, ry2Var, sy2Var);
    }

    public ty2(boolean z, ry2 ry2Var, sy2 sy2Var) {
        js3.p(ry2Var, "bytes");
        js3.p(sy2Var, "number");
        this.a = z;
        this.b = ry2Var;
        this.c = sy2Var;
    }

    public final String toString() {
        StringBuilder sbC = bl4.C("HexFormat(\n    upperCase = ");
        sbC.append(this.a);
        sbC.append(",\n    bytes = BytesHexFormat(\n");
        this.b.a(sbC, "        ");
        sbC.append('\n');
        sbC.append("    ),");
        sbC.append('\n');
        sbC.append("    number = NumberHexFormat(");
        sbC.append('\n');
        this.c.a(sbC, "        ");
        sbC.append('\n');
        sbC.append("    )");
        sbC.append('\n');
        sbC.append(")");
        return sbC.toString();
    }
}
