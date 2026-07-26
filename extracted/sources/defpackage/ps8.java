package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ps8 {
    public static final ps8 e = new ps8(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final rl3 c;
    public Object[] d;

    public ps8(int i, int i2, Object[] objArr, rl3 rl3Var) {
        this.a = i;
        this.b = i2;
        this.c = rl3Var;
        this.d = objArr;
    }

    public static ps8 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, rl3 rl3Var) {
        if (i3 > 30) {
            return new ps8(0, 0, new Object[]{obj, obj2, obj3, obj4}, rl3Var);
        }
        int iJ = sy7.j(i, i3);
        int iJ2 = sy7.j(i2, i3);
        if (iJ != iJ2) {
            return new ps8((1 << iJ) | (1 << iJ2), 0, iJ < iJ2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, rl3Var);
        }
        return new ps8(0, 1 << iJ, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, rl3Var)}, rl3Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, rl3 rl3Var) {
        Object obj3 = this.d[i];
        ps8 ps8VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, x(i), i3, obj, obj2, i4 + 5, rl3Var);
        int iT = t(i2);
        int i5 = iT + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        ew.C0(0, i, 6, objArr, objArr2);
        ew.y0(i, i + 2, i5, objArr, objArr2);
        objArr2[iT - 1] = ps8VarJ;
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

    public final boolean c(Object obj) {
        sq3 sq3VarY = ok4.Y(2, ok4.Z(0, this.d.length));
        int i = sq3VarY.a;
        int i2 = sq3VarY.b;
        int i3 = sq3VarY.c;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!js3.i(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int iJ = 1 << sy7.j(i, i2);
        if (h(iJ)) {
            return js3.i(obj, this.d[f(iJ)]);
        }
        if (!i(iJ)) {
            return false;
        }
        ps8 ps8VarS = s(t(iJ));
        return i2 == 30 ? ps8VarS.c(obj) : ps8VarS.d(i, i2 + 5, obj);
    }

    public final boolean e(ps8 ps8Var) {
        if (this == ps8Var) {
            return true;
        }
        if (this.b == ps8Var.b && this.a == ps8Var.a) {
            int length = this.d.length;
            for (int i = 0; i < length; i++) {
                if (this.d[i] == ps8Var.d[i]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f(int i) {
        return Integer.bitCount((i - 1) & this.a) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int iJ = 1 << sy7.j(i, i2);
        if (h(iJ)) {
            int iF = f(iJ);
            if (js3.i(obj, this.d[iF])) {
                return x(iF);
            }
            return null;
        }
        if (!i(iJ)) {
            return null;
        }
        ps8 ps8VarS = s(t(iJ));
        if (i2 != 30) {
            return ps8VarS.g(i, i2 + 5, obj);
        }
        sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8VarS.d.length));
        int i3 = sq3VarY.a;
        int i4 = sq3VarY.b;
        int i5 = sq3VarY.c;
        if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
            return null;
        }
        while (!js3.i(obj, ps8VarS.d[i3])) {
            if (i3 == i4) {
                return null;
            }
            i3 += i5;
        }
        return ps8VarS.x(i3);
    }

    public final boolean h(int i) {
        return (i & this.a) != 0;
    }

    public final boolean i(int i) {
        return (i & this.b) != 0;
    }

    public final ps8 k(int i, o56 o56Var) {
        o56Var.f(o56Var.f - 1);
        o56Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != o56Var.b) {
            return new ps8(0, 0, sy7.g(i, objArr), o56Var.b);
        }
        this.d = sy7.g(i, objArr);
        return this;
    }

    public final ps8 l(int i, Object obj, Object obj2, int i2, o56 o56Var) {
        o56 o56Var2;
        ps8 ps8VarL;
        int iJ = 1 << sy7.j(i, i2);
        boolean zH = h(iJ);
        rl3 rl3Var = this.c;
        if (zH) {
            int iF = f(iJ);
            if (!js3.i(obj, this.d[iF])) {
                o56Var.f(o56Var.f + 1);
                rl3 rl3Var2 = o56Var.b;
                if (rl3Var != rl3Var2) {
                    return new ps8(this.a ^ iJ, this.b | iJ, a(iF, iJ, i, obj, obj2, i2, rl3Var2), rl3Var2);
                }
                this.d = a(iF, iJ, i, obj, obj2, i2, rl3Var2);
                this.a ^= iJ;
                this.b |= iJ;
                return this;
            }
            o56Var.d = x(iF);
            if (x(iF) == obj2) {
                return this;
            }
            if (rl3Var == o56Var.b) {
                this.d[iF + 1] = obj2;
                return this;
            }
            o56Var.e++;
            Object[] objArr = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            js3.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[iF + 1] = obj2;
            return new ps8(this.a, this.b, objArrCopyOf, o56Var.b);
        }
        if (!i(iJ)) {
            o56Var.f(o56Var.f + 1);
            rl3 rl3Var3 = o56Var.b;
            int iF2 = f(iJ);
            if (rl3Var != rl3Var3) {
                return new ps8(this.a | iJ, this.b, sy7.f(this.d, iF2, obj, obj2), rl3Var3);
            }
            this.d = sy7.f(this.d, iF2, obj, obj2);
            this.a |= iJ;
            return this;
        }
        int iT = t(iJ);
        ps8 ps8VarS = s(iT);
        if (i2 == 30) {
            sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8VarS.d.length));
            int i3 = sq3VarY.a;
            int i4 = sq3VarY.b;
            int i5 = sq3VarY.c;
            if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                o56Var.f(o56Var.f + 1);
                ps8VarL = new ps8(0, 0, sy7.f(ps8VarS.d, 0, obj, obj2), o56Var.b);
                o56Var2 = o56Var;
            } else {
                while (!js3.i(obj, ps8VarS.d[i3])) {
                    if (i3 == i4) {
                        o56Var.f(o56Var.f + 1);
                        ps8VarL = new ps8(0, 0, sy7.f(ps8VarS.d, 0, obj, obj2), o56Var.b);
                        break;
                    }
                    i3 += i5;
                }
                o56Var.d = ps8VarS.x(i3);
                if (ps8VarS.c == o56Var.b) {
                    ps8VarS.d[i3 + 1] = obj2;
                    ps8VarL = ps8VarS;
                } else {
                    o56Var.e++;
                    Object[] objArr2 = ps8VarS.d;
                    Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                    js3.o(objArrCopyOf2, "copyOf(...)");
                    objArrCopyOf2[i3 + 1] = obj2;
                    ps8VarL = new ps8(0, 0, objArrCopyOf2, o56Var.b);
                }
                o56Var2 = o56Var;
            }
        } else {
            o56Var2 = o56Var;
            ps8VarL = ps8VarS.l(i, obj, obj2, i2 + 5, o56Var2);
        }
        return ps8VarS == ps8VarL ? this : r(iT, ps8VarL, o56Var2.b);
    }

    public final ps8 m(ps8 ps8Var, int i, pj1 pj1Var, o56 o56Var) {
        Object[] objArr;
        ps8 ps8VarJ;
        if (this == ps8Var) {
            pj1Var.a += b();
            return this;
        }
        int i2 = 0;
        if (i > 30) {
            rl3 rl3Var = o56Var.b;
            int i3 = ps8Var.b;
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length + ps8Var.d.length);
            js3.o(objArrCopyOf, "copyOf(...)");
            int length = this.d.length;
            sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8Var.d.length));
            int i4 = sq3VarY.a;
            int i5 = sq3VarY.b;
            int i6 = sq3VarY.c;
            if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                while (true) {
                    if (c(ps8Var.d[i4])) {
                        pj1Var.a++;
                    } else {
                        Object[] objArr3 = ps8Var.d;
                        objArrCopyOf[length] = objArr3[i4];
                        objArrCopyOf[length + 1] = objArr3[i4 + 1];
                        length += 2;
                    }
                    if (i4 == i5) {
                        break;
                    }
                    i4 += i6;
                }
            }
            if (length != this.d.length) {
                if (length == ps8Var.d.length) {
                    return ps8Var;
                }
                if (length == objArrCopyOf.length) {
                    return new ps8(0, 0, objArrCopyOf, rl3Var);
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
                js3.o(objArrCopyOf2, "copyOf(...)");
                return new ps8(0, 0, objArrCopyOf2, rl3Var);
            }
        } else {
            int i7 = this.b | ps8Var.b;
            int i8 = this.a;
            int i9 = ps8Var.a;
            int i10 = (i8 ^ i9) & (~i7);
            int i11 = i8 & i9;
            int i12 = i10;
            while (i11 != 0) {
                int iLowestOneBit = Integer.lowestOneBit(i11);
                if (js3.i(this.d[f(iLowestOneBit)], ps8Var.d[ps8Var.f(iLowestOneBit)])) {
                    i12 |= iLowestOneBit;
                } else {
                    i7 |= iLowestOneBit;
                }
                i11 ^= iLowestOneBit;
            }
            if ((i7 & i12) != 0) {
                wi6.b("Check failed.");
            }
            ps8 ps8Var2 = (js3.i(this.c, o56Var.b) && this.a == i12 && this.b == i7) ? this : new ps8(i12, i7, new Object[Integer.bitCount(i7) + (Integer.bitCount(i12) * 2)], null);
            int i13 = i7;
            int i14 = 0;
            while (i13 != 0) {
                int iLowestOneBit2 = Integer.lowestOneBit(i13);
                Object[] objArr4 = ps8Var2.d;
                int length2 = (objArr4.length - 1) - i14;
                if (i(iLowestOneBit2)) {
                    ps8VarJ = s(t(iLowestOneBit2));
                    if (ps8Var.i(iLowestOneBit2)) {
                        ps8VarJ = ps8VarJ.m(ps8Var.s(ps8Var.t(iLowestOneBit2)), i + 5, pj1Var, o56Var);
                        objArr = objArr4;
                    } else if (ps8Var.h(iLowestOneBit2)) {
                        int iF = ps8Var.f(iLowestOneBit2);
                        Object obj = ps8Var.d[iF];
                        Object objX = ps8Var.x(iF);
                        int i15 = o56Var.f;
                        objArr = objArr4;
                        ps8VarJ = ps8VarJ.l(obj != null ? obj.hashCode() : i2, obj, objX, i + 5, o56Var);
                        if (o56Var.f == i15) {
                            pj1Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (ps8Var.i(iLowestOneBit2)) {
                        ps8 ps8VarS = ps8Var.s(ps8Var.t(iLowestOneBit2));
                        if (h(iLowestOneBit2)) {
                            int iF2 = f(iLowestOneBit2);
                            Object obj2 = this.d[iF2];
                            int i16 = i + 5;
                            if (ps8VarS.d(obj2 != null ? obj2.hashCode() : 0, i16, obj2)) {
                                pj1Var.a++;
                                ps8VarJ = ps8VarS;
                            } else {
                                ps8VarJ = ps8VarS.l(obj2 != null ? obj2.hashCode() : 0, obj2, x(iF2), i16, o56Var);
                            }
                        } else {
                            ps8VarJ = ps8VarS;
                        }
                    } else {
                        int iF3 = f(iLowestOneBit2);
                        Object obj3 = this.d[iF3];
                        Object objX2 = x(iF3);
                        int iF4 = ps8Var.f(iLowestOneBit2);
                        Object obj4 = ps8Var.d[iF4];
                        ps8VarJ = j(obj3 != null ? obj3.hashCode() : 0, obj3, objX2, obj4 != null ? obj4.hashCode() : 0, obj4, ps8Var.x(iF4), i + 5, o56Var.b);
                    }
                }
                objArr[length2] = ps8VarJ;
                i14++;
                i13 ^= iLowestOneBit2;
                i2 = 0;
            }
            int i17 = 0;
            while (i12 != 0) {
                int iLowestOneBit3 = Integer.lowestOneBit(i12);
                int i18 = i17 * 2;
                if (ps8Var.h(iLowestOneBit3)) {
                    int iF5 = ps8Var.f(iLowestOneBit3);
                    Object[] objArr5 = ps8Var2.d;
                    objArr5[i18] = ps8Var.d[iF5];
                    objArr5[i18 + 1] = ps8Var.x(iF5);
                    if (h(iLowestOneBit3)) {
                        pj1Var.a++;
                    }
                } else {
                    int iF6 = f(iLowestOneBit3);
                    Object[] objArr6 = ps8Var2.d;
                    objArr6[i18] = this.d[iF6];
                    objArr6[i18 + 1] = x(iF6);
                }
                i17++;
                i12 ^= iLowestOneBit3;
            }
            if (!e(ps8Var2)) {
                return ps8Var.e(ps8Var2) ? ps8Var : ps8Var2;
            }
        }
        return this;
    }

    public final ps8 n(int i, Object obj, int i2, o56 o56Var) {
        ps8 ps8VarN;
        int iJ = 1 << sy7.j(i, i2);
        if (h(iJ)) {
            int iF = f(iJ);
            if (js3.i(obj, this.d[iF])) {
                return p(iF, iJ, o56Var);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            ps8 ps8VarS = s(iT);
            if (i2 == 30) {
                sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8VarS.d.length));
                int i3 = sq3VarY.a;
                int i4 = sq3VarY.b;
                int i5 = sq3VarY.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    ps8VarN = ps8VarS;
                    break;
                }
                while (!js3.i(obj, ps8VarS.d[i3])) {
                    if (i3 == i4) {
                        ps8VarN = ps8VarS;
                        break;
                    }
                    i3 += i5;
                }
                ps8VarN = ps8VarS.k(i3, o56Var);
            } else {
                ps8VarN = ps8VarS.n(i, obj, i2 + 5, o56Var);
            }
            return q(ps8VarS, ps8VarN, iT, iJ, o56Var.b);
        }
        return this;
    }

    public final ps8 o(int i, Object obj, Object obj2, int i2, o56 o56Var) {
        ps8 ps8Var;
        ps8 ps8VarO;
        int iJ = 1 << sy7.j(i, i2);
        if (h(iJ)) {
            int iF = f(iJ);
            if (js3.i(obj, this.d[iF]) && js3.i(obj2, x(iF))) {
                return p(iF, iJ, o56Var);
            }
        } else if (i(iJ)) {
            int iT = t(iJ);
            ps8 ps8VarS = s(iT);
            if (i2 == 30) {
                sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8VarS.d.length));
                int i3 = sq3VarY.a;
                int i4 = sq3VarY.b;
                int i5 = sq3VarY.c;
                if ((i5 <= 0 || i3 > i4) && (i5 >= 0 || i4 > i3)) {
                    ps8VarO = ps8VarS;
                    ps8Var = ps8VarS;
                } else {
                    while (true) {
                        if (!js3.i(obj, ps8VarS.d[i3]) || !js3.i(obj2, ps8VarS.x(i3))) {
                            if (i3 == i4) {
                                break;
                            }
                            i3 += i5;
                        } else {
                            ps8VarO = ps8VarS.k(i3, o56Var);
                            break;
                        }
                    }
                    ps8VarO = ps8VarS;
                    ps8Var = ps8VarS;
                }
            } else {
                ps8Var = ps8VarS;
                ps8VarO = ps8Var.o(i, obj, obj2, i2 + 5, o56Var);
            }
            return q(ps8Var, ps8VarO, iT, iJ, o56Var.b);
        }
        return this;
    }

    public final ps8 p(int i, int i2, o56 o56Var) {
        o56Var.f(o56Var.f - 1);
        o56Var.d = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c != o56Var.b) {
            return new ps8(i2 ^ this.a, this.b, sy7.g(i, objArr), o56Var.b);
        }
        this.d = sy7.g(i, objArr);
        this.a ^= i2;
        return this;
    }

    public final ps8 q(ps8 ps8Var, ps8 ps8Var2, int i, int i2, rl3 rl3Var) {
        rl3 rl3Var2 = this.c;
        if (ps8Var2 != null) {
            return (rl3Var2 == rl3Var || ps8Var != ps8Var2) ? r(i, ps8Var2, rl3Var) : this;
        }
        Object[] objArr = this.d;
        if (objArr.length == 1) {
            return null;
        }
        if (rl3Var2 != rl3Var) {
            return new ps8(this.a, i2 ^ this.b, sy7.h(i, objArr), rl3Var);
        }
        this.d = sy7.h(i, objArr);
        this.b ^= i2;
        return this;
    }

    public final ps8 r(int i, ps8 ps8Var, rl3 rl3Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && ps8Var.d.length == 2 && ps8Var.b == 0) {
            ps8Var.a = this.b;
            return ps8Var;
        }
        if (this.c == rl3Var) {
            objArr[i] = ps8Var;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = ps8Var;
        return new ps8(this.a, this.b, objArrCopyOf, rl3Var);
    }

    public final ps8 s(int i) {
        Object obj = this.d[i];
        js3.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (ps8) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount((i - 1) & this.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d9, code lost:
    
        if (r14 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e2, code lost:
    
        if (r14 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e5, code lost:
    
        r14.c = w(r12, r4, (defpackage.ps8) r14.c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ef, code lost:
    
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dc0 u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ps8.u(java.lang.Object, int, java.lang.Object, int):dc0");
    }

    public final ps8 v(int i, int i2, Object obj) {
        ps8 ps8VarV;
        int iJ = 1 << sy7.j(i, i2);
        if (h(iJ)) {
            int iF = f(iJ);
            if (js3.i(obj, this.d[iF])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new ps8(this.a ^ iJ, this.b, sy7.g(iF, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(iJ)) {
            int iT = t(iJ);
            ps8 ps8VarS = s(iT);
            if (i2 == 30) {
                sq3 sq3VarY = ok4.Y(2, ok4.Z(0, ps8VarS.d.length));
                int i3 = sq3VarY.a;
                int i4 = sq3VarY.b;
                int i5 = sq3VarY.c;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!js3.i(obj, ps8VarS.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = ps8VarS.d;
                    ps8VarV = objArr2.length == 2 ? null : new ps8(0, 0, sy7.g(i3, objArr2), null);
                }
                ps8VarV = ps8VarS;
                break;
            }
            ps8VarV = ps8VarS.v(i, i2 + 5, obj);
            if (ps8VarV == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new ps8(this.a, iJ ^ this.b, sy7.h(iT, objArr3), null);
                }
                return null;
            }
            if (ps8VarS != ps8VarV) {
                return w(iT, iJ, ps8VarV);
            }
        }
        return this;
    }

    public final ps8 w(int i, int i2, ps8 ps8Var) {
        Object[] objArr = ps8Var.d;
        if (objArr.length != 2 || ps8Var.b != 0) {
            Object[] objArr2 = this.d;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            js3.o(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[i] = ps8Var;
            return new ps8(this.a, this.b, objArrCopyOf, null);
        }
        if (this.d.length == 1) {
            ps8Var.a = this.b;
            return ps8Var;
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
        return new ps8(this.a ^ i2, i2 ^ this.b, objArrCopyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
