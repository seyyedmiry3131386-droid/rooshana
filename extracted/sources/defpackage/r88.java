package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final class r88 extends f90 {
    public final t70 q;
    public final String r;
    public final boolean s;
    public final dv0 t;
    public x29 u;

    /* JADX WARN: Illegal instructions before constructor call */
    public r88(b bVar, t70 t70Var, xs7 xs7Var) {
        int iOrdinal = xs7Var.g.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = xs7Var.h.ordinal();
        super(bVar, t70Var, cap, iOrdinal2 != 0 ? iOrdinal2 != 1 ? iOrdinal2 != 2 ? null : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER, xs7Var.i, xs7Var.e, xs7Var.f, xs7Var.c, xs7Var.b);
        this.q = t70Var;
        this.r = xs7Var.a;
        this.s = xs7Var.j;
        s70 s70VarA = xs7Var.d.a();
        this.t = (dv0) s70VarA;
        s70VarA.a(this);
        t70Var.e(s70VarA);
    }

    @Override // defpackage.f90, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        PointF pointF = ag4.a;
        dv0 dv0Var = this.t;
        if (obj == 2) {
            dv0Var.j(hh2Var);
            return;
        }
        if (obj == ag4.I) {
            x29 x29Var = this.u;
            t70 t70Var = this.q;
            if (x29Var != null) {
                t70Var.o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.u = x29Var2;
            x29Var2.a(this);
            t70Var.e(dv0Var);
        }
    }

    @Override // defpackage.f90, defpackage.lw1
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        if (this.s) {
            return;
        }
        dv0 dv0Var = this.t;
        int iL = dv0Var.l(dv0Var.c.c(), dv0Var.c());
        uz3 uz3Var = this.i;
        uz3Var.setColor(iL);
        x29 x29Var = this.u;
        if (x29Var != null) {
            uz3Var.setColorFilter((ColorFilter) x29Var.e());
        }
        super.g(canvas, matrix, i, ex1Var);
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.r;
    }
}
