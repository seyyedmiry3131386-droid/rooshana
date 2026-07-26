package com.google.common.collect;

import defpackage.b47;
import defpackage.d94;
import defpackage.lj3;
import defpackage.mj3;
import defpackage.rm7;
import defpackage.tj3;
import defpackage.vo4;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableListMultimap<K, V> extends ImmutableMultimap<K, V> implements d94 {
    private static final long serialVersionUID = 0;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(rm7.n(i, "Invalid key count "));
        }
        j0 j0VarA = ImmutableMap.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            int i4 = objectInputStream.readInt();
            if (i4 <= 0) {
                throw new InvalidObjectException(rm7.n(i4, "Invalid value count "));
            }
            lj3 lj3VarM = ImmutableList.m();
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                lj3VarM.O(object2);
            }
            j0VarA.c(object, lj3VarM.S());
            i2 += i4;
        }
        try {
            tj3.a.m(this, j0VarA.a(true));
            vo4 vo4Var = tj3.b;
            vo4Var.getClass();
            try {
                ((Field) vo4Var.b).set(this, Integer.valueOf(i2));
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b47.x(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Collection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Collection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        mj3 mj3Var = ImmutableList.b;
        return RegularImmutableList.e;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: o */
    public final ImmutableCollection get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        mj3 mj3Var = ImmutableList.b;
        return RegularImmutableList.e;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final List a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final List get(Object obj) {
        ImmutableList immutableList = (ImmutableList) this.f.get(obj);
        if (immutableList != null) {
            return immutableList;
        }
        mj3 mj3Var = ImmutableList.b;
        return RegularImmutableList.e;
    }
}
