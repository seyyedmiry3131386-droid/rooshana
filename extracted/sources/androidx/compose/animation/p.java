package androidx.compose.animation;

import androidx.compose.ui.unit.LayoutDirection;
import defpackage.a96;
import defpackage.b96;
import defpackage.bt2;
import defpackage.c26;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.fs3;
import defpackage.gy7;
import defpackage.j31;
import defpackage.pk;
import defpackage.qp2;
import defpackage.s08;
import defpackage.sk;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.yk4;
import defpackage.zq3;

/* JADX INFO: loaded from: classes.dex */
public final class p extends fs3 {
    public sk p;
    public qp2 q;
    public long r;
    public long s;
    public boolean t;
    public final wb5 u;

    public p(sk skVar, qp2 qp2Var) {
        super(1);
        this.p = skVar;
        this.q = qp2Var;
        this.r = pk.a;
        this.s = j31.b(0, 0, 15);
        this.u = androidx.compose.runtime.g.h(null);
    }

    @Override // defpackage.fs3, defpackage.f14
    public final dl4 c(final el4 el4Var, yk4 yk4Var, long j) {
        b96 b96VarT;
        char c;
        long j2;
        gy7 gy7Var;
        long jD;
        gy7 gy7Var2;
        if (el4Var.Q()) {
            this.s = j;
            this.t = true;
            b96VarT = yk4Var.t(j);
        } else {
            b96VarT = yk4Var.t(this.t ? this.s : j);
        }
        final b96 b96Var = b96VarT;
        long j3 = (((long) b96Var.b) & 4294967295L) | (((long) b96Var.a) << 32);
        if (el4Var.Q()) {
            this.r = j3;
            c = ' ';
            jD = j3;
            j2 = jD;
        } else {
            long j4 = !zq3.b(this.r, pk.a) ? this.r : j3;
            wb5 wb5Var = this.u;
            gy7 gy7Var3 = (gy7) ((s08) wb5Var).getValue();
            if (gy7Var3 != null) {
                androidx.compose.animation.core.a aVar = gy7Var3.a;
                c = ' ';
                j2 = j3;
                boolean z = (zq3.b(j4, ((zq3) aVar.d()).a) || ((Boolean) ((s08) aVar.d).getValue()).booleanValue()) ? false : true;
                if (!zq3.b(j4, ((zq3) ((s08) aVar.e).getValue()).a) || z) {
                    gy7Var3.b = ((zq3) aVar.d()).a;
                    gy7Var2 = gy7Var3;
                    bt2.G(o0(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(gy7Var2, j4, this, null), 3);
                } else {
                    gy7Var2 = gy7Var3;
                }
                gy7Var = gy7Var2;
            } else {
                c = ' ';
                j2 = j3;
                long j5 = 1;
                gy7Var = new gy7(new androidx.compose.animation.core.a(new zq3(j4), c26.o, new zq3((j5 << 32) | (j5 & 4294967295L)), 8), j4);
            }
            ((s08) wb5Var).setValue(gy7Var);
            jD = j31.d(j, ((zq3) gy7Var.a.d()).a);
        }
        final int i = (int) (jD >> c);
        final int i2 = (int) (jD & 4294967295L);
        final long j6 = j2;
        return el4Var.D(i, i2, kotlin.collections.b.I(), new dp2(this) { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96 a96Var = (a96) obj;
                long j7 = (((long) i) << 32) | (((long) i2) & 4294967295L);
                LayoutDirection layoutDirection = el4Var.getLayoutDirection();
                long j8 = j6;
                float f = (((int) (j7 >> 32)) - ((int) (j8 >> 32))) / 2.0f;
                float f2 = (((int) (j7 & 4294967295L)) - ((int) (j8 & 4294967295L))) / 2.0f;
                float f3 = layoutDirection == LayoutDirection.a ? -1.0f : (-1) * (-1.0f);
                float f4 = 1;
                float f5 = (f3 + f4) * f;
                a96.i(a96Var, b96Var, (((long) Math.round((f4 - 1.0f) * f2)) & 4294967295L) | (((long) Math.round(f5)) << 32));
                return tx8.a;
            }
        });
    }

    @Override // defpackage.gx4
    public final void s0() {
        this.r = pk.a;
        this.t = false;
    }

    @Override // defpackage.gx4
    public final void w0() {
        ((s08) this.u).setValue(null);
    }
}
