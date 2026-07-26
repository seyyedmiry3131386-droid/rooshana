package com.google.common.collect;

import defpackage.d94;
import defpackage.fa5;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedListMultimap<K, V> extends Synchronized$SynchronizedMultimap<K, V> implements d94 {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap
    public final fa5 e() {
        return (d94) ((fa5) this.a);
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public final List a(Object obj) {
        List listA;
        synchronized (this.b) {
            listA = ((d94) ((fa5) this.a)).a(obj);
        }
        return listA;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public final List get(Object obj) {
        List listH;
        synchronized (this.b) {
            listH = z0.h(this.b, ((d94) ((fa5) this.a)).get(obj));
        }
        return listH;
    }
}
