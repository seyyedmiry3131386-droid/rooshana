package com.google.common.primitives;

import defpackage.ja1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Floats$FloatConverter extends ja1 implements Serializable {
    private static final long serialVersionUID = 1;
    public static final ja1 z = new Floats$FloatConverter();

    private Floats$FloatConverter() {
    }

    private Object readResolve() {
        return z;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return Float.valueOf((String) obj);
    }

    public final String toString() {
        return "Floats.stringConverter()";
    }
}
