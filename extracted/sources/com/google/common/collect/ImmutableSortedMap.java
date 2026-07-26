package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.mj3;
import defpackage.wn5;
import defpackage.zx8;
import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableSortedMap<K, V> extends ImmutableMap<K, V> implements NavigableMap<K, V>, Map {
    public static final ImmutableSortedMap g;
    private static final long serialVersionUID = 0;
    public final transient RegularImmutableSortedSet d;
    public final transient ImmutableList e;
    public final transient ImmutableSortedMap f;

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;
        public final Comparator c;

        public SerializedForm(ImmutableSortedMap immutableSortedMap) {
            super(immutableSortedMap);
            this.c = immutableSortedMap.d.d;
        }

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final j0 a(int i) {
            return new p0(this.c);
        }
    }

    static {
        RegularImmutableSortedSet regularImmutableSortedSetZ = ImmutableSortedSet.z(NaturalOrdering.c);
        mj3 mj3Var = ImmutableList.b;
        g = new ImmutableSortedMap(regularImmutableSortedSetZ, RegularImmutableList.e, null);
    }

    public ImmutableSortedMap(RegularImmutableSortedSet regularImmutableSortedSet, ImmutableList immutableList, ImmutableSortedMap immutableSortedMap) {
        this.d = regularImmutableSortedSet;
        this.e = immutableList;
        this.f = immutableSortedMap;
    }

    public static ImmutableSortedMap p(Comparator comparator) {
        return NaturalOrdering.c.equals(comparator) ? g : new ImmutableSortedMap(ImmutableSortedSet.z(comparator), RegularImmutableList.e, null);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        if (!isEmpty()) {
            return new ImmutableMapEntrySet<Object, Object>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet
                @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
                /* JADX INFO: renamed from: j */
                public final zx8 iterator() {
                    return a().listIterator(0);
                }

                @Override // com.google.common.collect.ImmutableSet
                public final ImmutableList p() {
                    return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.ImmutableSortedMap.1EntrySet.1
                        @Override // java.util.List
                        public final Object get(int i) {
                            C1EntrySet c1EntrySet = C1EntrySet.this;
                            return new AbstractMap.SimpleImmutableEntry(ImmutableSortedMap.this.d.f.get(i), ImmutableSortedMap.this.e.get(i));
                        }

                        @Override // com.google.common.collect.ImmutableCollection
                        public final boolean i() {
                            return true;
                        }

                        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                        public final int size() {
                            return ImmutableSortedMap.this.e.size();
                        }

                        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                        public Object writeReplace() {
                            return super.writeReplace();
                        }
                    };
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet
                public final ImmutableMap v() {
                    return ImmutableSortedMap.this;
                }

                @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }
        int i = ImmutableSet.c;
        return RegularImmutableSet.j;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.d.d;
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.d.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        ImmutableSortedMap immutableSortedMap = this.f;
        if (immutableSortedMap != null) {
            return immutableSortedMap;
        }
        boolean zIsEmpty = isEmpty();
        RegularImmutableSortedSet regularImmutableSortedSet = this.d;
        return zIsEmpty ? p(p1.b(regularImmutableSortedSet.d).h()) : new ImmutableSortedMap((RegularImmutableSortedSet) regularImmutableSortedSet.descendingSet(), this.e.w(), this);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.d.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008  */
    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(java.lang.Object r4) {
        /*
            r3 = this;
            com.google.common.collect.RegularImmutableSortedSet r0 = r3.d
            r0.getClass()
            r1 = -1
            if (r4 != 0) goto La
        L8:
            r4 = r1
            goto L14
        La:
            com.google.common.collect.ImmutableList r2 = r0.f     // Catch: java.lang.ClassCastException -> L8
            java.util.Comparator r0 = r0.d     // Catch: java.lang.ClassCastException -> L8
            int r4 = java.util.Collections.binarySearch(r2, r4, r0)     // Catch: java.lang.ClassCastException -> L8
            if (r4 < 0) goto L8
        L14:
            if (r4 != r1) goto L18
            r4 = 0
            return r4
        L18:
            com.google.common.collect.ImmutableList r0 = r3.e
            java.lang.Object r4 = r0.get(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableSortedMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return this.d.f.i() || this.e.i();
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: k */
    public final ImmutableSet keySet() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set keySet() {
        return this.d;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(this.e.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.d.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.d;
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: o */
    public final ImmutableCollection values() {
        return this.e;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public final ImmutableSortedMap q(int i, int i2) {
        ImmutableList immutableList = this.e;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        RegularImmutableSortedSet regularImmutableSortedSet = this.d;
        return i == i2 ? p(regularImmutableSortedSet.d) : new ImmutableSortedMap(regularImmutableSortedSet.M(i, i2), immutableList.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap headMap(Object obj, boolean z) {
        obj.getClass();
        return q(0, this.d.N(obj, z));
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        wn5.k(this.d.d.compare(obj, obj2) <= 0, "expected fromKey <= toKey but %s > %s", obj, obj2);
        return headMap(obj2, z2).tailMap(obj, z);
    }

    @Override // java.util.Map
    public final int size() {
        return this.e.size();
    }

    @Override // java.util.NavigableMap
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final ImmutableSortedMap tailMap(Object obj, boolean z) {
        obj.getClass();
        return q(this.d.O(obj, z), this.e.size());
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return this.e;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
