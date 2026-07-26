package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class ys3 extends eu3 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(ys3.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;
    public final dp2 e;

    public ys3(dp2 dp2Var) {
        this.e = dp2Var;
    }

    @Override // defpackage.eu3
    public final boolean k() {
        return true;
    }

    @Override // defpackage.eu3
    public final void l(Throwable th) {
        if (f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
