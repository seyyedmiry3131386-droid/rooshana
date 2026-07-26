package com.google.common.collect;

import defpackage.s18;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements s18 {
    private static final long serialVersionUID = 430848587173315748L;

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection p() {
        SortedSet sortedSetL = l();
        return sortedSetL instanceof NavigableSet ? z0.k((NavigableSet) sortedSetL) : DesugarCollections.unmodifiableSortedSet(sortedSetL);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection r(Collection collection) {
        return collection instanceof NavigableSet ? z0.k((NavigableSet) collection) : DesugarCollections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    public final Collection s(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new r(this, obj, (NavigableSet) collection, null) : new t(this, obj, (SortedSet) collection, null);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: v */
    public final Set p() {
        SortedSet sortedSetL = l();
        return sortedSetL instanceof NavigableSet ? z0.k((NavigableSet) sortedSetL) : DesugarCollections.unmodifiableSortedSet(sortedSetL);
    }

    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet l();

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public SortedSet a(Object obj) {
        return (SortedSet) super.a(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, defpackage.fa5
    public SortedSet get(Object obj) {
        return (SortedSet) super.get(obj);
    }
}
