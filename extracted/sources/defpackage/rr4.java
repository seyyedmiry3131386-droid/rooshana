package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rr4 implements fs4, gs4 {
    public final /* synthetic */ is4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ rr4(is4 is4Var, int i, int i2) {
        this.a = is4Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.gs4
    public void a(qg6 qg6Var, hq4 hq4Var, List list) {
        is4 is4Var = this.a;
        qg6Var.C0(is4Var.p0(hq4Var, qg6Var, this.b), is4Var.p0(hq4Var, qg6Var, this.c), list);
    }

    @Override // defpackage.fs4
    public void b(qg6 qg6Var, hq4 hq4Var) {
        is4 is4Var = this.a;
        int iP0 = is4Var.p0(hq4Var, qg6Var, this.b);
        int iP02 = is4Var.p0(hq4Var, qg6Var, this.c);
        qg6Var.L0();
        ((e62) qg6Var.a).N0(iP0, iP02);
    }
}
