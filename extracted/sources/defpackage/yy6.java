package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yy6 implements o70, ly3, v26 {
    public final String c;
    public final boolean d;
    public final b e;
    public final s70 f;
    public final s70 g;
    public final he2 h;
    public boolean k;
    public final Path a = new Path();
    public final RectF b = new RectF();
    public final r01 i = new r01();
    public s70 j = null;

    public yy6(b bVar, t70 t70Var, zy6 zy6Var) {
        this.c = (String) zy6Var.b;
        this.d = zy6Var.d;
        this.e = bVar;
        s70 s70VarA = zy6Var.e.a();
        this.f = s70VarA;
        s70 s70VarA2 = ((jj) zy6Var.f).a();
        this.g = s70VarA2;
        he2 he2VarA = zy6Var.c.a();
        this.h = he2VarA;
        t70Var.e(s70VarA);
        t70Var.e(s70VarA2);
        t70Var.e(he2VarA);
        s70VarA.a(this);
        s70VarA2.a(this);
        he2VarA.a(this);
    }

    @Override // defpackage.o70
    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    @Override // defpackage.r31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.util.List r5, java.util.List r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            if (r6 >= r1) goto L35
            java.lang.Object r0 = r0.get(r6)
            r31 r0 = (defpackage.r31) r0
            boolean r1 = r0 instanceof defpackage.ws8
            if (r1 == 0) goto L28
            r1 = r0
            ws8 r1 = (defpackage.ws8) r1
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r2 = r1.c
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r3 = com.airbnb.lottie.model.content.ShapeTrimPath$Type.a
            if (r2 != r3) goto L28
            r01 r0 = r4.i
            java.util.ArrayList r0 = r0.a
            r0.add(r1)
            r1.c(r4)
            goto L32
        L28:
            boolean r1 = r0 instanceof defpackage.pa7
            if (r1 == 0) goto L32
            pa7 r0 = (defpackage.pa7) r0
            s70 r0 = r0.b
            r4.j = r0
        L32:
            int r6 = r6 + 1
            goto L1
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yy6.b(java.util.List, java.util.List):void");
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        if (obj == ag4.g) {
            this.g.j(hh2Var);
        } else if (obj == ag4.i) {
            this.f.j(hh2Var);
        } else if (obj == ag4.h) {
            this.h.j(hh2Var);
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.c;
    }

    @Override // defpackage.v26
    public final Path m() {
        float f;
        s70 s70Var;
        boolean z = this.k;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        if (this.d) {
            this.k = true;
            return path;
        }
        PointF pointF = (PointF) this.g.e();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        he2 he2Var = this.h;
        float fL = he2Var == null ? 0.0f : he2Var.l();
        if (fL == 0.0f && (s70Var = this.j) != null) {
            fL = Math.min(((Float) s70Var.e()).floatValue(), Math.min(f2, f3));
        }
        float fMin = Math.min(f2, f3);
        if (fL > fMin) {
            fL = fMin;
        }
        PointF pointF2 = (PointF) this.f.e();
        path.moveTo(pointF2.x + f2, (pointF2.y - f3) + fL);
        path.lineTo(pointF2.x + f2, (pointF2.y + f3) - fL);
        RectF rectF = this.b;
        if (fL > 0.0f) {
            float f4 = pointF2.x + f2;
            float f5 = fL * 2.0f;
            f = 2.0f;
            float f6 = pointF2.y + f3;
            rectF.set(f4 - f5, f6 - f5, f4, f6);
            path.arcTo(rectF, 0.0f, 90.0f, false);
        } else {
            f = 2.0f;
        }
        path.lineTo((pointF2.x - f2) + fL, pointF2.y + f3);
        if (fL > 0.0f) {
            float f7 = pointF2.x - f2;
            float f8 = pointF2.y + f3;
            float f9 = fL * f;
            rectF.set(f7, f8 - f9, f9 + f7, f8);
            path.arcTo(rectF, 90.0f, 90.0f, false);
        }
        path.lineTo(pointF2.x - f2, (pointF2.y - f3) + fL);
        if (fL > 0.0f) {
            float f10 = pointF2.x - f2;
            float f11 = pointF2.y - f3;
            float f12 = fL * f;
            rectF.set(f10, f11, f10 + f12, f12 + f11);
            path.arcTo(rectF, 180.0f, 90.0f, false);
        }
        path.lineTo((pointF2.x + f2) - fL, pointF2.y - f3);
        if (fL > 0.0f) {
            float f13 = pointF2.x + f2;
            float f14 = fL * f;
            float f15 = pointF2.y - f3;
            rectF.set(f13 - f14, f15, f13, f14 + f15);
            path.arcTo(rectF, 270.0f, 90.0f, false);
        }
        path.close();
        this.i.c(path);
        this.k = true;
        return path;
    }
}
