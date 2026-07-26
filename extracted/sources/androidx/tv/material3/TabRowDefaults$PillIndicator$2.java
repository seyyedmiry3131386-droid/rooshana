package androidx.tv.material3;

import defpackage.au1;
import defpackage.bg0;
import defpackage.dp2;
import defpackage.du1;
import defpackage.eq;
import defpackage.ex4;
import defpackage.hs9;
import defpackage.hx4;
import defpackage.is3;
import defpackage.jz0;
import defpackage.ka7;
import defpackage.kv0;
import defpackage.la7;
import defpackage.ml9;
import defpackage.my6;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rq3;
import defpackage.rq4;
import defpackage.s46;
import defpackage.tx8;
import defpackage.u48;
import defpackage.u58;
import defpackage.xg9;
import defpackage.yq2;
import defpackage.zu0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class TabRowDefaults$PillIndicator$2 extends Lambda implements qp2 {
    public final /* synthetic */ l g;
    public final /* synthetic */ du1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ hx4 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$PillIndicator$2(l lVar, du1 du1Var, boolean z, hx4 hx4Var, long j, long j2, int i) {
        super(2);
        this.g = lVar;
        this.h = du1Var;
        this.i = z;
        this.j = hx4Var;
        this.k = j;
        this.l = j2;
        this.m = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        hx4 hx4Var;
        long j;
        qz0 qz0Var = (qz0) obj;
        ((Number) obj2).intValue();
        int iW = hs9.W(this.m | 1);
        qz0Var.c0(154996744);
        int i2 = iW & 6;
        du1 du1Var = this.h;
        if (i2 == 0) {
            i = (qz0Var.f(du1Var) ? 4 : 2) | iW;
        } else {
            i = iW;
        }
        int i3 = iW & 48;
        boolean z = this.i;
        if (i3 == 0) {
            i |= qz0Var.g(z) ? 32 : 16;
        }
        int i4 = i | 384;
        if ((iW & 3072) == 0) {
            i4 = i | 1408;
        }
        if ((iW & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 & 9363;
        hx4 hx4Var2 = this.j;
        long jA = this.k;
        long jB = this.l;
        if (i5 == 9362 && qz0Var.B()) {
            qz0Var.U();
            hx4Var = hx4Var2;
            j = jB;
        } else {
            qz0Var.W();
            if ((iW & 1) == 0 || qz0Var.z()) {
                u58 u58Var = d.a;
                jA = ((kv0) qz0Var.j(u58Var)).a();
                jB = zu0.b(0.4f, ((kv0) qz0Var.j(u58Var)).b());
                hx4Var2 = ex4.b;
            } else {
                qz0Var.U();
            }
            long j2 = jB;
            hx4 hx4Var3 = hx4Var2;
            long j3 = jA;
            qz0Var.r();
            float f = du1Var.c;
            final float f2 = du1Var.b;
            u48 u48VarA = androidx.compose.animation.core.b.a(f - du1Var.a, null, "PillIndicator.width", qz0Var, 384, 10);
            float f3 = du1Var.d - f2;
            final u48 u48VarA2 = androidx.compose.animation.core.b.a(du1Var.a, null, "PillIndicator.leftOffset", qz0Var, 384, 10);
            u48 u48VarA3 = androidx.compose.animation.o.a(z ? j3 : j2, null, "PillIndicator.pillColor", qz0Var, 384, 10);
            qz0Var = qz0Var;
            hx4 hx4VarO = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.b.c(hx4Var3, 1.0f), eq.i, 2);
            qz0Var.b0(-313038452);
            boolean zF = qz0Var.f(u48VarA2) | qz0Var.c(f2);
            Object objM = qz0Var.M();
            if (zF || objM == jz0.a) {
                objM = new dp2() { // from class: androidx.tv.material3.TabRowDefaults$PillIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.dp2
                    public final Object invoke(Object obj3) {
                        qj1 qj1Var = (qj1) obj3;
                        l lVar = l.a;
                        return new rq3(is3.a(qj1Var.b0(((au1) u48VarA2.getValue()).a), qj1Var.b0(f2)));
                    }
                };
                qz0Var.l0(objM);
            }
            qz0Var.q(false);
            hx4 hx4VarD = androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.l(ml9.t(hx4VarO, (dp2) objM), ((au1) u48VarA.getValue()).a), f3);
            long j4 = ((zu0) u48VarA3.getValue()).a;
            ka7 ka7Var = la7.a;
            s46 s46VarH = yq2.H(50);
            bg0.a(rq4.f(hx4VarD, j4, new ka7(s46VarH, s46VarH, s46VarH, s46VarH)).d(new xg9(-1.0f)), qz0Var, 0);
            hx4Var = hx4Var3;
            jA = j3;
            j = j2;
        }
        my6 my6VarS = qz0Var.s();
        if (my6VarS != null) {
            my6VarS.d = new TabRowDefaults$PillIndicator$2(this.g, du1Var, z, hx4Var, jA, j, iW);
        }
        return tx8.a;
    }
}
