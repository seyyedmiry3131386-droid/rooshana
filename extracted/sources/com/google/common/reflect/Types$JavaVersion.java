package com.google.common.reflect;

import com.google.common.collect.ImmutableList;
import defpackage.lj3;
import defpackage.lu3;
import defpackage.uv8;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class Types$JavaVersion {
    public static final AnonymousClass2 a;
    public static final AnonymousClass3 b;
    public static final Types$JavaVersion c;
    public static final /* synthetic */ Types$JavaVersion[] d;

    /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$2, reason: invalid class name */
    public enum AnonymousClass2 extends Types$JavaVersion {
        public AnonymousClass2() {
            super("JAVA7", 1);
        }

        @Override // com.google.common.reflect.Types$JavaVersion
        public final Type a(Type type) {
            if (!(type instanceof Class)) {
                return new Types$GenericArrayTypeImpl(type);
            }
            lu3 lu3Var = d.a;
            return Array.newInstance((Class<?>) type, 0).getClass();
        }

        @Override // com.google.common.reflect.Types$JavaVersion
        public final Type e(Type type) {
            type.getClass();
            return type;
        }
    }

    /* JADX INFO: renamed from: com.google.common.reflect.Types$JavaVersion$3, reason: invalid class name */
    public enum AnonymousClass3 extends Types$JavaVersion {
        public AnonymousClass3() {
            super("JAVA8", 2);
        }

        @Override // com.google.common.reflect.Types$JavaVersion
        public final Type a(Type type) {
            return Types$JavaVersion.a.a(type);
        }

        @Override // com.google.common.reflect.Types$JavaVersion
        public final String b(Type type) {
            try {
                return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
            } catch (IllegalAccessException e) {
                e = e;
                throw new RuntimeException(e);
            } catch (NoSuchMethodException unused) {
                throw new AssertionError("Type.getTypeName should be available in Java 8");
            } catch (InvocationTargetException e2) {
                e = e2;
                throw new RuntimeException(e);
            }
        }

        @Override // com.google.common.reflect.Types$JavaVersion
        public final Type e(Type type) {
            type.getClass();
            return type;
        }
    }

    static {
        Types$JavaVersion types$JavaVersion = new Types$JavaVersion() { // from class: com.google.common.reflect.Types$JavaVersion.1
            @Override // com.google.common.reflect.Types$JavaVersion
            public final Type a(Type type) {
                return new Types$GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types$JavaVersion
            public final Type e(Type type) {
                type.getClass();
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new Types$GenericArrayTypeImpl(cls.getComponentType()) : type;
            }
        };
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        a = anonymousClass2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        b = anonymousClass3;
        Types$JavaVersion types$JavaVersion2 = new Types$JavaVersion() { // from class: com.google.common.reflect.Types$JavaVersion.4
            @Override // com.google.common.reflect.Types$JavaVersion
            public final Type a(Type type) {
                return Types$JavaVersion.a.a(type);
            }

            @Override // com.google.common.reflect.Types$JavaVersion
            public final String b(Type type) {
                return Types$JavaVersion.b.b(type);
            }

            @Override // com.google.common.reflect.Types$JavaVersion
            public final Type e(Type type) {
                type.getClass();
                return type;
            }
        };
        d = new Types$JavaVersion[]{types$JavaVersion, anonymousClass2, anonymousClass3, types$JavaVersion2};
        if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
            if (new uv8().e().toString().contains("java.util.Map.java.util.Map")) {
                c = anonymousClass3;
                return;
            } else {
                c = types$JavaVersion2;
                return;
            }
        }
        if (new uv8().e() instanceof Class) {
            c = anonymousClass2;
        } else {
            c = types$JavaVersion;
        }
    }

    public static Types$JavaVersion valueOf(String str) {
        return (Types$JavaVersion) Enum.valueOf(Types$JavaVersion.class, str);
    }

    public static Types$JavaVersion[] values() {
        return (Types$JavaVersion[]) d.clone();
    }

    public abstract Type a(Type type);

    public String b(Type type) {
        lu3 lu3Var = d.a;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public final ImmutableList c(Type[] typeArr) {
        lj3 lj3VarM = ImmutableList.m();
        for (Type type : typeArr) {
            lj3VarM.O(e(type));
        }
        return lj3VarM.S();
    }

    public abstract Type e(Type type);
}
