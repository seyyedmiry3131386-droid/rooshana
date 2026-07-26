package defpackage;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class we9 extends af9 {
    public final WindowInsets.Builder c;

    public we9() {
        this.c = uc0.d();
    }

    @Override // defpackage.af9
    public lf9 b() {
        a();
        lf9 lf9VarH = lf9.h(null, this.c.build());
        lf9VarH.a.r(this.b);
        return lf9VarH;
    }

    @Override // defpackage.af9
    public void d(no3 no3Var) {
        this.c.setMandatorySystemGestureInsets(no3Var.e());
    }

    @Override // defpackage.af9
    public void e(no3 no3Var) {
        this.c.setStableInsets(no3Var.e());
    }

    @Override // defpackage.af9
    public void f(no3 no3Var) {
        this.c.setSystemGestureInsets(no3Var.e());
    }

    @Override // defpackage.af9
    public void g(no3 no3Var) {
        this.c.setSystemWindowInsets(no3Var.e());
    }

    @Override // defpackage.af9
    public void h(no3 no3Var) {
        this.c.setTappableElementInsets(no3Var.e());
    }

    public we9(lf9 lf9Var) {
        WindowInsets.Builder builderD;
        super(lf9Var);
        WindowInsets windowInsetsG = lf9Var.g();
        if (windowInsetsG != null) {
            builderD = uc0.e(windowInsetsG);
        } else {
            builderD = uc0.d();
        }
        this.c = builderD;
    }
}
