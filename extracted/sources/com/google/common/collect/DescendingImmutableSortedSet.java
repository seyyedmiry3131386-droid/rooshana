package com.google.common.collect;

import defpackage.zx8;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes.dex */
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public final ImmutableSortedSet f;

    public DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(p1.b(immutableSortedSet.d).h());
        this.f = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C(Object obj, boolean z) {
        return this.f.tailSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet F(Object obj, boolean z, Object obj2, boolean z2) {
        return this.f.subSet(obj2, z2, obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z) {
        return this.f.headSet(obj, z).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.f.floor(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.f.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.f.ceiling(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.f.lower(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return this.f.i();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.f.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return this.f.descendingIterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.f.higher(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet w() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: x */
    public final zx8 descendingIterator() {
        return this.f.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: y */
    public final ImmutableSortedSet descendingSet() {
        return this.f;
    }
}
