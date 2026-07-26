package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qw1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qw1(sw1 sw1Var, tw1 tw1Var, int i) {
        this.a = i;
        this.b = sw1Var;
        this.c = tw1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, tw1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, tw1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, tw1] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sw1 sw1Var = this.b;
                this.c.L(sw1Var.a, sw1Var.b);
                break;
            case 1:
                sw1 sw1Var2 = this.b;
                this.c.w(sw1Var2.a, sw1Var2.b);
                break;
            default:
                sw1 sw1Var3 = this.b;
                this.c.G(sw1Var3.a, sw1Var3.b);
                break;
        }
    }
}
