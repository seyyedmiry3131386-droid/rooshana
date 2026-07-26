package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public /* synthetic */ qe0(BottomAppBar bottomAppBar, int i) {
        this.a = i;
        this.b = bottomAppBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 1:
                int i2 = BottomAppBar.y;
                bottomAppBar.c = null;
                break;
            case 2:
                int i3 = BottomAppBar.y;
                bottomAppBar.q = false;
                bottomAppBar.d = null;
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        BottomAppBar bottomAppBar = this.b;
        switch (i) {
            case 0:
                if (!bottomAppBar.q) {
                    bottomAppBar.K(bottomAppBar.e, bottomAppBar.r);
                }
                break;
            case 1:
                int i2 = BottomAppBar.y;
                break;
            case 2:
                int i3 = BottomAppBar.y;
                break;
            default:
                bottomAppBar.w.onAnimationStart(animator);
                View viewG = bottomAppBar.G();
                FloatingActionButton floatingActionButton = viewG instanceof FloatingActionButton ? (FloatingActionButton) viewG : null;
                if (floatingActionButton != null) {
                    floatingActionButton.setTranslationX(bottomAppBar.getFabTranslationX());
                }
                break;
        }
    }
}
