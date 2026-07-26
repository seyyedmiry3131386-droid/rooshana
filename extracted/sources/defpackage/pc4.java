package defpackage;

import android.view.View;
import androidx.compose.ui.platform.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class pc4 {
    public static final s01 a = new s01(new ob4(3));

    public static dk5 a(qz0 qz0Var) {
        dk5 dk5Var;
        dk5 dk5Var2 = (dk5) qz0Var.j(a);
        if (dk5Var2 != null) {
            qz0Var.a0(950834231);
            qz0Var.q(false);
            return dk5Var2;
        }
        qz0Var.a0(950836184);
        View view = (View) qz0Var.j(e.f);
        js3.p(view, "<this>");
        while (true) {
            dk5Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(lr6.view_tree_navigation_event_dispatcher_owner);
            dk5 dk5Var3 = tag instanceof dk5 ? (dk5) tag : null;
            if (dk5Var3 != null) {
                dk5Var = dk5Var3;
                break;
            }
            Object objJ = h27.j(view);
            view = objJ instanceof View ? (View) objJ : null;
        }
        qz0Var.q(false);
        return dk5Var;
    }
}
