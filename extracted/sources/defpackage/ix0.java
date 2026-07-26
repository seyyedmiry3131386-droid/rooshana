package defpackage;

import retrofit2.HttpException;

/* JADX INFO: loaded from: classes4.dex */
public final class ix0 implements il0 {
    public final /* synthetic */ int a;
    public final jx0 b;

    public /* synthetic */ ix0(jx0 jx0Var, int i) {
        this.a = i;
        this.b = jx0Var;
    }

    @Override // defpackage.il0
    public final void e(dl0 dl0Var, h77 h77Var) {
        switch (this.a) {
            case 0:
                boolean z = h77Var.a.q;
                jx0 jx0Var = this.b;
                if (!z) {
                    jx0Var.completeExceptionally(new HttpException(h77Var));
                } else {
                    jx0Var.complete(h77Var.b);
                }
                break;
            default:
                this.b.complete(h77Var);
                break;
        }
    }

    @Override // defpackage.il0
    public final void o(dl0 dl0Var, Throwable th) {
        switch (this.a) {
            case 0:
                this.b.completeExceptionally(th);
                break;
            default:
                this.b.completeExceptionally(th);
                break;
        }
    }
}
