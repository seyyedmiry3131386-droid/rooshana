package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.media3.ui.PlayerControlView;

/* JADX INFO: loaded from: classes.dex */
public final class pd6 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerControlView b;
    public final /* synthetic */ qd6 c;

    public /* synthetic */ pd6(qd6 qd6Var, PlayerControlView playerControlView, int i) {
        this.a = i;
        this.c = qd6Var;
        this.b = playerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                qd6 qd6Var = this.c;
                qd6Var.i(1);
                if (qd6Var.B) {
                    this.b.post(qd6Var.s);
                    qd6Var.B = false;
                }
                break;
            case 1:
                qd6 qd6Var2 = this.c;
                qd6Var2.i(2);
                if (qd6Var2.B) {
                    this.b.post(qd6Var2.s);
                    qd6Var2.B = false;
                }
                break;
            default:
                qd6 qd6Var3 = this.c;
                qd6Var3.i(2);
                if (qd6Var3.B) {
                    this.b.post(qd6Var3.s);
                    qd6Var3.B = false;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.c.i(3);
                break;
            case 1:
                this.c.i(3);
                break;
            default:
                this.c.i(3);
                break;
        }
    }
}
