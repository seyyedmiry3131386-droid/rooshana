package defpackage;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zi9 implements q46 {
    public final /* synthetic */ at2 a;
    public final /* synthetic */ cf8 b;
    public final /* synthetic */ r46 c;

    public zi9(at2 at2Var, cf8 cf8Var, r46 r46Var) {
        this.a = at2Var;
        this.b = cf8Var;
        this.c = r46Var;
    }

    @Override // defpackage.q46
    public final void a(Status status) {
        f87 f87Var;
        if (!status.u()) {
            this.b.a(status.c != null ? new ResolvableApiException(status) : new ApiException(status));
            return;
        }
        at2 at2Var = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) at2Var;
        rq4.q("Result has already been consumed.", !basePendingResult.J);
        try {
            if (!basePendingResult.E.await(0L, timeUnit)) {
                basePendingResult.q0(Status.h);
            }
        } catch (InterruptedException unused) {
            basePendingResult.q0(Status.f);
        }
        rq4.q("Result is not ready.", basePendingResult.r0());
        synchronized (basePendingResult.D) {
            rq4.q("Result has already been consumed.", !basePendingResult.J);
            rq4.q("Result is not ready.", basePendingResult.r0());
            f87Var = basePendingResult.H;
            basePendingResult.H = null;
            basePendingResult.J = true;
        }
        if (basePendingResult.G.getAndSet(null) != null) {
            throw new ClassCastException();
        }
        rq4.n(f87Var);
        this.b.b(this.c.d(f87Var));
    }
}
