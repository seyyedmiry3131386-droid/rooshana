package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class n extends j implements SortedSet {
    public final /* synthetic */ AbstractMapBasedMultimap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AbstractMapBasedMultimap abstractMapBasedMultimap, SortedMap sortedMap) {
        super(abstractMapBasedMultimap, sortedMap);
        this.c = abstractMapBasedMultimap;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedMap f() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return f().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new n(this.c, f().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return f().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new n(this.c, f().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new n(this.c, f().tailMap(obj));
    }
}
