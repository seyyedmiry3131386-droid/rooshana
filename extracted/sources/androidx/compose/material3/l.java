package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldType;
import defpackage.ab5;
import defpackage.dh8;
import defpackage.jz0;
import defpackage.lh8;
import defpackage.ll;
import defpackage.my6;
import defpackage.nh1;
import defpackage.qp2;
import defpackage.qr5;
import defpackage.qz0;
import defpackage.s7;
import defpackage.tq8;
import defpackage.wa9;
import defpackage.wy5;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final l a = new l();
    public static final float b = 56;
    public static final float c = 280;
    public static final float d = 1;
    public static final float e = 2;

    /* JADX WARN: Removed duplicated region for block: B:114:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final boolean r26, final boolean r27, final defpackage.ab5 r28, defpackage.hx4 r29, final defpackage.dh8 r30, final defpackage.xr7 r31, float r32, float r33, defpackage.qz0 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.l.a(boolean, boolean, ab5, hx4, dh8, xr7, float, float, qz0, int, int):void");
    }

    public final void b(final String str, final qp2 qp2Var, final boolean z, wa9 wa9Var, final ab5 ab5Var, final boolean z2, final qp2 qp2Var2, final dh8 dh8Var, wy5 wy5Var, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        int i2;
        wa9 wa9Var2;
        final wy5 wy5Var2;
        wy5 wy5Var3;
        int i3;
        androidx.compose.runtime.internal.a aVar2;
        qz0Var.c0(-1732281618);
        if ((i & 6) == 0) {
            i2 = (qz0Var.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.h(qp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qz0Var.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qz0Var.g(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            wa9Var2 = wa9Var;
            i2 |= qz0Var.f(wa9Var2) ? 16384 : 8192;
        } else {
            wa9Var2 = wa9Var;
        }
        if ((i & 196608) == 0) {
            i2 |= qz0Var.f(ab5Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= qz0Var.g(z2) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= qz0Var.h(qp2Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= qz0Var.h(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= qz0Var.h(null) ? 536870912 : 268435456;
        }
        int i4 = 14155776 | (qz0Var.h(null) ? 4 : 2) | (qz0Var.h(null) ? 32 : 16) | (qz0Var.h(null) ? 256 : 128) | (qz0Var.h(null) ? 2048 : 1024) | (qz0Var.f(dh8Var) ? 16384 : 8192) | 65536;
        if (qz0Var.R(i2 & 1, ((i2 & 306783379) == 306783378 && (4793491 & i4) == 4793490) ? false : true)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                float f = androidx.compose.material3.internal.m.a;
                wy5Var3 = new wy5(f, f, f, f);
                i3 = i4 & (-458753);
            } else {
                qz0Var.U();
                i3 = i4 & (-458753);
                wy5Var3 = wy5Var;
            }
            qz0Var.r();
            boolean z3 = ((i2 & 57344) == 16384) | ((i2 & 14) == 4);
            Object objM = qz0Var.M();
            if (z3 || objM == jz0.a) {
                ll llVar = new ll(str);
                wa9Var2.getClass();
                objM = new tq8(llVar, qr5.a);
                qz0Var.l0(objM);
            }
            String str2 = ((tq8) objM).a.b;
            TextFieldType[] textFieldTypeArr = TextFieldType.a;
            int i5 = i3;
            lh8 lh8Var = new lh8();
            if (qp2Var2 == null) {
                qz0Var.a0(1927058812);
                qz0Var.q(false);
                aVar2 = null;
            } else {
                qz0Var.a0(1927058813);
                androidx.compose.runtime.internal.a aVarX = s7.X(-1459717586, new nh1(1, qp2Var2), qz0Var);
                qz0Var.q(false);
                aVar2 = aVarX;
            }
            int i6 = i2 >> 9;
            int i7 = i5 << 21;
            wy5 wy5Var4 = wy5Var3;
            androidx.compose.material3.internal.m.a(str2, qp2Var, lh8Var, aVar2, z, z2, ab5Var, wy5Var4, dh8Var, aVar, qz0Var, ((i2 << 3) & 896) | 6 | (i6 & 458752) | (i6 & 3670016) | (i7 & 29360128) | (i7 & 234881024) | (i7 & 1879048192), (i6 & 7168) | ((i5 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | ((i2 >> 3) & 57344) | ((i5 << 6) & 3670016) | 12582912);
            wy5Var2 = wy5Var4;
        } else {
            qz0Var.U();
            wy5Var2 = wy5Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            final wa9 wa9Var3 = wa9Var2;
            my6VarS.d = new qp2() { // from class: ax5
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.b(str, qp2Var, z, wa9Var3, ab5Var, z2, qp2Var2, dh8Var, wy5Var2, aVar, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }
}
