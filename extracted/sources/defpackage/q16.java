package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class q16 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        kj8[] kj8VarArr = jj8.b;
        a = jj8.c;
    }

    public static final p16 a(p16 p16Var, int i, int i2, long j, di8 di8Var, w96 w96Var, z64 z64Var, int i3, int i4, xi8 xi8Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        di8 di8Var2 = di8Var;
        w96 w96Var2 = w96Var;
        z64 z64Var2 = z64Var;
        int i7 = i3;
        int i8 = i4;
        xi8 xi8Var2 = xi8Var;
        if (i5 == 0 || i5 == p16Var.a) {
            kj8[] kj8VarArr = jj8.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
                if (jj8.a(j3, p16Var.c)) {
                }
            }
            if ((di8Var2 == null || di8Var2.equals(p16Var.d)) && ((i6 == 0 || i6 == p16Var.b) && ((w96Var2 == null || w96Var2.equals(p16Var.e)) && ((z64Var2 == null || z64Var2.equals(p16Var.f)) && ((i7 == 0 || i7 == p16Var.g) && ((i8 == 0 || i8 == p16Var.h) && (xi8Var2 == null || xi8Var2.equals(p16Var.i)))))))) {
                return p16Var;
            }
        } else {
            j2 = 0;
        }
        kj8[] kj8VarArr2 = jj8.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = p16Var.c;
        }
        if (di8Var2 == null) {
            di8Var2 = p16Var.d;
        }
        if (i5 == 0) {
            i5 = p16Var.a;
        }
        if (i6 == 0) {
            i6 = p16Var.b;
        }
        w96 w96Var3 = p16Var.e;
        if (w96Var3 != null && w96Var2 == null) {
            w96Var2 = w96Var3;
        }
        if (z64Var2 == null) {
            z64Var2 = p16Var.f;
        }
        if (i7 == 0) {
            i7 = p16Var.g;
        }
        if (i8 == 0) {
            i8 = p16Var.h;
        }
        if (xi8Var2 == null) {
            xi8Var2 = p16Var.i;
        }
        return new p16(i5, i6, j3, di8Var2, w96Var2, z64Var2, i7, i8, xi8Var2);
    }
}
