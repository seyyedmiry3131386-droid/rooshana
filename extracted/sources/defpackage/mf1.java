package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class mf1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ o b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ rf1 e;

    public mf1(rf1 rf1Var, o oVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = rf1Var;
        this.b = oVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.d.setListener(null);
                this.c.setAlpha(1.0f);
                rf1 rf1Var = this.e;
                o oVar = this.b;
                rf1Var.c(oVar);
                rf1Var.q.remove(oVar);
                rf1Var.n();
                break;
            default:
                this.d.setListener(null);
                rf1 rf1Var2 = this.e;
                o oVar2 = this.b;
                rf1Var2.c(oVar2);
                rf1Var2.o.remove(oVar2);
                rf1Var2.n();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public mf1(rf1 rf1Var, o oVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = rf1Var;
        this.b = oVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
