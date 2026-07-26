package com.google.common.collect;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedNavigableMap<K, V> extends Synchronized$SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {
    private static final long serialVersionUID = 0;
    public transient NavigableSet f;
    public transient NavigableMap g;
    public transient NavigableSet h;

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).ceilingEntry(obj), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Object objCeilingKey;
        synchronized (this.b) {
            objCeilingKey = ((NavigableMap) super.e()).ceilingKey(obj);
        }
        return objCeilingKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        synchronized (this.b) {
            try {
                NavigableSet navigableSet = this.f;
                if (navigableSet != null) {
                    return navigableSet;
                }
                Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableMap) super.e()).descendingKeySet(), this.b);
                this.f = synchronized$SynchronizedNavigableSet;
                return synchronized$SynchronizedNavigableSet;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        synchronized (this.b) {
            try {
                NavigableMap navigableMap = this.g;
                if (navigableMap != null) {
                    return navigableMap;
                }
                Synchronized$SynchronizedNavigableMap synchronized$SynchronizedNavigableMap = new Synchronized$SynchronizedNavigableMap(((NavigableMap) super.e()).descendingMap(), this.b);
                this.g = synchronized$SynchronizedNavigableMap;
                return synchronized$SynchronizedNavigableMap;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedMap, com.google.common.collect.Synchronized$SynchronizedMap
    public final Map e() {
        return (NavigableMap) super.e();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).firstEntry(), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).floorEntry(obj), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Object objFloorKey;
        synchronized (this.b) {
            objFloorKey = ((NavigableMap) super.e()).floorKey(obj);
        }
        return objFloorKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        Synchronized$SynchronizedNavigableMap synchronized$SynchronizedNavigableMap;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableMap = new Synchronized$SynchronizedNavigableMap(((NavigableMap) super.e()).headMap(obj, z), this.b);
        }
        return synchronized$SynchronizedNavigableMap;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).higherEntry(obj), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Object objHigherKey;
        synchronized (this.b) {
            objHigherKey = ((NavigableMap) super.e()).higherKey(obj);
        }
        return objHigherKey;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedMap
    /* JADX INFO: renamed from: j */
    public final SortedMap e() {
        return (NavigableMap) super.e();
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final Set keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).lastEntry(), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).lowerEntry(obj), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Object objLowerKey;
        synchronized (this.b) {
            objLowerKey = ((NavigableMap) super.e()).lowerKey(obj);
        }
        return objLowerKey;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        synchronized (this.b) {
            try {
                NavigableSet navigableSet = this.h;
                if (navigableSet != null) {
                    return navigableSet;
                }
                Synchronized$SynchronizedNavigableSet synchronized$SynchronizedNavigableSet = new Synchronized$SynchronizedNavigableSet(((NavigableMap) super.e()).navigableKeySet(), this.b);
                this.h = synchronized$SynchronizedNavigableSet;
                return synchronized$SynchronizedNavigableSet;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).pollFirstEntry(), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        Map.Entry entryB;
        synchronized (this.b) {
            entryB = z0.b(((NavigableMap) super.e()).pollLastEntry(), this.b);
        }
        return entryB;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        Synchronized$SynchronizedNavigableMap synchronized$SynchronizedNavigableMap;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableMap = new Synchronized$SynchronizedNavigableMap(((NavigableMap) super.e()).subMap(obj, z, obj2, z2), this.b);
        }
        return synchronized$SynchronizedNavigableMap;
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        Synchronized$SynchronizedNavigableMap synchronized$SynchronizedNavigableMap;
        synchronized (this.b) {
            synchronized$SynchronizedNavigableMap = new Synchronized$SynchronizedNavigableMap(((NavigableMap) super.e()).tailMap(obj, z), this.b);
        }
        return synchronized$SynchronizedNavigableMap;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
