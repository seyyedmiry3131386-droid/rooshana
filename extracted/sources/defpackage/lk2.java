package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class lk2 extends t7 {
    public final /* synthetic */ AtomicReference a;

    public lk2(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.t7
    public final void a(Object obj) {
        t7 t7Var = (t7) this.a.get();
        if (t7Var == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        t7Var.a(obj);
    }

    @Override // defpackage.t7
    public final void b() {
        t7 t7Var = (t7) this.a.getAndSet(null);
        if (t7Var != null) {
            t7Var.b();
        }
    }
}
