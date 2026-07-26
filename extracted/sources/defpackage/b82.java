package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b82 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public b82(boolean z, View view, View view2) {
        this.b = z;
        this.c = view;
        this.d = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (!this.b) {
                    ((View) this.c).setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
                break;
            default:
                te2 te2Var = (te2) this.d;
                te2Var.r = 0;
                te2Var.m = null;
                nc2 nc2Var = (nc2) this.c;
                if (nc2Var != null) {
                    ((js3) nc2Var.b).J();
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.d;
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
                break;
            default:
                te2 te2Var = (te2) this.d;
                te2Var.v.a(0, this.b);
                te2Var.r = 2;
                te2Var.m = animator;
                break;
        }
    }

    public b82(te2 te2Var, boolean z, nc2 nc2Var) {
        this.d = te2Var;
        this.b = z;
        this.c = nc2Var;
    }
}
