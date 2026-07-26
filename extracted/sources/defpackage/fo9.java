package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fo9 extends po9 {
    public final /* synthetic */ int e;
    public final /* synthetic */ bn9 f;
    public final /* synthetic */ yo9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo9(yo9 yo9Var, bn9 bn9Var, int i) {
        super(yo9Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = bn9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            case 2:
                this.f = bn9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            case 3:
                this.f = bn9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            case 4:
                this.f = bn9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            default:
                this.f = bn9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                break;
        }
    }

    @Override // defpackage.po9
    public final void a() {
        switch (this.e) {
            case 0:
                en9 en9Var = this.g.g;
                rq4.n(en9Var);
                en9Var.getGmpAppId(this.f);
                break;
            case 1:
                en9 en9Var2 = this.g.g;
                rq4.n(en9Var2);
                en9Var2.getCachedAppInstanceId(this.f);
                break;
            case 2:
                en9 en9Var3 = this.g.g;
                rq4.n(en9Var3);
                en9Var3.generateEventId(this.f);
                break;
            case 3:
                en9 en9Var4 = this.g.g;
                rq4.n(en9Var4);
                en9Var4.getCurrentScreenName(this.f);
                break;
            default:
                en9 en9Var5 = this.g.g;
                rq4.n(en9Var5);
                en9Var5.getCurrentScreenClass(this.f);
                break;
        }
    }

    @Override // defpackage.po9
    public final void b() {
        switch (this.e) {
            case 0:
                this.f.I(null);
                break;
            case 1:
                this.f.I(null);
                break;
            case 2:
                this.f.I(null);
                break;
            case 3:
                this.f.I(null);
                break;
            default:
                this.f.I(null);
                break;
        }
    }
}
