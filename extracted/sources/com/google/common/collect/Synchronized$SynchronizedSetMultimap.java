package com.google.common.collect;

import defpackage.fa5;
import defpackage.kq7;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedSetMultimap<K, V> extends Synchronized$SynchronizedMultimap<K, V> implements kq7 {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public kq7 e() {
        return (kq7) ((fa5) this.a);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public Set a(Object obj) {
        Set setA;
        synchronized (this.b) {
            setA = e().a(obj);
        }
        return setA;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public Set get(Object obj) {
        Synchronized$SynchronizedSet synchronized$SynchronizedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSet = new Synchronized$SynchronizedSet(e().get(obj), this.b);
        }
        return synchronized$SynchronizedSet;
    }
}
