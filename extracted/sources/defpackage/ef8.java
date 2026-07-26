package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ef8 extends ze8 {
    public final Runnable c;

    public ef8(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(ub1.v(runnable));
        sb.append(", ");
        sb.append(this.a);
        sb.append(", ");
        return bl4.y(sb, this.b ? "Blocking" : "Non-blocking", ']');
    }
}
