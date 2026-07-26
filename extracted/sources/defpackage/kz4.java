package defpackage;

import androidx.collection.c;

/* JADX INFO: loaded from: classes.dex */
public final class kz4 {
    public final cz7 a;

    public kz4(cz7 cz7Var) {
        this.a = cz7Var;
    }

    public static final void a(fz7 fz7Var, int i) {
        while (fz7Var.v >= 0 && fz7Var.u <= i) {
            fz7Var.O();
            fz7Var.j();
        }
    }

    public final rb5 b(ou ouVar, c cVar) {
        cz7 cz7Var;
        int i;
        Object[] objArr = cVar.a;
        int i2 = cVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            cz7Var = this.a;
            if (i4 >= i2) {
                break;
            }
            if (cz7Var.f(((lz4) objArr[i4]).e)) {
                i4++;
            } else {
                mb5 mb5Var = new mb5();
                Object[] objArr2 = cVar.a;
                int i5 = cVar.b;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object obj = objArr2[i6];
                    if (cz7Var.f(((lz4) obj).e)) {
                        mb5Var.g(obj);
                    }
                }
                cVar = mb5Var;
            }
        }
        m22 m22Var = new m22(22, this);
        int i7 = 1;
        if (cVar.b > 1) {
            Comparable comparable = (Comparable) m22Var.invoke(cVar.b(0));
            int i8 = cVar.b;
            int i9 = 1;
            while (true) {
                if (i9 >= i8) {
                    break;
                }
                Comparable comparable2 = (Comparable) m22Var.invoke(cVar.b(i9));
                if (comparable.compareTo(comparable2) > 0) {
                    mb5 mb5Var2 = new mb5(cVar.b);
                    Object[] objArr3 = cVar.a;
                    int i10 = cVar.b;
                    for (int i11 = 0; i11 < i10; i11++) {
                        mb5Var2.g(objArr3[i11]);
                    }
                    kb5 kb5Var = mb5Var2.c;
                    if (kb5Var == null) {
                        kb5Var = new kb5(i3, mb5Var2);
                        mb5Var2.c = kb5Var;
                    }
                    if (((mb5) kb5Var.b).b > 1) {
                        yu0.Y(kb5Var, new rt1(i7, m22Var));
                    }
                    cVar = mb5Var2;
                } else {
                    i9++;
                    comparable = comparable2;
                }
            }
        }
        if (cVar.d()) {
            rb5 rb5Var = ce7.b;
            js3.n(rb5Var, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
            return rb5Var;
        }
        long[] jArr = ce7.a;
        rb5 rb5Var2 = new rb5();
        fz7 fz7VarE = cz7Var.e();
        try {
            Object[] objArr4 = cVar.a;
            int i12 = cVar.b;
            for (int i13 = 0; i13 < i12; i13++) {
                lz4 lz4Var = (lz4) objArr4[i13];
                int iC = fz7VarE.c(lz4Var.e);
                int iG = fz7VarE.G(fz7VarE.b, iC);
                a(fz7VarE, iG);
                a(fz7VarE, iG);
                while (true) {
                    i = fz7VarE.t;
                    if (i == iG || i == fz7VarE.u) {
                        break;
                    }
                    if (iG < fz7VarE.u(i) + i) {
                        fz7VarE.R();
                    } else {
                        fz7VarE.N();
                    }
                }
                if (i != iG) {
                    sz0.a("Unexpected slot table structure");
                }
                fz7VarE.R();
                fz7VarE.a(iC - fz7VarE.t);
                rb5Var2.m(lz4Var, sz0.c(lz4Var.c, lz4Var, fz7VarE, ouVar));
            }
            a(fz7VarE, Integer.MAX_VALUE);
            fz7VarE.e(true);
            return rb5Var2;
        } catch (Throwable th) {
            fz7VarE.e(false);
            throw th;
        }
    }
}
