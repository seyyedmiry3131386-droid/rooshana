package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.o;

/* JADX INFO: loaded from: classes.dex */
public final class of1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf1 b;
    public final /* synthetic */ ViewPropertyAnimator c;
    public final /* synthetic */ View d;
    public final /* synthetic */ rf1 e;

    public /* synthetic */ of1(rf1 rf1Var, pf1 pf1Var, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.a = i;
        this.e = rf1Var;
        this.b = pf1Var;
        this.c = viewPropertyAnimator;
        this.d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                pf1 pf1Var = this.b;
                o oVar = pf1Var.a;
                rf1 rf1Var = this.e;
                rf1Var.c(oVar);
                rf1Var.r.remove(pf1Var.a);
                rf1Var.n();
                break;
            default:
                this.c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                pf1 pf1Var2 = this.b;
                o oVar2 = pf1Var2.b;
                rf1 rf1Var2 = this.e;
                rf1Var2.c(oVar2);
                rf1Var2.r.remove(pf1Var2.b);
                rf1Var2.n();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                o oVar = this.b.a;
                this.e.getClass();
                break;
            default:
                o oVar2 = this.b.b;
                this.e.getClass();
                break;
        }
    }
}
