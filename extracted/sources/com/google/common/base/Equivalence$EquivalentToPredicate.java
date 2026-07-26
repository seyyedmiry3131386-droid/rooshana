package com.google.common.base;

import defpackage.zi6;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Equivalence$EquivalentToPredicate<T> implements zi6, Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        throw null;
    }

    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Equivalence$EquivalentToPredicate) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "null.equivalentTo(null)";
    }
}
