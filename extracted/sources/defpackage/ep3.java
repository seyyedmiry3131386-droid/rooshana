package defpackage;

import android.app.Application;
import android.content.Context;
import de.greenrobot.event.EventBusException;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.intro.IntroViewModel;
import ir.mservices.market.login.ui.LoginViewModel;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersViewModel;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel;
import ir.mservices.market.movie.ui.detail.MovieDetailViewModel;
import ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListViewModel;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel;
import ir.mservices.market.movie.ui.detail.review.model.a;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel;
import ir.mservices.market.movie.ui.home.MovieHomeViewModel;
import ir.mservices.market.movie.ui.list.MovieBannerListViewModel;
import ir.mservices.market.movie.ui.list.MovieMoreViewModel;
import ir.mservices.market.movie.ui.search.result.MovieSearchResultViewModel;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.send.InstalledAppsViewModel;
import ir.mservices.market.pika.send.model.c;
import ir.mservices.market.social.level.LevelViewModel;
import ir.mservices.market.version2.services.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ep3 implements on6 {
    public static t32 A(rl3 rl3Var) {
        t32 t32Var;
        rl3Var.getClass();
        t32 t32Var2 = t32.p;
        v32 v32Var = new v32();
        v32Var.b = true;
        v32Var.a = false;
        synchronized (t32.class) {
            if (t32.p != null) {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
            t32.p = new t32(v32Var);
            t32Var = t32.p;
        }
        js3.o(t32Var, "installDefaultEventBus(...)");
        return t32Var;
    }

    public static dp3 a(Application application, t32 t32Var, ps1 ps1Var) {
        return new dp3(application, t32Var, ps1Var);
    }

    public static gp3 b() {
        gp3 gp3Var = new gp3();
        gp3Var.c = false;
        return gp3Var;
    }

    public static fr3 c() {
        return new fr3();
    }

    public static j84 d() {
        return new j84();
    }

    public static MoreDescriptionViewModel e(jd7 jd7Var, sl3 sl3Var) {
        return new MoreDescriptionViewModel(jd7Var, sl3Var);
    }

    public static MovieRecentDownloadViewModel f(n25 n25Var, nc2 nc2Var) {
        return new MovieRecentDownloadViewModel(n25Var, nc2Var);
    }

    public static IntroViewModel g(ol3 ol3Var) {
        return new IntroViewModel(ol3Var);
    }

    public static LoginViewModel h(jd7 jd7Var, zd4 zd4Var, fm8 fm8Var, vz7 vz7Var) {
        return new LoginViewModel(jd7Var, zd4Var, fm8Var, vz7Var);
    }

    public static MovieDownloadViewModel i(n25 n25Var, k68 k68Var, b56 b56Var, d56 d56Var, Context context) {
        return new MovieDownloadViewModel(n25Var, k68Var, b56Var, d56Var, context);
    }

    public static MoreStreamersViewModel j(qm5 qm5Var) {
        return new MoreStreamersViewModel(qm5Var);
    }

    public static MovieBookmarkViewModel k(c5 c5Var, ql4 ql4Var) {
        return new MovieBookmarkViewModel(c5Var, ql4Var);
    }

    public static MovieDetailViewModel l(jd7 jd7Var, pa2 pa2Var, gr5 gr5Var, ck4 ck4Var, n25 n25Var, y05 y05Var, a aVar) {
        return new MovieDetailViewModel(jd7Var, pa2Var, gr5Var, ck4Var, n25Var, y05Var, aVar);
    }

    public static MovieDetailMoreListViewModel m(jd7 jd7Var) {
        return new MovieDetailMoreListViewModel(jd7Var);
    }

    public static MovieCommentFlowViewModel n(c5 c5Var, a aVar, pi0 pi0Var, ir.mservices.market.movie.ui.detail.review.useCases.a aVar2, ir.mservices.market.movie.ui.detail.review.useCases.a aVar3, t47 t47Var) {
        return new MovieCommentFlowViewModel(c5Var, aVar, pi0Var, aVar2, aVar3, t47Var);
    }

    public static MovieReviewsViewModel o(jd7 jd7Var, vo4 vo4Var, gr5 gr5Var, pi0 pi0Var, c5 c5Var, a aVar) {
        return new MovieReviewsViewModel(jd7Var, vo4Var, gr5Var, pi0Var, c5Var, aVar);
    }

    public static MovieSeasonsViewModel p(jd7 jd7Var, u65 u65Var, n25 n25Var) {
        return new MovieSeasonsViewModel(jd7Var, u65Var, n25Var);
    }

    public static MovieHomeViewModel q(pa2 pa2Var, y05 y05Var) {
        return new MovieHomeViewModel(pa2Var, y05Var);
    }

    public static MovieBannerListViewModel r(jd7 jd7Var, ut4 ut4Var) {
        return new MovieBannerListViewModel(jd7Var, ut4Var);
    }

    public static MovieMoreViewModel s(jd7 jd7Var, k45 k45Var) {
        return new MovieMoreViewModel(jd7Var, k45Var);
    }

    public static MovieSearchResultViewModel t(jd7 jd7Var, ck4 ck4Var) {
        return new MovieSearchResultViewModel(jd7Var, ck4Var);
    }

    public static MovieUriViewModel u(vp7 vp7Var, r79 r79Var) {
        return new MovieUriViewModel(vp7Var, r79Var);
    }

    public static MyMarketViewModel v(b bVar, c5 c5Var, ps1 ps1Var, ul3 ul3Var, sl3 sl3Var, n25 n25Var) {
        return new MyMarketViewModel(bVar, c5Var, ps1Var, ul3Var, sl3Var, n25Var);
    }

    public static MyReviewsContentViewModel w(jd7 jd7Var) {
        return new MyReviewsContentViewModel(jd7Var);
    }

    public static InstalledAppsViewModel x(NearbyRepository nearbyRepository, c cVar) {
        return new InstalledAppsViewModel(nearbyRepository, cVar);
    }

    public static LevelViewModel y(jd7 jd7Var, Context context, hh2 hh2Var) {
        return new LevelViewModel(jd7Var, context, hh2Var);
    }

    public static ir.mservices.market.version2.manager.install.a z() {
        return new ir.mservices.market.version2.manager.install.a();
    }
}
