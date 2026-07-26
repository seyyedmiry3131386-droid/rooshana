package com.google.common.collect;

import defpackage.oa5;
import defpackage.pa5;
import defpackage.tt3;
import defpackage.uj3;
import defpackage.zx8;
import j$.util.Collection;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements oa5, Collection {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableList b;
    public transient ImmutableSet c;

    public final class EntrySet extends IndexedImmutableSet<pa5> {
        private static final long serialVersionUID = 0;

        public EntrySet() {
        }

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof pa5)) {
                return false;
            }
            pa5 pa5Var = (pa5) obj;
            return pa5Var.a() > 0 && ImmutableMultiset.this.s0(pa5Var.b()) == pa5Var.a();
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            return ImmutableMultiset.this.n(i);
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public final int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return ImmutableMultiset.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return ImmutableMultiset.this.b().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    public static class EntrySetSerializedForm<E> implements Serializable {
        public final ImmutableMultiset a;

        public EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.a = immutableMultiset;
        }

        public Object readResolve() {
            return this.a.entrySet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.oa5
    public final boolean K(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        ImmutableList immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListA = super.a();
        this.b = immutableListA;
        return immutableListA;
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int c(int i, Object[] objArr) {
        zx8 it = entrySet().iterator();
        while (it.hasNext()) {
            pa5 pa5Var = (pa5) it.next();
            Arrays.fill(objArr, i, pa5Var.a() + i, pa5Var.b());
            i += pa5Var.a();
        }
        return i;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return s0(obj) > 0;
    }

    @Override // java.util.Collection, defpackage.oa5
    public final boolean equals(Object obj) {
        return tt3.w(this, obj);
    }

    @Override // java.util.Collection, defpackage.oa5
    public final int hashCode() {
        return z0.f(entrySet());
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return new uj3(entrySet().iterator());
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.oa5, defpackage.q18
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet b();

    @Override // defpackage.oa5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet entrySet() {
        ImmutableSet entrySet = this.c;
        if (entrySet == null) {
            entrySet = isEmpty() ? RegularImmutableSet.j : new EntrySet();
            this.c = entrySet;
        }
        return entrySet;
    }

    public abstract pa5 n(int i);

    @Override // java.util.AbstractCollection
    public final String toString() {
        return entrySet().toString();
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public abstract Object writeReplace();
}
