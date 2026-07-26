package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kg9 implements d82 {
    public final pn6 a;
    public final pn6 b;
    public final ff7 c;
    public final pn6 d;

    public kg9(pn6 pn6Var, pn6 pn6Var2, ff7 ff7Var, pn6 pn6Var3) {
        this.a = pn6Var;
        this.b = pn6Var2;
        this.c = ff7Var;
        this.d = pn6Var3;
    }

    @Override // defpackage.pn6
    public final Object get() {
        return new o77((Executor) this.a.get(), (i42) this.b.get(), (pa2) this.c.get(), (od8) this.d.get());
    }
}
