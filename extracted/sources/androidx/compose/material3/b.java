package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import defpackage.ab5;
import defpackage.au1;
import defpackage.c26;
import defpackage.dw1;
import defpackage.gg2;
import defpackage.gr3;
import defpackage.jz0;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rj6;
import defpackage.u48;
import defpackage.wb5;
import defpackage.wu1;
import defpackage.xk;
import defpackage.zc3;
import defpackage.zk8;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public b(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final u48 a(boolean z, ab5 ab5Var, qz0 qz0Var, int i) {
        androidx.compose.animation.core.a aVar;
        qz0Var.a0(-1763481333);
        float f = this.a;
        Object obj = jz0.a;
        if (ab5Var == null) {
            qz0Var.a0(167751211);
            Object objM = qz0Var.M();
            if (objM == obj) {
                objM = androidx.compose.runtime.g.h(new au1(f));
                qz0Var.l0(objM);
            }
            wb5 wb5Var = (wb5) objM;
            qz0Var.q(false);
            qz0Var.q(false);
            return wb5Var;
        }
        qz0Var.a0(167824247);
        qz0Var.q(false);
        Object objM2 = qz0Var.M();
        if (objM2 == obj) {
            objM2 = new SnapshotStateList();
            qz0Var.l0(objM2);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objM2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && qz0Var.f(ab5Var)) || (i & 48) == 32;
        Object objM3 = qz0Var.M();
        if (z3 || objM3 == obj) {
            objM3 = new CardElevation$animateElevation$1$1(ab5Var, snapshotStateList, null);
            qz0Var.l0(objM3);
        }
        zk8.h(qz0Var, (qp2) objM3, ab5Var);
        gr3 gr3Var = (gr3) kotlin.collections.a.v0(snapshotStateList);
        if (!z) {
            f = this.f;
        } else if (gr3Var instanceof rj6) {
            f = this.b;
        } else if (gr3Var instanceof zc3) {
            f = this.d;
        } else if (gr3Var instanceof gg2) {
            f = this.c;
        } else if (gr3Var instanceof wu1) {
            f = this.e;
        }
        Object objM4 = qz0Var.M();
        if (objM4 == obj) {
            objM4 = new androidx.compose.animation.core.a(new au1(f), c26.j, null, 12);
            qz0Var.l0(objM4);
        }
        androidx.compose.animation.core.a aVar2 = (androidx.compose.animation.core.a) objM4;
        au1 au1Var = new au1(f);
        boolean zH = qz0Var.h(aVar2) | qz0Var.c(f) | ((((i & 14) ^ 6) > 4 && qz0Var.g(z)) || (i & 6) == 4);
        if ((((i & 896) ^ 384) <= 256 || !qz0Var.f(this)) && (i & 384) != 256) {
            z2 = false;
        }
        boolean zH2 = zH | z2 | qz0Var.h(gr3Var);
        Object objM5 = qz0Var.M();
        if (zH2 || objM5 == obj) {
            aVar = aVar2;
            Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(aVar, f, z, this, gr3Var, null);
            qz0Var.l0(cardElevation$animateElevation$2$1);
            objM5 = cardElevation$animateElevation$2$1;
        } else {
            aVar = aVar2;
        }
        zk8.h(qz0Var, (qp2) objM5, au1Var);
        xk xkVar = aVar.c;
        qz0Var.q(false);
        return xkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return au1.b(this.a, bVar.a) && au1.b(this.b, bVar.b) && au1.b(this.c, bVar.c) && au1.b(this.d, bVar.d) && au1.b(this.f, bVar.f);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f) + dw1.g(this.d, dw1.g(this.c, dw1.g(this.b, Float.floatToIntBits(this.a) * 31, 31), 31), 31);
    }
}
