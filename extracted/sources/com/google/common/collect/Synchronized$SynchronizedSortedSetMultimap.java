package com.google.common.collect;

import defpackage.fa5;
import defpackage.kq7;
import defpackage.s18;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedSortedSetMultimap<K, V> extends Synchronized$SynchronizedSetMultimap<K, V> implements s18 {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Synchronized$SynchronizedSetMultimap, com.google.common.collect.Synchronized$SynchronizedMultimap
    public final fa5 e() {
        return (s18) super.e();
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSetMultimap
    /* JADX INFO: renamed from: j */
    public final kq7 e() {
        return (s18) super.e();
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSetMultimap, com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public final SortedSet a(Object obj) {
        SortedSet sortedSetA;
        synchronized (this.b) {
            sortedSetA = ((s18) super.e()).a(obj);
        }
        return sortedSetA;
    }

    @Override // com.google.common.collect.Synchronized$SynchronizedSetMultimap, com.google.common.collect.Synchronized$SynchronizedMultimap, defpackage.fa5
    public final SortedSet get(Object obj) {
        Synchronized$SynchronizedSortedSet synchronized$SynchronizedSortedSet;
        synchronized (this.b) {
            synchronized$SynchronizedSortedSet = new Synchronized$SynchronizedSortedSet(((s18) super.e()).get(obj), this.b);
        }
        return synchronized$SynchronizedSortedSet;
    }
}
