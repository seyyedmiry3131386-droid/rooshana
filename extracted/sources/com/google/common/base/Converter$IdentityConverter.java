package com.google.common.base;

import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Converter$IdentityConverter<T> extends ja1 implements Serializable {
    private static final long serialVersionUID = 0;
    public static final ja1 z = new Converter$IdentityConverter();

    private Converter$IdentityConverter() {
    }

    private Object readResolve() {
        return z;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return obj;
    }

    public final String toString() {
        return "Converter.identity()";
    }
}
