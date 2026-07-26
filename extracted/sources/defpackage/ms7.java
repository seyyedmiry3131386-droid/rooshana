package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ms7 extends t70 {
    public final y31 D;
    public final l01 E;
    public final hx1 F;

    public ms7(b bVar, q04 q04Var, l01 l01Var, gf4 gf4Var) {
        super(bVar, q04Var);
        this.E = l01Var;
        y31 y31Var = new y31(bVar, this, new js7(q04Var.a, "__container", false), gf4Var);
        this.D = y31Var;
        List list = Collections.EMPTY_LIST;
        y31Var.b(list, list);
        rb4 rb4Var = this.p.x;
        if (rb4Var != null) {
            this.F = new hx1(this, this, rb4Var);
        }
    }

    @Override // defpackage.t70, defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.n, z);
    }

    @Override // defpackage.t70, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        PointF pointF = ag4.a;
        hx1 hx1Var = this.F;
        if (obj == 5 && hx1Var != null) {
            hx1Var.c.j(hh2Var);
            return;
        }
        if (obj == ag4.E && hx1Var != null) {
            hx1Var.c(hh2Var);
            return;
        }
        if (obj == ag4.F && hx1Var != null) {
            hx1Var.e.j(hh2Var);
            return;
        }
        if (obj == ag4.G && hx1Var != null) {
            hx1Var.f.j(hh2Var);
        } else {
            if (obj != ag4.H || hx1Var == null) {
                return;
            }
            hx1Var.g.j(hh2Var);
        }
    }

    @Override // defpackage.t70
    public final void j(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        hx1 hx1Var = this.F;
        if (hx1Var != null) {
            ex1Var = hx1Var.b(matrix, i);
        }
        this.D.g(canvas, matrix, i, ex1Var);
    }

    @Override // defpackage.t70
    public final ca7 k() {
        ca7 ca7Var = this.p.w;
        return ca7Var != null ? ca7Var : this.E.p.w;
    }

    @Override // defpackage.t70
    public final void p(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        this.D.c(jy3Var, i, arrayList, jy3Var2);
    }
}
