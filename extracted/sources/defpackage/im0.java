package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class im0 implements jm0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ im0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.jm0
    public final void d(Throwable th) {
        switch (this.a) {
            case 0:
                ((ScheduledFuture) this.b).cancel(false);
                break;
            case 1:
                ((dp2) this.b).invoke(th);
                break;
            default:
                ((bq1) this.b).a();
                break;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) this.b) + ']';
            case 1:
                return "CancelHandler.UserSupplied[" + ((dp2) this.b).getClass().getSimpleName() + '@' + ub1.v(this) + ']';
            default:
                return "DisposeOnCancel[" + ((bq1) this.b) + ']';
        }
    }
}
