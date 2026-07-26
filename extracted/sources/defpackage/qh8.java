package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.g;

/* JADX INFO: loaded from: classes.dex */
public final class qh8 {
    public static final bn6 g = ok4.M(new lc8(9), new yd7(3));
    public final l08 a;
    public final l08 b = g.d(0.0f);
    public final n08 c = g.e(0);
    public sy6 d = sy6.e;
    public long e = zi8.b;
    public final wb5 f;

    public qh8(Orientation orientation, float f) {
        this.a = g.d(f);
        this.f = g.g(orientation, th0.t);
    }

    public final float a() {
        return this.a.h();
    }

    public final void b(Orientation orientation, sy6 sy6Var, int i, int i2) {
        float f = i2 - i;
        this.b.i(f);
        float f2 = sy6Var.a;
        float f3 = sy6Var.b;
        sy6 sy6Var2 = this.d;
        float f4 = sy6Var2.a;
        l08 l08Var = this.a;
        if (f2 != f4 || f3 != sy6Var2.b) {
            boolean z = orientation == Orientation.a;
            if (z) {
                f2 = f3;
            }
            float f5 = z ? sy6Var.d : sy6Var.c;
            float fA = a();
            float f6 = i;
            float f7 = fA + f6;
            l08Var.i(a() + ((f5 <= f7 && (f2 >= fA || f5 - f2 <= f6)) ? (f2 >= fA || f5 - f2 > f6) ? 0.0f : f2 - fA : f5 - f7));
            this.d = sy6Var;
        }
        l08Var.i(ok4.s(a(), 0.0f, f));
        this.c.i(i);
    }
}
