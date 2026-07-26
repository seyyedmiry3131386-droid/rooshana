package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr8 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jr8 b;

    public /* synthetic */ mr8(jr8 jr8Var, int i) {
        this.a = i;
        this.b = jr8Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return new or8(this.b, 0);
            default:
                return new or8(this.b, 1);
        }
    }
}
