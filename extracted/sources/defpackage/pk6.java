package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pk6 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ om0 b;

    public /* synthetic */ pk6(om0 om0Var, int i) {
        this.a = i;
        this.b = om0Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                om0 om0Var = this.b;
                tx8 tx8Var = tx8.a;
                om0Var.resumeWith(tx8Var);
                return tx8Var;
            default:
                om0 om0Var2 = this.b;
                tx8 tx8Var2 = tx8.a;
                om0Var2.resumeWith(tx8Var2);
                return tx8Var2;
        }
    }
}
