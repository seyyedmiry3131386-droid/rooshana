package ir.myket.player.ui.client.controllers.common;

import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.compose.animation.core.a;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.g;
import androidx.compose.runtime.i;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.e;
import defpackage.a6;
import defpackage.ab0;
import defpackage.ah4;
import defpackage.av;
import defpackage.aw8;
import defpackage.bd8;
import defpackage.bg0;
import defpackage.bi0;
import defpackage.bp2;
import defpackage.br6;
import defpackage.ci0;
import defpackage.cl4;
import defpackage.cx3;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.e71;
import defpackage.eq;
import defpackage.ex4;
import defpackage.ey7;
import defpackage.f8;
import defpackage.fg6;
import defpackage.gj8;
import defpackage.hq6;
import defpackage.hx4;
import defpackage.hz0;
import defpackage.ia7;
import defpackage.ix4;
import defpackage.j51;
import defpackage.j56;
import defpackage.js3;
import defpackage.jv;
import defpackage.jz0;
import defpackage.ka7;
import defpackage.la7;
import defpackage.ln2;
import defpackage.mg0;
import defpackage.mi8;
import defpackage.ml9;
import defpackage.my6;
import defpackage.n08;
import defpackage.ng0;
import defpackage.nl7;
import defpackage.nr5;
import defpackage.of8;
import defpackage.og0;
import defpackage.ol7;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.ra6;
import defpackage.s08;
import defpackage.s7;
import defpackage.tj8;
import defpackage.tv0;
import defpackage.tx8;
import defpackage.u58;
import defpackage.u8;
import defpackage.uj8;
import defpackage.v25;
import defpackage.vv0;
import defpackage.wb5;
import defpackage.wf5;
import defpackage.wy5;
import defpackage.x5;
import defpackage.xa7;
import defpackage.y40;
import defpackage.yh0;
import defpackage.z5;
import defpackage.zk8;
import defpackage.zu0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
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
    public static final void a(ah4 ah4Var, dp2 dp2Var, dp2 dp2Var2, int i, qz0 qz0Var, int i2) {
        int i3;
        qz0 qz0Var2;
        Object controllerSeekIconButtonKt$ControllerSeekIconButton$3$1;
        androidx.compose.animation.core.a aVar;
        int i4;
        Context context;
        int i5;
        boolean z;
        gj8 gj8Var;
        String str;
        wy5 wy5VarF;
        int i6;
        ah4 ah4Var2 = ah4Var;
        qz0 qz0Var3 = qz0Var;
        ab0 ab0Var = eq.p;
        qz0Var3.c0(1856977945);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var3.h(ah4Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var3.f(ab0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var3.h(dp2Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var3.h(dp2Var2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var3.d(i) ? 16384 : 8192;
        }
        if (qz0Var3.R(i3 & 1, (i3 & 9363) != 9362)) {
            Context context2 = (Context) qz0Var3.j(e.b);
            wb5 wb5VarK = g.k(Integer.valueOf(i), qz0Var3);
            Object objM = qz0Var3.M();
            Object obj = jz0.a;
            if (objM == obj) {
                objM = dt2.a(0.0f);
                qz0Var3.l0(objM);
            }
            androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) objM;
            Object objM2 = qz0Var3.M();
            if (objM2 == obj) {
                objM2 = dt2.a(0.0f);
                qz0Var3.l0(objM2);
            }
            androidx.compose.animation.core.a aVar3 = (androidx.compose.animation.core.a) objM2;
            Integer numValueOf = Integer.valueOf(((Number) wb5VarK.getValue()).intValue());
            int i7 = i3 & 7168;
            boolean zF = qz0Var3.f(wb5VarK) | qz0Var3.h(aVar2) | qz0Var3.h(aVar3) | qz0Var3.h(ah4Var2) | (i7 == 2048);
            Object objM3 = qz0Var3.M();
            if (zF || objM3 == obj) {
                aVar = aVar3;
                i4 = i7;
                context = context2;
                i5 = i3;
                controllerSeekIconButtonKt$ControllerSeekIconButton$3$1 = new ControllerSeekIconButtonKt$ControllerSeekIconButton$3$1(aVar2, aVar, dp2Var2, wb5VarK, ah4Var2, null);
                aVar2 = aVar2;
                ah4Var2 = ah4Var2;
                qz0Var3.l0(controllerSeekIconButtonKt$ControllerSeekIconButton$3$1);
            } else {
                i5 = i3;
                context = context2;
                aVar = aVar3;
                controllerSeekIconButtonKt$ControllerSeekIconButton$3$1 = objM3;
                i4 = i7;
            }
            zk8.h(qz0Var3, (qp2) controllerSeekIconButtonKt$ControllerSeekIconButton$3$1, numValueOf);
            vv0 vv0VarA = tv0.a(jv.c, ab0Var, qz0Var3, (((i5 << 3) & 896) >> 3) & 112);
            long j = qz0Var3.T;
            int i8 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var3.l();
            ex4 ex4Var = ex4.b;
            hx4 hx4VarC = androidx.compose.ui.b.c(qz0Var3, ex4Var);
            hz0.d0.getClass();
            bp2 bp2Var = d.b;
            qz0Var3.e0();
            if (qz0Var3.S) {
                qz0Var3.k(bp2Var);
            } else {
                qz0Var3.o0();
            }
            ia7.o(qz0Var3, d.f, vv0VarA);
            ia7.o(qz0Var3, d.e, j56VarL);
            ia7.g(qz0Var3, Integer.valueOf(i8), d.g);
            ia7.n(qz0Var3, d.h);
            ia7.o(qz0Var3, d.d, hx4VarC);
            int iIntValue = ((Number) wb5VarK.getValue()).intValue();
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            String strG = null;
            if (iIntValue <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                qz0Var3.a0(1399573846);
                z = false;
            } else {
                z = false;
                qz0Var3.a0(1399573847);
                strG = ln2.g(ah4Var2.b, new Object[]{xa7.f(context, String.valueOf(numValueOf2.intValue()))}, qz0Var3);
            }
            qz0Var3.q(z);
            if (strG == null) {
                strG = "";
            }
            gj8 gj8Var2 = ((wf5) qz0Var3.j(aw8.a)).d;
            i iVar = uj8.a;
            Object objJ = qz0Var3.j(iVar);
            js3.m(objJ);
            long j2 = ((tj8) objJ).j;
            boolean z2 = !ab0Var.equals(ab0Var);
            if (ah4Var2 instanceof ol7) {
                qz0Var3.a0(1400150385);
                gj8Var = gj8Var2;
                wy5VarF = yh0.f(ml9.q(hq6.space_16, qz0Var3), 0.0f, 0.0f, 0.0f, 14);
                qz0Var3.q(false);
                str = strG;
            } else {
                gj8Var = gj8Var2;
                qz0Var3.a0(1400253491);
                str = strG;
                wy5VarF = yh0.f(0.0f, 0.0f, ml9.q(hq6.space_16, qz0Var3), 0.0f, 11);
                qz0Var3.q(false);
            }
            hx4 hx4VarB = ix4.b(ex4Var, z2, yh0.y(ex4Var, wy5VarF));
            boolean zH = qz0Var3.h(aVar2);
            Object objM4 = qz0Var3.M();
            if (zH || objM4 == obj) {
                i6 = 0;
                objM4 = new j51(aVar2, i6);
                qz0Var3.l0(objM4);
            } else {
                i6 = 0;
            }
            int i9 = i4;
            int i10 = i5;
            int i11 = i6;
            mi8.b(str, androidx.compose.ui.graphics.d.a(hx4VarB, (dp2) objM4), j2, 0L, 0L, null, 0L, 0, false, 1, 0, gj8Var, qz0Var, 0, 24576, 114680);
            int i12 = i9 == 2048 ? 1 : i11;
            if ((i10 & 896) == 256) {
                i11 = 1;
            }
            int i13 = i12 | i11 | (qz0Var.h(ah4Var2) ? 1 : 0);
            Object objM5 = qz0Var.M();
            if (i13 != 0 || objM5 == obj) {
                objM5 = new f8(dp2Var2, dp2Var, ah4Var2, 10);
                qz0Var.l0(objM5);
            }
            wy5 wy5Var = ci0.a;
            long j3 = zu0.g;
            Object objJ2 = qz0Var.j(iVar);
            js3.m(objJ2);
            bi0 bi0VarA = ci0.a(j3, ((tj8) objJ2).j, 0L, 0L, qz0Var, 12);
            float fQ = ml9.q(hq6.space_16, qz0Var);
            androidx.compose.material3.a.a((bp2) objM5, null, false, null, bi0VarA, null, null, new wy5(fQ, fQ, fQ, fQ), s7.X(937106559, new x5(ah4Var2, aVar, 4), qz0Var), qz0Var, 805306368, 366);
            qz0 qz0Var4 = qz0Var;
            qz0Var4.q(true);
            qz0Var2 = qz0Var4;
        } else {
            qz0Var3.U();
            qz0Var2 = qz0Var3;
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new og0(ah4Var2, dp2Var, dp2Var2, i, i2, 2);
        }
    }

    public static final void b(hx4 hx4Var, androidx.media3.ui.compose.state.a aVar, qz0 qz0Var, int i, int i2) {
        hx4 hx4Var2;
        int i3;
        androidx.media3.ui.compose.state.a aVar2;
        js3.p(aVar, "playPauseButtonState");
        qz0Var.c0(-1921440341);
        int i4 = i2 & 1;
        int i5 = 2;
        if (i4 != 0) {
            i3 = i | 6;
            hx4Var2 = hx4Var;
        } else {
            hx4Var2 = hx4Var;
            i3 = (qz0Var.f(hx4Var2) ? 4 : 2) | i;
        }
        int i6 = i3 | (qz0Var.h(aVar) ? 32 : 16);
        if (qz0Var.R(i6 & 1, (i6 & 19) != 18)) {
            hx4 hx4Var3 = i4 != 0 ? ex4.b : hx4Var2;
            int i7 = ((Boolean) ((s08) aVar.c).getValue()).booleanValue() ? br6.player_ic_play : br6.player_ic_pause;
            boolean z = (i6 & 112) == 32 || qz0Var.h(aVar);
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                objM = new PlayPauseIconButtonKt$PlayPauseIconButton$1$1(0, aVar, androidx.media3.ui.compose.state.a.class, "onClick", "onClick()V", 0);
                aVar2 = aVar;
                qz0Var.l0(objM);
            } else {
                aVar2 = aVar;
            }
            cx3 cx3Var = (cx3) objM;
            boolean zBooleanValue = ((Boolean) ((s08) aVar2.b).getValue()).booleanValue();
            ka7 ka7Var = la7.a;
            wy5 wy5Var = ci0.a;
            long j = zu0.g;
            Object objJ = qz0Var.j(uj8.a);
            js3.m(objJ);
            bi0 bi0VarA = ci0.a(j, ((tj8) objJ).j, 0L, 0L, qz0Var, 12);
            float fQ = ml9.q(hq6.space_16, qz0Var);
            hx4Var2 = hx4Var3;
            androidx.compose.material3.a.a((bp2) cx3Var, hx4Var2, zBooleanValue, ka7Var, bi0VarA, null, null, new wy5(fQ, fQ, fQ, fQ), s7.X(-965391973, new z5(i7, i5), qz0Var), qz0Var, ((i6 << 3) & 112) | 805306368, 352);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new a6(hx4Var2, aVar, i, i2);
        }
    }

    public static final void c(final hx4 hx4Var, final bp2 bp2Var, final ah4 ah4Var, final dp2 dp2Var, final dp2 dp2Var2, final int i, final boolean z, qz0 qz0Var, final int i2) {
        int i3;
        int i4;
        androidx.compose.animation.core.a aVar;
        Object playerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1;
        e71 e71Var;
        wb5 wb5Var;
        Context context;
        int i5;
        androidx.compose.animation.core.a aVar2;
        int i6;
        hx4 hx4Var2;
        androidx.compose.animation.core.a aVar3;
        final wb5 wb5Var2;
        androidx.compose.animation.core.a aVar4;
        androidx.compose.animation.core.a aVar5;
        boolean z2;
        final ah4 ah4Var2 = ah4Var;
        dp2 dp2Var3 = dp2Var2;
        qz0 qz0Var2 = qz0Var;
        qz0Var2.c0(1856901258);
        if ((i2 & 6) == 0) {
            i3 = (qz0Var2.f(hx4Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= qz0Var2.h(bp2Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= qz0Var2.h(ah4Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= qz0Var2.h(dp2Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= qz0Var2.h(dp2Var3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 = i;
            i3 |= qz0Var2.d(i4) ? 131072 : 65536;
        } else {
            i4 = i;
        }
        if ((1572864 & i2) == 0) {
            i3 |= qz0Var2.g(z) ? 1048576 : 524288;
        }
        if (qz0Var2.R(i3 & 1, (599187 & i3) != 599186)) {
            Context context2 = (Context) qz0Var2.j(e.b);
            Object objM = qz0Var2.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = zk8.x(EmptyCoroutineContext.a, qz0Var2);
                qz0Var2.l0(objM);
            }
            e71 e71Var2 = (e71) objM;
            wb5 wb5VarK = g.k(Integer.valueOf(i4), qz0Var2);
            Object objM2 = qz0Var2.M();
            if (objM2 == avVar) {
                objM2 = g.h(new ey7(0L));
                qz0Var2.l0(objM2);
            }
            wb5 wb5Var3 = (wb5) objM2;
            Object objM3 = qz0Var2.M();
            if (objM3 == avVar) {
                objM3 = g.h(new nr5(0L));
                qz0Var2.l0(objM3);
            }
            wb5 wb5Var4 = (wb5) objM3;
            Object objM4 = qz0Var2.M();
            if (objM4 == avVar) {
                objM4 = dt2.a(0.0f);
                qz0Var2.l0(objM4);
            }
            androidx.compose.animation.core.a aVar6 = (androidx.compose.animation.core.a) objM4;
            Object objM5 = qz0Var2.M();
            if (objM5 == avVar) {
                objM5 = dt2.a(0.0f);
                qz0Var2.l0(objM5);
            }
            androidx.compose.animation.core.a aVar7 = (androidx.compose.animation.core.a) objM5;
            Object objM6 = qz0Var2.M();
            if (objM6 == avVar) {
                objM6 = dt2.a(0.0f);
                qz0Var2.l0(objM6);
            }
            androidx.compose.animation.core.a aVar8 = (androidx.compose.animation.core.a) objM6;
            Object objM7 = qz0Var2.M();
            if (objM7 == avVar) {
                objM7 = dt2.a(1.0f);
                qz0Var2.l0(objM7);
            }
            androidx.compose.animation.core.a aVar9 = (androidx.compose.animation.core.a) objM7;
            Integer numValueOf = Integer.valueOf(((Number) wb5VarK.getValue()).intValue());
            boolean zF = qz0Var2.f(wb5VarK) | qz0Var2.h(aVar8) | qz0Var2.h(aVar9);
            int i7 = i3 & 57344;
            boolean zH = zF | (i7 == 16384) | qz0Var2.h(aVar7);
            Object objM8 = qz0Var2.M();
            if (zH || objM8 == avVar) {
                aVar = aVar9;
                e71Var = e71Var2;
                wb5Var = wb5Var4;
                context = context2;
                i5 = i7;
                aVar2 = aVar6;
                i6 = 16384;
                playerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1 = new PlayerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1(aVar8, aVar, dp2Var3, aVar7, wb5VarK, null);
                dp2Var3 = dp2Var3;
                qz0Var2.l0(playerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1);
            } else {
                aVar = aVar9;
                e71Var = e71Var2;
                wb5Var = wb5Var4;
                context = context2;
                playerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1 = objM8;
                aVar2 = aVar6;
                i5 = i7;
                i6 = 16384;
            }
            zk8.i(numValueOf, dp2Var3, (qp2) playerTapGesturesSurfaceKt$PlayerTapGesturesSurface$4$1, qz0Var2);
            Object objM9 = qz0Var2.M();
            if (objM9 == avVar) {
                objM9 = new u8(wb5Var3, 7);
                qz0Var2.l0(objM9);
            }
            hx4 hx4VarC = y40.C(hx4Var, (dp2) objM9);
            e71 e71Var3 = e71Var;
            final androidx.compose.animation.core.a aVar10 = aVar2;
            boolean zH2 = ((i3 & 112) == 32) | ((i3 & 7168) == 2048) | (i5 == i6) | qz0Var2.h(ah4Var2) | qz0Var2.h(e71Var3) | qz0Var2.h(aVar10) | qz0Var2.h(aVar7);
            Object objM10 = qz0Var2.M();
            if (zH2 || objM10 == avVar) {
                hx4Var2 = hx4VarC;
                aVar3 = aVar7;
                wb5Var2 = wb5Var;
                aVar4 = aVar8;
                aVar5 = aVar;
                objM10 = new fg6(dp2Var, bp2Var, dp2Var3, ah4Var2, e71Var3, wb5Var2, aVar10, aVar3, wb5Var3);
                ah4Var2 = ah4Var2;
                qz0Var2.l0(objM10);
            } else {
                hx4Var2 = hx4VarC;
                aVar5 = aVar;
                aVar3 = aVar7;
                wb5Var2 = wb5Var;
                aVar4 = aVar8;
            }
            hx4 hx4VarA = bd8.a(hx4Var2, tx8.a, (PointerInputEventHandler) objM10);
            cl4 cl4VarD = bg0.d(eq.g, false);
            long j = qz0Var2.T;
            int i8 = (int) (j ^ (j >>> 32));
            j56 j56VarL = qz0Var2.l();
            hx4 hx4VarC2 = androidx.compose.ui.b.c(qz0Var2, hx4VarA);
            hz0.d0.getClass();
            bp2 bp2Var2 = d.b;
            qz0Var2.e0();
            if (qz0Var2.S) {
                qz0Var2.k(bp2Var2);
            } else {
                qz0Var2.o0();
            }
            ia7.o(qz0Var2, d.f, cl4VarD);
            ia7.o(qz0Var2, d.e, j56VarL);
            ia7.g(qz0Var2, Integer.valueOf(i8), d.g);
            ia7.n(qz0Var2, d.h);
            ia7.o(qz0Var2, d.d, hx4VarC2);
            u58 u58Var = uj8.a;
            Object objJ = qz0Var2.j(u58Var);
            js3.m(objJ);
            final long j2 = ((tj8) objJ).I.c;
            hx4 hx4VarB = ng0.a.b();
            boolean zH3 = qz0Var2.h(ah4Var2) | qz0Var2.e(j2) | qz0Var2.h(aVar3) | qz0Var2.h(aVar10);
            Object objM11 = qz0Var2.M();
            if (zH3 || objM11 == avVar) {
                final androidx.compose.animation.core.a aVar11 = aVar3;
                dp2 dp2Var4 = new dp2() { // from class: dg6
                    @Override // defpackage.dp2
                    public final Object invoke(Object obj) throws Throwable {
                        Pair pair;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long j3;
                        long j4 = j2;
                        a aVar12 = aVar11;
                        a aVar13 = aVar10;
                        wb5 wb5Var5 = wb5Var2;
                        hv1 hv1Var = (hv1) obj;
                        Float fValueOf = Float.valueOf(180.0f);
                        js3.p(hv1Var, "$this$Canvas");
                        nl7 nl7Var = nl7.e;
                        ah4 ah4Var3 = ah4Var2;
                        if (ah4Var3.equals(nl7Var)) {
                            pair = new Pair(Float.valueOf(90.0f), fValueOf);
                        } else {
                            if (!ah4Var3.equals(ol7.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pair = new Pair(Float.valueOf(270.0f), fValueOf);
                        }
                        float fFloatValue = ((Number) pair.a).floatValue();
                        float fFloatValue2 = ((Number) pair.b).floatValue();
                        float fMax = Math.max(Float.intBitsToFloat((int) (hv1Var.d() >> 32)), Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L))) * 2.0f;
                        float fIntBitsToFloat = (Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) - fMax) / 2.0f;
                        if (ah4Var3.equals(nl7Var)) {
                            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                        } else {
                            if (!ah4Var3.equals(ol7.e)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (hv1Var.d() >> 32)) - fMax);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
                        }
                        long j5 = (jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L);
                        eh ehVarA = gh.a();
                        Path path = ehVarA.a;
                        path.moveTo(Float.intBitsToFloat((int) (j5 >> 32)) + Float.intBitsToFloat((int) (hv1Var.d() >> 32)), Float.intBitsToFloat((int) (hv1Var.d() & 4294967295L)) / 2.0f);
                        sy6 sy6VarC = ry7.c(j5, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L));
                        float f = sy6VarC.a;
                        float f2 = sy6VarC.b;
                        float f3 = sy6VarC.c;
                        float f4 = sy6VarC.d;
                        if (ehVarA.b == null) {
                            ehVarA.b = new RectF();
                        }
                        RectF rectF = ehVarA.b;
                        js3.m(rectF);
                        rectF.set(f, f2, f3, f4);
                        RectF rectF2 = ehVarA.b;
                        js3.m(rectF2);
                        path.arcTo(rectF2, fFloatValue, fFloatValue2, false);
                        path.close();
                        wv8 wv8VarX = hv1Var.X();
                        long jA = wv8VarX.A();
                        wv8VarX.v().e();
                        try {
                            ((wv8) ((nm5) wv8VarX.b).b).v().i(ehVarA);
                            j3 = jA;
                            try {
                                hv1Var.A(zu0.b(((Number) aVar12.d()).floatValue() * 0.12f, j4), fFloatValue, fFloatValue2, true, j5, (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), (832 & 128) != 0 ? dc2.a : null);
                                o40.g(hv1Var, zu0.b(((Number) aVar12.d()).floatValue() * 0.12f, j4), ((Number) aVar13.d()).floatValue(), ((nr5) wb5Var5.getValue()).a, null, 120);
                                o40.F(wv8VarX, j3);
                                return tx8.a;
                            } catch (Throwable th) {
                                th = th;
                                o40.F(wv8VarX, j3);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j3 = jA;
                        }
                    }
                };
                qz0Var2.l0(dp2Var4);
                objM11 = dp2Var4;
            }
            ml9.c(hx4VarB, (dp2) objM11, qz0Var2, 0);
            float fQ = ml9.q(hq6.double_tap_text_bottom_padding, qz0Var2);
            ex4 ex4Var = ex4.b;
            hx4 hx4VarB2 = ix4.b(ex4Var, !z, yh0.D(ex4Var, 0.0f, 0.0f, 0.0f, fQ, 7));
            boolean zH4 = qz0Var2.h(aVar4) | qz0Var2.h(aVar5);
            Object objM12 = qz0Var2.M();
            if (zH4 || objM12 == avVar) {
                objM12 = new v25(aVar4, aVar5, 12);
                qz0Var2.l0(objM12);
            }
            hx4 hx4VarA2 = androidx.compose.ui.graphics.d.a(hx4VarB2, (dp2) objM12);
            int iIntValue = ((Number) wb5VarK.getValue()).intValue();
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            String strG = null;
            if (iIntValue <= 0) {
                numValueOf2 = null;
            }
            if (numValueOf2 == null) {
                qz0Var2.a0(-441139627);
                qz0Var2.q(false);
                z2 = true;
            } else {
                qz0Var2.a0(-441139626);
                z2 = true;
                strG = ln2.g(ah4Var2.b, new Object[]{xa7.f(context, String.valueOf(numValueOf2.intValue()))}, qz0Var2);
                qz0Var2.q(false);
            }
            if (strG == null) {
                strG = "";
            }
            String str = strG;
            gj8 gj8Var = ((wf5) qz0Var2.j(aw8.a)).d;
            Object objJ2 = qz0Var2.j(u58Var);
            js3.m(objJ2);
            mi8.b(str, hx4VarA2, ((tj8) objJ2).j, 0L, 0L, new of8(3), 0L, 0, false, 1, 0, gj8Var, qz0Var, 0, 24576, 113656);
            qz0Var2 = qz0Var;
            qz0Var2.q(z2);
        } else {
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: eg6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ir.myket.player.ui.client.controllers.common.a.c(hx4Var, bp2Var, ah4Var, dp2Var, dp2Var2, i, z, (qz0) obj, hs9.W(i2 | 1));
                    return tx8.a;
                }
            };
        }
    }

    public static final void d(final mg0 mg0Var, final bp2 bp2Var, final dp2 dp2Var, final boolean z, qz0 qz0Var, final int i) {
        int i2;
        bp2 bp2Var2;
        js3.p(mg0Var, "<this>");
        qz0Var.c0(-2103751812);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(mg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bp2Var2 = bp2Var;
            i2 |= qz0Var.h(bp2Var2) ? 32 : 16;
        } else {
            bp2Var2 = bp2Var;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(dp2Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.g(z) ? 2048 : 1024;
        }
        if (qz0Var.R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM = qz0Var.M();
            av avVar = jz0.a;
            if (objM == avVar) {
                objM = g.e(0);
                qz0Var.l0(objM);
            }
            n08 n08Var = (n08) objM;
            Object objM2 = qz0Var.M();
            if (objM2 == avVar) {
                objM2 = g.e(0);
                qz0Var.l0(objM2);
            }
            n08 n08Var2 = (n08) objM2;
            FillElement fillElement = androidx.compose.foundation.layout.b.b;
            hx4 hx4VarA = mg0Var.a(androidx.compose.foundation.layout.b.c(fillElement, 0.5f), yh0.c);
            int i3 = i2;
            ol7 ol7Var = ol7.e;
            Object objM3 = qz0Var.M();
            if (objM3 == avVar) {
                objM3 = new ra6(n08Var2, n08Var, 2);
                qz0Var.l0(objM3);
            }
            int i4 = ((i3 << 9) & 3670016) | ((i3 << 3) & 7168) | (i3 & 112) | 24576;
            c(hx4VarA, bp2Var2, ol7Var, dp2Var, (dp2) objM3, n08Var.h(), z, qz0Var, i4);
            hx4 hx4VarA2 = mg0Var.a(androidx.compose.foundation.layout.b.c(fillElement, 0.5f), yh0.d);
            nl7 nl7Var = nl7.e;
            Object objM4 = qz0Var.M();
            if (objM4 == avVar) {
                objM4 = new ra6(n08Var, n08Var2, 3);
                qz0Var.l0(objM4);
            }
            c(hx4VarA2, bp2Var, nl7Var, dp2Var, (dp2) objM4, n08Var2.h(), z, qz0Var, i4);
        } else {
            qz0Var.U();
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: cg6
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ir.myket.player.ui.client.controllers.common.a.d(mg0Var, bp2Var, dp2Var, z, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }
}
