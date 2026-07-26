package com.google.common.cache;

import defpackage.ek0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class LocalCache$LocalManualCache<K, V> implements ek0, Serializable {
    private static final long serialVersionUID = 1;
    public final d a;

    public LocalCache$LocalManualCache(d dVar) {
        this.a = dVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use ManualSerializationProxy");
    }

    public Object writeReplace() {
        return new LocalCache$ManualSerializationProxy(this.a);
    }
}
