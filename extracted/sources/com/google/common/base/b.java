package com.google.common.base;

import defpackage.vb8;
import defpackage.wb8;
import defpackage.zi6;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static String a(String str, Iterable iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object obj : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    public static zi6 b(zi6 zi6Var, zi6 zi6Var2) {
        zi6Var.getClass();
        return new Predicates$AndPredicate(Arrays.asList(zi6Var, zi6Var2));
    }

    public static zi6 c() {
        return new Predicates$IsEqualToPredicate();
    }

    public static vb8 d(vb8 vb8Var) {
        return ((vb8Var instanceof wb8) || (vb8Var instanceof Suppliers$MemoizingSupplier)) ? vb8Var : vb8Var instanceof Serializable ? new Suppliers$MemoizingSupplier(vb8Var) : new wb8(vb8Var);
    }

    public static zi6 e(zi6 zi6Var) {
        return new Predicates$NotPredicate(zi6Var);
    }

    public static vb8 f(Object obj) {
        return new Suppliers$SupplierOfInstance(obj);
    }
}
