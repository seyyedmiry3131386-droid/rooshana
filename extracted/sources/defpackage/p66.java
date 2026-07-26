package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class p66 extends s1 implements Collection, ex3 {
    public o66 a;
    public Object b;
    public Object c;
    public final o56 d;

    public p66(o66 o66Var) {
        this.a = o66Var;
        this.b = o66Var.a;
        this.c = o66Var.b;
        this.d = o66Var.c.builder();
    }

    @Override // defpackage.s1
    public final int a() {
        return this.d.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        o56 o56Var = this.d;
        if (o56Var.containsKey(obj)) {
            return false;
        }
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            o56Var.put(obj, new i84());
            return true;
        }
        V v = o56Var.get(this.c);
        js3.m(v);
        o56Var.put(this.c, new i84(((i84) v).a, obj));
        o56Var.put(obj, new i84(this.c));
        this.c = obj;
        return true;
    }

    public final o66 c() {
        l56 l56VarBuild = this.d.build();
        o66 o66Var = this.a;
        if (l56VarBuild != o66Var.c) {
            o66Var = new o66(this.b, this.c, l56VarBuild);
        }
        this.a = o66Var;
        return o66Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.d.clear();
        fz1 fz1Var = fz1.i;
        this.b = fz1Var;
        this.c = fz1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new q66(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        o56 o56Var = this.d;
        i84 i84Var = (i84) o56Var.remove(obj);
        if (i84Var == null) {
            return false;
        }
        Object obj2 = i84Var.b;
        Object obj3 = i84Var.a;
        fz1 fz1Var = fz1.i;
        if (obj3 != fz1Var) {
            V v = o56Var.get(obj3);
            js3.m(v);
            o56Var.put(obj3, new i84(((i84) v).a, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 == fz1Var) {
            this.c = obj3;
            return true;
        }
        V v2 = o56Var.get(obj2);
        js3.m(v2);
        o56Var.put(obj2, new i84(obj3, ((i84) v2).b));
        return true;
    }
}
