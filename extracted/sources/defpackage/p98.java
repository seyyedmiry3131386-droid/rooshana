package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class p98 extends ot4 implements SubMenu {
    public final vt4 A;
    public final ot4 z;

    public p98(Context context, ot4 ot4Var, vt4 vt4Var) {
        super(context);
        this.z = ot4Var;
        this.A = vt4Var;
    }

    @Override // defpackage.ot4
    public final boolean d(vt4 vt4Var) {
        return this.z.d(vt4Var);
    }

    @Override // defpackage.ot4
    public final boolean e(ot4 ot4Var, MenuItem menuItem) {
        return super.e(ot4Var, menuItem) || this.z.e(ot4Var, menuItem);
    }

    @Override // defpackage.ot4
    public final boolean f(vt4 vt4Var) {
        return this.z.f(vt4Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.ot4
    public final String j() {
        vt4 vt4Var = this.A;
        int i = vt4Var != null ? vt4Var.a : 0;
        if (i == 0) {
            return null;
        }
        return rm7.n(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.ot4
    public final ot4 k() {
        return this.z.k();
    }

    @Override // defpackage.ot4
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.ot4
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.ot4
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.ot4, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.ot4, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }
}
