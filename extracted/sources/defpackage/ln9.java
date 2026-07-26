package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ln9 implements iv9, tt5, dt5, zs5 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final h51 c;
    public final ox9 d;

    public /* synthetic */ ln9(Executor executor, h51 h51Var, ox9 ox9Var, int i) {
        this.a = i;
        this.b = executor;
        this.c = h51Var;
        this.d = ox9Var;
    }

    @Override // defpackage.iv9
    public final void a(bf8 bf8Var) {
        switch (this.a) {
            case 0:
                this.b.execute(new zh9(2, this, bf8Var, false));
                break;
            default:
                this.b.execute(new zh9(3, this, bf8Var, false));
                break;
        }
    }

    @Override // defpackage.zs5
    public void g() {
        this.d.o();
    }

    @Override // defpackage.dt5
    public void onFailure(Exception exc) {
        this.d.n(exc);
    }

    @Override // defpackage.tt5
    public void onSuccess(Object obj) {
        this.d.m(obj);
    }
}
