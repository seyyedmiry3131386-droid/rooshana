package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: loaded from: classes.dex */
public final class k90 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ r90 b;

    public /* synthetic */ k90(r90 r90Var, int i) {
        this.a = i;
        this.b = r90Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                r90 r90Var = this.b;
                u41 u41Var = r90Var.j;
                int i = r90Var.c;
                int i2 = r90Var.a;
                int i3 = i - i2;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) u41Var;
                snackbarContentLayout.a.setAlpha(0.0f);
                long j = i2;
                ViewPropertyAnimator duration = snackbarContentLayout.a.animate().alpha(1.0f).setDuration(j);
                TimeInterpolator timeInterpolator = snackbarContentLayout.c;
                long j2 = i3;
                duration.setInterpolator(timeInterpolator).setStartDelay(j2).start();
                if (snackbarContentLayout.b.getVisibility() == 0) {
                    snackbarContentLayout.b.setAlpha(0.0f);
                    snackbarContentLayout.b.animate().alpha(1.0f).setDuration(j).setInterpolator(timeInterpolator).setStartDelay(j2).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
