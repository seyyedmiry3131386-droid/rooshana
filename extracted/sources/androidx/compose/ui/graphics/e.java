package androidx.compose.ui.graphics;

import androidx.compose.ui.node.f;
import androidx.compose.ui.node.j;
import defpackage.a96;
import defpackage.b96;
import defpackage.bl4;
import defpackage.dl4;
import defpackage.dp2;
import defpackage.el4;
import defpackage.f14;
import defpackage.gx4;
import defpackage.in7;
import defpackage.lq8;
import defpackage.nn7;
import defpackage.tx8;
import defpackage.xr7;
import defpackage.y40;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
public final class e extends gx4 implements f14, in7 {
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public long t;
    public xr7 u;
    public boolean v;
    public long w;
    public long x;
    public int y;
    public dp2 z;

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.f14
    public final /* synthetic */ int a(j jVar, yk4 yk4Var, int i) {
        return f.d(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int b(j jVar, yk4 yk4Var, int i) {
        return f.c(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final dl4 c(el4 el4Var, yk4 yk4Var, long j) {
        final b96 b96VarT = yk4Var.t(j);
        return el4Var.D(b96VarT.a, b96VarT.b, kotlin.collections.b.I(), new dp2() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                a96.l((a96) obj, b96VarT, 0, 0, this.z, 4);
                return tx8.a;
            }
        });
    }

    @Override // defpackage.f14
    public final /* synthetic */ int e(j jVar, yk4 yk4Var, int i) {
        return f.b(this, jVar, yk4Var, i);
    }

    @Override // defpackage.f14
    public final /* synthetic */ int f(j jVar, yk4 yk4Var, int i) {
        return f.a(this, jVar, yk4Var, i);
    }

    @Override // defpackage.in7
    public final boolean h() {
        return false;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        if (this.v) {
            androidx.compose.ui.semantics.f.g(nn7Var, this.u);
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean m0() {
        return false;
    }

    @Override // defpackage.gx4
    public final boolean p0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.o);
        sb.append(", scaleY=");
        sb.append(this.p);
        sb.append(", alpha = ");
        sb.append(this.q);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.r);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.s);
        sb.append(", transformOrigin=");
        sb.append((Object) lq8.d(this.t));
        sb.append(", shape=");
        sb.append(this.u);
        sb.append(", clip=");
        sb.append(this.v);
        sb.append(", renderEffect=null, ambientShadowColor=");
        bl4.F(this.w, ", spotShadowColor=", sb);
        bl4.F(this.x, ", compositingStrategy=CompositingStrategy(value=0), blendMode=", sb);
        sb.append((Object) y40.L(this.y));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
