package com.google.common.collect;

import defpackage.lj3;
import defpackage.mj3;
import defpackage.s7;
import defpackage.tv8;
import defpackage.wn5;
import defpackage.zx8;
import j$.util.List;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess, j$.util.List {
    public static final mj3 b = new mj3(0, RegularImmutableList.e);
    private static final long serialVersionUID = -889275714;

    public static class ReverseImmutableList<E> extends ImmutableList<E> {
        public final transient ImmutableList c;

        public ReverseImmutableList(ImmutableList immutableList) {
            this.c = immutableList;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.c.contains(obj);
        }

        @Override // java.util.List
        public final Object get(int i) {
            ImmutableList immutableList = this.c;
            wn5.l(i, immutableList.size());
            return immutableList.get((immutableList.size() - 1) - i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return this.c.i();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int indexOf(Object obj) {
            int iLastIndexOf = this.c.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return (r0.size() - 1) - iLastIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final int lastIndexOf(Object obj) {
            int iIndexOf = this.c.indexOf(obj);
            if (iIndexOf >= 0) {
                return (r0.size() - 1) - iIndexOf;
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.c.size();
        }

        @Override // com.google.common.collect.ImmutableList
        public final ImmutableList w() {
            return this.c;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public final ImmutableList subList(int i, int i2) {
            ImmutableList immutableList = this.c;
            wn5.o(i, i2, immutableList.size());
            return immutableList.subList(immutableList.size() - i2, immutableList.size() - i).w();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;

        public SerializedForm(Object[] objArr) {
            this.a = objArr;
        }

        public Object readResolve() {
            return ImmutableList.o(this.a);
        }
    }

    public class SubList extends ImmutableList<E> {
        public final transient int c;
        public final transient int d;

        public SubList(int i, int i2) {
            this.c = i;
            this.d = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final Object[] e() {
            return ImmutableList.this.e();
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int f() {
            return ImmutableList.this.h() + this.c + this.d;
        }

        @Override // java.util.List
        public final Object get(int i) {
            wn5.l(i, this.d);
            return ImmutableList.this.get(i + this.c);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int h() {
            return ImmutableList.this.h() + this.c;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        public final Iterator iterator() {
            return listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        /* JADX INFO: renamed from: y */
        public final ImmutableList subList(int i, int i2) {
            wn5.o(i, i2, this.d);
            int i3 = this.c;
            return ImmutableList.this.subList(i + i3, i2 + i3);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
            return listIterator(i);
        }
    }

    public static ImmutableList l(int i, Object[] objArr) {
        return i == 0 ? RegularImmutableList.e : new RegularImmutableList(i, objArr);
    }

    public static lj3 m() {
        return new lj3(4);
    }

    public static ImmutableList n(Collection collection) {
        if (!(collection instanceof ImmutableCollection)) {
            Object[] array = collection.toArray();
            tv8.f(array.length, array);
            return l(array.length, array);
        }
        ImmutableList immutableListA = ((ImmutableCollection) collection).a();
        if (!immutableListA.i()) {
            return immutableListA;
        }
        Object[] array2 = immutableListA.toArray(ImmutableCollection.a);
        return l(array2.length, array2);
    }

    public static ImmutableList o(Object[] objArr) {
        if (objArr.length == 0) {
            return RegularImmutableList.e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        tv8.f(objArr2.length, objArr2);
        return l(objArr2.length, objArr2);
    }

    public static ImmutableList q() {
        return RegularImmutableList.e;
    }

    public static ImmutableList r(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        tv8.f(5, objArr);
        return l(5, objArr);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static ImmutableList s(Object obj) {
        Object[] objArr = {obj};
        tv8.f(1, objArr);
        return l(1, objArr);
    }

    public static ImmutableList t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        tv8.f(2, objArr);
        return l(2, objArr);
    }

    public static ImmutableList v(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        wn5.i("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        tv8.f(length, objArr2);
        return l(length, objArr2);
    }

    public static ImmutableList x(Comparator comparator, Collection collection) {
        Collection collection2;
        comparator.getClass();
        if (collection instanceof Collection) {
            collection2 = collection;
        } else {
            Iterator it = collection.iterator();
            ArrayList arrayList = new ArrayList();
            s7.c(arrayList, it);
            collection2 = arrayList;
        }
        Object[] array = collection2.toArray();
        tv8.f(array.length, array);
        Arrays.sort(array, comparator);
        return l(array.length, array);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final ImmutableList a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public int c(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator<E> it = iterator();
                        Iterator<E> it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && s7.l(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i = 0; i < size; i++) {
                        if (s7.l(get(i), list.get(i))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    /* JADX INFO: renamed from: j */
    public final zx8 iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public defpackage.p0 listIterator(int i) {
        wn5.n(i, size());
        return isEmpty() ? b : new mj3(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    public ImmutableList w() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(toArray(ImmutableCollection.a));
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y */
    public ImmutableList subList(int i, int i2) {
        wn5.o(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? RegularImmutableList.e : new SubList(i, i3);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }
}
