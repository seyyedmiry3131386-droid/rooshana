package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class i82 extends AnimatorListenerAdapter implements gr8 {
    public final View a;
    public boolean b = false;

    public i82(View view) {
        this.a = view;
    }

    @Override // defpackage.gr8
    public final void a() {
        View view = this.a;
        view.setTag(nr6.transition_pause_alpha, Float.valueOf(view.getVisibility() == 0 ? ba9.a.h(view) : 0.0f));
    }

    @Override // defpackage.gr8
    public final void b(Transition transition) {
        throw null;
    }

    @Override // defpackage.gr8
    public final void d(Transition transition) {
        throw null;
    }

    @Override // defpackage.gr8
    public final void e(Transition transition) {
    }

    @Override // defpackage.gr8
    public final void g() {
        this.a.setTag(nr6.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ba9.b(this.a, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.a;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.b = true;
            view.setLayerType(2, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        boolean z2 = this.b;
        View view = this.a;
        if (z2) {
            view.setLayerType(0, null);
        }
        if (z) {
            return;
        }
        ba9.b(view, 1.0f);
        ba9.a.getClass();
    }

    @Override // defpackage.gr8
    public final void c(Transition transition) {
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
    }
}
