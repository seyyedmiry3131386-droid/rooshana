package com.google.common.collect;

import defpackage.s7;
import defpackage.zx8;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class ImmutableMapValues<K, V> extends ImmutableCollection<V> {
    public final ImmutableMap b;

    public static class SerializedForm<V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap a;

        public SerializedForm(ImmutableMap immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.values();
        }
    }

    public ImmutableMapValues(ImmutableMap immutableMap) {
        this.b = immutableMap;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        final ImmutableList immutableListA = this.b.entrySet().a();
        return new ImmutableList<Object>() { // from class: com.google.common.collect.ImmutableMapValues.2
            @Override // java.util.List
            public final Object get(int i) {
                return ((Map.Entry) immutableListA.get(i)).getValue();
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean i() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return immutableListA.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && s7.i(obj, new k0(this));
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return true;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public final Iterator iterator() {
        return new k0(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return new k0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.size();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.b);
    }
}
