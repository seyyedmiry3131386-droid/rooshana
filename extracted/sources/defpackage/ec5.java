package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.sync.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ec5 implements nm0, gc9 {
    public final om0 a;
    public final /* synthetic */ a b;

    public ec5(a aVar, om0 om0Var) {
        this.b = aVar;
        this.a = om0Var;
    }

    @Override // defpackage.gc9
    public final void a(wl7 wl7Var, int i) {
        this.a.a(wl7Var, i);
    }

    @Override // defpackage.nm0
    public final mu3 f(Object obj, rp2 rp2Var) {
        a aVar = this.b;
        va vaVar = new va(aVar, this);
        mu3 mu3VarF = this.a.f((tx8) obj, vaVar);
        if (mu3VarF != null) {
            a.h.set(aVar, null);
        }
        return mu3VarF;
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return this.a.e;
    }

    @Override // defpackage.nm0
    public final void j(Object obj, rp2 rp2Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.h;
        a aVar = this.b;
        atomicReferenceFieldUpdater.set(aVar, null);
        z45 z45Var = new z45(aVar, this);
        om0 om0Var = this.a;
        om0Var.D(tx8.a, om0Var.c, new va(2, z45Var));
    }

    @Override // defpackage.nm0
    public final boolean n(Throwable th) {
        return this.a.n(th);
    }

    @Override // defpackage.nm0
    public final void p(Object obj) {
        this.a.p(obj);
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
