package com.google.common.collect;

import defpackage.pa5;
import defpackage.q18;

/* JADX INFO: loaded from: classes.dex */
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public final transient ImmutableSortedMultiset g;

    public DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.g = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, defpackage.q18
    public final q18 J() {
        return this.g;
    }

    @Override // defpackage.q18
    public final pa5 firstEntry() {
        return this.g.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return this.g.i();
    }

    @Override // defpackage.q18
    public final pa5 lastEntry() {
        return this.g.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final pa5 n(int i) {
        return (pa5) this.g.entrySet().a().w().get(i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: o */
    public final ImmutableSortedMultiset J() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedSet b() {
        return this.g.b().descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, defpackage.q18
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset k0(Object obj, BoundType boundType) {
        return this.g.D0(obj, boundType).J();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, defpackage.q18
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMultiset D0(Object obj, BoundType boundType) {
        return this.g.k0(obj, boundType).J();
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        return this.g.s0(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.g.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
