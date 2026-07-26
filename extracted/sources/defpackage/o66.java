package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o66 extends t2 implements r66 {
    public static final o66 d;
    public final Object a;
    public final Object b;
    public final l56 c;

    static {
        fz1 fz1Var = fz1.i;
        d = new o66(fz1Var, fz1Var, l56.c);
    }

    public o66(Object obj, Object obj2, l56 l56Var) {
        this.a = obj;
        this.b = obj2;
        this.c = l56Var;
    }

    @Override // defpackage.o
    public final int a() {
        return this.c.c();
    }

    public final o66 c(Object obj) {
        l56 l56Var = this.c;
        if (l56Var.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new o66(obj, obj, l56Var.f(obj, new i84()));
        }
        Object obj2 = this.b;
        Object obj3 = l56Var.get(obj2);
        js3.m(obj3);
        return new o66(this.a, obj, l56Var.f(obj2, new i84(((i84) obj3).a, obj)).f(obj, new i84(obj2)));
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.containsKey(obj);
    }

    public final o66 e(Object obj) {
        l56 l56VarF = this.c;
        i84 i84Var = (i84) l56VarF.get(obj);
        if (i84Var == null) {
            return this;
        }
        Object obj2 = i84Var.a;
        Object obj3 = i84Var.b;
        ps8 ps8Var = l56VarF.a;
        ps8 ps8VarV = ps8Var.v(obj != null ? obj.hashCode() : 0, 0, obj);
        if (ps8Var != ps8VarV) {
            l56VarF = ps8VarV == null ? l56.c : new l56(ps8VarV, l56VarF.b - 1);
        }
        fz1 fz1Var = fz1.i;
        if (obj2 != fz1Var) {
            Object obj4 = l56VarF.get(obj2);
            js3.m(obj4);
            l56VarF = l56VarF.f(obj2, new i84(((i84) obj4).a, obj3));
        }
        if (obj3 != fz1Var) {
            Object obj5 = l56VarF.get(obj3);
            js3.m(obj5);
            l56VarF = l56VarF.f(obj3, new i84(obj2, ((i84) obj5).b));
        }
        Object obj6 = obj2 != fz1Var ? this.a : obj3;
        if (obj3 != fz1Var) {
            obj2 = this.b;
        }
        return new o66(obj6, obj2, l56VarF);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new n66(this.a, this.c, 1);
    }
}
