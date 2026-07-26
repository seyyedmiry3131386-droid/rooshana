package com.google.common.collect;

import defpackage.s7;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n implements NavigableSet {
    public final /* synthetic */ AbstractMapBasedMultimap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
        super(abstractMapBasedMultimap, navigableMap);
        this.d = abstractMapBasedMultimap;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((j) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new l(this.d, f().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return f().floorKey(obj);
    }

    @Override // com.google.common.collect.n
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    @Override // com.google.common.collect.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return f().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return s7.V(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return s7.V(descendingIterator());
    }

    @Override // com.google.common.collect.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new l(this.d, f().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new l(this.d, f().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new l(this.d, f().tailMap(obj, z));
    }
}
