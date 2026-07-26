package androidx.compose.ui.node;

import defpackage.b96;
import defpackage.bp2;
import defpackage.c96;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.ew;
import defpackage.fl4;
import defpackage.js3;
import defpackage.l14;
import defpackage.o40;
import defpackage.pu;
import defpackage.qc9;
import defpackage.rb5;
import defpackage.rd;
import defpackage.rn3;
import defpackage.sb5;
import defpackage.sc3;
import defpackage.sd;
import defpackage.tx8;
import defpackage.v04;
import defpackage.v49;
import defpackage.we4;
import defpackage.xe4;
import defpackage.yb;
import defpackage.zy4;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends b96 implements fl4, zy4 {
    public static final dp2 o = new dp2() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
        @Override // defpackage.dp2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r17) {
            /*
                r16 = this;
                r1 = r17
                c96 r1 = (defpackage.c96) r1
                boolean r0 = r1.p()
                if (r0 == 0) goto L72
                androidx.compose.ui.node.j r0 = r1.b
                boolean r2 = r0.k
                if (r2 == 0) goto L11
                goto L72
            L11:
                dl4 r2 = r1.a
                dp2 r6 = r2.e()
                rb5 r2 = r0.n
                if (r6 != 0) goto L66
                if (r2 == 0) goto L72
                java.lang.Object[] r1 = r2.c
                long[] r3 = r2.a
                int r4 = r3.length
                int r4 = r4 + (-2)
                if (r4 < 0) goto L62
                r5 = 0
                r6 = r5
            L28:
                r7 = r3[r6]
                long r9 = ~r7
                r11 = 7
                long r9 = r9 << r11
                long r9 = r9 & r7
                r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r9 = r9 & r11
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 == 0) goto L5d
                int r9 = r6 - r4
                int r9 = ~r9
                int r9 = r9 >>> 31
                r10 = 8
                int r9 = 8 - r9
                r11 = r5
            L42:
                if (r11 >= r9) goto L5b
                r12 = 255(0xff, double:1.26E-321)
                long r12 = r12 & r7
                r14 = 128(0x80, double:6.3E-322)
                int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r12 >= 0) goto L57
                int r12 = r6 << 3
                int r12 = r12 + r11
                r12 = r1[r12]
                sb5 r12 = (defpackage.sb5) r12
                r0.w0(r12)
            L57:
                long r7 = r7 >> r10
                int r11 = r11 + 1
                goto L42
            L5b:
                if (r9 != r10) goto L62
            L5d:
                if (r6 == r4) goto L62
                int r6 = r6 + 1
                goto L28
            L62:
                r2.a()
                goto L72
            L66:
                r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
                r4 = 0
                r0.k0(r1, r2, r4)
                r0.g = r6
            L72:
                tx8 r0 = defpackage.tx8.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1.invoke(java.lang.Object):java.lang.Object");
        }
    };
    public we4 f;
    public dp2 g;
    public c96 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final xe4 l = new xe4(0, this);
    public yb m;
    public rb5 n;

    public static void v0(m mVar) {
        l14 l14Var;
        m mVar2 = mVar.r;
        h hVar = mVar.p;
        if (!js3.i(mVar2 != null ? mVar2.p : null, hVar)) {
            hVar.t().p.w.g();
            return;
        }
        sd sdVarG = hVar.t().p.g();
        if (sdVarG == null || (l14Var = ((l) sdVarG).w) == null) {
            return;
        }
        l14Var.g();
    }

    @Override // defpackage.el4
    public final dl4 D(int i, int i2, Map map, dp2 dp2Var) {
        return Z(i, i2, map, null, dp2Var);
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.es3
    public boolean Q() {
        return false;
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.el4
    public final dl4 Z(int i, int i2, Map map, dp2 dp2Var, dp2 dp2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            rn3.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new pu(i, i2, map, dp2Var, dp2Var2, this, 1);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(androidx.compose.ui.node.h r32, defpackage.sc3 r33) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.j.e0(androidx.compose.ui.node.h, sc3):void");
    }

    @Override // defpackage.fl4
    public abstract h f0();

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    public abstract int i0(rd rdVar);

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k0(final c96 c96Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        h hVar;
        boolean z2;
        int i;
        char c2;
        long j6;
        p snapshotObserver;
        rb5 rb5Var = this.n;
        yb ybVar = this.m;
        if (ybVar == null) {
            ybVar = new yb();
            this.m = ybVar;
        }
        yb ybVar2 = ybVar;
        Owner owner = f0().p;
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.a.d(c96Var, o, new bp2() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    dp2 dp2Var = j.o;
                    j jVar = this.g;
                    jVar.u0().a = false;
                    jVar.u0().b = j;
                    jVar.u0().c = j2;
                    dp2 dp2VarE = c96Var.a.e();
                    if (dp2VarE != null) {
                        dp2VarE.invoke(jVar.u0());
                    }
                    return tx8.a;
                }
            });
        }
        boolean zQ = Q();
        sb5 sb5Var = (sb5) ybVar2.e;
        sb5 sb5Var2 = (sb5) ybVar2.f;
        int i2 = ybVar2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) ybVar2.d)[i3];
            if (b == 3) {
                sc3 sc3Var = ((sc3[]) ybVar2.b)[i3];
                js3.m(sc3Var);
                sb5Var2.k(sc3Var);
            } else if (b != 0 && rb5Var != null) {
                sc3 sc3Var2 = ((sc3[]) ybVar2.b)[i3];
                js3.m(sc3Var2);
                sb5 sb5Var3 = (sb5) rb5Var.k(sc3Var2);
                if (sb5Var3 != null) {
                    sb5Var.j(sb5Var3);
                }
            }
        }
        int i4 = ybVar2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) ybVar2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                sc3[] sc3VarArr = (sc3[]) ybVar2.b;
                sc3VarArr[i6 - i5] = sc3VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = ybVar2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((sc3[]) ybVar2.b)[i8] = null;
        }
        ybVar2.a -= i5;
        j jVarS0 = s0();
        Object[] objArr = sb5Var2.b;
        long[] jArr = sb5Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            sc3 sc3Var3 = (sc3) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            j jVar = jVarS0 == null ? this : jVarS0;
                            i = i9;
                            j jVar2 = jVar;
                            while (true) {
                                yb ybVar3 = jVar2.m;
                                if (ybVar3 != null) {
                                    z2 = zQ;
                                    if (!ew.t0((sc3[]) ybVar3.b, sc3Var3)) {
                                        break;
                                        break;
                                    }
                                    break;
                                }
                                z2 = zQ;
                                j jVarS02 = jVar2.s0();
                                if (jVarS02 == null) {
                                    break;
                                }
                                jVar2 = jVarS02;
                                zQ = z2;
                            }
                            rb5 rb5Var2 = jVar2.n;
                            sb5 sb5Var4 = rb5Var2 != null ? (sb5) rb5Var2.k(sc3Var3) : null;
                            if (sb5Var4 != null) {
                                jVar.w0(sb5Var4);
                            }
                        } else {
                            z2 = zQ;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zQ = z2;
                    }
                    z = zQ;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zQ;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zQ = z;
                i9 = 8;
            }
        } else {
            z = zQ;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        sb5Var2.e();
        Object[] objArr2 = sb5Var.b;
        long[] jArr2 = sb5Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (hVar = (h) ((qc9) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                hVar.p0(false);
                            } else {
                                hVar.r0(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        sb5Var.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m0(defpackage.dl4 r15) {
        /*
            r14 = this;
            rb5 r0 = r14.n
            boolean r1 = r14.k
            if (r1 == 0) goto L9
        L6:
            r1 = r14
            goto Lbe
        L9:
            dp2 r1 = r15.e()
            r2 = 0
            if (r1 != 0) goto L5a
            if (r0 == 0) goto L6
            java.lang.Object[] r15 = r0.c
            long[] r1 = r0.a
            int r3 = r1.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = r2
        L1c:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L51
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L36:
            if (r9 >= r7) goto L4f
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4b
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r15[r10]
            sb5 r10 = (defpackage.sb5) r10
            r14.w0(r10)
        L4b:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L36
        L4f:
            if (r7 != r8) goto L56
        L51:
            if (r4 == r3) goto L56
            int r4 = r4 + 1
            goto L1c
        L56:
            r0.a()
            return
        L5a:
            dp2 r0 = r14.g
            r3 = 1
            if (r0 == r1) goto L61
            r0 = r3
            goto L62
        L61:
            r0 = r2
        L62:
            r4 = 0
            if (r0 != 0) goto L9b
            we4 r1 = r14.u0()
            boolean r1 = r1.a
            if (r1 == 0) goto L9b
            v04 r0 = r14.p0()
            long r4 = r0.q(r4)
            long r4 = defpackage.is3.I(r4)
            long r0 = r0.k()
            we4 r6 = r14.u0()
            long r6 = r6.b
            boolean r6 = defpackage.rq3.a(r4, r6)
            if (r6 == 0) goto L96
            we4 r6 = r14.u0()
            long r6 = r6.c
            boolean r6 = defpackage.zq3.b(r0, r6)
            if (r6 != 0) goto L97
        L96:
            r2 = r3
        L97:
            r3 = r4
            r5 = r0
            r0 = r2
            goto La2
        L9b:
            r1 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            r5 = r4
            r3 = r1
        La2:
            if (r0 == 0) goto L6
            c96 r0 = r14.h
            if (r0 == 0) goto Lad
            r0.a = r15
        Laa:
            r1 = r14
            r2 = r0
            goto Lb5
        Lad:
            c96 r0 = new c96
            r0.<init>(r15, r14)
            r14.h = r0
            goto Laa
        Lb5:
            r1.k0(r2, r3, r5)
            dp2 r15 = r15.e()
            r1.g = r15
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.j.m0(dl4):void");
    }

    public final int n0(rd rdVar) {
        int iI0;
        if (q0() && (iI0 = i0(rdVar)) != Integer.MIN_VALUE) {
            return iI0 + ((int) (rdVar instanceof v49 ? this.e >> 32 : this.e & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    public abstract j o0();

    public abstract v04 p0();

    public abstract boolean q0();

    public abstract dl4 r0();

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }

    public abstract j s0();

    public abstract long t0();

    public final we4 u0() {
        we4 we4Var = this.f;
        if (we4Var != null) {
            return we4Var;
        }
        we4 we4Var2 = new we4(this);
        this.f = we4Var2;
        return we4Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w0(sb5 sb5Var) {
        h hVar;
        Object[] objArr = sb5Var.b;
        long[] jArr = sb5Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (hVar = (h) ((qc9) objArr[(i << 3) + i3]).get()) != null) {
                        if (Q()) {
                            hVar.p0(false);
                        } else {
                            hVar.r0(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.zy4
    public final void x(boolean z) {
        j jVarS0 = s0();
        h hVarF0 = jVarS0 != null ? jVarS0.f0() : null;
        if (js3.i(hVarF0, f0())) {
            this.i = z;
            return;
        }
        if ((hVarF0 != null ? hVarF0.v() : null) != LayoutNode$LayoutState.c) {
            if ((hVarF0 != null ? hVarF0.v() : null) != LayoutNode$LayoutState.d) {
                return;
            }
        }
        this.i = z;
    }

    public abstract void x0();
}
