package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class i90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r90 c;

    public /* synthetic */ i90(r90 r90Var, int i, int i2) {
        this.a = i2;
        this.c = r90Var;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.d(this.b);
                break;
            default:
                this.c.d(this.b);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                r90 r90Var = this.c;
                u41 u41Var = r90Var.j;
                int i = r90Var.b;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) u41Var;
                snackbarContentLayout.a.setAlpha(1.0f);
                long j = i;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(0.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = 0;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(1.0f);
                    snackbarContentLayout.b.animate().alpha(0.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
