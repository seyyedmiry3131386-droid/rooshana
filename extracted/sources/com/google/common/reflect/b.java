package com.google.common.reflect;

import com.google.common.collect.o0;
import com.google.common.reflect.TypeToken;
import defpackage.lu3;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final HashSet a = new HashSet();
    public final /* synthetic */ o0 b;

    public b(o0 o0Var) {
        this.b = o0Var;
    }

    public final void a(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null) {
                HashSet hashSet = this.a;
                if (hashSet.add(type)) {
                    try {
                        if (type instanceof TypeVariable) {
                            a(((TypeVariable) type).getBounds());
                        } else if (type instanceof WildcardType) {
                            a(((WildcardType) type).getUpperBounds());
                        } else {
                            boolean z = type instanceof ParameterizedType;
                            o0 o0Var = this.b;
                            if (z) {
                                o0Var.e((Class) ((ParameterizedType) type).getRawType());
                            } else if (type instanceof Class) {
                                o0Var.O((Class) type);
                            } else {
                                if (!(type instanceof GenericArrayType)) {
                                    throw new AssertionError("Unknown type: " + type);
                                }
                                Class clsH = new TypeToken.SimpleTypeToken(((GenericArrayType) type).getGenericComponentType()).h();
                                lu3 lu3Var = d.a;
                                o0Var.O(Array.newInstance((Class<?>) clsH, 0).getClass());
                            }
                        }
                    } catch (Throwable th) {
                        hashSet.remove(type);
                        throw th;
                    }
                } else {
                    continue;
                }
            }
        }
    }
}
