package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes3.dex */
public final class ge3 extends ox {
    public final /* synthetic */ he3 n;

    public ge3(he3 he3Var) {
        this.n = he3Var;
    }

    @Override // defpackage.ox
    public final IOException j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // defpackage.ox
    public final void k() {
        this.n.f(ErrorCode.h);
        ae3 ae3Var = this.n.b;
        synchronized (ae3Var) {
            long j = ae3Var.n;
            long j2 = ae3Var.m;
            if (j < j2) {
                return;
            }
            ae3Var.m = j2 + 1;
            ae3Var.o = System.nanoTime() + ((long) 1000000000);
            ff8.c(ae3Var.h, dw1.s(new StringBuilder(), ae3Var.c, " ping"), new x2(28, ae3Var));
        }
    }

    public final void l() {
        if (i()) {
            throw j(null);
        }
    }
}
