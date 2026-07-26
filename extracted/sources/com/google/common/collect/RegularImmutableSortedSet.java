package com.google.common.collect;

import defpackage.mj3;
import defpackage.oa5;
import defpackage.zx8;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {
    public static final RegularImmutableSortedSet g;
    public final transient ImmutableList f;

    static {
        mj3 mj3Var = ImmutableList.b;
        g = new RegularImmutableSortedSet(RegularImmutableList.e, NaturalOrdering.c);
    }

    public RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.f = immutableList;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet C(Object obj, boolean z) {
        return M(0, N(obj, z));
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet F(Object obj, boolean z, Object obj2, boolean z2) {
        return L(obj, z).C(obj2, z2);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet L(Object obj, boolean z) {
        return M(O(obj, z), this.f.size());
    }

    public final RegularImmutableSortedSet M(int i, int i2) {
        ImmutableList immutableList = this.f;
        if (i == 0 && i2 == immutableList.size()) {
            return this;
        }
        Comparator comparator = this.d;
        return i < i2 ? new RegularImmutableSortedSet(immutableList.subList(i, i2), comparator) : ImmutableSortedSet.z(comparator);
    }

    public final int N(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f, obj, this.d);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int O(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.f, obj, this.d);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int c(int i, Object[] objArr) {
        return this.f.c(i, objArr);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iO = O(obj, true);
        ImmutableList immutableList = this.f;
        if (iO == immutableList.size()) {
            return null;
        }
        return immutableList.get(iO);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f, obj, this.d) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof oa5) {
            collection = ((oa5) collection).b();
        }
        Comparator comparator = this.d;
        if (!z0.e(comparator, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        zx8 it = iterator();
        Iterator<E> it2 = collection.iterator();
        defpackage.p0 p0Var = (defpackage.p0) it;
        if (!p0Var.hasNext()) {
            return false;
        }
        E next = it2.next();
        Object next2 = p0Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!p0Var.hasNext()) {
                        return false;
                    }
                    next2 = p0Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] e() {
        return this.f.e();
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        E next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.d;
        if (!z0.e(comparator, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            zx8 it2 = iterator();
            do {
                defpackage.p0 p0Var = (defpackage.p0) it2;
                if (!p0Var.hasNext()) {
                    return true;
                }
                next = p0Var.next();
                next2 = it.next();
                if (next2 == null) {
                    return false;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int f() {
        return this.f.f();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object floor(Object obj) {
        int iN = N(obj, true) - 1;
        if (iN == -1) {
            return null;
        }
        return this.f.get(iN);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int h() {
        return this.f.h();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object higher(Object obj) {
        int iO = O(obj, false);
        ImmutableList immutableList = this.f;
        if (iO == immutableList.size()) {
            return null;
        }
        return immutableList.get(iO);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean i() {
        return this.f.i();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return this.f.listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f.get(r0.size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public final Object lower(Object obj) {
        int iN = N(obj, false) - 1;
        if (iN == -1) {
            return null;
        }
        return this.f.get(iN);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    public final ImmutableSortedSet w() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.d);
        return isEmpty() ? ImmutableSortedSet.z(comparatorReverseOrder) : new RegularImmutableSortedSet(this.f.w(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    /* JADX INFO: renamed from: x */
    public final zx8 descendingIterator() {
        return this.f.w().listIterator(0);
    }
}
