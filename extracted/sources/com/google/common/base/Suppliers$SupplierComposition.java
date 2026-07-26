package com.google.common.base;

import defpackage.vb8;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$SupplierComposition<F, T> implements vb8, Serializable {
    private static final long serialVersionUID = 0;

    public final boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierComposition) {
            throw null;
        }
        return false;
    }

    @Override // defpackage.vb8
    public final Object get() {
        throw null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "Suppliers.compose(null, null)";
    }
}
