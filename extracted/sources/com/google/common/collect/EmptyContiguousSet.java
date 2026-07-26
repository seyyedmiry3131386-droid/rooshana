package com.google.common.collect;

import defpackage.mj3;
import defpackage.pt3;
import defpackage.zx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class EmptyContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return new EmptyContiguousSet();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet F(Object obj, boolean z, Object obj2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: M */
    public final ContiguousSet C(Comparable comparable, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range N() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: O */
    public final ContiguousSet F(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return this;
    }

    @Override // com.google.common.collect.ContiguousSet
    /* JADX INFO: renamed from: P */
    public final ContiguousSet L(Comparable comparable, boolean z) {
        return this;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        mj3 mj3Var = ImmutableList.b;
        return RegularImmutableList.e;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Iterator descendingIterator() {
        return pt3.d;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return pt3.d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return pt3.d;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 0;
    }

    @Override // com.google.common.collect.ContiguousSet, java.util.AbstractCollection
    public final String toString() {
        return "[]";
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet w() {
        NaturalOrdering.c.getClass();
        return ImmutableSortedSet.z(ReverseNaturalOrdering.a);
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: x */
    public final zx8 descendingIterator() {
        return pt3.d;
    }
}
