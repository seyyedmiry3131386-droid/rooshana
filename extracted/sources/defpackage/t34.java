package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.foundation.lazy.layout.e;

/* JADX INFO: loaded from: classes.dex */
public final class t34 {
    public final b a;
    public final s34 b;
    public final l24 c;
    public final e d;

    public t34(b bVar, s34 s34Var, l24 l24Var, e eVar) {
        this.a = bVar;
        this.b = s34Var;
        this.c = l24Var;
        this.d = eVar;
    }

    public final void a(int i, Object obj, qz0 qz0Var, int i2) {
        int i3;
        Object obj2;
        qz0 qz0Var2;
        qz0Var.c0(-462424778);
        int i4 = (qz0Var.d(i) ? 4 : 2) | i2 | (qz0Var.h(obj) ? 32 : 16) | (qz0Var.f(this) ? 256 : 128);
        if (qz0Var.R(i4 & 1, (i4 & 147) != 146)) {
            i3 = i;
            obj2 = obj;
            qz0Var2 = qz0Var;
            gu9.h(obj2, i3, this.a.r, s7.X(-824725566, new xf(this, i), qz0Var), qz0Var2, ((i4 >> 3) & 14) | 3072 | ((i4 << 3) & 112));
        } else {
            i3 = i;
            obj2 = obj;
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new y24(this, i3, obj2, i2);
        }
    }

    public final Object b(int i) {
        s34 s34Var = this.b;
        s34Var.getClass();
        bs3 bs3VarH = s34Var.a.h(i);
        return ((dp2) bs3VarH.c.c).invoke(Integer.valueOf(i - bs3VarH.a));
    }

    public final int c() {
        s34 s34Var = this.b;
        s34Var.getClass();
        return s34Var.a.b;
    }

    public final Object d(int i) {
        e eVar = this.d;
        Object[] objArr = eVar.b;
        int i2 = i - eVar.c;
        Object obj = (i2 < 0 || i2 >= objArr.length) ? null : objArr[i2];
        return obj == null ? this.b.a(i) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t34)) {
            return false;
        }
        return js3.i(this.b, ((t34) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
