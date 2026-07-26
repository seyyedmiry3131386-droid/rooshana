package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class u66 extends q1 implements b66 {
    public int a;
    public v1 b;
    public ql3 c;
    public Object[] d;
    public Object[] e;
    public int f;

    public u66(v1 v1Var, Object[] objArr, Object[] objArr2, int i) {
        js3.p(objArr2, "vectorTail");
        this.a = i;
        this.b = v1Var;
        this.c = new ql3();
        this.d = objArr;
        this.e = objArr2;
        this.f = v1Var.a();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(u1 u1Var, Object[] objArr, int i, int i2, t15 t15Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = t15Var.b;
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) u1Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i2 = 0;
                }
                objArrQ[i2] = obj2;
                i2++;
            }
        }
        t15Var.b = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(u1 u1Var, Object[] objArr, int i, t15 t15Var) {
        Object[] objArrO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) u1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrO = o(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrO[i2] = obj;
                i2++;
            }
        }
        t15Var.b = objArrO;
        return i2;
    }

    public final int C(u1 u1Var, int i, t15 t15Var) {
        int iB = B(u1Var, this.e, i, t15Var);
        if (iB == i) {
            return i;
        }
        Object obj = t15Var.b;
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i, (Object) null);
        L(objArr);
        this.f -= i - iB;
        return iB;
    }

    public final Object[] D(Object[] objArr, int i, int i2, t15 t15Var) {
        int iF = c67.f(i2, i);
        if (i == 0) {
            Object obj = objArr[iF];
            Object[] objArrO = o(objArr);
            ew.y0(iF, iF + 1, 32, objArr, objArrO);
            objArrO[31] = t15Var.b;
            t15Var.b = obj;
            return objArrO;
        }
        int iF2 = objArr[31] == null ? c67.f(F() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        int i4 = iF + 1;
        if (i4 <= iF2) {
            while (true) {
                Object obj2 = objArrO2[iF2];
                js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrO2[iF2] = D((Object[]) obj2, i3, 0, t15Var);
                if (iF2 == i4) {
                    break;
                }
                iF2--;
            }
        }
        Object obj3 = objArrO2[iF];
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iF] = D((Object[]) obj3, i3, i2, t15Var);
        return objArrO2;
    }

    public final Object E(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.f - i;
        if (i4 == 1) {
            Object obj = this.e[0];
            v(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.e;
        Object obj2 = objArr2[i3];
        Object[] objArrO = o(objArr2);
        ew.y0(i3, i3 + 1, i4, objArr2, objArrO);
        objArrO[i4 - 1] = null;
        H(objArr);
        L(objArrO);
        this.f = (i + i4) - 1;
        this.a = i2;
        return obj2;
    }

    public final int F() {
        int i = this.f;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] G(Object[] objArr, int i, int i2, Object obj, t15 t15Var) {
        int iF = c67.f(i2, i);
        Object[] objArrO = o(objArr);
        if (i != 0) {
            Object obj2 = objArrO[iF];
            js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO[iF] = G((Object[]) obj2, i - 5, i2, obj, t15Var);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        t15Var.b = objArrO[iF];
        objArrO[iF] = obj;
        return objArrO;
    }

    public final void H(Object[] objArr) {
        if (objArr != this.d) {
            this.b = null;
            this.d = objArr;
        }
    }

    public final void L(Object[] objArr) {
        if (objArr != this.e) {
            this.b = null;
            this.e = objArr;
        }
    }

    public final void M(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrQ;
        if (i3 < 1) {
            throw new IllegalStateException("Check failed.");
        }
        Object[] objArrO = o(objArr);
        objArr2[0] = objArrO;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            ew.y0(size + 1, i4, i2, objArrO, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrQ = objArrO;
            } else {
                objArrQ = q();
                i3--;
                objArr2[i3] = objArrQ;
            }
            int i7 = i2 - i6;
            ew.y0(0, i7, i2, objArrO, objArr3);
            ew.y0(size + 1, i4, i7, objArrO, objArrQ);
            objArr3 = objArrQ;
        }
        Iterator it = collection.iterator();
        f(objArrO, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrQ2 = q();
            f(objArrQ2, 0, it);
            objArr2[i8] = objArrQ2;
        }
        f(objArr3, 0, it);
    }

    public final int N() {
        int i = this.f;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.q1
    public final int a() {
        return this.f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        tt3.o(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i >= iF) {
            l(i - iF, obj, this.d);
            return;
        }
        t15 t15Var = new t15(3, null);
        Object[] objArr = this.d;
        js3.m(objArr);
        l(0, t15Var.b, i(objArr, this.a, i, obj, t15Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        u66 u66Var;
        Object[] objArrQ;
        js3.p(collection, "elements");
        tt3.o(i, this.f);
        if (i == this.f) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.e;
            Object[] objArrO = o(objArr);
            ew.y0(size2 + 1, i3, N(), objArr, objArrO);
            f(objArrO, i3, collection.iterator());
            L(objArrO);
            this.f = collection.size() + this.f;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iN = N();
        int size3 = collection.size() + this.f;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= F()) {
            objArrQ = q();
            collection2 = collection;
            M(collection2, i, this.e, iN, objArr2, size, objArrQ);
            u66Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            u66Var = this;
            if (size3 > iN) {
                int i4 = size3 - iN;
                Object[] objArrP = p(i4, u66Var.e);
                u66Var.j(collection2, i, i4, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                Object[] objArr3 = u66Var.e;
                objArrQ = q();
                int i5 = iN - size3;
                ew.y0(0, i5, iN, objArr3, objArrQ);
                int i6 = 32 - i5;
                Object[] objArrP2 = p(i6, u66Var.e);
                int i7 = size - 1;
                objArr2[i7] = objArrP2;
                u66Var.j(collection2, i, i6, objArr2, i7, objArrP2);
                collection2 = collection2;
            }
        }
        H(x(u66Var.d, i2, objArr2));
        L(objArrQ);
        u66Var.f = collection2.size() + u66Var.f;
        return true;
    }

    @Override // defpackage.q1
    public final Object c(int i) {
        tt3.n(i, a());
        ((AbstractList) this).modCount++;
        int iF = F();
        if (i >= iF) {
            return E(this.d, iF, this.a, i - iF);
        }
        t15 t15Var = new t15(3, this.e[0]);
        Object[] objArr = this.d;
        js3.m(objArr);
        E(D(objArr, this.a, i, t15Var), iF, this.a, 0);
        return t15Var.b;
    }

    public final v1 e() {
        v1 s66Var = this.b;
        if (s66Var == null) {
            Object[] objArr = this.d;
            Object[] objArr2 = this.e;
            this.c = new ql3();
            if (objArr != null) {
                s66Var = new s66(objArr, objArr2, this.f, this.a);
            } else if (objArr2.length == 0) {
                s66Var = kz7.b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.f);
                js3.o(objArrCopyOf, "copyOf(...)");
                s66Var = new kz7(objArrCopyOf);
            }
            this.b = s66Var;
        }
        return s66Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        tt3.n(i, a());
        if (F() <= i) {
            objArr = this.e;
        } else {
            objArr = this.d;
            js3.m(objArr);
            for (int i2 = this.a; i2 > 0; i2 -= 5) {
                Object obj = objArr[c67.f(i, i2)];
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final Object[] i(Object[] objArr, int i, int i2, Object obj, t15 t15Var) {
        Object obj2;
        int iF = c67.f(i2, i);
        if (i == 0) {
            t15Var.b = objArr[31];
            Object[] objArrO = o(objArr);
            ew.y0(iF + 1, iF, 31, objArr, objArrO);
            objArrO[iF] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i3 = i - 5;
        Object obj3 = objArrO2[iF];
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[iF] = i((Object[]) obj3, i3, i2, obj, t15Var);
        while (true) {
            iF++;
            if (iF >= 32 || (obj2 = objArrO2[iF]) == null) {
                break;
            }
            objArrO2[iF] = i((Object[]) obj2, i3, 0, t15Var.b, t15Var);
        }
        return objArrO2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int i4 = i >> 5;
        c1 c1VarN = n(F() >> 5);
        int i5 = i3;
        Object[] objArrP = objArr2;
        while (c1VarN.b - 1 != i4) {
            Object[] objArr3 = (Object[]) c1VarN.previous();
            ew.y0(0, 32 - i2, 32, objArr3, objArrP);
            objArrP = p(i2, objArr3);
            i5--;
            objArr[i5] = objArrP;
        }
        Object[] objArr4 = (Object[]) c1VarN.previous();
        int iF = i3 - (((F() >> 5) - 1) - i4);
        if (iF < i3) {
            objArr2 = objArr[iF];
            js3.m(objArr2);
        }
        M(collection, i, objArr4, 32, objArr, iF, objArr2);
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iN = N();
        Object[] objArrO = o(this.e);
        if (iN >= 32) {
            Object[] objArr2 = this.e;
            Object obj2 = objArr2[31];
            ew.y0(i + 1, i, 31, objArr2, objArrO);
            objArrO[i] = obj;
            y(objArr, objArrO, r(obj2));
            return;
        }
        ew.y0(i + 1, i, iN, this.e, objArrO);
        objArrO[i] = obj;
        H(objArr);
        L(objArrO);
        this.f++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        tt3.o(i, this.f);
        return new y66(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.c;
    }

    public final c1 n(int i) {
        if (this.d == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int iF = F() >> 5;
        tt3.o(i, iF);
        int i2 = this.a;
        if (i2 == 0) {
            Object[] objArr = this.d;
            js3.m(objArr);
            return new ih0(i, objArr);
        }
        Object[] objArr2 = this.d;
        js3.m(objArr2);
        return new ms8(objArr2, i, iF, i2 / 5);
    }

    public final Object[] o(Object[] objArr) {
        if (objArr == null) {
            return q();
        }
        if (m(objArr)) {
            return objArr;
        }
        Object[] objArrQ = q();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        ew.C0(0, length, 6, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] p(int i, Object[] objArr) {
        if (m(objArr)) {
            ew.y0(i, 0, 32 - i, objArr, objArr);
            return objArr;
        }
        Object[] objArrQ = q();
        ew.y0(i, 0, 32 - i, objArr, objArrQ);
        return objArrQ;
    }

    public final Object[] q() {
        Object[] objArr = new Object[33];
        objArr[32] = this.c;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.c;
        return objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r2 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r0 != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (C(r3, r15, r7) != r15) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r2 = r14;
     */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean removeAll(java.util.Collection r15) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u66.removeAll(java.util.Collection):boolean");
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iF = c67.f(i, i2);
        Object obj = objArr[iF];
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objS = s((Object[]) obj, i, i2 - 5);
        if (iF < 31) {
            int i3 = iF + 1;
            if (objArr[i3] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrQ = q();
                ew.y0(0, 0, i3, objArr, objArrQ);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[iF]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[iF] = objS;
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        tt3.n(i, a());
        if (F() > i) {
            t15 t15Var = new t15(3, null);
            Object[] objArr = this.d;
            js3.m(objArr);
            H(G(objArr, this.a, i, obj, t15Var));
            return t15Var.b;
        }
        Object[] objArrO = o(this.e);
        if (objArrO != this.e) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrO[i2];
        objArrO[i2] = obj;
        L(objArrO);
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, t15 t15Var) {
        Object[] objArrT;
        int iF = c67.f(i2 - 1, i);
        if (i == 5) {
            t15Var.b = objArr[iF];
            objArrT = null;
        } else {
            Object obj = objArr[iF];
            js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT = t((Object[]) obj, i - 5, i2, t15Var);
        }
        if (objArrT == null && iF == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[iF] = objArrT;
        return objArrO;
    }

    public final void v(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            H(null);
            if (objArr == null) {
                objArr = new Object[0];
            }
            L(objArr);
            this.f = i;
            this.a = i2;
            return;
        }
        t15 t15Var = new t15(3, obj);
        js3.m(objArr);
        Object[] objArrT = t(objArr, i2, i, t15Var);
        js3.m(objArrT);
        Object obj2 = t15Var.b;
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        L((Object[]) obj2);
        this.f = i;
        if (objArrT[1] == null) {
            H((Object[]) objArrT[0]);
            this.a = i2 - 5;
        } else {
            H(objArrT);
            this.a = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 < 0) {
            throw new IllegalStateException("Check failed.");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int iF = c67.f(i, i2);
        int i3 = i2 - 5;
        objArrO[iF] = w((Object[]) objArrO[iF], i, i3, it);
        while (true) {
            iF++;
            if (iF >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[iF] = w((Object[]) objArrO[iF], 0, i3, it);
        }
        return objArrO;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        w0 w0VarK = c26.K(objArr2);
        int i2 = i >> 5;
        int i3 = this.a;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, w0VarK) : o(objArr);
        while (w0VarK.hasNext()) {
            this.a += 5;
            objArrW = r(objArrW);
            int i4 = this.a;
            w(objArrW, 1 << i4, i4, w0VarK);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f >> 5;
        int i2 = this.a;
        if (i > (1 << i2)) {
            H(z(this.a + 5, r(objArr), objArr2));
            L(objArr3);
            this.a += 5;
            this.f++;
            return;
        }
        if (objArr == null) {
            H(objArr2);
            L(objArr3);
            this.f++;
        } else {
            H(z(i2, objArr, objArr2));
            L(objArr3);
            this.f++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int iF = c67.f(a() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[iF] = objArr2;
            return objArrO;
        }
        objArrO[iF] = z(i - 5, (Object[]) objArrO[iF], objArr2);
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iN = N();
        if (iN < 32) {
            Object[] objArrO = o(this.e);
            objArrO[iN] = obj;
            L(objArrO);
            this.f = a() + 1;
        } else {
            y(this.d, this.e, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        js3.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iN = N();
        Iterator it = collection.iterator();
        if (32 - iN >= collection.size()) {
            Object[] objArrO = o(this.e);
            f(objArrO, iN, it);
            L(objArrO);
            this.f = collection.size() + this.f;
            return true;
        }
        int size = ((collection.size() + iN) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.e);
        f(objArrO2, iN, it);
        objArr[0] = objArrO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrQ = q();
            f(objArrQ, 0, it);
            objArr[i] = objArrQ;
        }
        H(x(this.d, F(), objArr));
        Object[] objArrQ2 = q();
        f(objArrQ2, 0, it);
        L(objArrQ2);
        this.f = collection.size() + this.f;
        return true;
    }
}
