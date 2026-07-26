package defpackage;

import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class t66 extends w1 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public t66(Object[] objArr, Object[] objArr2, int i, int i2) {
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (!(a() > 32)) {
            wi6.a("Trie-based persistent vector should have at least 33 elements, got " + a());
        }
        int length = objArr2.length;
    }

    public static Object[] m(Object[] objArr, int i, int i2, Object obj, c35 c35Var) {
        Object[] objArrCopyOf;
        int i3 = z67.i(i2, i);
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                js3.o(objArrCopyOf, "copyOf(...)");
            }
            ew.y0(i3 + 1, i3, 31, objArr, objArrCopyOf);
            c35Var.b = objArr[31];
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        js3.o(objArrCopyOf2, "copyOf(...)");
        int i4 = i - 5;
        Object obj2 = objArr[i3];
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = m((Object[]) obj2, i4, i2, obj, c35Var);
        while (true) {
            i3++;
            if (i3 >= 32 || objArrCopyOf2[i3] == null) {
                break;
            }
            Object obj3 = objArr[i3];
            js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf2[i3] = m((Object[]) obj3, i4, 0, c35Var.b, c35Var);
        }
        return objArrCopyOf2;
    }

    public static Object[] o(Object[] objArr, int i, int i2, c35 c35Var) {
        Object[] objArrO;
        int i3 = z67.i(i2, i);
        if (i == 5) {
            c35Var.b = objArr[i3];
            objArrO = null;
        } else {
            Object obj = objArr[i3];
            js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrO = o((Object[]) obj, i - 5, i2, c35Var);
        }
        if (objArrO == null && i3 == 0) {
            return null;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i3] = objArrO;
        return objArrCopyOf;
    }

    public static Object[] v(int i, int i2, Object obj, Object[] objArr) {
        int i3 = z67.i(i2, i);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 32);
        js3.o(objArrCopyOf, "copyOf(...)");
        if (i == 0) {
            objArrCopyOf[i3] = obj;
            return objArrCopyOf;
        }
        Object obj2 = objArrCopyOf[i3];
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf[i3] = v(i - 5, i2, obj, (Object[]) obj2);
        return objArrCopyOf;
    }

    @Override // defpackage.o
    public final int a() {
        return this.c;
    }

    @Override // defpackage.w1
    public final w1 c(int i, Object obj) {
        int i2 = this.c;
        dy3.j(i, i2);
        if (i == i2) {
            return e(obj);
        }
        int iT = t();
        Object[] objArr = this.a;
        if (i >= iT) {
            return n(i - iT, obj, objArr);
        }
        c35 c35Var = new c35(3, null);
        return n(0, c35Var.b, m(objArr, this.d, i, obj, c35Var));
    }

    @Override // defpackage.w1
    public final w1 e(Object obj) {
        int iT = t();
        int i = this.c;
        int i2 = i - iT;
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        if (i2 >= 32) {
            Object[] objArr3 = new Object[32];
            objArr3[0] = obj;
            return p(objArr, objArr2, objArr3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i2] = obj;
        return new t66(objArr, objArrCopyOf, i + 1, this.d);
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        dy3.i(i, a());
        if (t() <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i2 = this.d; i2 > 0; i2 -= 5) {
                Object obj = objArr[z67.i(i, i2)];
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.w1
    public final v66 h() {
        return new v66(this, this.a, this.b, this.d);
    }

    @Override // defpackage.w1
    public final w1 i(u1 u1Var) {
        v66 v66Var = new v66(this, this.a, this.b, this.d);
        v66Var.D(u1Var);
        return v66Var.e();
    }

    @Override // defpackage.w1
    public final w1 j(int i) {
        dy3.i(i, this.c);
        int iT = t();
        Object[] objArr = this.a;
        int i2 = this.d;
        if (i >= iT) {
            return s(objArr, iT, i2, i - iT);
        }
        return s(r(objArr, i2, i, new c35(3, this.b[0])), iT, i2, 0);
    }

    @Override // defpackage.w1
    public final w1 l(int i, Object obj) {
        int i2 = this.c;
        dy3.i(i, i2);
        int iT = t();
        Object[] objArr = this.a;
        Object[] objArr2 = this.b;
        int i3 = this.d;
        if (iT > i) {
            return new t66(v(i3, i, obj, objArr), objArr2, i2, i3);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i & 31] = obj;
        return new t66(objArr, objArrCopyOf, i2, i3);
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        dy3.j(i, this.c);
        return new x66(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }

    public final t66 n(int i, Object obj, Object[] objArr) {
        int iT = t();
        int i2 = this.c;
        int i3 = i2 - iT;
        Object[] objArr2 = this.b;
        Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
        js3.o(objArrCopyOf, "copyOf(...)");
        if (i3 < 32) {
            ew.y0(i + 1, i, i3, objArr2, objArrCopyOf);
            objArrCopyOf[i] = obj;
            return new t66(objArr, objArrCopyOf, i2 + 1, this.d);
        }
        Object obj2 = objArr2[31];
        ew.y0(i + 1, i, i3 - 1, objArr2, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = obj2;
        return p(objArr, objArrCopyOf, objArr3);
    }

    public final t66 p(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.c;
        int i2 = i >> 5;
        int i3 = this.d;
        if (i2 <= (1 << i3)) {
            return new t66(q(i3, objArr, objArr2), objArr3, i + 1, i3);
        }
        Object[] objArr4 = new Object[32];
        objArr4[0] = objArr;
        int i4 = i3 + 5;
        return new t66(q(i4, objArr4, objArr2), objArr3, i + 1, i4);
    }

    public final Object[] q(int i, Object[] objArr, Object[] objArr2) {
        Object[] objArrCopyOf;
        int i2 = z67.i(a() - 1, i);
        if (objArr != null) {
            objArrCopyOf = Arrays.copyOf(objArr, 32);
            js3.o(objArrCopyOf, "copyOf(...)");
        } else {
            objArrCopyOf = new Object[32];
        }
        if (i == 5) {
            objArrCopyOf[i2] = objArr2;
            return objArrCopyOf;
        }
        objArrCopyOf[i2] = q(i - 5, (Object[]) objArrCopyOf[i2], objArr2);
        return objArrCopyOf;
    }

    public final Object[] r(Object[] objArr, int i, int i2, c35 c35Var) {
        Object[] objArrCopyOf;
        int i3 = z67.i(i2, i);
        if (i == 0) {
            if (i3 == 0) {
                objArrCopyOf = new Object[32];
            } else {
                objArrCopyOf = Arrays.copyOf(objArr, 32);
                js3.o(objArrCopyOf, "copyOf(...)");
            }
            ew.y0(i3, i3 + 1, 32, objArr, objArrCopyOf);
            objArrCopyOf[31] = c35Var.b;
            c35Var.b = objArr[i3];
            return objArrCopyOf;
        }
        int i4 = objArr[31] == null ? z67.i(t() - 1, i) : 31;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, 32);
        js3.o(objArrCopyOf2, "copyOf(...)");
        int i5 = i - 5;
        int i6 = i3 + 1;
        if (i6 <= i4) {
            while (true) {
                Object obj = objArrCopyOf2[i4];
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrCopyOf2[i4] = r((Object[]) obj, i5, 0, c35Var);
                if (i4 == i6) {
                    break;
                }
                i4--;
            }
        }
        Object obj2 = objArrCopyOf2[i3];
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrCopyOf2[i3] = r((Object[]) obj2, i5, i2, c35Var);
        return objArrCopyOf2;
    }

    public final w1 s(Object[] objArr, int i, int i2, int i3) {
        int i4 = this.c - i;
        Object obj = null;
        if (i4 != 1) {
            Object[] objArr2 = this.b;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, 32);
            js3.o(objArrCopyOf, "copyOf(...)");
            int i5 = i4 - 1;
            if (i3 < i5) {
                ew.y0(i3, i3 + 1, i4, objArr2, objArrCopyOf);
            }
            objArrCopyOf[i5] = null;
            return new t66(objArr, objArrCopyOf, (i + i4) - 1, i2);
        }
        if (i2 == 0) {
            if (objArr.length == 33) {
                objArr = Arrays.copyOf(objArr, 32);
                js3.o(objArr, "copyOf(...)");
            }
            return new lz7(objArr);
        }
        c35 c35Var = new c35(3, obj);
        Object[] objArrO = o(objArr, i2, i - 1, c35Var);
        js3.m(objArrO);
        Object obj2 = c35Var.b;
        js3.n(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr3 = (Object[]) obj2;
        if (objArrO[1] != null) {
            return new t66(objArrO, objArr3, i, i2);
        }
        Object obj3 = objArrO[0];
        js3.n(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return new t66((Object[]) obj3, objArr3, i, i2 - 5);
    }

    public final int t() {
        return (this.c - 1) & (-32);
    }
}
