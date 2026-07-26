package defpackage;

import android.os.Bundle;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.appList.AppListRecyclerListFragment;
import ir.mservices.market.app.detail.developer.ui.DeveloperRecyclerListFragment;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionFragment;
import ir.mservices.market.app.detail.reivews.AppReviewsFragment;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.appUsage.AppsUsageFragment;
import ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment;
import ir.mservices.market.feedback.FeedbackFragment;
import ir.mservices.market.feedback.FeedbackTransactionDialogFragment;
import ir.mservices.market.login.ui.LoginDialogFragment;
import ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment;
import ir.mservices.market.movie.ui.list.MovieBannerListRecyclerListFragment;
import ir.mservices.market.myAccount.dialog.bio.BioBottomDialogFragment;
import ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment;
import ir.mservices.market.pika.receive.dialog.MiuiTipDialogFragment;
import ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment;
import ir.mservices.market.screenshots.DraggableScreenshotFragment;
import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;
import ir.mservices.market.social.list.add.app.AppAddProfileListFragment;
import ir.mservices.market.social.list.add.movie.MovieAddProfileListFragment;
import ir.mservices.market.version2.fragments.dialog.AppFailedStorageDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppGatewayDialogFragment;
import ir.mservices.market.version2.fragments.dialog.InAppGatewayDialogFragment;
import ir.mservices.market.version2.fragments.dialog.InAppUpdateBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.KidsModeDeActiveBottomDialogFragment;
import ir.mservices.market.views.MiniPlayerView;
import ir.mservices.market.vpnService.cheetah.ui.CheetahFragment;
import ir.myket.callback.manager.a;

