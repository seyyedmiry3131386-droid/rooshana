package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Matrix;
import android.widget.ImageView;
import androidx.transition.Transition;

/* JADX INFO: loaded from: classes.dex */
public final class to0 extends AnimatorListenerAdapter implements gr8 {
    public final ImageView a;
    public final Matrix b;
    public final Matrix c;
    public boolean d = true;

    public to0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        this.a = imageView;
        this.b = matrix;
        this.c = matrix2;
    }

    @Override // defpackage.gr8
    public final void a() {
        if (this.d) {
            int i = nr6.transition_image_transform;
            ImageView imageView = this.a;
            imageView.setTag(i, this.b);
            y97.j(imageView, this.c);
        }
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
        int i = nr6.transition_image_transform;
        ImageView imageView = this.a;
        Matrix matrix = (Matrix) imageView.getTag(i);
        if (matrix != null) {
            y97.j(imageView, matrix);
            imageView.setTag(nr6.transition_image_transform, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        this.d = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
        int i = nr6.transition_image_transform;
        ImageView imageView = this.a;
        imageView.setTag(i, matrix);
        y97.j(imageView, this.c);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        int i = nr6.transition_image_transform;
        ImageView imageView = this.a;
        Matrix matrix = (Matrix) imageView.getTag(i);
        if (matrix != null) {
            y97.j(imageView, matrix);
            imageView.setTag(nr6.transition_image_transform, null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d = false;
    }

    @Override // defpackage.gr8
    public final void f(Transition transition) {
    }
}
