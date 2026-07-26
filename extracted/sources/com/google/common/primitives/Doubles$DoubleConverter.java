package com.google.common.primitives;

import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Doubles$DoubleConverter extends ja1 implements Serializable {
    private static final long serialVersionUID = 1;
    public static final ja1 z = new Doubles$DoubleConverter();

    private Doubles$DoubleConverter() {
    }

    private Object readResolve() {
        return z;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return Double.valueOf((String) obj);
    }

    public final String toString() {
        return "Doubles.stringConverter()";
    }
}
