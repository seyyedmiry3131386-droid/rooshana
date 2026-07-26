package defpackage;

import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.snapshots.a;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public abstract class g08 {
    public static final vd7 a = new vd7(27);
    public static final sk6 b = new sk6(12, (byte) 0);
    public static final Object c = new Object();
    public static a d;
    public static long e;
    public static final z21 f;
    public static final pg g;
    public static List h;
    public static List i;
    public static final vt2 j;
    public static final AtomicInt k;

    static {
        a aVar = a.e;
        d = aVar;
        long j2 = 1;
        e = j2 + j2;
        z21 z21Var = new z21();
        z21Var.c = new long[16];
        z21Var.d = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        z21Var.e = iArr;
        f = z21Var;
        pg pgVar = new pg(15, false);
        pgVar.c = new int[16];
        pgVar.d = new rc9[16];
        g = pgVar;
        EmptyList emptyList = EmptyList.a;
        h = emptyList;
        i = emptyList;
        long j3 = e;
        e = j2 + j3;
        vt2 vt2Var = new vt2(j3, aVar, null, new sl0(16));
        d = d.f(vt2Var.b);
        j = vt2Var;
        k = new AtomicInt(0);
    }

    public static final void a() {
        e(a);
    }

    public static final HashMap b(long j2, vb5 vb5Var, a aVar) {
        long[] jArr;
        a aVar2;
        long[] jArr2;
        a aVar3;
        int i2;
        int i3;
        g58 g58VarT;
        sb5 sb5VarX = vb5Var.x();
        if (sb5VarX != null) {
            long jG = vb5Var.g();
            a aVarE = vb5Var.d().f(jG).e(vb5Var.j);
            Object[] objArr = sb5VarX.b;
            long[] jArr3 = sb5VarX.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap map = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                e58 e58Var = (e58) objArr[(i4 << 3) + i7];
                                g58 g58VarA = e58Var.a();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                g58 g58VarT2 = t(g58VarA, j2, aVar);
                                if (g58VarT2 == null || (g58VarT = t(g58VarA, jG, aVarE)) == null || g58VarT2.equals(g58VarT)) {
                                    aVar3 = aVarE;
                                } else {
                                    aVar3 = aVarE;
                                    g58 g58VarT3 = t(g58VarA, jG, vb5Var.d());
                                    if (g58VarT3 == null) {
                                        s();
                                        throw null;
                                    }
                                    g58 g58VarC = e58Var.c(g58VarT, g58VarT2, g58VarT3);
                                    if (g58VarC == null) {
                                        return null;
                                    }
                                    if (map == null) {
                                        map = new HashMap();
                                    }
                                    map.put(g58VarT2, g58VarC);
                                    map = map;
                                }
                            } else {
                                jArr2 = jArr3;
                                aVar3 = aVarE;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            aVarE = aVar3;
                        }
                        jArr = jArr3;
                        aVar2 = aVarE;
                        if (i6 != i5) {
                            return map;
                        }
                    } else {
                        jArr = jArr3;
                        aVar2 = aVarE;
                    }
                    if (i4 == length) {
                        return map;
                    }
                    i4++;
                    jArr3 = jArr;
                    aVarE = aVar2;
                }
            }
        }
        return null;
    }

    public static final void c(c08 c08Var) {
        long j2;
        if (d.d(c08Var.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(c08Var.g());
        sb.append(", disposed=");
        sb.append(c08Var.c);
        sb.append(", applied=");
        vb5 vb5Var = c08Var instanceof vb5 ? (vb5) c08Var : null;
        sb.append(vb5Var != null ? Boolean.valueOf(vb5Var.m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (c) {
            z21 z21Var = f;
            j2 = z21Var.a > 0 ? ((long[]) z21Var.c)[0] : -1L;
        }
        sb.append(j2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final a d(a aVar, long j2, long j3) {
        while (js3.s(j2, j3) < 0) {
            aVar = aVar.f(j2);
            j2 += (long) 1;
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(defpackage.dp2 r15) {
        /*
            vt2 r0 = defpackage.g08.j
            java.lang.Object r1 = defpackage.g08.c
            monitor-enter(r1)
            sb5 r2 = r0.h     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L13
            androidx.compose.runtime.internal.AtomicInt r3 = defpackage.g08.k     // Catch: java.lang.Throwable -> L10
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r15 = move-exception
            goto L97
        L13:
            java.lang.Object r15 = w(r0, r15)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L44
            r3 = -1
            java.util.List r4 = defpackage.g08.h     // Catch: java.lang.Throwable -> L36
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L36
            r6 = r1
        L23:
            if (r6 >= r5) goto L38
            java.lang.Object r7 = r4.get(r6)     // Catch: java.lang.Throwable -> L36
            qp2 r7 = (defpackage.qp2) r7     // Catch: java.lang.Throwable -> L36
            androidx.compose.runtime.collection.a r8 = new androidx.compose.runtime.collection.a     // Catch: java.lang.Throwable -> L36
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L36
            r7.invoke(r8, r0)     // Catch: java.lang.Throwable -> L36
            int r6 = r6 + 1
            goto L23
        L36:
            r15 = move-exception
            goto L3e
        L38:
            androidx.compose.runtime.internal.AtomicInt r0 = defpackage.g08.k
            r0.addAndGet(r3)
            goto L44
        L3e:
            androidx.compose.runtime.internal.AtomicInt r0 = defpackage.g08.k
            r0.addAndGet(r3)
            throw r15
        L44:
            java.lang.Object r0 = defpackage.g08.c
            monitor-enter(r0)
            f()     // Catch: java.lang.Throwable -> L86
            if (r2 == 0) goto L93
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L86
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L86
            int r4 = r2.length     // Catch: java.lang.Throwable -> L86
            int r4 = r4 + (-2)
            if (r4 < 0) goto L93
            r5 = r1
        L56:
            r6 = r2[r5]     // Catch: java.lang.Throwable -> L86
            long r8 = ~r6     // Catch: java.lang.Throwable -> L86
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
            int r8 = r5 - r4
            int r8 = ~r8     // Catch: java.lang.Throwable -> L86
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r1
        L70:
            if (r10 >= r8) goto L8c
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L88
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L86
            e58 r11 = (defpackage.e58) r11     // Catch: java.lang.Throwable -> L86
            r(r11)     // Catch: java.lang.Throwable -> L86
            goto L88
        L86:
            r15 = move-exception
            goto L95
        L88:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L70
        L8c:
            if (r8 != r9) goto L93
        L8e:
            if (r5 == r4) goto L93
            int r5 = r5 + 1
            goto L56
        L93:
            monitor-exit(r0)
            return r15
        L95:
            monitor-exit(r0)
            throw r15
        L97:
            monitor-exit(r1)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g08.e(dp2):java.lang.Object");
    }

    public static final void f() {
        pg pgVar = g;
        int i2 = pgVar.b;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            rc9 rc9Var = ((rc9[]) pgVar.d)[i3];
            Object obj = rc9Var != null ? rc9Var.get() : null;
            if (obj != null && q((e58) obj)) {
                if (i4 != i3) {
                    ((rc9[]) pgVar.d)[i4] = rc9Var;
                    int[] iArr = (int[]) pgVar.c;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((rc9[]) pgVar.d)[i5] = null;
            ((int[]) pgVar.c)[i5] = 0;
        }
        if (i4 != i2) {
            pgVar.b = i4;
        }
    }

    public static final c08 g(c08 c08Var, dp2 dp2Var, boolean z) {
        boolean z2 = c08Var instanceof vb5;
        if (z2 || c08Var == null) {
            return new yr8(z2 ? (vb5) c08Var : null, dp2Var, null, false, z);
        }
        return new zr8(c08Var, dp2Var, false, z);
    }

    public static final g58 h(g58 g58Var) {
        g58 g58VarT;
        c08 c08VarJ = j();
        g58 g58VarT2 = t(g58Var, c08VarJ.g(), c08VarJ.d());
        if (g58VarT2 != null) {
            return g58VarT2;
        }
        synchronized (c) {
            c08 c08VarJ2 = j();
            g58VarT = t(g58Var, c08VarJ2.g(), c08VarJ2.d());
        }
        if (g58VarT != null) {
            return g58VarT;
        }
        s();
        throw null;
    }

    public static final g58 i(g58 g58Var, c08 c08Var) {
        g58 g58VarT;
        g58 g58VarT2 = t(g58Var, c08Var.g(), c08Var.d());
        if (g58VarT2 != null) {
            return g58VarT2;
        }
        synchronized (c) {
            g58VarT = t(g58Var, c08Var.g(), c08Var.d());
        }
        if (g58VarT != null) {
            return g58VarT;
        }
        s();
        throw null;
    }

    public static final c08 j() {
        c08 c08Var = (c08) b.s();
        return c08Var == null ? j : c08Var;
    }

    public static final dp2 k(dp2 dp2Var, dp2 dp2Var2, boolean z) {
        if (!z) {
            dp2Var2 = null;
        }
        return (dp2Var == null || dp2Var2 == null || dp2Var == dp2Var2) ? dp2Var == null ? dp2Var2 : dp2Var : new f08(dp2Var, dp2Var2, 0);
    }

    public static final dp2 l(dp2 dp2Var, dp2 dp2Var2) {
        return (dp2Var == null || dp2Var2 == null || dp2Var == dp2Var2) ? dp2Var == null ? dp2Var2 : dp2Var : new f08(dp2Var, dp2Var2, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.g58 m(defpackage.g58 r10, defpackage.e58 r11) {
        /*
            g58 r0 = r11.a()
            long r1 = defpackage.g08.e
            z21 r3 = defpackage.g08.f
            int r4 = r3.a
            if (r4 <= 0) goto L14
            java.lang.Object r1 = r3.c
            long[] r1 = (long[]) r1
            r2 = 0
            r2 = r1[r2]
            r1 = r2
        L14:
            r3 = 1
            long r3 = (long) r3
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L19:
            if (r0 == 0) goto L4b
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L24
            goto L44
        L24:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L48
            int r7 = defpackage.js3.s(r5, r1)
            if (r7 > 0) goto L48
            androidx.compose.runtime.snapshots.a r7 = androidx.compose.runtime.snapshots.a.e
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L48
            if (r4 != 0) goto L3a
            r4 = r0
            goto L48
        L3a:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.js3.s(r1, r5)
            if (r1 >= 0) goto L46
        L44:
            r3 = r0
            goto L4b
        L46:
            r3 = r4
            goto L4b
        L48:
            g58 r0 = r0.b
            goto L19
        L4b:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L55
            r3.a = r0
            return r3
        L55:
            g58 r10 = r10.b(r0)
            g58 r0 = r11.a()
            r10.b = r0
            r11.d(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g08.m(g58, e58):g58");
    }

    public static final g58 n(g58 g58Var, ck1 ck1Var, c08 c08Var) {
        g58 g58VarM;
        synchronized (c) {
            g58VarM = m(g58Var, ck1Var);
            g58VarM.a(g58Var);
            g58VarM.a = c08Var.g();
        }
        return g58VarM;
    }

    public static final void o(c08 c08Var, e58 e58Var) {
        c08Var.t(c08Var.h() + 1);
        dp2 dp2VarI = c08Var.i();
        if (dp2VarI != null) {
            dp2VarI.invoke(e58Var);
        }
    }

    public static final g58 p(g58 g58Var, f58 f58Var, c08 c08Var, g58 g58Var2) {
        g58 g58VarM;
        if (c08Var.f()) {
            c08Var.n(f58Var);
        }
        long jG = c08Var.g();
        if (g58Var2.a == jG) {
            return g58Var2;
        }
        synchronized (c) {
            g58VarM = m(g58Var, f58Var);
        }
        g58VarM.a = jG;
        if (g58Var2.a != 1) {
            c08Var.n(f58Var);
        }
        return g58VarM;
    }

    public static final boolean q(e58 e58Var) {
        g58 g58Var;
        long j2 = e;
        z21 z21Var = f;
        if (z21Var.a > 0) {
            j2 = ((long[]) z21Var.c)[0];
        }
        g58 g58Var2 = null;
        g58 g58VarA = null;
        int i2 = 0;
        for (g58 g58VarA2 = e58Var.a(); g58VarA2 != null; g58VarA2 = g58VarA2.b) {
            long j3 = g58VarA2.a;
            if (j3 != 0) {
                if (js3.s(j3, j2) >= 0) {
                    i2++;
                } else if (g58Var2 == null) {
                    i2++;
                    g58Var2 = g58VarA2;
                } else {
                    if (js3.s(g58VarA2.a, g58Var2.a) < 0) {
                        g58Var = g58Var2;
                        g58Var2 = g58VarA2;
                    } else {
                        g58Var = g58VarA2;
                    }
                    if (g58VarA == null) {
                        g58VarA = e58Var.a();
                        g58 g58Var3 = g58VarA;
                        while (true) {
                            if (g58VarA == null) {
                                g58VarA = g58Var3;
                                break;
                            }
                            if (js3.s(g58VarA.a, j2) >= 0) {
                                break;
                            }
                            if (js3.s(g58Var3.a, g58VarA.a) < 0) {
                                g58Var3 = g58VarA;
                            }
                            g58VarA = g58VarA.b;
                        }
                    }
                    g58Var2.a = 0L;
                    g58Var2.a(g58VarA);
                    g58Var2 = g58Var;
                }
            }
        }
        return i2 > 1;
    }

    public static final void r(e58 e58Var) {
        if (q(e58Var)) {
            pg pgVar = g;
            int i2 = pgVar.b;
            int iIdentityHashCode = System.identityHashCode(e58Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = pgVar.b - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        i3 = -(i5 + 1);
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) pgVar.c)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        rc9 rc9Var = ((rc9[]) pgVar.d)[i6];
                        if (e58Var == (rc9Var != null ? rc9Var.get() : null)) {
                            i3 = i6;
                        } else {
                            for (int i8 = i6 - 1; -1 < i8 && ((int[]) pgVar.c)[i8] == iIdentityHashCode; i8--) {
                                rc9 rc9Var2 = ((rc9[]) pgVar.d)[i8];
                                if ((rc9Var2 != null ? rc9Var2.get() : null) == e58Var) {
                                    i3 = i8;
                                    break;
                                }
                            }
                            i6++;
                            int i9 = pgVar.b;
                            while (true) {
                                if (i6 >= i9) {
                                    i3 = -(pgVar.b + 1);
                                    break;
                                } else {
                                    if (((int[]) pgVar.c)[i6] != iIdentityHashCode) {
                                        i3 = -(i6 + 1);
                                        break;
                                    }
                                    rc9 rc9Var3 = ((rc9[]) pgVar.d)[i6];
                                    if ((rc9Var3 != null ? rc9Var3.get() : null) == e58Var) {
                                        break;
                                    } else {
                                        i6++;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            rc9[] rc9VarArr = (rc9[]) pgVar.d;
            int length = rc9VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                rc9[] rc9VarArr2 = new rc9[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(rc9VarArr, i10, rc9VarArr2, i12, i2 - i10);
                System.arraycopy((rc9[]) pgVar.d, 0, rc9VarArr2, 0, i10);
                ew.x0(i12, i10, i2, (int[]) pgVar.c, iArr);
                ew.B0(0, i10, 6, (int[]) pgVar.c, iArr);
                pgVar.d = rc9VarArr2;
                pgVar.c = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(rc9VarArr, i10, rc9VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) pgVar.c;
                ew.x0(i13, i10, i2, iArr2, iArr2);
            }
            ((rc9[]) pgVar.d)[i10] = new rc9(e58Var);
            ((int[]) pgVar.c)[i10] = iIdentityHashCode;
            pgVar.b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final g58 t(g58 g58Var, long j2, a aVar) {
        g58 g58Var2 = null;
        while (g58Var != null) {
            long j3 = g58Var.a;
            if (j3 != 0 && js3.s(j3, j2) <= 0 && !aVar.d(j3) && (g58Var2 == null || js3.s(g58Var2.a, g58Var.a) < 0)) {
                g58Var2 = g58Var;
            }
            g58Var = g58Var.b;
        }
        if (g58Var2 != null) {
            return g58Var2;
        }
        return null;
    }

    public static final g58 u(g58 g58Var, e58 e58Var) {
        g58 g58VarT;
        c08 c08VarJ = j();
        dp2 dp2VarE = c08VarJ.e();
        if (dp2VarE != null) {
            dp2VarE.invoke(e58Var);
        }
        g58 g58VarT2 = t(g58Var, c08VarJ.g(), c08VarJ.d());
        if (g58VarT2 != null) {
            return g58VarT2;
        }
        synchronized (c) {
            c08 c08VarJ2 = j();
            g58 g58VarA = e58Var.a();
            js3.n(g58VarA, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            g58VarT = t(g58VarA, c08VarJ2.g(), c08VarJ2.d());
            if (g58VarT == null) {
                s();
                throw null;
            }
        }
        return g58VarT;
    }

    public static final void v(int i2) {
        z21 z21Var = f;
        int i3 = ((int[]) z21Var.e)[i2];
        z21Var.i(i3, z21Var.a - 1);
        z21Var.a--;
        long[] jArr = (long[]) z21Var.c;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (js3.s(jArr[i5], j2) <= 0) {
                break;
            }
            z21Var.i(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) z21Var.c;
        int i6 = z21Var.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < z21Var.a && js3.s(jArr2[i7], jArr2[i8]) < 0) {
                if (js3.s(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                z21Var.i(i7, i3);
                i3 = i7;
            } else {
                if (js3.s(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                z21Var.i(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) z21Var.e)[i2] = z21Var.b;
        z21Var.b = i2;
    }

    public static final Object w(vt2 vt2Var, dp2 dp2Var) {
        long j2 = vt2Var.b;
        Object objInvoke = dp2Var.invoke(d.c(j2));
        long j3 = e;
        e = ((long) 1) + j3;
        a aVarC = d.c(j2);
        d = aVarC;
        vt2Var.b = j3;
        vt2Var.a = aVarC;
        vt2Var.g = 0;
        vt2Var.h = null;
        vt2Var.o();
        d = d.f(j3);
        return objInvoke;
    }

    public static final g58 x(g58 g58Var, e58 e58Var, c08 c08Var) {
        g58 g58VarT;
        if (c08Var.f()) {
            c08Var.n(e58Var);
        }
        long jG = c08Var.g();
        g58 g58VarT2 = t(g58Var, jG, c08Var.d());
        if (g58VarT2 == null) {
            s();
            throw null;
        }
        if (g58VarT2.a == c08Var.g()) {
            return g58VarT2;
        }
        synchronized (c) {
            g58VarT = t(e58Var.a(), jG, c08Var.d());
            if (g58VarT == null) {
                s();
                throw null;
            }
            if (g58VarT.a != jG) {
                g58 g58VarM = m(g58VarT, e58Var);
                g58VarM.a(g58VarT);
                g58VarM.a = c08Var.g();
                g58VarT = g58VarM;
            }
        }
        if (g58VarT2.a != 1) {
            c08Var.n(e58Var);
        }
        return g58VarT;
    }
}
