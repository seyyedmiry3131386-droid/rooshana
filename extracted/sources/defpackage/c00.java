package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c00 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;

    public /* synthetic */ c00(int i, dp2 dp2Var) {
        this.a = i;
        this.b = dp2Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                this.b.invoke(rd6.a);
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.b.invoke(td6.a);
                break;
            default:
                this.b.invoke(rd6.a);
                break;
        }
        return tx8.a;
    }
}
