package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import defpackage.hs9;
import defpackage.sb7;
import defpackage.zx8;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {
    public final ImmutableMap c;
    public final ImmutableMap d;
    public final ImmutableMap e;
    public final ImmutableMap f;
    public final int[] g;
    public final int[] h;
    public final Object[][] i;
    public final int[] j;
    public final int[] k;

    public final class Column extends ImmutableArrayMap<R, V> {
        public final int e;

        public Column(int i) {
            super(DenseImmutableTable.this.h[i]);
            this.e = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i) {
            return DenseImmutableTable.this.i[i][this.e];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.c;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        public ColumnMap() {
            super(DenseImmutableTable.this.h.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i) {
            return new Column(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.d;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {
        public final int d;

        public ImmutableArrayMap(int i) {
            this.d = i;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public final ImmutableSet e() {
            return this.d == r().size() ? r().keySet() : new ImmutableMapKeySet(this);
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public final Object get(Object obj) {
            Integer num = (Integer) r().get(obj);
            if (num == null) {
                return null;
            }
            return q(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        public final zx8 p() {
            return new d0(this);
        }

        public abstract Object q(int i);

        public abstract ImmutableMap r();

        @Override // java.util.Map
        public final int size() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class Row extends ImmutableArrayMap<C, V> {
        public final int e;

        public Row(int i) {
            super(DenseImmutableTable.this.g[i]);
            this.e = i;
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i) {
            return DenseImmutableTable.this.i[this.e][i];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.d;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        public RowMap() {
            super(DenseImmutableTable.this.g.length);
        }

        @Override // com.google.common.collect.ImmutableMap
        public final boolean i() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final Object q(int i) {
            return new Row(i);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        public final ImmutableMap r() {
            return DenseImmutableTable.this.c;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public DenseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.i = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size());
        ImmutableMap immutableMapH = hs9.H(immutableSet);
        this.c = immutableMapH;
        ImmutableMap immutableMapH2 = hs9.H(immutableSet2);
        this.d = immutableMapH2;
        this.g = new int[((RegularImmutableMap) immutableMapH).f];
        this.h = new int[((RegularImmutableMap) immutableMapH2).f];
        RegularImmutableList regularImmutableList = (RegularImmutableList) immutableList;
        int i = regularImmutableList.d;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            Tables$ImmutableCell tables$ImmutableCell = (Tables$ImmutableCell) ((u1) regularImmutableList.get(i2));
            Object obj = tables$ImmutableCell.a;
            Object obj2 = tables$ImmutableCell.c;
            Object obj3 = tables$ImmutableCell.b;
            Integer num = (Integer) this.c.get(obj);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.d.get(obj3);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            Object[] objArr = this.i[iIntValue];
            Object obj4 = objArr[iIntValue2];
            if (!(obj4 == null)) {
                throw new IllegalArgumentException(sb7.o("Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj3, obj2, obj4));
            }
            objArr[iIntValue2] = obj2;
            int[] iArr3 = this.g;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.h;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i2] = iIntValue;
            iArr2[i2] = iIntValue2;
        }
        this.j = iArr;
        this.k = iArr2;
        this.e = new RowMap();
        this.f = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, defpackage.he8
    public final Map f() {
        return ImmutableMap.b(this.e);
    }

    @Override // defpackage.z2
    public final Object g(Object obj, Object obj2) {
        Integer num = (Integer) this.c.get(obj);
        Integer num2 = (Integer) this.d.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return this.i[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.ImmutableTable
    public final ImmutableMap j() {
        return ImmutableMap.b(this.f);
    }

    @Override // com.google.common.collect.ImmutableTable
    /* JADX INFO: renamed from: n */
    public final ImmutableMap f() {
        return ImmutableMap.b(this.e);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final u1 o(int i) {
        int i2 = this.j[i];
        int i3 = this.k[i];
        E e = f().keySet().a().get(i2);
        E e2 = j().keySet().a().get(i3);
        Object obj = this.i[i2][i3];
        Objects.requireNonNull(obj);
        return ImmutableTable.h(e, e2, obj);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    public final Object p(int i) {
        Object obj = this.i[this.j[i]][this.k[i]];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.he8
    public final int size() {
        return this.j.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    public Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, this.j, this.k);
    }
}
