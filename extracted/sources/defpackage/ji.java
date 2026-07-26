package defpackage;

import androidx.compose.runtime.internal.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ji implements qp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hx4 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ ji(hx4 hx4Var, a aVar, int i, int i2) {
        this.a = i2;
        this.b = hx4Var;
        this.c = aVar;
        this.d = i;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        qz0 qz0Var = (qz0) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                dy3.d(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            case 1:
                dy3.e(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            case 2:
                oh1.d(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            case 3:
                ok4.j(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
            default:
                ok4.i(this.b, this.c, qz0Var, hs9.W(this.d | 1));
                break;
        }
        return tx8.a;
    }
}
