package com.google.common.collect;

import defpackage.mj3;
import defpackage.rm7;
import defpackage.wn5;
import defpackage.y97;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E>, j$.util.Set {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 912559;
    public transient ImmutableList b;

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;

        public SerializedForm(Object[] objArr) {
            this.a = objArr;
        }

        public Object readResolve() {
            return ImmutableSet.o(this.a);
        }
    }

    public static int l(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            wn5.i("collection too large", iMax < 1073741824);
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static ImmutableSet m(int i, Object... objArr) {
        if (i == 0) {
            return RegularImmutableSet.j;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new SingletonImmutableSet(obj);
        }
        int iL = l(i);
        Object[] objArr2 = new Object[iL];
        int i2 = iL - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(rm7.n(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iA0 = y97.a0(iHashCode);
            while (true) {
                int i6 = iA0 & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iA0++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new SingletonImmutableSet(obj4);
        }
        if (l(i4) < iL / 2) {
            return m(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new RegularImmutableSet(i3, i2, i4, objArr, objArr2);
    }

    public static ImmutableSet n(Collection collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet immutableSet = (ImmutableSet) collection;
            if (!immutableSet.i()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return m(array.length, array);
    }

    public static ImmutableSet o(Object[] objArr) {
        int length = objArr.length;
        return length != 0 ? length != 1 ? m(objArr.length, (Object[]) objArr.clone()) : new SingletonImmutableSet(objArr[0]) : RegularImmutableSet.j;
    }

    public static ImmutableSet r() {
        return RegularImmutableSet.j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableSet s(String str, String str2, String str3, String str4, String str5, String str6, Object... objArr) {
        wn5.i("the total number of elements must fit in an int", objArr.length <= 2147483641);
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return m(length, objArr2);
    }

    public static ImmutableSet t() {
        return new SingletonImmutableSet("CH");
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList a() {
        ImmutableList immutableList = this.b;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList immutableListP = p();
        this.b = immutableListP;
        return immutableListP;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && q() && ((ImmutableSet) obj).q() && hashCode() != obj.hashCode()) {
            return false;
        }
        return z0.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z0.f(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    public ImmutableList p() {
        Object[] array = toArray();
        mj3 mj3Var = ImmutableList.b;
        return ImmutableList.l(array.length, array);
    }

    public boolean q() {
        return this instanceof EmptyContiguousSet;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.a));
    }
}
