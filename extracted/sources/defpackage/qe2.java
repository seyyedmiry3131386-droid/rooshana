package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class qe2 extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ nc2 c;
    public final /* synthetic */ te2 d;

    public qe2(te2 te2Var, boolean z, nc2 nc2Var) {
        this.d = te2Var;
        this.b = z;
        this.c = nc2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        te2 te2Var = this.d;
        te2Var.r = 0;
        te2Var.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = te2Var.v;
        boolean z = this.b;
        floatingActionButton.a(z ? 8 : 4, z);
        nc2 nc2Var = this.c;
        if (nc2Var != null) {
            ((js3) nc2Var.b).I((FloatingActionButton) nc2Var.c);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        te2 te2Var = this.d;
        te2Var.v.a(0, this.b);
        te2Var.r = 1;
        te2Var.m = animator;
        this.a = false;
    }
}
