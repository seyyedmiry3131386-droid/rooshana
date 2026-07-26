package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bs3 {
    public final int a;
    public final int b;
    public final pa2 c;

    public bs3(int i, int i2, pa2 pa2Var) {
        this.a = i;
        this.b = i2;
        this.c = pa2Var;
        if (i < 0) {
            un3.a("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        un3.a("size should be > 0");
    }
}
