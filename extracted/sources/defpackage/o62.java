package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o62 {
    public final yo8 a;
    public final int[] b;

    public o62(int i, yo8 yo8Var, int[] iArr) {
        if (iArr.length == 0) {
            wn5.H("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = yo8Var;
        this.b = iArr;
    }
}
