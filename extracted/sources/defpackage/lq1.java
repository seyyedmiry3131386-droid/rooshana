package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lq1 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;

    public /* synthetic */ lq1(hx4 hx4Var, float f, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = hx4Var;
        this.c = f;
        this.d = j;
        this.e = i2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                tt3.b(this.b, this.c, this.d, (qz0) obj, iW, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(1);
                tt3.i(this.b, this.c, this.d, (qz0) obj, iW2, this.e);
                break;
        }
        return tx8.a;
    }
}
