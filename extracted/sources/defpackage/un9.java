package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class un9 extends po9 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String f;
    public final /* synthetic */ String g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ yo9 i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un9(yo9 yo9Var, String str, String str2, Object obj, boolean z) {
        super(yo9Var, true);
        this.f = str;
        this.g = str2;
        this.j = obj;
        this.h = z;
        Objects.requireNonNull(yo9Var);
        this.i = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        switch (this.e) {
            case 0:
                en9 en9Var = this.i.g;
                rq4.n(en9Var);
                en9Var.setUserProperty(this.f, this.g, new dr5(this.j), this.h, this.a);
                break;
            default:
                en9 en9Var2 = this.i.g;
                rq4.n(en9Var2);
                en9Var2.getUserProperties(this.f, this.g, this.h, (bn9) this.j);
                break;
        }
    }

    @Override // defpackage.po9
    public void b() {
        switch (this.e) {
            case 1:
                ((bn9) this.j).I(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un9(yo9 yo9Var, String str, String str2, boolean z, bn9 bn9Var) {
        super(yo9Var, true);
        this.f = str;
        this.g = str2;
        this.h = z;
        this.j = bn9Var;
        Objects.requireNonNull(yo9Var);
        this.i = yo9Var;
    }
}
