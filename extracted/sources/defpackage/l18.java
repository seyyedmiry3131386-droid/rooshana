package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final class l18 extends t70 {
    public final RectF D;
    public final uz3 E;
    public final float[] F;
    public final Path G;
    public final q04 H;
    public x29 I;
    public x29 J;

    public l18(b bVar, q04 q04Var) {
        super(bVar, q04Var);
        this.D = new RectF();
        uz3 uz3Var = new uz3();
        this.E = uz3Var;
        this.F = new float[8];
        this.G = new Path();
        this.H = q04Var;
        uz3Var.setAlpha(0);
        uz3Var.setStyle(Paint.Style.FILL);
        uz3Var.setColor(q04Var.l);
    }

    @Override // defpackage.t70, defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        q04 q04Var = this.H;
        float f = q04Var.j;
        float f2 = q04Var.k;
        RectF rectF2 = this.D;
        rectF2.set(0.0f, 0.0f, f, f2);
        this.n.mapRect(rectF2);
        rectF.set(rectF2);
    }

    @Override // defpackage.t70, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        if (obj == ag4.I) {
            this.I = new x29(hh2Var, null);
        } else if (obj == 1) {
            this.J = new x29(hh2Var, null);
        }
    }

    @Override // defpackage.t70
    public final void j(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        q04 q04Var = this.H;
        int iAlpha = Color.alpha(q04Var.l);
        if (iAlpha == 0) {
            return;
        }
        x29 x29Var = this.J;
        Integer num = x29Var == null ? null : (Integer) x29Var.e();
        uz3 uz3Var = this.E;
        if (num != null) {
            uz3Var.setColor(num.intValue());
        } else {
            uz3Var.setColor(q04Var.l);
        }
        int iIntValue = (int) ((((iAlpha / 255.0f) * (this.w.p == null ? 100 : ((Integer) r2.e()).intValue())) / 100.0f) * (i / 255.0f) * 255.0f);
        uz3Var.setAlpha(iIntValue);
        if (ex1Var == null || Color.alpha(ex1Var.d) <= 0) {
            uz3Var.clearShadowLayer();
        } else {
            uz3Var.setShadowLayer(Math.max(ex1Var.a, Float.MIN_VALUE), ex1Var.b, ex1Var.c, ex1Var.d);
        }
        x29 x29Var2 = this.I;
        if (x29Var2 != null) {
            uz3Var.setColorFilter((ColorFilter) x29Var2.e());
        }
        if (iIntValue > 0) {
            float[] fArr = this.F;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f = q04Var.j;
            fArr[2] = f;
            fArr[3] = 0.0f;
            fArr[4] = f;
            float f2 = q04Var.k;
            fArr[5] = f2;
            fArr[6] = 0.0f;
            fArr[7] = f2;
            matrix.mapPoints(fArr);
            Path path = this.G;
            path.reset();
            path.moveTo(fArr[0], fArr[1]);
            path.lineTo(fArr[2], fArr[3]);
            path.lineTo(fArr[4], fArr[5]);
            path.lineTo(fArr[6], fArr[7]);
            path.lineTo(fArr[0], fArr[1]);
            path.close();
            canvas.drawPath(path, uz3Var);
        }
    }
}
