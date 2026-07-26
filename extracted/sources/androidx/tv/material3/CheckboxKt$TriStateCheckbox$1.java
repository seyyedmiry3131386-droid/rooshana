package androidx.tv.material3;

import androidx.compose.ui.state.ToggleableState;
import defpackage.ab5;
import defpackage.bp2;
import defpackage.dy3;
import defpackage.ex4;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.js3;
import defpackage.jz0;
import defpackage.my6;
import defpackage.o40;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;
import defpackage.v97;
import defpackage.yh0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CheckboxKt$TriStateCheckbox$1 extends Lambda implements qp2 {
    public final /* synthetic */ ToggleableState g;
    public final /* synthetic */ bp2 h;
    public final /* synthetic */ hx4 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ ab5 k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$TriStateCheckbox$1(ToggleableState toggleableState, bp2 bp2Var, hx4 hx4Var, boolean z, dy3 dy3Var, ab5 ab5Var, int i) {
        super(2);
        this.g = toggleableState;
        this.h = bp2Var;
        this.i = hx4Var;
        this.j = z;
        this.k = ab5Var;
        this.l = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        hx4 hx4VarW;
        boolean z;
        ab5 ab5Var;
        qz0 qz0Var = (qz0) obj;
        ((Number) obj2).intValue();
        int iW = hs9.W(this.l | 1);
        float f = b.a;
        qz0Var.c0(278202853);
        int i2 = iW & 6;
        ToggleableState toggleableState = this.g;
        if (i2 == 0) {
            i = (qz0Var.f(toggleableState) ? 4 : 2) | iW;
        } else {
            i = iW;
        }
        int i3 = iW & 48;
        bp2 bp2Var = this.h;
        if (i3 == 0) {
            i |= qz0Var.h(bp2Var) ? 32 : 16;
        }
        int i4 = iW & 384;
        hx4 hx4Var = this.i;
        if (i4 == 0) {
            i |= qz0Var.f(hx4Var) ? 256 : 128;
        }
        int i5 = iW & 3072;
        boolean z2 = this.j;
        if (i5 == 0) {
            i |= qz0Var.g(z2) ? 2048 : 1024;
        }
        if ((iW & 24576) == 0) {
            i |= qz0Var.f(null) ? 16384 : 8192;
        }
        int i6 = 196608 & iW;
        ab5 ab5Var2 = this.k;
        if (i6 == 0) {
            i |= qz0Var.f(ab5Var2) ? 131072 : 65536;
        }
        if ((74899 & i) == 74898 && qz0Var.B()) {
            qz0Var.U();
            z = z2;
        } else {
            qz0Var.W();
            if ((iW & 1) != 0 && !qz0Var.z()) {
                qz0Var.U();
            }
            qz0Var.r();
            qz0Var.b0(-310525964);
            if (bp2Var != null) {
                if (ab5Var2 == null) {
                    qz0Var.b0(-310515335);
                    Object objM = qz0Var.M();
                    if (objM == jz0.a) {
                        objM = o40.r(qz0Var);
                    }
                    ab5Var = (ab5) objM;
                    qz0Var.q(false);
                } else {
                    ab5Var = ab5Var2;
                }
                hx4VarW = js3.W(toggleableState, ab5Var, z2, new v97(1), bp2Var);
            } else {
                hx4VarW = ex4.b;
            }
            qz0Var.q(false);
            z = z2;
            b.a(z, toggleableState, yh0.z(hx4Var.d(hx4VarW), b.a), null, qz0Var, ((i >> 9) & 14) | ((i << 3) & 112) | ((i >> 3) & 7168));
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new CheckboxKt$TriStateCheckbox$1(toggleableState, bp2Var, hx4Var, z, null, ab5Var2, iW);
        }
        return tx8.a;
    }
}
