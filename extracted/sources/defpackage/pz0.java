package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pz0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pz0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) this.b;
                qz0Var.A--;
                break;
            default:
                z08 z08Var = (z08) this.b;
                z08Var.k--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((qz0) this.b).A++;
                break;
            default:
                ((z08) this.b).k++;
                break;
        }
    }
}
