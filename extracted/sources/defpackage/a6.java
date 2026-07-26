package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a6 implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a6(hx4 hx4Var, int i, bp2 bp2Var, int i2) {
        this.a = 0;
        this.c = hx4Var;
        this.b = i;
        this.d = bp2Var;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                int iW = hs9.W(1);
                tv8.a((hx4) this.c, this.b, (bp2) this.d, (qz0) obj, iW);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ml9.a((qz4) this.c, (dp2) this.d, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                rf0.a((wa) this.c, (dp2) this.d, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iW2 = hs9.W(this.b) | 1;
                ((a) this.c).d(this.d, (qz0) obj, iW2);
                break;
            case 4:
                ((Integer) obj2).intValue();
                zk8.b((um) this.c, (qp2) this.d, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                zk8.c((um[]) this.c, (qp2) this.d, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ub1.k((pj3) this.c, (dp2) this.d, (qz0) obj, hs9.W(this.b | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ir.myket.player.ui.client.controllers.common.a.b((hx4) this.c, (androidx.media3.ui.compose.state.a) this.d, (qz0) obj, hs9.W(65), this.b);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iW3 = hs9.W(1);
                yh0.i((hx4) this.c, (String) this.d, this.b, (qz0) obj, iW3);
                break;
            default:
                ((Integer) obj2).intValue();
                int iW4 = hs9.W(this.b | 1);
                ((jr8) this.c).a(this.d, (qz0) obj, iW4);
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ a6(hx4 hx4Var, androidx.media3.ui.compose.state.a aVar, int i, int i2) {
        this.a = 7;
        this.c = hx4Var;
        this.d = aVar;
        this.b = i2;
    }

    public /* synthetic */ a6(hx4 hx4Var, String str, int i, int i2) {
        this.a = 8;
        this.c = hx4Var;
        this.d = str;
        this.b = i;
    }

    public /* synthetic */ a6(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
