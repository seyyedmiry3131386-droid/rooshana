package defpackage;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class z62 extends a80 {
    public boolean g;
    public final /* synthetic */ ExtendedFloatingActionButton h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z62(ExtendedFloatingActionButton extendedFloatingActionButton, pj9 pj9Var) {
        super(extendedFloatingActionButton, pj9Var);
        this.h = extendedFloatingActionButton;
    }

    @Override // defpackage.a80
    public final int c() {
        return jp6.mtrl_extended_fab_hide_motion_spec;
    }

    @Override // defpackage.a80
    public final void d() {
        super.d();
        this.g = true;
    }

    @Override // defpackage.a80
    public final void e() {
        this.d.a = null;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.K = 0;
        if (this.g) {
            return;
        }
        extendedFloatingActionButton.setVisibility(8);
    }

    @Override // defpackage.a80
    public final void f(Animator animator) {
        pj9 pj9Var = this.d;
        Animator animator2 = (Animator) pj9Var.a;
        if (animator2 != null) {
            animator2.cancel();
        }
        pj9Var.a = animator;
        this.g = false;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.K = 1;
    }

    @Override // defpackage.a80
    public final void g() {
        this.h.setVisibility(8);
    }

    @Override // defpackage.a80
    public final boolean h() {
        int i = ExtendedFloatingActionButton.A0;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.h;
        if (extendedFloatingActionButton.getVisibility() == 0) {
            if (extendedFloatingActionButton.K != 1) {
                return false;
            }
        } else if (extendedFloatingActionButton.K == 2) {
            return false;
        }
        return true;
    }
}
