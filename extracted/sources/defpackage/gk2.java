package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gk2 implements by7 {
    public final by7 a;

    public gk2(by7 by7Var) {
        js3.p(by7Var, "delegate");
        this.a = by7Var;
    }

    @Override // defpackage.by7
    public void X0(gh0 gh0Var, long j) {
        this.a.X0(gh0Var, j);
    }

    @Override // defpackage.by7, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a.close();
    }

    @Override // defpackage.by7, java.io.Flushable
    public void flush() {
        this.a.flush();
    }

    @Override // defpackage.by7
    public final dm8 i() {
        return this.a.i();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.a + ')';
    }
}
