package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class x26 extends uy3 {
    public Path q;
    public final uy3 r;

    public x26(gf4 gf4Var, uy3 uy3Var) {
        super(gf4Var, (PointF) uy3Var.b, (PointF) uy3Var.c, uy3Var.d, uy3Var.e, uy3Var.f, uy3Var.g, uy3Var.h);
        this.r = uy3Var;
        d();
    }

    public final void d() {
        Object obj;
        Object obj2 = this.c;
        Object obj3 = this.b;
        boolean z = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.c) == null || z) {
            return;
        }
        PointF pointF = (PointF) obj3;
        PointF pointF2 = (PointF) obj;
        uy3 uy3Var = this.r;
        PointF pointF3 = uy3Var.o;
        PointF pointF4 = uy3Var.p;
        Matrix matrix = n29.a;
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f = pointF3.x + pointF.x;
            float f2 = pointF.y + pointF3.y;
            float f3 = pointF2.x;
            float f4 = f3 + pointF4.x;
            float f5 = pointF2.y;
            path.cubicTo(f, f2, f4, f5 + pointF4.y, f3, f5);
        }
        this.q = path;
    }
}
