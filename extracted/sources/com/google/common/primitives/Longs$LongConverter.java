package com.google.common.primitives;

import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Longs$LongConverter extends ja1 implements Serializable {
    private static final long serialVersionUID = 1;
    public static final ja1 z = new Longs$LongConverter();

    private Longs$LongConverter() {
    }

    private Object readResolve() {
        return z;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return Long.decode((String) obj);
    }

    public final String toString() {
        return "Longs.stringConverter()";
    }
}
