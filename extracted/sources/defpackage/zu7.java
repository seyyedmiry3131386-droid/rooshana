package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zu7 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bp2 b;
    public final /* synthetic */ bp2 c;

    public /* synthetic */ zu7(bp2 bp2Var, bp2 bp2Var2, int i) {
        this.a = i;
        this.b = bp2Var;
        this.c = bp2Var2;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke();
                this.c.invoke();
                break;
            default:
                mg8 mg8Var = (mg8) obj;
                this.b.invoke();
                bp2 bp2Var = this.c;
                if (bp2Var != null ? ((Boolean) bp2Var.invoke()).booleanValue() : true) {
                    mg8Var.close();
                }
                break;
        }
        return tx8.a;
    }
}
