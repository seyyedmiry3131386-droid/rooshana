package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public final class t64 extends y61 implements qi1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(t64.class, "runningWorkers$volatile");
    public final /* synthetic */ qi1 c;
    public final y61 d;
    public final int e;
    public final ed4 f;
    public final Object g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public t64(y61 y61Var, int i) {
        qi1 qi1Var = y61Var instanceof qi1 ? (qi1) y61Var : null;
        this.c = qi1Var == null ? ne1.a : qi1Var;
        this.d = y61Var;
        this.e = i;
        this.f = new ed4();
        this.g = new Object();
    }

    @Override // defpackage.y61
    public final void C0(w61 w61Var, Runnable runnable) {
        Runnable runnableH0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !L0() || (runnableH0 = H0()) == null) {
            return;
        }
        try {
            this.d.C0(this, new g6(this, runnableH0, 19));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.y61
    public final y61 F0(int i) {
        bt2.r(i);
        return i >= this.e ? this : super.F0(i);
    }

    public final Runnable H0() {
        while (true) {
            Runnable runnable = (Runnable) this.f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.g) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean L0() {
        synchronized (this.g) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
            if (atomicIntegerFieldUpdater.get(this) >= this.e) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.y61
    public final void U(w61 w61Var, Runnable runnable) {
        Runnable runnableH0;
        this.f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h;
        if (atomicIntegerFieldUpdater.get(this) >= this.e || !L0() || (runnableH0 = H0()) == null) {
            return;
        }
        try {
            dy3.L(this.d, this, new g6(this, runnableH0, 19));
        } catch (Throwable th) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th;
        }
    }

    @Override // defpackage.qi1
    public final bq1 d(long j, Runnable runnable, w61 w61Var) {
        return this.c.d(j, runnable, w61Var);
    }

    @Override // defpackage.y61
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d);
        sb.append(".limitedParallelism(");
        return dw1.q(sb, this.e, ')');
    }

    @Override // defpackage.qi1
    public final void u(long j, om0 om0Var) {
        this.c.u(j, om0Var);
    }
}
