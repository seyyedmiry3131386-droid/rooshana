package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s52 implements q94, n31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;

    public /* synthetic */ s52(int i, float f) {
        this.a = i;
        this.b = f;
    }

    @Override // defpackage.n31
    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((qg6) obj).K0(this.b);
                break;
            default:
                ((qg6) obj).y(this.b);
                break;
        }
    }

    @Override // defpackage.q94
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((eb6) obj).n(this.b);
                break;
            default:
                ((eb6) obj).n(this.b);
                break;
        }
    }
}
