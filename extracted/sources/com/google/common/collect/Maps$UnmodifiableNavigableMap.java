package com.google.common.collect;

import defpackage.hs9;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
class Maps$UnmodifiableNavigableMap<K, V> extends g0 implements NavigableMap<K, V>, Serializable {
    public final NavigableMap s;
    public transient Maps$UnmodifiableNavigableMap t;

    public Maps$UnmodifiableNavigableMap(NavigableMap navigableMap) {
        super(16);
        this.s = navigableMap;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return DesugarCollections.unmodifiableSortedMap(this.s);
    }

    @Override // defpackage.yj2
    public final Map Y() {
        return DesugarCollections.unmodifiableSortedMap(this.s);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return hs9.n(this.s.ceilingEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return this.s.ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return z0.k(this.s.descendingKeySet());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        Maps$UnmodifiableNavigableMap maps$UnmodifiableNavigableMap = this.t;
        if (maps$UnmodifiableNavigableMap != null) {
            return maps$UnmodifiableNavigableMap;
        }
        Maps$UnmodifiableNavigableMap maps$UnmodifiableNavigableMap2 = new Maps$UnmodifiableNavigableMap(this.s.descendingMap(), this);
        this.t = maps$UnmodifiableNavigableMap2;
        return maps$UnmodifiableNavigableMap2;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        return hs9.n(this.s.firstEntry());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return hs9.n(this.s.floorEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return this.s.floorKey(obj);
    }

    @Override // java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return hs9.n(this.s.higherEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return this.s.higherKey(obj);
    }

    @Override // defpackage.yj2, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        return hs9.n(this.s.lastEntry());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return hs9.n(this.s.lowerEntry(obj));
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return this.s.lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return z0.k(this.s.navigableKeySet());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        NavigableMap<K, V> navigableMapHeadMap = this.s.headMap(obj, z);
        navigableMapHeadMap.getClass();
        return navigableMapHeadMap instanceof Maps$UnmodifiableNavigableMap ? navigableMapHeadMap : new Maps$UnmodifiableNavigableMap(navigableMapHeadMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableMap<K, V> navigableMapSubMap = this.s.subMap(obj, z, obj2, z2);
        navigableMapSubMap.getClass();
        return navigableMapSubMap instanceof Maps$UnmodifiableNavigableMap ? navigableMapSubMap : new Maps$UnmodifiableNavigableMap(navigableMapSubMap);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        NavigableMap<K, V> navigableMapTailMap = this.s.tailMap(obj, z);
        navigableMapTailMap.getClass();
        return navigableMapTailMap instanceof Maps$UnmodifiableNavigableMap ? navigableMapTailMap : new Maps$UnmodifiableNavigableMap(navigableMapTailMap);
    }

    public Maps$UnmodifiableNavigableMap(NavigableMap navigableMap, Maps$UnmodifiableNavigableMap maps$UnmodifiableNavigableMap) {
        super(16);
        this.s = navigableMap;
        this.t = maps$UnmodifiableNavigableMap;
    }
}
