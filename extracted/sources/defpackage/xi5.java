package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xi5 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti5 b;

    public /* synthetic */ xi5(ti5 ti5Var, int i) {
        this.a = i;
        this.b = ti5Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        boolean zContains;
        String str = (String) obj;
        switch (this.a) {
            case 0:
                js3.p(str, "key");
                zContains = this.b.b().contains(str);
                break;
            default:
                js3.p(str, "key");
                zContains = this.b.b().contains(str);
                break;
        }
        return Boolean.valueOf(!zContains);
    }
}
