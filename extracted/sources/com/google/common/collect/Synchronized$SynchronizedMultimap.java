package com.google.common.collect;

import defpackage.fa5;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedMultimap<K, V> extends Synchronized$SynchronizedObject implements fa5 {
    private static final long serialVersionUID = 0;
    public transient Collection c;

    public Collection a(Object obj) {
        Collection collectionA;
        synchronized (this.b) {
            collectionA = e().a(obj);
        }
        return collectionA;
    }

    @Override // defpackage.fa5
    public final void clear() {
        synchronized (this.b) {
            e().clear();
        }
    }

    @Override // defpackage.fa5
    public final boolean containsKey(Object obj) {
        boolean zContainsKey;
        synchronized (this.b) {
            zContainsKey = e().containsKey(obj);
        }
        return zContainsKey;
    }

    public fa5 e() {
        return (fa5) this.a;
    }

    @Override // defpackage.fa5
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

    public Collection get(Object obj) {
        Collection collectionA;
        synchronized (this.b) {
            collectionA = z0.a(this.b, e().get(obj));
        }
        return collectionA;
    }

    @Override // defpackage.fa5
    public final Map h() {
        synchronized (this.b) {
        }
        return null;
    }

    @Override // defpackage.fa5
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // defpackage.fa5
    public final boolean i(Object obj, Object obj2) {
        boolean zI;
        synchronized (this.b) {
            zI = e().i(obj, obj2);
        }
        return zI;
    }

    @Override // defpackage.fa5
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = e().isEmpty();
        }
        return zIsEmpty;
    }

    @Override // defpackage.fa5
    public final Set keySet() {
        synchronized (this.b) {
        }
        return null;
    }

    @Override // defpackage.fa5
    public final boolean put(Object obj, Object obj2) {
        throw null;
    }

    @Override // defpackage.fa5
    public final boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = e().remove(obj, obj2);
        }
        return zRemove;
    }

    @Override // defpackage.fa5
    public final int size() {
        int size;
        synchronized (this.b) {
            size = e().size();
        }
        return size;
    }

    @Override // defpackage.fa5
    public final Collection values() {
        Collection collection;
        synchronized (this.b) {
            try {
                if (this.c == null) {
                    this.c = new Synchronized$SynchronizedCollection(e().values(), this.b);
                }
                collection = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return collection;
    }
}
