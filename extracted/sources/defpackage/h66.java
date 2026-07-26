package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class h66 extends e1 implements e66 {
    public static final h66 d;
    public final Object a;
    public final Object b;
    public final k56 c;

    static {
        th0 th0Var = th0.j;
        k56 k56Var = k56.c;
        js3.n(k56Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        d = new h66(th0Var, th0Var, k56Var);
    }

    public h66(Object obj, Object obj2, k56 k56Var) {
        js3.p(k56Var, "hashMap");
        this.a = obj;
        this.b = obj2;
        this.c = k56Var;
    }

    @Override // defpackage.e1
    public final Set a() {
        return new l66(this, 0);
    }

    @Override // defpackage.e1
    public final Set b() {
        return new l66(this, 1);
    }

    @Override // defpackage.e1
    public final int c() {
        return this.c.size();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.containsKey(obj);
    }

    @Override // defpackage.e1
    public final Collection d() {
        return new hj4(3, this);
    }

    @Override // defpackage.e1, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (c() != map.size()) {
            return false;
        }
        boolean z = map instanceof h66;
        k56 k56Var = this.c;
        return z ? k56Var.a.g(((h66) obj).c.a, vy0.l) : map instanceof i66 ? k56Var.a.g(((i66) obj).d.c, vy0.m) : map instanceof k56 ? k56Var.a.g(((k56) obj).a, vy0.n) : map instanceof n56 ? k56Var.a.g(((n56) obj).c, vy0.o) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        h84 h84Var = (h84) this.c.get(obj);
        if (h84Var != null) {
            return h84Var.a;
        }
        return null;
    }
}
