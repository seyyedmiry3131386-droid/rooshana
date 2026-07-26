package com.google.common.base;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class PairwiseEquivalence<E, T extends E> extends a implements Serializable {
    private static final long serialVersionUID = 1;

    @Override // com.google.common.base.a
    public final boolean a(Object obj, Object obj2) {
        Iterator it = ((Iterable) obj).iterator();
        Iterator it2 = ((Iterable) obj2).iterator();
        if (!it.hasNext() || !it2.hasNext()) {
            return (it.hasNext() || it2.hasNext()) ? false : true;
        }
        it.next();
        it2.next();
        throw null;
    }

    @Override // com.google.common.base.a
    public final int b(Object obj) {
        Iterator it = ((Iterable) obj).iterator();
        if (!it.hasNext()) {
            return 78721;
        }
        it.next();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PairwiseEquivalence) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "null.pairwise()";
    }
}
