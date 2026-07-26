package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class g48 extends k6 implements mt4 {
    public Context c;
    public ActionBarContextView d;
    public do3 e;
    public WeakReference f;
    public boolean g;
    public ot4 h;

    @Override // defpackage.k6
    public final void a() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.u(this);
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
        return ((o77) this.e.a).x(this, menuItem);
    }

    @Override // defpackage.k6
    public final ot4 e() {
        return this.h;
    }

    @Override // defpackage.k6
    public final MenuInflater f() {
        return new ac8(this.d.getContext());
    }

    @Override // defpackage.k6
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // defpackage.k6
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // defpackage.k6
    public final void j() {
        this.e.v(this, this.h);
    }

    @Override // defpackage.k6
    public final boolean k() {
        return this.d.s;
    }

    @Override // defpackage.k6
    public final void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.k6
    public final void n(int i) {
        p(this.c.getString(i));
    }

    @Override // defpackage.mt4
    public final void o(ot4 ot4Var) {
        j();
        b bVar = this.d.d;
        if (bVar != null) {
            bVar.n();
        }
    }

    @Override // defpackage.k6
    public final void p(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // defpackage.k6
    public final void q(int i) {
        r(this.c.getString(i));
    }

    @Override // defpackage.k6
    public final void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // defpackage.k6
    public final void s(boolean z) {
        this.b = z;
        this.d.setTitleOptional(z);
    }
}
