package defpackage;

import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes.dex */
public final class pw7 implements e71, wn7 {
    public final /* synthetic */ e71 a;
    public final a b;

    public pw7(e71 e71Var, a aVar) {
        js3.p(e71Var, "scope");
        this.a = e71Var;
        this.b = aVar;
    }

    @Override // defpackage.wn7
    public final void a(dp2 dp2Var) {
        this.b.a(dp2Var);
    }

    public final boolean b(Throwable th) {
        return this.b.p(null, false);
    }

    @Override // defpackage.wn7
    public final Object c(g51 g51Var, Object obj) {
        return this.b.c(g51Var, obj);
    }

    @Override // defpackage.e71
    public final w61 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    @Override // defpackage.wn7
    public final Object o(Object obj) {
        return this.b.o(tx8.a);
    }
}
