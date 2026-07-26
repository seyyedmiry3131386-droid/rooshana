package com.google.common.collect;

import defpackage.vy2;
import defpackage.wu8;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends j0 {
    public transient Object[] d;
    public transient Object[] e;
    public final Comparator f;

    public p0(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f = comparator;
        this.d = new Object[4];
        this.e = new Object[4];
    }

    @Override // com.google.common.collect.j0
    public final ImmutableMap b() {
        int i = this.b;
        Comparator comparator = this.f;
        if (i == 0) {
            return ImmutableSortedMap.p(comparator);
        }
        if (i == 1) {
            Object obj = this.d[0];
            Objects.requireNonNull(obj);
            Object obj2 = this.e[0];
            Objects.requireNonNull(obj2);
            ImmutableList immutableListS = ImmutableList.s(obj);
            comparator.getClass();
            return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableListS, comparator), ImmutableList.s(obj2), null);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.d, i);
        Arrays.sort(objArrCopyOf, comparator);
        int i2 = this.b;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < this.b; i3++) {
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (comparator.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                }
            }
            Object obj3 = this.d[i3];
            Objects.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.e[i3];
            Objects.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new ImmutableSortedMap(new RegularImmutableSortedSet(ImmutableList.l(objArrCopyOf.length, objArrCopyOf), comparator), ImmutableList.l(i2, objArr), null);
    }

    @Override // com.google.common.collect.j0
    public final j0 c(Object obj, Object obj2) {
        int i = this.b + 1;
        Object[] objArr = this.d;
        if (i > objArr.length) {
            int iT = wu8.t(objArr.length, i);
            this.d = Arrays.copyOf(this.d, iT);
            this.e = Arrays.copyOf(this.e, iT);
        }
        vy2.k(obj, obj2);
        Object[] objArr2 = this.d;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.e[i2] = obj2;
        this.b = i2 + 1;
        return this;
    }

    @Override // com.google.common.collect.j0
    public final j0 d(Iterable iterable) {
        super.d(iterable);
        return this;
    }

    @Override // com.google.common.collect.j0
    public final j0 e(Map map) {
        super.e(map);
        return this;
    }
}
