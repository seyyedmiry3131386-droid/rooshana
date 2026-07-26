package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Pair;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class nr0 extends ow1 {
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public boolean n;
    public float o;
    public final RectF p;
    public final Pair q;

    public nr0(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
        this.p = new RectF();
        this.q = new Pair(new nw1(), new nw1());
    }

    @Override // defpackage.ow1
    public final void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2) {
        float fWidth = rect.width() / k();
        float fHeight = rect.height() / k();
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.a;
        float f2 = (circularProgressIndicatorSpec.p / 2.0f) + circularProgressIndicatorSpec.q;
        canvas.translate((f2 * fWidth) + rect.left, (f2 * fHeight) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(fWidth, fHeight);
        if (circularProgressIndicatorSpec.r != 0) {
            canvas.scale(1.0f, -1.0f);
            if (Build.VERSION.SDK_INT == 29) {
                canvas.rotate(0.1f);
            }
        }
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        this.f = circularProgressIndicatorSpec.a * f;
        this.g = Math.min(r9 / 2, circularProgressIndicatorSpec.a()) * f;
        this.h = circularProgressIndicatorSpec.l * f;
        int i = circularProgressIndicatorSpec.p;
        int i2 = circularProgressIndicatorSpec.a;
        float f4 = (i - i2) / 2.0f;
        this.i = f4;
        if (z || z2) {
            float f5 = ((1.0f - f) * i2) / 2.0f;
            if ((z && circularProgressIndicatorSpec.g == 2) || (z2 && circularProgressIndicatorSpec.h == 1)) {
                this.i = f4 + f5;
            } else if ((z && circularProgressIndicatorSpec.g == 1) || (z2 && circularProgressIndicatorSpec.h == 2)) {
                this.i = f4 - f5;
            }
        }
        if (z2 && circularProgressIndicatorSpec.h == 3) {
            this.o = f;
        } else {
            this.o = 1.0f;
        }
    }

    @Override // defpackage.ow1
    public final void c(Canvas canvas, Paint paint, mw1 mw1Var, int i) {
        int iJ = m91.j(mw1Var.c, i);
        canvas.save();
        canvas.rotate(mw1Var.g);
        this.n = mw1Var.h;
        float f = mw1Var.a;
        float f2 = mw1Var.b;
        int i2 = mw1Var.d;
        i(canvas, paint, f, f2, iJ, i2, i2, mw1Var.e, mw1Var.f, true);
        canvas.restore();
    }

    @Override // defpackage.ow1
    public final void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3) {
        int iJ = m91.j(i, i2);
        this.n = false;
        i(canvas, paint, f, f2, iJ, i3, i3, 0.0f, 0.0f, false);
    }

    @Override // defpackage.ow1
    public final int e() {
        return k();
    }

    @Override // defpackage.ow1
    public final int f() {
        return k();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ow1
    public final void g() {
        int i;
        Path path = this.b;
        path.rewind();
        path.moveTo(1.0f, 0.0f);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= 2) {
                break;
            }
            path.cubicTo(1.0f, 0.5522848f, 0.5522848f, 1.0f, 0.0f, 1.0f);
            path.cubicTo(-0.5522848f, 1.0f, -1.0f, 0.5522848f, -1.0f, 0.0f);
            path.cubicTo(-1.0f, -0.5522848f, -0.5522848f, -1.0f, 0.0f, -1.0f);
            path.cubicTo(0.5522848f, -1.0f, 1.0f, -0.5522848f, 1.0f, 0.0f);
            i3++;
        }
        Matrix matrix = this.e;
        matrix.reset();
        float f = this.i;
        matrix.setScale(f, f);
        path.transform(matrix);
        boolean zB = ((CircularProgressIndicatorSpec) this.a).b(this.n);
        PathMeasure pathMeasure = this.d;
        if (zB) {
            pathMeasure.setPath(path, false);
            float f2 = this.k;
            path.rewind();
            float length = pathMeasure.getLength();
            float f3 = 2.0f;
            int iMax = Math.max(3, (int) ((length / (this.n ? r2.j : r2.k)) / 2.0f)) * 2;
            this.j = length / iMax;
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < iMax; i4++) {
                nw1 nw1Var = new nw1();
                float f4 = i4;
                pathMeasure.getPosTan(this.j * f4, nw1Var.a, nw1Var.b);
                nw1 nw1Var2 = new nw1();
                float f5 = this.j;
                pathMeasure.getPosTan((f5 / 2.0f) + (f4 * f5), nw1Var2.a, nw1Var2.b);
                arrayList.add(nw1Var);
                nw1Var2.a(f2 * 2.0f);
                arrayList.add(nw1Var2);
            }
            arrayList.add((nw1) arrayList.get(0));
            nw1 nw1Var3 = (nw1) arrayList.get(0);
            float[] fArr = nw1Var3.a;
            char c = 1;
            path.moveTo(fArr[0], fArr[1]);
            int i5 = 1;
            while (i5 < arrayList.size()) {
                nw1 nw1Var4 = (nw1) arrayList.get(i5);
                float f6 = (this.j / f3) * 0.48f;
                float[] fArr2 = nw1Var3.a;
                float[] fArr3 = new float[i];
                System.arraycopy(fArr2, i2, fArr3, i2, i);
                System.arraycopy(nw1Var3.b, i2, new float[i], i2, i);
                new Matrix();
                float[] fArr4 = nw1Var4.a;
                float[] fArr5 = new float[i];
                System.arraycopy(fArr4, i2, fArr5, i2, i);
                System.arraycopy(nw1Var4.b, i2, new float[i], i2, i);
                new Matrix();
                char c2 = c;
                float fAtan2 = (float) Math.atan2(r6[c], r6[i2]);
                double d = fArr3[i2];
                double d2 = f6;
                int i6 = i2;
                double d3 = fAtan2;
                fArr3[i6] = (float) ((Math.cos(d3) * d2) + d);
                fArr3[c2] = (float) ((Math.sin(d3) * d2) + ((double) fArr3[c2]));
                double d4 = -f6;
                double dAtan2 = (float) Math.atan2(r11[c2], r11[i6]);
                fArr5[i6] = (float) ((Math.cos(dAtan2) * d4) + ((double) fArr5[i6]));
                float fSin = (float) ((Math.sin(dAtan2) * d4) + ((double) fArr5[c2]));
                fArr5[c2] = fSin;
                float f7 = fArr3[i6];
                float f8 = fArr3[c2];
                float f9 = fArr5[i6];
                float[] fArr6 = nw1Var4.a;
                path.cubicTo(f7, f8, f9, fSin, fArr6[i6], fArr6[c2]);
                i5++;
                nw1Var3 = nw1Var4;
                c = c2;
                i2 = i6;
                pathMeasure = pathMeasure;
                i = 2;
                f3 = 2.0f;
            }
        }
        pathMeasure.setPath(path, i2);
    }

    public final void i(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3, float f3, float f4, boolean z) {
        float f5;
        float f6;
        Canvas canvas2;
        float f7 = f2 >= f ? f2 - f : (f2 + 1.0f) - f;
        float f8 = f % 1.0f;
        if (f8 < 0.0f) {
            f8 += 1.0f;
        }
        if (this.o < 1.0f) {
            float f9 = f8 + f7;
            if (f9 > 1.0f) {
                i(canvas, paint, f8, 1.0f, i, i2, 0, f3, f4, z);
                i(canvas, paint, 1.0f, f9, i, 0, i3, f3, f4, z);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.g / this.i);
        float f10 = f7 - 0.99f;
        if (f10 >= 0.0f) {
            float f11 = ((f10 * degrees) / 180.0f) / 0.01f;
            f7 += f11;
            if (!z) {
                f8 -= f11 / 2.0f;
            }
        }
        float fP0 = yq2.p0(1.0f - this.o, 1.0f, f8);
        float fP02 = yq2.p0(0.0f, this.o, f7);
        float degrees2 = (float) Math.toDegrees(i2 / this.i);
        float degrees3 = ((fP02 * 360.0f) - degrees2) - ((float) Math.toDegrees(i3 / this.i));
        float f12 = (fP0 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.a;
        boolean z2 = circularProgressIndicatorSpec.b(this.n) && z && f3 > 0.0f;
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStrokeWidth(this.f);
        float f13 = this.g * 2.0f;
        float f14 = degrees * 2.0f;
        PathMeasure pathMeasure = this.d;
        if (degrees3 < f14) {
            float f15 = degrees3 / f14;
            float f16 = (degrees * f15) + f12;
            nw1 nw1Var = new nw1();
            if (z2) {
                float length = (pathMeasure.getLength() * (f16 / 360.0f)) / 2.0f;
                float f17 = this.h * f3;
                float f18 = this.i;
                if (f18 != this.m || f17 != this.k) {
                    this.k = f17;
                    this.m = f18;
                    g();
                }
                pathMeasure.getPosTan(length, nw1Var.a, nw1Var.b);
            } else {
                nw1Var.c(f16 + 90.0f);
                nw1Var.a(-this.i);
            }
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, nw1Var, f13, this.f, f15);
            return;
        }
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(circularProgressIndicatorSpec.c() ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f19 = f12 + degrees;
        float f20 = degrees3 - f14;
        Pair pair = this.q;
        ((nw1) pair.first).b();
        ((nw1) pair.second).b();
        if (z2) {
            float f21 = f19 / 360.0f;
            float f22 = f20 / 360.0f;
            float f23 = this.h * f3;
            int i4 = this.n ? circularProgressIndicatorSpec.j : circularProgressIndicatorSpec.k;
            float f24 = this.i;
            if (f24 != this.m || f23 != this.k || i4 != this.l) {
                this.k = f23;
                this.l = i4;
                this.m = f24;
                g();
            }
            Path path = this.c;
            path.rewind();
            float fR = at2.R(f22, 0.0f, 1.0f);
            if (circularProgressIndicatorSpec.b(this.n)) {
                f5 = 1.0f;
                float f25 = f4 / ((float) ((((double) this.i) * 6.283185307179586d) / ((double) this.j)));
                f21 += f25;
                f6 = 0.0f - (f25 * 360.0f);
            } else {
                f5 = 1.0f;
                f6 = 0.0f;
            }
            float f26 = f21 % f5;
            float length2 = (pathMeasure.getLength() * f26) / 2.0f;
            float length3 = (pathMeasure.getLength() * (f26 + fR)) / 2.0f;
            pathMeasure.getSegment(length2, length3, path, true);
            nw1 nw1Var2 = (nw1) pair.first;
            nw1Var2.b();
            pathMeasure.getPosTan(length2, nw1Var2.a, nw1Var2.b);
            nw1 nw1Var3 = (nw1) pair.second;
            nw1Var3.b();
            pathMeasure.getPosTan(length3, nw1Var3.a, nw1Var3.b);
            Matrix matrix = this.e;
            matrix.reset();
            matrix.setRotate(f6);
            nw1Var2.c(f6);
            nw1Var3.c(f6);
            path.transform(matrix);
            canvas2 = canvas;
            canvas2.drawPath(path, paint);
        } else {
            ((nw1) pair.first).c(f19 + 90.0f);
            ((nw1) pair.first).a(-this.i);
            ((nw1) pair.second).c(f19 + f20 + 90.0f);
            ((nw1) pair.second).a(-this.i);
            float f27 = this.i;
            float f28 = -f27;
            RectF rectF = this.p;
            rectF.set(f28, f28, f27, f27);
            canvas.drawArc(rectF, f19, f20, false, paint);
            canvas2 = canvas;
        }
        if (circularProgressIndicatorSpec.c() || this.g <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        j(canvas2, paint, (nw1) pair.first, f13, this.f, 1.0f);
        j(canvas, paint, (nw1) pair.second, f13, this.f, 1.0f);
    }

    public final void j(Canvas canvas, Paint paint, nw1 nw1Var, float f, float f2, float f3) {
        float fMin = Math.min(f2, this.f);
        float f4 = f / 2.0f;
        float fMin2 = Math.min(f4, (this.g * fMin) / this.f);
        RectF rectF = new RectF((-f) / 2.0f, (-fMin) / 2.0f, f4, fMin / 2.0f);
        canvas.save();
        float[] fArr = nw1Var.a;
        canvas.translate(fArr[0], fArr[1]);
        canvas.rotate(ow1.h(nw1Var.b));
        canvas.scale(f3, f3);
        canvas.drawRoundRect(rectF, fMin2, fMin2, paint);
        canvas.restore();
    }

    public final int k() {
        t80 t80Var = this.a;
        return (((CircularProgressIndicatorSpec) t80Var).q * 2) + ((CircularProgressIndicatorSpec) t80Var).p;
    }

    @Override // defpackage.ow1
    public final void b(int i, int i2, Canvas canvas, Paint paint) {
    }
}
