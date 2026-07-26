package com.google.common.collect;

import defpackage.s7;
import defpackage.wn5;
import defpackage.xa0;
import defpackage.yj2;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class AbstractBiMap<K, V> extends yj2 implements xa0, Serializable {
    private static final long serialVersionUID = 0;
    public transient AbstractMap s;
    public transient AbstractBiMap t;
    public transient d u;
    public transient c v;
    public transient c w;

    public static class Inverse<K, V> extends AbstractBiMap<K, V> {
        private static final long serialVersionUID = 0;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.t = (AbstractBiMap) object;
        }

        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.t);
        }

        @Override // com.google.common.collect.AbstractBiMap, defpackage.hs9
        /* JADX INFO: renamed from: A */
        public final Object Y() {
            return this.s;
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object Z(Object obj) {
            return this.t.a0(obj);
        }

        @Override // com.google.common.collect.AbstractBiMap
        public final Object a0(Object obj) {
            return this.t.Z(obj);
        }

        public Object readResolve() {
            return this.t.y();
        }

        @Override // com.google.common.collect.AbstractBiMap, defpackage.yj2, java.util.Map
        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public Object Y() {
        return this.s;
    }

    @Override // defpackage.yj2
    public final Map Y() {
        return this.s;
    }

    public Object Z(Object obj) {
        return obj;
    }

    public Object a0(Object obj) {
        return obj;
    }

    public final void b0(EnumMap enumMap, AbstractMap abstractMap) {
        wn5.t(this.s == null);
        wn5.t(this.t == null);
        wn5.j(enumMap.isEmpty());
        wn5.j(abstractMap.isEmpty());
        wn5.j(enumMap != abstractMap);
        this.s = enumMap;
        Inverse inverse = new Inverse(16);
        inverse.s = abstractMap;
        inverse.t = this;
        this.t = inverse;
    }

    @Override // defpackage.yj2, java.util.Map
    public void clear() {
        this.s.clear();
        this.t.s.clear();
    }

    @Override // defpackage.yj2, java.util.Map
    public boolean containsValue(Object obj) {
        return this.t.containsKey(obj);
    }

    @Override // defpackage.yj2, java.util.Map
    public Set entrySet() {
        c cVar = this.w;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 0);
        this.w = cVar2;
        return cVar2;
    }

    @Override // defpackage.yj2, java.util.Map
    public Set keySet() {
        d dVar = this.u;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.u = dVar2;
        return dVar2;
    }

    @Override // defpackage.yj2, java.util.Map
    public Object put(Object obj, Object obj2) {
        Z(obj);
        a0(obj2);
        boolean zContainsKey = containsKey(obj);
        if (zContainsKey && s7.l(obj2, get(obj))) {
            return obj2;
        }
        wn5.g(obj2, "value already present: %s", !containsValue(obj2));
        Object objPut = this.s.put(obj, obj2);
        if (zContainsKey) {
            this.t.s.remove(objPut);
        }
        this.t.s.put(obj2, obj);
        return objPut;
    }

    @Override // defpackage.yj2, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // defpackage.yj2, java.util.Map
    public Object remove(Object obj) {
        if (!containsKey(obj)) {
            return null;
        }
        Object objRemove = this.s.remove(obj);
        this.t.s.remove(objRemove);
        return objRemove;
    }

    @Override // defpackage.xa0
    public xa0 y() {
        return this.t;
    }

    @Override // defpackage.yj2, java.util.Map
    public Set values() {
        c cVar = this.v;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 1);
        this.v = cVar2;
        return cVar2;
    }
}
