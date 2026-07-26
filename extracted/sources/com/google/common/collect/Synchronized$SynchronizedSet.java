package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedSet<E> extends Synchronized$SynchronizedCollection<E> implements Set<E> {
    private static final long serialVersionUID = 0;

    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.b) {
            zEquals = e().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = e().hashCode();
        }
        return iHashCode;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set e() {
        return (Set) ((Collection) this.a);
    }
}
