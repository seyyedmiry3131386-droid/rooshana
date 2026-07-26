package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public final class w29 implements rw7, Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public ValueAnimator a;
    public sw7 b;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.a();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.c();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.b.e(valueAnimator.getAnimatedFraction());
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
