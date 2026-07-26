package com.google.common.collect;

import defpackage.mi4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements NavigableMap {
    public final /* synthetic */ AbstractMapBasedMultimap h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(AbstractMapBasedMultimap abstractMapBasedMultimap, NavigableMap navigableMap) {
        super(abstractMapBasedMultimap, navigableMap);
        this.h = abstractMapBasedMultimap;
    }

    @Override // com.google.common.collect.m, defpackage.mi4
    public final Set b() {
        return new l(this.h, f());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = f().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return f().ceilingKey(obj);
    }

    @Override // com.google.common.collect.m
    /* JADX INFO: renamed from: d */
    public final SortedSet b() {
        return new l(this.h, f());
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new k(this.h, f().descendingMap());
    }

    @Override // com.google.common.collect.m
    /* JADX INFO: renamed from: e */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = f().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = f().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return f().floorKey(obj);
    }

    public final Map.Entry g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        AbstractMapBasedMultimap abstractMapBasedMultimap = this.h;
        Collection collectionL = abstractMapBasedMultimap.l();
        collectionL.addAll((Collection) entry.getValue());
        it.remove();
        return new ImmutableEntry(entry.getKey(), abstractMapBasedMultimap.r(collectionL));
    }

    @Override // com.google.common.collect.m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final NavigableMap f() {
        return (NavigableMap) ((SortedMap) this.d);
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = f().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return f().higherKey(obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, defpackage.mi4, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = f().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = f().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return f().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(((mi4) descendingMap()).entrySet().iterator());
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.common.collect.m, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new k(this.h, f().headMap(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new k(this.h, f().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new k(this.h, f().tailMap(obj, z));
    }
}
