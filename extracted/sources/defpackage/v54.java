package defpackage;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.a;

/* JADX INFO: loaded from: classes.dex */
public final class v54 extends a implements b64 {
    public final i64 a;
    public final w61 b;

    public v54(i64 i64Var, w61 w61Var) {
        js3.p(w61Var, "coroutineContext");
        this.a = i64Var;
        this.b = w61Var;
        if (i64Var.d == Lifecycle$State.a) {
            kotlinx.coroutines.a.c(w61Var, null);
        }
    }

    @Override // defpackage.b64
    public final void g(g64 g64Var, Lifecycle$Event lifecycle$Event) {
        i64 i64Var = this.a;
        if (i64Var.d.compareTo(Lifecycle$State.a) <= 0) {
            i64Var.f(this);
            kotlinx.coroutines.a.c(this.b, null);
        }
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.b;
    }
}
