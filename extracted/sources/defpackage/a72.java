package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class a72 extends a80 {
    public final /* synthetic */ ExtendedFloatingActionButton g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a72(ExtendedFloatingActionButton extendedFloatingActionButton, pj9 pj9Var) {
        super(extendedFloatingActionButton, pj9Var);
        this.g = extendedFloatingActionButton;
    }

    @Override // defpackage.a80
    public final int c() {
        return jp6.mtrl_extended_fab_show_motion_spec;
    }

    @Override // defpackage.a80
    public final void e() {
        this.d.a = null;
        this.g.K = 0;
    }

    @Override // defpackage.a80
    public final void f(Animator animator) {
        pj9 pj9Var = this.d;
        Animator animator2 = (Animator) pj9Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        pj9Var.a = animator;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.K = 2;
    }

    @Override // defpackage.a80
    public final void g() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.a80
    public final boolean h() {
        int i = ExtendedFloatingActionButton.A0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.g;
        if (extendedFloatingActionButton.getVisibility() != 0) {
            if (extendedFloatingActionButton.K != 2) {
                return false;
            }
        } else if (extendedFloatingActionButton.K == 1) {
            return false;
        }
        return true;
    }
}
