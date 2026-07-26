package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b50(yb ybVar, Object obj, int i) {
        this.a = i;
        this.b = ybVar;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb ybVar = this.b;
                if (ybVar.a == 0) {
                    ybVar.B(this.c);
                }
                break;
            default:
                yb ybVar2 = this.b;
                int i = ybVar2.a - 1;
                ybVar2.a = i;
                if (i == 0) {
                    ybVar2.B(this.c);
                }
                break;
        }
    }
}
