package com.google.common.base;

import defpackage.vb8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$ExpiringMemoizingSupplier<T> implements vb8, Serializable {
    private static final long serialVersionUID = 0;
    public transient Object a;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    @Override // defpackage.vb8
    public final Object get() {
        throw null;
    }

    public final String toString() {
        return "Suppliers.memoizeWithExpiration(null, 0, NANOS)";
    }
}
