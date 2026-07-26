package androidx.compose.material3;

import androidx.compose.material3.a;
import defpackage.bi0;
import defpackage.bp2;
import defpackage.ci0;
import defpackage.hx4;
import defpackage.my6;
import defpackage.ne0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.wy5;
import defpackage.xr7;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:217:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.bp2 r29, defpackage.hx4 r30, boolean r31, defpackage.xr7 r32, defpackage.bi0 r33, defpackage.ei0 r34, defpackage.ne0 r35, defpackage.wy5 r36, androidx.compose.runtime.internal.a r37, defpackage.qz0 r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.a.a(bp2, hx4, boolean, xr7, bi0, ei0, ne0, wy5, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }

    public static final void b(final bp2 bp2Var, final hx4 hx4Var, boolean z, final xr7 xr7Var, final bi0 bi0Var, final ne0 ne0Var, wy5 wy5Var, final androidx.compose.runtime.internal.a aVar, qz0 qz0Var, final int i) {
        int i2;
        final boolean z2;
        final wy5 wy5Var2;
        boolean z3;
        qz0Var.c0(399974542);
        if ((i & 6) == 0) {
            i2 = (qz0Var.h(bp2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qz0Var.f(hx4Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= qz0Var.f(xr7Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= qz0Var.f(bi0Var) ? 16384 : 8192;
        }
        int i4 = i3 | 196608;
        if ((1572864 & i) == 0) {
            i4 |= qz0Var.f(ne0Var) ? 1048576 : 524288;
        }
        int i5 = i4 | 113246208;
        if ((805306368 & i) == 0) {
            i5 |= qz0Var.h(aVar) ? 536870912 : 268435456;
        }
        if (qz0Var.R(i5 & 1, (306783379 & i5) != 306783378)) {
            qz0Var.W();
            if ((i & 1) == 0 || qz0Var.z()) {
                wy5Var2 = ci0.a;
                z3 = true;
            } else {
                qz0Var.U();
                z3 = z;
                wy5Var2 = wy5Var;
            }
            qz0Var.r();
            a(bp2Var, hx4Var, z3, xr7Var, bi0Var, null, ne0Var, wy5Var2, aVar, qz0Var, i5 & 2147483646, 0);
            z2 = z3;
        } else {
            qz0Var.U();
            z2 = z;
            wy5Var2 = wy5Var;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new qp2() { // from class: fi0
                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    a.b(bp2Var, hx4Var, z2, xr7Var, bi0Var, ne0Var, wy5Var2, aVar, (qz0) obj, hs9.W(i | 1));
                    return tx8.a;
                }
            };
        }
    }
}
