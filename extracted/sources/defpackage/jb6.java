package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class jb6 implements qc6 {
    public final Context a;
    public final bp2 b;

    public jb6(Context context, bp2 bp2Var) {
        js3.p(context, "context");
        this.a = context;
        this.b = bp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jb6)) {
            return false;
        }
        jb6 jb6Var = (jb6) obj;
        return js3.i(this.a, jb6Var.a) && js3.i(this.b, jb6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InvokeShare(context=" + this.a + ", onFailure=" + this.b + ")";
    }
}
