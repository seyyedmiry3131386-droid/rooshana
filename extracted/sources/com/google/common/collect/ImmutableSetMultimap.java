package com.google.common.collect;

import defpackage.b47;
import defpackage.gu9;
import defpackage.kq7;
import defpackage.o40;
import defpackage.rm7;
import defpackage.tj3;
import defpackage.vo4;
import defpackage.yj3;
import defpackage.zx8;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableSetMultimap<K, V> extends ImmutableMultimap<K, V> implements kq7 {
    private static final long serialVersionUID = 0;
    public final transient ImmutableSet g;
    public transient ImmutableSet h;

    public static final class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableSetMultimap d;

        public EntrySet(ImmutableSetMultimap immutableSetMultimap) {
            this.d = immutableSetMultimap;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.d.i(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return this.d.n();
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            return this.d.n();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            this.d.getClass();
            return 0;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public ImmutableSetMultimap(ImmutableMap immutableMap) {
        super(immutableMap);
        int i = ImmutableSet.c;
        this.g = RegularImmutableSet.j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        Object objZ;
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
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
            o0 o0Var = comparator == null ? new o0(4) : new q0(comparator);
            for (int i5 = 0; i5 < i4; i5++) {
                Object object2 = objectInputStream.readObject();
                Objects.requireNonNull(object2);
                o0Var.e(object2);
            }
            ImmutableSet immutableSetT = o0Var.T();
            if (immutableSetT.size() != i4) {
                throw new InvalidObjectException(o40.x(object, "Duplicate key-value pairs exist for key "));
            }
            j0VarA.c(object, immutableSetT);
            i2 += i4;
        }
        try {
            tj3.a.m(this, j0VarA.a(true));
            vo4 vo4Var = tj3.b;
            vo4Var.getClass();
            try {
                ((Field) vo4Var.b).set(this, Integer.valueOf(i2));
                vo4 vo4Var2 = yj3.a;
                if (comparator == null) {
                    int i6 = ImmutableSet.c;
                    objZ = RegularImmutableSet.j;
                } else {
                    objZ = ImmutableSortedSet.z(comparator);
                }
                vo4Var2.m(this, objZ);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        ImmutableSet immutableSet = this.g;
        objectOutputStream.writeObject(immutableSet instanceof ImmutableSortedSet ? ((ImmutableSortedSet) immutableSet).d : null);
        b47.x(this, objectOutputStream);
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Collection a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.n1
    public final Collection g() {
        ImmutableSet immutableSet = this.h;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.h = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Collection get(Object obj) {
        return (ImmutableSet) gu9.p((ImmutableSet) this.f.get(obj), this.g);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: m */
    public final ImmutableCollection g() {
        ImmutableSet immutableSet = this.h;
        if (immutableSet != null) {
            return immutableSet;
        }
        EntrySet entrySet = new EntrySet(this);
        this.h = entrySet;
        return entrySet;
    }

    @Override // com.google.common.collect.ImmutableMultimap
    /* JADX INFO: renamed from: o */
    public final ImmutableCollection get(Object obj) {
        return (ImmutableSet) gu9.p((ImmutableSet) this.f.get(obj), this.g);
    }

    @Override // com.google.common.collect.ImmutableMultimap
    public final ImmutableCollection p() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Set a(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableMultimap, defpackage.fa5
    public final Set get(Object obj) {
        return (ImmutableSet) gu9.p((ImmutableSet) this.f.get(obj), this.g);
    }
}
