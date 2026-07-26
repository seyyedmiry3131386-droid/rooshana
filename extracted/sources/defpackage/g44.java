package defpackage;

import kotlin.b;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes3.dex */
public final class g44 extends li1 {
    public final g51 e;

    public g44(w61 w61Var, qp2 qp2Var) {
        super(w61Var, false, 1);
        this.e = ok4.x(this, this, qp2Var);
    }

    @Override // kotlinx.coroutines.c
    public final void b0() throws Throwable {
        try {
            dy3.K(ok4.I(this.e), tx8.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).a;
            }
            resumeWith(b.a(th));
            throw th;
        }
    }
}
