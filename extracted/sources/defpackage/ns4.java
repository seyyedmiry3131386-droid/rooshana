package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns4 implements n31 {
    public final /* synthetic */ pg a;
    public final /* synthetic */ da4 b;
    public final /* synthetic */ op4 c;
    public final /* synthetic */ IOException d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ ns4(pg pgVar, da4 da4Var, op4 op4Var, IOException iOException, boolean z) {
        this.a = pgVar;
        this.b = da4Var;
        this.c = op4Var;
        this.d = iOException;
        this.e = z;
    }

    @Override // defpackage.n31
    public final void accept(Object obj) {
        ps4 ps4Var = (ps4) obj;
        pg pgVar = this.a;
        ps4Var.u(pgVar.b, (ks4) pgVar.c, this.b, this.c, this.d, this.e);
    }
}
