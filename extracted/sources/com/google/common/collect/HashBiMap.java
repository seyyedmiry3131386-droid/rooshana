package com.google.common.collect;

import defpackage.b47;
import defpackage.o40;
import defpackage.rv;
import defpackage.s7;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.wu8;
import defpackage.xa0;
import defpackage.y97;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class HashBiMap<K, V> extends AbstractMap<K, V> implements xa0, Serializable {
    public transient Object[] a;
    public transient Object[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    public transient int[] f;
    public transient int[] g;
    public transient int[] h;
    public transient int i;
    public transient int j;
    public transient int[] k;
    public transient int[] l;
    public transient xa0 m;

    public static class Inverse<K, V> extends AbstractMap<V, K> implements xa0, Serializable {
        public transient rv a;

        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final void clear() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsKey(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final boolean containsValue(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set entrySet() {
            rv rvVar = this.a;
            if (rvVar != null) {
                return rvVar;
            }
            rv rvVar2 = new rv(null);
            this.a = rvVar2;
            return rvVar2;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object get(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set keySet() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object put(Object obj, Object obj2) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Object remove(Object obj) {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final int size() {
            throw null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Collection values() {
            throw null;
        }

        @Override // defpackage.xa0
        public final xa0 y() {
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map, defpackage.xa0
        public final Set values() {
            throw null;
        }
    }

    public static int[] b(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        vy2.m(16, "expectedSize");
        int iS = y97.s(16, 1.0d);
        this.c = 0;
        this.a = new Object[16];
        this.b = new Object[16];
        this.e = b(iS);
        this.f = b(iS);
        this.g = b(16);
        this.h = b(16);
        this.i = -2;
        this.j = -2;
        this.k = b(16);
        this.l = b(16);
        b47.j(this, objectInputStream, i);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b47.w(this, objectOutputStream);
    }

    public final int a(int i) {
        return i & (this.e.length - 1);
    }

    public final void c(int i, int i2) {
        wn5.j(i != -1);
        int iA = a(i2);
        int[] iArr = this.e;
        int i3 = iArr[iA];
        if (i3 == i) {
            int[] iArr2 = this.g;
            iArr[iA] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.g[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with key " + this.a[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.g;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.g[i3];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1);
        Arrays.fill(this.g, 0, this.c, -1);
        Arrays.fill(this.h, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.l, 0, this.c, -1);
        this.c = 0;
        this.i = -2;
        this.j = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return g(y97.b0(obj), obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return h(y97.b0(obj), obj) != -1;
    }

    public final void e(int i, int i2) {
        wn5.j(i != -1);
        int iA = a(i2);
        int[] iArr = this.f;
        int i3 = iArr[iA];
        if (i3 == i) {
            int[] iArr2 = this.h;
            iArr[iA] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.h[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                throw new AssertionError("Expected to find entry with value " + this.b[i]);
            }
            if (i3 == i) {
                int[] iArr3 = this.h;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
            i4 = this.h[i3];
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return null;
    }

    public final void f(int i) {
        int[] iArr = this.g;
        if (iArr.length < i) {
            int iT = wu8.t(iArr.length, i);
            this.a = Arrays.copyOf(this.a, iT);
            this.b = Arrays.copyOf(this.b, iT);
            int[] iArr2 = this.g;
            int length = iArr2.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr2, iT);
            Arrays.fill(iArrCopyOf, length, iT, -1);
            this.g = iArrCopyOf;
            int[] iArr3 = this.h;
            int length2 = iArr3.length;
            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, iT);
            Arrays.fill(iArrCopyOf2, length2, iT, -1);
            this.h = iArrCopyOf2;
            int[] iArr4 = this.k;
            int length3 = iArr4.length;
            int[] iArrCopyOf3 = Arrays.copyOf(iArr4, iT);
            Arrays.fill(iArrCopyOf3, length3, iT, -1);
            this.k = iArrCopyOf3;
            int[] iArr5 = this.l;
            int length4 = iArr5.length;
            int[] iArrCopyOf4 = Arrays.copyOf(iArr5, iT);
            Arrays.fill(iArrCopyOf4, length4, iT, -1);
            this.l = iArrCopyOf4;
        }
        if (this.e.length < i) {
            int iS = y97.s(i, 1.0d);
            this.e = b(iS);
            this.f = b(iS);
            for (int i2 = 0; i2 < this.c; i2++) {
                int iA = a(y97.b0(this.a[i2]));
                int[] iArr6 = this.g;
                int[] iArr7 = this.e;
                iArr6[i2] = iArr7[iA];
                iArr7[iA] = i2;
                int iA2 = a(y97.b0(this.b[i2]));
                int[] iArr8 = this.h;
                int[] iArr9 = this.f;
                iArr8[i2] = iArr9[iA2];
                iArr9[iA2] = i2;
            }
        }
    }

    public final int g(int i, Object obj) {
        int[] iArr = this.e;
        int[] iArr2 = this.g;
        Object[] objArr = this.a;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (s7.l(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        int iG = g(y97.b0(obj), obj);
        if (iG == -1) {
            return null;
        }
        return this.b[iG];
    }

    public final int h(int i, Object obj) {
        int[] iArr = this.f;
        int[] iArr2 = this.h;
        Object[] objArr = this.b;
        for (int i2 = iArr[a(i)]; i2 != -1; i2 = iArr2[i2]) {
            if (s7.l(objArr[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    public final void i(int i, int i2) {
        wn5.j(i != -1);
        int iA = a(i2);
        int[] iArr = this.g;
        int[] iArr2 = this.e;
        iArr[i] = iArr2[iA];
        iArr2[iA] = i;
    }

    public final void j(int i, int i2) {
        wn5.j(i != -1);
        int iA = a(i2);
        int[] iArr = this.h;
        int[] iArr2 = this.f;
        iArr[i] = iArr2[iA];
        iArr2[iA] = i;
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        int i5;
        wn5.j(i != -1);
        c(i, i2);
        e(i, i3);
        n(this.k[i], this.l[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.k[i6];
            int i8 = this.l[i6];
            n(i7, i);
            n(i, i8);
            Object[] objArr = this.a;
            Object obj = objArr[i6];
            Object[] objArr2 = this.b;
            Object obj2 = objArr2[i6];
            objArr[i] = obj;
            objArr2[i] = obj2;
            int iA = a(y97.b0(obj));
            int[] iArr = this.e;
            int i9 = iArr[iA];
            if (i9 == i6) {
                iArr[iA] = i;
            } else {
                int i10 = this.g[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    } else {
                        i10 = this.g[i9];
                    }
                }
                this.g[i4] = i;
            }
            int[] iArr2 = this.g;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int iA2 = a(y97.b0(obj2));
            int[] iArr3 = this.f;
            int i11 = iArr3[iA2];
            if (i11 == i6) {
                iArr3[iA2] = i;
            } else {
                int i12 = this.h[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    } else {
                        i12 = this.h[i11];
                    }
                }
                this.h[i5] = i;
            }
            int[] iArr4 = this.h;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        Object[] objArr3 = this.a;
        int i13 = this.c;
        objArr3[i13 - 1] = null;
        this.b[i13 - 1] = null;
        this.c = i13 - 1;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return null;
    }

    public final void l(int i, int i2) {
        k(i, i2, y97.b0(this.b[i]));
    }

    public final void m(int i, Object obj) {
        wn5.j(i != -1);
        int iG = g(y97.b0(obj), obj);
        int i2 = this.j;
        if (iG != -1) {
            throw new IllegalArgumentException(o40.x(obj, "Key already present in map: "));
        }
        if (i2 == i) {
            i2 = this.k[i];
        } else if (i2 == this.c) {
            i2 = iG;
        }
        if (-2 == i) {
            iG = this.l[i];
        } else if (-2 != this.c) {
            iG = -2;
        }
        n(this.k[i], this.l[i]);
        c(i, y97.b0(this.a[i]));
        this.a[i] = obj;
        i(i, y97.b0(obj));
        n(i2, i);
        n(i, iG);
    }

    public final void n(int i, int i2) {
        if (i == -2) {
            this.i = i2;
        } else {
            this.l[i] = i2;
        }
        if (i2 == -2) {
            this.j = i;
        } else {
            this.k[i2] = i;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iB0 = y97.b0(obj);
        int iG = g(iB0, obj);
        if (iG != -1) {
            Object obj3 = this.b[iG];
            if (s7.l(obj3, obj2)) {
                return obj2;
            }
            wn5.j(iG != -1);
            int iB02 = y97.b0(obj2);
            if (h(iB02, obj2) != -1) {
                throw new IllegalArgumentException(o40.x(obj2, "Value already present in map: "));
            }
            e(iG, y97.b0(this.b[iG]));
            this.b[iG] = obj2;
            j(iG, iB02);
            return obj3;
        }
        int iB03 = y97.b0(obj2);
        wn5.g(obj2, "Value already present: %s", h(iB03, obj2) == -1);
        f(this.c + 1);
        Object[] objArr = this.a;
        int i = this.c;
        objArr[i] = obj;
        this.b[i] = obj2;
        i(i, iB0);
        j(this.c, iB03);
        n(this.j, this.c);
        n(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        int iB0 = y97.b0(obj);
        int iG = g(iB0, obj);
        if (iG == -1) {
            return null;
        }
        Object obj2 = this.b[iG];
        l(iG, iB0);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.xa0
    public final Set values() {
        return null;
    }

    @Override // defpackage.xa0
    public final xa0 y() {
        return this.m;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return null;
    }
}
