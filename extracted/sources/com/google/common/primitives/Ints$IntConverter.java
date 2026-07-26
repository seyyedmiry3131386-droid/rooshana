package com.google.common.primitives;

import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Ints$IntConverter extends ja1 implements Serializable {
    private static final long serialVersionUID = 1;
    public static final ja1 z = new Ints$IntConverter();

    private Ints$IntConverter() {
    }

    private Object readResolve() {
        return z;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return Integer.decode((String) obj);
    }

    public final String toString() {
        return "Ints.stringConverter()";
    }
}
