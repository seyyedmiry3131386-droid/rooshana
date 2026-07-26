package defpackage;

import ir.mservices.market.movie.data.webapi.CommonDataKt;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ba implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;

    public /* synthetic */ ba(int i, dp2 dp2Var) {
        this.a = i;
        this.b = dp2Var;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bl4.H("on", "player_ad_back", "movie_click");
                this.b.invoke(j9.a);
                break;
            case 1:
                th0.k(b.M(new Pair("on", "player_lock")), "movie_click");
                this.b.invoke(new rb6(true));
                break;
            case 2:
                th0.k(b.M(new Pair("on", "player_unlock")), "movie_click");
                this.b.invoke(new rb6(false));
                break;
            case 3:
                this.b.invoke(xb6.a);
                break;
            case 4:
                this.b.invoke(new oc6(true));
                break;
            case 5:
                th0.k(b.M(new Pair("on", "player_lock")), "movie_click");
                this.b.invoke(new rb6(true));
                break;
            case 6:
                th0.k(b.M(new Pair("on", "player_unlock")), "movie_click");
                this.b.invoke(new rb6(false));
                break;
            case 7:
                break;
            case 8:
                this.b.invoke(new oc6(false));
                break;
            case 9:
                this.b.invoke(xb6.a);
                break;
            case 10:
                th0.k(b.M(new Pair("on", xa7.c("player_watch_beginning", dy3.k ? "land" : CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT))), "movie_click");
                kb6 kb6Var = new kb6();
                dp2 dp2Var = this.b;
                dp2Var.invoke(kb6Var);
                dp2Var.invoke(new cc6(0L));
                break;
            case 11:
                this.b.invoke(xb6.a);
                break;
            case 12:
                this.b.invoke(ud6.a);
                break;
            case 13:
                this.b.invoke(new rb6(false));
                break;
            default:
                this.b.invoke(rd6.a);
                break;
        }
        return tx8.a;
    }
}
