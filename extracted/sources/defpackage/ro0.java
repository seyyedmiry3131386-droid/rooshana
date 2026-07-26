package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import androidx.transition.ChangeClipBounds;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class ro0 extends AnimatorListenerAdapter implements gr8 {
    public final Rect a;
    public final Rect b;
    public final View c;

    public ro0(View view, Rect rect, Rect rect2) {
        this.c = view;
        this.a = rect;
        this.b = rect2;
    }

    @Override // defpackage.gr8
    public final void a() {
        View view = this.c;
        Rect clipBounds = view.getClipBounds();
        if (clipBounds == null) {
            clipBounds = ChangeClipBounds.I;
        }
        view.setTag(nr6.transition_clip, clipBounds);
        view.setClipBounds(this.b);
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
        throw null;
    }

    @Override // defpackage.gr8
    public final void e(Transition transition) {
    }

    @Override // defpackage.gr8
    public final void g() {
        int i = nr6.transition_clip;
        View view = this.c;
        view.setClipBounds((Rect) view.getTag(i));
        view.setTag(nr6.transition_clip, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        View view = this.c;
        if (z) {
            view.setClipBounds(this.a);
        } else {
            view.setClipBounds(this.b);
        }
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
    }
}
