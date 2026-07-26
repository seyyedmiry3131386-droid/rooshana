package com.google.common.collect;

import defpackage.s7;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class r extends t implements NavigableSet {
    public final /* synthetic */ AbstractMapBasedMultimap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, NavigableSet navigableSet, o oVar) {
        super(abstractMapBasedMultimap, obj, navigableSet, oVar);
        this.g = abstractMapBasedMultimap;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceiling(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new a(this, e().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return h(e().descendingSet());
    }

    @Override // com.google.common.collect.t
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableSet e() {
        return (NavigableSet) ((SortedSet) this.b);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floor(obj);
    }

    public final r h(NavigableSet navigableSet) {
        o oVar = this.c;
        if (oVar == null) {
            oVar = this;
        }
        return new r(this.g, this.a, navigableSet, oVar);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return h(e().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return s7.V(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return s7.V(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return h(e().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return h(e().tailSet(obj, z));
    }
}
