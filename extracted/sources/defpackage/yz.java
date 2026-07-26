package defpackage;

import ir.myket.player.ui.audio.b;
import ir.myket.player.ui.client.c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yz implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pg0 b;
    public final /* synthetic */ iy6 c;
    public final /* synthetic */ dp2 d;
    public final /* synthetic */ int e;

    public /* synthetic */ yz(pg0 pg0Var, iy6 iy6Var, dp2 dp2Var, int i, int i2) {
        this.a = i2;
        this.b = pg0Var;
        this.c = iy6Var;
        this.d = dp2Var;
        this.e = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b.c(this.b, this.c, this.d, qz0Var, hs9.W(this.e | 1));
                break;
            default:
                c.b(this.b, this.c, this.d, qz0Var, hs9.W(this.e | 1));
                break;
        }
        return tx8.a;
    }
}
