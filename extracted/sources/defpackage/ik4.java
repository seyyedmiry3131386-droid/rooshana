package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: loaded from: classes.dex */
public final class ik4 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ jk4 c;

    public ik4(jk4 jk4Var, boolean z, int i) {
        this.c = jk4Var;
        this.a = z;
        this.b = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jk4 jk4Var = this.c;
        jk4Var.b.setTranslationX(0.0f);
        jk4Var.d(0.0f, this.b, this.a);
    }
}
