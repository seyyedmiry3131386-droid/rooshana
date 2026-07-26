package com.google.gson.internal;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.bl4;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class GsonTypes$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;
    public final Type b;
    public final Type[] c;

    public GsonTypes$ParameterizedTypeImpl(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException(bl4.v("Must specify owner type for ", cls));
        }
        this.a = type == null ? null : a.b(type);
        this.b = a.b(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.c = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.c[i]);
            a.c(this.c[i]);
            Type[] typeArr3 = this.c;
            typeArr3[i] = a.b(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && a.d(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        int length = typeArr.length;
        Type type = this.b;
        if (length == 0) {
            return a.j(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(a.j(type));
        sb.append(SimpleComparison.LESS_THAN_OPERATION);
        sb.append(a.j(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(a.j(typeArr[i]));
        }
        sb.append(SimpleComparison.GREATER_THAN_OPERATION);
        return sb.toString();
    }
}
