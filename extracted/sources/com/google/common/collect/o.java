package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o extends AbstractCollection {
    public final Object a;
    public Collection b;
    public final o c;
    public final Collection d;
    public final /* synthetic */ AbstractMapBasedMultimap e;

    public o(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, Collection collection, o oVar) {
        this.e = abstractMapBasedMultimap;
        this.a = obj;
        this.b = collection;
        this.c = oVar;
        this.d = oVar == null ? null : oVar.b;
    }

    public final void a() {
        o oVar = this.c;
        if (oVar != null) {
            oVar.a();
        } else {
            this.e.f.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.e.g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            this.e.g += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void c() {
        Collection collection;
        o oVar = this.c;
        if (oVar != null) {
            oVar.c();
            if (oVar.b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.b.isEmpty() || (collection = (Collection) this.e.f.get(this.a)) == null) {
                return;
            }
            this.b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.e.g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.b.containsAll(collection);
    }

    public final void d() {
        o oVar = this.c;
        if (oVar != null) {
            oVar.d();
        } else if (this.b.isEmpty()) {
            this.e.f.remove(this.a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new a(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            AbstractMapBasedMultimap abstractMapBasedMultimap = this.e;
            abstractMapBasedMultimap.g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            this.e.g += this.b.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            this.e.g += this.b.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.b.toString();
    }
}
