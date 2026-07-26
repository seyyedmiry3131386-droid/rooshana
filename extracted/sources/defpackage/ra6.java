package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ra6 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n08 b;
    public final /* synthetic */ n08 c;

    public /* synthetic */ ra6(n08 n08Var, n08 n08Var2, int i) {
        this.a = i;
        this.b = n08Var;
        this.c = n08Var2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                this.b.i(0);
                n08 n08Var = this.c;
                n08Var.i(n08Var.h() + iIntValue);
                break;
            case 1:
                this.b.i(0);
                n08 n08Var2 = this.c;
                n08Var2.i(n08Var2.h() + iIntValue);
                break;
            case 2:
                this.b.i(0);
                n08 n08Var3 = this.c;
                n08Var3.i(n08Var3.h() + iIntValue);
                break;
            default:
                this.b.i(0);
                n08 n08Var4 = this.c;
                n08Var4.i(n08Var4.h() + iIntValue);
                break;
        }
        return tx8.a;
    }
}
