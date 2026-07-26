package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ov extends q1 {
    public static final Object[] d = new Object[0];
    public int a;
    public Object[] b;
    public int c;

    public ov() {
        this.b = d;
    }

    @Override // defpackage.q1
    public final int a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        o();
        f(this.c + 1);
        int iN = n(this.a + i);
        int i3 = this.c;
        if (i < ((i3 + 1) >> 1)) {
            if (iN == 0) {
                Object[] objArr = this.b;
                js3.p(objArr, "<this>");
                iN = objArr.length;
            }
            int i4 = iN - 1;
            int i5 = this.a;
            if (i5 == 0) {
                Object[] objArr2 = this.b;
                js3.p(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i5 - 1;
            }
            int i6 = this.a;
            if (i4 >= i6) {
                Object[] objArr3 = this.b;
                objArr3[length] = objArr3[i6];
                ew.y0(i6, i6 + 1, i4 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.b;
                ew.y0(i6 - 1, i6, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.b;
                objArr5[objArr5.length - 1] = objArr5[0];
                ew.y0(0, 1, i4 + 1, objArr5, objArr5);
            }
            this.b[i4] = obj;
            this.a = length;
        } else {
            int iN2 = n(i3 + this.a);
            if (iN < iN2) {
                Object[] objArr6 = this.b;
                ew.y0(iN + 1, iN, iN2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.b;
                ew.y0(1, 0, iN2, objArr7, objArr7);
                Object[] objArr8 = this.b;
                objArr8[0] = objArr8[objArr8.length - 1];
                ew.y0(iN + 1, iN, objArr8.length - 1, objArr8, objArr8);
            }
            this.b[iN] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        js3.p(collection, "elements");
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        o();
        f(collection.size() + this.c);
        int iN = n(this.c + this.a);
        int iN2 = n(this.a + i);
        int size = collection.size();
        if (i >= ((this.c + 1) >> 1)) {
            int i3 = iN2 + size;
            if (iN2 < iN) {
                int i4 = size + iN;
                Object[] objArr = this.b;
                if (i4 <= objArr.length) {
                    ew.y0(i3, iN2, iN, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    ew.y0(i3 - objArr.length, iN2, iN, objArr, objArr);
                } else {
                    int length = iN - (i4 - objArr.length);
                    ew.y0(0, length, iN, objArr, objArr);
                    Object[] objArr2 = this.b;
                    ew.y0(i3, iN2, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.b;
                ew.y0(size, 0, iN, objArr3, objArr3);
                Object[] objArr4 = this.b;
                if (i3 >= objArr4.length) {
                    ew.y0(i3 - objArr4.length, iN2, objArr4.length, objArr4, objArr4);
                } else {
                    ew.y0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.b;
                    ew.y0(i3, iN2, objArr5.length - size, objArr5, objArr5);
                }
            }
            e(iN2, collection);
            return true;
        }
        int i5 = this.a;
        int length2 = i5 - size;
        if (iN2 < i5) {
            Object[] objArr6 = this.b;
            ew.y0(length2, i5, objArr6.length, objArr6, objArr6);
            if (size >= iN2) {
                Object[] objArr7 = this.b;
                ew.y0(objArr7.length - size, 0, iN2, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.b;
                ew.y0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.b;
                ew.y0(0, size, iN2, objArr9, objArr9);
            }
        } else if (length2 >= 0) {
            Object[] objArr10 = this.b;
            ew.y0(length2, i5, iN2, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.b;
            length2 += objArr11.length;
            int i6 = iN2 - i5;
            int length3 = objArr11.length - length2;
            if (length3 >= i6) {
                ew.y0(length2, i5, iN2, objArr11, objArr11);
            } else {
                ew.y0(length2, i5, i5 + length3, objArr11, objArr11);
                Object[] objArr12 = this.b;
                ew.y0(0, this.a + length3, iN2, objArr12, objArr12);
            }
        }
        this.a = length2;
        e(l(iN2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        o();
        f(this.c + 1);
        int length = this.a;
        if (length == 0) {
            Object[] objArr = this.b;
            js3.p(objArr, "<this>");
            length = objArr.length;
        }
        int i = length - 1;
        this.a = i;
        this.b[i] = obj;
        this.c++;
    }

    public final void addLast(Object obj) {
        o();
        f(a() + 1);
        this.b[n(a() + this.a)] = obj;
        this.c = a() + 1;
    }

    @Override // defpackage.q1
    public final Object c(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(dw1.j(i, i2, "index: ", ", size: "));
        }
        if (i == br9.y(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        o();
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iN];
        if (i < (this.c >> 1)) {
            int i3 = this.a;
            if (iN >= i3) {
                ew.y0(i3 + 1, i3, iN, objArr, objArr);
            } else {
                ew.y0(1, 0, iN, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.a;
                ew.y0(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i5 = this.a;
            objArr3[i5] = null;
            this.a = i(i5);
        } else {
            int iN2 = n(br9.y(this) + this.a);
            if (iN <= iN2) {
                Object[] objArr4 = this.b;
                ew.y0(iN, iN + 1, iN2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                ew.y0(iN, iN + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                ew.y0(0, 1, iN2 + 1, objArr6, objArr6);
            }
            this.b[iN2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            o();
            m(this.a, n(a() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + this.c;
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == d) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ew.y0(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        ew.y0(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[this.a];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(dw1.j(i, iA, "index: ", ", size: "));
        }
        return this.b[n(this.a + i)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.b[this.a];
    }

    public final int i(int i) {
        js3.p(this.b, "<this>");
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iN = n(a() + this.a);
        int length = this.a;
        if (length < iN) {
            while (length < iN) {
                if (js3.i(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iN) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iN; i2++) {
                    if (js3.i(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (js3.i(obj, this.b[length])) {
                i = this.a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return a() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            return null;
        }
        return this.b[n(br9.y(this) + this.a)];
    }

    public final int l(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.b[n(br9.y(this) + this.a)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iN = n(this.c + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            length = iN - 1;
            if (i2 <= length) {
                while (!js3.i(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iN) {
            int i3 = iN - 1;
            while (true) {
                if (-1 >= i3) {
                    Object[] objArr = this.b;
                    js3.p(objArr, "<this>");
                    length = objArr.length - 1;
                    int i4 = this.a;
                    if (i4 <= length) {
                        while (!js3.i(obj, this.b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (js3.i(obj, this.b[i3])) {
                        length = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    public final void m(int i, int i2) {
        if (i < i2) {
            ew.F0(i, i2, null, this.b);
            return;
        }
        Object[] objArr = this.b;
        ew.F0(i, objArr.length, null, objArr);
        ew.F0(0, i2, null, this.b);
    }

    public final int n(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void o() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iN;
        js3.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(a() + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.b[iN] = obj;
                        iN++;
                    }
                    i++;
                }
                ew.F0(iN, iN2, null, this.b);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.b[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = l(iN - this.a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = i(i);
        this.c = a() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        o();
        int iN = n(br9.y(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[iN];
        objArr[iN] = null;
        this.c = a() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        is3.l(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            c(i);
            return;
        }
        o();
        if (i < this.c - i2) {
            int iN = n(this.a + (i - 1));
            int iN2 = n(this.a + (i2 - 1));
            while (i > 0) {
                int i4 = iN + 1;
                int iMin = Math.min(i, Math.min(i4, iN2 + 1));
                Object[] objArr = this.b;
                int i5 = iN2 - iMin;
                int i6 = iN - iMin;
                ew.y0(i5 + 1, i6 + 1, i4, objArr, objArr);
                iN = l(i6);
                iN2 = l(i5);
                i -= iMin;
            }
            int iN3 = n(this.a + i3);
            m(this.a, iN3);
            this.a = iN3;
        } else {
            int iN4 = n(this.a + i2);
            int iN5 = n(this.a + i);
            int i7 = this.c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i7, Math.min(objArr2.length - iN4, objArr2.length - iN5));
                Object[] objArr3 = this.b;
                int i8 = iN4 + i2;
                ew.y0(iN5, iN4, i8, objArr3, objArr3);
                iN4 = n(i8);
                iN5 = n(iN5 + i2);
            }
            int iN6 = n(this.c + this.a);
            m(l(iN6 - i3), iN6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iN;
        js3.p(collection, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iN2 = n(a() + this.a);
            int i = this.a;
            if (i < iN2) {
                iN = i;
                while (i < iN2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iN] = obj;
                        iN++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                ew.F0(iN, iN2, null, this.b);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iN = n(i2);
                for (int i3 = 0; i3 < iN2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iN] = obj3;
                        iN = i(iN);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                o();
                this.c = l(iN - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iA = a();
        if (i < 0 || i >= iA) {
            throw new IndexOutOfBoundsException(dw1.j(i, iA, "index: ", ", size: "));
        }
        int iN = n(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iN];
        objArr[iN] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[a()]);
    }

    public ov(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = d;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(rm7.n(i, "Illegal Capacity: "));
        }
        this.b = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        js3.p(objArr, "array");
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iN = n(this.c + this.a);
        int i2 = this.a;
        if (i2 < iN) {
            ew.C0(i2, iN, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            ew.y0(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            ew.y0(objArr3.length - this.a, 0, iN, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    public ov(gj4 gj4Var) {
        Object[] objArrC = tv8.C(gj4Var, new Object[0]);
        this.b = objArrC;
        this.c = objArrC.length;
        if (objArrC.length == 0) {
            this.b = d;
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        o();
        f(collection.size() + a());
        e(n(a() + this.a), collection);
        return true;
    }
}
