package com.google.common.collect;

import defpackage.ml9;
import defpackage.wn5;
import defpackage.zx8;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {
    public static final /* synthetic */ int h = 0;
    private static final long serialVersionUID = 0;
    public final Range g;

    /* JADX INFO: renamed from: com.google.common.collect.RegularContiguousSet$3, reason: invalid class name */
    class AnonymousClass3 extends ImmutableAsList<Comparable> {
        @Override // java.util.List
        public final Object get(int i) {
            wn5.l(i, size());
            throw null;
        }

        @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableAsList
        public final ImmutableCollection z() {
            return null;
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final Range a;

        public SerializedForm(Range range) {
            this.a = range;
        }

        private Object readResolve() {
            return new RegularContiguousSet(this.a);
        }
    }

    public RegularContiguousSet(Range range) {
        this.g = range;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet C(Comparable comparable, boolean z) {
        return S(Range.g(comparable, BoundType.a(z)));
    }

    @Override // com.google.common.collect.ContiguousSet
    public final Range N() {
        Range range = this.g;
        return new Range(range.a.i(), range.b.j());
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet F(Comparable comparable, boolean z, Comparable comparable2, boolean z2) {
        return (comparable.compareTo(comparable2) != 0 || z || z2) ? S(Range.f(comparable, BoundType.a(z), comparable2, BoundType.a(z2))) : new EmptyContiguousSet();
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final ContiguousSet L(Comparable comparable, boolean z) {
        return S(Range.b(comparable, BoundType.a(z)));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final Comparable first() {
        Comparable comparableH = this.g.a.h();
        Objects.requireNonNull(comparableH);
        return comparableH;
    }

    public final ContiguousSet S(Range range) {
        Range range2 = this.g;
        if (!range2.e(range)) {
            return new EmptyContiguousSet();
        }
        range2.c(range);
        throw null;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final Comparable last() {
        Comparable comparableF = this.g.b.f();
        Objects.requireNonNull(comparableF);
        return comparableF;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.g.a((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return ml9.o(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            throw null;
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return z0.f(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return new q1(this, first(), 0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList p() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        first();
        last();
        throw null;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.g);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final zx8 descendingIterator() {
        return new q1(this, last(), 1);
    }
}
