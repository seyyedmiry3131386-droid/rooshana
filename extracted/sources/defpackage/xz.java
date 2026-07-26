package defpackage;

import ir.myket.player.domain.models.PlayerMovieData;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xz implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u48 b;
    public final /* synthetic */ u48 c;

    public /* synthetic */ xz(u48 u48Var, u48 u48Var2, int i) {
        this.a = i;
        this.b = u48Var;
        this.c = u48Var2;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf((((wd6) this.b.getValue()).f || ((PlayerMovieData) this.c.getValue()).a()) ? false : true);
            default:
                return Boolean.valueOf((((wd6) this.b.getValue()).f || ((PlayerMovieData) this.c.getValue()).a()) ? false : true);
        }
    }
}
