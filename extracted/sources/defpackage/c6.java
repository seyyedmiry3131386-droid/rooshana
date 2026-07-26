package defpackage;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.b;

/* JADX INFO: loaded from: classes.dex */
public final class c6 extends xj2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(View view, View view2, int i) {
        super(view2);
        this.j = i;
        this.k = view;
    }

    @Override // defpackage.xj2
    public final mv7 b() {
        e6 e6Var;
        switch (this.j) {
            case 0:
                d6 d6Var = ((ActionMenuItemView) this.k).m;
                if (d6Var == null || (e6Var = ((f6) d6Var).a.u) == null) {
                    return null;
                }
                return e6Var.a();
            case 1:
                e6 e6Var2 = ((h6) this.k).d.t;
                if (e6Var2 == null) {
                    return null;
                }
                return e6Var2.a();
            default:
                return ((ActivityChooserView) this.k).getListPopupWindow();
        }
    }

    @Override // defpackage.xj2
    public final boolean c() {
        mv7 mv7VarB;
        switch (this.j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.k;
                nt4 nt4Var = actionMenuItemView.k;
                return nt4Var != null && nt4Var.a(actionMenuItemView.h) && (mv7VarB = b()) != null && mv7VarB.b();
            case 1:
                ((h6) this.k).d.n();
                return true;
            default:
                ActivityChooserView activityChooserView = (ActivityChooserView) this.k;
                if (activityChooserView.b() || !activityChooserView.k) {
                    return true;
                }
                activityChooserView.a.getClass();
                throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
    }

    @Override // defpackage.xj2
    public boolean d() {
        switch (this.j) {
            case 1:
                b bVar = ((h6) this.k).d;
                if (bVar.v != null) {
                    return false;
                }
                bVar.b();
                return true;
            case 2:
                ((ActivityChooserView) this.k).a();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.j = 0;
        this.k = actionMenuItemView;
    }
}
