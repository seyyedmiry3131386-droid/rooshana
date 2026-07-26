package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.Visibility;

/* JADX INFO: loaded from: classes.dex */
public final class ua9 extends AnimatorListenerAdapter implements gr8 {
    public final ViewGroup a;
    public final View b;
    public final View c;
    public boolean d = true;
    public final /* synthetic */ Visibility e;

    public ua9(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.e = visibility;
        this.a = viewGroup;
        this.b = view;
        this.c = view2;
    }

    @Override // defpackage.gr8
    public final void b(Transition transition) {
        throw null;
    }

    @Override // defpackage.gr8
    public final void c(Transition transition) {
    }

    @Override // defpackage.gr8
    public final void d(Transition transition) {
        transition.C(this);
    }

    @Override // defpackage.gr8
    public final void e(Transition transition) {
        transition.C(this);
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
        if (this.d) {
            h();
        }
    }

    public final void h() {
        this.c.setTag(nr6.save_overlay_view, null);
        this.a.getOverlay().remove(this.b);
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        h();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.a.getOverlay().remove(this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.b;
        if (view.getParent() == null) {
            q69.a(view, this.a);
        } else {
            this.e.cancel();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.c;
            int i = nr6.save_overlay_view;
            View view2 = this.b;
            view.setTag(i, view2);
            q69.a(view2, this.a);
            this.d = true;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (z) {
            return;
        }
        h();
    }

    @Override // defpackage.gr8
    public final void a() {
    }

    @Override // defpackage.gr8
    public final void g() {
    }
}
