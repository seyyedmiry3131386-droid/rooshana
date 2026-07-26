package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class us4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws4 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ da4 d;
    public final /* synthetic */ op4 e;

    public /* synthetic */ us4(ws4 ws4Var, Pair pair, da4 da4Var, op4 op4Var, int i) {
        this.a = i;
        this.b = ws4Var;
        this.c = pair;
        this.d = da4Var;
        this.e = op4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd1 hd1Var = (hd1) this.b.b.i;
                Pair pair = this.c;
                hd1Var.p(((Integer) pair.first).intValue(), (ks4) pair.second, this.d, this.e);
                break;
            default:
                hd1 hd1Var2 = (hd1) this.b.b.i;
                Pair pair2 = this.c;
                hd1Var2.s(((Integer) pair2.first).intValue(), (ks4) pair2.second, this.d, this.e);
                break;
        }
    }
}
