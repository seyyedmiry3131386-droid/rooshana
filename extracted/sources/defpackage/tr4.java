package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tr4 implements fs4, gs4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ is4 b;
    public final /* synthetic */ int c;

    public /* synthetic */ tr4(is4 is4Var, int i, int i2) {
        this.a = i2;
        this.b = is4Var;
        this.c = i;
    }

    @Override // defpackage.gs4
    public void a(qg6 qg6Var, hq4 hq4Var, List list) {
        switch (this.a) {
            case 1:
                qg6Var.h0(this.b.p0(hq4Var, qg6Var, this.c), list);
                break;
            case 2:
                is4 is4Var = this.b;
                is4Var.getClass();
                int size = list.size();
                int i = this.c;
                if (size != 1) {
                    qg6Var.C0(is4Var.p0(hq4Var, qg6Var, i), is4Var.p0(hq4Var, qg6Var, i + 1), list);
                } else {
                    qg6Var.T(is4Var.p0(hq4Var, qg6Var, i), (jp4) list.get(0));
                }
                break;
            default:
                qg6Var.h0(this.b.p0(hq4Var, qg6Var, this.c), list);
                break;
        }
    }

    @Override // defpackage.fs4
    public void b(qg6 qg6Var, hq4 hq4Var) {
        switch (this.a) {
            case 0:
                qg6Var.D0(this.b.p0(hq4Var, qg6Var, this.c));
                break;
            default:
                qg6Var.B0(this.b.p0(hq4Var, qg6Var, this.c));
                break;
        }
    }
}
