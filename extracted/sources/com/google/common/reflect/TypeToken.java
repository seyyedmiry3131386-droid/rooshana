package com.google.common.reflect;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.e0;
import com.google.common.collect.o0;
import defpackage.fk2;
import defpackage.lt3;
import defpackage.lu3;
import defpackage.wn5;
import defpackage.z17;
import defpackage.zi6;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class TypeToken<T> extends z17 implements Serializable {
    private static final long serialVersionUID = 3637540370352322684L;
    public final Type e;

    public final class ClassSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            throw null;
        }

        @Override // defpackage.fk2, defpackage.hs9
        /* JADX INFO: renamed from: A */
        public final Object Y() {
            throw null;
        }

        @Override // defpackage.fk2, defpackage.uj2
        public final Collection Y() {
            throw null;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet, defpackage.fk2
        /* JADX INFO: renamed from: Z */
        public final Set Y() {
            Object obj = null;
            obj.getClass();
            return null;
        }
    }

    public final class InterfaceSet extends TypeToken<T>.TypeSet {
        private static final long serialVersionUID = 0;
        public transient ImmutableSet s;

        private Object readResolve() {
            throw null;
        }

        @Override // defpackage.fk2, defpackage.uj2
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public final Set Y() {
            ImmutableSet immutableSet = this.s;
            if (immutableSet != null) {
                return immutableSet;
            }
            e0 e0VarA = e0.a(null);
            Iterable iterable = (Iterable) e0VarA.a.f(e0VarA);
            iterable.getClass();
            ImmutableSet immutableSetC = e0.a(new lt3(iterable, TypeFilter.a, 0)).c();
            this.s = immutableSetC;
            return immutableSetC;
        }
    }

    public static final class SimpleTypeToken<T> extends TypeToken<T> {
        private static final long serialVersionUID = 0;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class TypeFilter implements zi6 {
        public static final AnonymousClass2 a;
        public static final /* synthetic */ TypeFilter[] b;

        /* JADX INFO: Fake field, exist only in values array */
        TypeFilter EF0;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [com.google.common.reflect.TypeToken$TypeFilter$2] */
        static {
            TypeFilter typeFilter = new TypeFilter() { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
                @Override // defpackage.zi6
                public final boolean apply(Object obj) {
                    Type type = ((TypeToken) obj).e;
                    return ((type instanceof TypeVariable) || (type instanceof WildcardType)) ? false : true;
                }
            };
            ?? r1 = new TypeFilter() { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
                @Override // defpackage.zi6
                public final boolean apply(Object obj) {
                    return ((TypeToken) obj).h().isInterface();
                }
            };
            a = r1;
            b = new TypeFilter[]{typeFilter, r1};
        }

        public static TypeFilter valueOf(String str) {
            return (TypeFilter) Enum.valueOf(TypeFilter.class, str);
        }

        public static TypeFilter[] values() {
            return (TypeFilter[]) b.clone();
        }
    }

    public class TypeSet extends fk2 implements Serializable {
        private static final long serialVersionUID = 0;

        @Override // defpackage.fk2
        /* JADX INFO: renamed from: Z */
        public Set Y() {
            Object obj = null;
            obj.getClass();
            return null;
        }
    }

    public TypeToken() {
        Type typeE = e();
        this.e = typeE;
        wn5.q(typeE, "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", !(typeE instanceof TypeVariable));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.e.equals(((TypeToken) obj).e);
        }
        return false;
    }

    public final Class h() {
        int i = ImmutableSet.c;
        o0 o0Var = new o0(4);
        new b(o0Var).a(this.e);
        return (Class) o0Var.T().iterator().next();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        lu3 lu3Var = d.a;
        Type type = this.e;
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public Object writeReplace() {
        return new SimpleTypeToken(new a().a(this.e));
    }

    public TypeToken(Type type) {
        type.getClass();
        this.e = type;
    }
}
