package defpackage;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class mo9 extends po9 {
    public final /* synthetic */ boolean e;
    public final /* synthetic */ yo9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo9(yo9 yo9Var, boolean z) {
        super(yo9Var, true);
        this.e = z;
        Objects.requireNonNull(yo9Var);
        this.f = yo9Var;
    }

    @Override // defpackage.po9
    public final void a() {
        en9 en9Var = this.f.g;
        rq4.n(en9Var);
        en9Var.setDataCollectionEnabled(this.e);
    }
}
