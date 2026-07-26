package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class eg {
    public final Context a;
    public final qj1 b;
    public final long c;
    public final wy5 d;

    public eg(Context context, qj1 qj1Var, long j, wy5 wy5Var) {
        this.a = context;
        this.b = qj1Var;
        this.c = j;
        this.d = wy5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!eg.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        eg egVar = (eg) obj;
        return js3.i(this.a, egVar.a) && js3.i(this.b, egVar.b) && zu0.c(this.c, egVar.c) && js3.i(this.d, egVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        int i = zu0.i;
        return this.d.hashCode() + t61.d(iHashCode, 31, this.c);
    }
}
