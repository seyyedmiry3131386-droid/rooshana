package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zv6 implements AutoCloseable {
    public final ip1 a;

    public zv6(ip1 ip1Var) {
        this.a = ip1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
