package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class an implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ln b;

    public /* synthetic */ an(ln lnVar, int i) {
        this.a = i;
        this.b = lnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.a) {
            case 0:
                ln lnVar = this.b;
                if ((lnVar.x0 & 1) != 0) {
                    lnVar.v(0);
                }
                if ((lnVar.x0 & 4096) != 0) {
                    lnVar.v(108);
                }
                lnVar.Z = false;
                lnVar.x0 = 0;
                break;
            default:
                ln lnVar2 = this.b;
                lnVar2.w.showAtLocation(lnVar2.v, 55, 0, 0);
                x89 x89Var = lnVar2.y;
                if (x89Var != null) {
                    x89Var.b();
                }
                if (lnVar2.A && (viewGroup = lnVar2.B) != null && viewGroup.isLaidOut()) {
                    lnVar2.v.setAlpha(0.0f);
                    x89 x89VarB = q69.b(lnVar2.v);
                    x89VarB.a(1.0f);
                    lnVar2.y = x89VarB;
                    x89VarB.e(new bn(0, this));
                } else {
                    lnVar2.v.setAlpha(1.0f);
                    lnVar2.v.setVisibility(0);
                }
                break;
        }
    }
}
