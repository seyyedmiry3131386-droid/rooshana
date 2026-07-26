package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.c;

/* JADX INFO: loaded from: classes3.dex */
public final class ko5 extends s implements wt3 {
    public static final ko5 b = new ko5(th0.n);

    @Override // defpackage.wt3
    public final Object D(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.wt3
    public final CancellationException I() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.wt3
    public final lq0 K(c cVar) {
        return lo5.a;
    }

    @Override // defpackage.wt3
    public final boolean b() {
        return true;
    }

    @Override // defpackage.wt3
    public final bq1 k(boolean z, boolean z2, dp2 dp2Var) {
        return lo5.a;
    }

    @Override // defpackage.wt3
    public final bq1 s0(dp2 dp2Var) {
        return lo5.a;
    }

    @Override // defpackage.wt3
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.wt3
    public final boolean w0() {
        return false;
    }

    @Override // defpackage.wt3, defpackage.pw6
    public final void g(CancellationException cancellationException) {
    }
}
