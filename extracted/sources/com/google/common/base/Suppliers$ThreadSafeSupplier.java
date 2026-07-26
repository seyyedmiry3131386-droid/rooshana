package com.google.common.base;

import defpackage.vb8;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$ThreadSafeSupplier<T> implements vb8, Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.vb8
    public final Object get() {
        throw null;
    }

    public final String toString() {
        return "Suppliers.synchronizedSupplier(null)";
    }
}
