package com.google.common.collect;

import defpackage.he8;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedTable<R, C, V> extends Synchronized$SynchronizedObject implements he8 {
    @Override // defpackage.he8
    public final Set c() {
        Synchronized$SynchronizedSet synchronized$SynchronizedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSet = new Synchronized$SynchronizedSet(((he8) this.a).c(), this.b);
        }
        return synchronized$SynchronizedSet;
    }

    @Override // defpackage.he8
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.b) {
            zEquals = ((he8) this.a).equals(obj);
        }
        return zEquals;
    }

    @Override // defpackage.he8
    public final int hashCode() {
        int iHashCode;
        synchronized (this.b) {
            iHashCode = ((he8) this.a).hashCode();
        }
        return iHashCode;
    }
}
