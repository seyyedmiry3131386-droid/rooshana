package com.google.common.collect;

import defpackage.wn5;
import java.lang.Comparable;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {
    public static final /* synthetic */ int f = 0;

    public ContiguousSet() {
        super(NaturalOrdering.c);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: A */
    public final ImmutableSortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return C(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: B */
    public final ImmutableSortedSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return C(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D */
    public final ImmutableSortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        wn5.j(this.d.compare(comparable, comparable2) <= 0);
        return F(comparable, true, comparable2, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: E */
    public final ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        wn5.j(this.d.compare(comparable, comparable2) <= 0);
        return F(comparable, z, comparable2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: G */
    public final ImmutableSortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return L(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: H */
    public final ImmutableSortedSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return L(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: M */
    public abstract ContiguousSet C(Comparable comparable, boolean z);

    public abstract Range N();

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: O */
    public abstract ContiguousSet F(Comparable comparable, boolean z, Comparable comparable2, boolean z2);

    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: P */
    public abstract ContiguousSet L(Comparable comparable, boolean z);

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return C(comparable, z);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        wn5.j(this.d.compare(comparable, comparable2) <= 0);
        return F(comparable, z, comparable2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return L(comparable, z);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return N().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public ImmutableSortedSet w() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return C(comparable, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return L(comparable, true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        wn5.j(this.d.compare(comparable, comparable2) <= 0);
        return F(comparable, true, comparable2, false);
    }
}
