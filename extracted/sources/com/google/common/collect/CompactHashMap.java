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
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class CompactHashMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object j = new Object();
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] d;
    public transient int e;
    public transient int f;
    public transient z g;
    public transient z h;
    public transient b0 i;

    public CompactHashMap() {
        m(3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new InvalidObjectException(rm7.n(i, "Invalid size: "));
        }
        m(i);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapG = g();
        Iterator<Map.Entry<K, V>> it = mapG != null ? mapG.entrySet().iterator() : new y(this, 1);
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void a(int i) {
    }

    public int b(int i, int i2) {
        return i - 1;
    }

    public int c() {
        wn5.s("Arrays already allocated", p());
        int i = this.e;
        int iMax = Math.max(4, y97.s(i + 1, 1.0d));
        this.a = at2.U(iMax);
        this.e = at2.f0(this.e, 32 - Integer.numberOfLeadingZeros(iMax - 1), 31);
        this.b = new int[i];
        this.c = new Object[i];
        this.d = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (p()) {
            return;
        }
        k();
        Map mapG = g();
        if (mapG != null) {
            this.e = com.google.common.primitives.a.c(size(), 3);
            mapG.clear();
            this.a = null;
            this.f = 0;
            return;
        }
        Arrays.fill(s(), 0, this.f, (Object) null);
        Arrays.fill(t(), 0, this.f, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(r(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapG = g();
        return mapG != null ? mapG.containsKey(obj) : l(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.containsValue(obj);
        }
        for (int i = 0; i < this.f; i++) {
            if (s7.l(obj, t()[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Map e() {
        LinkedHashMap linkedHashMapF = f(j() + 1);
        int iH = h();
        while (iH >= 0) {
            linkedHashMapF.put(s()[iH], t()[iH]);
            iH = i(iH);
        }
        this.a = linkedHashMapF;
        this.b = null;
        this.c = null;
        this.d = null;
        k();
        return linkedHashMapF;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        z zVar = this.h;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(0, this);
        this.h = zVar2;
        return zVar2;
    }

    public LinkedHashMap f(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    public final Map g() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.get(obj);
        }
        int iL = l(obj);
        if (iL == -1) {
            return null;
        }
        a(iL);
        return t()[iL];
    }

    public int h() {
        return isEmpty() ? -1 : 0;
    }

    public int i(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final int j() {
        return (1 << (this.e & 31)) - 1;
    }

    public final void k() {
        this.e += 32;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        z zVar = this.g;
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(1, this);
        this.g = zVar2;
        return zVar2;
    }

    public final int l(Object obj) {
        if (p()) {
            return -1;
        }
        int iB0 = y97.b0(obj);
        int iJ = j();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iK0 = at2.k0(iB0 & iJ, obj2);
        if (iK0 == 0) {
            return -1;
        }
        int i = ~iJ;
        int i2 = iB0 & i;
        do {
            int i3 = iK0 - 1;
            int i4 = r()[i3];
            if ((i4 & i) == i2 && s7.l(obj, s()[i3])) {
                return i3;
            }
            iK0 = i4 & iJ;
        } while (iK0 != 0);
        return -1;
    }

    public void m(int i) {
        wn5.i("Expected size must be >= 0", i >= 0);
        this.e = com.google.common.primitives.a.c(i, 1);
    }

    public void n(int i, int i2, int i3, Object obj, Object obj2) {
        r()[i] = at2.f0(i2, 0, i3);
        s()[i] = obj;
        t()[i] = obj2;
    }

    public void o(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrR = r();
        Object[] objArrS = s();
        Object[] objArrT = t();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrS[i] = null;
            objArrT[i] = null;
            iArrR[i] = 0;
            return;
        }
        Object obj2 = objArrS[i3];
        objArrS[i] = obj2;
        objArrT[i] = objArrT[i3];
        objArrS[i3] = null;
        objArrT[i3] = null;
        iArrR[i] = iArrR[i3];
        iArrR[i3] = 0;
        int iB0 = y97.b0(obj2) & i2;
        int iK0 = at2.k0(iB0, obj);
        if (iK0 == size) {
            at2.l0(iB0, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iK0 - 1;
            int i5 = iArrR[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrR[i4] = at2.f0(i5, i + 1, i2);
                return;
            }
            iK0 = i6;
        }
    }

    public final boolean p() {
        return this.a == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object put(java.lang.Object r18, java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.CompactHashMap.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final Object q(Object obj) {
        boolean zP = p();
        Object obj2 = j;
        if (zP) {
            return obj2;
        }
        int iJ = j();
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iJ0 = at2.j0(obj, null, iJ, obj3, r(), s(), null);
        if (iJ0 == -1) {
            return obj2;
        }
        Object obj4 = t()[iJ0];
        o(iJ0, iJ);
        this.f--;
        k();
        return obj4;
    }

    public final int[] r() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapG = g();
        if (mapG != null) {
            return mapG.remove(obj);
        }
        Object objQ = q(obj);
        if (objQ == j) {
            return null;
        }
        return objQ;
    }

    public final Object[] s() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapG = g();
        return mapG != null ? mapG.size() : this.f;
    }

    public final Object[] t() {
        Object[] objArr = this.d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public void v(int i) {
        this.b = Arrays.copyOf(r(), i);
        this.c = Arrays.copyOf(s(), i);
        this.d = Arrays.copyOf(t(), i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        b0 b0Var = this.i;
        if (b0Var != null) {
            return b0Var;
        }
        b0 b0Var2 = new b0(this, 0);
        this.i = b0Var2;
        return b0Var2;
    }

    public final int w(int i, int i2, int i3, int i4) {
        Object objU = at2.U(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            at2.l0(i3 & i5, i4 + 1, objU);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrR = r();
        for (int i6 = 0; i6 <= i; i6++) {
            int iK0 = at2.k0(i6, obj);
            while (iK0 != 0) {
                int i7 = iK0 - 1;
                int i8 = iArrR[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iK02 = at2.k0(i10, objU);
                at2.l0(i10, iK0, objU);
                iArrR[i7] = at2.f0(i9, iK02, i5);
                iK0 = i8 & i;
            }
        }
        this.a = objU;
        this.e = at2.f0(this.e, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    public CompactHashMap(int i) {
        m(i);
    }
}
