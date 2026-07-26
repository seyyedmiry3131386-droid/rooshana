package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q87 implements va7 {
    public final yv6 a;

    public q87(yv6 yv6Var) {
        js3.p(yv6Var, "connection");
        this.a = yv6Var;
    }

    @Override // defpackage.va7
    public final va7 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.va7
    public final boolean b() {
        return true;
    }

    @Override // defpackage.va7
    public final yv6 c() {
        return this.a;
    }

    @Override // defpackage.va7, defpackage.n42
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.va7
    public final ua7 d() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.va7
    public final ua7 g() {
        throw new IllegalStateException("already connected");
    }
}
