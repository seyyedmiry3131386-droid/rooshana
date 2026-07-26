package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class pi3 {
    public final Context a;
    public final Object b;
    public final we8 c;
    public final String d;
    public final Map e;
    public final tb2 f;
    public final w61 g;
    public final w61 h;
    public final w61 i;
    public final CachePolicy j;
    public final CachePolicy k;
    public final CachePolicy l;
    public final dp2 m;
    public final dp2 n;
    public final dp2 o;
    public final my7 p;
    public final Scale q;
    public final Precision r;
    public final a82 s;
    public final oi3 t;
    public final ni3 u;

    public pi3(Context context, Object obj, we8 we8Var, String str, Map map, tb2 tb2Var, w61 w61Var, w61 w61Var2, w61 w61Var3, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, dp2 dp2Var, dp2 dp2Var2, dp2 dp2Var3, my7 my7Var, Scale scale, Precision precision, a82 a82Var, oi3 oi3Var, ni3 ni3Var) {
        this.a = context;
        this.b = obj;
        this.c = we8Var;
        this.d = str;
        this.e = map;
        this.f = tb2Var;
        this.g = w61Var;
        this.h = w61Var2;
        this.i = w61Var3;
        this.j = cachePolicy;
        this.k = cachePolicy2;
        this.l = cachePolicy3;
        this.m = dp2Var;
        this.n = dp2Var2;
        this.o = dp2Var3;
        this.p = my7Var;
        this.q = scale;
        this.r = precision;
        this.s = a82Var;
        this.t = oi3Var;
        this.u = ni3Var;
    }

    public static mi3 a(pi3 pi3Var) {
        Context context = pi3Var.a;
        pi3Var.getClass();
        return new mi3(pi3Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi3)) {
            return false;
        }
        pi3 pi3Var = (pi3) obj;
        return js3.i(this.a, pi3Var.a) && this.b.equals(pi3Var.b) && js3.i(this.c, pi3Var.c) && js3.i(this.d, pi3Var.d) && this.e.equals(pi3Var.e) && js3.i(this.f, pi3Var.f) && js3.i(this.g, pi3Var.g) && js3.i(this.h, pi3Var.h) && js3.i(this.i, pi3Var.i) && this.j == pi3Var.j && this.k == pi3Var.k && this.l == pi3Var.l && js3.i(this.m, pi3Var.m) && js3.i(this.n, pi3Var.n) && js3.i(this.o, pi3Var.o) && js3.i(this.p, pi3Var.p) && this.q == pi3Var.q && this.r == pi3Var.r && this.s.equals(pi3Var.s) && this.t.equals(pi3Var.t) && js3.i(this.u, pi3Var.u);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        we8 we8Var = this.c;
        int iHashCode2 = (iHashCode + (we8Var == null ? 0 : we8Var.hashCode())) * 961;
        String str = this.d;
        return this.u.hashCode() + ((this.t.hashCode() + ((this.s.a.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=" + this.d + ", memoryCacheKeyExtras=" + this.e + ", diskCacheKey=null, fileSystem=" + this.f + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.g + ", fetcherCoroutineContext=" + this.h + ", decoderCoroutineContext=" + this.i + ", memoryCachePolicy=" + this.j + ", diskCachePolicy=" + this.k + ", networkCachePolicy=" + this.l + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.m + ", errorFactory=" + this.n + ", fallbackFactory=" + this.o + ", sizeResolver=" + this.p + ", scale=" + this.q + ", precision=" + this.r + ", extras=" + this.s + ", defined=" + this.t + ", defaults=" + this.u + ')';
    }
}
