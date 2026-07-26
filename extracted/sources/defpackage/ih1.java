package defpackage;

import androidx.fragment.app.b;
import androidx.fragment.app.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ih1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p28 b;
    public final /* synthetic */ b c;

    public /* synthetic */ ih1(p28 p28Var, b bVar, int i) {
        this.a = i;
        this.b = p28Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p28 p28Var = this.b;
                js3.p(p28Var, "$operation");
                b bVar = this.c;
                js3.p(bVar, "this$0");
                if (g.N(2)) {
                    p28Var.toString();
                }
                p28Var.c(bVar);
                break;
            default:
                p28 p28Var2 = this.b;
                js3.p(p28Var2, "$operation");
                b bVar2 = this.c;
                js3.p(bVar2, "this$0");
                if (g.N(2)) {
                    p28Var2.toString();
                }
                p28Var2.c(bVar2);
                break;
        }
    }
}
