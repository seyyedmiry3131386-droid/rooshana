package defpackage;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class so3 extends mu0 implements Runnable, ms5, View.OnAttachStateChangeListener {
    public final rf9 c;
    public boolean d;
    public boolean e;
    public lf9 f;

    public so3(rf9 rf9Var) {
        super(!rf9Var.t ? 1 : 0);
        this.c = rf9Var;
    }

    @Override // defpackage.mu0
    public final void g(ue9 ue9Var) {
        this.d = false;
        this.e = false;
        lf9 lf9Var = this.f;
        if (ue9Var.a.b() > 0 && lf9Var != null) {
            if9 if9Var = lf9Var.a;
            rf9 rf9Var = this.c;
            rf9Var.s.f(za7.w(if9Var.g(8)));
            rf9Var.r.f(za7.w(if9Var.g(8)));
            rf9.b(rf9Var, lf9Var);
        }
        this.f = null;
    }

    @Override // defpackage.mu0
    public final void h(ue9 ue9Var) {
        this.d = true;
        this.e = true;
    }

    @Override // defpackage.mu0
    public final lf9 i(lf9 lf9Var, List list) {
        rf9 rf9Var = this.c;
        rf9.b(rf9Var, lf9Var);
        return rf9Var.t ? lf9.b : lf9Var;
    }

    @Override // defpackage.mu0
    public final rn6 j(ue9 ue9Var, rn6 rn6Var) {
        this.d = false;
        return rn6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // defpackage.ms5
    public final lf9 q(View view, lf9 lf9Var) {
        this.f = lf9Var;
        rf9 rf9Var = this.c;
        b39 b39Var = rf9Var.r;
        if9 if9Var = lf9Var.a;
        b39Var.f(za7.w(if9Var.g(8)));
        if (this.d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.e) {
            rf9Var.s.f(za7.w(if9Var.g(8)));
            rf9.b(rf9Var, lf9Var);
        }
        return rf9Var.t ? lf9.b : lf9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d) {
            this.d = false;
            this.e = false;
            lf9 lf9Var = this.f;
            if (lf9Var != null) {
                rf9 rf9Var = this.c;
                rf9Var.s.f(za7.w(lf9Var.a.g(8)));
                rf9.b(rf9Var, lf9Var);
                this.f = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
