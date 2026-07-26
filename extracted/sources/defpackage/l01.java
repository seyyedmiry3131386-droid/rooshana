package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l01 extends t70 {
    public s70 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final mr5 I;
    public final dc0 J;
    public float K;
    public boolean L;
    public final hx1 M;

    public l01(b bVar, q04 q04Var, List list, gf4 gf4Var) {
        int i;
        t70 t70Var;
        t70 l01Var;
        super(bVar, q04Var);
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new mr5();
        this.J = new dc0(8, (byte) 0);
        this.L = true;
        cj cjVar = q04Var.s;
        if (cjVar != null) {
            he2 he2VarA = cjVar.a();
            this.D = he2VarA;
            e(he2VarA);
            this.D.a(this);
        } else {
            this.D = null;
        }
        ue4 ue4Var = new ue4(gf4Var.j.size());
        int size = list.size() - 1;
        t70 t70Var2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            q04 q04Var2 = (q04) list.get(size);
            int iOrdinal = q04Var2.e.ordinal();
            if (iOrdinal == 0) {
                l01Var = new l01(bVar, q04Var2, (List) gf4Var.c.get(q04Var2.g), gf4Var);
            } else if (iOrdinal == 1) {
                l01Var = new l18(bVar, q04Var2);
            } else if (iOrdinal == 2) {
                l01Var = new fi3(bVar, q04Var2);
            } else if (iOrdinal == 3) {
                l01Var = new qp5(bVar, q04Var2);
            } else if (iOrdinal == 4) {
                l01Var = new ms7(bVar, q04Var2, this, gf4Var);
            } else if (iOrdinal != 5) {
                qd4.b("Unknown layer type " + q04Var2.e);
                l01Var = null;
            } else {
                l01Var = new oi8(bVar, q04Var2);
            }
            if (l01Var != null) {
                ue4Var.i(l01Var.p.d, l01Var);
                if (t70Var2 != null) {
                    t70Var2.s = l01Var;
                    t70Var2 = null;
                } else {
                    this.E.add(0, l01Var);
                    int iOrdinal2 = q04Var2.u.ordinal();
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        t70Var2 = l01Var;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < ue4Var.k(); i++) {
            t70 t70Var3 = (t70) ue4Var.d(ue4Var.h(i));
            if (t70Var3 != null && (t70Var = (t70) ue4Var.d(t70Var3.p.f)) != null) {
                t70Var3.t = t70Var;
            }
        }
        rb4 rb4Var = this.p.x;
        if (rb4Var != null) {
            this.M = new hx1(this, this, rb4Var);
        }
    }

    @Override // defpackage.t70, defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((t70) arrayList.get(size)).d(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.t70, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        if (obj == ag4.C) {
            x29 x29Var = new x29(hh2Var, null);
            this.D = x29Var;
            x29Var.a(this);
            e(this.D);
            return;
        }
        hx1 hx1Var = this.M;
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
        Canvas canvasE;
        boolean z = false;
        hx1 hx1Var = this.M;
        boolean z2 = (ex1Var == null && hx1Var == null) ? false : true;
        b bVar = this.o;
        boolean z3 = bVar.t;
        ArrayList<t70> arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && bVar.u)) {
            z = true;
        }
        int i2 = z ? 255 : i;
        if (hx1Var != null) {
            ex1Var = hx1Var.b(matrix, i2);
        }
        boolean z4 = this.L;
        q04 q04Var = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(q04Var.c)) {
            rectF.set(0.0f, 0.0f, q04Var.o, q04Var.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            for (t70 t70Var : arrayList) {
                RectF rectF2 = this.H;
                t70Var.d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        mr5 mr5Var = this.I;
        if (z) {
            dc0 dc0Var = this.J;
            dc0Var.c = null;
            dc0Var.b = i;
            if (ex1Var != null) {
                if (Color.alpha(ex1Var.d) > 0) {
                    dc0Var.c = ex1Var;
                } else {
                    dc0Var.c = null;
                }
                ex1Var = null;
            }
            canvasE = mr5Var.e(canvas, rectF, dc0Var);
        } else {
            canvasE = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((t70) arrayList.get(size)).g(canvasE, matrix, i2, ex1Var);
            }
        }
        if (z) {
            mr5Var.c();
        }
        canvas.restore();
    }

    @Override // defpackage.t70
    public final void p(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((t70) arrayList2.get(i2)).c(jy3Var, i, arrayList, jy3Var2);
            i2++;
        }
    }

    @Override // defpackage.t70
    public final void q(boolean z) {
        super.q(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((t70) it.next()).q(z);
        }
    }

    @Override // defpackage.t70
    public final void r(float f) {
        this.K = f;
        super.r(f);
        s70 s70Var = this.D;
        q04 q04Var = this.p;
        if (s70Var != null) {
            gf4 gf4Var = this.o.a;
            f = ((((Float) s70Var.e()).floatValue() * q04Var.b.n) - q04Var.b.l) / ((gf4Var.m - gf4Var.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = q04Var.n;
            gf4 gf4Var2 = q04Var.b;
            f -= f2 / (gf4Var2.m - gf4Var2.l);
        }
        if (q04Var.m != 0.0f && !"__container".equals(q04Var.c)) {
            f /= q04Var.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((t70) arrayList.get(size)).r(f);
        }
    }
}
