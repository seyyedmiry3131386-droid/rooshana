package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xn9 extends po9 {
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ yo9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn9(yo9 yo9Var, String str, int i) {
        super(yo9Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = str;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            case 2:
                this.f = str;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            default:
                this.f = str;
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
                en9Var.setUserId(this.f, this.a);
                break;
            case 1:
                en9 en9Var2 = this.g.g;
                rq4.n(en9Var2);
                en9Var2.beginAdUnitExposure(this.f, this.b);
                break;
            default:
                en9 en9Var3 = this.g.g;
                rq4.n(en9Var3);
                en9Var3.endAdUnitExposure(this.f, this.b);
                break;
        }
    }
}
