package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws4 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ ts4(ws4 ws4Var, Pair pair, int i) {
        this.a = i;
        this.b = ws4Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hd1 hd1Var = (hd1) this.b.b.i;
                Pair pair = this.c;
                hd1Var.G(((Integer) pair.first).intValue(), (ks4) pair.second);
                break;
            case 1:
                hd1 hd1Var2 = (hd1) this.b.b.i;
                Pair pair2 = this.c;
                hd1Var2.L(((Integer) pair2.first).intValue(), (ks4) pair2.second);
                break;
            default:
                hd1 hd1Var3 = (hd1) this.b.b.i;
                Pair pair3 = this.c;
                hd1Var3.w(((Integer) pair3.first).intValue(), (ks4) pair3.second);
                break;
        }
    }
}
