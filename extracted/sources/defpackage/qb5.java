package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class qb5 implements oq8 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public qb5() {
        this.a = 0;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.b = Math.max(f, this.b);
        this.c = Math.max(f2, this.c);
        this.d = Math.min(f3, this.d);
        this.e = Math.min(f4, this.e);
    }

    public boolean b() {
        return (this.b >= this.d) | (this.c >= this.e);
    }

    public void c(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.b += fIntBitsToFloat;
        this.c += fIntBitsToFloat2;
        this.d += fIntBitsToFloat;
        this.e += fIntBitsToFloat2;
    }

    @Override // defpackage.oq8
    public void d(Canvas canvas, Paint paint, RectF rectF) {
        Path path = new Path();
        float f = this.b;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e;
        path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
        canvas.drawPath(path, paint);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "MutableRect(" + bt2.X(this.b) + ", " + bt2.X(this.c) + ", " + bt2.X(this.d) + ", " + bt2.X(this.e) + ')';
            default:
                return super.toString();
        }
    }

    public qb5(float f, float f2, float f3, float f4) {
        this.a = 1;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
