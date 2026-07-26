package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class i74 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j74 b;

    public /* synthetic */ i74(j74 j74Var, int i) {
        this.a = i;
        this.b = j74Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                j74 j74Var = this.b;
                j74Var.d();
                s80 s80Var = j74Var.j;
                if (s80Var != null) {
                    s80Var.a((mm3) j74Var.a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationRepeat(animator);
                j74 j74Var = this.b;
                j74Var.g = (j74Var.g + 1) % j74Var.f.e.length;
                j74Var.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}
