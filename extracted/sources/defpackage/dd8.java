package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dd8 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ dd8(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        hd8 hd8Var;
        switch (this.a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.b;
                if (!swipeRefreshLayout.c) {
                    swipeRefreshLayout.l();
                } else {
                    swipeRefreshLayout.B.setAlpha(255);
                    swipeRefreshLayout.B.start();
                    if (swipeRefreshLayout.H && (hd8Var = swipeRefreshLayout.b) != null) {
                        hd8Var.b();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.u.getTop();
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.b;
                if (!swipeRefreshLayout2.s) {
                    ed8 ed8Var = new ed8(swipeRefreshLayout2, 1);
                    swipeRefreshLayout2.D = ed8Var;
                    ed8Var.setDuration(150L);
                    ir0 ir0Var = swipeRefreshLayout2.u;
                    ir0Var.a = null;
                    ir0Var.clearAnimation();
                    swipeRefreshLayout2.u.startAnimation(swipeRefreshLayout2.D);
                }
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
