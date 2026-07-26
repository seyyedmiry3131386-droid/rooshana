package defpackage;

import android.content.Context;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fy implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlayerMovieData b;
    public final /* synthetic */ dp2 c;
    public final /* synthetic */ Context d;

    public /* synthetic */ fy(PlayerMovieData playerMovieData, dp2 dp2Var, Context context, int i) {
        this.a = i;
        this.b = playerMovieData;
        this.c = dp2Var;
        this.d = context;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                String lowerCase = this.b.d.e.name().toLowerCase(Locale.ROOT);
                js3.o(lowerCase, "toLowerCase(...)");
                th0.k(b.M(new Pair("on", xa7.c(xa7.c("player", lowerCase), "share"))), "movie_click");
                Context context = this.d;
                this.c.invoke(new jb6(context, new iy(context, 0)));
                break;
            default:
                String lowerCase2 = this.b.d.e.name().toLowerCase(Locale.ROOT);
                js3.o(lowerCase2, "toLowerCase(...)");
                th0.k(b.M(new Pair("on", xa7.c(xa7.c("player", lowerCase2), "share"))), "movie_click");
                Context context2 = this.d;
                this.c.invoke(new jb6(context2, new iy(context2, 1)));
                break;
        }
        return tx8.a;
    }
}
