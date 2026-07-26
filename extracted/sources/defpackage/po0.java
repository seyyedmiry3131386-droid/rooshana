package defpackage;

import android.view.ViewGroup;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class po0 extends pr8 {
    public boolean a = false;
    public final ViewGroup b;

    public po0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void a() {
        sy7.n(this.b, false);
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void d(Transition transition) {
        if (!this.a) {
            sy7.n(this.b, false);
        }
        transition.C(this);
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void f(Transition transition) {
        sy7.n(this.b, false);
        this.a = true;
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void g() {
        sy7.n(this.b, true);
    }
}
