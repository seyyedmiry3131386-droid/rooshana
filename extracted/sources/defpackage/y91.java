package defpackage;

import ir.mservices.market.activity.BaseNavigationContentViewModel;
import ir.mservices.market.app.appList.AppListViewModel;
import ir.mservices.market.app.bookmark.BookmarkViewModel;
import ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel;
import ir.mservices.market.app.detail.developer.ui.DeveloperViewModel;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel;
import ir.mservices.market.app.detail.reivews.AppReviewsViewModel;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel;
import ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel;
import ir.mservices.market.app.detail.update.InAppUpdateViewModel;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.packages.ui.PackageViewModel;
import ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel;
import ir.mservices.market.appUsage.AppsUsageViewModel;
import ir.mservices.market.common.search.BaseSearchViewModel;
import ir.mservices.market.download.DownloadContentViewModel;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.feedback.FeedbackTransactionViewModel;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.gateway.ui.GatewayListViewModel;
import ir.mservices.market.intro.IntroViewModel;
import ir.mservices.market.login.ui.LoginViewModel;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.download.quality.DownloadQualityViewModel;
import ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersViewModel;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel;
import ir.mservices.market.movie.ui.detail.MovieDetailViewModel;
import ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListViewModel;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel;
import ir.mservices.market.movie.ui.detail.review.useCases.a;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel;
import ir.mservices.market.movie.ui.home.MovieHomeViewModel;
import ir.mservices.market.movie.ui.ibex.IbexViewModel;
import ir.mservices.market.movie.ui.list.MovieBannerListViewModel;
import ir.mservices.market.movie.ui.list.MovieMoreViewModel;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.movie.ui.search.result.MovieSearchResultViewModel;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.mservices.market.myAccount.BaseMyAccountViewModel;
import ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel;
import ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel;
import ir.mservices.market.myAccount.inbox.InboxViewModel;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.complete.CompleteReviewViewModel;
import ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel;
import ir.mservices.market.pika.connect.PikaConnectViewModel;
import ir.mservices.market.pika.connect.PikaSelectDeviceViewModel;
import ir.mservices.market.pika.send.InstalledAppsViewModel;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.social.level.LevelViewModel;
import ir.mservices.market.social.mynet.MynetViewModel;
import ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel;
import ir.mservices.market.social.profile.own.OwnProfileViewModel;
import ir.mservices.market.social.search.MynetSearchViewModel;
import ir.mservices.market.social.users.followers.AccountFollowersViewModel;
import ir.mservices.market.social.users.followers.OtherAccountFollowersViewModel;
import ir.mservices.market.social.users.following.AccountFollowingViewModel;
import ir.mservices.market.social.users.following.OtherAccountFollowingViewModel;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel;
import ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class y91 implements xy2, ar2 {
    public final x91 A;
    public final x91 A0;
    public final x91 B;
    public final x91 B0;
    public final x91 C;
    public final x91 C0;
    public final x91 D;
    public final x91 D0;
    public final x91 E;
    public final x91 E0;
    public final x91 F;
    public final x91 F0;
    public final x91 G;
    public final x91 G0;
    public final x91 H;
    public final x91 H0;
    public final x91 I;
    public final on6 I0;
    public final x91 J;
    public final x91 J0;
    public final x91 K;
    public final x91 K0;
    public final x91 L;
    public final x91 L0;
    public final x91 M;
    public final x91 M0;
    public final x91 N;
    public final x91 N0;
    public final x91 O;
    public final x91 O0;
    public final x91 P;
    public final x91 P0;
    public final x91 Q;
    public final x91 Q0;
    public final x91 R;
    public final x91 R0;
    public final x91 S;
    public final x91 S0;
    public final x91 T;
    public final x91 T0;
    public final x91 U;
    public final x91 U0;
    public final x91 V;
    public final x91 V0;
    public final x91 W;
    public final x91 W0;
    public final x91 X;
    public final x91 X0;
    public final x91 Y;
    public final x91 Y0;
    public final x91 Z;
    public final x91 Z0;
    public final jd7 a;
    public final x91 a0;
    public final x91 a1;
    public final bq8 b;
    public final x91 b0;
    public final x91 b1;
    public final w91 c;
    public final x91 c0;
    public final x91 c1;
    public final x91 d;
    public final x91 d0;
    public final x91 d1;
    public final x91 e;
    public final x91 e0;
    public final x91 e1;
    public final x91 f;
    public final x91 f0;
    public final x91 f1;
    public final x91 g;
    public final x91 g0;
    public final x91 g1;
    public final x91 h;
    public final x91 h0;
    public final x91 i;
    public final x91 i0;
    public final x91 j;
    public final x91 j0;
    public final x91 k;
    public final x91 k0;
    public final x91 l;
    public final x91 l0;
    public final x91 m;
    public final x91 m0;
    public final x91 n;
    public final x91 n0;
    public final x91 o;
    public final x91 o0;
    public final x91 p;
    public final x91 p0;
    public final x91 q;
    public final x91 q0;
    public final x91 r;
    public final x91 r0;
    public final x91 s;
    public final x91 s0;
    public final x91 t;
    public final x91 t0;
    public final x91 u;
    public final x91 u0;
    public final x91 v;
    public final x91 v0;
    public final x91 w;
    public final x91 w0;
    public final x91 x;
    public final x91 x0;
    public final x91 y;
    public final x91 y0;
    public final x91 z;
    public final x91 z0;

    public y91(w91 w91Var, s91 s91Var, bq8 bq8Var, jd7 jd7Var) {
        this.c = w91Var;
        this.a = jd7Var;
        this.b = bq8Var;
        this.d = new x91(w91Var, this, 0);
        this.e = new x91(w91Var, this, 1);
        this.f = new x91(w91Var, this, 2);
        this.g = new x91(w91Var, this, 3);
        this.h = new x91(w91Var, this, 4);
        this.i = new x91(w91Var, this, 5);
        this.j = new x91(w91Var, this, 6);
        this.k = new x91(w91Var, this, 7);
        this.l = new x91(w91Var, this, 8);
        this.m = new x91(w91Var, this, 9);
        this.n = new x91(w91Var, this, 10);
        this.o = new x91(w91Var, this, 11);
        this.p = new x91(w91Var, this, 12);
        this.q = new x91(w91Var, this, 13);
        this.r = new x91(w91Var, this, 14);
        this.s = new x91(w91Var, this, 15);
        this.t = new x91(w91Var, this, 16);
        this.u = new x91(w91Var, this, 17);
        this.v = new x91(w91Var, this, 18);
        this.w = new x91(w91Var, this, 19);
        this.x = new x91(w91Var, this, 20);
        this.y = new x91(w91Var, this, 21);
        this.z = new x91(w91Var, this, 22);
        this.A = new x91(w91Var, this, 23);
        this.B = new x91(w91Var, this, 24);
        this.C = new x91(w91Var, this, 25);
        this.D = new x91(w91Var, this, 26);
        this.E = new x91(w91Var, this, 27);
        this.F = new x91(w91Var, this, 28);
        this.G = new x91(w91Var, this, 29);
        this.H = new x91(w91Var, this, 30);
        this.I = new x91(w91Var, this, 31);
        this.J = new x91(w91Var, this, 32);
        this.K = new x91(w91Var, this, 33);
        this.L = new x91(w91Var, this, 34);
        this.M = new x91(w91Var, this, 35);
        this.N = new x91(w91Var, this, 36);
        this.O = new x91(w91Var, this, 37);
        this.P = new x91(w91Var, this, 38);
        this.Q = new x91(w91Var, this, 39);
        this.R = new x91(w91Var, this, 40);
        this.S = new x91(w91Var, this, 41);
        this.T = new x91(w91Var, this, 42);
        this.U = new x91(w91Var, this, 43);
        this.V = new x91(w91Var, this, 44);
        this.W = new x91(w91Var, this, 45);
        this.X = new x91(w91Var, this, 46);
        this.Y = new x91(w91Var, this, 47);
        this.Z = new x91(w91Var, this, 48);
        this.a0 = new x91(w91Var, this, 49);
        this.b0 = new x91(w91Var, this, 50);
        this.c0 = new x91(w91Var, this, 51);
        this.d0 = new x91(w91Var, this, 52);
        this.e0 = new x91(w91Var, this, 53);
        this.f0 = new x91(w91Var, this, 54);
        this.g0 = new x91(w91Var, this, 55);
        this.h0 = new x91(w91Var, this, 56);
        this.i0 = new x91(w91Var, this, 57);
        this.j0 = new x91(w91Var, this, 58);
        this.k0 = new x91(w91Var, this, 59);
        this.l0 = new x91(w91Var, this, 60);
        this.m0 = new x91(w91Var, this, 61);
        this.n0 = new x91(w91Var, this, 62);
        this.o0 = new x91(w91Var, this, 63);
        this.p0 = new x91(w91Var, this, 64);
        this.q0 = new x91(w91Var, this, 65);
        this.r0 = new x91(w91Var, this, 66);
        this.s0 = new x91(w91Var, this, 67);
        this.t0 = new x91(w91Var, this, 68);
        this.u0 = new x91(w91Var, this, 69);
        this.v0 = new x91(w91Var, this, 70);
        this.w0 = new x91(w91Var, this, 71);
        this.x0 = new x91(w91Var, this, 72);
        this.y0 = new x91(w91Var, this, 73);
        this.z0 = new x91(w91Var, this, 74);
        this.A0 = new x91(w91Var, this, 75);
        this.B0 = new x91(w91Var, this, 76);
        this.C0 = new x91(w91Var, this, 77);
        this.D0 = new x91(w91Var, this, 78);
        this.E0 = new x91(w91Var, this, 79);
        this.F0 = new x91(w91Var, this, 80);
        this.G0 = new x91(w91Var, this, 81);
        this.H0 = new x91(w91Var, this, 82);
        this.I0 = dr1.b(new x91(w91Var, this, 84));
        this.J0 = new x91(w91Var, this, 83);
        this.K0 = new x91(w91Var, this, 85);
        this.L0 = new x91(w91Var, this, 86);
        this.M0 = new x91(w91Var, this, 87);
        this.N0 = new x91(w91Var, this, 88);
        this.O0 = new x91(w91Var, this, 89);
        this.P0 = new x91(w91Var, this, 90);
        this.Q0 = new x91(w91Var, this, 91);
        this.R0 = new x91(w91Var, this, 92);
        this.S0 = new x91(w91Var, this, 93);
        this.T0 = new x91(w91Var, this, 94);
        this.U0 = new x91(w91Var, this, 95);
        this.V0 = new x91(w91Var, this, 96);
        this.W0 = new x91(w91Var, this, 97);
        this.X0 = new x91(w91Var, this, 98);
        this.Y0 = new x91(w91Var, this, 99);
        this.Z0 = new x91(w91Var, this, 100);
        this.a1 = new x91(w91Var, this, 101);
        this.b1 = new x91(w91Var, this, 102);
        this.c1 = new x91(w91Var, this, 103);
        this.d1 = new x91(w91Var, this, 104);
        this.e1 = new x91(w91Var, this, 105);
        this.f1 = new x91(w91Var, this, 106);
        this.g1 = new x91(w91Var, this, 107);
    }

    public static void A(y91 y91Var, FontStyleViewModel fontStyleViewModel) {
        fontStyleViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void B(y91 y91Var, GatewayListViewModel gatewayListViewModel) {
        gatewayListViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void C(y91 y91Var, HomeViewModel homeViewModel) {
        homeViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void D(y91 y91Var, IbexViewModel ibexViewModel) {
        ibexViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void E(y91 y91Var, InAppUpdateActivityViewModel inAppUpdateActivityViewModel) {
        inAppUpdateActivityViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void F(y91 y91Var, InAppUpdateViewModel inAppUpdateViewModel) {
        inAppUpdateViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void G(y91 y91Var, InCompleteReviewViewModel inCompleteReviewViewModel) {
        inCompleteReviewViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void H(y91 y91Var, InboxViewModel inboxViewModel) {
        inboxViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void I(y91 y91Var, InstalledAppsViewModel installedAppsViewModel) {
        installedAppsViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void J(y91 y91Var, IntroViewModel introViewModel) {
        introViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void K(y91 y91Var, LevelViewModel levelViewModel) {
        levelViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void L(y91 y91Var, LoginViewModel loginViewModel) {
        loginViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void M(y91 y91Var, MoreDescriptionViewModel moreDescriptionViewModel) {
        moreDescriptionViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void N(y91 y91Var, MoreStreamersViewModel moreStreamersViewModel) {
        moreStreamersViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void O(y91 y91Var, MovieBannerListViewModel movieBannerListViewModel) {
        movieBannerListViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void P(y91 y91Var, MovieBookmarkViewModel movieBookmarkViewModel) {
        movieBookmarkViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void Q(y91 y91Var, MovieCommentFlowViewModel movieCommentFlowViewModel) {
        movieCommentFlowViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void R(y91 y91Var, MovieDetailMoreListViewModel movieDetailMoreListViewModel) {
        movieDetailMoreListViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void S(y91 y91Var, MovieDetailViewModel movieDetailViewModel) {
        w91 w91Var = y91Var.c;
        movieDetailViewModel.c = (x57) w91Var.G.get();
        movieDetailViewModel.A = (pi0) w91Var.F0.get();
        movieDetailViewModel.B = (c5) w91Var.L.get();
    }

    public static void T(y91 y91Var, MovieDownloadViewModel movieDownloadViewModel) {
        movieDownloadViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void U(y91 y91Var, MovieHomeViewModel movieHomeViewModel) {
        movieHomeViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void V(y91 y91Var, MovieMoreViewModel movieMoreViewModel) {
        movieMoreViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void W(y91 y91Var, MovieRecentDownloadViewModel movieRecentDownloadViewModel) {
        movieRecentDownloadViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void X(y91 y91Var, MovieReviewsViewModel movieReviewsViewModel) {
        movieReviewsViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void Y(y91 y91Var, MovieSearchResultViewModel movieSearchResultViewModel) {
        movieSearchResultViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void Z(y91 y91Var, MovieSeasonsViewModel movieSeasonsViewModel) {
        movieSeasonsViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void a0(y91 y91Var, MovieUriViewModel movieUriViewModel) {
        movieUriViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void b(y91 y91Var, AccountFollowersViewModel accountFollowersViewModel) {
        accountFollowersViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void b0(y91 y91Var, MyMarketViewModel myMarketViewModel) {
        myMarketViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void c(y91 y91Var, AccountFollowingViewModel accountFollowingViewModel) {
        accountFollowingViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void c0(y91 y91Var, MyReviewsContentViewModel myReviewsContentViewModel) {
        myReviewsContentViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void d(y91 y91Var, AdGuardViewModel adGuardViewModel) {
        adGuardViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void d0(y91 y91Var, MynetSearchViewModel mynetSearchViewModel) {
        mynetSearchViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void e(y91 y91Var, AppBookmarkViewModel appBookmarkViewModel) {
        appBookmarkViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void e0(y91 y91Var, MynetViewModel mynetViewModel) {
        mynetViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void f(y91 y91Var, AppDetailRecommendationViewModel appDetailRecommendationViewModel) {
        appDetailRecommendationViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void f0(y91 y91Var, NicknameDialogViewModel nicknameDialogViewModel) {
        nicknameDialogViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void g(y91 y91Var, AppDetailViewModel appDetailViewModel) {
        appDetailViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void g0(y91 y91Var, OtherAccountFollowersViewModel otherAccountFollowersViewModel) {
        otherAccountFollowersViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void h(y91 y91Var, AppListViewModel appListViewModel) {
        appListViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void h0(y91 y91Var, OtherAccountFollowingViewModel otherAccountFollowingViewModel) {
        otherAccountFollowingViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void i(y91 y91Var, AppReviewsViewModel appReviewsViewModel) {
        appReviewsViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void i0(y91 y91Var, OwnProfileHeaderViewModel ownProfileHeaderViewModel) {
        ownProfileHeaderViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void j(y91 y91Var, AppSubReviewsViewModel appSubReviewsViewModel) {
        appSubReviewsViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void j0(y91 y91Var, OwnProfileViewModel ownProfileViewModel) {
        ownProfileViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void k(y91 y91Var, AppsUsageViewModel appsUsageViewModel) {
        appsUsageViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void k0(y91 y91Var, PackageViewModel packageViewModel) {
        packageViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void l(y91 y91Var, BaseMovieViewModel baseMovieViewModel) {
        baseMovieViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void l0(y91 y91Var, PikaConnectViewModel pikaConnectViewModel) {
        pikaConnectViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void m(y91 y91Var, BaseMyAccountViewModel baseMyAccountViewModel) {
        baseMyAccountViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void m0(y91 y91Var, PikaSelectDeviceViewModel pikaSelectDeviceViewModel) {
        pikaSelectDeviceViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void n(y91 y91Var, BaseNavigationContentViewModel baseNavigationContentViewModel) {
        baseNavigationContentViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void n0(y91 y91Var, PlayDetailViewModel playDetailViewModel) {
        playDetailViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void o(y91 y91Var, BaseSearchViewModel baseSearchViewModel) {
        baseSearchViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void p(y91 y91Var, BioDialogViewModel bioDialogViewModel) {
        bioDialogViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void q(y91 y91Var, BirthdayDialogViewModel birthdayDialogViewModel) {
        birthdayDialogViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void r(y91 y91Var, BookmarkViewModel bookmarkViewModel) {
        bookmarkViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void s(y91 y91Var, CheetahViewModel cheetahViewModel) {
        cheetahViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void t(y91 y91Var, CompleteReviewViewModel completeReviewViewModel) {
        completeReviewViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void u(y91 y91Var, DeveloperViewModel developerViewModel) {
        developerViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void v(y91 y91Var, DownloadContentViewModel downloadContentViewModel) {
        downloadContentViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void w(y91 y91Var, DownloadQualityViewModel downloadQualityViewModel) {
        downloadQualityViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void x(y91 y91Var, DownloadViewModel downloadViewModel) {
        downloadViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void y(y91 y91Var, FeedbackTransactionViewModel feedbackTransactionViewModel) {
        feedbackTransactionViewModel.c = (x57) y91Var.c.G.get();
    }

    public static void z(y91 y91Var, FeedbackViewModel feedbackViewModel) {
        feedbackViewModel.c = (x57) y91Var.c.G.get();
    }

    public final a o0() {
        return new a((p05) this.c.h2.get(), 0);
    }

    public final vr2 p0() {
        return new vr2((ir.mservices.market.common.model.a) this.c.R.get(), 0);
    }

    public final nm5 q0() {
        return new nm5((ir.mservices.market.common.model.a) this.c.R.get());
    }

    public final vr2 r0() {
        return new vr2((ir.mservices.market.common.model.a) this.c.R.get(), 2);
    }

    public final qm5 s0() {
        return new qm5((ir.mservices.market.common.model.a) this.c.R.get());
    }

    public final t47 t0() {
        return new t47((p05) this.c.h2.get());
    }

    public final a u0() {
        return new a((p05) this.c.h2.get(), 1);
    }
}
