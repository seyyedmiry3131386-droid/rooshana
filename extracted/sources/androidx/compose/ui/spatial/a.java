package androidx.compose.ui.spatial;

import android.os.Handler;
import android.os.Trace;
import androidx.compose.ui.node.e;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.l;
import androidx.compose.ui.node.m;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.cl8;
import defpackage.d8;
import defpackage.e8;
import defpackage.fy5;
import defpackage.mb5;
import defpackage.o40;
import defpackage.pg;
import defpackage.qb5;
import defpackage.rq3;
import defpackage.tx8;
import defpackage.vy6;
import defpackage.z4;
import defpackage.zb5;
import defpackage.zq3;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final pg a;
    public final cl8 b;
    public final mb5 c;
    public boolean d;
    public boolean e;
    public boolean f;
    public d8 g;
    public long h;
    public final bp2 i;
    public final qb5 j;

    public a() {
        pg pgVar = new pg(13, false);
        pgVar.c = new long[192];
        pgVar.d = new long[192];
        this.a = pgVar;
        this.b = new cl8();
        this.c = new mb5();
        this.h = -1L;
        this.i = new bp2() { // from class: androidx.compose.ui.spatial.RectManager$dispatchLambda$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                a aVar = this.g;
                aVar.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    aVar.a();
                    Trace.endSection();
                    return tx8.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        };
        this.j = new qb5();
    }

    public static long f(h hVar) {
        z4 z4Var = hVar.H;
        m mVar = (m) z4Var.e;
        long jC = 0;
        for (m mVar2 = (e) z4Var.d; mVar2 != null && mVar2 != mVar; mVar2 = mVar2.s) {
            fy5 fy5Var = mVar2.N;
            if (fy5Var != null && !bt2.E(fy5Var.mo7getUnderlyingMatrixsQKQjiQ())) {
                return 9223372034707292159L;
            }
            jC = rq3.c(jC, mVar2.B);
        }
        return jC;
    }

    public static void h(h hVar) {
        if (hVar.c) {
            fy5 fy5Var = ((m) hVar.H.e).N;
            if (fy5Var == null || bt2.E(fy5Var.mo7getUnderlyingMatrixsQKQjiQ())) {
                hVar.c = false;
                if (hVar.g) {
                    hVar.f = f(hVar);
                    hVar.g = false;
                }
                if (rq3.a(hVar.f, 9223372034707292159L)) {
                    return;
                }
                zb5 zb5VarL = hVar.L();
                Object[] objArr = zb5VarL.a;
                int i = zb5VarL.c;
                for (int i2 = 0; i2 < i; i2++) {
                    h((h) objArr[i2]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.a.a():void");
    }

    public final long b(h hVar) {
        long j;
        int i = hVar.b & 33554431;
        pg pgVar = this.a;
        long[] jArr = (long[]) pgVar.c;
        int i2 = pgVar.b;
        for (int i3 = 0; i3 < jArr.length - 2 && i3 < i2; i3 += 3) {
            if ((((int) jArr[i3 + 2]) & 33554431) == i) {
                j = jArr[i3];
                break;
            }
        }
        j = Long.MAX_VALUE;
        if (j == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((long) ((int) (j >> 32))) << 32) | (((long) ((int) j)) & 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.compose.ui.node.h r24) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.a.c(androidx.compose.ui.node.h):void");
    }

    public final void d(h hVar) {
        if (hVar.h) {
            this.d = true;
            int i = hVar.b & 33554431;
            pg pgVar = this.a;
            long[] jArr = (long[]) pgVar.c;
            int i2 = pgVar.b;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                long j = jArr[i4];
                if ((((int) j) & 33554431) == i) {
                    jArr[i4] = (((j >> 63) & 1) << 60) | j;
                    break;
                }
                i3 += 3;
            }
        }
        i();
    }

    public final void e(h hVar, boolean z) {
        long j;
        fy5 fy5Var;
        int i;
        int i2;
        int i3;
        int i4;
        boolean zV = hVar.V();
        z4 z4Var = hVar.H;
        if (zV) {
            h hVarF = hVar.F();
            if (hVarF == null || hVarF.c) {
                j = hVarF == null ? 0L : 9223372034707292159L;
            } else {
                if (hVarF.g) {
                    hVarF.g = false;
                    hVarF.f = f(hVarF);
                }
                j = hVarF.f;
            }
            m mVar = (m) z4Var.e;
            if (rq3.a(j, 9223372034707292159L) || !((fy5Var = mVar.N) == null || bt2.E(fy5Var.mo7getUnderlyingMatrixsQKQjiQ()))) {
                c(hVar);
                return;
            }
            if (hVar.c) {
                c(hVar);
                h(hVar);
                return;
            }
            long jC = rq3.c(j, mVar.B);
            l lVarZ = hVar.z();
            int iU = lVarZ.U();
            int iT = lVarZ.T();
            long j2 = (((long) iU) << 32) | (((long) iT) & 4294967295L);
            int i5 = hVar.b;
            boolean z2 = hVar.h;
            int i6 = 33554431;
            pg pgVar = this.a;
            if (!z2) {
                hVar.h = true;
                boolean zF = z4Var.f(1024);
                boolean zF2 = z4Var.f(16);
                boolean zA = this.b.a.a(i5);
                if (hVarF != null) {
                    int i7 = hVarF.b;
                    int i8 = (int) (jC >> 32);
                    int i9 = (int) (jC & 4294967295L);
                    char c = ' ';
                    int i10 = i5 & 33554431;
                    long[] jArr = (long[]) pgVar.c;
                    int i11 = pgVar.b;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= jArr.length - 2 || i12 >= i11) {
                            break;
                        }
                        char c2 = c;
                        long[] jArr2 = jArr;
                        if ((((int) jArr2[i12 + 2]) & i6) == i7) {
                            long j3 = jArr2[i12];
                            int i13 = ((int) (j3 >> c2)) + i8;
                            int i14 = ((int) j3) + i9;
                            pgVar.k(i10, i13, i14, i13 + iU, i14 + iT, i7, zF, zF2, zA, i12);
                            break;
                        }
                        i12 += 3;
                        c = c2;
                        jArr = jArr2;
                        i6 = i6;
                        i7 = i7;
                    }
                } else {
                    int i15 = (int) (jC >> 32);
                    int i16 = (int) (jC & 4294967295L);
                    pgVar.k(i5, i15, i16, i15 + iU, i16 + iT, (512 & 32) != 0 ? -1 : 0, zF, zF2, zA, -1);
                }
                this.d = true;
            } else if (z || !rq3.a(jC, hVar.d) || !zq3.b(j2, hVar.e)) {
                if (hVarF != null) {
                    int i17 = hVarF.b;
                    int i18 = (int) (jC >> 32);
                    int i19 = (int) (jC & 4294967295L);
                    int i20 = i5 & 33554431;
                    long[] jArr3 = (long[]) pgVar.c;
                    int i21 = pgVar.b;
                    int i22 = 0;
                    while (true) {
                        if (i22 >= jArr3.length - 2 || i22 >= i21) {
                            break;
                        }
                        int i23 = iU;
                        if ((((int) jArr3[i22 + 2]) & 33554431) == i17) {
                            long j4 = jArr3[i22];
                            i3 = i18;
                            i4 = i19;
                            int i24 = ((int) (j4 >> 32)) + i3;
                            int i25 = ((int) j4) + i4;
                            int i26 = i24 + i23;
                            int i27 = i25 + iT;
                            int i28 = i22 + 3;
                            i = i17;
                            while (i28 < jArr3.length - 2 && i28 < i21) {
                                int i29 = i28 + 2;
                                int i30 = i21;
                                long j5 = jArr3[i29];
                                int i31 = i28;
                                if ((((int) j5) & 33554431) == i20) {
                                    long j6 = jArr3[i31];
                                    int i32 = i24 - ((int) (j6 >> 32));
                                    int i33 = i25 - ((int) j6);
                                    jArr3[i31] = (((long) i24) << 32) | (((long) i25) & 4294967295L);
                                    jArr3[i31 + 1] = (((long) i26) << 32) | (((long) i27) & 4294967295L);
                                    jArr3[i29] = j5 | (((j5 >> 63) & 1) << 60);
                                    if (i32 != 0 || i33 != 0) {
                                        pgVar.x(i32, i33, (j5 & vy6.b) | (((long) ((i31 + 3) & 33554431)) << 25));
                                    }
                                } else {
                                    i28 = i31 + 3;
                                    i21 = i30;
                                }
                            }
                            i2 = i21;
                            i22 = i28;
                        } else {
                            i = i17;
                            i2 = i21;
                            i3 = i18;
                            i4 = i19;
                        }
                        i22 += 3;
                        iU = i23;
                        i18 = i3;
                        i19 = i4;
                        i17 = i;
                        i21 = i2;
                    }
                } else {
                    int i34 = (int) (jC >> 32);
                    int i35 = (int) (jC & 4294967295L);
                    int i36 = i34 + iU;
                    int i37 = i35 + iT;
                    int i38 = i5 & 33554431;
                    long[] jArr4 = (long[]) pgVar.c;
                    int i39 = pgVar.b;
                    int i40 = 0;
                    while (true) {
                        if (i40 >= jArr4.length - 2 || i40 >= i39) {
                            break;
                        }
                        int i41 = i40 + 2;
                        int i42 = i39;
                        int i43 = i40;
                        long j7 = jArr4[i41];
                        long[] jArr5 = jArr4;
                        if ((((int) j7) & 33554431) == i38) {
                            long j8 = jArr5[i43];
                            jArr5[i43] = (((long) i34) << 32) | (((long) i35) & 4294967295L);
                            jArr5[i43 + 1] = (((long) i36) << 32) | (((long) i37) & 4294967295L);
                            jArr5[i41] = j7 | (((j7 >> 63) & 1) << 60);
                            int i44 = i34 - ((int) (j8 >> 32));
                            int i45 = i35 - ((int) j8);
                            if ((i44 != 0) | (i45 != 0)) {
                                pgVar.x(i44, i45, (j7 & vy6.b) | (((long) ((i43 + 3) & 33554431)) << 25));
                            }
                        } else {
                            i40 = i43 + 3;
                            i39 = i42;
                            jArr4 = jArr5;
                        }
                    }
                }
                this.d = true;
            }
            hVar.e = j2;
            hVar.d = jC;
        }
    }

    public final void g(h hVar) {
        if (hVar.h) {
            int i = hVar.b & 33554431;
            pg pgVar = this.a;
            long[] jArr = (long[]) pgVar.c;
            int i2 = pgVar.b;
            int i3 = 0;
            while (true) {
                if (i3 >= jArr.length - 2 || i3 >= i2) {
                    break;
                }
                int i4 = i3 + 2;
                if ((((int) jArr[i4]) & 33554431) == i) {
                    jArr[i3] = -1;
                    jArr[i3 + 1] = -1;
                    jArr[i4] = vy6.c;
                    break;
                }
                i3 += 3;
            }
            hVar.h = false;
            this.d = true;
            this.f = true;
        }
    }

    public final void i() {
        d8 d8Var = this.g;
        boolean z = d8Var != null;
        long j = this.b.c;
        if (j >= 0 || !z) {
            if (this.h == j && z) {
                return;
            }
            if (d8Var != null) {
                Handler handler = e8.a;
                if ((o40.O(d8Var) ? d8Var : null) != null) {
                    e8.a.removeCallbacks(d8Var);
                }
            }
            Handler handler2 = e8.a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j, ((long) 16) + jCurrentTimeMillis);
            this.h = jMax;
            d8 d8Var2 = new d8(0, this.i);
            e8.a.postDelayed(d8Var2, jMax - jCurrentTimeMillis);
            this.g = d8Var2;
        }
    }
}
