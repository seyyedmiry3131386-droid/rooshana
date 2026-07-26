package com.google.common.collect;

import defpackage.mj3;

/* JADX INFO: loaded from: classes.dex */
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    public final class CellSet extends IndexedImmutableSet<u1> {
        public CellSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof u1)) {
                return false;
            }
            Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) ((u1) obj);
            Object objG = RegularImmutableTable.this.g(tables$ImmutableCell.a, tables$ImmutableCell.b);
            return objG != null && objG.equals(tables$ImmutableCell.c);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public final Object get(int i) {
            return RegularImmutableTable.this.o(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Values extends ImmutableList<V> {
        public Values() {
        }

        @Override // java.util.List
        public final Object get(int i) {
            return RegularImmutableTable.this.p(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    @Override // com.google.common.collect.ImmutableTable, defpackage.z2
    /* JADX INFO: renamed from: k */
    public final ImmutableSet e() {
        if (size() != 0) {
            return new CellSet();
        }
        int i = ImmutableSet.c;
        return RegularImmutableSet.j;
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: l */
    public final ImmutableCollection m() {
        if (size() != 0) {
            return new Values();
        }
        mj3 mj3Var = ImmutableList.b;
        return RegularImmutableList.e;
    }

    public abstract u1 o(int i);

    public abstract Object p(int i);

    @Override // com.google.common.collect.ImmutableTable
    public abstract Object writeReplace();
}
