package com.google.common.collect;

import defpackage.hs9;
import defpackage.mi4;
import defpackage.s7;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class h extends mi4 {
    public final transient Map d;
    public final /* synthetic */ AbstractMapBasedMultimap e;

    public h(AbstractMapBasedMultimap abstractMapBasedMultimap, Map map) {
        this.e = abstractMapBasedMultimap;
        this.d = map;
    }

    @Override // defpackage.mi4
    public final Set a() {
        return new g(this);
    }

    public final Map.Entry c(Map.Entry entry) {
        Object key = entry.getKey();
        return new ImmutableEntry(key, this.e.s(key, (Collection) entry.getValue()));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.e;
        if (this.d == abstractMapBasedMultimap.f) {
            abstractMapBasedMultimap.clear();
        } else {
            s7.f(new a(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Collection collection = (Collection) hs9.Q(this.d, obj);
        if (collection == null) {
            return null;
        }
        return this.e.s(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.mi4, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.e.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.d.remove(obj);
        if (collection == null) {
            return null;
        }
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.e;
        Collection collectionL = abstractMapBasedMultimap.l();
        collectionL.addAll(collection);
        abstractMapBasedMultimap.g -= collection.size();
        collection.clear();
        return collectionL;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.d.toString();
    }
}
