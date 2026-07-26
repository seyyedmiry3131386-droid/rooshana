package com.google.common.base;

import defpackage.zi6;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Predicates$AndPredicate<T> implements zi6, Serializable {
    private static final long serialVersionUID = 0;
    public final List a;

    public Predicates$AndPredicate(List list) {
        this.a = list;
    }

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((zi6) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$AndPredicate) {
            return this.a.equals(((Predicates$AndPredicate) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        return b.a("and", this.a);
    }
}
