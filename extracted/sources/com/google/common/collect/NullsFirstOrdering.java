package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class NullsFirstOrdering<T> extends p1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final p1 a;

    public NullsFirstOrdering(p1 p1Var) {
        this.a = p1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return this.a.compare(obj, obj2);
    }

    @Override // com.google.common.collect.p1
    public final p1 e() {
        return this;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.a.equals(((NullsFirstOrdering) obj).a);
        }
        return false;
    }

    @Override // com.google.common.collect.p1
    public final p1 f() {
        return this.a.f();
    }

    @Override // com.google.common.collect.p1
    public final p1 h() {
        return this.a.h().f();
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public final String toString() {
        return this.a + ".nullsFirst()";
    }
}
