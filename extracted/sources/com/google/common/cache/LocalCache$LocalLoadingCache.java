package com.google.common.cache;

import com.google.common.util.concurrent.UncheckedExecutionException;
import defpackage.yp2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
class LocalCache$LocalLoadingCache<K, V> extends LocalCache$LocalManualCache<K, V> implements yp2 {
    private static final long serialVersionUID = 1;

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use LoadingSerializationProxy");
    }

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        try {
            d dVar = this.a;
            obj.getClass();
            dVar.f(dVar.d(obj)).getClass();
            throw null;
        } catch (ExecutionException e) {
            throw new UncheckedExecutionException(e.getCause());
        }
    }

    @Override // com.google.common.cache.LocalCache$LocalManualCache
    public Object writeReplace() {
        return new LocalCache$LoadingSerializationProxy(this.a);
    }
}
