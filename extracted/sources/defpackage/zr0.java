package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class zr0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ es0 b;

    public /* synthetic */ zr0(es0 es0Var, int i) {
        this.a = i;
        this.b = es0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.j();
                break;
            default:
                es0 es0Var = this.b;
                ds0 revealInfo = es0Var.getRevealInfo();
                revealInfo.c = Float.MAX_VALUE;
                es0Var.setRevealInfo(revealInfo);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
