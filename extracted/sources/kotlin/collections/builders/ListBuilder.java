package kotlin.collections.builders;

import defpackage.dw1;
import defpackage.ew;
import defpackage.is3;
import defpackage.js3;
import defpackage.q1;
import defpackage.rz2;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class ListBuilder<E> extends q1 implements List<E>, RandomAccess, Serializable {
    public static final ListBuilder d;
    public Object[] a;
    public int b;
    public boolean c;

    public static final class BuilderSubList<E> extends q1 implements List<E>, RandomAccess, Serializable {
        public Object[] a;
        public final int b;
        public int c;
        public final BuilderSubList d;
        public final ListBuilder e;

        public BuilderSubList(Object[] objArr, int i, int i2, BuilderSubList builderSubList, ListBuilder listBuilder) {
            js3.p(objArr, "backing");
            js3.p(listBuilder, "root");
            this.a = objArr;
            this.b = i;
            this.c = i2;
            this.d = builderSubList;
            this.e = listBuilder;
            ((AbstractList) this).modCount = ((AbstractList) listBuilder).modCount;
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() throws NotSerializableException {
            if (this.e.c) {
                return new SerializedCollection(0, this);
            }
            throw new NotSerializableException("The list cannot be serialized while it is being built.");
        }

        @Override // defpackage.q1
        public final int a() {
            i();
            return this.c;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean add(Object obj) {
            j();
            i();
            h(this.b + this.c, obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean addAll(Collection collection) {
            js3.p(collection, "elements");
            j();
            i();
            int size = collection.size();
            f(this.b + this.c, collection, size);
            return size > 0;
        }

        @Override // defpackage.q1
        public final Object c(int i) {
            j();
            i();
            int i2 = this.c;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
            }
            return l(this.b + i);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final void clear() {
            j();
            i();
            m(this.b, this.c);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            i();
            if (obj == this) {
                return true;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                Object[] objArr = this.a;
                int i = this.c;
                if (i == list.size()) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (js3.i(objArr[this.b + i2], list.get(i2))) {
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final void f(int i, Collection collection, int i2) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.e;
            BuilderSubList builderSubList = this.d;
            if (builderSubList != null) {
                builderSubList.f(i, collection, i2);
            } else {
                ListBuilder listBuilder2 = ListBuilder.d;
                listBuilder.f(i, collection, i2);
            }
            this.a = listBuilder.a;
            this.c += i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            i();
            int i2 = this.c;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
            }
            return this.a[this.b + i];
        }

        public final void h(int i, Object obj) {
            ((AbstractList) this).modCount++;
            ListBuilder listBuilder = this.e;
            BuilderSubList builderSubList = this.d;
            if (builderSubList != null) {
                builderSubList.h(i, obj);
            } else {
                ListBuilder listBuilder2 = ListBuilder.d;
                listBuilder.h(i, obj);
            }
            this.a = listBuilder.a;
            this.c++;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            i();
            Object[] objArr = this.a;
            int i = this.c;
            int iHashCode = 1;
            for (int i2 = 0; i2 < i; i2++) {
                Object obj = objArr[this.b + i2];
                iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
            }
            return iHashCode;
        }

        public final void i() {
            if (((AbstractList) this.e).modCount != ((AbstractList) this).modCount) {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            i();
            for (int i = 0; i < this.c; i++) {
                if (js3.i(this.a[this.b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean isEmpty() {
            i();
            return this.c == 0;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public final Iterator iterator() {
            return listIterator(0);
        }

        public final void j() {
            if (this.e.c) {
                throw new UnsupportedOperationException();
            }
        }

        public final Object l(int i) {
            Object objL;
            ((AbstractList) this).modCount++;
            BuilderSubList builderSubList = this.d;
            if (builderSubList != null) {
                objL = builderSubList.l(i);
            } else {
                ListBuilder listBuilder = ListBuilder.d;
                objL = this.e.l(i);
            }
            this.c--;
            return objL;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            i();
            for (int i = this.c - 1; i >= 0; i--) {
                if (js3.i(this.a[this.b + i], obj)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator() {
            return listIterator(0);
        }

        public final void m(int i, int i2) {
            if (i2 > 0) {
                ((AbstractList) this).modCount++;
            }
            BuilderSubList builderSubList = this.d;
            if (builderSubList != null) {
                builderSubList.m(i, i2);
            } else {
                ListBuilder listBuilder = ListBuilder.d;
                this.e.m(i, i2);
            }
            this.c -= i2;
        }

        public final int n(int i, int i2, Collection collection, boolean z) {
            int iN;
            BuilderSubList builderSubList = this.d;
            if (builderSubList != null) {
                iN = builderSubList.n(i, i2, collection, z);
            } else {
                ListBuilder listBuilder = ListBuilder.d;
                iN = this.e.n(i, i2, collection, z);
            }
            if (iN > 0) {
                ((AbstractList) this).modCount++;
            }
            this.c -= iN;
            return iN;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean remove(Object obj) {
            j();
            i();
            int iIndexOf = indexOf(obj);
            if (iIndexOf >= 0) {
                c(iIndexOf);
            }
            return iIndexOf >= 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean removeAll(Collection collection) {
            js3.p(collection, "elements");
            j();
            i();
            return n(this.b, this.c, collection, false) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean retainAll(Collection collection) {
            js3.p(collection, "elements");
            j();
            i();
            return n(this.b, this.c, collection, true) > 0;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object set(int i, Object obj) {
            j();
            i();
            int i2 = this.c;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
            }
            Object[] objArr = this.a;
            int i3 = this.b;
            Object obj2 = objArr[i3 + i];
            objArr[i3 + i] = obj;
            return obj2;
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            is3.l(i, i2, this.c);
            return new BuilderSubList(this.a, this.b + i, i2 - i, this, this.e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray(Object[] objArr) {
            js3.p(objArr, "array");
            i();
            int length = objArr.length;
            int i = this.c;
            int i2 = this.b;
            if (length < i) {
                Object[] objArrCopyOfRange = Arrays.copyOfRange(this.a, i2, i + i2, objArr.getClass());
                js3.o(objArrCopyOfRange, "copyOfRange(...)");
                return objArrCopyOfRange;
            }
            ew.y0(0, i2, i + i2, this.a, objArr);
            int i3 = this.c;
            if (i3 < objArr.length) {
                objArr[i3] = null;
            }
            return objArr;
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            i();
            return js3.g(this.a, this.b, this.c, this);
        }

        @Override // java.util.AbstractList, java.util.List
        public final ListIterator listIterator(int i) {
            i();
            int i2 = this.c;
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
            }
            return new a(this, i);
        }

        @Override // java.util.AbstractList, java.util.List
        public final void add(int i, Object obj) {
            j();
            i();
            int i2 = this.c;
            if (i >= 0 && i <= i2) {
                h(this.b + i, obj);
                return;
            }
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }

        @Override // java.util.AbstractList, java.util.List
        public final boolean addAll(int i, Collection collection) {
            js3.p(collection, "elements");
            j();
            i();
            int i2 = this.c;
            if (i >= 0 && i <= i2) {
                int size = collection.size();
                f(this.b + i, collection, size);
                return size > 0;
            }
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final Object[] toArray() {
            i();
            Object[] objArr = this.a;
            int i = this.c;
            int i2 = this.b;
            return ew.E0(objArr, i2, i + i2);
        }
    }

    static {
        ListBuilder listBuilder = new ListBuilder(0);
        listBuilder.c = true;
        d = listBuilder;
    }

    public ListBuilder(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.a = new Object[i];
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.c) {
            return new SerializedCollection(0, this);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // defpackage.q1
    public final int a() {
        return this.b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int i = this.b;
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        i();
        int size = collection.size();
        f(this.b, collection, size);
        return size > 0;
    }

    @Override // defpackage.q1
    public final Object c(int i) {
        i();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        return l(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        m(0, this.b);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.a;
            int i = this.b;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (js3.i(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        j(i, i2);
        Iterator<E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        return this.a[i];
    }

    public final void h(int i, Object obj) {
        ((AbstractList) this).modCount++;
        j(i, 1);
        this.a[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (js3.i(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.a = objArrCopyOf;
        }
        Object[] objArr2 = this.a;
        ew.y0(i + i2, i, this.b, objArr2, objArr2);
        this.b += i2;
    }

    public final Object l(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        ew.y0(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b - 1;
        js3.p(objArr2, "<this>");
        objArr2[i2] = null;
        this.b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (js3.i(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public final void m(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        ew.y0(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        js3.Q(objArr2, i3 - i2, i3);
        this.b -= i2;
    }

    public final int n(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.a[i5]) == z) {
                Object[] objArr = this.a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.a;
        ew.y0(i + i4, i2 + i, this.b, objArr2, objArr2);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        js3.Q(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        js3.p(collection, "elements");
        i();
        return n(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        js3.p(collection, "elements");
        i();
        return n(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        is3.l(i, i2, this.b);
        return new BuilderSubList(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        js3.p(objArr, "array");
        int length = objArr.length;
        int i = this.b;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.a, 0, i, objArr.getClass());
            js3.o(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        ew.y0(0, 0, i, this.a, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return js3.g(this.a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        return new rz2(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        js3.p(collection, "elements");
        i();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            f(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            j(i, 1);
            this.a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return ew.E0(this.a, 0, this.b);
    }
}
