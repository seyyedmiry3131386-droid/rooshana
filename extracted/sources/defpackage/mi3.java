package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;
import java.util.Map;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class mi3 {
    public final Context a;
    public ni3 b;
    public Object c;
    public we8 d;
    public String e;
    public final Map f;
    public w61 g;
    public w61 h;
    public w61 i;
    public final dp2 j;
    public final dp2 k;
    public final dp2 l;
    public my7 m;
    public Scale n;
    public Precision o;
    public Object p;

    public mi3(Context context) {
        this.a = context;
        this.b = ni3.o;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = b.I();
        this.g = null;
        this.h = null;
        this.i = null;
        vz vzVar = vz.r;
        this.j = vzVar;
        this.k = vzVar;
        this.l = vzVar;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = a82.b;
    }

    public final pi3 a() {
        a82 a82Var;
        Object obj = this.c;
        if (obj == null) {
            obj = tp5.a;
        }
        Object obj2 = obj;
        we8 we8Var = this.d;
        String str = this.e;
        Boolean bool = Boolean.FALSE;
        Map mapV = this.f;
        if (js3.i(mapV, bool)) {
            js3.n(mapV, "null cannot be cast to non-null type kotlin.collections.MutableMap<*, *>");
            mapV = hs9.V(wu8.h(mapV));
        } else if (!o40.O(mapV)) {
            throw new AssertionError();
        }
        Map map = mapV;
        js3.n(map, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        ni3 ni3Var = this.b;
        tb2 tb2Var = ni3Var.a;
        CachePolicy cachePolicy = ni3Var.e;
        CachePolicy cachePolicy2 = ni3Var.f;
        CachePolicy cachePolicy3 = ni3Var.g;
        w61 w61Var = this.g;
        if (w61Var == null) {
            w61Var = ni3Var.b;
        }
        w61 w61Var2 = w61Var;
        w61 w61Var3 = this.h;
        if (w61Var3 == null) {
            w61Var3 = ni3Var.c;
        }
        w61 w61Var4 = w61Var3;
        w61 w61Var5 = this.i;
        if (w61Var5 == null) {
            w61Var5 = ni3Var.d;
        }
        w61 w61Var6 = w61Var5;
        dp2 dp2Var = this.j;
        if (dp2Var == null) {
            dp2Var = ni3Var.h;
        }
        dp2 dp2Var2 = dp2Var;
        dp2 dp2Var3 = this.k;
        if (dp2Var3 == null) {
            dp2Var3 = ni3Var.i;
        }
        dp2 dp2Var4 = dp2Var3;
        dp2 dp2Var5 = this.l;
        if (dp2Var5 == null) {
            dp2Var5 = ni3Var.j;
        }
        dp2 dp2Var6 = dp2Var5;
        my7 my7Var = this.m;
        if (my7Var == null) {
            my7Var = ni3Var.k;
        }
        my7 my7Var2 = my7Var;
        Scale scale = this.n;
        if (scale == null) {
            scale = ni3Var.l;
        }
        Scale scale2 = scale;
        Precision precision = this.o;
        if (precision == null) {
            precision = ni3Var.m;
        }
        Precision precision2 = precision;
        Object obj3 = this.p;
        if (obj3 instanceof z72) {
            a82Var = new a82(hs9.V(((z72) obj3).a));
        } else {
            if (!(obj3 instanceof a82)) {
                throw new AssertionError();
            }
            a82Var = (a82) obj3;
        }
        return new pi3(this.a, obj2, we8Var, str, map, tb2Var, w61Var2, w61Var4, w61Var6, cachePolicy, cachePolicy2, cachePolicy3, dp2Var2, dp2Var4, dp2Var6, my7Var2, scale2, precision2, a82Var, new oi3(this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o), this.b);
    }

    public mi3(pi3 pi3Var, Context context) {
        this.a = context;
        this.b = pi3Var.u;
        this.c = pi3Var.b;
        this.d = pi3Var.c;
        this.e = pi3Var.d;
        this.f = pi3Var.e;
        oi3 oi3Var = pi3Var.t;
        this.g = oi3Var.a;
        this.h = oi3Var.b;
        this.i = oi3Var.c;
        this.j = oi3Var.d;
        this.k = oi3Var.e;
        this.l = oi3Var.f;
        this.m = oi3Var.g;
        this.n = oi3Var.h;
        this.o = oi3Var.i;
        this.p = pi3Var.s;
    }
}
