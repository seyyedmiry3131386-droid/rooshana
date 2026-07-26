package androidx.compose.animation;

import defpackage.av;
import defpackage.bp2;
import defpackage.c26;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.ex4;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.j22;
import defpackage.j52;
import defpackage.j56;
import defpackage.jk;
import defpackage.jr8;
import defpackage.js3;
import defpackage.jz0;
import defpackage.k22;
import defpackage.kr8;
import defpackage.lc8;
import defpackage.mt8;
import defpackage.my6;
import defpackage.nr8;
import defpackage.o87;
import defpackage.pv0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.s08;
import defpackage.tt9;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.yb5;
import defpackage.zk8;
import defpackage.zq8;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final void a(final jr8 jr8Var, final dp2 dp2Var, final hx4 hx4Var, final k22 k22Var, final j52 j52Var, final qp2 qp2Var, rp2 rp2Var, qz0 qz0Var, final int i) {
        int i2;
        rp2 rp2Var2;
        int i3;
        int i4;
        jr8 jr8Var2;
        kr8 kr8Var;
        boolean z;
        mt8 mt8Var;
        Object obj;
        boolean z2;
        boolean z3;
        zq8 zq8Var;
        zq8 zq8Var2;
        zq8 zq8Var3;
        boolean z4;
        final boolean z5;
        zq8 zq8Var4;
        zq8 zq8Var5;
        zq8 zq8Var6;
        zq8 zq8Var7;
        zq8 zq8VarB;
        j52 j52Var2;
        k22 k22Var2;
        qz0Var.c0(1912839215);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.f(hx4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.f(k22Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qz0Var.f(j52Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 131072 : 65536;
        }
        int i5 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i5 |= qz0Var.h(rp2Var) ? 8388608 : 4194304;
        }
        int i6 = i5;
        if (qz0Var.R(i6 & 1, (4793491 & i6) != 4793490)) {
            wb5 wb5Var = jr8Var.d;
            tt9 tt9Var = jr8Var.a;
            if (((Boolean) dp2Var.invoke(((s08) wb5Var).getValue())).booleanValue() || ((Boolean) dp2Var.invoke(tt9Var.j())).booleanValue() || jr8Var.h() || jr8Var.d()) {
                qz0Var.a0(-232413539);
                int i7 = i6 & 14;
                int i8 = i7 | 48;
                int i9 = i8 & 14;
                boolean z6 = ((i9 ^ 6) > 4 && qz0Var.f(jr8Var)) || (i8 & 6) == 4;
                Object objM = qz0Var.M();
                boolean z7 = z6;
                Object obj2 = jz0.a;
                if (z7 || objM == obj2) {
                    objM = tt9Var.j();
                    qz0Var.l0(objM);
                }
                if (jr8Var.h()) {
                    objM = tt9Var.j();
                }
                qz0Var.a0(1844425648);
                EnterExitState enterExitStateF = f(jr8Var, dp2Var, objM, qz0Var);
                qz0Var.q(false);
                Object value = ((s08) jr8Var.d).getValue();
                qz0Var.a0(1844425648);
                EnterExitState enterExitStateF2 = f(jr8Var, dp2Var, value, qz0Var);
                qz0Var.q(false);
                int i10 = i9 | 3072;
                lc8 lc8Var = androidx.compose.animation.core.h.a;
                int i11 = (i10 & 14) ^ 6;
                boolean z8 = (i11 > 4 && qz0Var.f(jr8Var)) || (i10 & 6) == 4;
                Object objM2 = qz0Var.M();
                if (z8 || objM2 == obj2) {
                    i3 = i10;
                    i4 = i6;
                    objM2 = new jr8(new yb5(enterExitStateF), jr8Var, dw1.s(new StringBuilder(), jr8Var.c, " > EnterExitTransition"));
                    qz0Var.l0(objM2);
                } else {
                    i3 = i10;
                    i4 = i6;
                }
                jr8 jr8Var3 = (jr8) objM2;
                boolean zF = ((i11 > 4 && qz0Var.f(jr8Var)) || (i3 & 6) == 4) | qz0Var.f(jr8Var3);
                Object objM3 = qz0Var.M();
                if (zF || objM3 == obj2) {
                    objM3 = new nr8(jr8Var, jr8Var3, 0);
                    qz0Var.l0(objM3);
                }
                zk8.d(jr8Var3, (dp2) objM3, qz0Var);
                if (jr8Var.h()) {
                    jr8Var3.l(enterExitStateF, enterExitStateF2);
                } else {
                    jr8Var3.q(enterExitStateF2);
                    ((s08) jr8Var3.k).setValue(Boolean.FALSE);
                }
                wb5 wb5VarK = androidx.compose.runtime.g.k(qp2Var, qz0Var);
                tt9 tt9Var2 = jr8Var3.a;
                tt9 tt9Var3 = jr8Var3.a;
                wb5 wb5Var2 = jr8Var3.d;
                Object objInvoke = qp2Var.invoke(tt9Var2.j(), ((s08) wb5Var2).getValue());
                boolean zF2 = qz0Var.f(jr8Var3) | qz0Var.f(wb5VarK);
                Object objM4 = qz0Var.M();
                if (zF2 || objM4 == obj2) {
                    objM4 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(jr8Var3, wb5VarK, null);
                    qz0Var.l0(objM4);
                }
                wb5 wb5VarI = androidx.compose.runtime.g.i(qz0Var, (qp2) objM4, objInvoke);
                Object objJ = tt9Var3.j();
                EnterExitState enterExitState = EnterExitState.c;
                if (objJ == enterExitState && ((s08) wb5Var2).getValue() == enterExitState && ((Boolean) wb5VarI.getValue()).booleanValue()) {
                    qz0Var.a0(-272333293);
                    qz0Var.q(false);
                    rp2Var2 = rp2Var;
                    z2 = false;
                } else {
                    qz0Var.a0(-231383533);
                    boolean z9 = i7 == 4;
                    Object objM5 = qz0Var.M();
                    if (z9 || objM5 == obj2) {
                        objM5 = new jk(jr8Var3);
                        qz0Var.l0(objM5);
                    }
                    jk jkVar = (jk) objM5;
                    mt8 mt8Var2 = j.a;
                    mt8 mt8Var3 = c26.n;
                    Object objM6 = qz0Var.M();
                    if (objM6 == obj2) {
                        objM6 = new bp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1$1
                            @Override // defpackage.bp2
                            public final /* bridge */ /* synthetic */ Object invoke() {
                                return Boolean.TRUE;
                            }
                        };
                        qz0Var.l0(objM6);
                    }
                    final bp2 bp2Var = (bp2) objM6;
                    boolean zF3 = qz0Var.f(jr8Var3);
                    Object objM7 = qz0Var.M();
                    if (zF3 || objM7 == obj2) {
                        objM7 = androidx.compose.runtime.g.h(k22Var);
                        qz0Var.l0(objM7);
                    }
                    wb5 wb5Var3 = (wb5) objM7;
                    s08 s08Var = (s08) wb5Var2;
                    if (tt9Var3.j() == s08Var.getValue() && tt9Var3.j() == EnterExitState.b) {
                        if (jr8Var3.h()) {
                            wb5Var3.setValue(k22Var);
                        } else {
                            wb5Var3.setValue(k22.b);
                        }
                    } else if (s08Var.getValue() == EnterExitState.b) {
                        wb5Var3.setValue(((k22) wb5Var3.getValue()).a(k22Var));
                    }
                    k22 k22Var3 = (k22) wb5Var3.getValue();
                    boolean zF4 = qz0Var.f(jr8Var3);
                    Object objM8 = qz0Var.M();
                    if (zF4 || objM8 == obj2) {
                        objM8 = androidx.compose.runtime.g.h(j52Var);
                        qz0Var.l0(objM8);
                    }
                    wb5 wb5Var4 = (wb5) objM8;
                    if (tt9Var3.j() == s08Var.getValue() && tt9Var3.j() == EnterExitState.b) {
                        if (jr8Var3.h()) {
                            wb5Var4.setValue(j52Var);
                        } else {
                            wb5Var4.setValue(j52.b);
                        }
                    } else if (s08Var.getValue() != EnterExitState.b) {
                        wb5Var4.setValue(((j52) wb5Var4.getValue()).a(j52Var));
                    }
                    j52 j52Var3 = (j52) wb5Var4.getValue();
                    kr8 kr8Var2 = k22Var3.a;
                    kr8 kr8Var3 = j52Var3.a;
                    boolean z10 = (kr8Var2.b == null && kr8Var3.b == null) ? false : true;
                    boolean z11 = (kr8Var2.c == null && kr8Var3.c == null) ? false : true;
                    if (z10) {
                        qz0Var.a0(133792645);
                        Object objM9 = qz0Var.M();
                        if (objM9 == obj2) {
                            objM9 = "Built-in slide";
                            qz0Var.l0("Built-in slide");
                        }
                        z = z11;
                        obj = obj2;
                        jr8Var2 = jr8Var3;
                        kr8Var = kr8Var2;
                        z2 = false;
                        z3 = true;
                        zq8 zq8VarB2 = androidx.compose.animation.core.h.b(jr8Var2, mt8Var3, (String) objM9, qz0Var, 384, 0);
                        mt8Var = mt8Var3;
                        qz0Var.q(false);
                        zq8Var = zq8VarB2;
                    } else {
                        jr8Var2 = jr8Var3;
                        kr8Var = kr8Var2;
                        z = z11;
                        mt8Var = mt8Var3;
                        obj = obj2;
                        z2 = false;
                        z3 = true;
                        qz0Var.a0(133898448);
                        qz0Var.q(false);
                        zq8Var = null;
                    }
                    if (z) {
                        qz0Var.a0(133990239);
                        mt8 mt8Var4 = c26.o;
                        Object objM10 = qz0Var.M();
                        if (objM10 == obj) {
                            objM10 = "Built-in shrink/expand";
                            qz0Var.l0("Built-in shrink/expand");
                        }
                        zq8 zq8VarB3 = androidx.compose.animation.core.h.b(jr8Var2, mt8Var4, (String) objM10, qz0Var, 384, 0);
                        qz0Var.q(z2);
                        zq8Var2 = zq8VarB3;
                    } else {
                        qz0Var.a0(134101063);
                        qz0Var.q(z2);
                        zq8Var2 = null;
                    }
                    if (z) {
                        qz0Var.a0(134174689);
                        Object objM11 = qz0Var.M();
                        if (objM11 == obj) {
                            objM11 = "Built-in InterruptionHandlingOffset";
                            qz0Var.l0("Built-in InterruptionHandlingOffset");
                        }
                        zq8 zq8VarB4 = androidx.compose.animation.core.h.b(jr8Var2, mt8Var, (String) objM11, qz0Var, 384, 0);
                        qz0Var.q(z2);
                        zq8Var3 = zq8VarB4;
                    } else {
                        qz0Var.a0(134345095);
                        qz0Var.q(z2);
                        zq8Var3 = null;
                    }
                    boolean z12 = !z;
                    float[] fArr = pv0.a;
                    qz0Var.a0(135150476);
                    qz0Var.q(z2);
                    kr8 kr8Var4 = j52Var3.a;
                    mt8 mt8Var5 = c26.h;
                    boolean z13 = (kr8Var.a == null && kr8Var4.a == null) ? z2 : z3;
                    boolean z14 = (kr8Var.d == null && kr8Var4.d == null) ? z2 : z3;
                    if (z13) {
                        qz0Var.a0(-703879421);
                        Object objM12 = qz0Var.M();
                        if (objM12 == obj) {
                            objM12 = "Built-in alpha";
                            qz0Var.l0("Built-in alpha");
                        }
                        z4 = z14;
                        z5 = z12;
                        zq8 zq8VarB5 = androidx.compose.animation.core.h.b(jr8Var2, mt8Var5, (String) objM12, qz0Var, 384, 0);
                        qz0Var.q(z2);
                        zq8Var4 = zq8VarB5;
                    } else {
                        z4 = z14;
                        z5 = z12;
                        qz0Var.a0(-703709976);
                        qz0Var.q(z2);
                        zq8Var4 = null;
                    }
                    if (z4) {
                        qz0Var.a0(-703642333);
                        Object objM13 = qz0Var.M();
                        if (objM13 == obj) {
                            objM13 = "Built-in scale";
                            qz0Var.l0("Built-in scale");
                        }
                        zq8Var5 = zq8Var4;
                        zq8 zq8VarB6 = androidx.compose.animation.core.h.b(jr8Var2, mt8Var5, (String) objM13, qz0Var, 384, 0);
                        qz0Var.q(z2);
                        zq8Var6 = zq8VarB6;
                    } else {
                        zq8Var5 = zq8Var4;
                        qz0Var.a0(-703472888);
                        qz0Var.q(z2);
                        zq8Var6 = null;
                    }
                    if (z4) {
                        qz0Var.a0(-703395232);
                        zq8Var7 = zq8Var6;
                        zq8VarB = androidx.compose.animation.core.h.b(jr8Var2, j.a, "TransformOriginInterruptionHandling", qz0Var, 384, 0);
                        qz0Var.q(z2);
                    } else {
                        zq8Var7 = zq8Var6;
                        qz0Var.a0(-703222904);
                        qz0Var.q(z2);
                        zq8VarB = null;
                    }
                    boolean zH = qz0Var.h(zq8Var5) | qz0Var.f(k22Var3) | qz0Var.f(j52Var3) | qz0Var.h(zq8Var7) | qz0Var.f(jr8Var2) | qz0Var.h(zq8VarB);
                    Object objM14 = qz0Var.M();
                    if (zH || objM14 == obj) {
                        j52Var2 = j52Var3;
                        k22Var2 = k22Var3;
                        objM14 = new j22(zq8Var5, zq8Var7, jr8Var2, k22Var2, j52Var2, zq8VarB);
                        qz0Var.l0(objM14);
                    } else {
                        j52Var2 = j52Var3;
                        k22Var2 = k22Var3;
                    }
                    j22 j22Var = (j22) objM14;
                    boolean zG = qz0Var.g(z5) | qz0Var.f(bp2Var);
                    Object objM15 = qz0Var.M();
                    if (zG || objM15 == obj) {
                        objM15 = new dp2() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // defpackage.dp2
                            public final Object invoke(Object obj3) {
                                ((o87) obj3).e(!z5 && ((Boolean) bp2Var.invoke()).booleanValue());
                                return tx8.a;
                            }
                        };
                        qz0Var.l0(objM15);
                    }
                    ex4 ex4Var = ex4.b;
                    hx4 hx4VarD = androidx.compose.ui.graphics.d.a(ex4Var, (dp2) objM15).d(new i(jr8Var2, zq8Var2, zq8Var3, zq8Var, k22Var2, j52Var2, bp2Var, j22Var)).d(ex4Var);
                    qz0Var.a0(-7432681);
                    qz0Var.q(z2);
                    hx4 hx4VarD2 = hx4Var.d(hx4VarD.d(ex4Var));
                    Object objM16 = qz0Var.M();
                    if (objM16 == obj) {
                        objM16 = new e(jkVar);
                        qz0Var.l0(objM16);
                    }
                    e eVar = (e) objM16;
                    long j = qz0Var.T;
                    int i12 = (int) (j ^ (j >>> 32));
                    j56 j56VarL = qz0Var.l();
                    hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var, hx4VarD2);
                    hz0.d0.getClass();
                    bp2 bp2Var2 = androidx.compose.ui.node.d.b;
                    qz0Var.e0();
                    if (qz0Var.S) {
                        qz0Var.k(bp2Var2);
                    } else {
                        qz0Var.o0();
                    }
                    ia7.o(qz0Var, androidx.compose.ui.node.d.f, eVar);
                    ia7.o(qz0Var, androidx.compose.ui.node.d.e, j56VarL);
                    ia7.g(qz0Var, Integer.valueOf(i12), androidx.compose.ui.node.d.g);
                    ia7.n(qz0Var, androidx.compose.ui.node.d.h);
                    ia7.o(qz0Var, androidx.compose.ui.node.d.d, hx4VarC);
                    rp2Var2 = rp2Var;
                    rp2Var2.a(jkVar, qz0Var, Integer.valueOf((i4 >> 18) & 112));
                    qz0Var.q(z3);
                    qz0Var.q(z2);
                }
                qz0Var.q(z2);
            } else {
                qz0Var.a0(-272333293);
                qz0Var.q(false);
                rp2Var2 = rp2Var;
            }
        } else {
            rp2Var2 = rp2Var;
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final rp2 rp2Var3 = rp2Var2;
            my6VarS.d = new qp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    f.a(jr8Var, dp2Var, hx4Var, k22Var, j52Var, qp2Var, rp2Var3, (qz0) obj3, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final void b(final boolean z, hx4 hx4Var, final k22 k22Var, j52 j52Var, String str, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        final hx4 hx4Var2;
        final j52 j52Var2;
        final String str2;
        qz0Var.c0(1799879339);
        int i2 = i | (qz0Var.g(z) ? 32 : 16) | 221568;
        if (qz0Var.R(i2 & 1, (599185 & i2) != 599184)) {
            j52 j52VarA = j.e(null, 3).a(j.i(null, 15));
            jr8 jr8VarE = androidx.compose.animation.core.h.e(Boolean.valueOf(z), "AnimatedVisibility", qz0Var, ((i2 >> 3) & 14) | 48, 0);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = new dp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5$1
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        return bool;
                    }
                };
                qz0Var.l0(objM);
            }
            ex4 ex4Var = ex4.b;
            e(jr8VarE, (dp2) objM, ex4Var, k22Var, j52VarA, aVar, qz0Var, 224688);
            hx4Var2 = ex4Var;
            j52Var2 = j52VarA;
            str2 = "AnimatedVisibility";
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            j52Var2 = j52Var;
            str2 = str;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(z, hx4Var2, k22Var, j52Var2, str2, aVar, i) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                public final /* synthetic */ boolean g;
                public final /* synthetic */ hx4 h;
                public final /* synthetic */ k22 i;
                public final /* synthetic */ j52 j;
                public final /* synthetic */ String k;
                public final /* synthetic */ androidx.compose.runtime.internal.a l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(1575943);
                    f.b(this.g, this.h, this.i, this.j, this.k, this.l, (qz0) obj, iW);
                    return tx8.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final boolean r21, defpackage.hx4 r22, defpackage.k22 r23, defpackage.j52 r24, java.lang.String r25, final androidx.compose.runtime.internal.a r26, defpackage.qz0 r27, final int r28, final int r29) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.f.c(boolean, hx4, k22, j52, java.lang.String, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }

    public static final void d(final boolean z, hx4 hx4Var, final k22 k22Var, final j52 j52Var, String str, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i, final int i2) {
        int i3;
        final hx4 hx4Var2;
        final String str2;
        qz0Var.c0(234057107);
        int i4 = i | (qz0Var.g(z) ? 32 : 16);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 384;
        } else {
            i3 = i4 | (qz0Var.f(hx4Var) ? 256 : 128);
        }
        int i6 = i3 | 196608;
        if (qz0Var.R(i6 & 1, (599185 & i6) != 599184)) {
            hx4 hx4Var3 = i5 != 0 ? ex4.b : hx4Var;
            jr8 jr8VarE = androidx.compose.animation.core.h.e(Boolean.valueOf(z), "AnimatedVisibility", qz0Var, ((i6 >> 3) & 14) | 48, 0);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = new dp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3$1
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) {
                        Boolean bool = (Boolean) obj;
                        bool.booleanValue();
                        return bool;
                    }
                };
                qz0Var.l0(objM);
            }
            e(jr8VarE, (dp2) objM, hx4Var3, k22Var, j52Var, aVar, qz0Var, (i6 & 896) | 224304);
            hx4Var2 = hx4Var3;
            str2 = "AnimatedVisibility";
        } else {
            qz0Var.U();
            hx4Var2 = hx4Var;
            str2 = str;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2(z, hx4Var2, k22Var, j52Var, str2, aVar, i, i2) { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                public final /* synthetic */ boolean g;
                public final /* synthetic */ hx4 h;
                public final /* synthetic */ k22 i;
                public final /* synthetic */ j52 j;
                public final /* synthetic */ String k;
                public final /* synthetic */ androidx.compose.runtime.internal.a l;
                public final /* synthetic */ int m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                    this.m = i2;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iW = hs9.W(1600519);
                    int i7 = this.m;
                    f.d(this.g, this.h, this.i, this.j, this.k, this.l, (qz0) obj, iW, i7);
                    return tx8.a;
                }
            };
        }
    }

    public static final void e(final jr8 jr8Var, final dp2 dp2Var, final hx4 hx4Var, final k22 k22Var, final j52 j52Var, final rp2 rp2Var, qz0 qz0Var, final int i) {
        int i2;
        k22 k22Var2;
        j52 j52Var2;
        rp2 rp2Var2;
        qz0Var.c0(1706321816);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.f(hx4Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            k22Var2 = k22Var;
            i2 |= qz0Var.f(k22Var2) ? 2048 : 1024;
        } else {
            k22Var2 = k22Var;
        }
        if ((i & 24576) == 0) {
            j52Var2 = j52Var;
            i2 |= qz0Var.f(j52Var2) ? 16384 : 8192;
        } else {
            j52Var2 = j52Var;
        }
        if ((i & 196608) == 0) {
            rp2Var2 = rp2Var;
            i2 |= qz0Var.h(rp2Var2) ? 131072 : 65536;
        } else {
            rp2Var2 = rp2Var;
        }
        if (qz0Var.R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (z || objM == avVar) {
                objM = new rp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
                    @Override // defpackage.rp2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                        /*
                            r8 = this;
                            el4 r9 = (defpackage.el4) r9
                            yk4 r10 = (defpackage.yk4) r10
                            h31 r11 = (defpackage.h31) r11
                            long r0 = r11.a
                            b96 r10 = r10.t(r0)
                            boolean r11 = r9.Q()
                            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                            r2 = 32
                            if (r11 == 0) goto L34
                            jr8 r11 = r2
                            wb5 r11 = r11.d
                            s08 r11 = (defpackage.s08) r11
                            java.lang.Object r11 = r11.getValue()
                            dp2 r3 = r1
                            java.lang.Object r11 = r3.invoke(r11)
                            java.lang.Boolean r11 = (java.lang.Boolean) r11
                            boolean r11 = r11.booleanValue()
                            if (r11 != 0) goto L34
                            r3 = 0
                            goto L3e
                        L34:
                            int r11 = r10.a
                            int r3 = r10.b
                            long r4 = (long) r11
                            long r4 = r4 << r2
                            long r6 = (long) r3
                            long r6 = r6 & r0
                            long r4 = r4 | r6
                            r3 = r4
                        L3e:
                            long r5 = r3 >> r2
                            int r11 = (int) r5
                            long r0 = r0 & r3
                            int r0 = (int) r0
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1 r1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1
                            r1.<init>()
                            dl4 r9 = defpackage.bl4.m(r9, r11, r0, r1)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                qz0Var.l0(objM);
            }
            hx4 hx4VarG = js3.G(hx4Var, (rp2) objM);
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = new qp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1
                    @Override // defpackage.qp2
                    public final Object invoke(Object obj, Object obj2) {
                        EnterExitState enterExitState = (EnterExitState) obj2;
                        return Boolean.valueOf(((EnterExitState) obj) == enterExitState && enterExitState == EnterExitState.c);
                    }
                };
                qz0Var.l0(objM2);
            }
            a(jr8Var, dp2Var, hx4VarG, k22Var2, j52Var2, (qp2) objM2, rp2Var2, qz0Var, 196608 | i4 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    f.e(jr8Var, dp2Var, hx4Var, k22Var, j52Var, rp2Var, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final EnterExitState f(jr8 jr8Var, dp2 dp2Var, Object obj, qz0 qz0Var) {
        EnterExitState enterExitState;
        qz0Var.Y(-422486745, jr8Var);
        boolean zH = jr8Var.h();
        tt9 tt9Var = jr8Var.a;
        if (zH) {
            qz0Var.a0(-212166497);
            qz0Var.q(false);
            enterExitState = ((Boolean) dp2Var.invoke(obj)).booleanValue() ? EnterExitState.b : ((Boolean) dp2Var.invoke(tt9Var.j())).booleanValue() ? EnterExitState.c : EnterExitState.a;
        } else {
            qz0Var.a0(-211892364);
            Object objM = qz0Var.M();
            if (objM == jz0.a) {
                objM = androidx.compose.runtime.g.h(Boolean.FALSE);
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            if (((Boolean) dp2Var.invoke(tt9Var.j())).booleanValue()) {
                wb5Var.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) dp2Var.invoke(obj)).booleanValue() ? EnterExitState.b : ((Boolean) wb5Var.getValue()).booleanValue() ? EnterExitState.c : EnterExitState.a;
            qz0Var.q(false);
        }
        qz0Var.q(false);
        return enterExitState;
    }
}
