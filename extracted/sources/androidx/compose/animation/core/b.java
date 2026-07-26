package androidx.compose.animation.core;

import defpackage.au1;
import defpackage.bp2;
import defpackage.c26;
import defpackage.cp0;
import defpackage.dp2;
import defpackage.dt2;
import defpackage.js3;
import defpackage.jz0;
import defpackage.mt8;
import defpackage.o38;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.sc2;
import defpackage.sk;
import defpackage.u48;
import defpackage.va9;
import defpackage.wb5;
import defpackage.y97;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final o38 a = y97.c0(0.0f, 0.0f, null, 7);
    public static final o38 b;

    static {
        Object obj = va9.a;
        b = y97.c0(0.0f, 0.0f, new au1(0.4f), 3);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final u48 a(float f, sc2 sc2Var, String str, qz0 qz0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            sc2Var = b;
        }
        sc2 sc2Var2 = sc2Var;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        return c(new au1(f), c26.j, sc2Var2, null, str, null, qz0Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }

    public static final u48 b(float f, sk skVar, String str, dp2 dp2Var, qz0 qz0Var, int i, int i2) {
        int i3 = i2 & 2;
        o38 o38Var = a;
        sk skVar2 = i3 != 0 ? o38Var : skVar;
        String str2 = (i2 & 8) != 0 ? "FloatAnimation" : str;
        dp2 dp2Var2 = (i2 & 16) != 0 ? null : dp2Var;
        if (skVar2 == o38Var) {
            qz0Var.a0(1144089983);
            boolean z = (((i & 896) ^ 384) > 256 && qz0Var.c(0.01f)) || (i & 384) == 256;
            Object objM = qz0Var.M();
            if (z || objM == jz0.a) {
                objM = y97.c0(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                qz0Var.l0(objM);
            }
            skVar2 = (o38) objM;
            qz0Var.q(false);
        } else {
            qz0Var.a0(1144199909);
            qz0Var.q(false);
        }
        int i4 = i << 3;
        return c(Float.valueOf(f), c26.h, skVar2, Float.valueOf(0.01f), str2, dp2Var2, qz0Var, (i4 & 458752) | (i & 14) | (i4 & 7168) | (57344 & i4), 0);
    }

    public static final u48 c(Object obj, mt8 mt8Var, sk skVar, Float f, String str, dp2 dp2Var, qz0 qz0Var, int i, int i2) {
        if ((i2 & 8) != 0) {
            f = null;
        }
        Object objM = qz0Var.M();
        Object obj2 = jz0.a;
        if (objM == obj2) {
            objM = androidx.compose.runtime.g.h(null);
            qz0Var.l0(objM);
        }
        wb5 wb5Var = (wb5) objM;
        Object objM2 = qz0Var.M();
        if (objM2 == obj2) {
            objM2 = new a(obj, mt8Var, f);
            qz0Var.l0(objM2);
        }
        a aVar = (a) objM2;
        wb5 wb5VarK = androidx.compose.runtime.g.k(dp2Var, qz0Var);
        if (f != null && (skVar instanceof o38)) {
            o38 o38Var = (o38) skVar;
            if (!js3.i(o38Var.c, f)) {
                skVar = new o38(o38Var.a, o38Var.b, f);
            }
        }
        wb5 wb5VarK2 = androidx.compose.runtime.g.k(skVar, qz0Var);
        Object objM3 = qz0Var.M();
        if (objM3 == obj2) {
            objM3 = dt2.b(-1, 6, null);
            qz0Var.l0(objM3);
        }
        cp0 cp0Var = (cp0) objM3;
        boolean zH = qz0Var.h(cp0Var) | ((((i & 14) ^ 6) > 4 && qz0Var.h(obj)) || (i & 6) == 4);
        Object objM4 = qz0Var.M();
        if (zH || objM4 == obj2) {
            objM4 = new defpackage.d(cp0Var, obj, 6);
            qz0Var.l0(objM4);
        }
        zk8.k((bp2) objM4, qz0Var);
        boolean zH2 = qz0Var.h(cp0Var) | qz0Var.h(aVar) | qz0Var.f(wb5VarK2) | qz0Var.f(wb5VarK);
        Object objM5 = qz0Var.M();
        if (zH2 || objM5 == obj2) {
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(cp0Var, aVar, wb5VarK2, wb5VarK, null);
            qz0Var.l0(animateAsStateKt$animateValueAsState$3$1);
            objM5 = animateAsStateKt$animateValueAsState$3$1;
        }
        zk8.h(qz0Var, (qp2) objM5, cp0Var);
        u48 u48Var = (u48) wb5Var.getValue();
        return u48Var == null ? aVar.c : u48Var;
    }
}
