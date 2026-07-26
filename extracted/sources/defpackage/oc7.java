package defpackage;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.b;
import j$.util.Objects;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public class oc7 implements cp8 {
    public b A;
    public b B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final lc7 a;
    public final vw1 d;
    public final sw1 e;
    public Object f;
    public b g;
    public pw1 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final tn0 b = new tn0();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public bp8[] o = new bp8[1000];
    public final pg c = new pg(new y45(24));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public oc7(qc1 qc1Var, vw1 vw1Var, sw1 sw1Var) {
        this.d = vw1Var;
        this.e = sw1Var;
        this.a = new lc7(qc1Var);
    }

    public final synchronized void A() {
        this.s = 0;
        lc7 lc7Var = this.a;
        lc7Var.e = lc7Var.d;
    }

    public final synchronized boolean B(int i) {
        A();
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean C(long j, boolean z) {
        Throwable th;
        oc7 oc7Var;
        long j2;
        int iL;
        try {
            try {
                A();
                int iR = r(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iR] || (j > this.v && !z)) {
                    return false;
                }
                if (this.D) {
                    int i3 = i2 - i;
                    int i4 = 0;
                    while (true) {
                        if (i4 < i3) {
                            try {
                                if (this.n[iR] >= j) {
                                    i3 = i4;
                                    break;
                                }
                                iR++;
                                if (iR == this.i) {
                                    iR = 0;
                                }
                                i4++;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else if (!z) {
                            i3 = -1;
                        }
                    }
                    j2 = j;
                    iL = i3;
                    oc7Var = this;
                } else {
                    int i5 = i2 - i;
                    oc7Var = this;
                    j2 = j;
                    iL = oc7Var.l(iR, i5, j2, true);
                }
                if (iL == -1) {
                    return false;
                }
                oc7Var.t = j2;
                oc7Var.s += iL;
                return true;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        th = th;
        throw th;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void D(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            defpackage.vy2.j(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc7.D(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e  */
    @Override // defpackage.cp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r14, int r16, int r17, int r18, defpackage.bp8 r19) {
        /*
            r13 = this;
            boolean r0 = r13.z
            if (r0 == 0) goto Lc
            androidx.media3.common.b r0 = r13.A
            defpackage.vy2.t(r0)
            r13.f(r0)
        Lc:
            r0 = r16 & 1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L14
            r4 = r3
            goto L15
        L14:
            r4 = r2
        L15:
            boolean r5 = r13.x
            if (r5 == 0) goto L1f
            if (r4 != 0) goto L1d
            goto La0
        L1d:
            r13.x = r2
        L1f:
            long r5 = r13.F
            long r5 = r5 + r14
            boolean r7 = r13.D
            if (r7 == 0) goto L4e
            long r7 = r13.t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2e
            goto La0
        L2e:
            if (r0 != 0) goto L4e
            boolean r0 = r13.E
            if (r0 != 0) goto L4b
            java.lang.String r0 = "SampleQueue"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Overriding unexpected non-sync sample for format: "
            r7.<init>(r8)
            androidx.media3.common.b r8 = r13.B
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.wn5.k0(r0, r7)
            r13.E = r3
        L4b:
            r0 = r16 | 1
            goto L50
        L4e:
            r0 = r16
        L50:
            boolean r7 = r13.G
            if (r7 == 0) goto La1
            if (r4 == 0) goto La0
            monitor-enter(r13)
            int r4 = r13.p     // Catch: java.lang.Throwable -> L65
            if (r4 != 0) goto L67
            long r7 = r13.u     // Catch: java.lang.Throwable -> L65
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L62
            goto L63
        L62:
            r3 = r2
        L63:
            monitor-exit(r13)
            goto L98
        L65:
            r0 = move-exception
            goto L9e
        L67:
            long r7 = r13.o()     // Catch: java.lang.Throwable -> L65
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 < 0) goto L72
            monitor-exit(r13)
            r3 = r2
            goto L98
        L72:
            int r4 = r13.p     // Catch: java.lang.Throwable -> L65
            int r7 = r4 + (-1)
            int r7 = r13.r(r7)     // Catch: java.lang.Throwable -> L65
        L7a:
            int r8 = r13.s     // Catch: java.lang.Throwable -> L65
            if (r4 <= r8) goto L91
            long[] r8 = r13.n     // Catch: java.lang.Throwable -> L65
            r9 = r8[r7]     // Catch: java.lang.Throwable -> L65
            int r8 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r8 < 0) goto L91
            int r4 = r4 + (-1)
            int r7 = r7 + (-1)
            r8 = -1
            if (r7 != r8) goto L7a
            int r7 = r13.i     // Catch: java.lang.Throwable -> L65
            int r7 = r7 - r3
            goto L7a
        L91:
            int r7 = r13.q     // Catch: java.lang.Throwable -> L65
            int r7 = r7 + r4
            r13.k(r7)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r13)
        L98:
            if (r3 != 0) goto L9b
            goto La0
        L9b:
            r13.G = r2
            goto La1
        L9e:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L65
            throw r0
        La0:
            return
        La1:
            lc7 r2 = r13.a
            long r2 = r2.g
            r7 = r17
            long r8 = (long) r7
            long r2 = r2 - r8
            r4 = r18
            long r8 = (long) r4
            long r2 = r2 - r8
            r11 = r5
            r5 = r2
            r2 = r11
            r1 = r13
            r8 = r19
            r4 = r0
            r1.g(r2, r4, r5, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc7.a(long, int, int, int, bp8):void");
    }

    @Override // defpackage.cp8
    public final void b(h26 h26Var, int i, int i2) {
        while (true) {
            lc7 lc7Var = this.a;
            if (i <= 0) {
                lc7Var.getClass();
                return;
            }
            int iC = lc7Var.c(i);
            hg0 hg0Var = lc7Var.f;
            ud udVar = (ud) hg0Var.c;
            h26Var.h(udVar.a, ((int) (lc7Var.g - hg0Var.a)) + udVar.b, iC);
            i -= iC;
            long j = lc7Var.g + ((long) iC);
            lc7Var.g = j;
            hg0 hg0Var2 = lc7Var.f;
            if (j == hg0Var2.b) {
                lc7Var.f = (hg0) hg0Var2.d;
            }
        }
    }

    @Override // defpackage.cp8
    public final int c(ra1 ra1Var, int i, boolean z) throws EOFException {
        lc7 lc7Var = this.a;
        int iC = lc7Var.c(i);
        hg0 hg0Var = lc7Var.f;
        ud udVar = (ud) hg0Var.c;
        int i2 = ra1Var.read(udVar.a, ((int) (lc7Var.g - hg0Var.a)) + udVar.b, iC);
        if (i2 == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = lc7Var.g + ((long) i2);
        lc7Var.g = j;
        hg0 hg0Var2 = lc7Var.f;
        if (j == hg0Var2.b) {
            lc7Var.f = (hg0) hg0Var2.d;
        }
        return i2;
    }

    @Override // defpackage.cp8
    public final void d(int i, h26 h26Var) {
        b(h26Var, i, 0);
    }

    @Override // defpackage.cp8
    public final int e(ra1 ra1Var, int i, boolean z) {
        return c(ra1Var, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:4:0x000a, B:8:0x0016, B:13:0x0028, B:15:0x0041, B:19:0x005b, B:18:0x0059), top: B:29:0x000a }] */
    /* JADX WARN: Type inference failed for: r5v26, types: [java.lang.Object, nc7] */
    @Override // defpackage.cp8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(androidx.media3.common.b r5) {
        /*
            r4 = this;
            androidx.media3.common.b r0 = r4.m(r5)
            r1 = 0
            r4.z = r1
            r4.A = r5
            monitor-enter(r4)
            r4.y = r1     // Catch: java.lang.Throwable -> L57
            androidx.media3.common.b r5 = r4.B     // Catch: java.lang.Throwable -> L57
            boolean r5 = j$.util.Objects.equals(r0, r5)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L16
            monitor-exit(r4)
            goto L6e
        L16:
            pg r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L57
            r2 = 1
            if (r5 != 0) goto L25
            r5 = r2
            goto L26
        L25:
            r5 = r1
        L26:
            if (r5 != 0) goto L59
            pg r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r3 = r3 - r2
            java.lang.Object r5 = r5.valueAt(r3)     // Catch: java.lang.Throwable -> L57
            mc7 r5 = (defpackage.mc7) r5     // Catch: java.lang.Throwable -> L57
            androidx.media3.common.b r5 = r5.a     // Catch: java.lang.Throwable -> L57
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> L57
            if (r5 == 0) goto L59
            pg r5 = r4.c     // Catch: java.lang.Throwable -> L57
            java.lang.Object r5 = r5.c     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r5 = (android.util.SparseArray) r5     // Catch: java.lang.Throwable -> L57
            int r0 = r5.size()     // Catch: java.lang.Throwable -> L57
            int r0 = r0 - r2
            java.lang.Object r5 = r5.valueAt(r0)     // Catch: java.lang.Throwable -> L57
            mc7 r5 = (defpackage.mc7) r5     // Catch: java.lang.Throwable -> L57
            androidx.media3.common.b r5 = r5.a     // Catch: java.lang.Throwable -> L57
            r4.B = r5     // Catch: java.lang.Throwable -> L57
            goto L5b
        L57:
            r5 = move-exception
            goto L78
        L59:
            r4.B = r0     // Catch: java.lang.Throwable -> L57
        L5b:
            boolean r5 = r4.D     // Catch: java.lang.Throwable -> L57
            androidx.media3.common.b r0 = r4.B     // Catch: java.lang.Throwable -> L57
            java.lang.String r3 = r0.n     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = r0.k     // Catch: java.lang.Throwable -> L57
            boolean r0 = defpackage.tv4.a(r3, r0)     // Catch: java.lang.Throwable -> L57
            r5 = r5 & r0
            r4.D = r5     // Catch: java.lang.Throwable -> L57
            r4.E = r1     // Catch: java.lang.Throwable -> L57
            monitor-exit(r4)
            r1 = r2
        L6e:
            java.lang.Object r5 = r4.f
            if (r5 == 0) goto L77
            if (r1 == 0) goto L77
            r5.r()
        L77:
            return
        L78:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L57
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc7.f(androidx.media3.common.b):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:5:0x0007, B:9:0x001d, B:12:0x0024, B:16:0x002c, B:21:0x0067, B:44:0x00e3, B:46:0x00ec, B:23:0x0082, B:25:0x008b, B:27:0x0094, B:29:0x00a9, B:33:0x00b2, B:34:0x00b7, B:36:0x00bd, B:40:0x00cb, B:42:0x00d0, B:43:0x00e0, B:26:0x0092), top: B:51:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, defpackage.bp8 r15) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc7.g(long, int, long, int, bp8):void");
    }

    public final long h(int i) {
        this.u = Math.max(this.u, p(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        pg pgVar = this.c;
        SparseArray sparseArray = (SparseArray) pgVar.c;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((y45) pgVar.d).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = pgVar.b;
            if (i8 > 0) {
                pgVar.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        int i10 = i9 - 1;
        return this.k[i10] + ((long) this.l[i10]);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(boolean r12, boolean r13, long r14) throws java.lang.Throwable {
        /*
            r11 = this;
            lc7 r0 = r11.a
            monitor-enter(r11)
            int r1 = r11.p     // Catch: java.lang.Throwable -> L38
            r2 = -1
            if (r1 == 0) goto L13
            long[] r4 = r11.n     // Catch: java.lang.Throwable -> L38
            int r6 = r11.r     // Catch: java.lang.Throwable -> L38
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L38
            int r4 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r4 >= 0) goto L15
        L13:
            r5 = r11
            goto L3b
        L15:
            if (r13 == 0) goto L1d
            int r13 = r11.s     // Catch: java.lang.Throwable -> L22
            if (r13 == r1) goto L1d
            int r1 = r13 + 1
        L1d:
            r5 = r11
            r10 = r12
            r8 = r14
            r7 = r1
            goto L26
        L22:
            r0 = move-exception
            r12 = r0
            r5 = r11
            goto L40
        L26:
            int r12 = r5.l(r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L35
            r13 = -1
            if (r12 != r13) goto L2f
            monitor-exit(r11)
            goto L3c
        L2f:
            long r2 = r11.h(r12)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r11)
            goto L3c
        L35:
            r0 = move-exception
        L36:
            r12 = r0
            goto L40
        L38:
            r0 = move-exception
            r5 = r11
            goto L36
        L3b:
            monitor-exit(r11)
        L3c:
            r0.b(r2)
            return
        L40:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L35
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc7.i(boolean, boolean, long):void");
    }

    public final void j() {
        long jH;
        lc7 lc7Var = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        lc7Var.b(jH);
    }

    public final long k(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        vy2.j(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, p(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        pg pgVar = this.c;
        SparseArray sparseArray = (SparseArray) pgVar.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((y45) pgVar.d).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        pgVar.b = sparseArray.size() > 0 ? Math.min(pgVar.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        int iR = r(i6 - 1);
        return this.k[iR] + ((long) this.l[iR]);
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public b m(b bVar) {
        if (this.F == 0 || bVar.s == Long.MAX_VALUE) {
            return bVar;
        }
        rj2 rj2VarA = bVar.a();
        rj2VarA.r = bVar.s + this.F;
        return new b(rj2VarA);
    }

    public final synchronized long n() {
        return this.v;
    }

    public final synchronized long o() {
        return Math.max(this.u, p(this.s));
    }

    public final long p(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iR = r(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iR]);
            if ((this.m[iR] & 1) != 0) {
                return jMax;
            }
            iR--;
            if (iR == -1) {
                iR = this.i - 1;
            }
        }
        return jMax;
    }

    public final int q() {
        return this.q + this.s;
    }

    public final int r(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int s(long j, boolean z) throws Throwable {
        try {
            try {
                int iR = r(this.s);
                int i = this.s;
                int i2 = this.p;
                if (!(i != i2) || j < this.n[iR]) {
                    return 0;
                }
                if (j > this.v && z) {
                    return i2 - i;
                }
                int iL = l(iR, i2 - i, j, true);
                if (iL == -1) {
                    return 0;
                }
                return iL;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        throw th;
    }

    public final synchronized b t() {
        return this.y ? null : this.B;
    }

    public final synchronized boolean u(boolean z) {
        b bVar;
        boolean z2 = false;
        if (this.s != this.p) {
            if (((mc7) this.c.i(q())).a != this.g) {
                return true;
            }
            return v(r(this.s));
        }
        if (z || this.w || ((bVar = this.B) != null && bVar != this.g)) {
            z2 = true;
        }
        return z2;
    }

    public final boolean v(int i) {
        pw1 pw1Var = this.h;
        if (pw1Var == null || pw1Var.getState() == 4) {
            return true;
        }
        return (this.m[i] & 1073741824) == 0 && this.h.b();
    }

    public final void w(b bVar, hh2 hh2Var) {
        b bVar2;
        b bVar3 = this.g;
        boolean z = bVar3 == null;
        DrmInitData drmInitData = bVar3 == null ? null : bVar3.r;
        this.g = bVar;
        DrmInitData drmInitData2 = bVar.r;
        vw1 vw1Var = this.d;
        if (vw1Var != null) {
            int iL = vw1Var.l(bVar);
            rj2 rj2VarA = bVar.a();
            rj2VarA.N = iL;
            bVar2 = new b(rj2VarA);
        } else {
            bVar2 = bVar;
        }
        hh2Var.c = bVar2;
        hh2Var.b = this.h;
        if (vw1Var == null) {
            return;
        }
        if (z || !Objects.equals(drmInitData, drmInitData2)) {
            pw1 pw1Var = this.h;
            sw1 sw1Var = this.e;
            pw1 pw1VarI = vw1Var.i(sw1Var, bVar);
            this.h = pw1VarI;
            hh2Var.b = pw1VarI;
            if (pw1Var != null) {
                pw1Var.c(sw1Var);
            }
        }
    }

    public final synchronized long x() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return this.s != this.p ? this.j[r(this.s)] : this.C;
    }

    public final int y(hh2 hh2Var, fc1 fc1Var, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        tn0 tn0Var = this.b;
        synchronized (this) {
            try {
                fc1Var.f = false;
                i2 = -3;
                if (this.s != this.p) {
                    b bVar = ((mc7) this.c.i(q())).a;
                    if (!z2 && bVar == this.g) {
                        int iR = r(this.s);
                        if (v(iR)) {
                            fc1Var.b = this.m[iR];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                fc1Var.b(536870912);
                            }
                            fc1Var.g = this.n[iR];
                            tn0Var.a = this.l[iR];
                            tn0Var.b = this.k[iR];
                            tn0Var.c = this.o[iR];
                            i2 = -4;
                        } else {
                            fc1Var.f = true;
                        }
                    }
                    w(bVar, hh2Var);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        b bVar2 = this.B;
                        if (bVar2 == null || (!z2 && bVar2 == this.g)) {
                        }
                        w(bVar2, hh2Var);
                        i2 = -5;
                    }
                    fc1Var.b = 4;
                    fc1Var.g = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !fc1Var.d(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    lc7 lc7Var = this.a;
                    lc7.f(lc7Var.e, fc1Var, this.b, lc7Var.c);
                } else {
                    lc7 lc7Var2 = this.a;
                    lc7Var2.e = lc7.f(lc7Var2.e, fc1Var, this.b, lc7Var2.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void z(boolean z) {
        lc7 lc7Var = this.a;
        lc7Var.a(lc7Var.d);
        hg0 hg0Var = lc7Var.d;
        int i = lc7Var.b;
        vy2.s(((ud) hg0Var.c) == null);
        hg0Var.a = 0L;
        hg0Var.b = i;
        hg0 hg0Var2 = lc7Var.d;
        lc7Var.e = hg0Var2;
        lc7Var.f = hg0Var2;
        lc7Var.g = 0L;
        lc7Var.a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        pg pgVar = this.c;
        SparseArray sparseArray = (SparseArray) pgVar.c;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((y45) pgVar.d).accept(sparseArray.valueAt(i2));
        }
        pgVar.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }
}
