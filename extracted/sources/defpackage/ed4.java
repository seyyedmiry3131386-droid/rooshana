package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class ed4 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ed4.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new gd4(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            gd4 gd4Var = (gd4) atomicReferenceFieldUpdater.get(this);
            int iA = gd4Var.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                gd4 gd4VarC = gd4Var.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, gd4Var, gd4VarC) && atomicReferenceFieldUpdater.get(this) == gd4Var) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            gd4 gd4Var = (gd4) atomicReferenceFieldUpdater.get(this);
            if (gd4Var.b()) {
                return;
            }
            gd4 gd4VarC = gd4Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gd4Var, gd4VarC) && atomicReferenceFieldUpdater.get(this) == gd4Var) {
            }
        }
    }

    public final int c() {
        gd4 gd4Var = (gd4) a.get(this);
        gd4Var.getClass();
        long j = gd4.f.get(gd4Var);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            gd4 gd4Var = (gd4) atomicReferenceFieldUpdater.get(this);
            Object objD = gd4Var.d();
            if (objD != gd4.g) {
                return objD;
            }
            gd4 gd4VarC = gd4Var.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, gd4Var, gd4VarC) && atomicReferenceFieldUpdater.get(this) == gd4Var) {
            }
        }
    }
}
