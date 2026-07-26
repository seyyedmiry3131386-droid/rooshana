package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class su2 extends vy3 {
    public final /* synthetic */ int i;
    public final Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su2(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.j = new PointF();
                break;
            case 2:
                super(list);
                this.j = new be7();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ru2 ru2Var = (ru2) ((uy3) list.get(i2)).b;
                    if (ru2Var != null) {
                        iMax = Math.max(iMax, ru2Var.b.length);
                    }
                }
                this.j = new ru2(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // defpackage.s70
    public final Object f(uy3 uy3Var, float f) {
        Object obj;
        float f2;
        switch (this.i) {
            case 0:
                ru2 ru2Var = (ru2) this.j;
                ru2 ru2Var2 = (ru2) uy3Var.b;
                ru2 ru2Var3 = (ru2) uy3Var.c;
                int[] iArr = ru2Var.b;
                float[] fArr = ru2Var.a;
                boolean zEquals = ru2Var2.equals(ru2Var3);
                int[] iArr2 = ru2Var2.b;
                if (zEquals || f <= 0.0f) {
                    ru2Var.a(ru2Var2);
                } else if (f >= 1.0f) {
                    ru2Var.a(ru2Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = ru2Var3.b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        throw new IllegalArgumentException(dw1.k(iArr3.length, ")", sb));
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = aw4.f(ru2Var2.a[i], ru2Var3.a[i], f);
                        iArr[i] = ub1.s(f, iArr2[i], iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return ru2Var;
            case 1:
                return l(uy3Var, f, f, f);
            default:
                be7 be7Var = (be7) this.j;
                Object obj2 = uy3Var.b;
                if (obj2 == null || (obj = uy3Var.c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                be7 be7Var2 = (be7) obj2;
                be7 be7Var3 = (be7) obj;
                hh2 hh2Var = this.e;
                if (hh2Var != null) {
                    f2 = f;
                    be7 be7Var4 = (be7) hh2Var.C(uy3Var.g, uy3Var.h.floatValue(), be7Var2, be7Var3, f2, d(), this.d);
                    if (be7Var4 != null) {
                        return be7Var4;
                    }
                } else {
                    f2 = f;
                }
                float f3 = aw4.f(be7Var2.a, be7Var3.a, f2);
                float f4 = aw4.f(be7Var2.b, be7Var3.b, f2);
                be7Var.a = f3;
                be7Var.b = f4;
                return be7Var;
        }
    }

    @Override // defpackage.s70
    public /* bridge */ /* synthetic */ Object g(uy3 uy3Var, float f, float f2, float f3) {
        switch (this.i) {
            case 1:
                return l(uy3Var, f, f2, f3);
            default:
                return super.g(uy3Var, f, f2, f3);
        }
    }

    public PointF l(uy3 uy3Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.j;
        Object obj2 = uy3Var.b;
        if (obj2 == null || (obj = uy3Var.c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        hh2 hh2Var = this.e;
        if (hh2Var != null && (pointF = (PointF) hh2Var.C(uy3Var.g, uy3Var.h.floatValue(), pointF3, pointF4, f, d(), this.d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float f5 = dw1.f(pointF4.x, f4, f2, f4);
        float f6 = pointF3.y;
        pointF2.set(f5, dw1.f(pointF4.y, f6, f3, f6));
        return pointF2;
    }
}
