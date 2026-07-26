package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public abstract class ow1 {
    public final t80 a;
    public final Path b;
    public final Path c;
    public final PathMeasure d;
    public final Matrix e;

    public ow1(t80 t80Var) {
        Path path = new Path();
        this.b = path;
        this.c = new Path();
        this.d = new PathMeasure(path, false);
        this.a = t80Var;
        this.e = new Matrix();
    }

    public static float h(float[] fArr) {
        return (float) Math.toDegrees(Math.atan2(fArr[1], fArr[0]));
    }

    public abstract void a(Canvas canvas, Rect rect, float f, boolean z, boolean z2);

    public abstract void b(int i, int i2, Canvas canvas, Paint paint);

    public abstract void c(Canvas canvas, Paint paint, mw1 mw1Var, int i);

    public abstract void d(Canvas canvas, Paint paint, float f, float f2, int i, int i2, int i3);

    public abstract int e();

    public abstract int f();

    public abstract void g();
}
