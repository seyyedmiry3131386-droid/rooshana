package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends o28 {
    public final dh1 c;

    public ch1(dh1 dh1Var) {
        this.c = dh1Var;
    }

    @Override // defpackage.o28
    public final void b(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        dh1 dh1Var = this.c;
        p28 p28Var = (p28) dh1Var.b;
        View view = p28Var.c.J;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((p28) dh1Var.b).c(this);
        if (g.N(2)) {
            p28Var.toString();
        }
    }

    @Override // defpackage.o28
    public final void c(ViewGroup viewGroup) {
        js3.p(viewGroup, "container");
        dh1 dh1Var = this.c;
        p28 p28Var = (p28) dh1Var.b;
        if (dh1Var.m()) {
            p28Var.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = p28Var.c.J;
        js3.o(context, "context");
        nc2 nc2VarC = dh1Var.C(context);
        if (nc2VarC == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Animation animation = (Animation) nc2VarC.b;
        if (animation == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (p28Var.a != SpecialEffectsController$Operation$State.a) {
            view.startAnimation(animation);
            p28Var.c(this);
            return;
        }
        viewGroup.startViewTransition(view);
        zk2 zk2Var = new zk2(animation, viewGroup, view);
        zk2Var.setAnimationListener(new bh1(p28Var, viewGroup, view, this));
        view.startAnimation(zk2Var);
        if (g.N(2)) {
            p28Var.toString();
        }
    }
}
