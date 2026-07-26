package com.google.common.collect;

import defpackage.hs9;
import defpackage.ji4;
import defpackage.m48;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class s1 extends AbstractMap {
    public final Object a;
    public Map b;
    public final /* synthetic */ StandardTable c;

    public s1(StandardTable standardTable, Object obj) {
        this.c = standardTable;
        obj.getClass();
        this.a = obj;
    }

    public Map a() {
        throw null;
    }

    public final Iterator b() {
        d();
        Map map = this.b;
        return map == null ? Iterators$EmptyModifiableIterator.a : new m48(this, map.entrySet().iterator());
    }

    public void c() {
        d();
        Map map = this.b;
        if (map != null && map.isEmpty()) {
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        d();
        Map map = this.b;
        if (map != null) {
            map.clear();
        }
        c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Map map;
        boolean zContainsKey;
        d();
        if (obj != null && (map = this.b) != null) {
            try {
                zContainsKey = map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                zContainsKey = false;
            }
            if (zContainsKey) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        Map map = this.b;
        if (map == null) {
            this.b = a();
        } else if (map.isEmpty()) {
            throw null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new ji4(this, 0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map;
        d();
        if (obj == null || (map = this.b) == null) {
            return null;
        }
        return hs9.Q(map, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        Map map = this.b;
        return (map == null || map.isEmpty()) ? this.c.j(this.a, obj, obj2) : this.b.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        d();
        Map map = this.b;
        Object objRemove = null;
        if (map == null) {
            return null;
        }
        try {
            objRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
        }
        c();
        return objRemove;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        d();
        Map map = this.b;
        if (map == null) {
            return 0;
        }
        return map.size();
    }
}
