package com.google.common.collect;

import defpackage.at2;
import defpackage.rm7;
import defpackage.s7;
import defpackage.wn5;
import defpackage.y97;
import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class CompactHashSet<E> extends AbstractSet<E> implements Serializable {
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient int d;
    public transient int e;

    public CompactHashSet(int i) {
        j(i);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(rm7.n(i, "Invalid size: "));
        }
        j(i);
        for (int i2 = 0; i2 < i; i2++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    public int a(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int iMin;
        if (n()) {
            c();
        }
        Set setF = f();
        if (setF != null) {
            return setF.add(obj);
        }
        int[] iArrP = p();
        Object[] objArrO = o();
        int i = this.e;
        int i2 = i + 1;
        int iB0 = y97.b0(obj);
        int iR = (1 << (this.d & 31)) - 1;
        int i3 = iB0 & iR;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iK0 = at2.k0(i3, obj2);
        if (iK0 != 0) {
            int i4 = ~iR;
            int i5 = iB0 & i4;
            int i6 = 0;
            while (true) {
                int i7 = iK0 - 1;
                int i8 = iArrP[i7];
                if ((i8 & i4) == i5 && s7.l(obj, objArrO[i7])) {
                    return false;
                }
                int i9 = i8 & iR;
                i6++;
                if (i9 != 0) {
                    iK0 = i9;
                } else {
                    if (i6 >= 9) {
                        return e().add(obj);
                    }
                    if (i2 > iR) {
                        iR = r(iR, at2.g0(iR), iB0, i);
                    } else {
                        iArrP[i7] = at2.f0(i8, i2, iR);
                    }
                }
            }
        } else if (i2 > iR) {
            iR = r(iR, at2.g0(iR), iB0, i);
        } else {
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            at2.l0(i3, i2, obj3);
        }
        int length = p().length;
        if (i2 > length && (iMin = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            q(iMin);
        }
        l(obj, i, iB0, iR);
        this.e = i2;
        this.d += 32;
        return true;
    }

    public int c() {
        wn5.s("Arrays already allocated", n());
        int i = this.d;
        int iMax = Math.max(4, y97.s(i + 1, 1.0d));
        this.a = at2.U(iMax);
        this.d = at2.f0(this.d, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.b = new int[i];
        this.c = new Object[i];
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (n()) {
            return;
        }
        this.d += 32;
        Set setF = f();
        if (setF != null) {
            this.d = com.google.common.primitives.a.c(size(), 3);
            setF.clear();
            this.a = null;
            this.e = 0;
            return;
        }
        Arrays.fill(o(), 0, this.e, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(p(), 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (n()) {
            return false;
        }
        Set setF = f();
        if (setF != null) {
            return setF.contains(obj);
        }
        int iB0 = y97.b0(obj);
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iK0 = at2.k0(iB0 & i, obj2);
        if (iK0 == 0) {
            return false;
        }
        int i2 = ~i;
        int i3 = iB0 & i2;
        do {
            int i4 = iK0 - 1;
            int i5 = p()[i4];
            if ((i5 & i2) == i3 && s7.l(obj, o()[i4])) {
                return true;
            }
            iK0 = i5 & i;
        } while (iK0 != 0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LinkedHashSet e() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(1 << (this.d & 31), 1.0f);
        int iH = h();
        while (iH >= 0) {
            linkedHashSet.add(o()[iH]);
            iH = i(iH);
        }
        this.a = linkedHashSet;
        this.b = null;
        this.c = null;
        this.d += 32;
        return linkedHashSet;
    }

    public final Set f() {
        Object obj = this.a;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    public int h() {
        return isEmpty() ? -1 : 0;
    }

    public int i(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Set setF = f();
        return setF != null ? setF.iterator() : new c0(this);
    }

    public void j(int i) {
        wn5.i("Expected size must be >= 0", i >= 0);
        this.d = com.google.common.primitives.a.c(i, 1);
    }

    public void l(Object obj, int i, int i2, int i3) {
        p()[i] = at2.f0(i2, 0, i3);
        o()[i] = obj;
    }

    public void m(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        Object[] objArrO = o();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrO[i] = null;
            iArrP[i] = 0;
            return;
        }
        Object obj2 = objArrO[i3];
        objArrO[i] = obj2;
        objArrO[i3] = null;
        iArrP[i] = iArrP[i3];
        iArrP[i3] = 0;
        int iB0 = y97.b0(obj2) & i2;
        int iK0 = at2.k0(iB0, obj);
        if (iK0 == size) {
            at2.l0(iB0, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iK0 - 1;
            int i5 = iArrP[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrP[i4] = at2.f0(i5, i + 1, i2);
                return;
            }
            iK0 = i6;
        }
    }

    public final boolean n() {
        return this.a == null;
    }

    public final Object[] o() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int[] p() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public void q(int i) {
        this.b = Arrays.copyOf(p(), i);
        this.c = Arrays.copyOf(o(), i);
    }

    public final int r(int i, int i2, int i3, int i4) {
        Object objU = at2.U(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            at2.l0(i3 & i5, i4 + 1, objU);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrP = p();
        for (int i6 = 0; i6 <= i; i6++) {
            int iK0 = at2.k0(i6, obj);
            while (iK0 != 0) {
                int i7 = iK0 - 1;
                int i8 = iArrP[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iK02 = at2.k0(i10, objU);
                at2.l0(i10, iK0, objU);
                iArrP[i7] = at2.f0(i9, iK02, i5);
                iK0 = i8 & i;
            }
        }
        this.a = objU;
        this.d = at2.f0(this.d, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (n()) {
            return false;
        }
        Set setF = f();
        if (setF != null) {
            return setF.remove(obj);
        }
        int i = (1 << (this.d & 31)) - 1;
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iJ0 = at2.j0(obj, null, i, obj2, p(), o(), null);
        if (iJ0 == -1) {
            return false;
        }
        m(iJ0, i);
        this.e--;
        this.d += 32;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set setF = f();
        return setF != null ? setF.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (n()) {
            return new Object[0];
        }
        Set setF = f();
        return setF != null ? setF.toArray() : Arrays.copyOf(o(), this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (n()) {
            if (objArr.length > 0) {
                objArr[0] = null;
            }
            return objArr;
        }
        Set setF = f();
        if (setF != null) {
            return setF.toArray(objArr);
        }
        Object[] objArrO = o();
        int i = this.e;
        wn5.o(0, i, objArrO.length);
        if (objArr.length < i) {
            if (objArr.length != 0) {
                objArr = Arrays.copyOf(objArr, 0);
            }
            objArr = Arrays.copyOf(objArr, i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        System.arraycopy(objArrO, 0, objArr, 0, i);
        return objArr;
    }
}
