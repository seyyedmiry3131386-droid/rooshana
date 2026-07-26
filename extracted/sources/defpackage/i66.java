package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class i66 extends r1 implements c66, Map {
    public h66 a;
    public Object b;
    public Object c;
    public final n56 d;

    public i66(h66 h66Var) {
        this.a = h66Var;
        this.b = h66Var.a;
        this.c = h66Var.b;
        k56 k56Var = h66Var.c;
        k56Var.getClass();
        this.d = new n56(k56Var);
    }

    @Override // defpackage.r1
    public final Set a() {
        return new r56(this, 1);
    }

    @Override // defpackage.r1
    public final Set b() {
        return new u56(this, 1);
    }

    @Override // defpackage.c66
    public final e66 build() {
        h66 h66Var = this.a;
        n56 n56Var = this.d;
        if (h66Var != null) {
            k56 k56Var = n56Var.a;
            return h66Var;
        }
        k56 k56Var2 = n56Var.a;
        h66 h66Var2 = new h66(this.b, this.c, n56Var.build());
        this.a = h66Var2;
        return h66Var2;
    }

    @Override // defpackage.r1
    public final int c() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n56 n56Var = this.d;
        if (!n56Var.isEmpty()) {
            this.a = null;
        }
        n56Var.clear();
        th0 th0Var = th0.j;
        this.b = th0Var;
        this.c = th0Var;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // defpackage.r1
    public final Collection d() {
        return new ch4(3, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        n56 n56Var = this.d;
        java.util.Map map = (java.util.Map) obj;
        if (n56Var.size() != map.size()) {
            return false;
        }
        if (map instanceof h66) {
            return n56Var.c.g(((h66) obj).c.a, vy0.p);
        }
        if (map instanceof i66) {
            return n56Var.c.g(((i66) obj).d.c, vy0.q);
        }
        if (map instanceof k56) {
            return n56Var.c.g(((k56) obj).a, vy0.r);
        }
        if (map instanceof n56) {
            return n56Var.c.g(((n56) obj).c, vy0.s);
        }
        if (c() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (map.isEmpty()) {
            return true;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (!ml9.p(this, (Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        h84 h84Var = (h84) this.d.get(obj);
        if (h84Var != null) {
            return h84Var.a;
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        th0 th0Var = th0.j;
        n56 n56Var = this.d;
        h84 h84Var = (h84) n56Var.get(obj);
        if (h84Var != null) {
            Object obj3 = h84Var.a;
            if (obj3 == obj2) {
                return obj2;
            }
            this.a = null;
            n56Var.put(obj, new h84(obj2, h84Var.b, h84Var.c));
            return obj3;
        }
        this.a = null;
        if (isEmpty()) {
            this.b = obj;
            this.c = obj;
            n56Var.put(obj, new h84(obj2, th0Var, th0Var));
            return null;
        }
        Object obj4 = this.c;
        Object obj5 = n56Var.get(obj4);
        js3.m(obj5);
        h84 h84Var2 = (h84) obj5;
        n56Var.put(obj4, new h84(h84Var2.a, h84Var2.b, obj));
        n56Var.put(obj, new h84(obj2, obj4, th0Var));
        this.c = obj;
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n56 n56Var = this.d;
        h84 h84Var = (h84) n56Var.remove(obj);
        if (h84Var == null) {
            return null;
        }
        Object obj2 = h84Var.c;
        Object obj3 = h84Var.b;
        this.a = null;
        th0 th0Var = th0.j;
        if (obj3 != th0Var) {
            Object obj4 = n56Var.get(obj3);
            js3.m(obj4);
            h84 h84Var2 = (h84) obj4;
            n56Var.put(obj3, new h84(h84Var2.a, h84Var2.b, obj2));
        } else {
            this.b = obj2;
        }
        if (obj2 != th0Var) {
            Object obj5 = n56Var.get(obj2);
            js3.m(obj5);
            h84 h84Var3 = (h84) obj5;
            n56Var.put(obj2, new h84(h84Var3.a, obj3, h84Var3.c));
        } else {
            this.c = obj3;
        }
        return h84Var.a;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        h84 h84Var = (h84) this.d.get(obj);
        if (h84Var == null || !js3.i(h84Var.a, obj2)) {
            return false;
        }
        remove(obj);
        return true;
    }
}
