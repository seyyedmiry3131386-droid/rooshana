package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedSortedSet<E> extends Synchronized$SynchronizedSet<E> implements SortedSet<E> {
    private static final long serialVersionUID = 0;

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        Comparator<? super E> comparator;
        synchronized (this.b) {
            comparator = e().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Object objFirst;
        synchronized (this.b) {
            objFirst = e().first();
        }
        return objFirst;
    }

    public SortedSet headSet(Object obj) {
        Synchronized$SynchronizedSortedSet synchronized$SynchronizedSortedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSortedSet = new Synchronized$SynchronizedSortedSet(e().headSet(obj), this.b);
        }
        return synchronized$SynchronizedSortedSet;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSet
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public SortedSet e() {
        return (SortedSet) super.e();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        Object objLast;
        synchronized (this.b) {
            objLast = e().last();
        }
        return objLast;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        Synchronized$SynchronizedSortedSet synchronized$SynchronizedSortedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSortedSet = new Synchronized$SynchronizedSortedSet(e().subSet(obj, obj2), this.b);
        }
        return synchronized$SynchronizedSortedSet;
    }

    public SortedSet tailSet(Object obj) {
        Synchronized$SynchronizedSortedSet synchronized$SynchronizedSortedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSortedSet = new Synchronized$SynchronizedSortedSet(e().tailSet(obj), this.b);
        }
        return synchronized$SynchronizedSortedSet;
    }
}
