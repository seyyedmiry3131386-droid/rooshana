package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class NaturalOrdering extends p1 implements Serializable {
    public static final NaturalOrdering c = new NaturalOrdering();
    private static final long serialVersionUID = 0;
    public transient p1 a;
    public transient p1 b;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return c;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    @Override // com.google.common.collect.p1
    public final p1 e() {
        p1 p1Var = this.a;
        if (p1Var != null) {
            return p1Var;
        }
        NullsFirstOrdering nullsFirstOrdering = new NullsFirstOrdering(this);
        this.a = nullsFirstOrdering;
        return nullsFirstOrdering;
    }

    @Override // com.google.common.collect.p1
    public final p1 f() {
        p1 p1Var = this.b;
        if (p1Var != null) {
            return p1Var;
        }
        NullsLastOrdering nullsLastOrdering = new NullsLastOrdering(this);
        this.b = nullsLastOrdering;
        return nullsLastOrdering;
    }

    @Override // com.google.common.collect.p1
    public final p1 h() {
        return ReverseNaturalOrdering.a;
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
