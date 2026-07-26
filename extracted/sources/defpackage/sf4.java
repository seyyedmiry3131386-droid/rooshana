package defpackage;

import com.airbnb.lottie.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sf4 implements wf4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ float c;

    public /* synthetic */ sf4(b bVar, float f, int i) {
        this.a = i;
        this.b = bVar;
        this.c = f;
    }

    @Override // defpackage.wf4
    public final void run() {
        switch (this.a) {
            case 0:
                b bVar = this.b;
                gf4 gf4Var = bVar.a;
                float f = this.c;
                if (gf4Var != null) {
                    eg4 eg4Var = bVar.b;
                    eg4Var.j(eg4Var.j, aw4.f(gf4Var.l, gf4Var.m, f));
                } else {
                    bVar.g.add(new sf4(bVar, f, 0));
                }
                break;
            case 1:
                b bVar2 = this.b;
                gf4 gf4Var2 = bVar2.a;
                float f2 = this.c;
                if (gf4Var2 != null) {
                    bVar2.w((int) aw4.f(gf4Var2.l, gf4Var2.m, f2));
                } else {
                    bVar2.g.add(new sf4(bVar2, f2, 1));
                }
                break;
            default:
                this.b.y(this.c);
                break;
        }
    }
}
