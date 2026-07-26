package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.ui.DefaultTimeBar;

/* JADX INFO: loaded from: classes.dex */
public final class od6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ qd6 b;

    public /* synthetic */ od6(qd6 qd6Var, int i) {
        this.a = i;
        this.b = qd6Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qd6 qd6Var = this.b;
                View view = qd6Var.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = qd6Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = qd6Var.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                this.b.i(0);
                break;
            case 3:
                this.b.i(0);
                break;
            case 4:
                ViewGroup viewGroup3 = this.b.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup4 = this.b.h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        qd6 qd6Var = this.b;
        switch (i) {
            case 0:
                View view = qd6Var.j;
                if ((view instanceof DefaultTimeBar) && !qd6Var.A) {
                    DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                    ValueAnimator valueAnimator = defaultTimeBar.E;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(defaultTimeBar.F, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                View view2 = qd6Var.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = qd6Var.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = qd6Var.e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(qd6Var.A ? 0 : 4);
                }
                View view3 = qd6Var.j;
                if ((view3 instanceof DefaultTimeBar) && !qd6Var.A) {
                    ((DefaultTimeBar) view3).c(250L);
                    break;
                }
                break;
            case 2:
                qd6Var.i(4);
                break;
            case 3:
                qd6Var.i(4);
                break;
            case 4:
                ViewGroup viewGroup3 = qd6Var.h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    qd6Var.h.setTranslationX(r7.getWidth());
                    ViewGroup viewGroup4 = qd6Var.h;
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            default:
                ViewGroup viewGroup5 = qd6Var.f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
        }
    }
}
