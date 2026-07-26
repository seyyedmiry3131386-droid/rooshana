package defpackage;

import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class on2 implements gr8 {
    public final /* synthetic */ Runnable a;

    public on2(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.gr8
    public final void b(Transition transition) {
        throw null;
    }

    @Override // defpackage.gr8
    public final void c(Transition transition) {
    }

    @Override // defpackage.gr8
    public final void d(Transition transition) {
        this.a.run();
    }

    @Override // defpackage.gr8
    public final void e(Transition transition) {
        d(transition);
    }

    @Override // defpackage.gr8
    public final void a() {
    }

    @Override // defpackage.gr8
    public final void g() {
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
    }
}
