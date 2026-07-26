package defpackage;

import androidx.compose.runtime.i;
import j$.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public final class i56 extends l56 implements j56, Map {
    public static final i56 d = new i56(ps8.e, 0);

    @Override // defpackage.l56, defpackage.f66
    public final d66 builder() {
        h56 h56Var = new h56(this);
        h56Var.g = this;
        return h56Var;
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

    @Override // defpackage.l56, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof i) {
            return super.containsKey((i) obj);
        }
        return false;
    }

    @Override // defpackage.e1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof a39) {
            return super.containsValue((a39) obj);
        }
        return false;
    }

    @Override // defpackage.l56
    /* JADX INFO: renamed from: e */
    public final o56 builder() {
        h56 h56Var = new h56(this);
        h56Var.g = this;
        return h56Var;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public final i56 g(i iVar, a39 a39Var) {
        dc0 dc0VarU = this.a.u(iVar, iVar.hashCode(), a39Var, 0);
        return dc0VarU == null ? this : new i56((ps8) dc0VarU.c, this.b + dc0VarU.b);
    }

    @Override // defpackage.l56, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof i) {
            return (a39) super.get((i) obj);
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof i) ? obj2 : (a39) Map.CC.$default$getOrDefault(this, (i) obj, (a39) obj2);
    }

    @Override // java.util.Map, j$.util.Map, j$.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
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
}
