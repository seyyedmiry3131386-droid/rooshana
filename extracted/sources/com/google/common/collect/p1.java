package com.google.common.collect;

import defpackage.yp2;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class p1 implements Comparator {
    public static p1 b(Comparator comparator) {
        return comparator instanceof p1 ? (p1) comparator : new ComparatorOrdering(comparator);
    }

    public static p1 c() {
        return NaturalOrdering.c;
    }

    public final p1 a(Comparator comparator) {
        return new CompoundOrdering(this, comparator);
    }

    public p1 e() {
        return new NullsFirstOrdering(this);
    }

    public p1 f() {
        return new NullsLastOrdering(this);
    }

    public final p1 g(yp2 yp2Var) {
        return new ByFunctionOrdering(yp2Var, this);
    }

    public p1 h() {
        return new ReverseOrdering(this);
    }
}
