package defpackage;

import android.app.AlarmManager;
import android.os.Looper;
import com.microsoft.clarity.protomodels.mutationpayload.MutationPayload$DisplayCommandV2;
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
import ir.mservices.market.app.recommended.ui.RecommendedViewModel;
import ir.mservices.market.app.schedule.ui.ScheduleUpdateViewModel;
import ir.mservices.market.app.search.result.ui.SearchResultViewModel;
import ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel;
import ir.mservices.market.app.suggest.search.ui.SuggestListViewModel;
import ir.mservices.market.app.survey.SurveyViewModel;
import ir.mservices.market.app.update.UpdateViewModel;
import ir.mservices.market.app.update.common.UpdateLaunchViewModel;
import ir.mservices.market.app.url.UrlViewModel;
import ir.mservices.market.appUsage.AppsUsageViewModel;
import ir.mservices.market.common.comment.CommentFlowViewModel;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.common.comment.SubmitCommentViewModel;
import ir.mservices.market.common.search.BaseSearchViewModel;
import ir.mservices.market.common.uploadImage.UploadImageViewModel;
import ir.mservices.market.download.DownloadContentViewModel;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.download.recentDownload.RecentDownloadViewModel;
import ir.mservices.market.feedback.FeedbackTransactionViewModel;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.gateway.ui.GatewayListViewModel;
import ir.mservices.market.intro.IntroViewModel;
import ir.mservices.market.login.ui.LoginViewModel;
import ir.mservices.market.login.ui.PinViewModel;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.download.quality.DownloadQualityViewModel;
import ir.mservices.market.movie.streamers.StreamerProfileViewModel;
import ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersViewModel;
import ir.mservices.market.movie.streamers.movies.StreamerMoviesViewModel;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel;
import ir.mservices.market.movie.ui.detail.MovieDetailViewModel;
import ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListViewModel;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel;
import ir.mservices.market.movie.ui.home.MovieHomeViewModel;
import ir.mservices.market.movie.ui.ibex.IbexViewModel;
import ir.mservices.market.movie.ui.list.MovieBannerListViewModel;
import ir.mservices.market.movie.ui.list.MovieMoreViewModel;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.movie.ui.search.SearchIntentViewModel;
import ir.mservices.market.movie.ui.search.result.MovieSearchResultViewModel;
import ir.mservices.market.movie.uri.MovieUriViewModel;
import ir.mservices.market.myAccount.BaseMyAccountViewModel;
import ir.mservices.market.myAccount.city.SelectCityViewModel;
import ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel;
import ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel;
import ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel;
import ir.mservices.market.myAccount.inbox.InboxViewModel;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.complete.CompleteReviewViewModel;
import ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.PikaConnectViewModel;
import ir.mservices.market.pika.connect.PikaSelectDeviceViewModel;
import ir.mservices.market.pika.receive.ReceiveViewModel;
import ir.mservices.market.pika.send.InstalledAppsViewModel;
import ir.mservices.market.pika.send.SendAppViewModel;
import ir.mservices.market.purchaseTransaction.PurchaseTransactionViewModel;
import ir.mservices.market.reels.home.ui.ReelsHomeViewModel;
import ir.mservices.market.reels.ui.ReelsViewModel;
import ir.mservices.market.search.history.ui.SearchViewModel;
import ir.mservices.market.securityShield.SecurityShieldViewModel;
import ir.mservices.market.setting.SettingViewModel;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.setting.themeStyle.ThemeStyleViewModel;
import ir.mservices.market.social.level.LevelViewModel;
import ir.mservices.market.social.list.items.SelectedItemsViewModel;
import ir.mservices.market.social.list.search.SearchProfileListViewModel;
import ir.mservices.market.social.mynet.MynetViewModel;
import ir.mservices.market.social.profile.list.ProfileListViewModel;
import ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreViewModel;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel;
import ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel;
import ir.mservices.market.social.profile.own.OwnProfileViewModel;
import ir.mservices.market.social.profile.user.UserProfileHeaderViewModel;
import ir.mservices.market.social.profile.user.UserProfileViewModel;
import ir.mservices.market.social.requests.RequestViewModel;
import ir.mservices.market.social.search.MynetSearchViewModel;
import ir.mservices.market.social.search.UserSearchResultViewModel;
import ir.mservices.market.social.users.followers.AccountFollowersViewModel;
import ir.mservices.market.social.users.followers.OtherAccountFollowersViewModel;
import ir.mservices.market.social.users.following.AccountFollowingViewModel;
import ir.mservices.market.social.users.following.OtherAccountFollowingViewModel;
import ir.mservices.market.social.users.list.UsersListViewModel;
import ir.mservices.market.social.welcome.WelcomeViewModel;
import ir.mservices.market.togo.TogoViewModel;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.services.b;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.versionNote.ui.VersionNoteViewModel;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel;
import ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel;
import ir.mservices.market.webview.WebViewViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x91 implements on6 {
    public final w91 a;
    public final y91 b;
    public final int c;

    public x91(w91 w91Var, y91 y91Var, int i) {
        this.a = w91Var;
        this.b = y91Var;
        this.c = i;
    }

    @Override // defpackage.pn6
    public final Object get() {
        int i = this.c;
        int i2 = i / 100;
        w91 w91Var = this.a;
        y91 y91Var = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new AssertionError(i);
            }
            switch (i) {
                case 100:
                    UserProfileHeaderViewModel userProfileHeaderViewModel = new UserProfileHeaderViewModel(y91Var.a, new hl5((s19) w91Var.d3.get()), (cw5) w91Var.u1.get());
                    userProfileHeaderViewModel.c = (x57) y91Var.c.G.get();
                    return userProfileHeaderViewModel;
                case 101:
                    UserProfileViewModel userProfileViewModel = new UserProfileViewModel(new hl5((s19) w91Var.d3.get()));
                    userProfileViewModel.c = (x57) y91Var.c.G.get();
                    return userProfileViewModel;
                case 102:
                    UserSearchResultViewModel userSearchResultViewModel = new UserSearchResultViewModel(y91Var.a, new t15((oj7) w91Var.T2.get()));
                    userSearchResultViewModel.c = (x57) y91Var.c.G.get();
                    return userSearchResultViewModel;
                case 103:
                    UsernameDialogViewModel usernameDialogViewModel = new UsernameDialogViewModel(new e4((wc5) w91Var.E1.get(), 2), (c5) w91Var.L.get());
                    usernameDialogViewModel.c = (x57) y91Var.c.G.get();
                    return usernameDialogViewModel;
                case 104:
                    UsersListViewModel usersListViewModel = new UsersListViewModel((t19) w91Var.s1.get(), y91Var.a);
                    usersListViewModel.c = (x57) y91Var.c.G.get();
                    return usersListViewModel;
                case 105:
                    VersionNoteViewModel versionNoteViewModel = new VersionNoteViewModel(new bn6(w91Var.a.a, (lu7) w91Var.h.get()));
                    versionNoteViewModel.c = (x57) y91Var.c.G.get();
                    return versionNoteViewModel;
                case 106:
                    WebViewViewModel webViewViewModel = new WebViewViewModel((i10) w91Var.y.get(), (qu2) w91Var.N.get());
                    webViewViewModel.c = (x57) y91Var.c.G.get();
                    return webViewViewModel;
                case 107:
                    WelcomeViewModel welcomeViewModel = new WelcomeViewModel(new vr3(w91Var.a.a), w91Var.Y(), new f5((wc5) w91Var.E1.get(), 2), new e4((wc5) w91Var.E1.get(), 1), new pt2((wc5) w91Var.E1.get()), (c5) w91Var.L.get(), y91Var.a);
                    welcomeViewModel.c = (x57) y91Var.c.G.get();
                    return welcomeViewModel;
                default:
                    throw new AssertionError(i);
            }
        }
        switch (i) {
            case 0:
                AccountFollowersViewModel accountFollowersViewModelQ = m4.q(new r79((fh2) w91Var.q1.get()), (t19) w91Var.s1.get(), y91Var.a);
                y91.b(y91Var, accountFollowersViewModelQ);
                return accountFollowersViewModelQ;
            case 1:
                AccountFollowingViewModel accountFollowingViewModelR = m4.r(new pj9((gh2) w91Var.t1.get()), (t19) w91Var.s1.get(), (cw5) w91Var.u1.get(), y91Var.a);
                y91.c(y91Var, accountFollowingViewModelR);
                return accountFollowingViewModelR;
            case 2:
                AdGuardViewModel adGuardViewModelS = m4.s(w91Var.V(), (vl8) w91Var.o0.get(), y91Var.a);
                y91.d(y91Var, adGuardViewModelS);
                return adGuardViewModelS;
            case 3:
                AppBookmarkViewModel appBookmarkViewModelF = m4.f((c5) w91Var.L.get(), (a) w91Var.x.get(), (yl5) w91Var.D0.get(), new ql4((td0) w91Var.x1.get()));
                y91.e(y91Var, appBookmarkViewModelF);
                return appBookmarkViewModelF;
            case 4:
                AppDetailRecommendationViewModel appDetailRecommendationViewModelJ = m4.j(new th0(27));
                y91.f(y91Var, appDetailRecommendationViewModelJ);
                return appDetailRecommendationViewModelJ;
            case 5:
                AppDetailViewModel appDetailViewModelI = m4.i(y91Var.a, w91Var.W(), new xg5((ly6) w91Var.A1.get()), w91Var.e0(), new t15(11, w91Var.a.a), (yl5) w91Var.D0.get(), (a) w91Var.x.get(), (dp3) w91Var.v.get(), (wt) w91Var.z.get(), (ps1) w91Var.w.get(), (ir.mservices.market.version2.manager.a) w91Var.D.get(), y91Var.p0(), y91Var.r0(), (ir.mservices.market.app.update.common.manager.a) w91Var.h0.get(), (c5) w91Var.L.get(), new ql4((td0) w91Var.x1.get()), w91Var.r0(), (ec9) w91Var.C.get());
                y91.g(y91Var, appDetailViewModelI);
                return appDetailViewModelI;
            case 6:
                AppListViewModel appListViewModelD = m4.d((yl5) w91Var.D0.get(), (a) w91Var.x.get(), y91Var.a);
                y91.h(y91Var, appListViewModelD);
                return appListViewModelD;
            case 7:
                AppReviewsViewModel appReviewsViewModelG = m4.g(w91Var.F0(), (c5) w91Var.L.get(), (dp3) w91Var.v.get(), y91Var.p0(), y91Var.r0(), y91Var.a);
                y91.i(y91Var, appReviewsViewModelG);
                return appReviewsViewModelG;
            case 8:
                AppSubReviewsViewModel appSubReviewsViewModelH = m4.h(w91Var.H0(), (c5) w91Var.L.get(), y91Var.p0(), y91Var.r0(), y91Var.q0(), y91Var.a);
                y91.j(y91Var, appSubReviewsViewModelH);
                return appSubReviewsViewModelH;
            case 9:
                AppsUsageViewModel appsUsageViewModelK = m4.k(w91Var.X(), (dp3) w91Var.v.get());
                y91.k(y91Var, appsUsageViewModelK);
                return appsUsageViewModelK;
            case 10:
                BaseMovieViewModel baseMovieViewModelM = m4.m(y91Var.a);
                y91.l(y91Var, baseMovieViewModelM);
                return baseMovieViewModelM;
            case 11:
                BaseMyAccountViewModel baseMyAccountViewModelN = m4.n(w91Var.B0(), w91Var.Y(), (c5) w91Var.L.get());
                y91.m(y91Var, baseMyAccountViewModelN);
                return baseMyAccountViewModelN;
            case 12:
                BaseNavigationContentViewModel baseNavigationContentViewModelC = m4.c();
                y91.n(y91Var, baseNavigationContentViewModelC);
                return baseNavigationContentViewModelC;
            case 13:
                BaseSearchViewModel baseSearchViewModelL = m4.l(y91Var.a, (b90) w91Var.G1.get());
                y91.o(y91Var, baseSearchViewModelL);
                return baseSearchViewModelL;
            case 14:
                BioDialogViewModel bioDialogViewModelO = m4.o(new ub0((wc5) w91Var.E1.get(), 0));
                y91.p(y91Var, bioDialogViewModelO);
                return bioDialogViewModelO;
            case 15:
                BirthdayDialogViewModel birthdayDialogViewModelP = m4.p(new e4((wc5) w91Var.E1.get(), 1), (lu7) w91Var.h.get());
                y91.q(y91Var, birthdayDialogViewModelP);
                return birthdayDialogViewModelP;
            case 16:
                BookmarkViewModel bookmarkViewModelE = m4.e(y91Var.a);
                y91.r(y91Var, bookmarkViewModelE);
                return bookmarkViewModelE;
            case 17:
                CheetahViewModel cheetahViewModelV = jq0.v(w91Var.a0(), (vl8) w91Var.o0.get(), (lw8) w91Var.E.get(), y91Var.a);
                y91.s(y91Var, cheetahViewModelV);
                return cheetahViewModelV;
            case 18:
                return new CommentFlowViewModel(y91Var.a, (dp3) w91Var.v.get(), (c5) w91Var.L.get());
            case 19:
                return new CommentViewModel((ir.mservices.market.common.model.a) w91Var.R.get(), y91Var.r0(), (c5) w91Var.L.get(), (pi0) w91Var.F0.get(), (dp3) w91Var.v.get(), (x57) w91Var.G.get(), (c) w91Var.l0.get());
            case 20:
                CompleteReviewViewModel completeReviewViewModelS = jq0.s((c5) w91Var.L.get(), y91Var.p0(), w91Var.b0());
                y91.t(y91Var, completeReviewViewModelS);
                return completeReviewViewModelS;
            case 21:
                DeveloperViewModel developerViewModelG = jq0.g((ol1) w91Var.L1.get(), (a) w91Var.x.get(), (yl5) w91Var.D0.get(), y91Var.a);
                y91.u(y91Var, developerViewModelG);
                return developerViewModelG;
            case 22:
                DownloadContentViewModel downloadContentViewModelK = jq0.k(y91Var.a, (n25) w91Var.a0.get());
                y91.v(y91Var, downloadContentViewModelK);
                return downloadContentViewModelK;
            case 23:
                DownloadQualityViewModel downloadQualityViewModelP = jq0.p(y91Var.a, (n25) w91Var.a0.get());
                y91.w(y91Var, downloadQualityViewModelP);
                return downloadQualityViewModelP;
            case 24:
                DownloadViewModel downloadViewModelL = jq0.l((yl5) w91Var.D0.get(), w91Var.d0(), (ps1) w91Var.w.get(), (a) w91Var.x.get(), w91Var.e0());
                y91.x(y91Var, downloadViewModelL);
                return downloadViewModelL;
            case 25:
                FeedbackTransactionViewModel feedbackTransactionViewModelM = jq0.m(new ck4((zn6) w91Var.N1.get()));
                y91.y(y91Var, feedbackTransactionViewModelM);
                return feedbackTransactionViewModelM;
            case 26:
                FeedbackViewModel feedbackViewModelN = jq0.n(y91Var.a, w91Var.g0(), (lw8) w91Var.E.get(), (qu2) w91Var.N.get(), (c5) w91Var.L.get(), (fw4) w91Var.M.get());
                y91.z(y91Var, feedbackViewModelN);
                return feedbackViewModelN;
            case 27:
                FontStyleViewModel fontStyleViewModelU = jq0.u(new gv(22));
                y91.A(y91Var, fontStyleViewModelU);
                return fontStyleViewModelU;
            case 28:
                GatewayListViewModel gatewayListViewModelO = jq0.o(new av(24), y91Var.a);
                y91.B(y91Var, gatewayListViewModelO);
                return gatewayListViewModelO;
            case 29:
                HomeViewModel homeViewModelJ = jq0.j((dv2) w91Var.q.get(), (yl5) w91Var.D0.get(), (a) w91Var.x.get(), w91Var.h0(), new hl5((ry5) w91Var.Q1.get()), w91Var.e0(), new t15(11, w91Var.a.a), y91Var.p0(), y91Var.r0(), w91Var.x0(), w91Var.r0());
                y91.C(y91Var, homeViewModelJ);
                return homeViewModelJ;
            case 30:
                IbexViewModel ibexViewModelQ = jq0.q(y91Var.a);
                y91.D(y91Var, ibexViewModelQ);
                return ibexViewModelQ;
            case 31:
                InAppUpdateActivityViewModel inAppUpdateActivityViewModelH = jq0.h((wt) w91Var.z.get(), w91Var.I0(), (dp3) w91Var.v.get(), w91Var.i0());
                y91.E(y91Var, inAppUpdateActivityViewModelH);
                return inAppUpdateActivityViewModelH;
            case 32:
                InAppUpdateViewModel inAppUpdateViewModelI = jq0.i(y91Var.a, (ir.mservices.market.version2.manager.a) w91Var.D.get(), new gv(29), (ps1) w91Var.w.get(), (dp3) w91Var.v.get(), (yl5) w91Var.D0.get());
                y91.F(y91Var, inAppUpdateViewModelI);
                return inAppUpdateViewModelI;
            case 33:
                InCompleteReviewViewModel inCompleteReviewViewModelT = jq0.t((c5) w91Var.L.get(), (dx4) w91Var.m0.get(), y91Var.r0(), y91Var.s0(), w91Var.j0());
                y91.G(y91Var, inCompleteReviewViewModelT);
                return inCompleteReviewViewModelT;
            case 34:
                InboxViewModel inboxViewModelR = jq0.r(w91Var.k0(), (lw8) w91Var.E.get());
                y91.H(y91Var, inboxViewModelR);
                return inboxViewModelR;
            case 35:
                InstalledAppsViewModel installedAppsViewModelX = ep3.x((NearbyRepository) w91Var.T1.get(), w91Var.n0());
                y91.I(y91Var, installedAppsViewModelX);
                return installedAppsViewModelX;
            case 36:
                IntroViewModel introViewModelG = ep3.g(w91Var.o0());
                y91.J(y91Var, introViewModelG);
                return introViewModelG;
            case 37:
                LevelViewModel levelViewModelY = ep3.y(y91Var.a, m4.w(w91Var.a), w91Var.p0());
                y91.K(y91Var, levelViewModelY);
                return levelViewModelY;
            case 38:
                LoginViewModel loginViewModelH = ep3.h(y91Var.a, (zd4) w91Var.X1.get(), (fm8) w91Var.Y1.get(), (vz7) w91Var.a2.get());
                y91.L(y91Var, loginViewModelH);
                return loginViewModelH;
            case 39:
                MoreDescriptionViewModel moreDescriptionViewModelE = ep3.e(y91Var.a, w91Var.q0());
                y91.M(y91Var, moreDescriptionViewModelE);
                return moreDescriptionViewModelE;
            case 40:
                MoreStreamersViewModel moreStreamersViewModelJ = ep3.j(new qm5((fy4) w91Var.c2.get()));
                y91.N(y91Var, moreStreamersViewModelJ);
                return moreStreamersViewModelJ;
            case 41:
                MovieBannerListViewModel movieBannerListViewModelR = ep3.r(y91Var.a, w91Var.r0());
                y91.O(y91Var, movieBannerListViewModelR);
                return movieBannerListViewModelR;
            case 42:
                MovieBookmarkViewModel movieBookmarkViewModelK = ep3.k((c5) w91Var.L.get(), w91Var.t0());
                y91.P(y91Var, movieBookmarkViewModelK);
                return movieBookmarkViewModelK;
            case 43:
                MovieCommentFlowViewModel movieCommentFlowViewModelN = ep3.n((c5) w91Var.L.get(), (ir.mservices.market.movie.ui.detail.review.model.a) w91Var.g2.get(), (pi0) w91Var.F0.get(), y91Var.u0(), y91Var.o0(), y91Var.t0());
                y91.Q(y91Var, movieCommentFlowViewModelN);
                return movieCommentFlowViewModelN;
            case MutationPayload$DisplayCommandV2.ERRORVIEWANNOTATIONPAYLOAD_FIELD_NUMBER /* 44 */:
                MovieDetailMoreListViewModel movieDetailMoreListViewModelM = ep3.m(y91Var.a);
                y91.R(y91Var, movieDetailMoreListViewModelM);
                return movieDetailMoreListViewModelM;
            case MutationPayload$DisplayCommandV2.DRAWRENDEREDITABLEPAYLOAD_FIELD_NUMBER /* 45 */:
                MovieDetailViewModel movieDetailViewModelL = ep3.l(y91Var.a, w91Var.u0(), new gr5((p05) y91Var.c.h2.get()), w91Var.s0(), (n25) w91Var.a0.get(), (y05) w91Var.i2.get(), (ir.mservices.market.movie.ui.detail.review.model.a) w91Var.g2.get());
                y91.S(y91Var, movieDetailViewModelL);
                return movieDetailViewModelL;
            case 46:
                MovieDownloadViewModel movieDownloadViewModelI = ep3.i((n25) w91Var.a0.get(), (k68) w91Var.V.get(), (b56) w91Var.A.get(), (d56) w91Var.U.get(), m4.w(w91Var.a));
                y91.T(y91Var, movieDownloadViewModelI);
                return movieDownloadViewModelI;
            case 47:
                MovieHomeViewModel movieHomeViewModelQ = ep3.q(w91Var.v0(), (y05) w91Var.i2.get());
                y91.U(y91Var, movieHomeViewModelQ);
                return movieHomeViewModelQ;
            case 48:
                MovieMoreViewModel movieMoreViewModelS = ep3.s(y91Var.a, w91Var.x0());
                y91.V(y91Var, movieMoreViewModelS);
                return movieMoreViewModelS;
            case 49:
                MovieRecentDownloadViewModel movieRecentDownloadViewModelF = ep3.f((n25) w91Var.a0.get(), w91Var.w0());
                y91.W(y91Var, movieRecentDownloadViewModelF);
                return movieRecentDownloadViewModelF;
            case 50:
                MovieReviewsViewModel movieReviewsViewModelO = ep3.o(y91Var.a, w91Var.y0(), new gr5((p05) y91Var.c.h2.get()), (pi0) w91Var.F0.get(), (c5) w91Var.L.get(), (ir.mservices.market.movie.ui.detail.review.model.a) w91Var.g2.get());
                y91.X(y91Var, movieReviewsViewModelO);
                return movieReviewsViewModelO;
            case 51:
                MovieSearchResultViewModel movieSearchResultViewModelT = ep3.t(y91Var.a, w91Var.z0());
                y91.Y(y91Var, movieSearchResultViewModelT);
                return movieSearchResultViewModelT;
            case 52:
                MovieSeasonsViewModel movieSeasonsViewModelP = ep3.p(y91Var.a, (u65) w91Var.l2.get(), (n25) w91Var.a0.get());
                y91.Z(y91Var, movieSeasonsViewModelP);
                return movieSeasonsViewModelP;
            case 53:
                MovieUriViewModel movieUriViewModelU = ep3.u(w91Var.A0(), w91Var.c0());
                y91.a0(y91Var, movieUriViewModelU);
                return movieUriViewModelU;
            case 54:
                MyMarketViewModel myMarketViewModelV = ep3.v((b) w91Var.P.get(), (c5) w91Var.L.get(), (ps1) w91Var.w.get(), (ul3) w91Var.v0.get(), new sl3(8), (n25) w91Var.a0.get());
                y91.b0(y91Var, myMarketViewModelV);
                return myMarketViewModelV;
            case 55:
                MyReviewsContentViewModel myReviewsContentViewModelW = ep3.w(y91Var.a);
                y91.c0(y91Var, myReviewsContentViewModelW);
                return myReviewsContentViewModelW;
            case 56:
                MynetSearchViewModel mynetSearchViewModelJ = te5.j(y91Var.a);
                y91.d0(y91Var, mynetSearchViewModelJ);
                return mynetSearchViewModelJ;
            case 57:
                MynetViewModel mynetViewModelG = te5.g(w91Var.C0(), (t19) w91Var.s1.get());
                y91.e0(y91Var, mynetViewModelG);
                return mynetViewModelG;
            case 58:
                NicknameDialogViewModel nicknameDialogViewModelE = te5.e(new f5((wc5) w91Var.E1.get(), 2), (c5) w91Var.L.get());
                y91.f0(y91Var, nicknameDialogViewModelE);
                return nicknameDialogViewModelE;
            case 59:
                OtherAccountFollowersViewModel otherAccountFollowersViewModelK = te5.k(new r79((fh2) w91Var.q1.get()), y91Var.a);
                y91.g0(y91Var, otherAccountFollowersViewModelK);
                return otherAccountFollowersViewModelK;
            case 60:
                OtherAccountFollowingViewModel otherAccountFollowingViewModelL = te5.l(new pj9((gh2) w91Var.t1.get()), y91Var.a);
                y91.h0(y91Var, otherAccountFollowingViewModelL);
                return otherAccountFollowingViewModelL;
            case 61:
                OwnProfileHeaderViewModel ownProfileHeaderViewModelH = te5.h(w91Var.E0(), (cw5) w91Var.u1.get(), (c5) w91Var.L.get());
                y91.i0(y91Var, ownProfileHeaderViewModelH);
                return ownProfileHeaderViewModelH;
            case 62:
                OwnProfileViewModel ownProfileViewModelI = te5.i((ul3) w91Var.v0.get());
                y91.j0(y91Var, ownProfileViewModelI);
                return ownProfileViewModelI;
            case 63:
                PackageViewModel packageViewModelC = te5.c(new hl5((ry5) w91Var.Q1.get()), (a) w91Var.x.get(), (yl5) w91Var.D0.get(), y91Var.a);
                y91.k0(y91Var, packageViewModelC);
                return packageViewModelC;
            case 64:
                PikaConnectViewModel pikaConnectViewModelF = te5.f(y91Var.a, (NearbyRepository) w91Var.T1.get());
                y91.l0(y91Var, pikaConnectViewModelF);
                return pikaConnectViewModelF;
            case 65:
                PikaSelectDeviceViewModel pikaSelectDeviceViewModel = new PikaSelectDeviceViewModel((NearbyRepository) w91Var.T1.get());
                y91.m0(y91Var, pikaSelectDeviceViewModel);
                return pikaSelectDeviceViewModel;
            case 66:
                return new PinViewModel(y91Var.a, (x86) w91Var.r2.get(), (fm8) w91Var.Y1.get());
            case 67:
                PlayDetailViewModel playDetailViewModel = new PlayDetailViewModel(y91Var.a, new bn6((qb8) w91Var.s2.get(), (c5) w91Var.L.get()), new hh2((na6) w91Var.t2.get(), w91Var.a.a), w91Var.Z());
                y91.n0(y91Var, playDetailViewModel);
                return playDetailViewModel;
            case 68:
                c5 c5Var = (c5) w91Var.L.get();
                y91Var.getClass();
                ProfileAppListMoreViewModel profileAppListMoreViewModel = new ProfileAppListMoreViewModel(c5Var, new gr5((bl6) y91Var.c.u2.get()), (yl5) w91Var.D0.get(), (sr) w91Var.w2.get(), (um7) w91Var.z2.get(), (a) w91Var.x.get(), y91Var.a);
                profileAppListMoreViewModel.c = (x57) y91Var.c.G.get();
                return profileAppListMoreViewModel;
            case 69:
                ProfileListViewModel profileListViewModel = new ProfileListViewModel(y91Var.a, (c5) w91Var.L.get(), (um7) w91Var.z2.get(), (sr) w91Var.w2.get(), (yl5) w91Var.D0.get(), (a) w91Var.x.get(), (s45) w91Var.B2.get(), (cc) w91Var.C2.get());
                profileListViewModel.c = (x57) y91Var.c.G.get();
                return profileListViewModel;
            case 70:
                c5 c5Var2 = (c5) w91Var.L.get();
                y91Var.getClass();
                ProfileMovieListMoreViewModel profileMovieListMoreViewModel = new ProfileMovieListMoreViewModel(c5Var2, new gr5((rl6) y91Var.c.D2.get()), (s45) w91Var.B2.get(), (um7) w91Var.z2.get(), y91Var.a);
                profileMovieListMoreViewModel.c = (x57) y91Var.c.G.get();
                return profileMovieListMoreViewModel;
            case 71:
                PurchaseTransactionViewModel purchaseTransactionViewModel = new PurchaseTransactionViewModel(new ck4((zn6) w91Var.N1.get()));
                purchaseTransactionViewModel.c = (x57) y91Var.c.G.get();
                return purchaseTransactionViewModel;
            case 72:
                ReceiveViewModel receiveViewModel = new ReceiveViewModel((NearbyRepository) w91Var.T1.get(), (ir.mservices.market.pika.receive.model.b) w91Var.E2.get(), w91Var.m0(), (ir.mservices.market.core.notification.a) w91Var.T.get());
                receiveViewModel.c = (x57) y91Var.c.G.get();
                return receiveViewModel;
            case 73:
                RecentDownloadViewModel recentDownloadViewModel = new RecentDownloadViewModel((yl5) w91Var.D0.get(), new sk6((ps1) w91Var.w.get(), (dp3) w91Var.v.get(), (ir.mservices.market.version2.manager.a) w91Var.D.get()), (a) w91Var.x.get());
                recentDownloadViewModel.c = (x57) y91Var.c.G.get();
                return recentDownloadViewModel;
            case 74:
                RecommendedViewModel recommendedViewModel = new RecommendedViewModel(new xg5((ly6) w91Var.A1.get()), (a) w91Var.x.get(), (yl5) w91Var.D0.get(), y91Var.a);
                recommendedViewModel.c = (x57) y91Var.c.G.get();
                return recommendedViewModel;
            case 75:
                ReelsHomeViewModel reelsHomeViewModel = new ReelsHomeViewModel(new xg5((p17) w91Var.F2.get()), y91Var.a);
                reelsHomeViewModel.c = (x57) y91Var.c.G.get();
                return reelsHomeViewModel;
            case 76:
                ReelsViewModel reelsViewModel = new ReelsViewModel(new ut4((v17) w91Var.G2.get()), y91Var.a, (u17) w91Var.J2.get(), (ir.mservices.market.reels.download.a) w91Var.H2.get());
                reelsViewModel.c = (x57) y91Var.c.G.get();
                return reelsViewModel;
            case 77:
                RequestViewModel requestViewModel = new RequestViewModel(new ck4((y57) w91Var.K2.get()));
                requestViewModel.c = (x57) y91Var.c.G.get();
                return requestViewModel;
            case 78:
                ScheduleUpdateViewModel scheduleUpdateViewModel = new ScheduleUpdateViewModel((pr7) w91Var.s.get(), (af7) w91Var.u.get(), new sk6((pr7) w91Var.s.get(), (AlarmManager) w91Var.d0.get(), w91Var.a.a));
                scheduleUpdateViewModel.c = (x57) y91Var.c.G.get();
                return scheduleUpdateViewModel;
            case 79:
                SearchIntentViewModel searchIntentViewModel = new SearchIntentViewModel(y91Var.a);
                searchIntentViewModel.c = (x57) y91Var.c.G.get();
                return searchIntentViewModel;
            case 80:
                SearchProfileListViewModel searchProfileListViewModel = new SearchProfileListViewModel((um7) w91Var.z2.get(), (mh7) w91Var.M2.get(), (yi7) w91Var.O2.get());
                searchProfileListViewModel.c = (x57) y91Var.c.G.get();
                return searchProfileListViewModel;
            case 81:
                SearchResultViewModel searchResultViewModel = new SearchResultViewModel(y91Var.a, w91Var.x0(), new ca7((kj7) w91Var.P2.get()), new hl5((ry5) w91Var.Q1.get()), (a) w91Var.x.get(), (yl5) w91Var.D0.get());
                searchResultViewModel.c = (x57) y91Var.c.G.get();
                return searchResultViewModel;
            case 82:
                jd7 jd7Var = y91Var.a;
                a aVar = (a) w91Var.x.get();
                yl5 yl5Var = (yl5) w91Var.D0.get();
                mi7 mi7Var = (mi7) w91Var.Q2.get();
                ad8 ad8Var = (ad8) w91Var.R2.get();
                js3.p(mi7Var, "searchHistoryService");
                js3.p(ad8Var, "appSearchHistoryDao");
                qq4 qq4Var = new qq4();
                qq4Var.a = mi7Var;
                qq4Var.b = ad8Var;
                SearchViewModel searchViewModel = new SearchViewModel(jd7Var, aVar, yl5Var, qq4Var, new hh2((c75) w91Var.R1.get(), (k65) w91Var.S2.get()), new x19((oj7) w91Var.T2.get(), (v19) w91Var.U2.get()), w91Var.r0());
                searchViewModel.c = (x57) y91Var.c.G.get();
                return searchViewModel;
            case 83:
                SecurityShieldViewModel securityShieldViewModel = new SecurityShieldViewModel(new bn6(w91Var.a.a, (hl7) w91Var.V2.get()), (lu7) w91Var.h.get(), (dp3) w91Var.v.get(), (ir.mservices.market.common.install.a) w91Var.n0.get(), (vl8) w91Var.o0.get(), (kc7) y91Var.I0.get());
                securityShieldViewModel.c = (x57) y91Var.c.G.get();
                return securityShieldViewModel;
            case 84:
                bq8 bq8Var = y91Var.b;
                return new kc7(w91Var.a.a, hc7.a, null, new eu2(new fz1(26), Looper.getMainLooper()));
            case 85:
                SelectCityViewModel selectCityViewModel = new SelectCityViewModel(new nm5(w91Var.a.a, (ls0) w91Var.W2.get()));
                selectCityViewModel.c = (x57) y91Var.c.G.get();
                return selectCityViewModel;
            case 86:
                SelectedItemsViewModel selectedItemsViewModel = new SelectedItemsViewModel(y91Var.a, (um7) w91Var.z2.get());
                selectedItemsViewModel.c = (x57) y91Var.c.G.get();
                return selectedItemsViewModel;
            case 87:
                SendAppViewModel sendAppViewModel = new SendAppViewModel(y91Var.a, (dp3) w91Var.v.get(), (NearbyRepository) w91Var.T1.get(), (k68) w91Var.V.get(), new ir.mservices.market.pika.send.model.a(w91Var.a.a, (k68) w91Var.V.get()), (ir.mservices.market.pika.receive.model.b) w91Var.E2.get(), (ir.mservices.market.core.notification.a) w91Var.T.get(), (d) w91Var.S.get(), (c5) w91Var.L.get());
                sendAppViewModel.c = (x57) y91Var.c.G.get();
                return sendAppViewModel;
            case 88:
                SettingViewModel settingViewModel = new SettingViewModel(new ir.mservices.market.setting.model.b((ni7) w91Var.X2.get(), (k65) w91Var.S2.get()), (pr7) w91Var.s.get(), (zt) w91Var.q0.get(), (eg5) w91Var.t0.get());
                settingViewModel.c = (x57) y91Var.c.G.get();
                return settingViewModel;
            case 89:
                StreamerMoviesViewModel streamerMoviesViewModel = new StreamerMoviesViewModel(new xg5((z68) w91Var.Y2.get()), y91Var.a);
                streamerMoviesViewModel.c = (x57) y91Var.c.G.get();
                return streamerMoviesViewModel;
            case 90:
                StreamerProfileViewModel streamerProfileViewModel = new StreamerProfileViewModel(new ut4((l78) w91Var.Z2.get()), new qm5((fy4) w91Var.c2.get()), y91Var.a);
                streamerProfileViewModel.c = (x57) y91Var.c.G.get();
                return streamerProfileViewModel;
            case 91:
                SubmitCommentViewModel submitCommentViewModel = new SubmitCommentViewModel(y91Var.a);
                submitCommentViewModel.c = (x57) y91Var.c.G.get();
                return submitCommentViewModel;
            case 92:
                SuggestListViewModel suggestListViewModel = new SuggestListViewModel(y91Var.a, new c35((pb8) w91Var.a3.get()), (a) w91Var.x.get(), (yl5) w91Var.D0.get());
                suggestListViewModel.c = (x57) y91Var.c.G.get();
                return suggestListViewModel;
            case 93:
                SurveyViewModel surveyViewModel = new SurveyViewModel(new rn6(w91Var.a.a, (uc8) w91Var.z1.get()), y91Var.a);
                surveyViewModel.c = (x57) y91Var.c.G.get();
                return surveyViewModel;
            case 94:
                ThemeStyleViewModel themeStyleViewModel = new ThemeStyleViewModel(new vr3(w91Var.a.a), (pr7) w91Var.s.get());
                themeStyleViewModel.c = (x57) y91Var.c.G.get();
                return themeStyleViewModel;
            case 95:
                TogoViewModel togoViewModel = new TogoViewModel(y91Var.a, (i10) w91Var.y.get(), (qu2) w91Var.N.get(), (d04) w91Var.p.get(), (c5) w91Var.L.get(), (fw4) w91Var.M.get(), (dp3) w91Var.v.get(), (rf7) w91Var.r.get(), (gk1) w91Var.y1.get(), (ir.mservices.market.core.notification.a) w91Var.T.get(), (ir.mservices.market.common.install.a) w91Var.n0.get());
                togoViewModel.c = (x57) y91Var.c.G.get();
                return togoViewModel;
            case 96:
                UpdateLaunchViewModel updateLaunchViewModel = new UpdateLaunchViewModel(new gr5((wt) y91Var.c.z.get()));
                updateLaunchViewModel.c = (x57) y91Var.c.G.get();
                return updateLaunchViewModel;
            case 97:
                jd7 jd7Var2 = y91Var.a;
                w91 w91Var2 = y91Var.c;
                UpdateViewModel updateViewModel = new UpdateViewModel(jd7Var2, w91Var.J0(), new c35((jz8) w91Var.g0.get()), (wt) w91Var.z.get(), w91Var.I0(), w91Var.e0(), (dp3) w91Var.v.get(), (ps1) w91Var.w.get(), (yl5) w91Var.D0.get(), y91Var.r0(), new vr2((ir.mservices.market.common.model.a) w91Var2.R.get(), 1), y91Var.p0(), (a) w91Var.x.get(), (az8) w91Var.G0.get(), (lu7) w91Var.h.get(), (ir.mservices.market.app.update.common.manager.a) w91Var.h0.get(), (ec9) w91Var.C.get(), new ir.mservices.market.app.update.common.data.a(new xg5((ir.mservices.market.app.update.common.manager.b) w91Var2.k0.get()), (wt) w91Var2.z.get()), new gr5((wt) w91Var2.z.get()));
                updateViewModel.c = (x57) w91Var2.G.get();
                return updateViewModel;
            case 98:
                UploadImageViewModel uploadImageViewModel = new UploadImageViewModel((c09) w91Var.c3.get());
                uploadImageViewModel.c = (x57) y91Var.c.G.get();
                return uploadImageViewModel;
            case 99:
                UrlViewModel urlViewModel = new UrlViewModel(y91Var.a, (yl5) w91Var.D0.get(), (a) w91Var.x.get(), y91Var.r0(), y91Var.p0(), w91Var.e0(), new nm5(19, w91Var.f0()));
                urlViewModel.c = (x57) y91Var.c.G.get();
                return urlViewModel;
            default:
                throw new AssertionError(i);
        }
    }
}
