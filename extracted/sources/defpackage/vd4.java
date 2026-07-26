package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final class vd4 implements ActionMode.Callback {
    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        js3.p(actionMode, "mode");
        js3.p(menuItem, "item");
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        js3.p(actionMode, "mode");
        js3.p(menu, "menu");
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        js3.p(actionMode, "mode");
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        js3.p(actionMode, "mode");
        js3.p(menu, "menu");
        return false;
    }
}
