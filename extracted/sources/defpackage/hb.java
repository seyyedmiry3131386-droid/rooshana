package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hb implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u48 b;

    public /* synthetic */ hb(u48 u48Var, int i) {
        this.a = i;
        this.b = u48Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        u48 u48Var = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((Number) u48Var.getValue()).floatValue());
            case 1:
                return (zl6) u48Var.getValue();
            case 2:
                return (zl6) u48Var.getValue();
            case 3:
                return (zl6) u48Var.getValue();
            case 4:
                return new nr5(((nr5) u48Var.getValue()).a);
            case 5:
                al alVar = bn7.a;
                return new nr5(((nr5) u48Var.getValue()).a);
            case 6:
                return Boolean.valueOf(((Number) u48Var.getValue()).floatValue() > 0.0f);
            default:
                return Boolean.valueOf(((Number) u48Var.getValue()).floatValue() > 0.0f);
        }
    }
}
