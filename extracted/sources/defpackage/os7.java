package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class os7 extends ts7 {
    public final qs7 c;

    public os7(qs7 qs7Var) {
        this.c = qs7Var;
    }

    @Override // defpackage.ts7
    public final void a(Matrix matrix, vr7 vr7Var, int i, Canvas canvas) {
        float f;
        qs7 qs7Var = this.c;
        float f2 = qs7Var.f;
        float f3 = qs7Var.g;
        RectF rectF = new RectF(qs7Var.b, qs7Var.c, qs7Var.d, qs7Var.e);
        Paint paint = vr7Var.b;
        boolean z = f3 < 0.0f;
        Path path = vr7Var.g;
        int[] iArr = vr7.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = vr7Var.f;
            iArr[2] = vr7Var.e;
            iArr[3] = vr7Var.d;
            f = 0.0f;
        } else {
            path.rewind();
            f = 0.0f;
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = vr7Var.d;
            iArr[2] = vr7Var.e;
            iArr[3] = vr7Var.f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= f) {
            return;
        }
        float f5 = 1.0f - (i / fWidth);
        float[] fArr = vr7.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, vr7Var.h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
