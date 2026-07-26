package androidx.compose.animation;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.a96;
import defpackage.av;
import defpackage.b96;
import defpackage.bp2;
import defpackage.c26;
import defpackage.ce7;
import defpackage.dp2;
import defpackage.dr8;
import defpackage.el4;
import defpackage.ew;
import defpackage.ex4;
import defpackage.h31;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.ik;
import defpackage.j52;
import defpackage.j56;
import defpackage.jk;
import defpackage.jr8;
import defpackage.js3;
import defpackage.jz0;
import defpackage.k22;
import defpackage.lj;
import defpackage.mj;
import defpackage.my6;
import defpackage.nj;
import defpackage.oj;
import defpackage.qd;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rb5;
import defpackage.rp2;
import defpackage.rz2;
import defpackage.s08;
import defpackage.s7;
import defpackage.tt9;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.yk4;
import defpackage.zk8;
import defpackage.zq8;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        long j = Integer.MIN_VALUE;
        a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(final jr8 jr8Var, final hx4 hx4Var, dp2 dp2Var, final qd qdVar, final dp2 dp2Var2, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        int i2;
        dp2 dp2Var3;
        qz0 qz0Var2;
        tt9 tt9Var;
        oj ojVar;
        SnapshotStateList snapshotStateList;
        oj ojVar2;
        zq8 zq8VarB;
        boolean z;
        final dp2 dp2Var4 = dp2Var;
        tt9 tt9Var2 = jr8Var.a;
        qz0Var.c0(511725103);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(dp2Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.f(qdVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var.h(dp2Var2) ? 16384 : 8192;
        }
        final androidx.compose.runtime.internal.a aVar2 = aVar;
        if ((196608 & i) == 0) {
            i2 |= qz0Var.h(aVar2) ? 131072 : 65536;
        }
        if (qz0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (z2 || objM == avVar) {
                objM = new oj(jr8Var, qdVar);
                qz0Var.l0(objM);
            }
            oj ojVar3 = (oj) objM;
            boolean z3 = i3 == 4;
            Object objM2 = qz0Var.M();
            if (z3 || objM2 == avVar) {
                Object[] objArr = {tt9Var2.j()};
                SnapshotStateList snapshotStateList2 = new SnapshotStateList();
                snapshotStateList2.addAll(ew.X0(objArr));
                qz0Var.l0(snapshotStateList2);
                objM2 = snapshotStateList2;
            }
            final SnapshotStateList snapshotStateList3 = (SnapshotStateList) objM2;
            boolean z4 = i3 == 4;
            Object objM3 = qz0Var.M();
            if (z4 || objM3 == avVar) {
                long[] jArr = ce7.a;
                objM3 = new rb5();
                qz0Var.l0(objM3);
            }
            rb5 rb5Var = (rb5) objM3;
            wb5 wb5Var = jr8Var.d;
            if (!snapshotStateList3.contains(tt9Var2.j())) {
                snapshotStateList3.clear();
                snapshotStateList3.add(tt9Var2.j());
            }
            s08 s08Var = (s08) wb5Var;
            if (js3.i(tt9Var2.j(), s08Var.getValue())) {
                if (snapshotStateList3.size() != 1 || !js3.i(snapshotStateList3.get(0), tt9Var2.j())) {
                    snapshotStateList3.clear();
                    snapshotStateList3.add(tt9Var2.j());
                }
                if (rb5Var.e != 1 || rb5Var.c(tt9Var2.j())) {
                    rb5Var.a();
                }
                ojVar3.b = qdVar;
            }
            if (js3.i(tt9Var2.j(), s08Var.getValue()) || snapshotStateList3.contains(s08Var.getValue())) {
                tt9Var = tt9Var2;
            } else {
                ListIterator listIterator = snapshotStateList3.listIterator();
                int i4 = 0;
                while (true) {
                    rz2 rz2Var = (rz2) listIterator;
                    tt9Var = tt9Var2;
                    if (!rz2Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (js3.i(dp2Var2.invoke(rz2Var.next()), dp2Var2.invoke(s08Var.getValue()))) {
                            break;
                        }
                        i4++;
                        tt9Var2 = tt9Var;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList3.add(s08Var.getValue());
                } else {
                    snapshotStateList3.set(i4, s08Var.getValue());
                }
            }
            if (rb5Var.c(s08Var.getValue()) && rb5Var.c(tt9Var.j())) {
                qz0Var.a0(1925931827);
                qz0Var.q(false);
                dp2Var3 = dp2Var4;
                ojVar = ojVar3;
            } else {
                qz0Var.a0(1966410449);
                rb5Var.a();
                int size = snapshotStateList3.size();
                int i5 = 0;
                while (i5 < size) {
                    final Object obj = snapshotStateList3.get(i5);
                    final oj ojVar4 = ojVar3;
                    rb5Var.m(obj, s7.X(-23915175, new qp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // defpackage.qp2
                        public final Object invoke(Object obj2, Object obj3) {
                            qz0 qz0Var3 = (qz0) obj2;
                            int iIntValue = ((Number) obj3).intValue();
                            if (qz0Var3.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Object objM4 = qz0Var3.M();
                                dp2 dp2Var5 = dp2Var4;
                                final oj ojVar5 = ojVar4;
                                av avVar2 = jz0.a;
                                if (objM4 == avVar2) {
                                    objM4 = (h) dp2Var5.invoke(ojVar5);
                                    qz0Var3.l0(objM4);
                                }
                                final h hVar = (h) objM4;
                                jr8 jr8Var2 = jr8Var;
                                dr8 dr8VarF = jr8Var2.f();
                                wb5 wb5Var2 = jr8Var2.d;
                                Object objC = dr8VarF.c();
                                final Object obj4 = obj;
                                boolean zG = qz0Var3.g(js3.i(objC, obj4));
                                Object objM5 = qz0Var3.M();
                                if (zG || objM5 == avVar2) {
                                    objM5 = js3.i(jr8Var2.f().c(), obj4) ? j52.b : ((h) dp2Var5.invoke(ojVar5)).b;
                                    qz0Var3.l0(objM5);
                                }
                                final j52 j52Var = (j52) objM5;
                                Object objM6 = qz0Var3.M();
                                if (objM6 == avVar2) {
                                    objM6 = new nj(js3.i(obj4, ((s08) wb5Var2).getValue()));
                                    qz0Var3.l0(objM6);
                                }
                                nj njVar = (nj) objM6;
                                k22 k22Var = hVar.a;
                                boolean zH = qz0Var3.h(hVar);
                                Object objM7 = qz0Var3.M();
                                if (zH || objM7 == avVar2) {
                                    objM7 = new rp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1
                                        {
                                            super(3);
                                        }

                                        @Override // defpackage.rp2
                                        public final Object a(Object obj5, Object obj6, Object obj7) {
                                            final b96 b96VarT = ((yk4) obj6).t(((h31) obj7).a);
                                            int i6 = b96VarT.a;
                                            int i7 = b96VarT.b;
                                            final h hVar2 = hVar;
                                            return ((el4) obj5).D(i6, i7, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                {
                                                    super(1);
                                                }

                                                @Override // defpackage.dp2
                                                public final Object invoke(Object obj8) {
                                                    ((a96) obj8).g(b96VarT, 0, 0, hVar2.c.h());
                                                    return tx8.a;
                                                }
                                            });
                                        }
                                    };
                                    qz0Var3.l0(objM7);
                                }
                                hx4 hx4VarG = js3.G(ex4.b, (rp2) objM7);
                                ((s08) njVar.b).setValue(Boolean.valueOf(js3.i(obj4, ((s08) wb5Var2).getValue())));
                                hx4 hx4VarD = hx4VarG.d(njVar);
                                boolean zH2 = qz0Var3.h(obj4);
                                Object objM8 = qz0Var3.M();
                                if (zH2 || objM8 == avVar2) {
                                    objM8 = new dp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$3$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // defpackage.dp2
                                        public final Object invoke(Object obj5) {
                                            return Boolean.valueOf(js3.i(obj5, obj4));
                                        }
                                    };
                                    qz0Var3.l0(objM8);
                                }
                                dp2 dp2Var6 = (dp2) objM8;
                                boolean zF = qz0Var3.f(j52Var);
                                Object objM9 = qz0Var3.M();
                                if (zF || objM9 == avVar2) {
                                    objM9 = new qp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$4$1
                                        {
                                            super(2);
                                        }

                                        @Override // defpackage.qp2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            EnterExitState enterExitState = (EnterExitState) obj5;
                                            EnterExitState enterExitState2 = (EnterExitState) obj6;
                                            EnterExitState enterExitState3 = EnterExitState.c;
                                            return Boolean.valueOf(enterExitState == enterExitState3 && enterExitState2 == enterExitState3 && !j52Var.a.e);
                                        }
                                    };
                                    qz0Var3.l0(objM9);
                                }
                                final SnapshotStateList snapshotStateList4 = snapshotStateList3;
                                final androidx.compose.runtime.internal.a aVar3 = aVar2;
                                f.a(jr8Var2, dp2Var6, hx4VarD, k22Var, j52Var, (qp2) objM9, s7.X(-143346359, new rp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
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
                                    @Override // defpackage.rp2
                                    public final Object a(Object obj5, Object obj6, Object obj7) {
                                        ik ikVar = (ik) obj5;
                                        qz0 qz0Var4 = (qz0) obj6;
                                        int iIntValue2 = ((Number) obj7).intValue();
                                        if ((iIntValue2 & 6) == 0) {
                                            iIntValue2 |= (iIntValue2 & 8) == 0 ? qz0Var4.f(ikVar) : qz0Var4.h(ikVar) ? 4 : 2;
                                        }
                                        if (qz0Var4.R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                            final SnapshotStateList snapshotStateList5 = snapshotStateList4;
                                            boolean zF2 = qz0Var4.f(snapshotStateList5);
                                            final Object obj8 = obj4;
                                            boolean zH3 = zF2 | qz0Var4.h(obj8);
                                            final oj ojVar6 = ojVar5;
                                            boolean zH4 = zH3 | qz0Var4.h(ojVar6);
                                            Object objM10 = qz0Var4.M();
                                            av avVar3 = jz0.a;
                                            if (zH4 || objM10 == avVar3) {
                                                objM10 = new dp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$6$1$5$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // defpackage.dp2
                                                    public final Object invoke(Object obj9) {
                                                        return new lj(snapshotStateList5, obj8, ojVar6, 0);
                                                    }
                                                };
                                                qz0Var4.l0(objM10);
                                            }
                                            zk8.d(ikVar, (dp2) objM10, qz0Var4);
                                            rb5 rb5Var2 = ojVar6.d;
                                            js3.n(ikVar, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                                            rb5Var2.m(obj8, ((jk) ikVar).a);
                                            Object objM11 = qz0Var4.M();
                                            if (objM11 == avVar3) {
                                                objM11 = new mj();
                                                qz0Var4.l0(objM11);
                                            }
                                            aVar3.g((mj) objM11, obj8, qz0Var4, 0);
                                        } else {
                                            qz0Var4.U();
                                        }
                                        return tx8.a;
                                    }
                                }, qz0Var3), qz0Var3, 12582912);
                            } else {
                                qz0Var3.U();
                            }
                            return tx8.a;
                        }
                    }, qz0Var));
                    ojVar3 = ojVar4;
                    i5++;
                    dp2Var4 = dp2Var4;
                    aVar2 = aVar;
                }
                dp2Var3 = dp2Var4;
                ojVar = ojVar3;
                qz0Var.q(false);
            }
            boolean zF = qz0Var.f(jr8Var.f()) | qz0Var.f(ojVar);
            Object objM4 = qz0Var.M();
            if (zF || objM4 == avVar) {
                objM4 = (h) dp2Var3.invoke(ojVar);
                qz0Var.l0(objM4);
            }
            h hVar = (h) objM4;
            jr8 jr8Var2 = ojVar.a;
            boolean zF2 = qz0Var.f(ojVar);
            Object objM5 = qz0Var.M();
            if (zF2 || objM5 == avVar) {
                objM5 = androidx.compose.runtime.g.h(Boolean.FALSE);
                qz0Var.l0(objM5);
            }
            wb5 wb5Var2 = (wb5) objM5;
            wb5 wb5VarK = androidx.compose.runtime.g.k(hVar.d, qz0Var);
            if (js3.i(jr8Var2.a.j(), ((s08) jr8Var2.d).getValue())) {
                wb5Var2.setValue(Boolean.FALSE);
            } else if (wb5VarK.getValue() != null) {
                wb5Var2.setValue(Boolean.TRUE);
            }
            boolean zBooleanValue = ((Boolean) wb5Var2.getValue()).booleanValue();
            hx4 hx4Var2 = ex4.b;
            if (zBooleanValue) {
                qz0Var.a0(1353077497);
                oj ojVar5 = ojVar;
                snapshotStateList = snapshotStateList3;
                qz0Var2 = qz0Var;
                ojVar2 = ojVar5;
                zq8VarB = androidx.compose.animation.core.h.b(ojVar5.a, c26.o, null, qz0Var2, 0, 2);
                boolean zF3 = qz0Var2.f(zq8VarB);
                Object objM6 = qz0Var2.M();
                if (zF3 || objM6 == avVar) {
                    objM6 = zk8.t(hx4Var2);
                    qz0Var2.l0(objM6);
                }
                hx4Var2 = (hx4) objM6;
                qz0Var2.q(false);
            } else {
                snapshotStateList = snapshotStateList3;
                qz0Var2 = qz0Var;
                ojVar2 = ojVar;
                qz0Var2.a0(1353343539);
                qz0Var2.q(false);
                zq8VarB = null;
            }
            hx4 hx4VarD = hx4Var.d(hx4Var2.d(new c(zq8VarB, wb5VarK, ojVar2)));
            Object objM7 = qz0Var2.M();
            if (objM7 == avVar) {
                objM7 = new b(ojVar2);
                qz0Var2.l0(objM7);
            }
            b bVar = (b) objM7;
            long j = qz0Var2.T;
            int i6 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var2, hx4VarD);
            hz0.d0.getClass();
            bp2 bp2Var = androidx.compose.ui.node.d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, androidx.compose.ui.node.d.f, bVar);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i6), androidx.compose.ui.node.d.g);
            ia7.n(qz0Var2, androidx.compose.ui.node.d.h);
            ia7.o(qz0Var2, androidx.compose.ui.node.d.d, hx4VarC);
            qz0Var2.a0(-860173498);
            int size2 = snapshotStateList.size();
            int i7 = 0;
            while (i7 < size2) {
                SnapshotStateList snapshotStateList4 = snapshotStateList;
                Object obj2 = snapshotStateList4.get(i7);
                qz0Var2.Y(-2026002954, dp2Var2.invoke(obj2));
                qp2 qp2Var = (qp2) rb5Var.g(obj2);
                if (qp2Var == null) {
                    qz0Var2.a0(1618454323);
                    z = false;
                } else {
                    z = false;
                    qz0Var2.a0(-2026001778);
                    qp2Var.invoke(qz0Var2, 0);
                }
                qz0Var2.q(z);
                qz0Var2.q(z);
                i7++;
                snapshotStateList = snapshotStateList4;
            }
            qz0Var2.q(false);
            qz0Var2.q(true);
        } else {
            dp2Var3 = dp2Var4;
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            final dp2 dp2Var5 = dp2Var3;
            my6VarS.d = new qp2() { // from class: androidx.compose.animation.AnimatedContentKt$AnimatedContent$9
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    a.a(jr8Var, hx4Var, dp2Var5, qdVar, dp2Var2, aVar, (qz0) obj3, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.Object r14, defpackage.hx4 r15, final defpackage.dp2 r16, defpackage.qd r17, final java.lang.String r18, defpackage.dp2 r19, final androidx.compose.runtime.internal.a r20, defpackage.qz0 r21, final int r22, final int r23) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(java.lang.Object, hx4, dp2, qd, java.lang.String, dp2, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }
}
