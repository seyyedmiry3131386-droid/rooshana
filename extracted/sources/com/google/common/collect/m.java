package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class m extends h implements SortedMap {
    public SortedSet f;
    public final /* synthetic */ AbstractMapBasedMultimap g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.g = abstractMapBasedMultimap;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    @Override // defpackage.mi4
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public SortedSet b() {
        return new n(this.g, f());
    }

    @Override // com.google.common.collect.h, defpackage.mi4, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f = sortedSetB;
        return sortedSetB;
    }

    public SortedMap f() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new m(this.g, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new m(this.g, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new m(this.g, f().tailMap(obj));
    }
}
