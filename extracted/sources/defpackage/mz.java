package defpackage;

import ir.mservices.market.movie.data.webapi.CommonDataKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mz implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn5 b;
    public final /* synthetic */ zl6 c;
    public final /* synthetic */ dp2 d;

    public /* synthetic */ mz(pn5 pn5Var, zl6 zl6Var, dp2 dp2Var, int i) {
        this.a = i;
        this.b = pn5Var;
        this.c = zl6Var;
        this.d = dp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                s7.K(xa7.c("next_ep_play_orient", dy3.k ? "land" : CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT));
                pn5 pn5Var = this.b;
                int iOrdinal = pn5Var.a.g.ordinal();
                s7.J(iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE);
                zl6 zl6Var = this.c;
                long j = zl6Var.c;
                String strValueOf = String.valueOf(j > 0 ? (zl6Var.a * ((long) 100)) / j : 0L);
                js3.p(strValueOf, "moviePercent");
                s7.K(xa7.c("next_ep_play_percent", strValueOf));
                this.d.invoke(new hb6(pn5Var.a.b));
                break;
            default:
                s7.K(xa7.c("next_ep_play_orient", dy3.k ? "land" : CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT));
                pn5 pn5Var2 = this.b;
                int iOrdinal2 = pn5Var2.a.g.ordinal();
                s7.J(iOrdinal2 != 0 ? iOrdinal2 != 1 ? null : Boolean.FALSE : Boolean.TRUE);
                zl6 zl6Var2 = this.c;
                long j2 = zl6Var2.c;
                String strValueOf2 = String.valueOf(j2 > 0 ? (zl6Var2.a * ((long) 100)) / j2 : 0L);
                js3.p(strValueOf2, "moviePercent");
                s7.K(xa7.c("next_ep_play_percent", strValueOf2));
                this.d.invoke(new hb6(pn5Var2.a.b));
                break;
        }
        return tx8.a;
    }
}
