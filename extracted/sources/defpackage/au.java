package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.a;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.theme.ThemeMode;

/* JADX INFO: loaded from: classes3.dex */
public final class au extends a {
    public final /* synthetic */ int Y;
    public a79 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au(View view, pg5 pg5Var, og5 og5Var, og5 og5Var2, og5 og5Var3, og5 og5Var4, s82 s82Var, int i) {
        super(view, pg5Var, og5Var, og5Var2, og5Var3, og5Var4, s82Var);
        this.Y = i;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        int i = this.Y;
        View view = this.a;
        switch (i) {
            case 0:
                AppUpdateData appUpdateData = (AppUpdateData) myketRecyclerData;
                js3.p(appUpdateData, "data");
                super.x(appUpdateData);
                cz8 cz8Var = (cz8) this.Z;
                if (cz8Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout = cz8Var.B;
                Context context = view.getContext();
                js3.o(context, "getContext(...)");
                ea7 ea7Var = new ea7(context);
                ea7Var.b = sj8.b().q;
                ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_12));
                ea7Var.h = 0;
                constraintLayout.setBackground(ea7Var.a());
                return;
            default:
                AppUpdateData appUpdateData2 = (AppUpdateData) myketRecyclerData;
                js3.p(appUpdateData2, "data");
                sj8.b();
                ThemeMode themeMode = ThemeMode.a;
                ez8 ez8Var = (ez8) this.Z;
                if (ez8Var == null) {
                    js3.V("binding");
                    throw null;
                }
                ez8Var.z.setSolidBackgroundColor(Integer.valueOf(sj8.b().l));
                super.x(appUpdateData2);
                ez8Var.A.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.SRC_IN));
                ConstraintLayout constraintLayout2 = ez8Var.E;
                Context context2 = view.getContext();
                js3.o(context2, "getContext(...)");
                ea7 ea7Var2 = new ea7(context2);
                ea7Var2.b = sj8.b().g;
                ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.space_12));
                ea7Var2.h = 0;
                constraintLayout2.setBackground(ea7Var2.a());
                return;
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        switch (this.Y) {
            case 0:
                if (!(a79Var instanceof cz8)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.Z = (cz8) a79Var;
                }
                break;
            default:
                if (!(a79Var instanceof ez8)) {
                    lw.g(null, "binding is incompatible", null);
                } else {
                    this.Z = (ez8) a79Var;
                }
                break;
        }
    }
}
