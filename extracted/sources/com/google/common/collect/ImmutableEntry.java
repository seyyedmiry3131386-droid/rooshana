package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class ImmutableEntry<K, V> extends defpackage.h1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;
    public final Object b;

    public ImmutableEntry(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
