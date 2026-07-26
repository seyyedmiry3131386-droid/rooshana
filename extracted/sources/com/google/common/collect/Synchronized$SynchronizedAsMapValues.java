package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class Synchronized$SynchronizedAsMapValues<V> extends Synchronized$SynchronizedCollection<Collection<V>> {
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.Synchronized$SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new l1(this, super.iterator(), 2);
    }
}
