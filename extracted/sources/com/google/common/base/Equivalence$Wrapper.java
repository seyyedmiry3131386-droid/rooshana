package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Equivalence$Wrapper<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Equivalence$Wrapper) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "null.wrap(null)";
    }
}
