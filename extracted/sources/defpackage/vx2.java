package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vx2 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bp2 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vx2(hx4 hx4Var, Object obj, boolean z, bp2 bp2Var, int i, int i2) {
        this.a = i2;
        this.d = hx4Var;
        this.e = obj;
        this.b = z;
        this.c = bp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                zk8.g((hx4) this.d, (String) this.e, this.b, this.c, (qz0) obj, iW);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iW2 = hs9.W(1);
                bt2.c((lk5) this.d, this.b, this.c, (bp2) this.e, (qz0) obj, iW2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iW3 = hs9.W(1);
                ok4.e((hx4) this.d, (b32) this.e, this.b, this.c, (qz0) obj, iW3);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ vx2(lk5 lk5Var, boolean z, bp2 bp2Var, bp2 bp2Var2, int i) {
        this.a = 1;
        this.d = lk5Var;
        this.b = z;
        this.c = bp2Var;
        this.e = bp2Var2;
    }
}
