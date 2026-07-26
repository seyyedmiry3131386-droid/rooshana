package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class AllEqualOrdering extends p1 implements Serializable {
    public static final AllEqualOrdering a = new AllEqualOrdering();
    private static final long serialVersionUID = 0;

    private Object readResolve() {
        return a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.p1
    public final p1 h() {
        return this;
    }

    public final String toString() {
        return "Ordering.allEqual()";
    }
}
