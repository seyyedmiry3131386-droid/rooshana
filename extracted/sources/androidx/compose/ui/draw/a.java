package androidx.compose.ui.draw;

import androidx.compose.ui.node.i;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.bp2;
import defpackage.br9;
import defpackage.dp2;
import defpackage.gv1;
import defpackage.gx4;
import defpackage.jr5;
import defpackage.js3;
import defpackage.qj1;
import defpackage.ql4;
import defpackage.rf0;
import defpackage.sh0;
import defpackage.t61;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.y40;

/* JADX INFO: loaded from: classes.dex */
public final class a extends gx4 implements jr5, sh0, gv1 {
    public final b o;
    public boolean p;
    public dp2 q;

    public a(b bVar, dp2 dp2Var) {
        this.o = bVar;
        this.q = dp2Var;
        bVar.a = this;
    }

    public final void C0() {
        this.p = false;
        this.o.b = null;
        rf0.z(this);
    }

    @Override // defpackage.gv1
    public final void H() {
        C0();
    }

    @Override // defpackage.gv1
    public final void T(i iVar) {
        boolean z = this.p;
        final b bVar = this.o;
        if (!z) {
            bVar.b = null;
            br9.G(this, new bp2() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.bp2
                public final Object invoke() {
                    this.g.q.invoke(bVar);
                    return tx8.a;
                }
            });
            if (bVar.b == null) {
                throw t61.r("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        ql4 ql4Var = bVar.b;
        js3.m(ql4Var);
        ((dp2) ql4Var.b).invoke(iVar);
    }

    @Override // defpackage.jr5
    public final void Y() {
        C0();
    }

    @Override // defpackage.sh0
    public final long d() {
        return tt3.M(y40.E(this, 4).c);
    }

    @Override // defpackage.sh0
    public final qj1 getDensity() {
        return y40.H(this).A;
    }

    @Override // defpackage.sh0
    public final LayoutDirection getLayoutDirection() {
        return y40.H(this).B;
    }

    @Override // defpackage.gx4
    public final void t0() {
        C0();
    }

    @Override // defpackage.gx4
    public final void u0() {
    }

    @Override // defpackage.gx4
    public final void v0() {
        C0();
    }

    @Override // defpackage.gx4
    public final void w0() {
        C0();
    }
}
