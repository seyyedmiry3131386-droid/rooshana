package com.google.common.collect;

import defpackage.fk2;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class h0 extends fk2 implements SortedSet {
    public h0() {
        super(16);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((Sets$UnmodifiableNavigableSet) this).t.comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((Sets$UnmodifiableNavigableSet) this).t.first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return ((Sets$UnmodifiableNavigableSet) this).t.headSet(obj);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((Sets$UnmodifiableNavigableSet) this).t.last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return ((Sets$UnmodifiableNavigableSet) this).t.subSet(obj, obj2);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return ((Sets$UnmodifiableNavigableSet) this).t.tailSet(obj);
    }
}
