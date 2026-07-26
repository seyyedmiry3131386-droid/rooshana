package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nq3 {
    public static final xa5 a = new xa5(0);

    public static final xa5 a(int... iArr) {
        xa5 xa5Var = new xa5(iArr.length);
        int i = xa5Var.b;
        if (i < 0) {
            lb7.k("");
            throw null;
        }
        if (iArr.length == 0) {
            return xa5Var;
        }
        xa5Var.b(iArr.length + i);
        int[] iArr2 = xa5Var.a;
        int i2 = xa5Var.b;
        if (i != i2) {
            ew.x0(iArr.length + i, i, i2, iArr2, iArr2);
        }
        ew.B0(i, 0, 12, iArr, iArr2);
        xa5Var.b += iArr.length;
        return xa5Var;
    }
}
