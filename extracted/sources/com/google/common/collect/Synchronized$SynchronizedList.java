package com.google.common.collect;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedList<E> extends Synchronized$SynchronizedCollection<E> implements List<E> {
    private static final long serialVersionUID = 0;

    @Override // java.util.List
    public final void add(int i, Object obj) {
        synchronized (this.b) {
            e().add(i, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        boolean zAddAll;
        synchronized (this.b) {
            zAddAll = e().addAll(i, collection);
        }
        return zAddAll;
    }

    @Override // java.util.Collection, java.util.List
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

    @Override // java.util.List
    public final Object get(int i) {
        Object obj;
        synchronized (this.b) {
            obj = e().get(i);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.b) {
            iIndexOf = e().indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final List e() {
        return (List) ((Collection) this.a);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.b) {
            iLastIndexOf = e().lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return e().listIterator();
    }

    @Override // java.util.List
    public final Object remove(int i) {
        Object objRemove;
        synchronized (this.b) {
            objRemove = e().remove(i);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        Object obj2;
        synchronized (this.b) {
            obj2 = e().set(i, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        List listH;
        synchronized (this.b) {
            listH = z0.h(this.b, e().subList(i, i2));
        }
        return listH;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return e().listIterator(i);
    }
}
