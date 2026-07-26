package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dv0 extends vy3 {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv0(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // defpackage.s70
    public final Object f(uy3 uy3Var, float f) {
        int i;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.i) {
            case 0:
                return Integer.valueOf(l(uy3Var, f));
            case 1:
                Object obj2 = uy3Var.b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = uy3Var.c;
                if (obj3 == null) {
                    if (uy3Var.k == 784923401) {
                        uy3Var.k = ((Integer) obj2).intValue();
                    }
                    i = uy3Var.k;
                } else {
                    if (uy3Var.l == 784923401) {
                        uy3Var.l = ((Integer) obj3).intValue();
                    }
                    i = uy3Var.l;
                }
                int i2 = i;
                hh2 hh2Var = this.e;
                if (hh2Var == null || (num = (Integer) hh2Var.C(uy3Var.g, uy3Var.h.floatValue(), (Integer) obj2, Integer.valueOf(i2), f, d(), this.d)) == null) {
                    if (uy3Var.k == 784923401) {
                        uy3Var.k = ((Integer) obj2).intValue();
                    }
                    int i3 = uy3Var.k;
                    PointF pointF = aw4.a;
                    iIntValue = (int) (((i2 - i3) * f) + i3);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = uy3Var.b;
                hh2 hh2Var2 = this.e;
                if (hh2Var2 == null) {
                    return (f != 1.0f || (obj = uy3Var.c) == null) ? (vq1) obj4 : (vq1) obj;
                }
                float f2 = uy3Var.g;
                Float f3 = uy3Var.h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                vq1 vq1Var = (vq1) obj4;
                Object obj5 = uy3Var.c;
                return (vq1) hh2Var2.C(f2, fFloatValue, vq1Var, obj5 == null ? vq1Var : (vq1) obj5, f, c(), this.d);
        }
    }

    public int l(uy3 uy3Var, float f) {
        float f2;
        Float f3;
        Object obj = uy3Var.b;
        Object obj2 = uy3Var.b;
        if (obj == null || uy3Var.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hh2 hh2Var = this.e;
        if (hh2Var == null || (f3 = uy3Var.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) hh2Var.C(uy3Var.g, f3.floatValue(), (Integer) obj2, (Integer) uy3Var.c, f2, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return ub1.s(aw4.b(f2, 0.0f, 1.0f), ((Integer) obj2).intValue(), ((Integer) uy3Var.c).intValue());
    }
}
