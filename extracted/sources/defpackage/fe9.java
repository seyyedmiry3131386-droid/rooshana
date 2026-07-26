package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class fe9 extends k6 implements mt4 {
    public final Context c;
    public final ot4 d;
    public do3 e;
    public WeakReference f;
    public final /* synthetic */ ge9 g;

    public fe9(ge9 ge9Var, Context context, do3 do3Var) {
        this.g = ge9Var;
        this.c = context;
        this.e = do3Var;
        ot4 ot4Var = new ot4(context);
        ot4Var.l = 1;
        this.d = ot4Var;
        ot4Var.e = this;
    }

    @Override // defpackage.k6
    public final void a() {
        ge9 ge9Var = this.g;
        if (ge9Var.y != this) {
            return;
        }
        boolean z = ge9Var.F;
        boolean z2 = ge9Var.G;
        if (z || z2) {
            ge9Var.z = this;
            ge9Var.A = this.e;
        } else {
            this.e.u(this);
        }
        this.e = null;
        ge9Var.r0(false);
        ActionBarContextView actionBarContextView = ge9Var.v;
        if (actionBarContextView.k == null) {
            actionBarContextView.e();
        }
        ge9Var.s.setHideOnContentScrollEnabled(ge9Var.L);
        ge9Var.y = null;
    }

    @Override // defpackage.k6
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.mt4
    public final boolean c(ot4 ot4Var, MenuItem menuItem) {
        do3 do3Var = this.e;
        if (do3Var != null) {
            return ((o77) do3Var.a).x(this, menuItem);
        }
        return false;
    }

    @Override // defpackage.k6
    public final ot4 e() {
        return this.d;
    }

    @Override // defpackage.k6
    public final MenuInflater f() {
        return new ac8(this.c);
    }

    @Override // defpackage.k6
    public final CharSequence g() {
        return this.g.v.getSubtitle();
    }

    @Override // defpackage.k6
    public final CharSequence h() {
        return this.g.v.getTitle();
    }

    @Override // defpackage.k6
    public final void j() {
        if (this.g.y != this) {
            return;
        }
        ot4 ot4Var = this.d;
        ot4Var.y();
        try {
            this.e.v(this, ot4Var);
        } finally {
            ot4Var.x();
        }
    }

    @Override // defpackage.k6
    public final boolean k() {
        return this.g.v.s;
    }

    @Override // defpackage.k6
    public final void m(View view) {
        this.g.v.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // defpackage.k6
    public final void n(int i) {
        p(this.g.q.getResources().getString(i));
    }

    @Override // defpackage.mt4
    public final void o(ot4 ot4Var) {
        if (this.e == null) {
            return;
        }
        j();
        b bVar = this.g.v.d;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // defpackage.k6
    public final void p(CharSequence charSequence) {
        this.g.v.setSubtitle(charSequence);
    }

    @Override // defpackage.k6
    public final void q(int i) {
        r(this.g.q.getResources().getString(i));
    }

    @Override // defpackage.k6
    public final void r(CharSequence charSequence) {
        this.g.v.setTitle(charSequence);
    }

    @Override // defpackage.k6
    public final void s(boolean z) {
        this.b = z;
        this.g.v.setTitleOptional(z);
    }
}
