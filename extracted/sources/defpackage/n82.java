package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n82 implements va7 {
    public final ua7 a;

    public n82(Throwable th) {
        this.a = new ua7(this, null, th, 2);
    }

    @Override // defpackage.va7
    public final va7 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.va7
    public final boolean b() {
        return false;
    }

    @Override // defpackage.va7
    public final yv6 c() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.va7, defpackage.n42
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.va7
    public final ua7 d() {
        return this.a;
    }

    @Override // defpackage.va7
    public final ua7 g() {
        return this.a;
    }
}
