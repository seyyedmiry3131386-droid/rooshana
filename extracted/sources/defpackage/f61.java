package defpackage;

import androidx.compose.ui.autofill.a;
import androidx.compose.ui.node.h;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f61 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h61 b;

    public /* synthetic */ f61(h61 h61Var, int i) {
        this.a = i;
        this.b = h61Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        a aVar;
        a aVar2;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        h61 h61Var = this.b;
        switch (i) {
            case 0:
                h hVarH = y40.H(h61Var);
                if (!hVarH.v) {
                    AndroidComposeView androidComposeView = (AndroidComposeView) m14.a(hVarH);
                    if (AndroidComposeView.f() && (aVar = androidComposeView.L) != null) {
                        aVar.c(hVarH);
                    }
                }
                return tx8Var;
            case 1:
                h61Var.v.j(true);
                break;
            case 2:
                h61Var.v.f(true);
                break;
            case 3:
                h61Var.v.h();
                break;
            case 4:
                h hVarH2 = y40.H(h61Var);
                if (!hVarH2.v) {
                    AndroidComposeView androidComposeView2 = (AndroidComposeView) m14.a(hVarH2);
                    if (AndroidComposeView.f() && (aVar2 = androidComposeView2.L) != null) {
                        aVar2.c(hVarH2);
                    }
                }
                return tx8Var;
            case 5:
                h61Var.v.s();
                break;
            case 6:
                h61Var.s.w.b.r.x(h61Var.w.d);
                break;
            default:
                x44 x44Var = h61Var.s;
                qg2 qg2Var = h61Var.x;
                if (x44Var.b()) {
                    h18 h18Var = x44Var.c;
                    if (h18Var != null) {
                        ((cj1) h18Var).b();
                    }
                } else {
                    qg2 qg2Var2 = qg2.b;
                    qg2Var.a();
                }
                return Boolean.TRUE;
        }
        return Boolean.TRUE;
    }
}
