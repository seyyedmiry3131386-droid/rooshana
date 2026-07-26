package com.google.common.collect;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedSortedMap<K, V> extends Synchronized$SynchronizedMap<K, V> implements SortedMap<K, V> {
    private static final long serialVersionUID = 0;

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        Comparator<? super K> comparator;
        synchronized (this.b) {
            comparator = e().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        Object objFirstKey;
        synchronized (this.b) {
            objFirstKey = e().firstKey();
        }
        return objFirstKey;
    }

    public SortedMap headMap(Object obj) {
        Synchronized$SynchronizedSortedMap synchronized$SynchronizedSortedMap;
        synchronized (this.b) {
            synchronized$SynchronizedSortedMap = new Synchronized$SynchronizedSortedMap(e().headMap(obj), this.b);
        }
        return synchronized$SynchronizedSortedMap;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public SortedMap e() {
        return (SortedMap) ((Map) this.a);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        Object objLastKey;
        synchronized (this.b) {
            objLastKey = e().lastKey();
        }
        return objLastKey;
    }

    public SortedMap subMap(Object obj, Object obj2) {
        Synchronized$SynchronizedSortedMap synchronized$SynchronizedSortedMap;
        synchronized (this.b) {
            synchronized$SynchronizedSortedMap = new Synchronized$SynchronizedSortedMap(e().subMap(obj, obj2), this.b);
        }
        return synchronized$SynchronizedSortedMap;
    }

    public SortedMap tailMap(Object obj) {
        Synchronized$SynchronizedSortedMap synchronized$SynchronizedSortedMap;
        synchronized (this.b) {
            synchronized$SynchronizedSortedMap = new Synchronized$SynchronizedSortedMap(e().tailMap(obj), this.b);
        }
        return synchronized$SynchronizedSortedMap;
    }
}
