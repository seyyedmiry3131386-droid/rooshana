package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class ps7 extends ts7 {
    public final rs7 c;
    public final float d;
    public final float e;

    public ps7(rs7 rs7Var, float f, float f2) {
        this.c = rs7Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ts7
    public final void a(Matrix matrix, vr7 vr7Var, int i, Canvas canvas) {
        rs7 rs7Var = this.c;
        float f = rs7Var.c;
        float f2 = this.e;
        float f3 = rs7Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        vr7Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = vr7Var.f;
        int[] iArr = vr7.i;
        iArr[0] = i2;
        iArr[1] = vr7Var.e;
        iArr[2] = vr7Var.d;
        Paint paint = vr7Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, vr7.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        rs7 rs7Var = this.c;
        return (float) Math.toDegrees(Math.atan((rs7Var.c - this.e) / (rs7Var.b - this.d)));
    }
}
