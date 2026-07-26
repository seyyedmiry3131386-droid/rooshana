package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.j0;
import java.io.Closeable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 implements q79 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.q79
    public final k79 a(Class cls) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            case 1:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
            default:
                throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
    }

    @Override // defpackage.q79
    public final k79 b(Class cls, ta5 ta5Var) {
        k79 k79Var;
        n79 n79Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new b8(new s91(((w91) ((a8) rq4.x(a8.class, m91.o(((FragmentActivity) obj).getApplicationContext())))).e), new xe1(ta5Var));
            case 1:
                final h87 h87Var = new h87();
                qq4 qq4Var = (qq4) obj;
                y91 y91Var = new y91((w91) qq4Var.a, (s91) qq4Var.b, new bq8(), rq4.t(ta5Var));
                y91 y91Var2 = (y91) ((xy2) rq4.x(xy2.class, y91Var));
                y91Var2.getClass();
                vy2.m(107, "expectedSize");
                j0 j0Var = new j0(107);
                int i2 = rq4.o;
                j0Var.c("ir.mservices.market.social.users.followers.AccountFollowersViewModel", y91Var2.d);
                int i3 = c26.q;
                j0Var.c("ir.mservices.market.social.users.following.AccountFollowingViewModel", y91Var2.e);
                int i4 = hs9.j;
                j0Var.c("ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel", y91Var2.f);
                int i5 = hs9.j;
                j0Var.c("ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel", y91Var2.g);
                int i6 = ja1.y;
                j0Var.c("ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel", y91Var2.h);
                int i7 = wq2.p;
                j0Var.c("ir.mservices.market.app.detail.ui.AppDetailViewModel", y91Var2.i);
                int i8 = yq2.e;
                j0Var.c("ir.mservices.market.app.appList.AppListViewModel", y91Var2.j);
                int i9 = ct2.o;
                j0Var.c("ir.mservices.market.app.detail.reivews.AppReviewsViewModel", y91Var2.k);
                int i10 = js3.h;
                j0Var.c("ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel", y91Var2.l);
                int i11 = rq4.o;
                j0Var.c("ir.mservices.market.appUsage.AppsUsageViewModel", y91Var2.m);
                int i12 = ct2.o;
                j0Var.c("ir.mservices.market.movie.ui.player.BaseMovieViewModel", y91Var2.n);
                int i13 = is3.s;
                j0Var.c("ir.mservices.market.myAccount.BaseMyAccountViewModel", y91Var2.o);
                int i14 = tt3.k;
                j0Var.c("ir.mservices.market.activity.BaseNavigationContentViewModel", y91Var2.p);
                int i15 = rq4.o;
                j0Var.c("ir.mservices.market.common.search.BaseSearchViewModel", y91Var2.q);
                int i16 = vy2.n;
                j0Var.c("ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel", y91Var2.r);
                int i17 = br9.p;
                j0Var.c("ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel", y91Var2.s);
                int i18 = rf0.j;
                j0Var.c("ir.mservices.market.app.bookmark.BookmarkViewModel", y91Var2.t);
                int i19 = ok4.h;
                j0Var.c("ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel", y91Var2.u);
                int i20 = m91.k;
                j0Var.c("ir.mservices.market.common.comment.CommentFlowViewModel", y91Var2.v);
                int i21 = ub1.e;
                j0Var.c("ir.mservices.market.common.comment.CommentViewModel", y91Var2.w);
                int i22 = dt2.p;
                j0Var.c("ir.mservices.market.myReview.complete.CompleteReviewViewModel", y91Var2.x);
                int i23 = m91.k;
                j0Var.c("ir.mservices.market.app.detail.developer.ui.DeveloperViewModel", y91Var2.y);
                int i24 = wn5.h;
                j0Var.c("ir.mservices.market.download.DownloadContentViewModel", y91Var2.z);
                int i25 = wu8.r;
                j0Var.c("ir.mservices.market.movie.download.quality.DownloadQualityViewModel", y91Var2.A);
                int i26 = vy2.n;
                j0Var.c("ir.mservices.market.download.app.DownloadViewModel", y91Var2.B);
                int i27 = yh0.r;
                j0Var.c("ir.mservices.market.feedback.FeedbackTransactionViewModel", y91Var2.C);
                int i28 = ja1.y;
                j0Var.c("ir.mservices.market.feedback.FeedbackViewModel", y91Var2.D);
                int i29 = vy2.n;
                j0Var.c("ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel", y91Var2.E);
                int i30 = wq2.p;
                j0Var.c("ir.mservices.market.gateway.ui.GatewayListViewModel", y91Var2.F);
                int i31 = hs9.j;
                j0Var.c("ir.mservices.market.app.home.HomeViewModel", y91Var2.G);
                int i32 = at2.z;
                j0Var.c("ir.mservices.market.movie.ui.ibex.IbexViewModel", y91Var2.H);
                int i33 = tv8.j;
                j0Var.c("ir.mservices.market.app.detail.update.InAppUpdateActivityViewModel", y91Var2.I);
                int i34 = vy2.n;
                j0Var.c("ir.mservices.market.app.detail.update.InAppUpdateViewModel", y91Var2.J);
                int i35 = br9.p;
                j0Var.c("ir.mservices.market.myReview.incomplete.InCompleteReviewViewModel", y91Var2.K);
                int i36 = gu9.i;
                j0Var.c("ir.mservices.market.myAccount.inbox.InboxViewModel", y91Var2.L);
                int i37 = at2.z;
                j0Var.c("ir.mservices.market.pika.send.InstalledAppsViewModel", y91Var2.M);
                int i38 = rq4.o;
                j0Var.c("ir.mservices.market.intro.IntroViewModel", y91Var2.N);
                int i39 = ub1.e;
                j0Var.c("ir.mservices.market.social.level.LevelViewModel", y91Var2.O);
                int i40 = c26.q;
                j0Var.c("ir.mservices.market.login.ui.LoginViewModel", y91Var2.P);
                int i41 = br9.p;
                j0Var.c("ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel", y91Var2.Q);
                int i42 = rf0.j;
                j0Var.c("ir.mservices.market.movie.streamers.moreStreamers.MoreStreamersViewModel", y91Var2.R);
                int i43 = wq2.p;
                j0Var.c("ir.mservices.market.movie.ui.list.MovieBannerListViewModel", y91Var2.S);
                int i44 = yq2.e;
                j0Var.c("ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel", y91Var2.T);
                int i45 = ct2.o;
                j0Var.c("ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel", y91Var2.U);
                int i46 = js3.h;
                j0Var.c("ir.mservices.market.movie.ui.detail.list.MovieDetailMoreListViewModel", y91Var2.V);
                int i47 = ok4.h;
                j0Var.c("ir.mservices.market.movie.ui.detail.MovieDetailViewModel", y91Var2.W);
                int i48 = c26.q;
                j0Var.c("ir.mservices.market.movie.download.core.MovieDownloadViewModel", y91Var2.X);
                int i49 = zk8.p;
                j0Var.c("ir.mservices.market.movie.ui.home.MovieHomeViewModel", y91Var2.Y);
                int i50 = s7.k;
                j0Var.c("ir.mservices.market.movie.ui.list.MovieMoreViewModel", y91Var2.Z);
                int i51 = br9.p;
                j0Var.c("ir.mservices.market.download.movie.MovieRecentDownloadViewModel", y91Var2.a0);
                int i52 = gu9.i;
                j0Var.c("ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel", y91Var2.b0);
                int i53 = rf0.j;
                j0Var.c("ir.mservices.market.movie.ui.search.result.MovieSearchResultViewModel", y91Var2.c0);
                int i54 = m91.k;
                j0Var.c("ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsViewModel", y91Var2.d0);
                int i55 = wq2.p;
                j0Var.c("ir.mservices.market.movie.uri.MovieUriViewModel", y91Var2.e0);
                int i56 = dy3.l;
                j0Var.c("ir.mservices.market.myMarket.MyMarketViewModel", y91Var2.f0);
                int i57 = rq4.o;
                j0Var.c("ir.mservices.market.myReview.MyReviewsContentViewModel", y91Var2.g0);
                int i58 = br9.p;
                j0Var.c("ir.mservices.market.social.search.MynetSearchViewModel", y91Var2.h0);
                int i59 = gu9.i;
                j0Var.c("ir.mservices.market.social.mynet.MynetViewModel", y91Var2.i0);
                int i60 = rq4.o;
                j0Var.c("ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel", y91Var2.j0);
                int i61 = is3.s;
                j0Var.c("ir.mservices.market.social.users.followers.OtherAccountFollowersViewModel", y91Var2.k0);
                int i62 = tt3.k;
                j0Var.c("ir.mservices.market.social.users.following.OtherAccountFollowingViewModel", y91Var2.l0);
                qm5 qm5Var = y97.j;
                j0Var.c("ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel", y91Var2.m0);
                int i63 = wu8.r;
                j0Var.c("ir.mservices.market.social.profile.own.OwnProfileViewModel", y91Var2.n0);
                int i64 = s7.k;
                j0Var.c("ir.mservices.market.app.packages.ui.PackageViewModel", y91Var2.o0);
                int i65 = ct2.o;
                j0Var.c("ir.mservices.market.pika.connect.PikaConnectViewModel", y91Var2.p0);
                int i66 = is3.s;
                j0Var.c("ir.mservices.market.pika.connect.PikaSelectDeviceViewModel", y91Var2.q0);
                int i67 = tt3.k;
                j0Var.c("ir.mservices.market.login.ui.PinViewModel", y91Var2.r0);
                int i68 = c26.q;
                j0Var.c("ir.mservices.market.app.suggest.detail.ui.PlayDetailViewModel", y91Var2.s0);
                int i69 = y40.o;
                j0Var.c("ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreViewModel", y91Var2.t0);
                int i70 = yh0.r;
                j0Var.c("ir.mservices.market.social.profile.list.ProfileListViewModel", y91Var2.u0);
                int i71 = ja1.y;
                j0Var.c("ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel", y91Var2.v0);
                int i72 = ct2.o;
                j0Var.c("ir.mservices.market.purchaseTransaction.PurchaseTransactionViewModel", y91Var2.w0);
                int i73 = rq4.o;
                j0Var.c("ir.mservices.market.pika.receive.ReceiveViewModel", y91Var2.x0);
                qm5 qm5Var2 = y97.j;
                j0Var.c("ir.mservices.market.download.recentDownload.RecentDownloadViewModel", y91Var2.y0);
                int i74 = vy2.n;
                j0Var.c("ir.mservices.market.app.recommended.ui.RecommendedViewModel", y91Var2.z0);
                j0Var.c("ir.mservices.market.reels.home.ui.ReelsHomeViewModel", y91Var2.A0);
                j0Var.c("ir.mservices.market.reels.ui.ReelsViewModel", y91Var2.B0);
                j0Var.c("ir.mservices.market.social.requests.RequestViewModel", y91Var2.C0);
                j0Var.c("ir.mservices.market.app.schedule.ui.ScheduleUpdateViewModel", y91Var2.D0);
                j0Var.c("ir.mservices.market.movie.ui.search.SearchIntentViewModel", y91Var2.E0);
                j0Var.c("ir.mservices.market.social.list.search.SearchProfileListViewModel", y91Var2.F0);
                j0Var.c("ir.mservices.market.app.search.result.ui.SearchResultViewModel", y91Var2.G0);
                j0Var.c("ir.mservices.market.search.history.ui.SearchViewModel", y91Var2.H0);
                j0Var.c("ir.mservices.market.securityShield.SecurityShieldViewModel", y91Var2.J0);
                j0Var.c("ir.mservices.market.myAccount.city.SelectCityViewModel", y91Var2.K0);
                j0Var.c("ir.mservices.market.social.list.items.SelectedItemsViewModel", y91Var2.L0);
                j0Var.c("ir.mservices.market.pika.send.SendAppViewModel", y91Var2.M0);
                j0Var.c("ir.mservices.market.setting.SettingViewModel", y91Var2.N0);
                j0Var.c("ir.mservices.market.movie.streamers.movies.StreamerMoviesViewModel", y91Var2.O0);
                j0Var.c("ir.mservices.market.movie.streamers.StreamerProfileViewModel", y91Var2.P0);
                j0Var.c("ir.mservices.market.common.comment.SubmitCommentViewModel", y91Var2.Q0);
                j0Var.c("ir.mservices.market.app.suggest.search.ui.SuggestListViewModel", y91Var2.R0);
                j0Var.c("ir.mservices.market.app.survey.SurveyViewModel", y91Var2.S0);
                j0Var.c("ir.mservices.market.setting.themeStyle.ThemeStyleViewModel", y91Var2.T0);
                j0Var.c("ir.mservices.market.togo.TogoViewModel", y91Var2.U0);
                j0Var.c("ir.mservices.market.app.update.common.UpdateLaunchViewModel", y91Var2.V0);
                j0Var.c("ir.mservices.market.app.update.UpdateViewModel", y91Var2.W0);
                j0Var.c("ir.mservices.market.common.uploadImage.UploadImageViewModel", y91Var2.X0);
                j0Var.c("ir.mservices.market.app.url.UrlViewModel", y91Var2.Y0);
                j0Var.c("ir.mservices.market.social.profile.user.UserProfileHeaderViewModel", y91Var2.Z0);
                j0Var.c("ir.mservices.market.social.profile.user.UserProfileViewModel", y91Var2.a1);
                j0Var.c("ir.mservices.market.social.search.UserSearchResultViewModel", y91Var2.b1);
                j0Var.c("ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel", y91Var2.c1);
                j0Var.c("ir.mservices.market.social.users.list.UsersListViewModel", y91Var2.d1);
                j0Var.c("ir.mservices.market.versionNote.ui.VersionNoteViewModel", y91Var2.e1);
                j0Var.c("ir.mservices.market.webview.WebViewViewModel", y91Var2.f1);
                j0Var.c("ir.mservices.market.social.welcome.WelcomeViewModel", y91Var2.g1);
                pn6 pn6Var = (pn6) j0Var.a(true).get(cls.getName());
                dp2 dp2Var = (dp2) ta5Var.a.get(yy2.e);
                ((y91) ((xy2) rq4.x(xy2.class, y91Var))).getClass();
                Object obj2 = ImmutableMap.l().get(cls);
                if (obj2 == null) {
                    if (dp2Var != null) {
                        throw new IllegalStateException("Found creation callback but class " + cls.getName() + " does not have an assisted factory specified in @HiltViewModel.");
                    }
                    if (pn6Var == null) {
                        throw new IllegalStateException("Expected the @HiltViewModel-annotated class " + cls.getName() + " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    }
                    k79Var = (k79) pn6Var.get();
                } else {
                    if (pn6Var != null) {
                        throw new AssertionError("Found the @HiltViewModel-annotated class " + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                    }
                    if (dp2Var == null) {
                        throw new IllegalStateException("Found @HiltViewModel-annotated class " + cls.getName() + " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    }
                    k79Var = (k79) dp2Var.invoke(obj2);
                }
                Closeable closeable = new Closeable() { // from class: wy2
                    @Override // java.io.Closeable, java.lang.AutoCloseable
                    public final void close() {
                        h87Var.a();
                    }
                };
                k79Var.getClass();
                m79 m79Var = k79Var.a;
                if (m79Var != null) {
                    m79Var.a(closeable);
                }
                return k79Var;
            default:
                ps0 ps0VarA = g27.a(cls);
                n79[] n79VarArr = (n79[]) obj;
                n79[] n79VarArr2 = (n79[]) Arrays.copyOf(n79VarArr, n79VarArr.length);
                js3.p(n79VarArr2, "initializers");
                int length = n79VarArr2.length;
                int i75 = 0;
                while (true) {
                    if (i75 < length) {
                        n79Var = n79VarArr2[i75];
                        if (!n79Var.a.equals(ps0VarA)) {
                            i75++;
                        }
                    } else {
                        n79Var = null;
                    }
                }
                k79 k79Var2 = n79Var != null ? (k79) n79Var.b.invoke(ta5Var) : null;
                if (k79Var2 != null) {
                    return k79Var2;
                }
                throw new IllegalArgumentException(("No initializer set for given class " + ps0VarA.b()).toString());
        }
    }

    @Override // defpackage.q79
    public final /* synthetic */ k79 c(ps0 ps0Var, ta5 ta5Var) {
        int i = this.a;
        return rm7.b(this, ps0Var, ta5Var);
    }

    public z7(n79[] n79VarArr) {
        this.a = 2;
        js3.p(n79VarArr, "initializers");
        this.b = n79VarArr;
    }
}
