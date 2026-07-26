package defpackage;

import coil3.size.Precision;
import coil3.size.Scale;

/* JADX INFO: loaded from: classes.dex */
public final class oi3 {
    public final w61 a;
    public final w61 b;
    public final w61 c;
    public final dp2 d;
    public final dp2 e;
    public final dp2 f;
    public final my7 g;
    public final Scale h;
    public final Precision i;

    public oi3(w61 w61Var, w61 w61Var2, w61 w61Var3, dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, my7 my7Var, Scale scale, Precision precision) {
        this.a = w61Var;
        this.b = w61Var2;
        this.c = w61Var3;
        this.d = dp2Var;
        this.e = dp2Var2;
        this.f = dp2Var3;
        this.g = my7Var;
        this.h = scale;
        this.i = precision;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi3)) {
            return false;
        }
        oi3 oi3Var = (oi3) obj;
        return js3.i(this.a, oi3Var.a) && js3.i(this.b, oi3Var.b) && js3.i(this.c, oi3Var.c) && js3.i(this.d, oi3Var.d) && js3.i(this.e, oi3Var.e) && js3.i(this.f, oi3Var.f) && js3.i(this.g, oi3Var.g) && this.h == oi3Var.h && this.i == oi3Var.i;
    }

    public final int hashCode() {
        w61 w61Var = this.a;
        int iHashCode = (w61Var == null ? 0 : w61Var.hashCode()) * 31;
        w61 w61Var2 = this.b;
        int iHashCode2 = (iHashCode + (w61Var2 == null ? 0 : w61Var2.hashCode())) * 31;
        w61 w61Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (w61Var3 == null ? 0 : w61Var3.hashCode())) * 923521;
        dp2 dp2Var = this.d;
        int iHashCode4 = (iHashCode3 + (dp2Var == null ? 0 : dp2Var.hashCode())) * 31;
        dp2 dp2Var2 = this.e;
        int iHashCode5 = (iHashCode4 + (dp2Var2 == null ? 0 : dp2Var2.hashCode())) * 31;
        dp2 dp2Var3 = this.f;
        int iHashCode6 = (iHashCode5 + (dp2Var3 == null ? 0 : dp2Var3.hashCode())) * 31;
        my7 my7Var = this.g;
        int iHashCode7 = (iHashCode6 + (my7Var == null ? 0 : my7Var.hashCode())) * 31;
        Scale scale = this.h;
        int iHashCode8 = (iHashCode7 + (scale == null ? 0 : scale.hashCode())) * 31;
        Precision precision = this.i;
        return iHashCode8 + (precision != null ? precision.hashCode() : 0);
    }

    public final String toString() {
        return "Defined(fileSystem=null, interceptorCoroutineContext=" + this.a + ", fetcherCoroutineContext=" + this.b + ", decoderCoroutineContext=" + this.c + ", memoryCachePolicy=null, diskCachePolicy=null, networkCachePolicy=null, placeholderFactory=" + this.d + ", errorFactory=" + this.e + ", fallbackFactory=" + this.f + ", sizeResolver=" + this.g + ", scale=" + this.h + ", precision=" + this.i + ')';
    }
}
