package com.google.common.base;

import defpackage.ja1;
import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes.dex */
final class Enums$StringConverter<T extends Enum<T>> extends ja1 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.yp2
    public final boolean equals(Object obj) {
        if (obj instanceof Enums$StringConverter) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // defpackage.ja1
    public final Object n(Object obj) {
        return Enum.valueOf(null, (String) obj);
    }

    public final String toString() {
        throw null;
    }
}
