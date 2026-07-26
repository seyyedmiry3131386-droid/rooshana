package defpackage;

import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.h;
import androidx.compose.ui.node.l;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class o14 implements w98, el4 {
    public final /* synthetic */ r14 a;
    public final /* synthetic */ g b;

    public o14(g gVar) {
        this.b = gVar;
        this.a = gVar.h;
    }

    @Override // defpackage.el4
    public final dl4 D(int i, int i2, Map map, dp2 dp2Var) {
        return this.a.Z(i, i2, map, null, dp2Var);
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return this.a.F(f);
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return this.a.J(i);
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / this.a.getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return this.a.c;
    }

    @Override // defpackage.es3
    public final boolean Q() {
        return this.a.Q();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return this.a.getDensity() * f;
    }

    @Override // defpackage.el4
    public final dl4 Z(int i, int i2, Map map, dp2 dp2Var, dp2 dp2Var2) {
        return this.a.Z(i, i2, map, dp2Var, dp2Var2);
    }

    @Override // defpackage.qj1
    public final int b0(float f) {
        r14 r14Var = this.a;
        r14Var.getClass();
        return o40.a(r14Var, f);
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return this.a.b;
    }

    @Override // defpackage.es3
    public final LayoutDirection getLayoutDirection() {
        return this.a.a;
    }

    @Override // defpackage.qj1
    public final long h0(long j) {
        r14 r14Var = this.a;
        r14Var.getClass();
        return o40.d(j, r14Var);
    }

    @Override // defpackage.qj1
    public final float j0(long j) {
        r14 r14Var = this.a;
        r14Var.getClass();
        return o40.c(j, r14Var);
    }

    @Override // defpackage.qj1
    public final long o(long j) {
        r14 r14Var = this.a;
        r14Var.getClass();
        return o40.b(j, r14Var);
    }

    @Override // defpackage.w98
    public final List r(qp2 qp2Var, Object obj) {
        g gVar = this.b;
        h hVar = gVar.a;
        rb5 rb5Var = gVar.g;
        h hVar2 = (h) rb5Var.g(obj);
        if (hVar2 != null && ((zb5) ((kb5) hVar.r()).b).j(hVar2) < gVar.d) {
            return hVar2.o();
        }
        rb5 rb5Var2 = gVar.l;
        rb5 rb5Var3 = gVar.j;
        zb5 zb5Var = gVar.m;
        if (zb5Var.c < gVar.e) {
            rn3.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        h hVar3 = (h) rb5Var.g(obj);
        int i = zb5Var.c;
        int i2 = gVar.e;
        if (i == i2) {
            zb5Var.b(obj);
        } else {
            Object[] objArr = zb5Var.a;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        gVar.e++;
        boolean zB = rb5Var3.b(obj);
        if (zB || hVar3 != null) {
            if (!zB && hVar3 != null) {
                gVar.j(((zb5) ((kb5) hVar.r()).b).j(hVar3), ((zb5) ((kb5) hVar.r()).b).c);
                gVar.o++;
                rb5Var.k(obj);
                rb5Var3.m(obj, hVar3);
                rb5Var2.m(obj, gVar.f(obj));
                if (hVar.U()) {
                    gVar.h();
                }
            }
            h hVar4 = (h) rb5Var3.g(obj);
            p14 p14Var = hVar4 != null ? (p14) gVar.f.g(hVar4) : null;
            if (p14Var != null && p14Var.d) {
                gVar.m(hVar4, obj, false, qp2Var);
            }
        } else {
            gVar.k(obj, qp2Var, false);
            rb5Var2.m(obj, gVar.f(obj));
        }
        h hVar5 = (h) rb5Var3.g(obj);
        if (hVar5 == null) {
            return EmptyList.a;
        }
        List listE0 = hVar5.z().e0();
        kb5 kb5Var = (kb5) listE0;
        int i3 = ((zb5) kb5Var.b).c;
        for (int i4 = 0; i4 < i3; i4++) {
            ((l) kb5Var.get(i4)).f.b = true;
        }
        return listE0;
    }

    @Override // defpackage.qj1
    public final float s(long j) {
        r14 r14Var = this.a;
        r14Var.getClass();
        return dw1.b(j, r14Var);
    }
}
