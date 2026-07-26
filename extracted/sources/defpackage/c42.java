package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c42 extends d42 {
    public final Runnable c;

    public c42(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.d42
    public final String toString() {
        return super.toString() + this.c;
    }
}
