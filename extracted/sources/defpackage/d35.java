package defpackage;

import ir.mservices.market.movie.download.MovieDownloadButtonState;
import ir.mservices.market.movie.ui.detail.recycler.MovieHeaderData;
import ir.mservices.market.movie.ui.detail.recycler.c;
import ir.mservices.market.views.BigFillOvalButton;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class d35 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MovieHeaderData b;
    public final /* synthetic */ c c;

    public d35(MovieHeaderData movieHeaderData, c cVar) {
        this.a = 1;
        this.b = movieHeaderData;
        this.c = cVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                BigFillOvalButton bigFillOvalButton = this.c.x().x;
                MovieHeaderData movieHeaderData = this.b;
                bigFillOvalButton.setState(c.y(movieHeaderData, (Pair) obj, (dq4) movieHeaderData.p.getValue()));
                break;
            case 1:
                Pair pair = (Pair) obj;
                Object obj2 = pair.a;
                this.b.getClass();
                if (js3.i(obj2, "movie_header")) {
                    this.c.x().A.setState((MovieDownloadButtonState) pair.b);
                }
                break;
            default:
                BigFillOvalButton bigFillOvalButton2 = this.c.x().x;
                MovieHeaderData movieHeaderData2 = this.b;
                bigFillOvalButton2.setState(c.y(movieHeaderData2, (Pair) movieHeaderData2.m.getValue(), (dq4) obj));
                break;
        }
        return tx8.a;
    }

    public /* synthetic */ d35(c cVar, MovieHeaderData movieHeaderData, int i) {
        this.a = i;
        this.c = cVar;
        this.b = movieHeaderData;
    }
}
