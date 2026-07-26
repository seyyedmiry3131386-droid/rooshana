package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class t16 extends m91 {
    public final /* synthetic */ int n;
    public final String o;
    public final th0 p;
    public final boolean q;

    public t16(String str, int i, boolean z) {
        this.n = i;
        switch (i) {
            case 1:
                th0 th0Var = th0.b;
                Objects.requireNonNull(str, "name == null");
                this.o = str;
                this.p = th0Var;
                this.q = z;
                break;
            case 2:
                th0 th0Var2 = th0.b;
                Objects.requireNonNull(str, "name == null");
                this.o = str;
                this.p = th0Var2;
                this.q = z;
                break;
            default:
                th0 th0Var3 = th0.b;
                Objects.requireNonNull(str, "name == null");
                this.o = str;
                this.p = th0Var3;
                this.q = z;
                break;
        }
    }

    @Override // defpackage.m91
    public final void g(e57 e57Var, Object obj) {
        switch (this.n) {
            case 0:
                if (obj != null) {
                    this.p.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        e57Var.a(this.o, string, this.q);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    this.p.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        e57Var.b(this.o, string2, this.q);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.p.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        e57Var.d(this.o, string3, this.q);
                        break;
                    }
                }
                break;
        }
    }
}
