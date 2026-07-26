package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fo6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go6 b;

    public /* synthetic */ fo6(go6 go6Var, int i) {
        this.a = i;
        this.b = go6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
