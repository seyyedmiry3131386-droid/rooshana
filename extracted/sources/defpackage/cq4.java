package defpackage;

import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class cq4 {
    public final hd1 c;
    public final wd8 d;
    public final v4 e;
    public long f;
    public int g;
    public boolean h;
    public aq4 i;
    public aq4 j;
    public aq4 k;
    public aq4 l;
    public aq4 m;
    public int n;
    public Object o;
    public long p;
    public final yl8 a = new yl8();
    public final am8 b = new am8();
    public ArrayList q = new ArrayList();

    public cq4(hd1 hd1Var, wd8 wd8Var, v4 v4Var) {
        this.c = hd1Var;
        this.d = wd8Var;
        this.e = v4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ks4 p(defpackage.bm8 r14, java.lang.Object r15, long r16, long r18, defpackage.am8 r20, defpackage.yl8 r21) {
        /*
            r0 = r16
            r2 = r20
            r4 = r21
            r14.g(r15, r4)
            int r5 = r4.c
            r14.n(r5, r2)
            int r5 = r14.b(r15)
            r7 = r15
        L13:
            bb r3 = r4.g
            int r3 = r3.a
            r6 = -1
            if (r3 == 0) goto L6d
            r8 = 1
            r9 = 0
            if (r3 != r8) goto L24
            boolean r10 = r4.g(r9)
            if (r10 != 0) goto L6d
        L24:
            bb r10 = r4.g
            int r10 = r10.d
            boolean r10 = r4.h(r10)
            if (r10 == 0) goto L6d
            r10 = 0
            int r12 = r4.c(r10)
            if (r12 == r6) goto L37
            goto L6d
        L37:
            long r12 = r4.d
            int r12 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r12 != 0) goto L3e
            goto L5e
        L3e:
            int r12 = r3 + (-1)
            boolean r12 = r4.g(r12)
            if (r12 == 0) goto L48
            r12 = 2
            goto L49
        L48:
            r12 = r8
        L49:
            int r3 = r3 - r12
        L4a:
            if (r9 > r3) goto L58
            bb r12 = r4.g
            ab r12 = r12.a(r9)
            long r12 = r12.i
            long r10 = r10 + r12
            int r9 = r9 + 1
            goto L4a
        L58:
            long r12 = r4.d
            int r3 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r3 > 0) goto L6d
        L5e:
            int r3 = r2.o
            if (r5 > r3) goto L6d
            r14.f(r5, r4, r8)
            java.lang.Object r7 = r4.b
            r7.getClass()
            int r5 = r5 + 1
            goto L13
        L6d:
            r14.g(r7, r4)
            int r8 = r4.c(r0)
            if (r8 != r6) goto L82
            int r14 = r4.b(r0)
            ks4 r0 = new ks4
            r10 = r18
            r0.<init>(r14, r10, r7)
            return r0
        L82:
            r10 = r18
            int r9 = r4.f(r8)
            ks4 r6 = new ks4
            r12 = -1
            r6.<init>(r7, r8, r9, r10, r12)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.p(bm8, java.lang.Object, long, long, am8, yl8):ks4");
    }

    public final aq4 a() {
        aq4 aq4Var = this.i;
        if (aq4Var == null) {
            return null;
        }
        if (aq4Var == this.j) {
            this.j = aq4Var.m;
        }
        if (aq4Var == this.k) {
            this.k = aq4Var.m;
        }
        aq4Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            aq4 aq4Var2 = this.i;
            this.o = aq4Var2.b;
            this.p = aq4Var2.g.a.d;
        }
        this.i = this.i.m;
        m();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        aq4 aq4Var = this.i;
        vy2.t(aq4Var);
        this.o = aq4Var.b;
        this.p = aq4Var.g.a.d;
        while (aq4Var != null) {
            aq4Var.i();
            aq4Var = aq4Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        m();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bq4 c(defpackage.bm8 r19, defpackage.aq4 r20, long r21) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.c(bm8, aq4, long):bq4");
    }

    public final bq4 d(bm8 bm8Var, aq4 aq4Var, long j) {
        yl8 yl8Var;
        bm8 bm8Var2;
        bq4 bq4Var = aq4Var.g;
        long j2 = (aq4Var.p + bq4Var.e) - j;
        if (bq4Var.h) {
            return c(bm8Var, aq4Var, j2);
        }
        ks4 ks4Var = bq4Var.a;
        Object obj = ks4Var.a;
        int i = ks4Var.e;
        yl8 yl8Var2 = this.a;
        bm8Var.g(obj, yl8Var2);
        boolean z = bq4Var.g;
        if (!ks4Var.b()) {
            if (i != -1 && yl8Var2.g(i)) {
                return c(bm8Var, aq4Var, j2);
            }
            int iF = yl8Var2.f(i);
            boolean z2 = yl8Var2.h(i) && yl8Var2.e(i, iF) == 3;
            if (iF != yl8Var2.g.a(i).b && !z2) {
                return f(bm8Var, ks4Var.a, ks4Var.e, iF, bq4Var.e, ks4Var.d, z);
            }
            bm8Var.g(obj, yl8Var2);
            long jD = yl8Var2.d(i);
            return g(bm8Var, ks4Var.a, jD == Long.MIN_VALUE ? yl8Var2.d : yl8Var2.g.a(i).i + jD, bq4Var.e, ks4Var.d, false);
        }
        int i2 = ks4Var.b;
        int i3 = yl8Var2.g.a(i2).b;
        if (i3 == -1) {
            return null;
        }
        int iA = yl8Var2.g.a(i2).a(ks4Var.c);
        if (iA < i3) {
            return f(bm8Var, ks4Var.a, i2, iA, bq4Var.c, ks4Var.d, z);
        }
        long jLongValue = bq4Var.c;
        if (jLongValue == -9223372036854775807L) {
            Pair pairJ = bm8Var.j(this.b, yl8Var2, yl8Var2.c, -9223372036854775807L, Math.max(0L, j2));
            yl8Var = yl8Var2;
            bm8Var2 = bm8Var;
            if (pairJ == null) {
                return null;
            }
            jLongValue = ((Long) pairJ.second).longValue();
        } else {
            yl8Var = yl8Var2;
            bm8Var2 = bm8Var;
        }
        int i4 = ks4Var.b;
        bm8Var2.g(obj, yl8Var);
        long jD2 = yl8Var.d(i4);
        return g(bm8Var, ks4Var.a, Math.max(jD2 == Long.MIN_VALUE ? yl8Var.d : yl8Var.g.a(i4).i + jD2, jLongValue), bq4Var.c, ks4Var.d, z);
    }

    public final bq4 e(bm8 bm8Var, ks4 ks4Var, long j, long j2) {
        bm8Var.g(ks4Var.a, this.a);
        return ks4Var.b() ? f(bm8Var, ks4Var.a, ks4Var.b, ks4Var.c, j, ks4Var.d, false) : g(bm8Var, ks4Var.a, j2, j, ks4Var.d, false);
    }

    public final bq4 f(bm8 bm8Var, Object obj, int i, int i2, long j, long j2, boolean z) {
        ks4 ks4Var = new ks4(obj, i, i2, j2, -1);
        yl8 yl8Var = this.a;
        long jA = bm8Var.g(obj, yl8Var).a(i, i2);
        long jMax = i2 == yl8Var.f(i) ? yl8Var.g.b : 0L;
        boolean zH = yl8Var.h(i);
        if (jA != -9223372036854775807L && jMax >= jA) {
            jMax = Math.max(0L, jA - 1);
        }
        return new bq4(ks4Var, jMax, j, -9223372036854775807L, jA, z, zH, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.bq4 g(defpackage.bm8 r27, java.lang.Object r28, long r29, long r31, long r33, boolean r35) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.g(bm8, java.lang.Object, long, long, long, boolean):bq4");
    }

    public final aq4 h() {
        return this.k;
    }

    public final bq4 i(bm8 bm8Var, bq4 bq4Var) {
        ks4 ks4Var = bq4Var.a;
        boolean zB = ks4Var.b();
        int i = ks4Var.e;
        boolean zH = false;
        boolean z = !zB && i == -1;
        int i2 = ks4Var.b;
        boolean zK = k(bm8Var, ks4Var);
        boolean zJ = j(bm8Var, ks4Var, z);
        Object obj = ks4Var.a;
        yl8 yl8Var = this.a;
        bm8Var.g(obj, yl8Var);
        long jD = (ks4Var.b() || i == -1) ? -9223372036854775807L : yl8Var.d(i);
        long jA = ks4Var.b() ? yl8Var.a(i2, ks4Var.c) : (jD == -9223372036854775807L || jD == Long.MIN_VALUE) ? yl8Var.d : jD;
        if (ks4Var.b()) {
            zH = yl8Var.h(i2);
        } else if (i != -1 && yl8Var.h(i)) {
            zH = true;
        }
        return new bq4(ks4Var, bq4Var.b, bq4Var.c, jD, jA, bq4Var.f, zH, z, zK, zJ);
    }

    public final boolean j(bm8 bm8Var, ks4 ks4Var, boolean z) {
        int iB = bm8Var.b(ks4Var.a);
        if (!bm8Var.m(bm8Var.f(iB, this.a, false).c, this.b, 0L).i) {
            if (bm8Var.d(iB, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(bm8 bm8Var, ks4 ks4Var) {
        boolean z = !ks4Var.b() && ks4Var.e == -1;
        Object obj = ks4Var.a;
        if (z) {
            if (bm8Var.m(bm8Var.g(obj, this.a).c, this.b, 0L).o == bm8Var.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void l() {
        aq4 aq4Var = this.m;
        if (aq4Var == null || aq4Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                aq4 aq4Var2 = (aq4) this.q.get(i);
                if (!aq4Var2.h()) {
                    this.m = aq4Var2;
                    return;
                }
            }
        }
    }

    public final void m() {
        lj3 lj3VarM = ImmutableList.m();
        for (aq4 aq4Var = this.i; aq4Var != null; aq4Var = aq4Var.m) {
            lj3VarM.O(aq4Var.g.a);
        }
        aq4 aq4Var2 = this.j;
        this.d.c(new ii(this, lj3VarM, aq4Var2 == null ? null : aq4Var2.g.a, 12));
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, ko7] */
    public final void n(long j) {
        aq4 aq4Var = this.l;
        if (aq4Var != null) {
            vy2.s(aq4Var.m == null);
            if (aq4Var.e) {
                aq4Var.a.v(j - aq4Var.p);
            }
        }
    }

    public final int o(aq4 aq4Var) {
        vy2.t(aq4Var);
        int i = 0;
        if (aq4Var.equals(this.l)) {
            return 0;
        }
        this.l = aq4Var;
        while (true) {
            aq4Var = aq4Var.m;
            if (aq4Var == null) {
                break;
            }
            if (aq4Var == this.j) {
                aq4 aq4Var2 = this.i;
                this.j = aq4Var2;
                this.k = aq4Var2;
                i = 3;
            }
            if (aq4Var == this.k) {
                this.k = this.j;
                i |= 2;
            }
            aq4Var.i();
            this.n--;
        }
        aq4 aq4Var3 = this.l;
        aq4Var3.getClass();
        if (aq4Var3.m != null) {
            aq4Var3.b();
            aq4Var3.m = null;
            aq4Var3.c();
        }
        m();
        return i;
    }

    public final ks4 q(bm8 bm8Var, Object obj, long j) {
        long jR;
        int iB;
        Object obj2 = obj;
        yl8 yl8Var = this.a;
        int i = bm8Var.g(obj2, yl8Var).c;
        Object obj3 = this.o;
        if (obj3 == null || (iB = bm8Var.b(obj3)) == -1 || bm8Var.f(iB, yl8Var, false).c != i) {
            aq4 aq4Var = this.i;
            while (true) {
                if (aq4Var == null) {
                    aq4 aq4Var2 = this.i;
                    while (true) {
                        if (aq4Var2 != null) {
                            int iB2 = bm8Var.b(aq4Var2.b);
                            if (iB2 != -1 && bm8Var.f(iB2, yl8Var, false).c == i) {
                                jR = aq4Var2.g.a.d;
                                break;
                            }
                            aq4Var2 = aq4Var2.m;
                        } else {
                            jR = r(obj2);
                            if (jR == -1) {
                                jR = this.f;
                                this.f = 1 + jR;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = jR;
                                }
                            }
                        }
                    }
                } else {
                    if (aq4Var.b.equals(obj2)) {
                        jR = aq4Var.g.a.d;
                        break;
                    }
                    aq4Var = aq4Var.m;
                }
            }
        } else {
            jR = this.p;
        }
        bm8Var.g(obj2, yl8Var);
        int i2 = yl8Var.c;
        am8 am8Var = this.b;
        bm8Var.n(i2, am8Var);
        boolean z = false;
        for (int iB3 = bm8Var.b(obj); iB3 >= am8Var.n; iB3--) {
            bm8Var.f(iB3, yl8Var, true);
            boolean z2 = yl8Var.g.a > 0;
            z |= z2;
            if (yl8Var.c(yl8Var.d) != -1) {
                obj2 = yl8Var.b;
                obj2.getClass();
            }
            if (z && (!z2 || yl8Var.d != 0)) {
                break;
            }
        }
        return p(bm8Var, obj2, j, jR, this.b, this.a);
    }

    public final long r(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            aq4 aq4Var = (aq4) this.q.get(i);
            if (aq4Var.b.equals(obj)) {
                return aq4Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int s(bm8 bm8Var) {
        bm8 bm8Var2;
        aq4 aq4Var;
        aq4 aq4Var2 = this.i;
        if (aq4Var2 == null) {
            return 0;
        }
        int iB = bm8Var.b(aq4Var2.b);
        while (true) {
            bm8Var2 = bm8Var;
            iB = bm8Var2.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                aq4Var2.getClass();
                aq4Var = aq4Var2.m;
                if (aq4Var == null || aq4Var2.g.h) {
                    break;
                }
                aq4Var2 = aq4Var;
            }
            if (iB == -1 || aq4Var == null || bm8Var2.b(aq4Var.b) != iB) {
                break;
            }
            aq4Var2 = aq4Var;
            bm8Var = bm8Var2;
        }
        int iO = o(aq4Var2);
        aq4Var2.g = i(bm8Var2, aq4Var2.g);
        return iO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b4, code lost:
    
        return o(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int t(defpackage.bm8 r18, long r19, long r21, long r23) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            aq4 r2 = r0.i
            r3 = 0
        L7:
            r4 = 0
            if (r2 == 0) goto Lb5
            bq4 r5 = r2.g
            if (r3 != 0) goto L15
            bq4 r3 = r0.i(r1, r5)
            r6 = r19
            goto L30
        L15:
            r6 = r19
            bq4 r8 = r0.d(r1, r3, r6)
            if (r8 == 0) goto Lb0
            long r9 = r5.b
            long r11 = r8.b
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto Lb0
            ks4 r9 = r5.a
            ks4 r10 = r8.a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto Lb0
            r3 = r8
        L30:
            long r8 = r3.e
            long r10 = r5.c
            long r12 = r5.e
            bq4 r10 = r3.a(r10)
            r2.g = r10
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 == 0) goto La7
            r2.k()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 != 0) goto L52
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L55
        L52:
            long r10 = r2.p
            long r8 = r8 + r10
        L55:
            aq4 r1 = r0.j
            r10 = 1
            r14 = -9223372036854775808
            if (r2 != r1) goto L6c
            bq4 r1 = r2.g
            boolean r1 = r1.g
            if (r1 != 0) goto L6c
            int r1 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r1 == 0) goto L6a
            int r1 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r1 < 0) goto L6c
        L6a:
            r1 = r10
            goto L6d
        L6c:
            r1 = r4
        L6d:
            aq4 r11 = r0.k
            if (r2 != r11) goto L7b
            int r11 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            if (r11 == 0) goto L79
            int r8 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r8 < 0) goto L7b
        L79:
            r8 = r10
            goto L7c
        L7b:
            r8 = r4
        L7c:
            int r2 = r0.o(r2)
            if (r2 == 0) goto L83
            return r2
        L83:
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 != 0) goto L99
            long r11 = r5.d
            int r5 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r5 != 0) goto L99
            long r11 = r3.d
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 == 0) goto L99
            int r3 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r3 == 0) goto L99
            r3 = r10
            goto L9a
        L99:
            r3 = r4
        L9a:
            if (r1 == 0) goto La1
            if (r2 != 0) goto La0
            if (r3 == 0) goto La1
        La0:
            r4 = r10
        La1:
            if (r8 == 0) goto La6
            r1 = r4 | 2
            return r1
        La6:
            return r4
        La7:
            aq4 r3 = r2.m
            r16 = r3
            r3 = r2
            r2 = r16
            goto L7
        Lb0:
            int r1 = r0.o(r3)
            return r1
        Lb5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.t(bm8, long, long, long):int");
    }
}
