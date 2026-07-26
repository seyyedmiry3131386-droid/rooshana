package com.google.common.base;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class Equivalence$Identity extends a implements Serializable {
    public static final Equivalence$Identity a = new Equivalence$Identity();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // com.google.common.base.a
    public final boolean a(Object obj, Object obj2) {
        return false;
    }

    @Override // com.google.common.base.a
    public final int b(Object obj) {
        return System.identityHashCode(obj);
    }
}
