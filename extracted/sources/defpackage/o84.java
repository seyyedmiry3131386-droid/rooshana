package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o84 extends k {
    public final m84 a;
    public boolean b;
    public int c;

    public o84(m84 m84Var) {
        this.a = m84Var;
    }

    @Override // defpackage.k
    public final boolean b(vc0 vc0Var) {
        if (!(vc0Var instanceof x84)) {
            return false;
        }
        if (this.b && this.c == 1) {
            this.a.f = false;
            this.b = false;
        }
        return true;
    }

    @Override // defpackage.k
    public final vc0 d() {
        return this.a;
    }

    @Override // defpackage.k
    public final boolean e() {
        return true;
    }

    @Override // defpackage.k
    public final wc0 g(yq1 yq1Var) {
        if (yq1Var.h) {
            this.b = true;
            this.c = 0;
        } else if (this.b) {
            this.c++;
        }
        return wc0.a(yq1Var.b);
    }
}
