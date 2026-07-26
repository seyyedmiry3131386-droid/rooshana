package defpackage;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class yt4 implements MenuItem.OnActionExpandListener {
    public final MenuItem.OnActionExpandListener a;
    public final /* synthetic */ zt4 b;

    public yt4(zt4 zt4Var, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.b = zt4Var;
        this.a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.a.onMenuItemActionCollapse(this.b.j(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.a.onMenuItemActionExpand(this.b.j(menuItem));
    }
}
