package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.clarity.Clarity;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.models.LogLevel;
import ir.mservices.market.activity.BaseNavigationContentViewModel;
import ir.mservices.market.app.appList.AppListViewModel;
import ir.mservices.market.app.bookmark.BookmarkViewModel;
import ir.mservices.market.app.bookmark.ui.AppBookmarkViewModel;
import ir.mservices.market.app.detail.reivews.AppReviewsViewModel;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel;
import ir.mservices.market.appUsage.AppsUsageViewModel;
import ir.mservices.market.common.search.BaseSearchViewModel;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.myAccount.BaseMyAccountViewModel;
import ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel;
import ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel;
import ir.mservices.market.social.users.followers.AccountFollowersViewModel;
import ir.mservices.market.social.users.following.AccountFollowingViewModel;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m4 implements on6 {
    public static i10 a() {
        i10 i10Var = new i10();
        i10Var.a = "";
        return i10Var;
    }

    public static we0 b() {
        return new we0();
    }

    public static BaseNavigationContentViewModel c() {
        return new BaseNavigationContentViewModel();
    }

    public static AppListViewModel d(yl5 yl5Var, a aVar, jd7 jd7Var) {
        return new AppListViewModel(yl5Var, aVar, jd7Var);
    }

    public static BookmarkViewModel e(jd7 jd7Var) {
        return new BookmarkViewModel(jd7Var);
    }

    public static AppBookmarkViewModel f(c5 c5Var, a aVar, yl5 yl5Var, ql4 ql4Var) {
        return new AppBookmarkViewModel(c5Var, aVar, yl5Var, ql4Var);
    }

    public static AppReviewsViewModel g(sk6 sk6Var, c5 c5Var, dp3 dp3Var, vr2 vr2Var, vr2 vr2Var2, jd7 jd7Var) {
        return new AppReviewsViewModel(sk6Var, c5Var, dp3Var, vr2Var, vr2Var2, jd7Var);
    }

    public static AppSubReviewsViewModel h(rn6 rn6Var, c5 c5Var, vr2 vr2Var, vr2 vr2Var2, nm5 nm5Var, jd7 jd7Var) {
        return new AppSubReviewsViewModel(rn6Var, c5Var, vr2Var, vr2Var2, nm5Var, jd7Var);
    }

    public static AppDetailViewModel i(jd7 jd7Var, v24 v24Var, xg5 xg5Var, wv8 wv8Var, t15 t15Var, yl5 yl5Var, a aVar, dp3 dp3Var, wt wtVar, ps1 ps1Var, ir.mservices.market.version2.manager.a aVar2, vr2 vr2Var, vr2 vr2Var2, ir.mservices.market.app.update.common.manager.a aVar3, c5 c5Var, ql4 ql4Var, ut4 ut4Var, ec9 ec9Var) {
        return new AppDetailViewModel(jd7Var, v24Var, xg5Var, wv8Var, t15Var, yl5Var, aVar, dp3Var, wtVar, ps1Var, aVar2, vr2Var, vr2Var2, aVar3, c5Var, ql4Var, ut4Var, ec9Var);
    }

    public static AppDetailRecommendationViewModel j(th0 th0Var) {
        return new AppDetailRecommendationViewModel(th0Var);
    }

    public static AppsUsageViewModel k(nm5 nm5Var, dp3 dp3Var) {
        return new AppsUsageViewModel(nm5Var, dp3Var);
    }

    public static BaseSearchViewModel l(jd7 jd7Var, b90 b90Var) {
        return new BaseSearchViewModel(jd7Var, b90Var);
    }

    public static BaseMovieViewModel m(jd7 jd7Var) {
        return new BaseMovieViewModel(jd7Var);
    }

    public static BaseMyAccountViewModel n(z4 z4Var, wv8 wv8Var, c5 c5Var) {
        return new BaseMyAccountViewModel(z4Var, wv8Var, c5Var);
    }

    public static BioDialogViewModel o(ub0 ub0Var) {
        return new BioDialogViewModel(ub0Var);
    }

    public static BirthdayDialogViewModel p(e4 e4Var, lu7 lu7Var) {
        return new BirthdayDialogViewModel(e4Var, lu7Var);
    }

    public static AccountFollowersViewModel q(r79 r79Var, t19 t19Var, jd7 jd7Var) {
        return new AccountFollowersViewModel(r79Var, t19Var, jd7Var);
    }

    public static AccountFollowingViewModel r(pj9 pj9Var, t19 t19Var, cw5 cw5Var, jd7 jd7Var) {
        return new AccountFollowingViewModel(pj9Var, t19Var, cw5Var, jd7Var);
    }

    public static AdGuardViewModel s(ir.mservices.market.vpnService.adGuard.ui.model.a aVar, vl8 vl8Var, jd7 jd7Var) {
        return new AdGuardViewModel(aVar, vl8Var, jd7Var);
    }

    public static List t(tc2 tc2Var, ns0 ns0Var) {
        js3.p(tc2Var, "firebaseTracker");
        js3.p(ns0Var, "clarityTracker");
        List listC = br9.C(tc2Var, ns0Var);
        zk8.p(listC);
        return listC;
    }

    public static Application u(gu guVar) {
        return m91.o(guVar.a);
    }

    public static ns0 v(Context context, lu7 lu7Var) {
        js3.p(lu7Var, "sharedPreferencesProxy");
        uq3 uq3Var = new uq3(0, 100, 1);
        Random$Default random$Default = yu6.a;
        js3.p(random$Default, "random");
        try {
            if (dy3.D(random$Default, uq3Var) < lu7Var.c(1, lu7.B0)) {
                Clarity.initialize(context, new ClarityConfig("rsp058b602", null, LogLevel.Verbose, null, null, 26, null));
            }
            return new ns0();
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static Context w(gu guVar) {
        return guVar.a;
    }

    public static FirebaseAnalytics x(Context context) {
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        js3.o(firebaseAnalytics, "getInstance(...)");
        return firebaseAnalytics;
    }

    public static tc2 y(FirebaseAnalytics firebaseAnalytics) {
        js3.p(firebaseAnalytics, "firebase");
        return new tc2(firebaseAnalytics);
    }
}
