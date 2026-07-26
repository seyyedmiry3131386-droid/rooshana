package com.google.common.collect;

import defpackage.li4;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class r1 extends t1 implements SortedMap {
    @Override // defpackage.mi4
    public final Set b() {
        return new li4(this);
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        obj.getClass();
        throw null;
    }

    @Override // defpackage.mi4, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (SortedSet) super.keySet();
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        throw null;
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        obj.getClass();
        throw null;
    }
}
