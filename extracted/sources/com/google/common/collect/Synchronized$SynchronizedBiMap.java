package com.google.common.collect;

import defpackage.xa0;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedBiMap<K, V> extends Synchronized$SynchronizedMap<K, V> implements xa0, Serializable {
    private static final long serialVersionUID = 0;
    public transient Set f;
    public transient xa0 g;

    @Override // com.google.common.collect.Synchronized$SynchronizedMap
    public final Map e() {
        return (xa0) ((Map) this.a);
    }

    @Override // defpackage.xa0
    public final xa0 y() {
        xa0 xa0Var;
        synchronized (this.b) {
            try {
                if (this.g == null) {
                    Synchronized$SynchronizedBiMap synchronized$SynchronizedBiMap = new Synchronized$SynchronizedBiMap(((xa0) ((Map) this.a)).y(), this.b);
                    synchronized$SynchronizedBiMap.g = this;
                    this.g = synchronized$SynchronizedBiMap;
                }
                xa0Var = this.g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xa0Var;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMap, java.util.Map
    public final Set values() {
        Set set;
        synchronized (this.b) {
            try {
                if (this.f == null) {
                    this.f = new Synchronized$SynchronizedSet(((xa0) ((Map) this.a)).values(), this.b);
                }
                set = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return set;
    }
}
