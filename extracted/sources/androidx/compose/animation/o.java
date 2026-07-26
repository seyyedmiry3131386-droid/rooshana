package androidx.compose.animation;

import defpackage.jz0;
import defpackage.mt8;
import defpackage.o38;
import defpackage.qz0;
import defpackage.sc2;
import defpackage.u48;
import defpackage.y97;
import defpackage.zu0;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final o38 a = y97.c0(0.0f, 0.0f, null, 7);

    public static final u48 a(long j, sc2 sc2Var, String str, qz0 qz0Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            sc2Var = a;
        }
        sc2 sc2Var2 = sc2Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zF = qz0Var.f(zu0.f(j));
        Object objM = qz0Var.M();
        if (zF || objM == jz0.a) {
            objM = (mt8) ((ColorVectorConverterKt$ColorToVector$1) g.a).invoke(zu0.f(j));
            qz0Var.l0(objM);
        }
        return androidx.compose.animation.core.b.c(new zu0(j), (mt8) objM, sc2Var2, null, str2, null, qz0Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
