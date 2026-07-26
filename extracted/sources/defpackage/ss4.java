package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ss4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws4 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ op4 d;

    public /* synthetic */ ss4(ws4 ws4Var, Pair pair, op4 op4Var, int i) {
        this.a = i;
        this.b = ws4Var;
        this.c = pair;
        this.d = op4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd1 hd1Var = (hd1) this.b.b.i;
                Pair pair = this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                ks4 ks4Var = (ks4) pair.second;
                ks4Var.getClass();
                hd1Var.g(iIntValue, ks4Var, this.d);
                break;
            default:
                hd1 hd1Var2 = (hd1) this.b.b.i;
                Pair pair2 = this.c;
                hd1Var2.f(((Integer) pair2.first).intValue(), (ks4) pair2.second, this.d);
                break;
        }
    }
}
