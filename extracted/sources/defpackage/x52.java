package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x52 implements q94, n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ x52(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 3:
                ((qg6) obj).C(this.b);
                break;
            case 4:
                ((qg6) obj).H0(this.b);
                break;
            default:
                ((qg6) obj).m(this.b);
                break;
        }
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).t(this.b);
                break;
            case 1:
                ((eb6) obj).I(this.b);
                break;
            default:
                ((eb6) obj).t(this.b);
                break;
        }
    }
}
