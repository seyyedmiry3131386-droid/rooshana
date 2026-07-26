package com.google.common.reflect;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.r0;
import defpackage.lu3;
import defpackage.p0;
import defpackage.zi6;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class Types$WildcardTypeImpl implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    public final ImmutableList a;
    public final ImmutableList b;

    public Types$WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
        d.a(typeArr, "lower bound for wildcard");
        d.a(typeArr2, "upper bound for wildcard");
        Types$JavaVersion types$JavaVersion = Types$JavaVersion.c;
        this.a = types$JavaVersion.c(typeArr);
        this.b = types$JavaVersion.c(typeArr2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) obj;
            if (this.a.equals(Arrays.asList(wildcardType.getLowerBounds()))) {
                if (this.b.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        lu3 lu3Var = d.a;
        return (Type[]) this.a.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        lu3 lu3Var = d.a;
        return (Type[]) this.b.toArray(new Type[0]);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("?");
        p0 p0VarListIterator = this.a.listIterator(0);
        while (p0VarListIterator.hasNext()) {
            Type type = (Type) p0VarListIterator.next();
            sb.append(" super ");
            sb.append(Types$JavaVersion.c.b(type));
        }
        lu3 lu3Var = d.a;
        zi6 zi6VarE = com.google.common.base.b.e(com.google.common.base.b.c());
        ImmutableList immutableList = this.b;
        immutableList.getClass();
        Optional.a();
        Iterator<E> it = immutableList.iterator();
        it.getClass();
        r0 r0Var = new r0(it, zi6VarE);
        while (r0Var.hasNext()) {
            Type type2 = (Type) r0Var.next();
            sb.append(" extends ");
            sb.append(Types$JavaVersion.c.b(type2));
        }
        return sb.toString();
    }
}
