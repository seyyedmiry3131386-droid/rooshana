package defpackage;

import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class ni1 extends y61 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(ni1.class, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME);
    public final y61 c;
    public volatile /* synthetic */ int d = 1;

    public ni1(y61 y61Var) {
        this.c = y61Var;
    }

    @Override // defpackage.y61
    public final void C0(w61 w61Var, Runnable runnable) {
        H0().C0(w61Var, runnable);
    }

    @Override // defpackage.y61
    public final boolean D0(w61 w61Var) {
        return H0().D0(w61Var);
    }

    @Override // defpackage.y61
    public final y61 F0(int i) {
        return H0().F0(i);
    }

    public final y61 H0() {
        return e.get(this) == 1 ? up1.b : this.c;
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        H0().U(w61Var, runnable);
    }

    @Override // defpackage.y61
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + ")";
    }
}
