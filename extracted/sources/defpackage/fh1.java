package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fh1 extends o28 {
    public final dh1 c;
    public AnimatorSet d;

    public fh1(dh1 dh1Var) {
        this.c = dh1Var;
    }

    @Override // defpackage.o28
    public final void b(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        AnimatorSet animatorSet = this.d;
        dh1 dh1Var = this.c;
        if (animatorSet == null) {
            ((p28) dh1Var.b).c(this);
            return;
        }
        p28 p28Var = (p28) dh1Var.b;
        if (!p28Var.g) {
            animatorSet.end();
        } else if (Build.VERSION.SDK_INT >= 26) {
            hh1.a.a(animatorSet);
        }
        if (g.N(2)) {
            p28Var.toString();
        }
    }

    @Override // defpackage.o28
    public final void c(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        p28 p28Var = (p28) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            p28Var.c(this);
            return;
        }
        animatorSet.start();
        if (g.N(2)) {
            Objects.toString(p28Var);
        }
    }

    @Override // defpackage.o28
    public final void d(f40 f40Var, ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        p28 p28Var = (p28) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            p28Var.c(this);
            return;
        }
        if (Build.VERSION.SDK_INT < 34 || !p28Var.c.n) {
            return;
        }
        if (g.N(2)) {
            p28Var.toString();
        }
        long jA = gh1.a.a(animatorSet);
        long j = (long) (f40Var.c * jA);
        if (j == 0) {
            j = 1;
        }
        if (j == jA) {
            j = jA - 1;
        }
        if (g.N(2)) {
            animatorSet.toString();
            p28Var.toString();
        }
        hh1.a.b(animatorSet, j);
    }

    @Override // defpackage.o28
    public final void e(ViewGroup viewGroup) {
        fh1 fh1Var;
        js3.p(viewGroup, "container");
        dh1 dh1Var = this.c;
        if (dh1Var.m()) {
            return;
        }
        Context context = viewGroup.getContext();
        js3.o(context, "context");
        nc2 nc2VarC = dh1Var.C(context);
        this.d = nc2VarC != null ? (AnimatorSet) nc2VarC.c : null;
        p28 p28Var = (p28) dh1Var.b;
        d dVar = p28Var.c;
        boolean z = p28Var.a == SpecialEffectsController$Operation$State.c;
        View view = dVar.J;
        viewGroup.startViewTransition(view);
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            fh1Var = this;
            animatorSet.addListener(new eh1(viewGroup, view, z, p28Var, fh1Var));
        } else {
            fh1Var = this;
        }
        AnimatorSet animatorSet2 = fh1Var.d;
        if (animatorSet2 != null) {
            animatorSet2.setTarget(view);
        }
    }
}
