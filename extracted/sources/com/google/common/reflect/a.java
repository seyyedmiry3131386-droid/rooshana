package com.google.common.reflect;

import defpackage.lu3;
import defpackage.vo4;
import defpackage.wn5;
import defpackage.zu8;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final vo4 a;

    public a() {
        this.a = new vo4(15);
    }

    public final Type a(Type type) {
        type.getClass();
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            vo4 vo4Var = this.a;
            vo4Var.getClass();
            return vo4Var.l(typeVariable, new zu8(typeVariable, vo4Var));
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return d.b(a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new Types$WildcardTypeImpl(b(wildcardType.getLowerBounds()), b(wildcardType.getUpperBounds()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type ownerType = parameterizedType.getOwnerType();
        Type typeA = ownerType == null ? null : a(ownerType);
        Type typeA2 = a(parameterizedType.getRawType());
        Type[] typeArrB = b(parameterizedType.getActualTypeArguments());
        Class cls = (Class) typeA2;
        lu3 lu3Var = d.a;
        if (typeA == null) {
            return new Types$ParameterizedTypeImpl(Types$ClassOwnership.a.a(cls), cls, typeArrB);
        }
        wn5.g(cls, "Owner type for unenclosed %s", cls.getEnclosingClass() != null);
        return new Types$ParameterizedTypeImpl(typeA, cls, typeArrB);
    }

    public final Type[] b(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i = 0; i < typeArr.length; i++) {
            typeArr2[i] = a(typeArr[i]);
        }
        return typeArr2;
    }

    public a(vo4 vo4Var) {
        this.a = vo4Var;
    }
}
