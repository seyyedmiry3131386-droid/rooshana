package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y26 extends vy3 {
    public final PointF i;
    public final float[] j;
    public final float[] k;
    public final PathMeasure l;
    public x26 m;

    public y26(ArrayList arrayList) {
        super(arrayList);
        this.i = new PointF();
        this.j = new float[2];
        this.k = new float[2];
        this.l = new PathMeasure();
    }

    @Override // defpackage.s70
    public final Object f(uy3 uy3Var, float f) {
        float f2;
        x26 x26Var = (x26) uy3Var;
        Path path = x26Var.q;
        hh2 hh2Var = this.e;
        if (hh2Var == null || uy3Var.h == null) {
            f2 = f;
        } else {
            f2 = f;
            PointF pointF = (PointF) hh2Var.C(x26Var.g, x26Var.h.floatValue(), (PointF) x26Var.b, (PointF) x26Var.c, d(), f2, this.d);
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) uy3Var.b;
        }
        x26 x26Var2 = this.m;
        PathMeasure pathMeasure = this.l;
        if (x26Var2 != x26Var) {
            pathMeasure.setPath(path, false);
            this.m = x26Var;
        }
        float length = pathMeasure.getLength();
        float f3 = f2 * length;
        float[] fArr = this.j;
        float[] fArr2 = this.k;
        pathMeasure.getPosTan(f3, fArr, fArr2);
        float f4 = fArr[0];
        float f5 = fArr[1];
        PointF pointF2 = this.i;
        pointF2.set(f4, f5);
        if (f3 < 0.0f) {
            pointF2.offset(fArr2[0] * f3, fArr2[1] * f3);
            return pointF2;
        }
        if (f3 > length) {
            float f6 = f3 - length;
            pointF2.offset(fArr2[0] * f6, fArr2[1] * f6);
        }
        return pointF2;
    }
}
