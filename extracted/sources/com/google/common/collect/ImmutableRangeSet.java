package com.google.common.collect;

import com.google.common.collect.Cut;
import com.google.common.collect.Range;
import defpackage.b2;
import defpackage.mj3;
import defpackage.vv1;
import defpackage.wn5;
import defpackage.zx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableRangeSet<C extends Comparable> extends b2 implements Serializable {
    public static final ImmutableRangeSet b;
    public static final ImmutableRangeSet c;
    public final transient ImmutableList a;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeSet$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable>> {
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ Range e;
        public final /* synthetic */ ImmutableRangeSet f;

        public AnonymousClass1(ImmutableRangeSet immutableRangeSet, int i, int i2, Range range) {
            this.c = i;
            this.d = i2;
            this.e = range;
            this.f = immutableRangeSet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.f.a;
            int i2 = this.c;
            wn5.l(i, i2);
            int i3 = this.d;
            return (i == 0 || i == i2 + (-1)) ? ((Range) immutableList.get(i + i3)).c(this.e) : (Range) immutableList.get(i + i3);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public final class AsSet extends ImmutableSortedSet<C> {
        public transient Integer f;

        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet C(Object obj, boolean z) {
            M(Range.g((Comparable) obj, BoundType.a(z)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet F(Object obj, boolean z, Object obj2, boolean z2) {
            Comparable comparable = (Comparable) obj;
            Comparable comparable2 = (Comparable) obj2;
            if (!z && !z2) {
                Range range = Range.c;
                if (comparable.compareTo(comparable2) == 0) {
                    return RegularImmutableSortedSet.g;
                }
            }
            M(Range.f(comparable, BoundType.a(z), comparable2, BoundType.a(z2)));
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet L(Object obj, boolean z) {
            M(Range.b((Comparable) obj, BoundType.a(z)));
            throw null;
        }

        public final ImmutableSortedSet M(Range range) {
            Cut cut = range.b;
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                throw null;
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        public final Iterator descendingIterator() {
            return new n0(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return new m0(this);
        }

        @Override // com.google.common.collect.ImmutableCollection
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            return new m0(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            Integer num = this.f;
            num.getClass();
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        public final ImmutableSortedSet w() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            throw null;
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: x */
        public final zx8 descendingIterator() {
            return new n0(this);
        }
    }

    public static class AsSetSerializedForm<C extends Comparable> implements Serializable {
        public AsSetSerializedForm(ImmutableList immutableList) {
        }

        public Object readResolve() {
            throw null;
        }
    }

    public final class ComplementRanges extends ImmutableList<Range<C>> {
        @Override // java.util.List
        public final Object get(int i) {
            wn5.l(i, 0);
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class SerializedForm<C extends Comparable> implements Serializable {
        public final ImmutableList a;

        public SerializedForm(ImmutableList immutableList) {
            this.a = immutableList;
        }

        public Object readResolve() {
            ImmutableList immutableList = this.a;
            return immutableList.isEmpty() ? ImmutableRangeSet.b : immutableList.equals(ImmutableList.s(Range.c)) ? ImmutableRangeSet.c : new ImmutableRangeSet(immutableList);
        }
    }

    static {
        mj3 mj3Var = ImmutableList.b;
        b = new ImmutableRangeSet(RegularImmutableList.e);
        c = new ImmutableRangeSet(ImmutableList.s(Range.c));
    }

    public ImmutableRangeSet(ImmutableList immutableList) {
        this.a = immutableList;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.b2
    public final Set a() {
        ImmutableList immutableList = this.a;
        if (immutableList.isEmpty()) {
            int i = ImmutableSet.c;
            return RegularImmutableSet.j;
        }
        Range range = Range.c;
        return new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range b(Comparable comparable) {
        int iA;
        vv1 vv1Var = new vv1(29);
        Cut.BelowValue belowValueA = Cut.a(comparable);
        NaturalOrdering naturalOrdering = NaturalOrdering.c;
        AbstractList abstractListJ = z0.j(vv1Var, this.a);
        naturalOrdering.getClass();
        if (!(abstractListJ instanceof RandomAccess)) {
            abstractListJ = new ArrayList(abstractListJ);
        }
        int size = abstractListJ.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                iA = SortedLists$KeyAbsentBehavior.a.a(i);
                break;
            }
            int i2 = (i + size) >>> 1;
            int iCompare = naturalOrdering.compare(belowValueA, abstractListJ.get(i2));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    int i3 = i2 - i;
                    SortedLists$KeyPresentBehavior.a.a(naturalOrdering, belowValueA, abstractListJ.subList(i, size + 1), i3);
                    iA = i + i3;
                    break;
                }
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        if (iA == -1) {
            return null;
        }
        Range range = (Range) this.a.get(iA);
        if (range.a(comparable)) {
            return range;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Range c() {
        ImmutableList immutableList = this.a;
        if (immutableList.isEmpty()) {
            throw new NoSuchElementException();
        }
        return new Range(((Range) immutableList.get(0)).a, ((Range) immutableList.get(immutableList.size() - 1)).b);
    }

    public Object writeReplace() {
        return new SerializedForm(this.a);
    }
}
