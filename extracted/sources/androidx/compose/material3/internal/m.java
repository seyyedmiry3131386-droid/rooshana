package androidx.compose.material3.internal;

import defpackage.au1;
import defpackage.bw8;
import defpackage.cv8;
import defpackage.gj8;
import defpackage.jz7;
import defpackage.lh8;
import defpackage.my6;
import defpackage.nn6;
import defpackage.pd;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.yq2;
import defpackage.zv8;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final float a;
    public static final float b = 4;
    public static final float c = 2;
    public static final float d = 24;
    public static final float e;
    public static final float f;

    static {
        float f2 = 16;
        a = f2;
        e = f2;
        f = f2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x040d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05fe  */
    /* JADX WARN: Type inference failed for: r1v23, types: [rp2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final java.lang.CharSequence r47, final defpackage.qp2 r48, final defpackage.lh8 r49, final defpackage.rp2 r50, final boolean r51, final boolean r52, final defpackage.ab5 r53, final defpackage.wy5 r54, final defpackage.dh8 r55, final androidx.compose.runtime.internal.a r56, defpackage.qz0 r57, final int r58, final int r59) {
        /*
            Method dump skipped, instruction units count: 1642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.m.a(java.lang.CharSequence, qp2, lh8, rp2, boolean, boolean, ab5, wy5, dh8, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }

    public static final void b(long j, gj8 gj8Var, qp2 qp2Var, qz0 qz0Var, int i) {
        long j2;
        gj8 gj8Var2;
        qp2 qp2Var2;
        qz0 qz0Var2;
        qz0Var.c0(396611577);
        int i2 = (qz0Var.e(j) ? 4 : 2) | i | (qz0Var.f(gj8Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 256 : 128;
        }
        if (qz0Var.R(i2 & 1, (i2 & 147) != 146)) {
            qz0Var2 = qz0Var;
            yq2.I(j, gj8Var, qp2Var, qz0Var2, i2 & 1022);
            j2 = j;
            gj8Var2 = gj8Var;
            qp2Var2 = qp2Var;
        } else {
            j2 = j;
            gj8Var2 = gj8Var;
            qp2Var2 = qp2Var;
            qz0Var2 = qz0Var;
            qz0Var2.U();
        }
        my6 my6VarS = qz0Var2.s();
        if (my6VarS != null) {
            my6VarS.d = new nn6(j2, gj8Var2, qp2Var2, i, 1);
        }
    }

    public static final pd c(lh8 lh8Var) {
        if (lh8Var instanceof lh8) {
            return lh8Var.a;
        }
        throw new IllegalArgumentException("Unknown position: " + lh8Var);
    }

    public static final float d(qz0 qz0Var) {
        long j = ((zv8) qz0Var.j(bw8.a)).l.b.c;
        long j2 = cv8.l;
        if ((1095216660480L & j) != 4294967296L) {
            j = j2;
        }
        return ((qj1) qz0Var.j(androidx.compose.ui.platform.l.h)).s(j) / 2;
    }

    public static final float e(qz0 qz0Var) {
        float f2 = ((au1) qz0Var.j(androidx.compose.material3.e.c)).a;
        if (Float.isNaN(f2)) {
            f2 = 0;
        }
        float f3 = (f2 - jz7.a) / 2;
        float f4 = 0;
        return f3 < f4 ? f4 : f3;
    }
}
