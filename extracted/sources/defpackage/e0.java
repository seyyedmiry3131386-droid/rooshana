package defpackage;

import com.google.common.util.concurrent.b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends bt2 {
    public final AtomicReferenceFieldUpdater n;
    public final AtomicReferenceFieldUpdater o;
    public final AtomicReferenceFieldUpdater p;
    public final AtomicReferenceFieldUpdater q;
    public final AtomicReferenceFieldUpdater r;

    public e0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(6);
        this.n = atomicReferenceFieldUpdater;
        this.o = atomicReferenceFieldUpdater2;
        this.p = atomicReferenceFieldUpdater3;
        this.q = atomicReferenceFieldUpdater4;
        this.r = atomicReferenceFieldUpdater5;
    }

    @Override // defpackage.bt2
    public final void M(o0 o0Var, o0 o0Var2) {
        this.o.lazySet(o0Var, o0Var2);
    }

    @Override // defpackage.bt2
    public final void N(o0 o0Var, Thread thread) {
        this.n.lazySet(o0Var, thread);
    }

    @Override // defpackage.bt2
    public final boolean m(b bVar, d0 d0Var, d0 d0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.q;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, d0Var, d0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == d0Var);
        return false;
    }

    @Override // defpackage.bt2
    public final boolean n(b bVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.r;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == obj);
        return false;
    }

    @Override // defpackage.bt2
    public final boolean o(b bVar, o0 o0Var, o0 o0Var2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.p;
            if (atomicReferenceFieldUpdater.compareAndSet(bVar, o0Var, o0Var2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(bVar) == o0Var);
        return false;
    }

    @Override // defpackage.bt2
    public final d0 v(b bVar) {
        return (d0) this.q.getAndSet(bVar, d0.d);
    }

    @Override // defpackage.bt2
    public final o0 w(b bVar) {
        return (o0) this.p.getAndSet(bVar, o0.c);
    }
}
