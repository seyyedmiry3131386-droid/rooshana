package defpackage;

import android.os.Trace;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.runtime.internal.a;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class qz0 {
    public int A;
    public int B;
    public boolean C;
    public final pz0 D;
    public final ArrayList E;
    public boolean F;
    public bz7 G;
    public cz7 H;
    public fz7 I;
    public boolean J;
    public j56 K;
    public uo0 L;
    public final kz0 M;
    public ge N;
    public pd2 O;
    public lv7 P;
    public final h01 Q;
    public final w61 R;
    public boolean S;
    public long T;
    public g01 U;
    public final sk6 a;
    public final d01 b;
    public final cz7 c;
    public final tb5 d;
    public final uo0 e;
    public final uo0 f;
    public final r79 g;
    public final j01 h;
    public o46 j;
    public int k;
    public int l;
    public int m;
    public int[] o;
    public wa5 p;
    public boolean q;
    public boolean r;
    public ya5 v;
    public boolean w;
    public boolean y;
    public final ArrayList i = new ArrayList();
    public final ar3 n = new ar3();
    public final ArrayList s = new ArrayList();
    public final ar3 t = new ar3();
    public j56 u = i56.d;
    public final ar3 x = new ar3();
    public int z = -1;

    public qz0(sk6 sk6Var, d01 d01Var, cz7 cz7Var, tb5 tb5Var, uo0 uo0Var, uo0 uo0Var2, r79 r79Var, j01 j01Var) {
        this.a = sk6Var;
        this.b = d01Var;
        this.c = cz7Var;
        this.d = tb5Var;
        this.e = uo0Var;
        this.f = uo0Var2;
        this.g = r79Var;
        this.h = j01Var;
        this.C = d01Var.g() || d01Var.e();
        this.D = new pz0(0, this);
        this.E = new ArrayList();
        bz7 bz7VarD = cz7Var.d();
        bz7VarD.c();
        this.G = bz7VarD;
        cz7 cz7Var2 = new cz7();
        if (d01Var.g()) {
            cz7Var2.c();
        }
        if (d01Var.e()) {
            cz7Var2.k = new ya5();
        }
        this.H = cz7Var2;
        fz7 fz7VarE = cz7Var2.e();
        fz7VarE.e(true);
        this.I = fz7VarE;
        this.M = new kz0(this, uo0Var);
        bz7 bz7VarD2 = this.H.d();
        try {
            ge geVarA = bz7VarD2.a(0);
            bz7VarD2.c();
            this.N = geVarA;
            this.O = new pd2();
            this.Q = new h01(this);
            w61 w61VarK = d01Var.k();
            w61 w61VarA = A();
            this.R = w61VarK.l0(w61VarA == null ? EmptyCoroutineContext.a : w61VarA);
        } catch (Throwable th) {
            bz7VarD2.c();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.lz4 O(int r13, defpackage.qz0 r14) {
        /*
            bz7 r0 = r14.G
            int r0 = r0.i(r13)
            bz7 r1 = r14.G
            int[] r2 = r1.b
            java.lang.Object r1 = r1.p(r2, r13)
            r2 = 126665345(0x78cc281, float:2.1179178E-34)
            r3 = 0
            if (r0 != r2) goto L96
            boolean r0 = r1 instanceof defpackage.jz4
            if (r0 == 0) goto L96
            bz7 r0 = r14.G
            boolean r0 = r0.d(r13)
            if (r0 == 0) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            P(r14, r0, r13)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L30
            r12 = r0
            goto L31
        L30:
            r12 = r3
        L31:
            bz7 r0 = r14.G
            int[] r1 = r0.b
            java.lang.Object r0 = r0.p(r1, r13)
            java.lang.String r1 = "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>"
            defpackage.js3.n(r0, r1)
            r5 = r0
            jz4 r5 = (defpackage.jz4) r5
            bz7 r0 = r14.G
            r1 = 0
            java.lang.Object r6 = r0.h(r13, r1)
            bz7 r0 = r14.G
            ge r9 = r0.a(r13)
            bz7 r0 = r14.G
            int[] r0 = r0.b
            int r1 = r13 * 5
            int r1 = r1 + 3
            r0 = r0[r1]
            int r0 = r0 + r13
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r1 = r14.s
            int r2 = defpackage.xq2.s(r13, r1)
            if (r2 >= 0) goto L69
            int r2 = r2 + 1
            int r2 = -r2
        L69:
            int r3 = r1.size()
            if (r2 >= r3) goto L88
            java.lang.Object r3 = r1.get(r2)
            vs3 r3 = (defpackage.vs3) r3
            int r4 = r3.b
            if (r4 >= r0) goto L88
            my6 r4 = r3.a
            java.lang.Object r3 = r3.c
            kotlin.Pair r7 = new kotlin.Pair
            r7.<init>(r4, r3)
            r10.add(r7)
            int r2 = r2 + 1
            goto L69
        L88:
            lz4 r4 = new lz4
            j01 r7 = r14.h
            cz7 r8 = r14.c
            j56 r11 = r14.m(r13)
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L96:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.O(int, qz0):lz4");
    }

    public static final void P(qz0 qz0Var, ArrayList arrayList, int i) {
        int i2 = qz0Var.G.b[(i * 5) + 3] + i;
        int i3 = i + 1;
        while (i3 < i2) {
            if (qz0Var.G.j(i3)) {
                lz4 lz4VarO = O(i3, qz0Var);
                if (lz4VarO != null) {
                    arrayList.add(lz4VarO);
                }
            } else if (qz0Var.G.d(i3)) {
                P(qz0Var, arrayList, i3);
            }
            i3 += qz0Var.G.b[(i3 * 5) + 3];
        }
    }

    public static final int Q(qz0 qz0Var, int i, int i2, boolean z, int i3) {
        bz7 bz7Var = qz0Var.G;
        d01 d01Var = qz0Var.b;
        kz0 kz0Var = qz0Var.M;
        boolean zJ = bz7Var.j(i2);
        int[] iArr = bz7Var.b;
        if (zJ) {
            int i4 = bz7Var.i(i2);
            Object objP = bz7Var.p(iArr, i2);
            if (i4 == 126665345 && (objP instanceof jz4)) {
                lz4 lz4VarO = O(i2, qz0Var);
                if (lz4VarO != null) {
                    d01Var.c(lz4VarO);
                    kz0Var.e();
                    j01 j01Var = qz0Var.h;
                    d01 d01Var2 = qz0Var.b;
                    mv5 mv5Var = kz0Var.b.g;
                    mv5Var.D0(xu5.d);
                    xq2.I(mv5Var, j01Var, d01Var2, lz4VarO);
                }
                if (!z || i2 == i) {
                    return bz7Var.o(i2);
                }
                kz0Var.c();
                kz0Var.b();
                qz0 qz0Var2 = kz0Var.a;
                int iO = qz0Var2.G.l(i2) ? 1 : qz0Var2.G.o(i2);
                if (iO > 0) {
                    kz0Var.f(i3, iO);
                }
                return 0;
            }
            if (i4 == 206 && js3.i(objP, sz0.e)) {
                Object objH = bz7Var.h(i2, 0);
                n37 n37Var = objH instanceof n37 ? (n37) objH : null;
                m37 m37Var = n37Var != null ? n37Var.a : null;
                oz0 oz0Var = m37Var instanceof oz0 ? (oz0) m37Var : null;
                if (oz0Var != null) {
                    for (qz0 qz0Var3 : oz0Var.a.e) {
                        cz7 cz7Var = qz0Var3.c;
                        if (cz7Var.b > 0 && (cz7Var.a[1] & 67108864) != 0) {
                            j01 j01Var2 = qz0Var3.h;
                            synchronized (j01Var2.d) {
                                j01Var2.s();
                                rb5 rb5Var = j01Var2.n;
                                j01Var2.n = b47.b();
                                try {
                                    j01Var2.v.h0(rb5Var);
                                } finally {
                                }
                            }
                            uo0 uo0Var = new uo0();
                            qz0Var3.L = uo0Var;
                            bz7 bz7VarD = qz0Var3.c.d();
                            try {
                                qz0Var3.G = bz7VarD;
                                kz0 kz0Var2 = qz0Var3.M;
                                uo0 uo0Var2 = kz0Var2.b;
                                try {
                                    kz0Var2.b = uo0Var;
                                    qz0Var3.N(0);
                                    kz0 kz0Var3 = qz0Var3.M;
                                    kz0Var3.b();
                                    if (kz0Var3.c) {
                                        kz0Var3.b.g.D0(ev5.d);
                                        if (kz0Var3.c) {
                                            kz0Var3.d(false);
                                            kz0Var3.d(false);
                                            kz0Var3.b.g.D0(nu5.d);
                                            kz0Var3.c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                bz7VarD.c();
                            }
                        }
                        d01Var.u(qz0Var3.h);
                    }
                }
                return bz7Var.o(i2);
            }
            if (!bz7Var.l(i2)) {
                return bz7Var.o(i2);
            }
        } else if (bz7Var.d(i2)) {
            int i5 = iArr[(i2 * 5) + 3] + i2;
            int iQ = 0;
            for (int i6 = i2 + 1; i6 < i5; i6 += iArr[(i6 * 5) + 3]) {
                boolean zL = bz7Var.l(i6);
                if (zL) {
                    kz0Var.c();
                    Object objN = bz7Var.n(i6);
                    kz0Var.c();
                    kz0Var.h.add(objN);
                }
                iQ += Q(qz0Var, i, i6, zL || z, zL ? 0 : i3 + iQ);
                if (zL) {
                    kz0Var.c();
                    kz0Var.a();
                }
            }
            if (!bz7Var.l(i2)) {
                return iQ;
            }
        } else if (!bz7Var.l(i2)) {
            return bz7Var.o(i2);
        }
        return 1;
    }

    public final h01 A() {
        if (this.b.l()) {
            return this.Q;
        }
        return null;
    }

    public final boolean B() {
        my6 my6VarY;
        return (this.S || this.y || this.w || (my6VarY = y()) == null || (my6VarY.b & 8) != 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x012c A[Catch: all -> 0x00b0, TryCatch #5 {all -> 0x00b0, blocks: (B:3:0x000c, B:5:0x001c, B:7:0x004f, B:9:0x0057, B:11:0x005d, B:12:0x0062, B:13:0x0065, B:24:0x00a4, B:85:0x0202, B:31:0x00ba, B:32:0x00bd, B:33:0x00be, B:35:0x00c6, B:38:0x00cd, B:40:0x00d5, B:41:0x00da, B:45:0x00e4, B:47:0x00f1, B:52:0x0111, B:53:0x0113, B:55:0x0123, B:57:0x012c, B:59:0x0137, B:61:0x0148, B:63:0x014e, B:65:0x0161, B:84:0x01ff, B:116:0x0253, B:117:0x0256, B:119:0x0258, B:120:0x025b, B:48:0x00ff, B:44:0x00df, B:36:0x00c9, B:121:0x025c, B:54:0x011c), top: B:136:0x000c, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ed A[Catch: all -> 0x0216, TRY_LEAVE, TryCatch #8 {all -> 0x0216, blocks: (B:80:0x01e0, B:82:0x01ed, B:108:0x0242, B:109:0x0244), top: B:141:0x01e0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C(java.util.ArrayList r25) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.C(java.util.ArrayList):void");
    }

    public final void D(jz4 jz4Var, j56 j56Var, Object obj, boolean z) {
        Y(126665345, jz4Var);
        E();
        m0(obj);
        long j = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                fz7.z(this.I);
            }
            boolean z2 = (this.S || js3.i(this.G.f(), j56Var)) ? false : true;
            if (z2) {
                K(j56Var);
            }
            V(sz0.c, 202, j56Var, 0);
            this.K = null;
            if (!this.S || z) {
                boolean z3 = this.w;
                this.w = z2;
                vy2.I(this, new a(1436390959, new g8(jz4Var, obj), true));
                this.w = z3;
            } else {
                this.J = true;
                fz7 fz7Var = this.I;
                this.b.m(new lz4(jz4Var, obj, this.h, this.H, fz7Var.b(fz7Var.G(fz7Var.b, fz7Var.v)), EmptyList.a, l(), null));
            }
        } catch (Throwable th) {
            try {
                c26.P(th, new nz0(1, this));
                throw th;
            } finally {
                q(false);
                this.K = null;
                this.T = j;
                q(false);
            }
        }
    }

    public final Object E() {
        boolean z = this.S;
        av avVar = jz0.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof p87)) {
                return objM;
            }
        } else if (this.r) {
            sz0.a("A call to createNode(), emitNode() or useNode() expected");
            return avVar;
        }
        return avVar;
    }

    public final List F() {
        d01 d01Var = this.b;
        c01 c01VarI = d01Var.i();
        j01 j01Var = o40.O(c01VarI) ? (j01) c01VarI : null;
        if (j01Var == null) {
            return EmptyList.a;
        }
        cz7 cz7Var = j01Var.f;
        bz7 bz7VarD = cz7Var.d();
        try {
            Integer numJ = wn5.J(bz7VarD, d01Var, 0, bz7VarD.c);
            if (numJ == null) {
                return EmptyList.a;
            }
            bz7VarD = cz7Var.d();
            try {
                ArrayList arrayListH0 = wn5.h0(bz7VarD, numJ.intValue(), 0);
                bz7VarD.c();
                return kotlin.collections.a.z0(j01Var.v.F(), arrayListH0);
            } finally {
            }
        } finally {
        }
    }

    public final int G(int i) {
        int iQ = this.G.q(i) + 1;
        int i2 = 0;
        while (iQ < i) {
            if (!this.G.k(iQ)) {
                i2++;
            }
            iQ += ez7.a(this.G.b, iQ);
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0059 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #0 {all -> 0x0024, blocks: (B:3:0x0005, B:6:0x0012, B:8:0x0020, B:12:0x0029, B:11:0x0026, B:15:0x0030, B:18:0x0038, B:21:0x0040, B:23:0x0048, B:25:0x004e, B:26:0x0052, B:27:0x0053, B:29:0x0059, B:22:0x0044), top: B:34:0x0005, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object H(defpackage.j01 r9, defpackage.j01 r10, java.lang.Integer r11, java.util.List r12, defpackage.bp2 r13) {
        /*
            r8 = this;
            boolean r0 = r8.F
            int r1 = r8.k
            r2 = 1
            r8.F = r2     // Catch: java.lang.Throwable -> L24
            r2 = 0
            r8.k = r2     // Catch: java.lang.Throwable -> L24
            int r3 = r12.size()     // Catch: java.lang.Throwable -> L24
            r4 = r2
        Lf:
            r5 = 0
            if (r4 >= r3) goto L2c
            java.lang.Object r6 = r12.get(r4)     // Catch: java.lang.Throwable -> L24
            kotlin.Pair r6 = (kotlin.Pair) r6     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r6.a     // Catch: java.lang.Throwable -> L24
            my6 r7 = (defpackage.my6) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r6 = r6.b     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L26
            r8.g0(r7, r6)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r9 = move-exception
            goto L62
        L26:
            r8.g0(r7, r5)     // Catch: java.lang.Throwable -> L24
        L29:
            int r4 = r4 + 1
            goto Lf
        L2c:
            if (r9 == 0) goto L59
            if (r11 == 0) goto L35
            int r11 = r11.intValue()     // Catch: java.lang.Throwable -> L24
            goto L36
        L35:
            r11 = -1
        L36:
            if (r10 == 0) goto L53
            boolean r12 = r10.equals(r9)     // Catch: java.lang.Throwable -> L24
            if (r12 != 0) goto L53
            if (r11 < 0) goto L53
            r9.r = r10     // Catch: java.lang.Throwable -> L24
            r9.s = r11     // Catch: java.lang.Throwable -> L24
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L4d
            r9.r = r5     // Catch: java.lang.Throwable -> L24
            r9.s = r2     // Catch: java.lang.Throwable -> L24
            goto L57
        L4d:
            r10 = move-exception
            r9.r = r5     // Catch: java.lang.Throwable -> L24
            r9.s = r2     // Catch: java.lang.Throwable -> L24
            throw r10     // Catch: java.lang.Throwable -> L24
        L53:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L57:
            if (r10 != 0) goto L5d
        L59:
            java.lang.Object r10 = r13.invoke()     // Catch: java.lang.Throwable -> L24
        L5d:
            r8.F = r0
            r8.k = r1
            return r10
        L62:
            r8.F = r0
            r8.k = r1
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.H(j01, j01, java.lang.Integer, java.util.List, bp2):java.lang.Object");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I() {
        /*
            Method dump skipped, instruction units count: 884
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.I():void");
    }

    public final void J() {
        N(this.G.g);
        kz0 kz0Var = this.M;
        kz0Var.d(false);
        kz0Var.e();
        kz0Var.b.g.D0(av5.d);
        int i = kz0Var.f;
        bz7 bz7Var = kz0Var.a.G;
        kz0Var.f = bz7Var.b[(bz7Var.g * 5) + 3] + i;
    }

    public final void K(j56 j56Var) {
        ya5 ya5Var = this.v;
        if (ya5Var == null) {
            ya5Var = new ya5();
            this.v = ya5Var;
        }
        ya5Var.h(this.G.g, j56Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(int r7, int r8, int r9) {
        /*
            r6 = this;
            bz7 r0 = r6.G
            if (r7 != r8) goto L5
            goto L1a
        L5:
            if (r7 == r9) goto L6b
            if (r8 != r9) goto Lb
            goto L6b
        Lb:
            int r1 = r0.q(r7)
            if (r1 != r8) goto L14
            r9 = r8
            goto L6b
        L14:
            int r1 = r0.q(r8)
            if (r1 != r7) goto L1c
        L1a:
            r9 = r7
            goto L6b
        L1c:
            int r1 = r0.q(r7)
            int r2 = r0.q(r8)
            if (r1 != r2) goto L2b
            int r9 = r0.q(r7)
            goto L6b
        L2b:
            r1 = 0
            r2 = r7
            r3 = r1
        L2e:
            if (r2 <= 0) goto L39
            if (r2 == r9) goto L39
            int r2 = r0.q(r2)
            int r3 = r3 + 1
            goto L2e
        L39:
            r2 = r8
            r4 = r1
        L3b:
            if (r2 <= 0) goto L46
            if (r2 == r9) goto L46
            int r2 = r0.q(r2)
            int r4 = r4 + 1
            goto L3b
        L46:
            int r9 = r3 - r4
            r5 = r7
            r2 = r1
        L4a:
            if (r2 >= r9) goto L53
            int r5 = r0.q(r5)
            int r2 = r2 + 1
            goto L4a
        L53:
            int r4 = r4 - r3
            r9 = r8
        L55:
            if (r1 >= r4) goto L5e
            int r9 = r0.q(r9)
            int r1 = r1 + 1
            goto L55
        L5e:
            r1 = r9
            r9 = r5
        L60:
            if (r9 == r1) goto L6b
            int r9 = r0.q(r9)
            int r1 = r0.q(r1)
            goto L60
        L6b:
            if (r7 <= 0) goto L7f
            if (r7 == r9) goto L7f
            boolean r1 = r0.l(r7)
            if (r1 == 0) goto L7a
            kz0 r1 = r6.M
            r1.a()
        L7a:
            int r7 = r0.q(r7)
            goto L6b
        L7f:
            r6.p(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.L(int, int, int):void");
    }

    public final Object M() {
        boolean z = this.S;
        av avVar = jz0.a;
        if (!z) {
            Object objM = this.G.m();
            if (!this.y || (objM instanceof p87)) {
                return objM instanceof n37 ? ((n37) objM).a : objM;
            }
        } else if (this.r) {
            sz0.a("A call to createNode(), emitNode() or useNode() expected");
            return avVar;
        }
        return avVar;
    }

    public final void N(int i) {
        boolean zL = this.G.l(i);
        kz0 kz0Var = this.M;
        if (zL) {
            kz0Var.c();
            Object objN = this.G.n(i);
            kz0Var.c();
            kz0Var.h.add(objN);
        }
        Q(this, i, i, zL, 0);
        kz0Var.c();
        if (zL) {
            kz0Var.a();
        }
    }

    public final boolean R(int i, boolean z) {
        my6 my6VarY;
        if ((i & 1) == 0 && (this.S || this.y)) {
            lv7 lv7Var = this.P;
            if (lv7Var != null && (my6VarY = y()) != null && lv7Var.b()) {
                int i2 = my6VarY.b;
                if ((i2 & 512) != 0) {
                    return true;
                }
                int i3 = i2 | 1;
                my6VarY.b = i3;
                my6VarY.b = (this.y ? i2 | 129 : i3 & (-129)) | 256;
                mv5 mv5Var = this.M.b.g;
                mv5Var.D0(zu5.d);
                xq2.G(mv5Var, 0, my6VarY);
                this.b.t(my6VarY);
                return false;
            }
        } else if (!z && B()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S() {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.S():void");
    }

    public final void T() {
        bz7 bz7Var = this.G;
        int i = bz7Var.i;
        this.l = i >= 0 ? bz7Var.b[(i * 5) + 1] & 67108863 : 0;
        bz7Var.t();
    }

    public final void U() {
        if (this.l != 0) {
            sz0.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        my6 my6VarY = y();
        if (my6VarY != null) {
            int i = my6VarY.b;
            if ((i & 128) == 0) {
                my6VarY.b = i | 16;
            }
        }
        if (this.s.isEmpty()) {
            T();
        } else {
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(java.lang.Object r28, int r29, java.lang.Object r30, int r31) {
        /*
            Method dump skipped, instruction units count: 870
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.V(java.lang.Object, int, java.lang.Object, int):void");
    }

    public final void W() {
        V(null, -127, null, 0);
    }

    public final void X(int i, yt5 yt5Var) {
        V(yt5Var, i, null, 0);
    }

    public final void Y(int i, Object obj) {
        V(obj, i, null, 0);
    }

    public final void Z(Object obj, boolean z) {
        if (z) {
            bz7 bz7Var = this.G;
            if (bz7Var.k <= 0) {
                if ((bz7Var.b[(bz7Var.g * 5) + 1] & 1073741824) == 0) {
                    wi6.a("Expected a node group");
                }
                bz7Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            kz0 kz0Var = this.M;
            kz0Var.getClass();
            kz0Var.d(false);
            mv5 mv5Var = kz0Var.b.g;
            mv5Var.D0(hv5.d);
            xq2.G(mv5Var, 0, obj);
        }
        this.G.u();
    }

    public final void a() {
        i();
        this.i.clear();
        this.n.b = 0;
        this.t.b = 0;
        this.x.b = 0;
        this.v = null;
        pd2 pd2Var = this.O;
        pd2Var.h.z0();
        pd2Var.g.z0();
        this.T = 0;
        this.A = 0;
        this.r = false;
        this.S = false;
        this.y = false;
        this.F = false;
        this.z = -1;
        bz7 bz7Var = this.G;
        if (!bz7Var.f) {
            bz7Var.c();
        }
        if (this.I.w) {
            return;
        }
        w();
    }

    public final void a0(int i) {
        int i2;
        int i3;
        if (this.j != null) {
            V(null, i, null, 0);
            return;
        }
        if (this.r) {
            sz0.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ ((long) i), 3) ^ ((long) this.m);
        this.m++;
        bz7 bz7Var = this.G;
        boolean z = this.S;
        av avVar = jz0.a;
        if (z) {
            bz7Var.k++;
            this.I.S(i, avVar, avVar, false);
            v(false, null);
            return;
        }
        if (bz7Var.g() == i && ((i3 = bz7Var.g) >= bz7Var.h || (bz7Var.b[(i3 * 5) + 1] & 536870912) == 0)) {
            bz7Var.u();
            v(false, null);
            return;
        }
        if (bz7Var.k <= 0 && (i2 = bz7Var.g) != bz7Var.h) {
            int i4 = this.k;
            J();
            this.M.f(i4, bz7Var.s());
            xq2.j(i2, bz7Var.g, this.s);
        }
        bz7Var.k++;
        this.S = true;
        this.K = null;
        if (this.I.w) {
            fz7 fz7VarE = this.H.e();
            this.I = fz7VarE;
            fz7VarE.O();
            this.J = false;
            this.K = null;
        }
        fz7 fz7Var = this.I;
        fz7Var.d();
        int i5 = fz7Var.t;
        fz7Var.S(i, avVar, avVar, false);
        this.N = fz7Var.b(i5);
        v(false, null);
    }

    public final void b(qp2 qp2Var, Object obj) {
        if (this.S) {
            mv5 mv5Var = this.O.g;
            mv5Var.D0(iv5.d);
            xq2.G(mv5Var, 0, obj);
            js3.n(qp2Var, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            wu8.i(2, qp2Var);
            xq2.G(mv5Var, 1, qp2Var);
            return;
        }
        kz0 kz0Var = this.M;
        kz0Var.b();
        mv5 mv5Var2 = kz0Var.b.g;
        mv5Var2.D0(iv5.d);
        js3.n(qp2Var, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        wu8.i(2, qp2Var);
        xq2.H(mv5Var2, 0, obj, 1, qp2Var);
    }

    public final void b0(int i) {
        V(null, i, null, 0);
    }

    public final boolean c(float f) {
        Object objE = E();
        if ((objE instanceof Float) && f == ((Number) objE).floatValue()) {
            return false;
        }
        m0(Float.valueOf(f));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qz0 c0(int r7) {
        /*
            r6 = this;
            r6.a0(r7)
            boolean r7 = r6.S
            r79 r0 = r6.g
            java.util.ArrayList r1 = r6.E
            j01 r2 = r6.h
            if (r7 == 0) goto L26
            my6 r7 = new my6
            r7.<init>(r2)
            r1.add(r7)
            r6.m0(r7)
            int r1 = r6.B
            r7.e = r1
            int r1 = r7.b
            r1 = r1 & (-17)
            r7.b = r1
            r0.i()
            return r6
        L26:
            bz7 r7 = r6.G
            int r7 = r7.i
            java.util.ArrayList r3 = r6.s
            int r7 = defpackage.xq2.s(r7, r3)
            if (r7 < 0) goto L39
            java.lang.Object r7 = r3.remove(r7)
            vs3 r7 = (defpackage.vs3) r7
            goto L3a
        L39:
            r7 = 0
        L3a:
            bz7 r3 = r6.G
            java.lang.Object r3 = r3.m()
            av r4 = defpackage.jz0.a
            boolean r4 = defpackage.js3.i(r3, r4)
            if (r4 == 0) goto L51
            my6 r3 = new my6
            r3.<init>(r2)
            r6.m0(r3)
            goto L58
        L51:
            java.lang.String r2 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            defpackage.js3.n(r3, r2)
            my6 r3 = (defpackage.my6) r3
        L58:
            r2 = 0
            r4 = 1
            if (r7 != 0) goto L70
            int r7 = r3.b
            r5 = r7 & 64
            if (r5 == 0) goto L64
            r5 = r4
            goto L65
        L64:
            r5 = r2
        L65:
            if (r5 == 0) goto L6b
            r7 = r7 & (-65)
            r3.b = r7
        L6b:
            if (r5 == 0) goto L6e
            goto L70
        L6e:
            r7 = r2
            goto L71
        L70:
            r7 = r4
        L71:
            int r5 = r3.b
            if (r7 == 0) goto L78
            r7 = r5 | 8
            goto L7a
        L78:
            r7 = r5 & (-9)
        L7a:
            r3.b = r7
            r1.add(r3)
            int r7 = r6.B
            r3.e = r7
            int r7 = r3.b
            r7 = r7 & (-17)
            r3.b = r7
            r0.i()
            int r7 = r3.b
            r0 = r7 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto Lb6
            r7 = r7 & (-257(0xfffffffffffffeff, float:NaN))
            r7 = r7 | 512(0x200, float:7.17E-43)
            r3.b = r7
            kz0 r7 = r6.M
            uo0 r7 = r7.b
            mv5 r7 = r7.g
            fv5 r0 = defpackage.fv5.d
            r7.D0(r0)
            defpackage.xq2.G(r7, r2, r3)
            boolean r7 = r6.y
            if (r7 != 0) goto Lb6
            int r7 = r3.b
            r0 = r7 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lb6
            r6.y = r4
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r3.b = r7
        Lb6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.c0(int):qz0");
    }

    public final boolean d(int i) {
        Object objE = E();
        if ((objE instanceof Integer) && i == ((Number) objE).intValue()) {
            return false;
        }
        m0(Integer.valueOf(i));
        return true;
    }

    public final void d0(Object obj) {
        if (!this.S && this.G.g() == 207 && !js3.i(this.G.f(), obj) && this.z < 0) {
            this.z = this.G.g;
            this.y = true;
        }
        V(null, 207, obj, 0);
    }

    public final boolean e(long j) {
        Object objE = E();
        if ((objE instanceof Long) && j == ((Number) objE).longValue()) {
            return false;
        }
        m0(Long.valueOf(j));
        return true;
    }

    public final void e0() {
        V(null, 125, null, 2);
        this.r = true;
    }

    public final boolean f(Object obj) {
        if (js3.i(E(), obj)) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f0() {
        this.m = 0;
        this.G = this.c.d();
        V(null, 100, null, 0);
        d01 d01Var = this.b;
        d01Var.w();
        j56 j56VarJ = d01Var.j();
        this.x.c(this.w ? 1 : 0);
        this.w = f(j56VarJ);
        this.K = null;
        if (!this.q) {
            this.q = d01Var.f();
        }
        if (!this.C) {
            this.C = d01Var.g();
        }
        if (this.C) {
            u58 u58Var = i01.a;
            js3.n(u58Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            j56VarJ = ((i56) j56VarJ).g(u58Var, new v58(A()));
        }
        this.u = j56VarJ;
        Set set = (Set) wu8.G(j56VarJ, xo3.a);
        if (set != null) {
            set.add(x());
            d01Var.r(set);
        }
        long jH = d01Var.h();
        V(null, (int) (jH ^ (jH >>> 32)), null, 0);
    }

    public final boolean g(boolean z) {
        Object objE = E();
        if ((objE instanceof Boolean) && z == ((Boolean) objE).booleanValue()) {
            return false;
        }
        m0(Boolean.valueOf(z));
        return true;
    }

    public final boolean g0(my6 my6Var, Object obj) {
        ge geVar = my6Var.c;
        if (geVar == null) {
            return false;
        }
        int iA = this.G.a.a(geVar);
        if (!this.F || iA < this.G.g) {
            return false;
        }
        ArrayList arrayList = this.s;
        int iS = xq2.s(iA, arrayList);
        if (iS < 0) {
            int i = -(iS + 1);
            if (!(obj instanceof ck1)) {
                obj = null;
            }
            arrayList.add(i, new vs3(my6Var, iA, obj));
            return true;
        }
        vs3 vs3Var = (vs3) arrayList.get(iS);
        if (!(obj instanceof ck1)) {
            vs3Var.c = null;
            return true;
        }
        Object obj2 = vs3Var.c;
        if (obj2 == null) {
            vs3Var.c = obj;
            return true;
        }
        if (obj2 instanceof sb5) {
            ((sb5) obj2).d(obj);
            return true;
        }
        sb5 sb5Var = de7.a;
        sb5 sb5Var2 = new sb5(2);
        sb5Var2.k(obj2);
        sb5Var2.k(obj);
        vs3Var.c = sb5Var2;
        return true;
    }

    public final boolean h(Object obj) {
        if (E() == obj) {
            return false;
        }
        m0(obj);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0(defpackage.rb5 r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.util.ArrayList r2 = r0.s
            int r3 = defpackage.br9.y(r2)
        La:
            r4 = -1
            if (r4 >= r3) goto L2e
            java.lang.Object r4 = r2.get(r3)
            vs3 r4 = (defpackage.vs3) r4
            my6 r5 = r4.a
            ge r5 = r5.c
            if (r5 == 0) goto L28
            boolean r6 = r5.a()
            if (r6 == 0) goto L28
            int r6 = r4.b
            int r5 = r5.a
            if (r6 == r5) goto L2b
            r4.b = r5
            goto L2b
        L28:
            r2.remove(r3)
        L2b:
            int r3 = r3 + (-1)
            goto La
        L2e:
            java.lang.Object[] r3 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8b
            r7 = 0
        L3a:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L86
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L54:
            if (r12 >= r10) goto L84
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L80
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl"
            defpackage.js3.n(r14, r15)
            my6 r14 = (defpackage.my6) r14
            ge r15 = r14.c
            if (r15 == 0) goto L80
            int r15 = r15.a
            th0 r6 = defpackage.th0.s
            if (r13 != r6) goto L78
            r13 = 0
        L78:
            vs3 r6 = new vs3
            r6.<init>(r14, r15, r13)
            r2.add(r6)
        L80:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L54
        L84:
            if (r10 != r11) goto L8b
        L86:
            if (r7 == r5) goto L8b
            int r7 = r7 + 1
            goto L3a
        L8b:
            mh r1 = defpackage.xq2.b
            defpackage.yu0.Y(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.h0(rb5):void");
    }

    public final void i() {
        this.j = null;
        this.k = 0;
        this.l = 0;
        this.T = 0L;
        this.r = false;
        kz0 kz0Var = this.M;
        kz0Var.c = false;
        kz0Var.d.b = 0;
        kz0Var.f = 0;
        kz0Var.e = true;
        kz0Var.g = 0;
        kz0Var.h.clear();
        kz0Var.i = -1;
        kz0Var.j = -1;
        kz0Var.k = -1;
        kz0Var.l = 0;
        this.E.clear();
        this.o = null;
        this.p = null;
    }

    public final void i0(int i, int i2) {
        if (n0(i) != i2) {
            if (i < 0) {
                wa5 wa5Var = this.p;
                if (wa5Var == null) {
                    wa5Var = new wa5();
                    this.p = wa5Var;
                }
                wa5Var.f(i, i2);
                return;
            }
            int[] iArr = this.o;
            if (iArr == null) {
                iArr = new int[this.G.c];
                ew.G0(iArr, -1, 0, 6);
                this.o = iArr;
            }
            iArr[i] = i2;
        }
    }

    public final Object j(i iVar) {
        return wu8.G(l(), iVar);
    }

    public final void j0(int i, int i2) {
        int iN0 = n0(i);
        if (iN0 != i2) {
            int i3 = i2 - iN0;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int iN02 = n0(i) + i3;
                i0(i, iN02);
                int i4 = size;
                while (true) {
                    if (-1 < i4) {
                        o46 o46Var = (o46) arrayList.get(i4);
                        if (o46Var != null && o46Var.a(i, iN02)) {
                            size = i4 - 1;
                            break;
                        }
                        i4--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.G.i;
                } else if (this.G.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final void k(bp2 bp2Var) {
        if (!this.r) {
            sz0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (!this.S) {
            sz0.a("createNode() can only be called when inserting");
        }
        ar3 ar3Var = this.n;
        int i = ar3Var.a[ar3Var.b - 1];
        fz7 fz7Var = this.I;
        ge geVarB = fz7Var.b(fz7Var.v);
        this.l++;
        pd2 pd2Var = this.O;
        mv5 mv5Var = pd2Var.g;
        mv5Var.D0(su5.e);
        xq2.G(mv5Var, 0, bp2Var);
        mv5Var.i[mv5Var.j - mv5Var.g[mv5Var.h - 1].b] = i;
        xq2.G(mv5Var, 1, geVarB);
        mv5 mv5Var2 = pd2Var.h;
        mv5Var2.D0(su5.f);
        mv5Var2.i[mv5Var2.j - mv5Var2.g[mv5Var2.h - 1].b] = i;
        xq2.G(mv5Var2, 0, geVarB);
    }

    public final i56 k0(j56 j56Var, i56 i56Var) {
        i56 i56Var2 = (i56) j56Var;
        i56Var2.getClass();
        h56 h56Var = new h56(i56Var2);
        h56Var.g = i56Var2;
        h56Var.putAll(i56Var);
        i56 i56VarG = h56Var.build();
        X(204, sz0.d);
        E();
        m0(i56VarG);
        E();
        m0(i56Var);
        q(false);
        return i56VarG;
    }

    public final j56 l() {
        j56 j56Var = this.K;
        return j56Var != null ? j56Var : m(this.G.i);
    }

    public final void l0(Object obj) {
        if (obj instanceof m37) {
            n37 n37Var = new n37((m37) obj, this.m - 1);
            if (this.S) {
                mv5 mv5Var = this.M.b.g;
                mv5Var.D0(yu5.d);
                xq2.G(mv5Var, 0, n37Var);
            }
            this.d.add(obj);
            obj = n37Var;
        }
        m0(obj);
    }

    public final j56 m(int i) {
        j56 j56Var;
        boolean z = this.S;
        yt5 yt5Var = sz0.c;
        if (z && this.J) {
            int iG = this.I.v;
            while (iG > 0) {
                if (this.I.s(iG) == 202 && js3.i(this.I.t(iG), yt5Var)) {
                    Object objQ = this.I.q(iG);
                    js3.n(objQ, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    j56 j56Var2 = (j56) objQ;
                    this.K = j56Var2;
                    return j56Var2;
                }
                fz7 fz7Var = this.I;
                iG = fz7Var.G(fz7Var.b, iG);
            }
        }
        if (this.G.c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    bz7 bz7Var = this.G;
                    if (js3.i(bz7Var.p(bz7Var.b, i), yt5Var)) {
                        ya5 ya5Var = this.v;
                        if (ya5Var == null || (j56Var = (j56) ya5Var.b(i)) == null) {
                            bz7 bz7Var2 = this.G;
                            Object objB = bz7Var2.b(bz7Var2.b, i);
                            js3.n(objB, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            j56Var = (j56) objB;
                        }
                        this.K = j56Var;
                        return j56Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        j56 j56Var3 = this.u;
        this.K = j56Var3;
        return j56Var3;
    }

    public final void m0(Object obj) {
        if (this.S) {
            this.I.U(obj);
            return;
        }
        bz7 bz7Var = this.G;
        boolean z = bz7Var.n;
        kz0 kz0Var = this.M;
        if (!z) {
            ge geVarA = bz7Var.a(bz7Var.i);
            mv5 mv5Var = kz0Var.b.g;
            mv5Var.D0(fu5.d);
            xq2.H(mv5Var, 0, geVarA, 1, obj);
            return;
        }
        int iC = (bz7Var.l - ez7.c(bz7Var.b, bz7Var.i)) - 1;
        if (kz0Var.a.G.i - kz0Var.f >= 0) {
            kz0Var.d(true);
            mv5 mv5Var2 = kz0Var.b.g;
            mv5Var2.D0(su5.h);
            xq2.G(mv5Var2, 0, obj);
            mv5Var2.i[mv5Var2.j - mv5Var2.g[mv5Var2.h - 1].b] = iC;
            return;
        }
        bz7 bz7Var2 = this.G;
        ge geVarA2 = bz7Var2.a(bz7Var2.i);
        mv5 mv5Var3 = kz0Var.b.g;
        mv5Var3.D0(su5.g);
        xq2.H(mv5Var3, 0, obj, 1, geVarA2);
        mv5Var3.i[mv5Var3.j - mv5Var3.g[mv5Var3.h - 1].b] = iC;
    }

    public final fz0 n() {
        Collection collection;
        if (!this.b.l()) {
            return null;
        }
        ListBuilder listBuilderS = br9.s();
        fz7 fz7Var = this.I;
        listBuilderS.addAll(wn5.c(fz7Var, null, fz7Var.t, null));
        bz7 bz7Var = this.G;
        boolean z = bz7Var.f;
        int[] iArr = bz7Var.b;
        if (z || bz7Var.c == 0) {
            collection = EmptyList.a;
        } else {
            ov6 ov6Var = new ov6(bz7Var);
            int iQ = bz7Var.i;
            Object objValueOf = Integer.valueOf(bz7Var.l - ez7.c(iArr, iQ));
            while (iQ >= 0) {
                ov6Var.o(bz7Var.i(iQ), bz7Var.k(iQ) ? bz7Var.p(iArr, iQ) : jz0.a, bz7Var.a.h(iQ), objValueOf);
                objValueOf = bz7Var.a(iQ);
                iQ = bz7Var.q(iQ);
            }
            collection = (ArrayList) ov6Var.b;
        }
        listBuilderS.addAll(collection);
        listBuilderS.addAll(F());
        return new fz0(br9.q(listBuilderS));
    }

    public final int n0(int i) {
        int i2;
        if (i >= 0) {
            int[] iArr = this.o;
            return (iArr == null || (i2 = iArr[i]) < 0) ? this.G.o(i) : i2;
        }
        wa5 wa5Var = this.p;
        if (wa5Var == null || wa5Var.c(i) < 0) {
            return 0;
        }
        int iC = wa5Var.c(i);
        if (iC >= 0) {
            return wa5Var.c[iC];
        }
        lb7.l("Cannot find value for key " + i);
        throw null;
    }

    public final void o(rb5 rb5Var, qp2 qp2Var) {
        ArrayList arrayList = this.s;
        if (this.F) {
            sz0.a("Reentrant composition is not supported");
        }
        this.g.i();
        Trace.beginSection("Compose:recompose");
        try {
            long jG = g08.j().g();
            this.B = (int) (jG ^ (jG >>> 32));
            this.v = null;
            h0(rb5Var);
            this.k = 0;
            this.F = true;
            try {
                f0();
                Object objE = E();
                if (objE != qp2Var && qp2Var != null) {
                    m0(qp2Var);
                }
                pz0 pz0Var = this.D;
                zb5 zb5VarB = g.b();
                try {
                    zb5VarB.b(pz0Var);
                    yt5 yt5Var = sz0.a;
                    if (qp2Var != null) {
                        X(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, yt5Var);
                        vy2.I(this, qp2Var);
                        q(false);
                    } else if (!this.w || objE == null || objE.equals(jz0.a)) {
                        S();
                    } else {
                        X(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, yt5Var);
                        wu8.i(2, objE);
                        vy2.I(this, (qp2) objE);
                        q(false);
                    }
                    zb5VarB.l(zb5VarB.c - 1);
                    u();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.w) {
                        sz0.a("Check failed");
                    }
                    w();
                } catch (Throwable th) {
                    zb5VarB.l(zb5VarB.c - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o0() {
        if (!this.r) {
            sz0.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.r = false;
        if (this.S) {
            sz0.a("useNode() called while inserting");
        }
        bz7 bz7Var = this.G;
        Object objN = bz7Var.n(bz7Var.i);
        kz0 kz0Var = this.M;
        kz0Var.c();
        kz0Var.h.add(objN);
        if (this.y && (objN instanceof dz0)) {
            kz0Var.b();
            kz0Var.b.g.D0(kv5.d);
        }
    }

    public final void p(int i, int i2) {
        if (i <= 0 || i == i2) {
            return;
        }
        p(this.G.q(i), i2);
        if (this.G.l(i)) {
            Object objN = this.G.n(i);
            kz0 kz0Var = this.M;
            kz0Var.c();
            kz0Var.h.add(objN);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03a9  */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q(boolean r43) {
        /*
            Method dump skipped, instruction units count: 1392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.q(boolean):void");
    }

    public final void r() {
        q(false);
        my6 my6VarY = y();
        if (my6VarY != null) {
            int i = my6VarY.b;
            if ((i & 1) != 0) {
                my6VarY.b = i | 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083 A[EDGE_INSN: B:59:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080], EDGE_INSN: B:60:0x0083->B:28:0x0083 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.my6 s() {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qz0.s():my6");
    }

    public final void t() {
        if (this.F || this.z != 100) {
            wi6.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.z = -1;
        this.y = false;
    }

    public final void u() {
        q(false);
        this.b.d();
        q(false);
        kz0 kz0Var = this.M;
        if (kz0Var.c) {
            kz0Var.d(false);
            kz0Var.d(false);
            kz0Var.b.g.D0(nu5.d);
            kz0Var.c = false;
        }
        kz0Var.b();
        if (kz0Var.d.b != 0) {
            sz0.a("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            sz0.a("Start/end imbalance");
        }
        i();
        this.G.c();
        this.w = this.x.b() != 0;
    }

    public final void v(boolean z, o46 o46Var) {
        this.i.add(this.j);
        this.j = o46Var;
        int i = this.l;
        ar3 ar3Var = this.n;
        ar3Var.c(i);
        ar3Var.c(this.m);
        ar3Var.c(this.k);
        if (z) {
            this.k = 0;
        }
        this.l = 0;
        this.m = 0;
    }

    public final void w() {
        cz7 cz7Var = new cz7();
        if (this.C) {
            cz7Var.c();
        }
        if (this.b.e()) {
            cz7Var.k = new ya5();
        }
        this.H = cz7Var;
        fz7 fz7VarE = cz7Var.e();
        fz7VarE.e(true);
        this.I = fz7VarE;
    }

    public final f01 x() {
        g01 g01Var = this.U;
        if (g01Var != null) {
            return g01Var;
        }
        g01 g01Var2 = new g01(this.h);
        this.U = g01Var2;
        return g01Var2;
    }

    public final my6 y() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (my6) o40.u(1, arrayList);
    }

    public final boolean z() {
        if (!B() || this.w) {
            return true;
        }
        my6 my6VarY = y();
        return (my6VarY == null || (my6VarY.b & 4) == 0) ? false : true;
    }
}
