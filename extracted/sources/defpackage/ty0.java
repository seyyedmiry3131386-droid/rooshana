package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ty0 implements wp2 {
    @Override // defpackage.wp2
    public final Object i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, qz0 qz0Var, Integer num) {
        int i;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        a51 a51Var = (a51) obj2;
        rp2 rp2Var = (rp2) obj3;
        bp2 bp2Var = (bp2) obj4;
        int iIntValue = num.intValue();
        int i2 = iIntValue & 6;
        ex4 ex4Var = ex4.b;
        if (i2 == 0) {
            i = (qz0Var.f(ex4Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= qz0Var.f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i |= qz0Var.g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i |= qz0Var.f(a51Var) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i |= qz0Var.h(rp2Var) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i |= qz0Var.h(bp2Var) ? 131072 : 65536;
        }
        if (qz0Var.R(i & 1, (599187 & i) != 599186)) {
            d51.c(str, zBooleanValue, a51Var, ex4Var, rp2Var, bp2Var, qz0Var, ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i) | (i & 458752));
        } else {
            qz0Var.U();
        }
        return tx8.a;
    }
}
