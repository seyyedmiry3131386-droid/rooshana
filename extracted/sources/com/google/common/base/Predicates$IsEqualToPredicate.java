package com.google.common.base;

import defpackage.bl4;
import defpackage.zi6;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Predicates$IsEqualToPredicate implements zi6, Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        return Object.class.equals(obj);
    }

    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (obj instanceof Predicates$IsEqualToPredicate) {
            return Object.class.equals(Object.class);
        }
        return false;
    }

    public final int hashCode() {
        return Object.class.hashCode();
    }

    public final String toString() {
        return bl4.t(Object.class, "Predicates.equalTo(", ")");
    }
}
