package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final class x24 {
    public final bd7 a;
    public final v8 b;
    public final rb5 c;

    public x24(bd7 bd7Var, v8 v8Var) {
        this.a = bd7Var;
        this.b = v8Var;
        long[] jArr = ce7.a;
        this.c = new rb5();
    }

    public final qp2 a(int i, Object obj, Object obj2) {
        rb5 rb5Var = this.c;
        w24 w24Var = (w24) rb5Var.g(obj);
        if (w24Var != null && w24Var.c == i && js3.i(w24Var.b, obj2)) {
            a aVar = w24Var.d;
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a(818252804, new iz(w24Var.e, w24Var, 9), true);
            w24Var.d = aVar2;
            return aVar2;
        }
        w24 w24Var2 = new w24(this, i, obj, obj2);
        rb5Var.m(obj, w24Var2);
        a aVar3 = w24Var2.d;
        if (aVar3 != null) {
            return aVar3;
        }
        a aVar4 = new a(818252804, new iz(this, w24Var2, 9), true);
        w24Var2.d = aVar4;
        return aVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        w24 w24Var = (w24) this.c.g(obj);
        if (w24Var != null) {
            return w24Var.b;
        }
        t34 t34Var = (t34) this.b.invoke();
        int iA = t34Var.d.a(obj);
        if (iA != -1) {
            return t34Var.b(iA);
        }
        return null;
    }
}
