package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.node.j;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import androidx.compose.ui.semantics.g;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class pg7 extends gx4 implements f14, in7 {
    public tg7 o;
    public boolean p;

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.f14
    public final int a(j jVar, yk4 yk4Var, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return yk4Var.l(i);
    }

    @Override // defpackage.f14
    public final int b(j jVar, yk4 yk4Var, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return yk4Var.P(i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        tt3.q(j, this.p ? Orientation.a : Orientation.b);
        b96 b96VarT = yk4Var.t(h31.a(j, 0, this.p ? h31.h(j) : Integer.MAX_VALUE, 0, this.p ? Integer.MAX_VALUE : h31.g(j), 5));
        int i = b96VarT.a;
        int iH = h31.h(j);
        if (i > iH) {
            i = iH;
        }
        int i2 = b96VarT.b;
        int iG = h31.g(j);
        if (i2 > iG) {
            i2 = iG;
        }
        int i3 = b96VarT.b - i2;
        int i4 = b96VarT.a - i;
        if (!this.p) {
            i3 = i4;
        }
        tg7 tg7Var = this.o;
        tg7Var.e.i(i3);
        c08 c08VarK = ql3.k();
        dp2 dp2VarE = c08VarK != null ? c08VarK.e() : null;
        c08 c08VarM = ql3.m(c08VarK);
        try {
            if (tg7Var.f() > i3) {
                tg7Var.a.i(i3);
            }
            ql3.u(c08VarK, c08VarM, dp2VarE);
            this.o.b.i(this.p ? i2 : i);
            this.o.c.i(this.p ? b96VarT.b : b96VarT.a);
            return el4Var.D(i, i2, b.I(), new c80(this, i3, b96VarT, 5));
        } catch (Throwable th) {
            ql3.u(c08VarK, c08VarM, dp2VarE);
            throw th;
        }
    }

    @Override // defpackage.f14
    public final int e(j jVar, yk4 yk4Var, int i) {
        if (this.p) {
            i = Integer.MAX_VALUE;
        }
        return yk4Var.n(i);
    }

    @Override // defpackage.f14
    public final int f(j jVar, yk4 yk4Var, int i) {
        if (!this.p) {
            i = Integer.MAX_VALUE;
        }
        return yk4Var.a(i);
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        f.i(nn7Var);
        final int i = 0;
        final int i2 = 1;
        gg7 gg7Var = new gg7(new bp2(this) { // from class: og7
            public final /* synthetic */ pg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                int iF;
                switch (i) {
                    case 0:
                        iF = this.b.o.f();
                        break;
                    default:
                        iF = this.b.o.e.h();
                        break;
                }
                return Float.valueOf(iF);
            }
        }, new bp2(this) { // from class: og7
            public final /* synthetic */ pg7 b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                int iF;
                switch (i2) {
                    case 0:
                        iF = this.b.o.f();
                        break;
                    default:
                        iF = this.b.o.e.h();
                        break;
                }
                return Float.valueOf(iF);
            }
        });
        if (this.p) {
            g gVar = d.v;
            ox3 ox3Var = f.a[13];
            nn7Var.a(gVar, gg7Var);
        } else {
            g gVar2 = d.u;
            ox3 ox3Var2 = f.a[12];
            nn7Var.a(gVar2, gg7Var);
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }
}
