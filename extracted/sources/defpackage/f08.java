package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f08 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;
    public final /* synthetic */ dp2 c;

    public /* synthetic */ f08(dp2 dp2Var, dp2 dp2Var2, int i) {
        this.a = i;
        this.b = dp2Var;
        this.c = dp2Var2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                this.c.invoke(obj);
                break;
            default:
                this.b.invoke(obj);
                this.c.invoke(obj);
                break;
        }
        return tx8.a;
    }
}
