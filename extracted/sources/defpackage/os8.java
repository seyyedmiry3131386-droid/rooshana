package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class os8 {
    public static final os8 e = new os8(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final ql3 c;
    public Object[] d;

    public os8(int i, int i2, Object[] objArr, ql3 ql3Var) {
        this.a = i;
        this.b = i2;
        this.c = ql3Var;
        this.d = objArr;
    }

    public static os8 k(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, ql3 ql3Var) {
        if (i3 > 30) {
            return new os8(0, 0, new Object[]{obj, obj2, obj3, obj4}, ql3Var);
        }
        int iN = ry7.n(i, i3);
        int iN2 = ry7.n(i2, i3);
        if (iN != iN2) {
            return new os8((1 << iN) | (1 << iN2), 0, iN < iN2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, ql3Var);
        }
        return new os8(0, 1 << iN, new Object[]{k(i, obj, obj2, i2, obj3, obj4, i3 + 5, ql3Var)}, ql3Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, ql3 ql3Var) {
        Object obj3 = this.d[i];
        os8 os8VarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, v(i), i3, obj, obj2, i4 + 5, ql3Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = os8VarK;
        ew.y0(iT, i5, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int iBitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += s(i).b();
        }
        return iBitCount;
    }

    public final int c(Object obj) {
        sq3 sq3VarY = ok4.Y(2, ok4.Z(0, this.d.length));
        int i = sq3VarY.a;
        int i2 = sq3VarY.b;
        int i3 = sq3VarY.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return -1;
        }
        while (!js3.i(obj, this.d[i])) {
            if (i == i2) {
                return -1;
            }
            i += i3;
        }
        return i;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iN = 1 << ry7.n(i, i2);
        if (i(iN)) {
            return js3.i(obj, this.d[f(iN)]);
        }
        if (!j(iN)) {
            return false;
        }
        os8 os8VarS = s(t(iN));
        return i2 == 30 ? os8VarS.c(obj) != -1 : os8VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(os8 os8Var) {
        if (this == os8Var) {
            return true;
        }
        if (this.b == os8Var.b && this.a == os8Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == os8Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(defpackage.os8 r8, defpackage.qp2 r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.os8.g(os8, qp2):boolean");
    }

    public final Object h(int i, int i2, Object obj) {
        int iN = 1 << ry7.n(i, i2);
        if (i(iN)) {
            int iF = f(iN);
            if (js3.i(obj, this.d[iF])) {
                return v(iF);
            }
            return null;
        }
        if (!j(iN)) {
            return null;
        }
        os8 os8VarS = s(t(iN));
        if (i2 != 30) {
            return os8VarS.h(i, i2 + 5, obj);
        }
        int iC = os8VarS.c(obj);
        if (iC != -1) {
            return os8VarS.v(iC);
        }
        return null;
    }

    public final boolean i(int i) {
        return (i & this.a) != 0;
    }

    public final boolean j(int i) {
        return (i & this.b) != 0;
    }

    public final os8 l(int i, n56 n56Var) {
        n56Var.g(n56Var.f - 1);
        n56Var.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != n56Var.b) {
            return new os8(0, 0, ry7.f(i, objArr), n56Var.b);
        }
        this.d = ry7.f(i, objArr);
        return this;
    }

    public final os8 m(int i, Object obj, Object obj2, int i2, n56 n56Var) {
        os8 os8VarM;
        int iN = 1 << ry7.n(i, i2);
        boolean zI = i(iN);
        ql3 ql3Var = this.c;
        if (zI) {
            int iF = f(iN);
            if (!js3.i(obj, this.d[iF])) {
                n56Var.g(n56Var.f + 1);
                ql3 ql3Var2 = n56Var.b;
                if (ql3Var != ql3Var2) {
                    return new os8(this.a ^ iN, this.b | iN, a(iF, iN, i, obj, obj2, i2, ql3Var2), ql3Var2);
                }
                this.d = a(iF, iN, i, obj, obj2, i2, ql3Var2);
                this.a ^= iN;
                this.b |= iN;
                return this;
            }
            n56Var.d = v(iF);
            if (v(iF) != obj2) {
                if (ql3Var == n56Var.b) {
                    this.d[iF + 1] = obj2;
                    return this;
                }
                n56Var.e++;
                Object[] objArr = this.d;
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                js3.o(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[iF + 1] = obj2;
                return new os8(this.a, this.b, objArrCopyOf, n56Var.b);
            }
        } else {
            if (!j(iN)) {
                n56Var.g(n56Var.f + 1);
                ql3 ql3Var3 = n56Var.b;
                int iF2 = f(iN);
                if (ql3Var != ql3Var3) {
                    return new os8(this.a | iN, this.b, ry7.e(this.d, iF2, obj, obj2), ql3Var3);
                }
                this.d = ry7.e(this.d, iF2, obj, obj2);
                this.a |= iN;
                return this;
            }
            int iT = t(iN);
            os8 os8VarS = s(iT);
            if (i2 == 30) {
                int iC = os8VarS.c(obj);
                if (iC != -1) {
                    n56Var.d = os8VarS.v(iC);
                    if (os8VarS.c == n56Var.b) {
                        os8VarS.d[iC + 1] = obj2;
                        os8VarM = os8VarS;
                    } else {
                        n56Var.e++;
                        Object[] objArr2 = os8VarS.d;
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        js3.o(objArrCopyOf2, "copyOf(...)");
                        objArrCopyOf2[iC + 1] = obj2;
                        os8VarM = new os8(0, 0, objArrCopyOf2, n56Var.b);
                    }
                } else {
                    n56Var.g(n56Var.f + 1);
                    os8VarM = new os8(0, 0, ry7.e(os8VarS.d, 0, obj, obj2), n56Var.b);
                }
            } else {
                os8VarM = os8VarS.m(i, obj, obj2, i2 + 5, n56Var);
            }
            if (os8VarS != os8VarM) {
                return u(iT, iN, n56Var.b, os8VarM);
            }
        }
        return this;
    }

    public final os8 n(os8 os8Var, int i, oj1 oj1Var, n56 n56Var) {
        Object[] objArr;
        os8 os8VarK;
        js3.p(os8Var, "otherNode");
        if (this == os8Var) {
            oj1Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            ql3 ql3Var = n56Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + os8Var.d.length);
            js3.o(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            sq3 sq3VarY = ok4.Y(2, ok4.Z(0, os8Var.d.length));
            int i3 = sq3VarY.a;
            int i4 = sq3VarY.b;
            int i5 = sq3VarY.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    if (c(os8Var.d[i3]) != -1) {
                        oj1Var.a++;
                    } else {
                        Object[] objArr3 = os8Var.d;
                        objArrCopyOf[length] = objArr3[i3];
                        objArrCopyOf[length + 1] = objArr3[i3 + 1];
                        length += 2;
                    }
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            if (length != this.d.length) {
                if (length != os8Var.d.length) {
                    if (length == objArrCopyOf.length) {
                        return new os8(0, 0, objArrCopyOf, ql3Var);
                    }
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                    js3.o(objArrCopyOf2, "copyOf(...)");
                    return new os8(0, 0, objArrCopyOf2, ql3Var);
                }
            }
            return this;
        }
        int i6 = this.b | os8Var.b;
        int i7 = this.a;
        int i8 = os8Var.a;
        int i9 = (i7 ^ i8) & (~i6);
        int i10 = i7 & i8;
        int i11 = i9;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            if (js3.i(this.d[f(iLowestOneBit)], os8Var.d[os8Var.f(iLowestOneBit)])) {
                i11 |= iLowestOneBit;
            } else {
                i6 |= iLowestOneBit;
            }
            i10 ^= iLowestOneBit;
        }
        if ((i6 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        os8 os8Var2 = (js3.i(this.c, n56Var.b) && this.a == i11 && this.b == i6) ? this : new os8(i11, i6, new Object[Integer.bitCount(i6) + (Integer.bitCount(i11) * 2)], null);
        int i12 = i6;
        int i13 = 0;
        while (i12 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i12);
            Object[] objArr4 = os8Var2.d;
            int length2 = (objArr4.length - 1) - i13;
            if (j(iLowestOneBit2)) {
                os8VarK = s(t(iLowestOneBit2));
                if (os8Var.j(iLowestOneBit2)) {
                    os8VarK = os8VarK.n(os8Var.s(os8Var.t(iLowestOneBit2)), i + 5, oj1Var, n56Var);
                    objArr = objArr4;
                } else if (os8Var.i(iLowestOneBit2)) {
                    int iF = os8Var.f(iLowestOneBit2);
                    Object obj = os8Var.d[iF];
                    Object objV = os8Var.v(iF);
                    int i14 = n56Var.f;
                    objArr = objArr4;
                    os8VarK = os8VarK.m(obj != null ? obj.hashCode() : i2, obj, objV, i + 5, n56Var);
                    if (n56Var.f == i14) {
                        oj1Var.a++;
                    }
                } else {
                    objArr = objArr4;
                }
            } else {
                objArr = objArr4;
                if (os8Var.j(iLowestOneBit2)) {
                    os8 os8VarS = os8Var.s(os8Var.t(iLowestOneBit2));
                    if (i(iLowestOneBit2)) {
                        int iF2 = f(iLowestOneBit2);
                        Object obj2 = this.d[iF2];
                        int i15 = i + 5;
                        if (os8VarS.d(obj2 != null ? obj2.hashCode() : 0, i15, obj2)) {
                            oj1Var.a++;
                            os8VarK = os8VarS;
                        } else {
                            os8VarK = os8VarS.m(obj2 != null ? obj2.hashCode() : 0, obj2, v(iF2), i15, n56Var);
                        }
                    } else {
                        os8VarK = os8VarS;
                    }
                } else {
                    int iF3 = f(iLowestOneBit2);
                    Object obj3 = this.d[iF3];
                    Object objV2 = v(iF3);
                    int iF4 = os8Var.f(iLowestOneBit2);
                    Object obj4 = os8Var.d[iF4];
                    os8VarK = k(obj3 != null ? obj3.hashCode() : 0, obj3, objV2, obj4 != null ? obj4.hashCode() : 0, obj4, os8Var.v(iF4), i + 5, n56Var.b);
                }
            }
            objArr[length2] = os8VarK;
            i13++;
            i12 ^= iLowestOneBit2;
            i2 = 0;
        }
        int i16 = 0;
        while (i11 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i11);
            int i17 = i16 * 2;
            if (os8Var.i(iLowestOneBit3)) {
                int iF5 = os8Var.f(iLowestOneBit3);
                Object[] objArr5 = os8Var2.d;
                objArr5[i17] = os8Var.d[iF5];
                objArr5[i17 + 1] = os8Var.v(iF5);
                if (i(iLowestOneBit3)) {
                    oj1Var.a++;
                }
            } else {
                int iF6 = f(iLowestOneBit3);
                Object[] objArr6 = os8Var2.d;
                objArr6[i17] = this.d[iF6];
                objArr6[i17 + 1] = v(iF6);
            }
            i16++;
            i11 ^= iLowestOneBit3;
        }
        if (!e(os8Var2)) {
            return os8Var.e(os8Var2) ? os8Var : os8Var2;
        }
        return this;
    }

    public final os8 o(int i, Object obj, int i2, n56 n56Var) {
        int iN = 1 << ry7.n(i, i2);
        if (i(iN)) {
            int iF = f(iN);
            if (js3.i(obj, this.d[iF])) {
                return q(iF, iN, n56Var);
            }
        } else if (j(iN)) {
            int iT = t(iN);
            os8 os8VarS = s(iT);
            if (i2 == 30) {
                int iC = os8VarS.c(obj);
                if (iC != -1) {
                    os8VarS = os8VarS.l(iC, n56Var);
                }
            } else {
                os8VarS = os8VarS.o(i, obj, i2 + 5, n56Var);
            }
            return r(iT, iN, n56Var.b, os8VarS);
        }
        return this;
    }

    public final os8 p(int i, Object obj, Object obj2, int i2, n56 n56Var) {
        n56 n56Var2;
        int iN = 1 << ry7.n(i, i2);
        if (i(iN)) {
            int iF = f(iN);
            if (js3.i(obj, this.d[iF]) && js3.i(obj2, v(iF))) {
                return q(iF, iN, n56Var);
            }
        } else if (j(iN)) {
            int iT = t(iN);
            os8 os8VarS = s(iT);
            if (i2 == 30) {
                int iC = os8VarS.c(obj);
                if (iC != -1 && js3.i(obj2, os8VarS.v(iC))) {
                    os8VarS = os8VarS.l(iC, n56Var);
                }
                n56Var2 = n56Var;
            } else {
                n56Var2 = n56Var;
                os8VarS = os8VarS.p(i, obj, obj2, i2 + 5, n56Var2);
            }
            return r(iT, iN, n56Var2.b, os8VarS);
        }
        return this;
    }

    public final os8 q(int i, int i2, n56 n56Var) {
        n56Var.g(n56Var.f - 1);
        n56Var.d = v(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != n56Var.b) {
            return new os8(i2 ^ this.a, this.b, ry7.f(i, objArr), n56Var.b);
        }
        this.d = ry7.f(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final os8 r(int i, int i2, ql3 ql3Var, os8 os8Var) {
        if (os8Var != null) {
            return u(i, i2, ql3Var, os8Var);
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (this.c != ql3Var) {
            Object[] objArr2 = new Object[objArr.length - 1];
            ew.C0(0, i, 6, objArr, objArr2);
            ew.y0(i, i + 1, objArr.length, objArr, objArr2);
            return new os8(this.a, i2 ^ this.b, objArr2, ql3Var);
        }
        Object[] objArr3 = new Object[objArr.length - 1];
        ew.C0(0, i, 6, objArr, objArr3);
        ew.y0(i, i + 1, objArr.length, objArr, objArr3);
        this.d = objArr3;
        this.b ^= i2;
        return this;
    }

    public final os8 s(int i) {
        Object obj = this.d[i];
        js3.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (os8) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    public final os8 u(int i, int i2, ql3 ql3Var, os8 os8Var) {
        Object[] objArr = os8Var.d;
        if (objArr.length != 2 || os8Var.b != 0) {
            if (ql3Var != null && this.c == ql3Var) {
                this.d[i] = os8Var;
                return this;
            }
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            js3.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = os8Var;
            return new os8(this.a, this.b, objArrCopyOf, ql3Var);
        }
        if (this.d.length == 1) {
            os8Var.a = this.b;
            return os8Var;
        }
        int iF = f(i2);
        Object[] objArr3 = this.d;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        js3.o(objArrCopyOf2, "copyOf(...)");
        ew.y0(i + 2, i + 1, objArr3.length, objArrCopyOf2, objArrCopyOf2);
        ew.y0(iF + 2, iF, i, objArrCopyOf2, objArrCopyOf2);
        objArrCopyOf2[iF] = obj;
        objArrCopyOf2[iF + 1] = obj2;
        return new os8(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, ql3Var);
    }

    public final Object v(int i) {
        return this.d[i + 1];
    }
}
