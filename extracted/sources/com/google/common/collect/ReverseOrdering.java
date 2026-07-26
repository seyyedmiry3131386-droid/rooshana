package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class ReverseOrdering<T> extends p1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final p1 a;

    public ReverseOrdering(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.a.equals(((ReverseOrdering) obj).a);
        }
        return false;
    }

    @Override // com.google.common.collect.p1
    public final p1 h() {
        return this.a;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
