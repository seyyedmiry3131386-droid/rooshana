package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class v66 extends q1 implements Collection, ex3 {
    public w1 a;
    public Object[] b;
    public Object[] c;
    public int d;
    public rl3 e = new rl3();
    public Object[] f;
    public Object[] g;
    public int h;

    public v66(w1 w1Var, Object[] objArr, Object[] objArr2, int i) {
        this.a = w1Var;
        this.b = objArr;
        this.c = objArr2;
        this.d = i;
        this.f = objArr;
        this.g = objArr2;
        this.h = w1Var.a();
    }

    public static void f(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    public final int A(dp2 dp2Var, Object[] objArr, int i, int i2, c35 c35Var, ArrayList arrayList, ArrayList arrayList2) {
        if (m(objArr)) {
            arrayList.add(objArr);
        }
        Object obj = c35Var.b;
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr2 = (Object[]) obj;
        Object[] objArrQ = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj2 = objArr[i3];
            if (!((Boolean) dp2Var.invoke(obj2)).booleanValue()) {
                if (i2 == 32) {
                    objArrQ = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : q();
                    i2 = 0;
                }
                objArrQ[i2] = obj2;
                i2++;
            }
        }
        c35Var.b = objArrQ;
        if (objArr2 != objArrQ) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    public final int B(dp2 dp2Var, Object[] objArr, int i, c35 c35Var) {
        Object[] objArrO = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) dp2Var.invoke(obj)).booleanValue()) {
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
        c35Var.b = objArrO;
        return i2;
    }

    public final int C(dp2 dp2Var, int i, c35 c35Var) {
        int iB = B(dp2Var, this.g, i, c35Var);
        if (iB == i) {
            return i;
        }
        Object obj = c35Var.b;
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) obj;
        Arrays.fill(objArr, iB, i, (Object) null);
        this.g = objArr;
        this.h -= i - iB;
        return iB;
    }

    public final boolean D(dp2 dp2Var) {
        Object[] objArrW;
        int i;
        dp2 dp2Var2 = dp2Var;
        int iM = M();
        Object[] objArrS = null;
        c35 c35Var = new c35(3, objArrS);
        boolean z = false;
        if (this.f != null) {
            c1 c1VarN = n(0);
            int iB = 32;
            while (iB == 32 && c1VarN.hasNext()) {
                iB = B(dp2Var2, (Object[]) c1VarN.next(), 32, c35Var);
            }
            if (iB == 32) {
                int iC = C(dp2Var2, iM, c35Var);
                if (iC == 0) {
                    v(this.f, this.h, this.d);
                }
                if (iC != iM) {
                }
            } else {
                int i2 = (c1VarN.b - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iA = iB;
                while (c1VarN.hasNext()) {
                    iA = A(dp2Var2, (Object[]) c1VarN.next(), 32, iA, c35Var, arrayList2, arrayList);
                    dp2Var2 = dp2Var;
                }
                int iA2 = A(dp2Var, this.g, iM, iA, c35Var, arrayList2, arrayList);
                Object obj = c35Var.b;
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iA2, 32, (Object) null);
                if (arrayList.isEmpty()) {
                    objArrW = this.f;
                    js3.m(objArrW);
                } else {
                    objArrW = w(this.f, i2, this.d, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    wi6.a("invalid size");
                }
                if (size == 0) {
                    this.d = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.d;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.d = i - 5;
                        Object[] objArr2 = objArrW[0];
                        js3.n(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                        objArrW = objArr2;
                    }
                    objArrS = s(objArrW, i3, i);
                }
                this.f = objArrS;
                this.g = objArr;
                this.h = size + iA2;
            }
            z = true;
        } else if (C(dp2Var2, iM, c35Var) != iM) {
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    public final Object[] E(Object[] objArr, int i, int i2, c35 c35Var) {
        int i3 = z67.i(i2, i);
        if (i == 0) {
            Object obj = objArr[i3];
            Object[] objArrO = o(objArr);
            ew.y0(i3, i3 + 1, 32, objArr, objArrO);
            objArrO[31] = c35Var.b;
            c35Var.b = obj;
            return objArrO;
        }
        int i4 = objArr[31] == null ? z67.i(G() - 1, i) : 31;
        Object[] objArrO2 = o(objArr);
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj2 = objArrO2[i4];
                js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrO2[i4] = E((Object[]) obj2, i5, 0, c35Var);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj3 = objArrO2[i3];
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[i3] = E((Object[]) obj3, i5, i2, c35Var);
        return objArrO2;
    }

    public final Object F(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.h - i;
        if (i4 == 1) {
            Object obj = this.g[0];
            v(objArr, i, i2);
            return obj;
        }
        Object[] objArr2 = this.g;
        Object obj2 = objArr2[i3];
        Object[] objArrO = o(objArr2);
        ew.y0(i3, i3 + 1, i4, objArr2, objArrO);
        objArrO[i4 - 1] = null;
        this.f = objArr;
        this.g = objArrO;
        this.h = (i + i4) - 1;
        this.d = i2;
        return obj2;
    }

    public final int G() {
        int i = this.h;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    public final Object[] H(Object[] objArr, int i, int i2, Object obj, c35 c35Var) {
        int i3 = z67.i(i2, i);
        Object[] objArrO = o(objArr);
        if (i != 0) {
            Object obj2 = objArrO[i3];
            js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO[i3] = H((Object[]) obj2, i - 5, i2, obj, c35Var);
            return objArrO;
        }
        if (objArrO != objArr) {
            ((AbstractList) this).modCount++;
        }
        c35Var.b = objArrO[i3];
        objArrO[i3] = obj;
        return objArrO;
    }

    public final void L(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrQ;
        if (i3 < 1) {
            wi6.a("requires at least one nullBuffer");
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

    public final int M() {
        int i = this.h;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    @Override // defpackage.q1
    public final int a() {
        return this.h;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        dy3.j(i, a());
        if (i == a()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            l(i - iG, obj, this.f);
            return;
        }
        c35 c35Var = new c35(3, null);
        Object[] objArr = this.f;
        js3.m(objArr);
        l(0, c35Var.b, j(objArr, this.d, i, obj, c35Var));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        v66 v66Var;
        Object[] objArrQ;
        dy3.j(i, this.h);
        if (i == this.h) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.h - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.g;
            Object[] objArrO = o(objArr);
            ew.y0(size2 + 1, i3, M(), objArr, objArrO);
            f(objArrO, i3, collection.iterator());
            this.g = objArrO;
            this.h = collection.size() + this.h;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM = M();
        int size3 = collection.size() + this.h;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= G()) {
            objArrQ = q();
            collection2 = collection;
            L(collection2, i, this.g, iM, objArr2, size, objArrQ);
            v66Var = this;
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            v66Var = this;
            if (size3 > iM) {
                int i4 = size3 - iM;
                Object[] objArrP = p(i4, v66Var.g);
                v66Var.i(collection2, i, i4, objArr2, size, objArrP);
                objArr2 = objArr2;
                objArrQ = objArrP;
            } else {
                Object[] objArr3 = v66Var.g;
                objArrQ = q();
                int i5 = iM - size3;
                ew.y0(0, i5, iM, objArr3, objArrQ);
                int i6 = 32 - i5;
                Object[] objArrP2 = p(i6, v66Var.g);
                int i7 = size - 1;
                objArr2[i7] = objArrP2;
                v66Var.i(collection2, i, i6, objArr2, i7, objArrP2);
                collection2 = collection2;
            }
        }
        v66Var.f = x(v66Var.f, i2, objArr2);
        v66Var.g = objArrQ;
        v66Var.h = collection2.size() + v66Var.h;
        return true;
    }

    @Override // defpackage.q1
    public final Object c(int i) {
        dy3.i(i, a());
        ((AbstractList) this).modCount++;
        int iG = G();
        if (i >= iG) {
            return F(this.f, iG, this.d, i - iG);
        }
        c35 c35Var = new c35(3, this.g[0]);
        Object[] objArr = this.f;
        js3.m(objArr);
        F(E(objArr, this.d, i, c35Var), iG, this.d, 0);
        return c35Var.b;
    }

    public final w1 e() {
        w1 t66Var;
        Object[] objArr = this.f;
        if (objArr == this.b && this.g == this.c) {
            t66Var = this.a;
        } else {
            this.e = new rl3();
            this.b = objArr;
            Object[] objArr2 = this.g;
            this.c = objArr2;
            if (objArr != null) {
                t66Var = new t66(objArr, objArr2, this.h, this.d);
            } else if (objArr2.length == 0) {
                t66Var = lz7.b;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr2, this.h);
                js3.o(objArrCopyOf, "copyOf(...)");
                t66Var = new lz7(objArrCopyOf);
            }
        }
        this.a = t66Var;
        return t66Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        dy3.i(i, a());
        if (G() <= i) {
            objArr = this.g;
        } else {
            objArr = this.f;
            js3.m(objArr);
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[z67.i(i, i2)];
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    public final int h() {
        return ((AbstractList) this).modCount;
    }

    public final void i(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f == null) {
            throw new IllegalStateException("root is null");
        }
        int i4 = i >> 5;
        c1 c1VarN = n(G() >> 5);
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
        int iG = i3 - (((G() >> 5) - 1) - i4);
        if (iG < i3) {
            objArr2 = objArr[iG];
            js3.m(objArr2);
        }
        L(collection, i, objArr4, 32, objArr, iG, objArr2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object[] j(Object[] objArr, int i, int i2, Object obj, c35 c35Var) {
        Object obj2;
        int i3 = z67.i(i2, i);
        if (i == 0) {
            c35Var.b = objArr[31];
            Object[] objArrO = o(objArr);
            ew.y0(i3 + 1, i3, 31, objArr, objArrO);
            objArrO[i3] = obj;
            return objArrO;
        }
        Object[] objArrO2 = o(objArr);
        int i4 = i - 5;
        Object obj3 = objArrO2[i3];
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrO2[i3] = j((Object[]) obj3, i4, i2, obj, c35Var);
        while (true) {
            i3++;
            if (i3 >= 32 || (obj2 = objArrO2[i3]) == null) {
                break;
            }
            objArrO2[i3] = j((Object[]) obj2, i4, 0, c35Var.b, c35Var);
        }
        return objArrO2;
    }

    public final void l(int i, Object obj, Object[] objArr) {
        int iM = M();
        Object[] objArrO = o(this.g);
        if (iM >= 32) {
            Object[] objArr2 = this.g;
            Object obj2 = objArr2[31];
            ew.y0(i + 1, i, 31, objArr2, objArrO);
            objArrO[i] = obj;
            y(objArr, objArrO, r(obj2));
            return;
        }
        ew.y0(i + 1, i, iM, this.g, objArrO);
        objArrO[i] = obj;
        this.f = objArr;
        this.g = objArrO;
        this.h++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        dy3.j(i, this.h);
        return new z66(this, i);
    }

    public final boolean m(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.e;
    }

    public final c1 n(int i) {
        Object[] objArr = this.f;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iG = G() >> 5;
        dy3.j(i, iG);
        int i2 = this.d;
        return i2 == 0 ? new jh0(i, objArr) : new ns8(objArr, i, iG, i2 / 5);
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
        objArr[32] = this.e;
        return objArr;
    }

    public final Object[] r(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.e;
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return D(new u1(2, collection));
    }

    public final Object[] s(Object[] objArr, int i, int i2) {
        if (i2 < 0) {
            wi6.a("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int i3 = z67.i(i, i2);
        Object obj = objArr[i3];
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objS = s((Object[]) obj, i, i2 - 5);
        if (i3 < 31) {
            int i4 = i3 + 1;
            if (objArr[i4] != null) {
                if (m(objArr)) {
                    Arrays.fill(objArr, i4, 32, (Object) null);
                }
                Object[] objArrQ = q();
                ew.y0(0, 0, i4, objArr, objArrQ);
                objArr = objArrQ;
            }
        }
        if (objS == objArr[i3]) {
            return objArr;
        }
        Object[] objArrO = o(objArr);
        objArrO[i3] = objS;
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        dy3.i(i, a());
        if (G() > i) {
            c35 c35Var = new c35(3, null);
            Object[] objArr = this.f;
            js3.m(objArr);
            this.f = H(objArr, this.d, i, obj, c35Var);
            return c35Var.b;
        }
        Object[] objArrO = o(this.g);
        if (objArrO != this.g) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrO[i2];
        objArrO[i2] = obj;
        this.g = objArrO;
        return obj2;
    }

    public final Object[] t(Object[] objArr, int i, int i2, c35 c35Var) {
        Object[] objArrT;
        int i3 = z67.i(i2 - 1, i);
        if (i == 5) {
            c35Var.b = objArr[i3];
            objArrT = null;
        } else {
            Object obj = objArr[i3];
            js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrT = t((Object[]) obj, i - 5, i2, c35Var);
        }
        if (objArrT == null && i3 == 0) {
            return null;
        }
        Object[] objArrO = o(objArr);
        objArrO[i3] = objArrT;
        return objArrO;
    }

    public final void v(Object[] objArr, int i, int i2) {
        Object obj = null;
        if (i2 == 0) {
            this.f = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.g = objArr;
            this.h = i;
            this.d = i2;
            return;
        }
        c35 c35Var = new c35(3, obj);
        js3.m(objArr);
        Object[] objArrT = t(objArr, i2, i, c35Var);
        js3.m(objArrT);
        Object obj2 = c35Var.b;
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.g = (Object[]) obj2;
        this.h = i;
        if (objArrT[1] == null) {
            this.f = (Object[]) objArrT[0];
            this.d = i2 - 5;
        } else {
            this.f = objArrT;
            this.d = i2;
        }
    }

    public final Object[] w(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            wi6.a("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            wi6.a("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrO = o(objArr);
        int i3 = z67.i(i, i2);
        int i4 = i2 - 5;
        objArrO[i3] = w((Object[]) objArrO[i3], i, i4, it);
        while (true) {
            i3++;
            if (i3 >= 32 || !it.hasNext()) {
                break;
            }
            objArrO[i3] = w((Object[]) objArrO[i3], 0, i4, it);
        }
        return objArrO;
    }

    public final Object[] x(Object[] objArr, int i, Object[][] objArr2) {
        w0 w0VarK = c26.K(objArr2);
        int i2 = i >> 5;
        int i3 = this.d;
        Object[] objArrW = i2 < (1 << i3) ? w(objArr, i, i3, w0VarK) : o(objArr);
        while (w0VarK.hasNext()) {
            this.d += 5;
            objArrW = r(objArrW);
            int i4 = this.d;
            w(objArrW, 1 << i4, i4, w0VarK);
        }
        return objArrW;
    }

    public final void y(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.h;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 > (1 << i3)) {
            this.f = z(this.d + 5, r(objArr), objArr2);
            this.g = objArr3;
            this.d += 5;
            this.h++;
            return;
        }
        if (objArr == null) {
            this.f = objArr2;
            this.g = objArr3;
            this.h = i + 1;
        } else {
            this.f = z(i3, objArr, objArr2);
            this.g = objArr3;
            this.h++;
        }
    }

    public final Object[] z(int i, Object[] objArr, Object[] objArr2) {
        int i2 = z67.i(a() - 1, i);
        Object[] objArrO = o(objArr);
        if (i == 5) {
            objArrO[i2] = objArr2;
            return objArrO;
        }
        objArrO[i2] = z(i - 5, (Object[]) objArrO[i2], objArr2);
        return objArrO;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM = M();
        if (iM < 32) {
            Object[] objArrO = o(this.g);
            objArrO[iM] = obj;
            this.g = objArrO;
            this.h = a() + 1;
        } else {
            y(this.f, this.g, r(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM = M();
        Iterator it = collection.iterator();
        if (32 - iM >= collection.size()) {
            Object[] objArrO = o(this.g);
            f(objArrO, iM, it);
            this.g = objArrO;
            this.h = collection.size() + this.h;
            return true;
        }
        int size = ((collection.size() + iM) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrO2 = o(this.g);
        f(objArrO2, iM, it);
        objArr[0] = objArrO2;
        for (int i = 1; i < size; i++) {
            Object[] objArrQ = q();
            f(objArrQ, 0, it);
            objArr[i] = objArrQ;
        }
        this.f = x(this.f, G(), objArr);
        Object[] objArrQ2 = q();
        f(objArrQ2, 0, it);
        this.g = objArrQ2;
        this.h = collection.size() + this.h;
        return true;
    }
}
