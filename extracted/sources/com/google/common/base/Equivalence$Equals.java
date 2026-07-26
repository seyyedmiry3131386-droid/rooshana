package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Equivalence$Equals extends a implements Serializable {
    public static final Equivalence$Equals a = new Equivalence$Equals();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.a
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // com.google.common.base.a
    public final int b(Object obj) {
        return obj.hashCode();
    }
}
