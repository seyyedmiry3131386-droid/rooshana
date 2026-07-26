package androidx.compose.animation.core;

import defpackage.av;
import defpackage.c08;
import defpackage.dl;
import defpackage.dp2;
import defpackage.fr8;
import defpackage.jr8;
import defpackage.jz0;
import defpackage.lc8;
import defpackage.mr8;
import defpackage.mt8;
import defpackage.mw7;
import defpackage.my6;
import defpackage.nr8;
import defpackage.ql3;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.s08;
import defpackage.sc2;
import defpackage.tt9;
import defpackage.y5;
import defpackage.yb5;
import defpackage.yq8;
import defpackage.zk8;
import defpackage.zq8;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final lc8 a = new lc8(12);
    public static final Object b = kotlin.a.b(LazyThreadSafetyMode.c, new mw7(15));

    public static final void a(jr8 jr8Var, fr8 fr8Var, Object obj, Object obj2, sc2 sc2Var, qz0 qz0Var, int i) {
        int i2;
        qz0Var.c0(867041821);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(jr8Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(fr8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? qz0Var.f(obj) : qz0Var.h(obj) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? qz0Var.f(obj2) : qz0Var.h(obj2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? qz0Var.f(sc2Var) : qz0Var.h(sc2Var) ? 16384 : 8192;
        }
        if (!qz0Var.R(i2 & 1, (i2 & 9363) != 9362)) {
            qz0Var.U();
        } else if (jr8Var.h()) {
            fr8Var.h(obj, obj2, sc2Var);
        } else {
            fr8Var.i(obj2, sc2Var);
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new y5(jr8Var, fr8Var, obj, obj2, sc2Var, i, 6);
        }
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [dp2, kotlin.jvm.internal.Lambda] */
    /* JADX WARN: Type inference failed for: r9v1, types: [dp2, kotlin.jvm.internal.Lambda] */
    public static final zq8 b(jr8 jr8Var, mt8 mt8Var, String str, qz0 qz0Var, int i, int i2) {
        yq8 yq8Var;
        if ((i2 & 2) != 0) {
            str = "DeferredAnimation";
        }
        int i3 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i3 > 4 && qz0Var.f(jr8Var)) || (i & 6) == 4;
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (z2 || objM == obj) {
            objM = new zq8(jr8Var, mt8Var, str);
            qz0Var.l0(objM);
        }
        zq8 zq8Var = (zq8) objM;
        if ((i3 <= 4 || !qz0Var.f(jr8Var)) && (i & 6) != 4) {
            z = false;
        }
        boolean zH = qz0Var.h(zq8Var) | z;
        Object objM2 = qz0Var.M();
        if (zH || objM2 == obj) {
            objM2 = new nr8(jr8Var, zq8Var, 1);
            qz0Var.l0(objM2);
        }
        zk8.d(zq8Var, (dp2) objM2, qz0Var);
        if (jr8Var.h() && (yq8Var = (yq8) ((s08) zq8Var.b).getValue()) != null) {
            jr8 jr8Var2 = zq8Var.c;
            yq8Var.a.h(yq8Var.c.invoke(jr8Var2.f().b()), yq8Var.c.invoke(jr8Var2.f().c()), (sc2) yq8Var.b.invoke(jr8Var2.f()));
        }
        return zq8Var;
    }

    public static final fr8 c(jr8 jr8Var, Object obj, Object obj2, sc2 sc2Var, mt8 mt8Var, qz0 qz0Var, int i) {
        boolean zF = qz0Var.f(jr8Var);
        Object objM = qz0Var.M();
        Object obj3 = jz0.a;
        if (zF || objM == obj3) {
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                dl dlVar = (dl) mt8Var.b().invoke(obj2);
                dlVar.d();
                objM = new fr8(jr8Var, obj, dlVar, mt8Var);
                ql3.u(c08VarK, c08VarM, dp2VarE);
                qz0Var.l0(objM);
            } catch (Throwable th) {
                ql3.u(c08VarK, c08VarM, dp2VarE);
                throw th;
            }
        }
        fr8 fr8Var = (fr8) objM;
        a(jr8Var, fr8Var, obj, obj2, sc2Var, qz0Var, 0);
        boolean zF2 = qz0Var.f(jr8Var) | qz0Var.f(fr8Var);
        Object objM2 = qz0Var.M();
        if (zF2 || objM2 == obj3) {
            objM2 = new nr8(jr8Var, fr8Var, 2);
            qz0Var.l0(objM2);
        }
        zk8.d(fr8Var, (dp2) objM2, qz0Var);
        return fr8Var;
    }

    public static final jr8 d(tt9 tt9Var, String str, qz0 qz0Var, int i) {
        int i2 = (i & 14) ^ 6;
        boolean z = true;
        boolean z2 = (i2 > 4 && qz0Var.f(tt9Var)) || (i & 6) == 4;
        Object objM = qz0Var.M();
        Object obj = jz0.a;
        if (z2 || objM == obj) {
            c08 c08VarK = ql3.k();
            dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
            c08 c08VarM = ql3.m(c08VarK);
            try {
                Object jr8Var = new jr8(tt9Var, null, str);
                ql3.u(c08VarK, c08VarM, dp2VarE);
                qz0Var.l0(jr8Var);
                objM = jr8Var;
            } catch (Throwable th) {
                ql3.u(c08VarK, c08VarM, dp2VarE);
                throw th;
            }
        }
        jr8 jr8Var2 = (jr8) objM;
        if (tt9Var instanceof e) {
            qz0Var.a0(-1357607479);
            e eVar = (e) tt9Var;
            Object value = ((s08) eVar.d).getValue();
            Object value2 = ((s08) eVar.c).getValue();
            if ((i2 <= 4 || !qz0Var.f(tt9Var)) && (i & 6) != 4) {
                z = false;
            }
            Object objM2 = qz0Var.M();
            if (z || objM2 == obj) {
                objM2 = new TransitionKt$rememberTransition$1$1(tt9Var, null);
                qz0Var.l0(objM2);
            }
            zk8.i(value, value2, (qp2) objM2, qz0Var);
            qz0Var.q(false);
        } else {
            qz0Var.a0(-1357145920);
            jr8Var2.a(tt9Var.k(), qz0Var, 0);
            qz0Var.q(false);
        }
        boolean zF = qz0Var.f(jr8Var2);
        Object objM3 = qz0Var.M();
        if (zF || objM3 == obj) {
            objM3 = new mr8(jr8Var2, 0);
            qz0Var.l0(objM3);
        }
        zk8.d(jr8Var2, (dp2) objM3, qz0Var);
        return jr8Var2;
    }

    public static final jr8 e(Object obj, String str, qz0 qz0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        Object objM = qz0Var.M();
        av avVar = jz0.a;
        if (objM == avVar) {
            objM = new jr8(new yb5(obj), null, str);
            qz0Var.l0(objM);
        }
        jr8 jr8Var = (jr8) objM;
        jr8Var.a(obj, qz0Var, (i & 8) | 48 | (i & 14));
        Object objM2 = qz0Var.M();
        if (objM2 == avVar) {
            objM2 = new mr8(jr8Var, 1);
            qz0Var.l0(objM2);
        }
        zk8.d(jr8Var, (dp2) objM2, qz0Var);
        return jr8Var;
    }
}
