package com.google.common.collect;

import defpackage.s7;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class Sets$UnmodifiableNavigableSet<E> extends h0 implements NavigableSet<E>, Serializable {
    private static final long serialVersionUID = 0;
    public final NavigableSet s;
    public final SortedSet t;
    public transient Sets$UnmodifiableNavigableSet u;

    public Sets$UnmodifiableNavigableSet(NavigableSet navigableSet) {
        super(16);
        navigableSet.getClass();
        this.s = navigableSet;
        this.t = DesugarCollections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.fk2, defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return this.t;
    }

    @Override // defpackage.fk2, defpackage.uj2
    public final Collection Y() {
        return this.t;
    }

    @Override // defpackage.fk2
    /* JADX INFO: renamed from: Z */
    public final Set Y() {
        return this.t;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return this.s.ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return s7.h0(this.s.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        Sets$UnmodifiableNavigableSet sets$UnmodifiableNavigableSet = this.u;
        if (sets$UnmodifiableNavigableSet != null) {
            return sets$UnmodifiableNavigableSet;
        }
        Sets$UnmodifiableNavigableSet sets$UnmodifiableNavigableSet2 = new Sets$UnmodifiableNavigableSet(this.s.descendingSet());
        this.u = sets$UnmodifiableNavigableSet2;
        sets$UnmodifiableNavigableSet2.u = this;
        return sets$UnmodifiableNavigableSet2;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return this.s.floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return z0.k(this.s.headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return this.s.higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return this.s.lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return z0.k(this.s.subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return z0.k(this.s.tailSet(obj, z));
    }
}
