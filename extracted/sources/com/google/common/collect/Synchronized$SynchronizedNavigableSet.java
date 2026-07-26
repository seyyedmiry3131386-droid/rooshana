package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedNavigableSet<E> extends Synchronized$SynchronizedSortedSet<E> implements NavigableSet<E> {
    private static final long serialVersionUID = 0;
    public transient NavigableSet c;

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        Object objCeiling;
        synchronized (this.b) {
            objCeiling = ((NavigableSet) super.e()).ceiling(obj);
        }
        return objCeiling;
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((NavigableSet) super.e()).descendingIterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        synchronized (this.b) {
            try {
                NavigableSet navigableSet = this.c;
                if (navigableSet != null) {
                    return navigableSet;
                }
                Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableSet) super.e()).descendingSet(), this.b);
                this.c = synchronized$SynchronizedNavigableSet;
                return synchronized$SynchronizedNavigableSet;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet, com.google.common.collect.Synchronized$SynchronizedSet, com.google.common.collect.Synchronized$SynchronizedCollection
    public final Collection e() {
        return (NavigableSet) super.e();
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        Object objFloor;
        synchronized (this.b) {
            objFloor = ((NavigableSet) super.e()).floor(obj);
        }
        return objFloor;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableSet) super.e()).headSet(obj, z), this.b);
        }
        return synchronized$SynchronizedNavigableSet;
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        Object objHigher;
        synchronized (this.b) {
            objHigher = ((NavigableSet) super.e()).higher(obj);
        }
        return objHigher;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet, com.google.common.collect.Synchronized$SynchronizedSet
    /* JADX INFO: renamed from: j */
    public final Set e() {
        return (NavigableSet) super.e();
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet
    /* JADX INFO: renamed from: l */
    public final SortedSet e() {
        return (NavigableSet) super.e();
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        Object objLower;
        synchronized (this.b) {
            objLower = ((NavigableSet) super.e()).lower(obj);
        }
        return objLower;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        Object objPollFirst;
        synchronized (this.b) {
            objPollFirst = ((NavigableSet) super.e()).pollFirst();
        }
        return objPollFirst;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Object objPollLast;
        synchronized (this.b) {
            objPollLast = ((NavigableSet) super.e()).pollLast();
        }
        return objPollLast;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableSet) super.e()).subSet(obj, z, obj2, z2), this.b);
        }
        return synchronized$SynchronizedNavigableSet;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableSet) super.e()).tailSet(obj, z), this.b);
        }
        return synchronized$SynchronizedNavigableSet;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
