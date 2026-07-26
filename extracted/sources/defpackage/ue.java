package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: classes.dex */
public final class ue implements tm0 {
    public Canvas a = ve.a;
    public Rect b;
    public Rect c;

    @Override // defpackage.tm0
    public final void a(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.tm0
    public final void b(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.tm0
    public final void c(sy6 sy6Var, jx9 jx9Var) {
        this.a.saveLayer(sy6Var.a, sy6Var.b, sy6Var.c, sy6Var.d, (Paint) jx9Var.b, 31);
    }

    @Override // defpackage.tm0
    public final void d(float f, float f2, float f3, float f4, float f5, float f6, jx9 jx9Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void e() {
        this.a.save();
    }

    @Override // defpackage.tm0
    public final void f() {
        hs9.C(this.a, false);
    }

    @Override // defpackage.tm0
    public final void g(float f, float f2, float f3, float f4, jx9 jx9Var) {
        this.a.drawRect(f, f2, f3, f4, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void h(sy6 sy6Var, jx9 jx9Var) {
        g(sy6Var.a, sy6Var.b, sy6Var.c, sy6Var.d, jx9Var);
    }

    @Override // defpackage.tm0
    public final void i(u26 u26Var) {
        Canvas canvas = this.a;
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((eh) u26Var).a, Region.Op.INTERSECT);
    }

    @Override // defpackage.tm0
    public final void j(float[] fArr) {
        if (bt2.E(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        bt2.S(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.tm0
    public final void k(float f, long j, jx9 jx9Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, boolean z, jx9 jx9Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, z, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void m(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // defpackage.tm0
    public final void n(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.tm0
    public final void o() {
        this.a.restore();
    }

    @Override // defpackage.tm0
    public final void p(long j, long j2, jx9 jx9Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void q(u26 u26Var, jx9 jx9Var) {
        Canvas canvas = this.a;
        if (!(u26Var instanceof eh)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((eh) u26Var).a, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void r(og ogVar, long j, long j2, long j3, jx9 jx9Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapC = fz.c(ogVar);
        Rect rect = this.b;
        js3.m(rect);
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        js3.m(rect2);
        int i3 = (int) 0;
        rect2.left = i3;
        int i4 = (int) 0;
        rect2.top = i4;
        rect2.right = i3 + ((int) (j3 >> 32));
        rect2.bottom = i4 + ((int) (4294967295L & j3));
        canvas.drawBitmap(bitmapC, rect, rect2, (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void s(sy6 sy6Var) {
        m(sy6Var.a, sy6Var.b, sy6Var.c, sy6Var.d, 1);
    }

    @Override // defpackage.tm0
    public final void t(og ogVar, jx9 jx9Var) {
        this.a.drawBitmap(fz.c(ogVar), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), (Paint) jx9Var.b);
    }

    @Override // defpackage.tm0
    public final void u() {
        hs9.C(this.a, true);
    }
}
