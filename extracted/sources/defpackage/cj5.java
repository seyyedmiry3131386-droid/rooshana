package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cj5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr8 b;

    public /* synthetic */ cj5(jr8 jr8Var, int i) {
        this.a = i;
        this.b = jr8Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(this.b.g.h() != Long.MIN_VALUE);
            case 1:
                jr8 jr8Var = this.b;
                return Boolean.valueOf((js3.i(((s08) jr8Var.d).getValue(), jr8Var.a.j()) && jr8Var.g.h() == Long.MIN_VALUE && !((Boolean) ((s08) jr8Var.h).getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.b.b());
        }
    }
}
