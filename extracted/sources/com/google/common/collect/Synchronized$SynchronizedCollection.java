package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedCollection<E> extends Synchronized$SynchronizedObject implements Collection<E> {
    private static final long serialVersionUID = 0;

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean zAdd;
        synchronized (this.b) {
            zAdd = e().add(obj);
        }
        return zAdd;
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = e().addAll(collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.b) {
            e().clear();
        }
    }

    public boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.b) {
            zContains = e().contains(obj);
        }
        return zContains;
    }

    public boolean containsAll(Collection collection) {
        boolean zContainsAll;
        synchronized (this.b) {
            zContainsAll = e().containsAll(collection);
        }
        return zContainsAll;
    }

    public Collection e() {
        return (Collection) this.a;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean zIsEmpty;
        synchronized (this.b) {
            zIsEmpty = e().isEmpty();
        }
        return zIsEmpty;
    }

    public Iterator iterator() {
        return e().iterator();
    }

    public boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = e().remove(obj);
        }
        return zRemove;
    }

    public boolean removeAll(Collection collection) {
        boolean zRemoveAll;
        synchronized (this.b) {
            zRemoveAll = e().removeAll(collection);
        }
        return zRemoveAll;
    }

    public boolean retainAll(Collection collection) {
        boolean zRetainAll;
        synchronized (this.b) {
            zRetainAll = e().retainAll(collection);
        }
        return zRetainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.b) {
            size = e().size();
        }
        return size;
    }

    public Object[] toArray() {
        Object[] array;
        synchronized (this.b) {
            array = e().toArray();
        }
        return array;
    }

    public Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.b) {
            array = e().toArray(objArr);
        }
        return array;
    }
}
