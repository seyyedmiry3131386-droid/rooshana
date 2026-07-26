package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.SpecialEffectsController$Operation$State;
import androidx.fragment.app.g;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ p28 d;
    public final /* synthetic */ fh1 e;

    public eh1(ViewGroup viewGroup, View view, boolean z, p28 p28Var, fh1 fh1Var) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = p28Var;
        this.e = fh1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        js3.p(animator, "anim");
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        p28 p28Var = this.d;
        if (z || p28Var.a == SpecialEffectsController$Operation$State.c) {
            SpecialEffectsController$Operation$State specialEffectsController$Operation$State = p28Var.a;
            js3.o(view, "viewToAnimate");
            specialEffectsController$Operation$State.a(view, viewGroup);
        }
        fh1 fh1Var = this.e;
        ((p28) fh1Var.c.b).c(fh1Var);
        if (g.N(2)) {
            Objects.toString(p28Var);
        }
    }
}
