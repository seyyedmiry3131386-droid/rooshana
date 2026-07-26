package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedEntry<K, V> extends Synchronized$SynchronizedObject implements Map.Entry<K, V> {
    private static final long serialVersionUID = 0;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        synchronized (this.b) {
            zEquals = ((Map.Entry) this.a).equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        Object key;
        synchronized (this.b) {
            key = ((Map.Entry) this.a).getKey();
        }
        return key;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        Object value;
        synchronized (this.b) {
            value = ((Map.Entry) this.a).getValue();
        }
        return value;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = ((Map.Entry) this.a).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object value;
        synchronized (this.b) {
            value = ((Map.Entry) this.a).setValue(obj);
        }
        return value;
    }
}
