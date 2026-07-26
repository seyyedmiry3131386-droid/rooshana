package defpackage;

import android.animation.Animator;
import android.graphics.Matrix;
import com.jsibbold.zoomage.ZoomageView;

/* JADX INFO: loaded from: classes.dex */
public final class ur0 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ur0(Object obj, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                js3.p(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                js3.p(animator, "animation");
                ((bp2) this.c).invoke();
                break;
            default:
                ((ZoomageView) this.c).setImageMatrix((Matrix) this.b);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.a) {
            case 0:
                wr0 wr0Var = (wr0) this.c;
                vr0 vr0Var = (vr0) this.b;
                wr0Var.a(1.0f, vr0Var, true);
                vr0Var.k = vr0Var.e;
                vr0Var.l = vr0Var.f;
                vr0Var.m = vr0Var.g;
                vr0Var.a((vr0Var.j + 1) % vr0Var.i.length);
                if (!wr0Var.f) {
                    wr0Var.e += 1.0f;
                } else {
                    wr0Var.f = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    if (vr0Var.n) {
                        vr0Var.n = false;
                    }
                }
                break;
            case 1:
                js3.p(animator, "animation");
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((wr0) this.c).e = 0.0f;
                break;
            case 1:
                js3.p(animator, "animation");
                ((bp2) this.b).invoke();
                break;
        }
    }

    public ur0(bp2 bp2Var, bp2 bp2Var2) {
        this.a = 1;
        this.b = bp2Var;
        this.c = bp2Var2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }
}
