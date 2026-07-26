package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.datastore.core.d;
import androidx.fragment.app.FragmentActivity;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import androidx.transition.ChangeBounds;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.activity.BaseNavigationContentAction;
import ir.mservices.market.activity.BaseNavigationContentViewModel;
import ir.mservices.market.app.bookmark.BookmarkContentAction;
import ir.mservices.market.app.bookmark.BookmarkViewModel;
import ir.mservices.market.app.detail.reivews.AppReviewsViewModel;
import ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationAction;
import ir.mservices.market.app.detail.ui.recommendation.AppDetailRecommendationViewModel;
import ir.mservices.market.app.detail.ui.recycler.h;
import ir.mservices.market.common.comment.CommentActivity;
import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.common.search.BaseSearchViewModel;
import ir.mservices.market.common.search.SearchAction;
import ir.mservices.market.download.DownloadContentAction;
import ir.mservices.market.download.DownloadContentViewModel;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.download.app.RecentDownloadAction;
import ir.mservices.market.feedback.FeedbackAction;
import ir.mservices.market.feedback.FeedbackFragment;
import ir.mservices.market.feedback.FeedbackViewModel;
import ir.mservices.market.feedback.recycler.c;
import ir.mservices.market.movie.download.quality.DownloadQualityAction;
import ir.mservices.market.movie.download.quality.DownloadQualityViewModel;
import ir.mservices.market.movie.ui.player.BaseMovieAction;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.myAccount.dialog.bio.BioAction;
import ir.mservices.market.myAccount.dialog.bio.BioDialogViewModel;
import ir.mservices.market.myAccount.dialog.birthday.BirthDayAction;
import ir.mservices.market.myAccount.dialog.birthday.BirthdayDialogViewModel;
import ir.mservices.market.securityShield.recycler.a;
import ir.mservices.market.social.users.common.BaseAccountUsersFragment;
import ir.mservices.market.social.users.following.AccountFollowingAction;
import ir.mservices.market.social.users.following.AccountFollowingViewModel;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel;
import ir.mservices.market.vpnService.cheetah.ui.CheetahAction;
import ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 implements ze2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) throws Exception {
        FragmentActivity fragmentActivityF;
        Object value;
        Object objG;
        Object objOnRemoveAllAppsAction;
        int i = this.a;
        tx8 tx8Var = null;
        Object obj2 = this.b;
        tx8 tx8Var2 = tx8.a;
        switch (i) {
            case 0:
                AccountFollowingAction accountFollowingAction = (AccountFollowingAction) ((r50) obj);
                if (!(accountFollowingAction instanceof AccountFollowingAction.Refresh)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((AccountFollowingViewModel) obj2).onRefreshAction((AccountFollowingAction.Refresh) accountFollowingAction);
                return tx8Var2;
            case 1:
                ((m22) obj2).invoke(obj);
                return tx8Var2;
            case 2:
                AdGuardViewModel adGuardViewModel = (AdGuardViewModel) obj2;
                AdGuardAction adGuardAction = (AdGuardAction) ((r50) obj);
                if (adGuardAction instanceof AdGuardAction.ToggleVpnAction) {
                    adGuardViewModel.onVpnToggleAction((AdGuardAction.ToggleVpnAction) adGuardAction);
                } else if (adGuardAction instanceof AdGuardAction.StartVpnAction) {
                    adGuardViewModel.onStartVpnAction((AdGuardAction.StartVpnAction) adGuardAction);
                } else {
                    if (!(adGuardAction instanceof AdGuardAction.DisconnectActiveServiceAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    adGuardViewModel.onDisconnectActiveServiceAction((AdGuardAction.DisconnectActiveServiceAction) adGuardAction);
                }
                return tx8Var2;
            case 3:
                do3 do3Var = (do3) obj2;
                if (Build.VERSION.SDK_INT >= 34) {
                    q3.t(do3Var.q(), (View) do3Var.a);
                }
                return tx8Var2;
            case 4:
                n99 n99Var = (n99) obj;
                AppDetailFragment appDetailFragment = (AppDetailFragment) obj2;
                MenuItem menuItem = appDetailFragment.A1;
                if (menuItem != null) {
                    menuItem.setEnabled(true);
                }
                appDetailFragment.F0();
                if (n99Var instanceof l99) {
                    Context contextH = appDetailFragment.H();
                    hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(((Boolean) ((l99) n99Var).a).booleanValue() ? rs6.toast_add_bookmark : rs6.toast_remove_bookmark) : null);
                    hh2Var.F(qs6.bookmark_toast);
                    hh2.H(hh2Var);
                } else if ((n99Var instanceof h99) && (fragmentActivityF = appDetailFragment.F()) != null) {
                    ((h99) n99Var).a.assertToastMessage(fragmentActivityF);
                }
                return tx8Var2;
            case 5:
                AppDetailRecommendationAction appDetailRecommendationAction = (AppDetailRecommendationAction) ((r50) obj);
                if (!(appDetailRecommendationAction instanceof AppDetailRecommendationAction.UpdateListDataAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((AppDetailRecommendationViewModel) obj2).onUpdateListDataAction((AppDetailRecommendationAction.UpdateListDataAction) appDetailRecommendationAction);
                return tx8Var2;
            case 6:
                if (!(((CommentResultState) obj) instanceof CommentResultState.Success)) {
                    ((AppReviewsViewModel) obj2).r(0.0f);
                }
                return tx8Var2;
            case 7:
                String str = (String) obj;
                AppSubReviewsViewModel appSubReviewsViewModel = (AppSubReviewsViewModel) obj2;
                l lVar = appSubReviewsViewModel.B;
                do {
                    value = lVar.getValue();
                } while (!lVar.n(value, Integer.valueOf(((Number) value).intValue() - 1)));
                if (((Number) lVar.getValue()).intValue() < 1) {
                    appSubReviewsViewModel.g(new yz5(new k7(19)));
                }
                appSubReviewsViewModel.g(new yz5(new kt(str, 0)));
                return tx8Var2;
            case 8:
                ((Boolean) obj).booleanValue();
                ((h) obj2).x();
                return tx8Var2;
            case 9:
                String str2 = (String) obj;
                BaseAccountUsersFragment baseAccountUsersFragment = (BaseAccountUsersFragment) obj2;
                if (str2 != null && !f88.n0(str2)) {
                    FragmentActivity fragmentActivityF2 = baseAccountUsersFragment.F();
                    rn8 rn8Var = fragmentActivityF2 instanceof rn8 ? (rn8) fragmentActivityF2 : null;
                    if (rn8Var != null) {
                        ((BaseContentActivity) rn8Var).b0(baseAccountUsersFragment.U1());
                    }
                }
                return tx8Var2;
            case 10:
                BaseMovieViewModel baseMovieViewModel = (BaseMovieViewModel) obj2;
                BaseMovieAction baseMovieAction = (BaseMovieAction) ((r50) obj);
                if (baseMovieAction instanceof BaseMovieAction.ScreenOrientationChangeAction) {
                    baseMovieViewModel.onScreenOrientationChangeAction((BaseMovieAction.ScreenOrientationChangeAction) baseMovieAction);
                } else if (baseMovieAction instanceof BaseMovieAction.MoviePlayAction) {
                    baseMovieViewModel.onMoviePlayAction((BaseMovieAction.MoviePlayAction) baseMovieAction);
                } else if (baseMovieAction instanceof BaseMovieAction.CanShowAdAction) {
                    baseMovieViewModel.onCanShowAdAction((BaseMovieAction.CanShowAdAction) baseMovieAction);
                } else if (baseMovieAction instanceof BaseMovieAction.RemoveAdAction) {
                    baseMovieViewModel.onRemoveAdAction((BaseMovieAction.RemoveAdAction) baseMovieAction);
                } else if (baseMovieAction instanceof BaseMovieAction.UpdateAdTimeAction) {
                    baseMovieViewModel.onUpdateAdTimeAction((BaseMovieAction.UpdateAdTimeAction) baseMovieAction);
                } else if (baseMovieAction instanceof BaseMovieAction.WatchProgressModelAction) {
                    baseMovieViewModel.onWatchProgressModelAction((BaseMovieAction.WatchProgressModelAction) baseMovieAction);
                } else {
                    if (!(baseMovieAction instanceof BaseMovieAction.FirstVideoDisplayAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseMovieViewModel.onFirstVideoDisplayAction((BaseMovieAction.FirstVideoDisplayAction) baseMovieAction);
                }
                return tx8Var2;
            case 11:
                BaseNavigationContentAction baseNavigationContentAction = (BaseNavigationContentAction) ((r50) obj);
                if (!(baseNavigationContentAction instanceof BaseNavigationContentAction.ClearInstallPermissionEventAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((BaseNavigationContentViewModel) obj2).onClearInstallPermissionEventAction((BaseNavigationContentAction.ClearInstallPermissionEventAction) baseNavigationContentAction);
                return tx8Var2;
            case 12:
                BaseSearchViewModel baseSearchViewModel = (BaseSearchViewModel) obj2;
                SearchAction searchAction = (SearchAction) ((r50) obj);
                if (searchAction instanceof SearchAction.SetFirstListShow) {
                    baseSearchViewModel.onSetFirstListShow((SearchAction.SetFirstListShow) searchAction);
                } else if (searchAction instanceof SearchAction.OpenSearchBoxAction) {
                    baseSearchViewModel.onOpenSearchBoxAction((SearchAction.OpenSearchBoxAction) searchAction);
                } else if (searchAction instanceof SearchAction.ShowDynamicButtonAction) {
                    baseSearchViewModel.onShowDynamicButtonAction((SearchAction.ShowDynamicButtonAction) searchAction);
                } else {
                    if (!(searchAction instanceof SearchAction.UpdateSearchStateAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    baseSearchViewModel.onUpdateSearchStateAction((SearchAction.UpdateSearchStateAction) searchAction);
                }
                return tx8Var2;
            case 13:
                BioDialogViewModel bioDialogViewModel = (BioDialogViewModel) obj2;
                BioAction bioAction = (BioAction) ((r50) obj);
                if (bioAction instanceof BioAction.DeleteBioAction) {
                    bioDialogViewModel.onDeleteBioAction((BioAction.DeleteBioAction) bioAction);
                } else {
                    if (!(bioAction instanceof BioAction.UpdateBioAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bioDialogViewModel.onUploadBioAction((BioAction.UpdateBioAction) bioAction);
                }
                return tx8Var2;
            case 14:
                BirthdayDialogViewModel birthdayDialogViewModel = (BirthdayDialogViewModel) obj2;
                BirthDayAction birthDayAction = (BirthDayAction) ((r50) obj);
                if (birthDayAction instanceof BirthDayAction.SaveMiladiBirthDateAction) {
                    birthdayDialogViewModel.onSaveMiladiBirthDateAction((BirthDayAction.SaveMiladiBirthDateAction) birthDayAction);
                } else {
                    if (!(birthDayAction instanceof BirthDayAction.UpdateBirthdayAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    birthdayDialogViewModel.onUploadBirthdayAction((BirthDayAction.UpdateBirthdayAction) birthDayAction);
                }
                return tx8Var2;
            case 15:
                BookmarkContentAction bookmarkContentAction = (BookmarkContentAction) ((r50) obj);
                if (!(bookmarkContentAction instanceof BookmarkContentAction.UpdateSelectedPageAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((BookmarkViewModel) obj2).onUpdateSelectedPageAction((BookmarkContentAction.UpdateSelectedPageAction) bookmarkContentAction);
                return tx8Var2;
            case 16:
                Object objC = ((wn7) obj2).c(g51Var, obj);
                return objC == CoroutineSingletons.a ? objC : tx8Var2;
            case 17:
                CheetahViewModel cheetahViewModel = (CheetahViewModel) obj2;
                CheetahAction cheetahAction = (CheetahAction) ((r50) obj);
                if (cheetahAction instanceof CheetahAction.ToggleVpnAction) {
                    cheetahViewModel.onVpnToggleAction((CheetahAction.ToggleVpnAction) cheetahAction);
                } else if (cheetahAction instanceof CheetahAction.StartVpnAction) {
                    cheetahViewModel.onStartVpnAction((CheetahAction.StartVpnAction) cheetahAction);
                } else if (cheetahAction instanceof CheetahAction.DisconnectActiveServiceAction) {
                    cheetahViewModel.onDisconnectServiceAction((CheetahAction.DisconnectActiveServiceAction) cheetahAction);
                } else if (cheetahAction instanceof CheetahAction.ShouldLaunchAppAction) {
                    cheetahViewModel.onShouldLaunchAppAction((CheetahAction.ShouldLaunchAppAction) cheetahAction);
                } else {
                    if (!(cheetahAction instanceof CheetahAction.AppStatusClickAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cheetahViewModel.onAppStatusClickAction((CheetahAction.AppStatusClickAction) cheetahAction);
                }
                return tx8Var2;
            case 18:
                ((CommentActivity) obj2).finish();
                return tx8Var2;
            case 19:
                d dVar = (d) obj2;
                return ((dVar.h.m() instanceof qc2) || (objG = d.g(dVar, true, g51Var)) != CoroutineSingletons.a) ? tx8Var2 : objG;
            case 20:
                int iIntValue = ((Number) obj).intValue();
                int i2 = a.z;
                ((a) obj2).z(iIntValue);
                return tx8Var2;
            case 21:
                DownloadContentAction downloadContentAction = (DownloadContentAction) ((r50) obj);
                if (!(downloadContentAction instanceof DownloadContentAction.UpdateSelectedPageAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((DownloadContentViewModel) obj2).onUpdateSelectedPage((DownloadContentAction.UpdateSelectedPageAction) downloadContentAction);
                return tx8Var2;
            case 22:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                q73 q73Var = ((ir.mservices.market.movie.download.quality.recycler.a) obj2).x;
                if (q73Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketTextView myketTextView = q73Var.v;
                js3.o(myketTextView, "title");
                myketTextView.setVisibility(zBooleanValue ? 0 : 4);
                return tx8Var2;
            case 23:
                DownloadQualityAction downloadQualityAction = (DownloadQualityAction) ((r50) obj);
                if (!(downloadQualityAction instanceof DownloadQualityAction.UpdateNotEnoughStorageFlow)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((DownloadQualityViewModel) obj2).onUpdateNotEnoughStorageFlow((DownloadQualityAction.UpdateNotEnoughStorageFlow) downloadQualityAction);
                return tx8Var2;
            case 24:
                DownloadViewModel downloadViewModel = (DownloadViewModel) obj2;
                RecentDownloadAction recentDownloadAction = (RecentDownloadAction) ((r50) obj);
                if (recentDownloadAction instanceof RecentDownloadAction.PauseAllActiveDownload) {
                    downloadViewModel.onPauseAllActiveDownloadAction((RecentDownloadAction.PauseAllActiveDownload) recentDownloadAction);
                    return tx8Var2;
                }
                if (recentDownloadAction instanceof RecentDownloadAction.RemoveAllMultiSelectedItems) {
                    objOnRemoveAllAppsAction = downloadViewModel.onRemoveAllMultiSelectedItemsAction((RecentDownloadAction.RemoveAllMultiSelectedItems) recentDownloadAction, g51Var);
                    if (objOnRemoveAllAppsAction != CoroutineSingletons.a) {
                        return tx8Var2;
                    }
                } else {
                    if (!(recentDownloadAction instanceof RecentDownloadAction.RemoveAllApps)) {
                        if (!(recentDownloadAction instanceof RecentDownloadAction.ShowMoreItemMenu)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        downloadViewModel.onShowMoreItemMenuAction((RecentDownloadAction.ShowMoreItemMenu) recentDownloadAction);
                        return tx8Var2;
                    }
                    objOnRemoveAllAppsAction = downloadViewModel.onRemoveAllAppsAction((RecentDownloadAction.RemoveAllApps) recentDownloadAction, g51Var);
                    if (objOnRemoveAllAppsAction != CoroutineSingletons.a) {
                        return tx8Var2;
                    }
                }
                return objOnRemoveAllAppsAction;
            case 25:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                ir.mservices.market.feedback.recycler.a aVar = (ir.mservices.market.feedback.recycler.a) obj2;
                int i3 = ir.mservices.market.feedback.recycler.a.A;
                if (zBooleanValue2) {
                    aVar.x().A.setImageBitmap(null);
                    LoadingView loadingView = aVar.x().D;
                    js3.o(loadingView, "screenshotLoading");
                    loadingView.setVisibility(8);
                    ConstraintLayout constraintLayout = aVar.x().w;
                    js3.o(constraintLayout, "attachContent");
                    constraintLayout.setVisibility(0);
                    CardView cardView = aVar.x().B;
                    js3.o(cardView, "screenshotBg");
                    cardView.setVisibility(8);
                }
                return tx8Var2;
            case 26:
                int i4 = c.y;
                ((c) obj2).y((ca2) obj);
                return tx8Var2;
            case 27:
                ((Boolean) obj).booleanValue();
                ir.mservices.market.version2.ui.recycler.adapter.a aVar2 = ((FeedbackFragment) obj2).Z0;
                if (aVar2 != null) {
                    aVar2.A();
                }
                return tx8Var2;
            case 28:
                FeedbackViewModel feedbackViewModel = (FeedbackViewModel) obj2;
                FeedbackAction feedbackAction = (FeedbackAction) ((r50) obj);
                if (feedbackAction instanceof FeedbackAction.RemoveImageAction) {
                    feedbackViewModel.onRemoveImageAction((FeedbackAction.RemoveImageAction) feedbackAction);
                } else {
                    if (!(feedbackAction instanceof FeedbackAction.SelectImageAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    feedbackViewModel.onSelectImageAction((FeedbackAction.SelectImageAction) feedbackAction);
                }
                return tx8Var2;
            default:
                ex2 ex2Var = (ex2) obj;
                ut4 ut4Var = ((dh2) obj2).d;
                if (ut4Var != null) {
                    SlidingPaneLayout slidingPaneLayout = (SlidingPaneLayout) ut4Var.b;
                    slidingPaneLayout.v = ex2Var;
                    ChangeBounds changeBounds = new ChangeBounds();
                    changeBounds.c = 300L;
                    changeBounds.d = new PathInterpolator(0.2f, 0.0f, 0.0f, 1.0f);
                    rr8.a(slidingPaneLayout, changeBounds);
                    slidingPaneLayout.requestLayout();
                    tx8Var = tx8Var2;
                }
                return tx8Var == CoroutineSingletons.a ? tx8Var : tx8Var2;
        }
    }

    public r4(wn7 wn7Var) {
        this.a = 16;
        js3.p(wn7Var, "channel");
        this.b = wn7Var;
    }
}
