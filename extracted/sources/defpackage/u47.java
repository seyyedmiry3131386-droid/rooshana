package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class u47 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ long b;
    public final /* synthetic */ x47 c;

    public u47(x47 x47Var, String str, long j) {
        this.c = x47Var;
        this.a = str;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x47 x47Var = this.c;
        bb9 bb9Var = x47Var.a;
        bb9Var.a(this.b, this.a);
        x47Var.toString();
        bb9Var.b();
    }
}
