package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class no9 extends po9 {
    public final /* synthetic */ int e;
    public final /* synthetic */ ro9 f;
    public final /* synthetic */ yo9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no9(yo9 yo9Var, ro9 ro9Var, int i) {
        super(yo9Var, true);
        this.e = i;
        switch (i) {
            case 1:
                this.f = ro9Var;
                Objects.requireNonNull(yo9Var);
                this.g = yo9Var;
                super(yo9Var, true);
                break;
            default:
                this.f = ro9Var;
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
                en9Var.registerOnMeasurementEventListener(this.f);
                break;
            default:
                en9 en9Var2 = this.g.g;
                rq4.n(en9Var2);
                en9Var2.unregisterOnMeasurementEventListener(this.f);
                break;
        }
    }
}
