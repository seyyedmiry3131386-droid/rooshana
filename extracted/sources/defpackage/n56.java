package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j$.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public final class n56 extends r1 implements c66, Map {
    public k56 a;
    public ql3 b;
    public os8 c;
    public Object d;
    public int e;
    public int f;

    public n56(k56 k56Var) {
        js3.p(k56Var, "map");
        this.a = k56Var;
        this.b = new ql3();
        this.c = k56Var.a;
        this.f = k56Var.c();
    }

    @Override // defpackage.r1
    public final Set a() {
        return new r56(this, 0);
    }

    @Override // defpackage.r1
    public final Set b() {
        return new u56(this, 0);
    }

    @Override // defpackage.r1
    public final int c() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        os8 os8Var = os8.e;
        js3.n(os8Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        f(os8Var);
        g(0);
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
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.r1
    public final Collection d() {
        return new ch4(1, this);
    }

    @Override // defpackage.c66
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final k56 build() {
        k56 k56Var = this.a;
        if (k56Var != null) {
            return k56Var;
        }
        k56 k56Var2 = new k56(this.c, c());
        this.a = k56Var2;
        this.b = new ql3();
        return k56Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this.f != map.size()) {
            return false;
        }
        if (map instanceof k56) {
            return this.c.g(((k56) obj).a, vy0.h);
        }
        if (map instanceof n56) {
            return this.c.g(((n56) obj).c, vy0.i);
        }
        if (map instanceof h66) {
            return this.c.g(((h66) obj).c.a, vy0.j);
        }
        if (map instanceof i66) {
            return this.c.g(((i66) obj).d.c, vy0.k);
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

    public final void f(os8 os8Var) {
        js3.p(os8Var, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        if (os8Var != this.c) {
            this.c = os8Var;
            this.a = null;
        }
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final void g(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.h(obj != null ? obj.hashCode() : 0, 0, obj);
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
        this.d = null;
        f(this.c.m(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this));
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        js3.p(map, "from");
        if (map.isEmpty()) {
            return;
        }
        k56 k56VarBuild = null;
        k56 k56Var = map instanceof k56 ? (k56) map : null;
        if (k56Var == null) {
            n56 n56Var = map instanceof n56 ? (n56) map : null;
            if (n56Var != null) {
                k56VarBuild = n56Var.build();
            }
        } else {
            k56VarBuild = k56Var;
        }
        if (k56VarBuild == null) {
            super.putAll(map);
            return;
        }
        oj1 oj1Var = new oj1();
        oj1Var.a = 0;
        int iC = c();
        os8 os8Var = this.c;
        os8 os8Var2 = k56VarBuild.a;
        js3.n(os8Var2, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        f(os8Var.n(os8Var2, 0, oj1Var, this));
        int iC2 = (k56VarBuild.c() + iC) - oj1Var.a;
        if (iC != iC2) {
            g(iC2);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        os8 os8VarP = this.c.p(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (os8VarP == null) {
            os8 os8Var = os8.e;
            js3.n(os8Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            os8VarP = os8Var;
        }
        f(os8VarP);
        return iC != c();
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

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        os8 os8VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (os8VarO == null) {
            os8 os8Var = os8.e;
            js3.n(os8Var, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
            os8VarO = os8Var;
        }
        f(os8VarO);
        return this.d;
    }
}
