package com.google.common.collect;

import defpackage.yj2;
import j$.util.DesugarCollections;
import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 extends yj2 implements SortedMap {
    public g0() {
        super(16);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return DesugarCollections.unmodifiableSortedMap(((Maps$UnmodifiableNavigableMap) this).s).comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return DesugarCollections.unmodifiableSortedMap(((Maps$UnmodifiableNavigableMap) this).s).firstKey();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return DesugarCollections.unmodifiableSortedMap(((Maps$UnmodifiableNavigableMap) this).s).lastKey();
    }
}
