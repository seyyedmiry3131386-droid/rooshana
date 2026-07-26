package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.runtime.g;
import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ka0 {
    public static final /* synthetic */ int a = 0;

    static {
        float f = 40;
        br9.f(f, f);
    }

    public static final void a(String str, dp2 dp2Var, hx4 hx4Var, boolean z, gj8 gj8Var, ty3 ty3Var, sy3 sy3Var, int i, int i2, wa9 wa9Var, dp2 dp2Var2, ab5 ab5Var, k18 k18Var, a aVar, qz0 qz0Var, int i3) {
        dp2 dp2Var3;
        dp2 dp2Var4;
        dp2 dp2Var5;
        qz0Var.c0(2026950908);
        int i4 = i3 | (qz0Var.f(str) ? 4 : 2) | (qz0Var.h(dp2Var) ? 32 : 16) | (qz0Var.f(hx4Var) ? 256 : 128) | (qz0Var.g(z) ? 2048 : 1024) | (qz0Var.g(false) ? 16384 : 8192) | (qz0Var.f(gj8Var) ? 131072 : 65536) | (qz0Var.f(ty3Var) ? 1048576 : 524288) | (qz0Var.f(sy3Var) ? 8388608 : 4194304) | (qz0Var.g(false) ? 67108864 : 33554432) | (qz0Var.d(i) ? 536870912 : 268435456);
        int i5 = 196608 | (qz0Var.d(i2) ? 4 : 2) | (qz0Var.f(wa9Var) ? 32 : 16) | 384 | (qz0Var.f(ab5Var) ? 2048 : 1024) | (qz0Var.f(k18Var) ? 16384 : 8192);
        if (qz0Var.R(i4 & 1, ((i4 & 306783379) == 306783378 && (74899 & i5) == 74898) ? false : true)) {
            qz0Var.W();
            int i6 = i3 & 1;
            Object obj = jz0.a;
            if (i6 == 0 || qz0Var.z()) {
                Object objM = qz0Var.M();
                if (objM == obj) {
                    objM = new k7(23);
                    qz0Var.l0(objM);
                }
                dp2Var4 = (dp2) objM;
            } else {
                qz0Var.U();
                dp2Var4 = dp2Var2;
            }
            qz0Var.r();
            Object objM2 = qz0Var.M();
            if (objM2 == obj) {
                dp2Var5 = dp2Var4;
                objM2 = g.h(new zh8(str, 0L, 6));
                qz0Var.l0(objM2);
            } else {
                dp2Var5 = dp2Var4;
            }
            wb5 wb5Var = (wb5) objM2;
            zh8 zh8Var = (zh8) wb5Var.getValue();
            zh8 zh8Var2 = new zh8(new ll(str), zh8Var.b, zh8Var.c);
            boolean zF = qz0Var.f(zh8Var2);
            Object objM3 = qz0Var.M();
            if (zF || objM3 == obj) {
                objM3 = new d(zh8Var2, wb5Var, 13);
                qz0Var.l0(objM3);
            }
            zk8.k((bp2) objM3, qz0Var);
            boolean z2 = (i4 & 14) == 4;
            Object objM4 = qz0Var.M();
            if (z2 || objM4 == obj) {
                objM4 = g.h(str);
                qz0Var.l0(objM4);
            }
            Object obj2 = (wb5) objM4;
            ty3Var.getClass();
            cj3 cj3Var = new cj3(0, true, 1, 1, wc4.c);
            boolean zF2 = qz0Var.f(obj2) | ((i4 & 112) == 32);
            Object objM5 = qz0Var.M();
            if (zF2 || objM5 == obj) {
                objM5 = new vt(dp2Var, wb5Var, obj2, 2);
                qz0Var.l0(objM5);
            }
            int i7 = i5 << 9;
            dp2 dp2Var6 = dp2Var5;
            c.a(zh8Var2, (dp2) objM5, hx4Var, gj8Var, wa9Var, dp2Var6, ab5Var, k18Var, true, i, i2, cj3Var, sy3Var, z, aVar, qz0Var, (i4 & 896) | ((i4 >> 6) & 7168) | (i7 & 57344) | 196608 | (3670016 & i7) | (i7 & 29360128), (i4 & 57344) | ((i4 >> 15) & 896) | (i4 & 7168) | 196608);
            dp2Var3 = dp2Var6;
        } else {
            qz0Var.U();
            dp2Var3 = dp2Var2;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new ja0(str, dp2Var, hx4Var, z, gj8Var, ty3Var, sy3Var, i, i2, wa9Var, dp2Var3, ab5Var, k18Var, aVar, i3);
        }
    }
}
