package com.google.common.collect;

import defpackage.zx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
abstract class ImmutableMapEntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

    public static class EntrySetSerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap a;

        public EntrySetSerializedForm(ImmutableMap immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            return this.a.entrySet();
        }
    }

    public static final class RegularEntrySet<K, V> extends ImmutableMapEntrySet<K, V> {
        @Override // com.google.common.collect.ImmutableCollection
        public final int c(int i, Object[] objArr) {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList p() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet
        public final ImmutableMap v() {
            return null;
        }

        @Override // com.google.common.collect.ImmutableMapEntrySet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use EntrySetSerializedForm");
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = v().get(entry.getKey());
        return obj2 != null && obj2.equals(entry.getValue());
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return v().hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return v().i();
    }

    @Override // com.google.common.collect.ImmutableSet
    public final boolean q() {
        return v().h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return v().size();
    }

    public abstract ImmutableMap v();

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new EntrySetSerializedForm(v());
    }
}
