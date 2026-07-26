package defpackage;

import androidx.media3.session.MediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tq4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xq4 b;

    public /* synthetic */ tq4(xq4 xq4Var, int i) {
        this.a = i;
        this.b = xq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xq4 xq4Var = this.b;
                c9 c9Var = xq4Var.v;
                if (c9Var != null) {
                    xq4Var.t.O(c9Var);
                }
                break;
            case 1:
                xq4 xq4Var2 = this.b;
                nm5 nm5Var = xq4Var2.w;
                if (nm5Var != null) {
                    ((MediaSessionService) nm5Var.b).g(xq4Var2.k, false);
                }
                break;
            case 2:
                xq4.a(this.b);
                break;
            default:
                this.b.u();
                break;
        }
    }
}
