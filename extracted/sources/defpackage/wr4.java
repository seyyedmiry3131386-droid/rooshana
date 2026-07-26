package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wr4 implements n31, ms5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ wr4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        qg6 qg6Var = (qg6) obj;
        qg6Var.L0();
        ((e62) qg6Var.a).M0(this.a, this.b, this.c);
    }

    @Override // defpackage.ms5
    public lf9 q(View view, lf9 lf9Var) {
        js3.p(view, "view");
        no3 no3VarG = lf9Var.a.g(this.a);
        js3.o(no3VarG, "getInsets(...)");
        int i = no3VarG.d;
        int i2 = this.c;
        int i3 = this.b;
        view.setPadding(i3, i2, i3, i + i2);
        cc7.D(view, lf9Var);
        return lf9Var;
    }
}
