package com.google.common.collect;

import defpackage.p18;
import defpackage.s7;
import defpackage.tv8;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.wu8;
import defpackage.zx8;
import j$.util.SortedSet;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, p18, SortedSet {
    private static final long serialVersionUID = 912559;
    public final transient Comparator d;
    public transient ImmutableSortedSet e;

    public static class SerializedForm<E> implements Serializable {
        private static final long serialVersionUID = 0;
        public final Comparator a;
        public final Object[] b;

        public SerializedForm(Comparator comparator, Object[] objArr) {
            this.a = comparator;
            this.b = objArr;
        }

        public Object readResolve() {
            vy2.m(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            Comparator comparator = this.a;
            comparator.getClass();
            Object[] objArr = this.b;
            int length = objArr.length;
            tv8.f(length, objArr);
            int iT = wu8.t(4, length);
            if (iT > 4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
            }
            System.arraycopy(objArr, 0, objArrCopyOf, 0, length);
            ImmutableSortedSet immutableSortedSetV = ImmutableSortedSet.v(comparator, length, objArrCopyOf);
            ((RegularImmutableSortedSet) immutableSortedSetV).f.size();
            return immutableSortedSetV;
        }
    }

    public ImmutableSortedSet(Comparator comparator) {
        this.d = comparator;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSortedSet v(Comparator comparator, int i, Object... objArr) {
        if (i == 0) {
            return z(comparator);
        }
        tv8.f(i, objArr);
        Arrays.sort(objArr, 0, i, comparator);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (comparator.compare(obj, objArr[i2 - 1]) != 0) {
                objArr[i2] = obj;
                i2++;
            }
        }
        Arrays.fill(objArr, i2, i, (Object) null);
        if (i2 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i2);
        }
        return new RegularImmutableSortedSet(ImmutableList.l(i2, objArr), comparator);
    }

    public static RegularImmutableSortedSet z(Comparator comparator) {
        return NaturalOrdering.c.equals(comparator) ? RegularImmutableSortedSet.g : new RegularImmutableSortedSet(RegularImmutableList.e, comparator);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet headSet(Object obj, boolean z) {
        obj.getClass();
        return C(obj, z);
    }

    public abstract ImmutableSortedSet C(Object obj, boolean z);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        wn5.j(this.d.compare(obj, obj2) <= 0);
        return F(obj, z, obj2, z2);
    }

    public abstract ImmutableSortedSet F(Object obj, boolean z, Object obj2, boolean z2);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet tailSet(Object obj, boolean z) {
        obj.getClass();
        return L(obj, z);
    }

    public abstract ImmutableSortedSet L(Object obj, boolean z);

    public Object ceiling(Object obj) {
        return s7.y(tailSet(obj, true).iterator(), null);
    }

    @Override // java.util.SortedSet, defpackage.p18
    public final Comparator comparator() {
        return this.d;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        return s7.y(headSet(obj, true).descendingIterator(), null);
    }

    public Object higher(Object obj) {
        return s7.y(tailSet(obj, false).iterator(), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        return s7.y(headSet(obj, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedSet w();

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this.d, toArray(ImmutableCollection.a));
    }

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: x */
    public abstract zx8 descendingIterator();

    @Override // java.util.NavigableSet
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public ImmutableSortedSet descendingSet() {
        ImmutableSortedSet immutableSortedSet = this.e;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet immutableSortedSetW = w();
        this.e = immutableSortedSetW;
        immutableSortedSetW.e = this;
        return immutableSortedSetW;
    }
}
