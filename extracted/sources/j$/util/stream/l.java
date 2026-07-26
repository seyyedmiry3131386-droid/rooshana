package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends z4 {
    public static i2 T0(t3 t3Var, Spliterator spliterator) {
        j$.time.format.a aVar = new j$.time.format.a(12);
        j$.time.format.a aVar2 = new j$.time.format.a(13);
        j$.time.format.a aVar3 = new j$.time.format.a(14);
        Objects.requireNonNull(aVar);
        Objects.requireNonNull(aVar2);
        Objects.requireNonNull(aVar3);
        return new i2((Collection) new y3(w6.REFERENCE, aVar3, aVar2, aVar, 3).j(t3Var, spliterator));
    }

    @Override // j$.util.stream.a
    public final d2 M0(t3 t3Var, Spliterator spliterator, IntFunction intFunction) {
        a aVar = (a) t3Var;
        if (v6.DISTINCT.l(aVar.m)) {
            return t3Var.k0(spliterator, false, intFunction);
        }
        if (v6.ORDERED.l(aVar.m)) {
            return T0(t3Var, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.util.concurrent.t tVar = new j$.util.concurrent.t(4, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(tVar);
        new n0(tVar, false).a(t3Var, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new i2(collectionKeySet);
    }

    @Override // j$.util.stream.a
    public final Spliterator N0(a aVar, Spliterator spliterator) {
        if (v6.DISTINCT.l(aVar.m)) {
            return aVar.G0(spliterator);
        }
        if (v6.ORDERED.l(aVar.m)) {
            return T0(aVar, spliterator).spliterator();
        }
        return new e7(aVar.G0(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.a
    public final j5 P0(int i, j5 j5Var) {
        Objects.requireNonNull(j5Var);
        if (v6.DISTINCT.l(i)) {
            return j5Var;
        }
        if (v6.SORTED.l(i)) {
            return new j(j5Var);
        }
        return new k(j5Var);
    }
}
