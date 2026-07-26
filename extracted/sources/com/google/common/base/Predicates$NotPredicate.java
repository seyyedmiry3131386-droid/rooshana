package com.google.common.base;

import defpackage.zi6;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Predicates$NotPredicate<T> implements zi6, Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;

    public Predicates$NotPredicate(zi6 zi6Var) {
        this.a = zi6Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, zi6] */
    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        return !this.a.apply(obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, zi6] */
    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$NotPredicate) {
            return this.a.equals(((Predicates$NotPredicate) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a + ")";
    }
}
