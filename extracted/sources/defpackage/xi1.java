package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi1 implements aj1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zi1 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ xi1(zi1 zi1Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = zi1Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.aj1
    public final ScheduledFuture a(ca7 ca7Var) {
        switch (this.a) {
            case 0:
                zi1 zi1Var = this.b;
                return zi1Var.b.scheduleAtFixedRate(new yi1(zi1Var, this.c, ca7Var, 0), this.d, this.e, this.f);
            default:
                zi1 zi1Var2 = this.b;
                return zi1Var2.b.scheduleWithFixedDelay(new yi1(zi1Var2, this.c, ca7Var, 2), this.d, this.e, this.f);
        }
    }
}
