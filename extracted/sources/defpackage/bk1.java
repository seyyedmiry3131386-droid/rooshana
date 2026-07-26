package defpackage;

import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class bk1 extends g58 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public ib5 e;
    public Object f;
    public int g;

    public bk1(long j) {
        super(j);
        ib5 ib5Var = xq5.a;
        js3.n(ib5Var, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
        this.e = ib5Var;
        this.f = h;
    }

    @Override // defpackage.g58
    public final void a(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
        bk1 bk1Var = (bk1) g58Var;
        this.e = bk1Var.e;
        this.f = bk1Var.f;
        this.g = bk1Var.g;
    }

    @Override // defpackage.g58
    public final g58 b(long j) {
        return new bk1(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.ck1 r7, defpackage.c08 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = defpackage.g08.c
            monitor-enter(r0)
            long r1 = r6.c     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.d     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.h()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r7 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f
            java.lang.Object r5 = defpackage.bk1.h
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.g
            int r7 = r6.d(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.g()     // Catch: java.lang.Throwable -> L43
            r6.c = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.h()     // Catch: java.lang.Throwable -> L43
            r6.d = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk1.c(ck1, c08):boolean");
    }

    public final int d(ck1 ck1Var, c08 c08Var) throws Throwable {
        ib5 ib5Var;
        int i;
        long[] jArr;
        int i2;
        long[] jArr2;
        int i3;
        int i4;
        g58 g58VarH;
        synchronized (g08.c) {
            ib5Var = this.e;
        }
        int i5 = 7;
        if (ib5Var.e == 0) {
            return 7;
        }
        zb5 zb5VarB = g.b();
        Object[] objArr = zb5VarB.a;
        int i6 = zb5VarB.c;
        for (int i7 = 0; i7 < i6; i7++) {
            ((pz0) objArr[i7]).b();
        }
        try {
            Object[] objArr2 = ib5Var.b;
            int[] iArr = ib5Var.c;
            long[] jArr3 = ib5Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j = jArr3[i8];
                    if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                Object obj = objArr2[i12];
                                i3 = i5;
                                int i13 = iArr[i12];
                                i4 = i9;
                                e58 e58Var = (e58) obj;
                                if (i13 != 1) {
                                    jArr2 = jArr3;
                                } else {
                                    if (e58Var instanceof ck1) {
                                        try {
                                            ck1 ck1Var2 = (ck1) e58Var;
                                            g58VarH = ck1Var2.h((bk1) g08.i(ck1Var2.d, c08Var), c08Var, false, ck1Var2.b);
                                        } catch (Throwable th) {
                                            th = th;
                                            Object[] objArr3 = zb5VarB.a;
                                            int i14 = zb5VarB.c;
                                            for (int i15 = 0; i15 < i14; i15++) {
                                                ((pz0) objArr3[i15]).a();
                                            }
                                            throw th;
                                        }
                                    } else {
                                        g58VarH = g08.i(e58Var.a(), c08Var);
                                    }
                                    int iIdentityHashCode = ((i * 31) + System.identityHashCode(g58VarH)) * 31;
                                    jArr2 = jArr3;
                                    long j2 = g58VarH.a;
                                    i = iIdentityHashCode + ((int) (j2 ^ (j2 >>> 32)));
                                }
                            } else {
                                jArr2 = jArr3;
                                i3 = i5;
                                i4 = i9;
                            }
                            j >>= i4;
                            i11++;
                            i5 = i3;
                            jArr3 = jArr2;
                            i9 = i4;
                        }
                        jArr = jArr3;
                        i2 = i5;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                    }
                    if (i8 == length) {
                        i5 = i;
                        break;
                    }
                    i8++;
                    i5 = i2;
                    jArr3 = jArr;
                }
            }
            i = i5;
            Object[] objArr4 = zb5VarB.a;
            int i16 = zb5VarB.c;
            for (int i17 = 0; i17 < i16; i17++) {
                ((pz0) objArr4[i17]).a();
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
