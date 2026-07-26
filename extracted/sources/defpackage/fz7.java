package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fz7 {
    public final cz7 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public ya5 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ar3 p;
    public final ar3 q;
    public final ar3 r;
    public ya5 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public xa5 x;

    public fz7(cz7 cz7Var) {
        this.a = cz7Var;
        int[] iArr = cz7Var.a;
        this.b = iArr;
        Object[] objArr = cz7Var.c;
        this.c = objArr;
        this.d = cz7Var.i;
        this.e = cz7Var.j;
        this.f = cz7Var.k;
        int i = cz7Var.b;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = cz7Var.d;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new ar3();
        this.q = new ar3();
        this.r = new ar3();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void z(fz7 fz7Var) {
        int i = fz7Var.v;
        int iR = fz7Var.r(i);
        int[] iArr = fz7Var.b;
        int i2 = (iR * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        fz7Var.W(fz7Var.G(iArr, i));
    }

    public final void A(cz7 cz7Var, int i) {
        if (this.n <= 0) {
            sz0.a("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.b == 0) {
            int[] iArr = cz7Var.a;
            int i2 = iArr[(i * 5) + 3];
            int i3 = cz7Var.b;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                ya5 ya5Var = this.f;
                Object[] objArr2 = cz7Var.c;
                int i4 = cz7Var.d;
                HashMap map2 = cz7Var.j;
                ya5 ya5Var2 = cz7Var.k;
                this.b = iArr;
                this.c = objArr2;
                this.d = cz7Var.i;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = ya5Var2;
                cz7Var.a = iArr2;
                cz7Var.b = 0;
                cz7Var.c = objArr;
                cz7Var.d = 0;
                cz7Var.i = arrayList;
                cz7Var.j = map;
                cz7Var.k = ya5Var;
                return;
            }
        }
        fz7 fz7VarE = cz7Var.e();
        try {
            w07.g(fz7VarE, i, this, true, true, false);
            fz7VarE.e(true);
        } catch (Throwable th) {
            fz7VarE.e(false);
            throw th;
        }
    }

    public final void B(int i) {
        ge geVar;
        int i2;
        ge geVar2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iO = o() - this.h;
                if (i6 < i) {
                    for (int iB = ez7.b(this.d, i6, iO); iB < this.d.size() && (i3 = (geVar2 = (ge) this.d.get(iB)).a) < 0 && (i4 = i3 + iO) < i; iB++) {
                        geVar2.a = i4;
                    }
                } else {
                    for (int iB2 = ez7.b(this.d, i, iO); iB2 < this.d.size() && (i2 = (geVar = (ge) this.d.get(iB2)).a) >= 0; iB2++) {
                        geVar.a = -(iO - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    ew.x0(i8 + i7, i7, i9, iArr, iArr);
                } else {
                    ew.x0(i9, i9 + i8, i7 + i8, iArr, iArr);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iO2 = o();
            if (i6 >= iO2) {
                sz0.a("Check failed");
            }
            while (i6 < iO2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iP = i11 > -2 ? i11 : (p() + i11) - (-2);
                if (iP >= i) {
                    iP = -((p() - iP) - (-2));
                }
                if (iP != i11) {
                    this.b[i10] = iP;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }

    public final void C(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, p());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iR = r(iMin);
                int iR2 = r(i5);
                int i7 = this.g;
                while (iR < iR2) {
                    int i8 = (iR * 5) + 4;
                    int i9 = this.b[i8];
                    if (!(i9 >= 0)) {
                        sz0.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iR++;
                    if (iR == i7) {
                        iR += this.h;
                    }
                }
            } else {
                int iR3 = r(i5);
                int iR4 = r(iMin);
                while (iR3 < iR4) {
                    int i10 = (iR3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (!(i11 < 0)) {
                        sz0.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iR3++;
                    if (iR3 == this.g) {
                        iR3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final List D(ge geVar, fz7 fz7Var) {
        if (fz7Var.n <= 0) {
            sz0.a("Check failed");
        }
        if (this.n != 0) {
            sz0.a("Check failed");
        }
        if (!geVar.a()) {
            sz0.a("Check failed");
        }
        int iC = c(geVar) + 1;
        int i = this.t;
        if (i > iC || iC >= this.u) {
            sz0.a("Check failed");
        }
        int iG = G(this.b, iC);
        int iU = u(iC);
        int iF = y(iC) ? 1 : F(iC);
        List listG = w07.g(this, iC, fz7Var, false, false, true);
        W(iG);
        boolean z = iF > 0;
        while (iG >= i) {
            int iR = r(iG);
            int[] iArr = this.b;
            int i2 = iR * 5;
            int i3 = i2 + 3;
            iArr[i3] = iArr[i3] - iU;
            if (z) {
                int i4 = iArr[i2 + 1];
                if ((1073741824 & i4) != 0) {
                    z = false;
                } else {
                    ez7.d(iR, (i4 & 67108863) - iF, iArr);
                }
            }
            iG = G(this.b, iG);
        }
        if (z) {
            if (this.o < iF) {
                sz0.a("Check failed");
            }
            this.o -= iF;
        }
        return listG;
    }

    public final Object E(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        if ((iArr[(iR * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, iR))];
        }
        return null;
    }

    public final int F(int i) {
        return this.b[(r(i) * 5) + 1] & 67108863;
    }

    public final int G(int[] iArr, int i) {
        int i2 = iArr[(r(i) * 5) + 2];
        return i2 > -2 ? i2 : (p() + i2) - (-2);
    }

    public final Object H(Object obj) {
        if (this.n > 0) {
            x(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            sz0.a("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void I() {
        int i;
        xa5 xa5Var = this.x;
        if (xa5Var != null) {
            while (xa5Var.b != 0) {
                int iS = hs9.S(xa5Var);
                int iR = r(iS);
                int iU = iS + 1;
                int iU2 = u(iS) + iS;
                while (true) {
                    if (iU >= iU2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(r(iU) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iU += u(iU);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iR * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iG = G(iArr, iS);
                    if (iG >= 0) {
                        hs9.q(xa5Var, iG);
                    }
                }
            }
        }
    }

    public final boolean J() {
        if (!(this.n == 0)) {
            sz0.a("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(this.b, r(i));
        int iN = N();
        Q(this.v);
        xa5 xa5Var = this.x;
        if (xa5Var != null) {
            while (true) {
                int i3 = xa5Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    lb7.l("IntList is empty.");
                    throw null;
                }
                if (xa5Var.a[0] < i) {
                    break;
                }
                hs9.S(xa5Var);
            }
        }
        boolean zK = K(i, this.t - i);
        L(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iN;
        return zK;
    }

    public final boolean K(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            B(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iB = ez7.b(this.d, i3, o() - this.h);
                if (iB >= this.d.size()) {
                    iB--;
                }
                int i4 = iB + 1;
                int i5 = 0;
                while (iB >= 0) {
                    ge geVar = (ge) this.d.get(iB);
                    int iC = c(geVar);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        geVar.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iB + 1;
                        }
                        i4 = iB;
                    }
                    iB--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(r(i8) * 5) + 1] & 67108864) != 0) {
                W(i8);
            }
        }
        return z;
    }

    public final void L(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            C(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            ew.F0(i, i5, null, this.c);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object M(int i, int i2, Object obj) {
        int iP = P(this.b, r(i));
        int iG = g(this.b, r(i + 1));
        int i3 = iP + i2;
        if (i3 < iP || i3 >= iG) {
            sz0.a("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int N() {
        int iR = r(this.t);
        int iA = ez7.a(this.b, iR) + this.t;
        this.t = iA;
        this.i = g(this.b, r(iA));
        int i = this.b[(iR * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final void O() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, r(i));
    }

    public final int P(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int iC = ez7.c(iArr, i);
        return iC < 0 ? (this.c.length - this.l) + iC + 1 : iC;
    }

    public final qv2 Q(int i) {
        ge geVarT;
        HashMap map = this.e;
        if (map == null || (geVarT = T(i)) == null) {
            return null;
        }
        return (qv2) map.get(geVarT);
    }

    public final void R() {
        if (this.n != 0) {
            sz0.a("Key must be supplied when inserting");
        }
        av avVar = jz0.a;
        S(0, avVar, avVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void S(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        av avVar = jz0.a;
        if (objArr == true) {
            int i4 = this.t;
            int iG = g(this.b, r(i4));
            w(1);
            this.i = iG;
            this.j = iG;
            int iR = r(i4);
            int i5 = obj != avVar ? 1 : 0;
            int i6 = (z || obj2 == avVar) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iR * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                x(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                Q(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((o() - this.h) - this.u);
            int i12 = this.t;
            int iR2 = r(i12);
            if (!js3.i(obj2, avVar)) {
                if (z) {
                    X(this.t, obj2);
                } else {
                    V(obj2);
                }
            }
            this.i = P(this.b, iR2);
            this.j = g(this.b, r(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = iR2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final ge T(int i) {
        ArrayList arrayList;
        int iE;
        if (i < 0 || i >= p() || (iE = ez7.e((arrayList = this.d), i, p())) < 0) {
            return null;
        }
        return (ge) arrayList.get(iE);
    }

    public final void U(Object obj) {
        if (this.n <= 0 || this.i == this.k) {
            H(obj);
            return;
        }
        ya5 ya5Var = this.s;
        if (ya5Var == null) {
            ya5Var = new ya5();
        }
        this.s = ya5Var;
        int i = this.v;
        Object objB = ya5Var.b(i);
        if (objB == null) {
            objB = new mb5();
            ya5Var.h(i, objB);
        }
        ((mb5) objB).g(obj);
    }

    public final void V(Object obj) {
        int iR = r(this.t);
        int i = (iR * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            sz0.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, iR))] = obj;
    }

    public final void W(int i) {
        if (i >= 0) {
            xa5 xa5Var = this.x;
            if (xa5Var == null) {
                xa5Var = new xa5();
                this.x = xa5Var;
            }
            hs9.q(xa5Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.r(r5)
            int[] r1 = r4.b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            defpackage.sz0.a(r5)
        L2e:
            java.lang.Object[] r5 = r4.c
            int[] r1 = r4.b
            int r0 = r4.g(r1, r0)
            int r0 = r4.h(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.X(int, java.lang.Object):void");
    }

    public final void a(int i) {
        boolean z = false;
        if (!(i >= 0)) {
            sz0.a("Cannot seek backwards");
        }
        if (!(this.n <= 0)) {
            wi6.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 >= this.v && i2 <= this.u) {
            z = true;
        }
        if (!z) {
            sz0.a("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(this.b, r(i2));
        this.i = iG;
        this.j = iG;
    }

    public final ge b(int i) {
        ArrayList arrayList = this.d;
        int iE = ez7.e(arrayList, i, p());
        if (iE >= 0) {
            return (ge) arrayList.get(iE);
        }
        if (i > this.g) {
            i = -(p() - i);
        }
        ge geVar = new ge(i);
        arrayList.add(-(iE + 1), geVar);
        return geVar;
    }

    public final int c(ge geVar) {
        int i = geVar.a;
        return i < 0 ? p() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((o() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            B(p());
            C(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            I();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        ya5 ya5Var = this.f;
        cz7 cz7Var = this.a;
        if (!cz7Var.g) {
            wi6.a("Unexpected writer close()");
        }
        cz7Var.g = false;
        cz7Var.a = iArr;
        cz7Var.b = i2;
        cz7Var.c = objArr;
        cz7Var.d = i3;
        cz7Var.i = arrayList;
        cz7Var.j = map;
        cz7Var.k = ya5Var;
    }

    public final int f(int i) {
        return g(this.b, r(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= o()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        mb5 mb5Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iR = r(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iR * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        ar3 ar3Var = this.r;
        if (z) {
            ya5 ya5Var = this.s;
            if (ya5Var != null && (mb5Var = (mb5) ya5Var.b(i3)) != null) {
                Object[] objArr = mb5Var.a;
                int i8 = mb5Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    H(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            ez7.d(iR, i4, iArr);
            int iB = ar3Var.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iG = G(this.b, i3);
            this.v = iG;
            int iP = iG < 0 ? p() : r(iG + 1);
            int iG2 = iP >= 0 ? g(this.b, iP) : 0;
            this.i = iG2;
            this.j = iG2;
            return;
        }
        if (i != i2) {
            sz0.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        ez7.d(iR, i4, iArr2);
        int iB2 = this.p.b();
        this.u = (o() - this.h) - this.q.b();
        this.v = iB2;
        int iG3 = G(this.b, i3);
        int iB3 = ar3Var.b();
        this.o = iB3;
        if (iG3 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iG3 != 0 && iG3 != iB2 && (i14 != 0 || i13 != 0)) {
                int iR2 = r(iG3);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iR2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    ez7.d(iR2, (iArr4[(iR2 * 5) + 1] & 67108863) + i14, iArr4);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iR2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iG3 = G(iArr5, iG3);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            wi6.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                sz0.a("startGroup/endGroup mismatch while inserting");
            }
            this.u = (o() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            sz0.a("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                sz0.a("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            R();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((p() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(r(i3) * 5) + 2] = i;
            int i4 = this.b[(r(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x011a, code lost:
    
        defpackage.lb7.k("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(int r21, defpackage.qp2 r22) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fz7.n(int, qp2):void");
    }

    public final int o() {
        return this.b.length / 5;
    }

    public final int p() {
        return o() - this.h;
    }

    public final Object q(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = (iR * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return jz0.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, iR)];
    }

    public final int r(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final int s(int i) {
        return this.b[r(i) * 5];
    }

    public final Object t(int i) {
        int iR = r(i);
        int[] iArr = this.b;
        int i2 = iR * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + p() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final int u(int i) {
        return ez7.a(this.b, r(i));
    }

    public final boolean v(int i, int i2) {
        int iO;
        int iU;
        if (i2 == this.v) {
            iO = this.u;
        } else {
            ar3 ar3Var = this.p;
            if (i2 > ar3Var.a(0)) {
                iU = u(i2);
            } else {
                int[] iArr = ar3Var.a;
                int iMin = Math.min(iArr.length, ar3Var.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iU = u(i2);
                } else {
                    iO = (o() - this.h) - this.q.a[i3];
                }
            }
            iO = iU + i2;
        }
        return i > i2 && i < iO;
    }

    public final void w(int i) {
        if (i > 0) {
            int i2 = this.t;
            B(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                ew.x0(0, 0, i3 * 5, iArr, iArr2);
                ew.x0((i3 + i6) * 5, (i4 + i3) * 5, length * 5, iArr, iArr2);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void x(int i, int i2) {
        if (i > 0) {
            C(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean y(int i) {
        return (this.b[(r(i) * 5) + 1] & 1073741824) != 0;
    }
}
