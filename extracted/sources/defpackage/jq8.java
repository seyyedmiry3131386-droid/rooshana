package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jq8 implements o70 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jq8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o70
    public final void a() {
        switch (this.a) {
            case 0:
                ((kq8) this.b).k = true;
                break;
            case 1:
                ((kq8) this.b).k = true;
                break;
            case 2:
                ((kq8) this.b).k = true;
                break;
            default:
                t70 t70Var = (t70) this.b;
                boolean z = t70Var.r.l() == 1.0f;
                if (z != t70Var.x) {
                    t70Var.x = z;
                    t70Var.o.invalidateSelf();
                }
                break;
        }
    }
}
