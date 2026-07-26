package defpackage;

import ir.mservices.market.app.home.HomeFragment;
import ir.mservices.market.views.FastDownloadView;

/* JADX INFO: loaded from: classes3.dex */
public final class qb3 implements s82 {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn6 b;
    public final /* synthetic */ HomeFragment c;

    public /* synthetic */ qb3(bn6 bn6Var, HomeFragment homeFragment, int i) {
        this.a = i;
        this.b = bn6Var;
        this.c = homeFragment;
    }

    @Override // defpackage.s82
    public final void n(FastDownloadView fastDownloadView, r82 r82Var) {
        String str;
        String str2;
        String str3;
        switch (this.a) {
            case 0:
                this.b.n(fastDownloadView, r82Var);
                if (r82Var != null && (str = r82Var.b) != null) {
                    ra3 ra3VarG2 = this.c.g2();
                    String str4 = r82Var.c;
                    js3.o(str4, "getTitle(...)");
                    ra3VarG2.c(str4, str);
                    break;
                }
                break;
            case 1:
                this.b.n(fastDownloadView, r82Var);
                if (r82Var != null && (str2 = r82Var.b) != null) {
                    this.c.g2().c("outer_" + r82Var.c, str2);
                    break;
                }
                break;
            default:
                this.b.n(fastDownloadView, r82Var);
                if (r82Var != null && (str3 = r82Var.b) != null) {
                    ra3 ra3VarG22 = this.c.g2();
                    String str5 = r82Var.c;
                    js3.o(str5, "getTitle(...)");
                    ra3VarG22.c(str5, str3);
                    break;
                }
                break;
        }
    }
}
