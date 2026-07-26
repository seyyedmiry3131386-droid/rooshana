package com.google.common.collect;

import defpackage.hi4;
import defpackage.ml9;
import defpackage.tv8;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedAsMapEntries<K, V> extends Synchronized$SynchronizedSet<Map.Entry<K, Collection<V>>> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        synchronized (this.b) {
            zContains = !(obj instanceof Map.Entry) ? false : e().contains(new hi4((Map.Entry) obj));
        }
        return zContains;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        boolean zO;
        synchronized (this.b) {
            zO = ml9.o(e(), collection);
        }
        return zO;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zC;
        if (obj == this) {
            return true;
        }
        synchronized (this.b) {
            zC = z0.c(e(), obj);
        }
        return zC;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new l1(this, super.iterator(), 1);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        boolean zRemove;
        synchronized (this.b) {
            zRemove = !(obj instanceof Map.Entry) ? false : e().remove(new hi4((Map.Entry) obj));
        }
        return zRemove;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        boolean z;
        synchronized (this.b) {
            Iterator it = e().iterator();
            collection.getClass();
            z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z;
        synchronized (this.b) {
            Iterator it = e().iterator();
            collection.getClass();
            z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr;
        synchronized (this.b) {
            Set setE = e();
            objArr = new Object[setE.size()];
            tv8.m(setE, objArr);
        }
        return objArr;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Object[] objArrD;
        synchronized (this.b) {
            objArrD = tv8.D(e(), objArr);
        }
        return objArrD;
    }
}
