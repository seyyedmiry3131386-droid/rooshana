package com.google.common.collect;

import defpackage.b47;
import defpackage.xa0;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class EnumHashBiMap<K extends Enum<K>, V> extends AbstractBiMap<K, V> {
    private static final long serialVersionUID = 0;
    public transient Class x;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        this.x = (Class) object;
        b0(new EnumMap(this.x), new HashMap());
        b47.j(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.x);
        b47.w(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractBiMap
    public final Object Z(Object obj) {
        Enum r1 = (Enum) obj;
        r1.getClass();
        return r1;
    }

    @Override // com.google.common.collect.AbstractBiMap, defpackage.yj2, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.t.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractBiMap, defpackage.yj2, java.util.Map
    public final Object put(Object obj, Object obj2) {
        return super.put((Enum) obj, obj2);
    }

    @Override // com.google.common.collect.AbstractBiMap, defpackage.xa0
    public final xa0 y() {
        return this.t;
    }
}
