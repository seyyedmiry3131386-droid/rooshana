package com.google.common.base;

import defpackage.vb8;
import defpackage.yp2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Suppliers$SupplierFunctionImpl implements yp2 {
    public static final /* synthetic */ Suppliers$SupplierFunctionImpl[] a = {new Suppliers$SupplierFunctionImpl("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Suppliers$SupplierFunctionImpl EF5;

    public static Suppliers$SupplierFunctionImpl valueOf(String str) {
        return (Suppliers$SupplierFunctionImpl) Enum.valueOf(Suppliers$SupplierFunctionImpl.class, str);
    }

    public static Suppliers$SupplierFunctionImpl[] values() {
        return (Suppliers$SupplierFunctionImpl[]) a.clone();
    }

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        return ((vb8) obj).get();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Suppliers.supplierFunction()";
    }
}
