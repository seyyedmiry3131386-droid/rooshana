package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e2 extends tt3 {
    public final AtomicReferenceFieldUpdater l;
    public final AtomicReferenceFieldUpdater m;
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;

    public e2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.l = atomicReferenceFieldUpdater;
        this.m = atomicReferenceFieldUpdater2;
        this.n = atomicReferenceFieldUpdater3;
        this.o = atomicReferenceFieldUpdater4;
        this.p = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.tt3
    public final void F(g2 g2Var, g2 g2Var2) {
        this.m.lazySet(g2Var, g2Var2);
    }

    @Override // defpackage.tt3
    public final void G(g2 g2Var, Thread thread) {
        this.l.lazySet(g2Var, thread);
    }

    @Override // defpackage.tt3
    public final boolean k(h2 h2Var, d2 d2Var, d2 d2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.o;
            if (atomicReferenceFieldUpdater.compareAndSet(h2Var, d2Var, d2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h2Var) == d2Var);
        return false;
    }

    @Override // defpackage.tt3
    public final boolean l(h2 h2Var, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(h2Var, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h2Var) == obj);
        return false;
    }

    @Override // defpackage.tt3
    public final boolean m(h2 h2Var, g2 g2Var, g2 g2Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.n;
            if (atomicReferenceFieldUpdater.compareAndSet(h2Var, g2Var, g2Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(h2Var) == g2Var);
        return false;
    }
}
