package com.google.common.collect;

import defpackage.zx8;

/* JADX INFO: loaded from: classes.dex */
abstract class IndexedImmutableSet<E> extends ImmutableSet<E> {
    @Override // com.google.common.collect.ImmutableCollection
    public final int c(int i, Object[] objArr) {
        return a().c(i, objArr);
    }

    public abstract Object get(int i);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public zx8 iterator() {
        return a().listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList p() {
        return new ImmutableList<Object>() { // from class: com.google.common.collect.IndexedImmutableSet.1
            @Override // java.util.List
            public final Object get(int i) {
                return IndexedImmutableSet.this.get(i);
            }

            @Override // com.google.common.collect.ImmutableCollection
            public final boolean i() {
                return IndexedImmutableSet.this.i();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return IndexedImmutableSet.this.size();
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            public Object writeReplace() {
                return super.writeReplace();
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }
}
