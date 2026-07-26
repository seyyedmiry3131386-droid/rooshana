package defpackage;

import android.view.animation.Interpolator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ij {
    public static final nc2 a = nc2.w("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa", "rx", "ry");
    public static final nc2 b = nc2.w("k");

    public static void a(cj cjVar, gf4 gf4Var) {
        Float fValueOf = Float.valueOf(0.0f);
        List list = (List) cjVar.b;
        if (list.isEmpty()) {
            list.add(new uy3(gf4Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(gf4Var.m)));
        } else if (((uy3) list.get(0)).b == null) {
            list.set(0, new uy3(gf4Var, fValueOf, fValueOf, (Interpolator) null, 0.0f, Float.valueOf(gf4Var.m)));
        }
    }

    public static boolean b(cj cjVar) {
        if (cjVar != null) {
            return cjVar.c() && ((Float) ((uy3) ((List) cjVar.b).get(0)).b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.hj c(com.airbnb.lottie.parser.moshi.b r27, defpackage.gf4 r28) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ij.c(com.airbnb.lottie.parser.moshi.b, gf4):hj");
    }
}
