package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hk2 implements t18 {
    public final t18 a;

    public hk2(t18 t18Var) {
        js3.p(t18Var, "delegate");
        this.a = t18Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.t18
    public long f0(gh0 gh0Var, long j) {
        js3.p(gh0Var, "sink");
        return this.a.f0(gh0Var, j);
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.a.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