/* JADX INFO: loaded from: classes3.dex */
public final class de implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ de(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return at2.c0((LaunchContentActivity) this.b).b(g27.a(vo.class), null, null);
            case 1:
                AppAddProfileListFragment appAddProfileListFragment = (AppAddProfileListFragment) this.b;
                Bundle bundle = appAddProfileListFragment.g;
                if (bundle != null) {
                    return bundle;
                }
                throw new IllegalStateException("Fragment " + appAddProfileListFragment + " has null arguments");
            case 2:
                return at2.c0((AppDetailFragment) this.b).b(g27.a(a.class), null, null);
            case 3:
                AppFailedStorageDialogFragment appFailedStorageDialogFragment = (AppFailedStorageDialogFragment) this.b;
                Bundle bundle2 = appFailedStorageDialogFragment.g;
                if (bundle2 != null) {
                    return bundle2;
                }
                throw new IllegalStateException("Fragment " + appFailedStorageDialogFragment + " has null arguments");
            case 4:
                AppGatewayDialogFragment appGatewayDialogFragment = (AppGatewayDialogFragment) this.b;
                Bundle bundle3 = appGatewayDialogFragment.g;
                if (bundle3 != null) {
                    return bundle3;
                }
                throw new IllegalStateException("Fragment " + appGatewayDialogFragment + " has null arguments");
            case 5:
                AppListRecyclerListFragment appListRecyclerListFragment = (AppListRecyclerListFragment) this.b;
                Bundle bundle4 = appListRecyclerListFragment.g;
                if (bundle4 != null) {
                    return bundle4;
                }
                throw new IllegalStateException("Fragment " + appListRecyclerListFragment + " has null arguments");
            case 6:
                AppReviewsFragment appReviewsFragment = (AppReviewsFragment) this.b;
                Bundle bundle5 = appReviewsFragment.g;
                if (bundle5 != null) {
                    return bundle5;
                }
                throw new IllegalStateException("Fragment " + appReviewsFragment + " has null arguments");
            case 7:
                AppSubReviewsFragment appSubReviewsFragment = (AppSubReviewsFragment) this.b;
                Bundle bundle6 = appSubReviewsFragment.g;
                if (bundle6 != null) {
                    return bundle6;
                }
                throw new IllegalStateException("Fragment " + appSubReviewsFragment + " has null arguments");
            case 8:
                AppsUsageFragment appsUsageFragment = (AppsUsageFragment) this.b;
                Bundle bundle7 = appsUsageFragment.g;
                if (bundle7 != null) {
                    return bundle7;
                }
                throw new IllegalStateException("Fragment " + appsUsageFragment + " has null arguments");
            case 9:
                BioBottomDialogFragment bioBottomDialogFragment = (BioBottomDialogFragment) this.b;
                Bundle bundle8 = bioBottomDialogFragment.g;
                if (bundle8 != null) {
                    return bundle8;
                }
                throw new IllegalStateException("Fragment " + bioBottomDialogFragment + " has null arguments");
            case 10:
                BirthdayBottomDialogFragment birthdayBottomDialogFragment = (BirthdayBottomDialogFragment) this.b;
                Bundle bundle9 = birthdayBottomDialogFragment.g;
                if (bundle9 != null) {
                    return bundle9;
                }
                throw new IllegalStateException("Fragment " + birthdayBottomDialogFragment + " has null arguments");
            case 11:
                return ((lf7) at2.getKoin().c.e).b(g27.a(hs5.class), null, (a88) this.b);
            case 12:
                CheetahFragment cheetahFragment = (CheetahFragment) this.b;
                Bundle bundle10 = cheetahFragment.g;
                if (bundle10 != null) {
                    return bundle10;
                }
                throw new IllegalStateException("Fragment " + cheetahFragment + " has null arguments");
            case 13:
                DeveloperCommentBottomDialogFragment developerCommentBottomDialogFragment = (DeveloperCommentBottomDialogFragment) this.b;
                Bundle bundle11 = developerCommentBottomDialogFragment.g;
                if (bundle11 != null) {
                    return bundle11;
                }
                throw new IllegalStateException("Fragment " + developerCommentBottomDialogFragment + " has null arguments");
            case 14:
                DeveloperRecyclerListFragment developerRecyclerListFragment = (DeveloperRecyclerListFragment) this.b;
                Bundle bundle12 = developerRecyclerListFragment.g;
                if (bundle12 != null) {
                    return bundle12;
                }
                throw new IllegalStateException("Fragment " + developerRecyclerListFragment + " has null arguments");
            case 15:
                DownloadQualityDialogFragment downloadQualityDialogFragment = (DownloadQualityDialogFragment) this.b;
                Bundle bundle13 = downloadQualityDialogFragment.g;
                if (bundle13 != null) {
                    return bundle13;
                }
                throw new IllegalStateException("Fragment " + downloadQualityDialogFragment + " has null arguments");
            case 16:
                DraggableScreenshotFragment draggableScreenshotFragment = (DraggableScreenshotFragment) this.b;
                Bundle bundle14 = draggableScreenshotFragment.g;
                if (bundle14 != null) {
                    return bundle14;
                }
                throw new IllegalStateException("Fragment " + draggableScreenshotFragment + " has null arguments");
            case 17:
                FeedbackFragment feedbackFragment = (FeedbackFragment) this.b;
                Bundle bundle15 = feedbackFragment.g;
                if (bundle15 != null) {
                    return bundle15;
                }
                throw new IllegalStateException("Fragment " + feedbackFragment + " has null arguments");
            case 18:
                FeedbackTransactionDialogFragment feedbackTransactionDialogFragment = (FeedbackTransactionDialogFragment) this.b;
                Bundle bundle16 = feedbackTransactionDialogFragment.g;
                if (bundle16 != null) {
                    return bundle16;
                }
                throw new IllegalStateException("Fragment " + feedbackTransactionDialogFragment + " has null arguments");
            case 19:
                FontStyleDialogFragment fontStyleDialogFragment = (FontStyleDialogFragment) this.b;
                Bundle bundle17 = fontStyleDialogFragment.g;
                if (bundle17 != null) {
                    return bundle17;
                }
                throw new IllegalStateException("Fragment " + fontStyleDialogFragment + " has null arguments");
            case 20:
                InAppGatewayDialogFragment inAppGatewayDialogFragment = (InAppGatewayDialogFragment) this.b;
                Bundle bundle18 = inAppGatewayDialogFragment.g;
                if (bundle18 != null) {
                    return bundle18;
                }
                throw new IllegalStateException("Fragment " + inAppGatewayDialogFragment + " has null arguments");
            case 21:
                InAppUpdateBottomDialogFragment inAppUpdateBottomDialogFragment = (InAppUpdateBottomDialogFragment) this.b;
                Bundle bundle19 = inAppUpdateBottomDialogFragment.g;
                if (bundle19 != null) {
                    return bundle19;
                }
                throw new IllegalStateException("Fragment " + inAppUpdateBottomDialogFragment + " has null arguments");
            case 22:
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = (InstalledAppsRecyclerListFragment) this.b;
                Bundle bundle20 = installedAppsRecyclerListFragment.g;
                if (bundle20 != null) {
                    return bundle20;
                }
                throw new IllegalStateException("Fragment " + installedAppsRecyclerListFragment + " has null arguments");
            case 23:
                KidsModeDeActiveBottomDialogFragment kidsModeDeActiveBottomDialogFragment = (KidsModeDeActiveBottomDialogFragment) this.b;
                Bundle bundle21 = kidsModeDeActiveBottomDialogFragment.g;
                if (bundle21 != null) {
                    return bundle21;
                }
                throw new IllegalStateException("Fragment " + kidsModeDeActiveBottomDialogFragment + " has null arguments");
            case 24:
                LoginDialogFragment loginDialogFragment = (LoginDialogFragment) this.b;
                Bundle bundle22 = loginDialogFragment.g;
                if (bundle22 != null) {
                    return bundle22;
                }
                throw new IllegalStateException("Fragment " + loginDialogFragment + " has null arguments");
            case 25:
                return ((lf7) ((MiniPlayerView) this.b).getKoin().c.e).b(g27.a(sq4.class), null, null);
            case 26:
                MiuiTipDialogFragment miuiTipDialogFragment = (MiuiTipDialogFragment) this.b;
                Bundle bundle23 = miuiTipDialogFragment.g;
                if (bundle23 != null) {
                    return bundle23;
                }
                throw new IllegalStateException("Fragment " + miuiTipDialogFragment + " has null arguments");
            case 27:
                MoreDescriptionFragment moreDescriptionFragment = (MoreDescriptionFragment) this.b;
                Bundle bundle24 = moreDescriptionFragment.g;
                if (bundle24 != null) {
                    return bundle24;
                }
                throw new IllegalStateException("Fragment " + moreDescriptionFragment + " has null arguments");
            case 28:
                MovieAddProfileListFragment movieAddProfileListFragment = (MovieAddProfileListFragment) this.b;
                Bundle bundle25 = movieAddProfileListFragment.g;
                if (bundle25 != null) {
                    return bundle25;
                }
                throw new IllegalStateException("Fragment " + movieAddProfileListFragment + " has null arguments");
            default:
                MovieBannerListRecyclerListFragment movieBannerListRecyclerListFragment = (MovieBannerListRecyclerListFragment) this.b;
                Bundle bundle26 = movieBannerListRecyclerListFragment.g;
                if (bundle26 != null) {
                    return bundle26;
                }
                throw new IllegalStateException("Fragment " + movieBannerListRecyclerListFragment + " has null arguments");
        }
    }

    public de(pk0 pk0Var, a88 a88Var) {
        this.a = 11;
        this.b = a88Var;
    }
}
