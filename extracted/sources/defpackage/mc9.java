package defpackage;

import androidx.media3.common.ParserException;
import androidx.media3.common.b;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class mc9 implements lc9 {
    public final x72 a;
    public final cp8 b;
    public final jg0 c;
    public final b d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public mc9(x72 x72Var, cp8 cp8Var, jg0 jg0Var, String str, int i) throws ParserException {
        this.a = x72Var;
        this.b = cp8Var;
        this.c = jg0Var;
        int i2 = jg0Var.b;
        int i3 = jg0Var.c;
        int i4 = (jg0Var.e * i2) / 8;
        int i5 = jg0Var.d;
        if (i5 != i4) {
            throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int iMax = Math.max(i4, i6 / 10);
        this.e = iMax;
        rj2 rj2Var = new rj2();
        rj2Var.l = tv4.m("audio/wav");
        rj2Var.m = tv4.m(str);
        rj2Var.h = i7;
        rj2Var.i = i7;
        rj2Var.n = iMax;
        rj2Var.E = i2;
        rj2Var.F = i3;
        rj2Var.G = i;
        this.d = new b(rj2Var);
    }

    @Override // defpackage.lc9
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.lc9
    public final boolean b(w72 w72Var, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int iE = this.b.e(w72Var, (int) Math.min(i2 - i, j2), true);
            if (iE == -1) {
                j2 = 0;
            } else {
                this.g += iE;
                j2 -= (long) iE;
            }
        }
        jg0 jg0Var = this.c;
        int i3 = jg0Var.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = jg0Var.c;
            String str = j29.a;
            long jD0 = j3 + j29.d0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i5 = i4 * i3;
            int i6 = this.g - i5;
            this.b.a(jD0, 1, i5, i6, null);
            this.h += (long) i4;
            this.g = i6;
        }
        return j2 <= 0;
    }

    @Override // defpackage.lc9
    public final void c(int i, long j) {
        this.a.t(new oc9(this.c, 1, i, j));
        this.b.f(this.d);
    }
}
