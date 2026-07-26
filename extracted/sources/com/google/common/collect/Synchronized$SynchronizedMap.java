package com.google.common.collect;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedMap<K, V> extends Synchronized$SynchronizedObject implements Map<K, V> {
    private static final long serialVersionUID = 0;
    public transient Set c;
    public transient Collection d;
    public transient Set e;

    @Override // java.util.Map
    public final void clear() {
        synchronized (this.b) {
            e().clear();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = e().containsKey(obj);
        }
        return zContainsKey;
    }

    public boolean containsValue(Object obj) {
        boolean zContainsValue;
        synchronized (this.b) {
            zContainsValue = e().containsValue(obj);
        }
        return zContainsValue;
    }

    public Map e() {
        return (Map) this.a;
    }

    public Set entrySet() {
        Set set;
        synchronized (this.b) {
            try {
                if (this.e == null) {
                    this.e = new Synchronized$SynchronizedSet(e().entrySet(), this.b);
                }
                set = this.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.b) {
            zEquals = e().equals(obj);
        }
        return zEquals;
    }

    public Object get(Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = e().get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = e().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // java.util.Map
    public Set keySet() {
        Set set;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = new Synchronized$SynchronizedSet(e().keySet(), this.b);
                }
                set = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        Object objPut;
        synchronized (this.b) {
            objPut = e().put(obj, obj2);
        }
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        synchronized (this.b) {
            e().putAll(map);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = e().remove(obj);
        }
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        int size;
        synchronized (this.b) {
            size = e().size();
        }
        return size;
    }

    public Collection values() {
        Collection collection;
        synchronized (this.b) {
            try {
                if (this.d == null) {
                    this.d = new Synchronized$SynchronizedCollection(e().values(), this.b);
                }
                collection = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }
}
