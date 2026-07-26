package j$.util.stream;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes2.dex */
public final class f4 extends t3 {
    public final /* synthetic */ BinaryOperator h;
    public final /* synthetic */ BiConsumer i;
    public final /* synthetic */ Supplier j;
    public final /* synthetic */ h k;

    @Override // j$.util.stream.t3
    public final o4 D0() {
        return new g4(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.t3, j$.util.stream.b8
    public final int w() {
        Set<Collector.Characteristics> setCharacteristics = this.k.a.characteristics();
        if (setCharacteristics != null && !setCharacteristics.isEmpty()) {
            HashSet hashSet = new HashSet();
            Collector.Characteristics next = setCharacteristics.iterator().next();
            if (next instanceof g) {
                Iterator<Collector.Characteristics> it = setCharacteristics.iterator();
                while (it.hasNext()) {
                    try {
                        g gVar = (g) it.next();
                        hashSet.add(gVar == null ? null : gVar == g.CONCURRENT ? Collector.Characteristics.CONCURRENT : gVar == g.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                    } catch (ClassCastException e) {
                        j$.util.f.a(e, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            } else {
                if (!(next instanceof Collector.Characteristics)) {
                    j$.util.f.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                    throw null;
                }
                Iterator<Collector.Characteristics> it2 = setCharacteristics.iterator();
                while (it2.hasNext()) {
                    try {
                        Collector.Characteristics next2 = it2.next();
                        hashSet.add(next2 == null ? null : next2 == Collector.Characteristics.CONCURRENT ? g.CONCURRENT : next2 == Collector.Characteristics.UNORDERED ? g.UNORDERED : g.IDENTITY_FINISH);
                    } catch (ClassCastException e2) {
                        j$.util.f.a(e2, "java.util.stream.Collector.Characteristics");
                        throw null;
                    }
                }
            }
            setCharacteristics = hashSet;
        }
        if (setCharacteristics.contains(g.UNORDERED)) {
            return v6.r;
        }
        return 0;
    }

    public f4(w6 w6Var, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, h hVar) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = hVar;
    }
}
