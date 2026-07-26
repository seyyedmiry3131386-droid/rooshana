package com.google.common.base;

import defpackage.s7;
import defpackage.vb8;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$SupplierOfInstance<T> implements vb8, Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;

    public Suppliers$SupplierOfInstance(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Suppliers$SupplierOfInstance) {
            return s7.l(this.a, ((Suppliers$SupplierOfInstance) obj).a);
        }
        return false;
    }

    @Override // defpackage.vb8
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}
