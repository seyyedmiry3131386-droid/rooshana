package androidx.compose.runtime;

import defpackage.e71;
import defpackage.js3;
import defpackage.m37;

/* JADX INFO: loaded from: classes.dex */
public final class b implements m37 {
    public final e71 a;

    public b(e71 e71Var) {
        this.a = e71Var;
    }

    @Override // defpackage.m37
    public final void a() {
        e71 e71Var = this.a;
        if (e71Var instanceof m) {
            ((m) e71Var).b();
        } else {
            js3.j(e71Var, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.m37
    public final void c() {
        e71 e71Var = this.a;
        if (e71Var instanceof m) {
            ((m) e71Var).b();
        } else {
            js3.j(e71Var, new LeftCompositionCancellationException());
        }
    }

    @Override // defpackage.m37
    public final void e() {
    }
}
