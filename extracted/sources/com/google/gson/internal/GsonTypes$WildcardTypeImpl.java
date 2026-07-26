package com.google.gson.internal;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;
    public final Type b;

    public GsonTypes$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            a.c(typeArr[0]);
            this.b = null;
            this.a = a.b(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        a.c(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.b = a.b(typeArr2[0]);
        this.a = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && a.d(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.b;
        return type != null ? new Type[]{type} : a.a;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.b;
        if (type != null) {
            return "? super " + a.j(type);
        }
        Type type2 = this.a;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + a.j(type2);
    }
}
