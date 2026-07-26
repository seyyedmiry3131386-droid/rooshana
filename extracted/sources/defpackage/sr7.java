package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class sr7 extends ch0 {
    public ut4 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.ch0
    public final void a(float f, long j, jx9 jx9Var) {
        ut4 ut4Var = this.a;
        if (ut4Var == null || !ey7.b(this.b, j)) {
            if (ey7.f(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                ut4Var = null;
            } else {
                ut4Var = this.a;
                if (ut4Var == null) {
                    ut4Var = new ut4(16);
                    this.a = ut4Var;
                }
                ut4Var.b = b(j);
                this.a = ut4Var;
                this.b = j;
            }
        }
        long jD = gu9.d(((Paint) jx9Var.b).getColor());
        long j2 = zu0.b;
        if (!zu0.c(jD, j2)) {
            jx9Var.p(j2);
        }
        if (!js3.i((Shader) jx9Var.c, ut4Var != null ? (Shader) ut4Var.b : null)) {
            jx9Var.s(ut4Var != null ? (Shader) ut4Var.b : null);
        }
        if (r8.getAlpha() / 255.0f == f) {
            return;
        }
        jx9Var.n(f);
    }

    public abstract Shader b(long j);
}
