package com.google.common.collect;

import defpackage.ck6;
import defpackage.sa5;
import defpackage.yj2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class MutableClassToInstanceMap<B> extends yj2 implements Map, Serializable {

    public static final class SerializedForm<B> implements Serializable {
        private static final long serialVersionUID = 0;

        public Object readResolve() {
            throw null;
        }
    }

    public static Object Z(Class cls, Object obj) {
        Map map = ck6.a;
        cls.getClass();
        Class cls2 = (Class) ck6.a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return cls.cast(obj);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private Object writeReplace() {
        throw null;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        throw null;
    }

    @Override // defpackage.yj2
    public final Map Y() {
        throw null;
    }

    @Override // defpackage.yj2, java.util.Map
    public final Set entrySet() {
        return new sa5(this);
    }

    @Override // defpackage.yj2, java.util.Map
    public final Object put(Object obj, Object obj2) {
        Class cls = (Class) obj;
        Z(cls, obj2);
        return super.put(cls, obj2);
    }

    @Override // defpackage.yj2, java.util.Map
    public final void putAll(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Z((Class) entry.getKey(), entry.getValue());
        }
        super.putAll(linkedHashMap);
    }
}
