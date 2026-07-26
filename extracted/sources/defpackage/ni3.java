package defpackage;

import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class ni3 {
    public static final ni3 o;
    public final tb2 a;
    public final w61 b;
    public final w61 c;
    public final w61 d;
    public final CachePolicy e;
    public final CachePolicy f;
    public final CachePolicy g;
    public final dp2 h;
    public final dp2 i;
    public final dp2 j;
    public final my7 k;
    public final Scale l;
    public final Precision m;
    public final a82 n;

    static {
        vz vzVar = vz.r;
        ww3 ww3Var = tb2.a;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.a;
        ug1 ug1Var = up1.a;
        kf1 kf1Var = kf1.c;
        CachePolicy cachePolicy = CachePolicy.c;
        o = new ni3(ww3Var, emptyCoroutineContext, kf1Var, kf1Var, cachePolicy, cachePolicy, cachePolicy, vzVar, vzVar, vzVar, my7.a, Scale.b, Precision.a, a82.b);
    }

    public ni3(tb2 tb2Var, w61 w61Var, w61 w61Var2, w61 w61Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, my7 my7Var, Scale scale, Precision precision, a82 a82Var) {
        this.a = tb2Var;
        this.b = w61Var;
        this.c = w61Var2;
        this.d = w61Var3;
        this.e = cachePolicy;
        this.f = cachePolicy2;
        this.g = cachePolicy3;
        this.h = dp2Var;
        this.i = dp2Var2;
        this.j = dp2Var3;
        this.k = my7Var;
        this.l = scale;
        this.m = precision;
        this.n = a82Var;
    }

    public static ni3 a(ni3 ni3Var, a82 a82Var, int i) {
        Precision precision = Precision.b;
        tb2 tb2Var = ni3Var.a;
        w61 w61Var = ni3Var.b;
        w61 w61Var2 = ni3Var.c;
        w61 w61Var3 = ni3Var.d;
        CachePolicy cachePolicy = ni3Var.e;
        CachePolicy cachePolicy2 = ni3Var.f;
        CachePolicy cachePolicy3 = ni3Var.g;
        dp2 dp2Var = ni3Var.h;
        dp2 dp2Var2 = ni3Var.i;
        dp2 dp2Var3 = ni3Var.j;
        my7 my7Var = ni3Var.k;
        Scale scale = ni3Var.l;
        if ((i & 4096) != 0) {
            precision = ni3Var.m;
        }
        Precision precision2 = precision;
        a82 a82Var2 = (i & 8192) != 0 ? ni3Var.n : a82Var;
        ni3Var.getClass();
        return new ni3(tb2Var, w61Var, w61Var2, w61Var3, cachePolicy, cachePolicy2, cachePolicy3, dp2Var, dp2Var2, dp2Var3, my7Var, scale, precision2, a82Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3)) {
            return false;
        }
        ni3 ni3Var = (ni3) obj;
        return js3.i(this.a, ni3Var.a) && js3.i(this.b, ni3Var.b) && js3.i(this.c, ni3Var.c) && js3.i(this.d, ni3Var.d) && this.e == ni3Var.e && this.f == ni3Var.f && this.g == ni3Var.g && js3.i(this.h, ni3Var.h) && js3.i(this.i, ni3Var.i) && js3.i(this.j, ni3Var.j) && js3.i(this.k, ni3Var.k) && this.l == ni3Var.l && this.m == ni3Var.m && js3.i(this.n, ni3Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ')';
    }
}
