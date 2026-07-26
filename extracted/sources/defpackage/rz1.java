package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rz1 implements v26, o70, ly3 {
    public final String b;
    public final b c;
    public final su2 d;
    public final s70 e;
    public final lr0 f;
    public boolean h;
    public final Path a = new Path();
    public final r01 g = new r01();

    public rz1(b bVar, t70 t70Var, lr0 lr0Var) {
        this.b = lr0Var.a;
        this.c = bVar;
        s70 s70VarA = lr0Var.c.a();
        this.d = (su2) s70VarA;
        s70 s70VarA2 = lr0Var.b.a();
        this.e = s70VarA2;
        this.f = lr0Var;
        t70Var.e(s70VarA);
        t70Var.e(s70VarA2);
        s70VarA.a(this);
        s70VarA2.a(this);
    }

    @Override // defpackage.o70
    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            r31 r31Var = (r31) arrayList.get(i);
            if (r31Var instanceof ws8) {
                ws8 ws8Var = (ws8) r31Var;
                if (ws8Var.c == ShapeTrimPath$Type.a) {
                    this.g.a.add(ws8Var);
                    ws8Var.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        if (obj == ag4.f) {
            this.d.j(hh2Var);
        } else if (obj == ag4.i) {
            this.e.j(hh2Var);
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.b;
    }

    @Override // defpackage.v26
    public final Path m() {
        boolean z = this.h;
        Path path = this.a;
        if (z) {
            return path;
        }
        path.reset();
        lr0 lr0Var = this.f;
        if (lr0Var.e) {
            this.h = true;
            return path;
        }
        PointF pointF = (PointF) this.d.e();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = f2 * 0.55228f;
        path.reset();
        if (lr0Var.d) {
            float f5 = -f2;
            path.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            path.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            path.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            path.cubicTo(f10, f2, f, f9, f, 0.0f);
            path.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            path.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            path.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            path.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            path.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            path.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF pointF2 = (PointF) this.e.e();
        path.offset(pointF2.x, pointF2.y);
        path.close();
        this.g.c(path);
        this.h = true;
        return path;
    }
}
