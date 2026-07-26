package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uq1 extends k {
    public final /* synthetic */ int a;
    public final vc0 b;

    public uq1(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new pj8();
                break;
            default:
                this.b = new tq1();
                break;
        }
    }

    @Override // defpackage.k
    public void a(CharSequence charSequence) {
        int i = this.a;
    }

    @Override // defpackage.k
    public boolean b(vc0 vc0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(vc0Var);
        }
    }

    @Override // defpackage.k
    public final vc0 d() {
        switch (this.a) {
            case 0:
                return (tq1) this.b;
            default:
                return (pj8) this.b;
        }
    }

    @Override // defpackage.k
    public boolean e() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.e();
        }
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        switch (this.a) {
            case 0:
                return wc0.a(yq1Var.b);
            default:
                return null;
        }
    }

    private final void h(CharSequence charSequence) {
    }
}
