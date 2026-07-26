package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.ViewGroup;
import defpackage.hu4;
import defpackage.j6;
import defpackage.mt4;
import defpackage.ot4;
import defpackage.pn8;
import defpackage.qn8;
import defpackage.ut4;
import defpackage.vo4;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements mt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ c(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.mt4
    public final boolean c(ot4 ot4Var, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        switch (this.a) {
            case 0:
                j6 j6Var = ((ActionMenuView) this.b).A;
                if (j6Var == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((ut4) j6Var).b;
                Iterator it = toolbar.mMenuHostHelper.b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        pn8 pn8Var = toolbar.mOnMenuItemClickListener;
                        zOnMenuItemSelected = pn8Var != null ? ((qn8) ((vo4) pn8Var).b).r.onMenuItemSelected(0, menuItem) : false;
                    } else if (((hu4) it.next()).a(menuItem)) {
                        zOnMenuItemSelected = true;
                    }
                }
                return zOnMenuItemSelected;
            default:
                mt4 mt4Var = ((Toolbar) this.b).mMenuBuilderCallback;
                return mt4Var != null && mt4Var.c(ot4Var, menuItem);
        }
    }

    @Override // defpackage.mt4
    public final void o(ot4 ot4Var) {
        switch (this.a) {
            case 0:
                mt4 mt4Var = ((ActionMenuView) this.b).v;
                if (mt4Var != null) {
                    mt4Var.o(ot4Var);
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.b;
                b bVar = toolbar.mMenuView.t;
                if (bVar == null || !bVar.k()) {
                    Iterator it = toolbar.mMenuHostHelper.b.iterator();
                    while (it.hasNext()) {
                        ((hu4) it.next()).d(ot4Var);
                    }
                }
                mt4 mt4Var2 = toolbar.mMenuBuilderCallback;
                if (mt4Var2 != null) {
                    mt4Var2.o(ot4Var);
                }
                break;
        }
    }
}
