package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class bw6 {
    public final Context a;
    public final ni3 b;
    public final c24 c;
    public final Object d;
    public final Object e;
    public final oy0 f;

    public bw6(Context context, ni3 ni3Var, c24 c24Var, c24 c24Var2, c24 c24Var3, oy0 oy0Var) {
        this.a = context;
        this.b = ni3Var;
        this.c = c24Var;
        this.d = c24Var2;
        this.e = c24Var3;
        this.f = oy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw6)) {
            return false;
        }
        bw6 bw6Var = (bw6) obj;
        if (!js3.i(this.a, bw6Var.a) || !this.b.equals(bw6Var.b) || !this.c.equals(bw6Var.c) || !this.d.equals(bw6Var.d) || !this.e.equals(bw6Var.e)) {
            return false;
        }
        Object obj2 = y32.a;
        return obj2.equals(obj2) && this.f.equals(bw6Var.f);
    }

    public final int hashCode() {
        return (this.f.hashCode() + ((y32.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        return "Options(application=" + this.a + ", defaults=" + this.b + ", mainCoroutineContextLazy=" + this.c + ", memoryCacheLazy=" + this.d + ", diskCacheLazy=" + this.e + ", eventListenerFactory=" + y32.a + ", componentRegistry=" + this.f + ", logger=null)";
    }
}
