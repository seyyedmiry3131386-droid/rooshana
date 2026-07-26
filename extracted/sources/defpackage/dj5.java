package defpackage;

import androidx.compose.runtime.internal.a;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dj5 {
    public final Object a;
    public final Object b;
    public final Map c;
    public final a d;

    public dj5(Object obj, Object obj2, Map map, a aVar) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = aVar;
    }

    public final void a(int i, qz0 qz0Var) {
        qz0Var.c0(295512821);
        int i2 = (qz0Var.f(this) ? 4 : 2) | i;
        if (qz0Var.R(i2 & 1, (i2 & 3) != 2)) {
            this.d.a(this.a, qz0Var, 0);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new n40(this, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dj5.class != obj.getClass()) {
            return false;
        }
        dj5 dj5Var = (dj5) obj;
        return js3.i(this.a, dj5Var.a) && js3.i(this.b, dj5Var.b) && js3.i(this.c, dj5Var.c) && this.d == dj5Var.d;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ')';
    }

    public dj5(dj5 dj5Var, a aVar) {
        this(dj5Var.a, dj5Var.b, dj5Var.c, aVar);
    }
}
