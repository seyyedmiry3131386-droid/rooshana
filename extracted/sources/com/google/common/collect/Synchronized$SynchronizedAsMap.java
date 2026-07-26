package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedAsMap<K, V> extends Synchronized$SynchronizedMap<K, Collection<V>> {
    private static final long serialVersionUID = 0;
    public transient Set f;
    public transient Collection g;

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.b) {
            try {
                if (this.f == null) {
                    this.f = new Synchronized$SynchronizedAsMapEntries(((Map) this.a).entrySet(), this.b);
                }
                set = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final Object get(Object obj) {
        Collection collectionA;
        synchronized (this.b) {
            Collection collection = (Collection) super.get(obj);
            collectionA = collection == null ? null : z0.a(this.b, collection);
        }
        return collectionA;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final Collection values() {
        Collection collection;
        synchronized (this.b) {
            try {
                if (this.g == null) {
                    this.g = new Synchronized$SynchronizedAsMapValues(((Map) this.a).values(), this.b);
                }
                collection = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }
}
