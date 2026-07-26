package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bs4 implements hs4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hs4 b;

    public /* synthetic */ bs4(hs4 hs4Var, int i) {
        this.a = i;
        this.b = hs4Var;
    }

    @Override // defpackage.hs4
    public final Object h(xq4 xq4Var, hq4 hq4Var, int i) {
        switch (this.a) {
            case 0:
                if (xq4Var != null) {
                    throw new ClassCastException();
                }
                is4.o0(null, hq4Var, i, this.b, new p52(i, 6, hq4Var));
                throw null;
            default:
                return is4.o0(xq4Var, hq4Var, i, this.b, new y52(xq4Var, hq4Var, i));
        }
    }
}
