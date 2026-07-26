package defpackage;

import ir.myket.player.ui.audio.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c20 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c20(hx4 hx4Var, String str, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = str;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.b(this.b, this.c, qz0Var, hs9.W(55));
                break;
            case 1:
                wq2.a(this.b, this.c, qz0Var, hs9.W(1));
                break;
            default:
                sy7.c(this.b, this.c, qz0Var, hs9.W(1));
                break;
        }
        return tx8.a;
    }
}
