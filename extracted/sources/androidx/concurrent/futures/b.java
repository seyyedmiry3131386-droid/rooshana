package androidx.concurrent.futures;

import defpackage.f67;
import defpackage.ol0;
import defpackage.pl0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Object a;
    public pl0 b;
    public f67 c;
    public boolean d;

    public final void finalize() {
        f67 f67Var;
        pl0 pl0Var = this.b;
        if (pl0Var != null) {
            ol0 ol0Var = pl0Var.b;
            if (!ol0Var.isDone()) {
                ol0Var.k(new CallbackToFutureAdapter$FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
            }
        }
        if (this.d || (f67Var = this.c) == null) {
            return;
        }
        f67Var.j(null);
    }
}
