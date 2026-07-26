package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import com.google.common.reflect.Types$JavaVersion;
import defpackage.lt3;
import defpackage.lu3;
import defpackage.s7;
import defpackage.wn5;
import defpackage.yp2;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class Types$ParameterizedTypeImpl implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type a;
    public final ImmutableList b;
    public final Class c;

    public Types$ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
        cls.getClass();
        wn5.j(typeArr.length == cls.getTypeParameters().length);
        d.a(typeArr, "type parameter");
        this.a = type;
        this.c = cls;
        this.b = Types$JavaVersion.c.c(typeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            if (this.c.equals(parameterizedType.getRawType()) && s7.l(this.a, parameterizedType.getOwnerType())) {
                lu3 lu3Var = d.a;
                if (Arrays.equals((Type[]) this.b.toArray(new Type[0]), parameterizedType.getActualTypeArguments())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        lu3 lu3Var = d.a;
        return (Type[]) this.b.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.a;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.c;
    }

    public final int hashCode() {
        Type type = this.a;
        return ((type == null ? 0 : type.hashCode()) ^ this.b.hashCode()) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        Type type = this.a;
        if (type != null) {
            Types$JavaVersion types$JavaVersion = Types$JavaVersion.c;
            types$JavaVersion.getClass();
            if (!(types$JavaVersion instanceof Types$JavaVersion.AnonymousClass4)) {
                sb.append(types$JavaVersion.b(type));
                sb.append('.');
            }
        }
        sb.append(this.c.getName());
        sb.append('<');
        lu3 lu3Var = d.a;
        final Types$JavaVersion types$JavaVersion2 = Types$JavaVersion.c;
        Objects.requireNonNull(types$JavaVersion2);
        yp2 yp2Var = new yp2() { // from class: com.google.common.reflect.c
            @Override // defpackage.yp2
            public final Object apply(Object obj) {
                return types$JavaVersion2.b((Type) obj);
            }
        };
        ImmutableList immutableList = this.b;
        immutableList.getClass();
        sb.append(lu3Var.c(new lt3(immutableList, yp2Var, 1)));
        sb.append('>');
        return sb.toString();
    }
}
