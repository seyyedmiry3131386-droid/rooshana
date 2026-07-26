package androidx.compose.ui.layout;

import defpackage.a09;
import defpackage.av;
import defpackage.bf4;
import defpackage.bp2;
import defpackage.dp2;
import defpackage.ex4;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hy2;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j56;
import defpackage.js3;
import defpackage.jz0;
import defpackage.my6;
import defpackage.ok4;
import defpackage.ol3;
import defpackage.qp2;
import defpackage.qy7;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.zk8;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final ol3 a = new ol3(26);
    public static final Object b = new Object();

    public static final void a(final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        qz0Var.c0(441837433);
        if (qz0Var.R(i & 1, (i & 3) != 2)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = new bf4();
                qz0Var.l0(objM);
            }
            bf4 bf4Var = (bf4) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new bp2() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$1$1
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        return new androidx.compose.ui.node.h(2);
                    }
                };
                qz0Var.l0(objM2);
            }
            bp2 bp2Var = (bp2) objM2;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            if (qz0Var.S) {
                qz0Var.b(new a09(0, new dp2() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$1
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        ((androidx.compose.ui.node.h) obj).i = true;
                        return tx8.a;
                    }
                }), tx8.a);
            }
            ia7.o(qz0Var, new qp2() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    final androidx.compose.ui.node.h hVar = (androidx.compose.ui.node.h) obj;
                    new bp2() { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$2$2.1
                        {
                            super(0);
                        }

                        @Override // defpackage.bp2
                        public final Object invoke() {
                            androidx.compose.ui.node.h hVarF = hVar.F();
                            js3.m(hVarF);
                            androidx.compose.ui.node.e eVar = (androidx.compose.ui.node.e) hVarF.H.d;
                            eVar.getClass();
                            return eVar;
                        }
                    };
                    ((bf4) obj2).getClass();
                    return tx8.a;
                }
            }, bf4Var);
            aVar.a(bf4Var, qz0Var, 48);
            qz0Var.q(true);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(i) { // from class: androidx.compose.ui.layout.LookaheadScopeKt$LookaheadScope$4
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(7);
                    e.a(this.g, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(final hx4 hx4Var, final qp2 qp2Var, qz0 qz0Var, final int i, final int i2) {
        int i3;
        qz0Var.c0(-1298353104);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (qz0Var.f(hx4Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (qz0Var.h(qp2Var) ? 32 : 16);
        if (qz0Var.R(i5 & 1, (i5 & 19) != 18)) {
            if (i4 != 0) {
                hx4Var = ex4.b;
            }
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = new m(hy2.p);
                qz0Var.l0(objM);
            }
            c((m) objM, hx4Var, qp2Var, qz0Var, (i5 << 3) & 1008);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(i | 1);
                    int i6 = i2;
                    e.b(hx4Var, qp2Var, (qz0) obj, iW, i6);
                    return tx8.a;
                }
            };
        }
    }

    public static final void c(final m mVar, final hx4 hx4Var, final qp2 qp2Var, qz0 qz0Var, final int i) {
        int i2;
        qz0Var.c0(-511989831);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(mVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            long j = qz0Var.T;
            int i3 = (int) (j ^ (j >>> 32));
            androidx.compose.runtime.a aVarS = ok4.S(qz0Var);
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4Var);
            j56 j56VarL = qz0Var.l();
            bp2 bp2Var = androidx.compose.ui.node.h.T;
            qz0Var.e0();
            if (qz0Var.S) {
                qz0Var.k(bp2Var);
            } else {
                qz0Var.o0();
            }
            ia7.o(qz0Var, mVar.c, mVar);
            ia7.o(qz0Var, mVar.d, aVarS);
            ia7.o(qz0Var, mVar.e, qp2Var);
            hz0.d0.getClass();
            ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
            ia7.n(qz0Var, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
            ia7.g(qz0Var, Integer.valueOf(i3), androidx.compose.ui.node.d.g);
            qz0Var.q(true);
            if (qz0Var.B()) {
                qz0Var.a0(-1266202711);
            } else {
                qz0Var.a0(-1259244916);
                boolean zH = qz0Var.h(mVar);
                Object objM = qz0Var.M();
                if (zH || objM == jz0.a) {
                    objM = new bp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
                        @Override // defpackage.bp2
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke() {
                            /*
                                r17 = this;
                                r0 = r17
                                androidx.compose.ui.layout.m r1 = r1
                                androidx.compose.ui.layout.g r1 = r1.a()
                                androidx.compose.ui.node.h r2 = r1.a
                                java.util.List r3 = r2.r()
                                kb5 r3 = (defpackage.kb5) r3
                                java.lang.Object r3 = r3.b
                                zb5 r3 = (defpackage.zb5) r3
                                int r3 = r3.c
                                int r4 = r1.n
                                if (r4 == r3) goto L78
                                rb5 r1 = r1.f
                                java.lang.Object[] r3 = r1.c
                                long[] r1 = r1.a
                                int r4 = r1.length
                                int r4 = r4 + (-2)
                                r5 = 7
                                r6 = 0
                                if (r4 < 0) goto L61
                                r7 = r6
                            L28:
                                r8 = r1[r7]
                                long r10 = ~r8
                                long r10 = r10 << r5
                                long r10 = r10 & r8
                                r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                                long r10 = r10 & r12
                                int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                                if (r10 == 0) goto L5c
                                int r10 = r7 - r4
                                int r10 = ~r10
                                int r10 = r10 >>> 31
                                r11 = 8
                                int r10 = 8 - r10
                                r12 = r6
                            L41:
                                if (r12 >= r10) goto L5a
                                r13 = 255(0xff, double:1.26E-321)
                                long r13 = r13 & r8
                                r15 = 128(0x80, double:6.3E-322)
                                int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                                if (r13 >= 0) goto L56
                                int r13 = r7 << 3
                                int r13 = r13 + r12
                                r13 = r3[r13]
                                p14 r13 = (defpackage.p14) r13
                                r14 = 1
                                r13.d = r14
                            L56:
                                long r8 = r8 >> r11
                                int r12 = r12 + 1
                                goto L41
                            L5a:
                                if (r10 != r11) goto L61
                            L5c:
                                if (r7 == r4) goto L61
                                int r7 = r7 + 1
                                goto L28
                            L61:
                                androidx.compose.ui.node.h r1 = r2.j
                                if (r1 == 0) goto L6f
                                boolean r1 = r2.x()
                                if (r1 != 0) goto L78
                                androidx.compose.ui.node.h.q0(r2, r6, r5)
                                goto L78
                            L6f:
                                boolean r1 = r2.A()
                                if (r1 != 0) goto L78
                                androidx.compose.ui.node.h.s0(r2, r6, r5)
                            L78:
                                tx8 r1 = defpackage.tx8.a
                                return r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4$1.invoke():java.lang.Object");
                        }
                    };
                    qz0Var.l0(objM);
                }
                zk8.k((bp2) objM, qz0Var);
            }
            qz0Var.q(false);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(i | 1);
                    e.c(mVar, hx4Var, qp2Var, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    public static final androidx.compose.runtime.internal.a d(final List list) {
        return new androidx.compose.runtime.internal.a(1271844412, new qp2() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                qz0 qz0Var = (qz0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    List list2 = list;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        qp2 qp2Var = (qp2) list2.get(i);
                        long j = qz0Var.T;
                        int i2 = (int) (j ^ (j >>> 32));
                        hz0.d0.getClass();
                        bp2 bp2Var = androidx.compose.ui.node.d.c;
                        qz0Var.e0();
                        if (qz0Var.S) {
                            qz0Var.k(bp2Var);
                        } else {
                            qz0Var.o0();
                        }
                        ia7.g(qz0Var, Integer.valueOf(i2), androidx.compose.ui.node.d.g);
                        qp2Var.invoke(qz0Var, 0);
                        qz0Var.q(true);
                    }
                } else {
                    qz0Var.U();
                }
                return tx8.a;
            }
        }, true);
    }

    public static final androidx.compose.runtime.internal.a e(final hx4 hx4Var) {
        return new androidx.compose.runtime.internal.a(-511438721, new rp2() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // defpackage.rp2
            public final Object a(Object obj, Object obj2, Object obj3) {
                qz0 qz0Var = ((qy7) obj).a;
                qz0 qz0Var2 = (qz0) obj2;
                ((Number) obj3).intValue();
                long j = qz0Var2.T;
                hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4Var);
                qz0Var.b0(509942095);
                hz0.d0.getClass();
                ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
                ia7.g(qz0Var, Integer.valueOf((int) (j ^ (j >>> 32))), androidx.compose.ui.node.d.g);
                qz0Var.q(false);
                return tx8.a;
            }
        }, true);
    }
}
