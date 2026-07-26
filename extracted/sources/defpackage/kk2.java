package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class kk2 extends dm8 {
    public dm8 e;

    public kk2(dm8 dm8Var) {
        js3.p(dm8Var, "delegate");
        this.e = dm8Var;
    }

    @Override // defpackage.dm8
    public final dm8 a() {
        return this.e.a();
    }

    @Override // defpackage.dm8
    public final dm8 b() {
        return this.e.b();
    }

    @Override // defpackage.dm8
    public final long c() {
        return this.e.c();
    }

    @Override // defpackage.dm8
    public final dm8 d(long j) {
        return this.e.d(j);
    }

    @Override // defpackage.dm8
    public final boolean e() {
        return this.e.e();
    }

    @Override // defpackage.dm8
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // defpackage.dm8
    public final dm8 g(long j) {
        js3.p(TimeUnit.MILLISECONDS, "unit");
        return this.e.g(j);
    }
}
