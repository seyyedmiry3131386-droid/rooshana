package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class d47 implements lw1, v26, lv2, o70, ly3 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final b c;
    public final t70 d;
    public final String e;
    public final boolean f;
    public final he2 g;
    public final he2 h;
    public final kq8 i;
    public y31 j;

    public d47(b bVar, t70 t70Var, zy6 zy6Var) {
        this.c = bVar;
        this.d = t70Var;
        this.e = (String) zy6Var.b;
        this.f = zy6Var.d;
        he2 he2VarA = zy6Var.c.a();
        this.g = he2VarA;
        t70Var.e(he2VarA);
        he2VarA.a(this);
        he2 he2VarA2 = ((cj) zy6Var.e).a();
        this.h = he2VarA2;
        t70Var.e(he2VarA2);
        he2VarA2.a(this);
        hj hjVar = (hj) zy6Var.f;
        hjVar.getClass();
        kq8 kq8Var = new kq8(hjVar);
        this.i = kq8Var;
        kq8Var.a(t70Var);
        kq8Var.b(this);
    }

    @Override // defpackage.o70
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
        for (int i2 = 0; i2 < this.j.i.size(); i2++) {
            r31 r31Var = (r31) this.j.i.get(i2);
            if (r31Var instanceof ly3) {
                aw4.g(jy3Var, i, arrayList, jy3Var2, (ly3) r31Var);
            }
        }
    }

    @Override // defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        this.j.d(rectF, matrix, z);
    }

    @Override // defpackage.lv2
    public final void e(ListIterator listIterator) {
        if (this.j != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((r31) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.j = new y31(this.c, this.d, "Repeater", this.f, arrayList, null);
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        if (this.i.c(hh2Var, obj)) {
            return;
        }
        if (obj == ag4.s) {
            this.g.j(hh2Var);
        } else if (obj == ag4.t) {
            this.h.j(hh2Var);
        }
    }

    @Override // defpackage.lw1
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        kq8 kq8Var = this.i;
        float fFloatValue3 = ((Float) kq8Var.v.e()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) kq8Var.w.e()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(kq8Var.f(f + fFloatValue2));
            this.j.g(canvas, matrix2, (int) (aw4.f(fFloatValue3, fFloatValue4, f / fFloatValue) * i), ex1Var);
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.v26
    public final Path m() {
        Path pathM = this.j.m();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.g.e()).floatValue();
        float fFloatValue2 = ((Float) this.h.e()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixF = this.i.f(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixF);
            path.addPath(pathM, matrix);
        }
        return path;
    }
}
