package com.google.common.cache;

import defpackage.yp2;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class LocalCache$LoadingSerializationProxy<K, V> extends LocalCache$ManualSerializationProxy<K, V> implements yp2, Serializable {
    private static final long serialVersionUID = 1;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Y().a();
        throw null;
    }

    private Object readResolve() {
        return null;
    }

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        throw null;
    }
}
