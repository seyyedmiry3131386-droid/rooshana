package com.google.common.reflect;

import defpackage.lu3;
import defpackage.mu3;
import defpackage.wn5;
import defpackage.wv8;
import defpackage.xv8;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final lu3 a;

    static {
        mu3 mu3Var = new mu3(", ");
        a = new lu3(mu3Var, mu3Var);
    }

    public static void a(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                wn5.k(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    public static Type b(Type type) {
        if (!(type instanceof WildcardType)) {
            return Types$JavaVersion.c.a(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        wn5.i("Wildcard cannot have more than one lower bounds.", lowerBounds.length <= 1);
        if (lowerBounds.length == 1) {
            return new Types$WildcardTypeImpl(new Type[]{b(lowerBounds[0])}, new Type[]{Object.class});
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        wn5.i("Wildcard should have only one upper bound.", upperBounds.length == 1);
        return new Types$WildcardTypeImpl(new Type[0], new Type[]{b(upperBounds[0])});
    }

    public static TypeVariable c(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        xv8 xv8Var = new xv8(new wv8(genericDeclaration, str, typeArr));
        wn5.g(TypeVariable.class, "%s is not an interface", TypeVariable.class.isInterface());
        return (TypeVariable) TypeVariable.class.cast(Proxy.newProxyInstance(TypeVariable.class.getClassLoader(), new Class[]{TypeVariable.class}, xv8Var));
    }
}
