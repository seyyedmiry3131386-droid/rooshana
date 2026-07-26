package com.google.common.base;

import defpackage.s7;
import defpackage.yp2;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Functions$ConstantFunction<E> implements yp2, Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.yp2
    public final boolean equals(Object obj) {
        if (obj instanceof Functions$ConstantFunction) {
            return s7.l(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "Functions.constant(null)";
    }
}
