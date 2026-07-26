package defpackage;

import j$.util.Map;
import java.util.Collection;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class o56 extends r1 implements d66, Map {
    public l56 a;
    public rl3 b = new rl3();
    public ps8 c;
    public Object d;
    public int e;
    public int f;

    public o56(l56 l56Var) {
        this.a = l56Var;
        this.c = l56Var.a;
        this.f = l56Var.b;
    }

    @Override // defpackage.r1
    public final Set a() {
        return new s56(0, this);
    }

    @Override // defpackage.r1
    public final Set b() {
        return new s56(1, this);
    }

    @Override // defpackage.r1
    public final int c() {
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = ps8.e;
        f(0);
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
    public boolean containsKey(Object obj) {
        return this.c.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // defpackage.r1
    public final Collection d() {
        return new ch4(2, this);
    }

    @Override // defpackage.d66
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public l56 build() {
        ps8 ps8Var = this.c;
        l56 l56Var = this.a;
        if (ps8Var != l56Var.a) {
            this.b = new rl3();
            l56Var = new l56(this.c, c());
        }
        this.a = l56Var;
        return l56Var;
    }

    public final void f(int i) {
        this.f = i;
        this.e++;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.c.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map map) {
        l56 l56VarBuild = null;
        l56 l56Var = map instanceof l56 ? (l56) map : null;
        if (l56Var == null) {
            o56 o56Var = map instanceof o56 ? (o56) map : null;
            if (o56Var != null) {
                l56VarBuild = o56Var.build();
            }
        } else {
            l56VarBuild = l56Var;
        }
        if (l56VarBuild == null) {
            super.putAll(map);
            return;
        }
        pj1 pj1Var = new pj1();
        pj1Var.a = 0;
        int i = this.f;
        ps8 ps8Var = this.c;
        ps8 ps8Var2 = l56VarBuild.a;
        js3.n(ps8Var2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.c = ps8Var.m(ps8Var2, 0, pj1Var, this);
        int i2 = (l56VarBuild.b + i) - pj1Var.a;
        if (i != i2) {
            f(i2);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        int iC = c();
        ps8 ps8VarO = this.c.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (ps8VarO == null) {
            ps8VarO = ps8.e;
        }
        this.c = ps8VarO;
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
    public Object remove(Object obj) {
        this.d = null;
        ps8 ps8VarN = this.c.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (ps8VarN == null) {
            ps8VarN = ps8.e;
        }
        this.c = ps8VarN;
        return this.d;
    }
}
