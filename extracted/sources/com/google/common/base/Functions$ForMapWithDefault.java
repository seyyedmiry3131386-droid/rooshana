package com.google.common.base;

import defpackage.yp2;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class Functions$ForMapWithDefault<K, V> implements yp2, Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        throw null;
    }

    @Override // defpackage.yp2
    public final boolean equals(Object obj) {
        if (obj instanceof Functions$ForMapWithDefault) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, null});
    }

    public final String toString() {
        return "Functions.forMap(null, defaultValue=null)";
    }
}
