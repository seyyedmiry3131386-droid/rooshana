package com.google.common.collect;

import defpackage.kq7;
import defpackage.wn5;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractMapBasedMultimap<K, V> extends defpackage.n1 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;
    public transient Map f;
    public transient int g;

    @Override // defpackage.fa5
    public Collection a(Object obj) {
        Collection collection = (Collection) this.f.remove(obj);
        if (collection == null) {
            return p();
        }
        Collection collectionL = l();
        collectionL.addAll(collection);
        this.g -= collection.size();
        collection.clear();
        return r(collectionL);
    }

    @Override // defpackage.n1
    public Map c() {
        return new h(this, this.f);
    }

    @Override // defpackage.fa5
    public void clear() {
        Iterator<V> it = this.f.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f.clear();
        this.g = 0;
    }

    @Override // defpackage.fa5
    public boolean containsKey(Object obj) {
        return this.f.containsKey(obj);
    }

    @Override // defpackage.n1
    public Set e() {
        return new j(this, this.f);
    }

    @Override // defpackage.n1
    public final Collection f() {
        return new defpackage.l1(this, 1);
    }

    @Override // defpackage.n1
    public Collection g() {
        Collection m1Var = this.a;
        if (m1Var == null) {
            m1Var = this instanceof kq7 ? new defpackage.m1(this, 0) : new defpackage.l1(this, 0);
            this.a = m1Var;
        }
        return m1Var;
    }

    @Override // defpackage.fa5
    public Collection get(Object obj) {
        Collection collectionM = (Collection) this.f.get(obj);
        if (collectionM == null) {
            collectionM = m(obj);
        }
        return s(obj, collectionM);
    }

    @Override // defpackage.n1
    public Iterator j() {
        return new f(this);
    }

    @Override // defpackage.n1
    public Iterator k() {
        return new defpackage.f1(this);
    }

    public abstract Collection l();

    public Collection m(Object obj) {
        return l();
    }

    public final h n() {
        Map map = this.f;
        return map instanceof NavigableMap ? new k(this, (NavigableMap) this.f) : map instanceof SortedMap ? new m(this, (SortedMap) this.f) : new h(this, this.f);
    }

    public final j o() {
        Map map = this.f;
        return map instanceof NavigableMap ? new l(this, (NavigableMap) this.f) : map instanceof SortedMap ? new n(this, (SortedMap) this.f) : new j(this, this.f);
    }

    public Collection p() {
        return r(l());
    }

    @Override // defpackage.fa5
    public boolean put(Object obj, Object obj2) {
        Collection collection = (Collection) this.f.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.g++;
            return true;
        }
        Collection collectionM = m(obj);
        if (!collectionM.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.g++;
        this.f.put(obj, collectionM);
        return true;
    }

    public final void q(Map map) {
        this.f = map;
        this.g = 0;
        for (V v : map.values()) {
            wn5.j(!v.isEmpty());
            this.g = v.size() + this.g;
        }
    }

    public Collection r(Collection collection) {
        return DesugarCollections.unmodifiableCollection(collection);
    }

    public Collection s(Object obj, Collection collection) {
        return new o(this, obj, collection, null);
    }

    @Override // defpackage.fa5
    public int size() {
        return this.g;
    }
}
