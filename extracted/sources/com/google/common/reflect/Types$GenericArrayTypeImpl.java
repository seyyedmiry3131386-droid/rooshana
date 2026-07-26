package com.google.common.reflect;

import defpackage.dw1;
import defpackage.lu3;
import defpackage.s7;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
final class Types$GenericArrayTypeImpl implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;

    public Types$GenericArrayTypeImpl(Type type) {
        this.a = Types$JavaVersion.c.e(type);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof GenericArrayType) {
            return s7.l(this.a, ((GenericArrayType) obj).getGenericComponentType());
        }
        return false;
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        lu3 lu3Var = d.a;
        Type type = this.a;
        return dw1.s(sb, type instanceof Class ? ((Class) type).getName() : type.toString(), "[]");
    }
}
