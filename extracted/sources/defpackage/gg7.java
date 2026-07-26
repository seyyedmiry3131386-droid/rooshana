package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class gg7 {
    public final bp2 a;
    public final bp2 b;

    public gg7(bp2 bp2Var, bp2 bp2Var2) {
        this.a = bp2Var;
        this.b = bp2Var2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.a.invoke()).floatValue() + ", maxValue=" + ((Number) this.b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
