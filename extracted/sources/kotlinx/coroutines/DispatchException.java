package kotlinx.coroutines;

import defpackage.w61;
import defpackage.y61;

/* JADX INFO: loaded from: classes3.dex */
public final class DispatchException extends Exception {
    public final Throwable a;

    public DispatchException(Throwable th, y61 y61Var, w61 w61Var) {
        super("Coroutine dispatcher " + y61Var + " threw an exception, context = " + w61Var, th);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.a;
    }
}
