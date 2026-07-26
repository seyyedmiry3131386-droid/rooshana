package com.google.common.base;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class FunctionalEquivalence<F, T> extends a implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.a
    public final boolean a(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.common.base.a
    public final int b(Object obj) {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionalEquivalence) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "null.onResultOf(null)";
    }
}
