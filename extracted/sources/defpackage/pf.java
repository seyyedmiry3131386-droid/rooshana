package defpackage;

import android.view.ActionMode;
import androidx.compose.foundation.text.contextmenu.internal.a;
import androidx.compose.foundation.text.selection.f;
import androidx.compose.material3.p;
import androidx.compose.ui.window.PopupLayout;
import androidx.compose.ui.window.h;

/* JADX INFO: loaded from: classes.dex */
public final class pf implements yp1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pf(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yp1
    public final void a() {
        switch (this.a) {
            case 0:
                ((cq1) this.b).b.invoke();
                break;
            case 1:
                h hVar = (h) this.b;
                hVar.dismiss();
                hVar.h.d();
                break;
            case 2:
                PopupLayout popupLayout = (PopupLayout) this.b;
                popupLayout.d();
                popupLayout.getClass();
                j27.k(popupLayout, null);
                popupLayout.o.removeViewImmediate(popupLayout);
                break;
            case 3:
                a aVar = (a) this.b;
                a18 a18Var = aVar.e;
                ts5 ts5Var = a18Var.h;
                if (ts5Var != null) {
                    ts5Var.b();
                }
                a18Var.a();
                ActionMode actionMode = aVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                aVar.h = null;
                break;
            case 4:
                ha0 ha0Var = (ha0) ((s08) ((androidx.compose.foundation.text.contextmenu.provider.a) this.b).c).getValue();
                if (ha0Var != null) {
                    ha0Var.close();
                }
                break;
            case 5:
                om0 om0Var = ((p) this.b).c;
                if (om0Var != null) {
                    om0Var.n(null);
                }
                break;
            case 6:
                ((f) this.b).r();
                break;
            case 7:
                ((wr2) this.b).a.a();
                break;
            case 8:
                ((w24) this.b).d = null;
                break;
            case 9:
                g34 g34Var = (g34) this.b;
                ry ryVar = g34Var.c;
                if (ryVar != null) {
                    ryVar.b = false;
                }
                g34Var.c = null;
                break;
            case 10:
                ((c34) this.b).f = true;
                break;
            default:
                lw4 lw4Var = (lw4) this.b;
                lw4Var.dismiss();
                lw4Var.i.d();
                break;
        }
    }
}
