package defpackage;

import android.content.Context;
import coil3.request.CachePolicy;
import coil3.size.Precision;
import coil3.size.Scale;

/* JADX INFO: loaded from: classes.dex */
public final class uv5 {
    public final Context a;
    public final dy7 b;
    public final Scale c;
    public final Precision d;
    public final String e;
    public final tb2 f;
    public final CachePolicy g;
    public final CachePolicy h;
    public final CachePolicy i;
    public final a82 j;

    public uv5(Context context, dy7 dy7Var, Scale scale, Precision precision, String str, tb2 tb2Var, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, a82 a82Var) {
        this.a = context;
        this.b = dy7Var;
        this.c = scale;
        this.d = precision;
        this.e = str;
        this.f = tb2Var;
        this.g = cachePolicy;
        this.h = cachePolicy2;
        this.i = cachePolicy3;
        this.j = a82Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uv5)) {
            return false;
        }
        uv5 uv5Var = (uv5) obj;
        return js3.i(this.a, uv5Var.a) && js3.i(this.b, uv5Var.b) && this.c == uv5Var.c && this.d == uv5Var.d && js3.i(this.e, uv5Var.e) && js3.i(this.f, uv5Var.f) && this.g == uv5Var.g && this.h == uv5Var.h && this.i == uv5Var.i && js3.i(this.j, uv5Var.j);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return this.j.a.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Options(context=" + this.a + ", size=" + this.b + ", scale=" + this.c + ", precision=" + this.d + ", diskCacheKey=" + this.e + ", fileSystem=" + this.f + ", memoryCachePolicy=" + this.g + ", diskCachePolicy=" + this.h + ", networkCachePolicy=" + this.i + ", extras=" + this.j + ')';
    }
}
