package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$GenericArrayTypeImpl implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;

    public GsonTypes$GenericArrayTypeImpl(Type type) {
        Objects.requireNonNull(type);
        this.a = a.b(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && a.d(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a.j(this.a) + "[]";
    }
}
