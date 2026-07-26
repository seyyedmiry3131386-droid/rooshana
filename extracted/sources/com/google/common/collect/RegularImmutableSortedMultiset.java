package com.google.common.collect;

import defpackage.pa5;
import defpackage.wn5;
import java.util.Collections;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {
    public static final long[] k = {0};
    public static final ImmutableSortedMultiset l = new RegularImmutableSortedMultiset(NaturalOrdering.c);
    public final transient RegularImmutableSortedSet g;
    public final transient long[] h;
    public final transient int i;
    public final transient int j;

    public RegularImmutableSortedMultiset(Comparator comparator) {
        this.g = ImmutableSortedSet.z(comparator);
        this.h = k;
        this.i = 0;
        this.j = 0;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, defpackage.oa5, defpackage.q18
    public final NavigableSet b() {
        return this.g;
    }

    @Override // defpackage.q18
    public final pa5 firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return n(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        if (this.i <= 0) {
            if (this.j >= this.h.length - 1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset
    /* JADX INFO: renamed from: l */
    public final ImmutableSet b() {
        return this.g;
    }

    @Override // defpackage.q18
    public final pa5 lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return n(this.j - 1);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public final pa5 n(int i) {
        E e = this.g.f.get(i);
        int i2 = this.i + i;
        long[] jArr = this.h;
        return new Multisets$ImmutableEntry((int) (jArr[i2 + 1] - jArr[i2]), e);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset
    /* JADX INFO: renamed from: p */
    public final ImmutableSortedSet b() {
        return this.g;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, defpackage.q18
    /* JADX INFO: renamed from: q */
    public final ImmutableSortedMultiset k0(Object obj, BoundType boundType) {
        return s(0, this.g.N(obj, boundType == BoundType.b));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, defpackage.q18
    /* JADX INFO: renamed from: r */
    public final ImmutableSortedMultiset D0(Object obj, BoundType boundType) {
        return s(this.g.O(obj, boundType == BoundType.b), this.j);
    }

    public final ImmutableSortedMultiset s(int i, int i2) {
        int i3 = this.j;
        wn5.o(i, i2, i3);
        RegularImmutableSortedSet regularImmutableSortedSet = this.g;
        if (i == i2) {
            Comparator comparator = regularImmutableSortedSet.d;
            return NaturalOrdering.c.equals(comparator) ? l : new RegularImmutableSortedMultiset(comparator);
        }
        if (i == 0 && i2 == i3) {
            return this;
        }
        return new RegularImmutableSortedMultiset(regularImmutableSortedSet.M(i, i2), this.h, this.i + i, i2 - i);
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        RegularImmutableSortedSet regularImmutableSortedSet = this.g;
        regularImmutableSortedSet.getClass();
        int i = -1;
        if (obj != null) {
            try {
                int iBinarySearch = Collections.binarySearch(regularImmutableSortedSet.f, obj, regularImmutableSortedSet.d);
                if (iBinarySearch >= 0) {
                    i = iBinarySearch;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (i < 0) {
            return 0;
        }
        int i2 = this.i + i;
        long[] jArr = this.h;
        return (int) (jArr[i2 + 1] - jArr[i2]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.j;
        int i2 = this.i;
        long[] jArr = this.h;
        return com.google.common.primitives.a.f(jArr[i + i2] - jArr[i2]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, defpackage.oa5, defpackage.q18
    public final Set b() {
        return this.g;
    }

    public RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i, int i2) {
        this.g = regularImmutableSortedSet;
        this.h = jArr;
        this.i = i;
        this.j = i2;
    }
}
