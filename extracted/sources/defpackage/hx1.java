package defpackage;

import android.graphics.Color;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public final class hx1 implements o70 {
    public final t70 a;
    public final t70 b;
    public final dv0 c;
    public final he2 d;
    public final he2 e;
    public final he2 f;
    public final he2 g;
    public Matrix h;

    public hx1(t70 t70Var, t70 t70Var2, rb4 rb4Var) {
        this.b = t70Var;
        this.a = t70Var2;
        s70 s70VarA = ((bj) rb4Var.b).a();
        this.c = (dv0) s70VarA;
        s70VarA.a(this);
        t70Var2.e(s70VarA);
        he2 he2VarA = ((cj) rb4Var.c).a();
        this.d = he2VarA;
        he2VarA.a(this);
        t70Var2.e(he2VarA);
        he2 he2VarA2 = ((cj) rb4Var.d).a();
        this.e = he2VarA2;
        he2VarA2.a(this);
        t70Var2.e(he2VarA2);
        he2 he2VarA3 = ((cj) rb4Var.e).a();
        this.f = he2VarA3;
        he2VarA3.a(this);
        t70Var2.e(he2VarA3);
        he2 he2VarA4 = ((cj) rb4Var.f).a();
        this.g = he2VarA4;
        he2VarA4.a(this);
        t70Var2.e(he2VarA4);
    }

    @Override // defpackage.o70
    public final void a() {
        this.b.a();
    }

    public final ex1 b(Matrix matrix, int i) {
        float fL = this.e.l() * 0.017453292f;
        float fFloatValue = ((Float) this.f.e()).floatValue();
        double d = fL;
        float fSin = ((float) Math.sin(d)) * fFloatValue;
        float fCos = ((float) Math.cos(d + 3.141592653589793d)) * fFloatValue;
        float fFloatValue2 = ((Float) this.g.e()).floatValue();
        int iIntValue = ((Integer) this.c.e()).intValue();
        int iArgb = Color.argb(Math.round((((Float) this.d.e()).floatValue() * i) / 255.0f), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue));
        ex1 ex1Var = new ex1();
        ex1Var.a = fFloatValue2 * 0.33f;
        ex1Var.b = fSin;
        ex1Var.c = fCos;
        ex1Var.d = iArgb;
        ex1Var.e = null;
        ex1Var.c(matrix);
        if (this.h == null) {
            this.h = new Matrix();
        }
        this.a.w.e().invert(this.h);
        ex1Var.c(this.h);
        return ex1Var;
    }

    public final void c(hh2 hh2Var) {
        this.d.j(new gx1(0, hh2Var));
    }
}
