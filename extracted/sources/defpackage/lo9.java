package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo9 extends po9 {
    public final /* synthetic */ bn9 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ yo9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo9(yo9 yo9Var, bn9 bn9Var, int i) {
        super(yo9Var, true);
        this.e = bn9Var;
        this.f = i;
        this.g = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        en9 en9Var = this.g.g;
        rq4.n(en9Var);
        en9Var.getTestFlag(this.e, this.f);
    }

    @Override // defpackage.po9
    public final void b() {
        this.e.I(null);
    }
}
