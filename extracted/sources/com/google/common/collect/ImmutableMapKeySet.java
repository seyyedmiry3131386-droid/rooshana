package com.google.common.collect;

import defpackage.zx8;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {
    public final ImmutableMap d;

    public static class KeySetSerializedForm<K> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap a;

        public KeySetSerializedForm(ImmutableMap immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.keySet();
        }
    }

    public ImmutableMapKeySet(ImmutableMap immutableMap) {
        this.d = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // com.google.common.collect.IndexedImmutableSet
    public final Object get(int i) {
        return ((Map.Entry) this.d.entrySet().a().get(i)).getKey();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return true;
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return this.d.j();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return this.d.j();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }

    @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new KeySetSerializedForm(this.d);
    }
}
