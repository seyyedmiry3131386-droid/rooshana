package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bo4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go4 b;

    public /* synthetic */ bo4(go4 go4Var, int i) {
        this.a = i;
        this.b = go4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go4 go4Var = this.b;
                do4 do4Var = go4Var.n;
                if (do4Var != null) {
                    go4Var.d.unbindService(do4Var);
                    go4Var.n = null;
                }
                go4Var.c.n.clear();
                break;
            default:
                go4 go4Var2 = this.b;
                he6 he6Var = go4Var2.H;
                if (he6Var != null) {
                    go4Var2.C0(he6Var, fe6.c);
                }
                break;
        }
    }
}
