package defpackage;

import android.content.Context;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.app.detail.update.InAppFragment;
import ir.mservices.market.app.home.HomeAction;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment;
import ir.mservices.market.download.movie.MovieRecentDownloadAction;
import ir.mservices.market.download.movie.MovieRecentDownloadViewModel;
import ir.mservices.market.gateway.ui.GatewayItemAction;
import ir.mservices.market.gateway.ui.GatewayListViewModel;
import ir.mservices.market.intro.IntroAction;
import ir.mservices.market.intro.IntroViewModel;
import ir.mservices.market.login.data.PinBindData;
import ir.mservices.market.login.ui.PinLoginDialogFragment;
import ir.mservices.market.movie.download.core.DownloadAction;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.ui.detail.MovieDetailAction;
import ir.mservices.market.movie.ui.detail.MovieDetailViewModel;
import ir.mservices.market.movie.ui.detail.recycler.c;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowViewModel;
import ir.mservices.market.movie.ui.detail.review.ReviewAction;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewAction;
import ir.mservices.market.movie.ui.detail.review.all.MovieReviewsViewModel;
import ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.seasons.recycler.MovieSeasonFixedTitleData;
import ir.mservices.market.movie.ui.home.MovieHomeAction;
import ir.mservices.market.movie.ui.home.MovieHomeViewModel;
import ir.mservices.market.movie.ui.ibex.IbexAction;
import ir.mservices.market.movie.ui.ibex.IbexViewModel;
import ir.mservices.market.myAccount.MyAccountRecyclerListFragment;
import ir.mservices.market.myAccount.dialog.nickname.NicknameAction;
import ir.mservices.market.myAccount.dialog.nickname.NicknameDialogViewModel;
import ir.mservices.market.myMarket.MyMarketAction;
import ir.mservices.market.myMarket.MyMarketRecyclerListFragment;
import ir.mservices.market.myMarket.MyMarketViewModel;
import ir.mservices.market.myReview.MyReviewsContentAction;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.setting.fontStyle.ui.FontAction;
import ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel;
import ir.mservices.market.social.profile.own.OwnProfileAction;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;
import ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel;
import ir.mservices.market.social.profile.own.OwnProfileViewModel;
import ir.mservices.market.social.search.MynetSearchAction;
import ir.mservices.market.social.search.MynetSearchViewModel;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment;
import ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment;
import ir.mservices.market.version2.manager.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class bj2 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bj2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) throws Throwable {
        Object objEmitLikeDislikeEventAction;
        rn8 rn8Var;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                FontAction fontAction = (FontAction) ((r50) obj);
                if (!(fontAction instanceof FontAction.SelectFont)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((FontStyleViewModel) obj2).onFontSelect((FontAction.SelectFont) fontAction);
                return tx8Var;
            case 1:
                GatewayListViewModel gatewayListViewModel = (GatewayListViewModel) obj2;
                GatewayItemAction gatewayItemAction = (GatewayItemAction) ((r50) obj);
                if (gatewayItemAction instanceof GatewayItemAction.SelectAction) {
                    gatewayListViewModel.onSelectAction((GatewayItemAction.SelectAction) gatewayItemAction);
                } else {
                    if (!(gatewayItemAction instanceof GatewayItemAction.SetMaxSpan)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gatewayListViewModel.onSetMaxSpan((GatewayItemAction.SetMaxSpan) gatewayItemAction);
                }
                return tx8Var;
            case 2:
                HomeAction homeAction = (HomeAction) ((r50) obj);
                if (!(homeAction instanceof HomeAction.InitAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((HomeViewModel) obj2).onInitAction((HomeAction.InitAction) homeAction);
                return tx8Var;
            case 3:
                IbexViewModel ibexViewModel = (IbexViewModel) obj2;
                IbexAction ibexAction = (IbexAction) ((r50) obj);
                if (ibexAction instanceof IbexAction.CallbackCalledAction) {
                    ibexViewModel.onCallbackCalledAction((IbexAction.CallbackCalledAction) ibexAction);
                } else {
                    if (!(ibexAction instanceof IbexAction.ResetVideoDurationAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ibexViewModel.onResetVideoDurationAction((IbexAction.ResetVideoDurationAction) ibexAction);
                }
                return tx8Var;
            case 4:
                DownloadDataModel downloadDataModel = (DownloadDataModel) obj;
                InAppFragment inAppFragment = (InAppFragment) obj2;
                a aVar = inAppFragment.Y0;
                if (aVar != null) {
                    aVar.b(inAppFragment.F(), downloadDataModel, false);
                    return tx8Var;
                }
                js3.V("appManager");
                throw null;
            case 5:
                d33 d33Var = ((ir.mservices.market.myReview.incomplete.recycler.a) obj2).z;
                if (d33Var != null) {
                    d33Var.B.setRating(0.0f);
                    return tx8Var;
                }
                js3.V("binding");
                throw null;
            case 6:
                IntroViewModel introViewModel = (IntroViewModel) obj2;
                IntroAction introAction = (IntroAction) ((r50) obj);
                if (introAction instanceof IntroAction.NextStep) {
                    introViewModel.nextStep((IntroAction.NextStep) introAction);
                } else {
                    if (!(introAction instanceof IntroAction.PreviousStep)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    introViewModel.previousStep((IntroAction.PreviousStep) introAction);
                }
                return tx8Var;
            case 7:
                gr3 gr3Var = (gr3) obj;
                mb5 mb5Var = (mb5) obj2;
                if ((gr3Var instanceof zc3) || (gr3Var instanceof gg2) || (gr3Var instanceof rj6)) {
                    mb5Var.g(gr3Var);
                } else if (gr3Var instanceof ad3) {
                    mb5Var.k(((ad3) gr3Var).a);
                } else if (gr3Var instanceof hg2) {
                    mb5Var.k(((hg2) gr3Var).a);
                } else if (gr3Var instanceof sj6) {
                    mb5Var.k(((sj6) gr3Var).a);
                } else if (gr3Var instanceof qj6) {
                    mb5Var.k(((qj6) gr3Var).a);
                }
                Object[] objArr = mb5Var.a;
                int i2 = mb5Var.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    gr3 gr3Var2 = (gr3) objArr[i3];
                    if (gr3Var2 instanceof zc3) {
                        throw null;
                    }
                    if (gr3Var2 instanceof gg2) {
                        throw null;
                    }
                    if (gr3Var2 instanceof rj6) {
                        throw null;
                    }
                }
                throw null;
            case 8:
                MovieCommentFlowViewModel movieCommentFlowViewModel = (MovieCommentFlowViewModel) obj2;
                ReviewAction reviewAction = (ReviewAction) ((r50) obj);
                if (reviewAction instanceof ReviewAction.SendLikeOrDislikeAction) {
                    objEmitLikeDislikeEventAction = movieCommentFlowViewModel.sendLikeOrDislikeAction((ReviewAction.SendLikeOrDislikeAction) reviewAction, g51Var);
                    if (objEmitLikeDislikeEventAction != CoroutineSingletons.a) {
                        return tx8Var;
                    }
                } else if (reviewAction instanceof ReviewAction.OpenReportReviewAction) {
                    objEmitLikeDislikeEventAction = movieCommentFlowViewModel.openReportReviewAction((ReviewAction.OpenReportReviewAction) reviewAction, g51Var);
                    if (objEmitLikeDislikeEventAction != CoroutineSingletons.a) {
                        return tx8Var;
                    }
                } else if (reviewAction instanceof ReviewAction.SubmitMovieReviewAction) {
                    objEmitLikeDislikeEventAction = movieCommentFlowViewModel.openSubmitReviewAction((ReviewAction.SubmitMovieReviewAction) reviewAction, g51Var);
                    if (objEmitLikeDislikeEventAction != CoroutineSingletons.a) {
                        return tx8Var;
                    }
                } else if (reviewAction instanceof ReviewAction.ReportReviewAction) {
                    objEmitLikeDislikeEventAction = movieCommentFlowViewModel.reportReviewAction((ReviewAction.ReportReviewAction) reviewAction, g51Var);
                    if (objEmitLikeDislikeEventAction != CoroutineSingletons.a) {
                        return tx8Var;
                    }
                } else {
                    if (reviewAction instanceof ReviewAction.CancelReportReviewAction) {
                        movieCommentFlowViewModel.cancelReportReviewAction((ReviewAction.CancelReportReviewAction) reviewAction);
                        return tx8Var;
                    }
                    if (reviewAction instanceof ReviewAction.RunPreviousAction) {
                        movieCommentFlowViewModel.runPreviousAction((ReviewAction.RunPreviousAction) reviewAction);
                        return tx8Var;
                    }
                    if (!(reviewAction instanceof ReviewAction.EmitLikeOrDislikeEventAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objEmitLikeDislikeEventAction = movieCommentFlowViewModel.emitLikeDislikeEventAction((ReviewAction.EmitLikeOrDislikeEventAction) reviewAction, g51Var);
                    if (objEmitLikeDislikeEventAction != CoroutineSingletons.a) {
                        return tx8Var;
                    }
                }
                return objEmitLikeDislikeEventAction;
            case 9:
                MovieDetailViewModel movieDetailViewModel = (MovieDetailViewModel) obj2;
                MovieDetailAction movieDetailAction = (MovieDetailAction) ((r50) obj);
                if (movieDetailAction instanceof MovieDetailAction.InitAction) {
                    movieDetailViewModel.onInitAction((MovieDetailAction.InitAction) movieDetailAction);
                } else if (movieDetailAction instanceof MovieDetailAction.ShowTrailerReplayIcon) {
                    movieDetailViewModel.onShowTrailerReplayIcon((MovieDetailAction.ShowTrailerReplayIcon) movieDetailAction);
                } else {
                    if (!(movieDetailAction instanceof MovieDetailAction.UpdateReviewUiState)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    movieDetailViewModel.onUpdateReviewUiState((MovieDetailAction.UpdateReviewUiState) movieDetailAction);
                }
                return tx8Var;
            case 10:
                ((ir.mservices.market.movie.ui.detail.recycler.a) obj2).x().x.setDownloading(((Boolean) obj).booleanValue());
                return tx8Var;
            case 11:
                String str = (String) obj;
                MovieDownloadRecyclerListFragment movieDownloadRecyclerListFragment = (MovieDownloadRecyclerListFragment) obj2;
                Context contextH = movieDownloadRecyclerListFragment.H();
                if (contextH != null) {
                    k68 k68Var = movieDownloadRecyclerListFragment.i1;
                    if (k68Var == null) {
                        js3.V("storageUtils");
                        throw null;
                    }
                    movieDownloadRecyclerListFragment.y0(tv8.s((r69) contextH, k68Var, str));
                }
                return tx8Var;
            case 12:
                DownloadAction downloadAction = (DownloadAction) ((r50) obj);
                if (!(downloadAction instanceof DownloadAction.ToggleDownloadAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MovieDownloadViewModel) obj2).onToggleDownloadAction((DownloadAction.ToggleDownloadAction) downloadAction);
                return tx8Var;
            case 13:
                ((c) obj2).x().A.setDownloading(((Boolean) obj).booleanValue());
                return tx8Var;
            case 14:
                MovieHomeAction movieHomeAction = (MovieHomeAction) ((r50) obj);
                if (!(movieHomeAction instanceof MovieHomeAction.InitAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MovieHomeViewModel) obj2).onInitAction((MovieHomeAction.InitAction) movieHomeAction);
                return tx8Var;
            case 15:
                MovieRecentDownloadViewModel movieRecentDownloadViewModel = (MovieRecentDownloadViewModel) obj2;
                MovieRecentDownloadAction movieRecentDownloadAction = (MovieRecentDownloadAction) ((r50) obj);
                if (movieRecentDownloadAction instanceof MovieRecentDownloadAction.RefreshDoneAction) {
                    movieRecentDownloadViewModel.onRefreshDoneAction((MovieRecentDownloadAction.RefreshDoneAction) movieRecentDownloadAction);
                } else if (movieRecentDownloadAction instanceof MovieRecentDownloadAction.PauseAllDownloadAction) {
                    movieRecentDownloadViewModel.onPauseAllDownloadAction((MovieRecentDownloadAction.PauseAllDownloadAction) movieRecentDownloadAction);
                } else {
                    if (!(movieRecentDownloadAction instanceof MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    movieRecentDownloadViewModel.onUpdateNotEnoughStorageAction((MovieRecentDownloadAction.UpdateNotEnoughStorageFlowAction) movieRecentDownloadAction);
                }
                return tx8Var;
            case 16:
                MovieReviewsViewModel movieReviewsViewModel = (MovieReviewsViewModel) obj2;
                MovieReviewAction movieReviewAction = (MovieReviewAction) ((r50) obj);
                if (movieReviewAction instanceof MovieReviewAction.InitAction) {
                    movieReviewsViewModel.onInitAction((MovieReviewAction.InitAction) movieReviewAction);
                } else {
                    if (!(movieReviewAction instanceof MovieReviewAction.UpdateReviewUiState)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    movieReviewsViewModel.onUpdateReviewUiState((MovieReviewAction.UpdateReviewUiState) movieReviewAction);
                }
                return tx8Var;
            case 17:
                MovieSeasonFixedTitleData movieSeasonFixedTitleData = (MovieSeasonFixedTitleData) obj;
                t65 t65Var = ((MovieSeasonsRecyclerListFragment) obj2).r1;
                if (t65Var != null) {
                    t65Var.t(movieSeasonFixedTitleData);
                    return tx8Var;
                }
                js3.V("headerViewHolder");
                throw null;
            case 18:
                hh2.H(new hh2(((MyAccountRecyclerListFragment) obj2).F(), (String) obj));
                return tx8Var;
            case 19:
                int i4 = MyMarketRecyclerListFragment.r1;
                ((MyMarketRecyclerListFragment) obj2).V1("financial", null);
                return tx8Var;
            case 20:
                MyMarketAction myMarketAction = (MyMarketAction) ((r50) obj);
                if (!(myMarketAction instanceof MyMarketAction.RefreshAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MyMarketViewModel) obj2).onRefreshAction((MyMarketAction.RefreshAction) myMarketAction);
                return tx8Var;
            case 21:
                MyReviewsContentAction myReviewsContentAction = (MyReviewsContentAction) ((r50) obj);
                if (!(myReviewsContentAction instanceof MyReviewsContentAction.UpdateSelectedPageAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MyReviewsContentViewModel) obj2).onUpdateSelectedPageAction((MyReviewsContentAction.UpdateSelectedPageAction) myReviewsContentAction);
                return tx8Var;
            case 22:
                MynetSearchAction mynetSearchAction = (MynetSearchAction) ((r50) obj);
                if (!(mynetSearchAction instanceof MynetSearchAction.FirstCallAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((MynetSearchViewModel) obj2).onFirstCallAction((MynetSearchAction.FirstCallAction) mynetSearchAction);
                return tx8Var;
            case 23:
                NicknameAction nicknameAction = (NicknameAction) ((r50) obj);
                if (!(nicknameAction instanceof NicknameAction.UpdateNicknameAction)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((NicknameDialogViewModel) obj2).onUploadNicknameAction((NicknameAction.UpdateNicknameAction) nicknameAction);
                return tx8Var;
            case 24:
                OwnProfileHeaderViewModel ownProfileHeaderViewModel = (OwnProfileHeaderViewModel) obj2;
                OwnProfileHeaderAction ownProfileHeaderAction = (OwnProfileHeaderAction) ((r50) obj);
                if (ownProfileHeaderAction instanceof OwnProfileHeaderAction.LoadAction) {
                    ownProfileHeaderViewModel.onLoadAction((OwnProfileHeaderAction.LoadAction) ownProfileHeaderAction);
                } else if (ownProfileHeaderAction instanceof OwnProfileHeaderAction.RefreshAction) {
                    ownProfileHeaderViewModel.onRefreshAction((OwnProfileHeaderAction.RefreshAction) ownProfileHeaderAction);
                } else {
                    if (!(ownProfileHeaderAction instanceof OwnProfileHeaderAction.UnreadMessageAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ownProfileHeaderViewModel.onUnreadMessageAction((OwnProfileHeaderAction.UnreadMessageAction) ownProfileHeaderAction);
                }
                return tx8Var;
            case 25:
                OwnProfileViewModel ownProfileViewModel = (OwnProfileViewModel) obj2;
                OwnProfileAction ownProfileAction = (OwnProfileAction) ((r50) obj);
                if (ownProfileAction instanceof OwnProfileAction.ScrollYAction) {
                    ownProfileViewModel.onScrollYAction((OwnProfileAction.ScrollYAction) ownProfileAction);
                } else if (ownProfileAction instanceof OwnProfileAction.TabAction) {
                    ownProfileViewModel.onTabAction((OwnProfileAction.TabAction) ownProfileAction);
                } else {
                    if (!(ownProfileAction instanceof OwnProfileAction.TabAnimationAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ownProfileViewModel.onTabAnimationAction((OwnProfileAction.TabAnimationAction) ownProfileAction);
                }
                return tx8Var;
            case 26:
                ((kotlinx.coroutines.channels.a) obj2).o((tx8) obj);
                return tx8Var;
            case 27:
                String str2 = (String) obj;
                if (str2 != null && !f88.n0(str2)) {
                    bt5 bt5VarF = ((PagingRecyclerListContentFragment) obj2).F();
                    rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
                    if (rn8Var != null) {
                        ((BaseContentActivity) rn8Var).c0(str2);
                    }
                }
                return tx8Var;
            case 28:
                String str3 = (String) obj;
                if (str3 != null && !f88.n0(str3)) {
                    bt5 bt5VarF2 = ((PagingRecyclerListFragment) obj2).F();
                    rn8Var = bt5VarF2 instanceof rn8 ? (rn8) bt5VarF2 : null;
                    if (rn8Var != null) {
                        ((BaseContentActivity) rn8Var).c0(str3);
                    }
                }
                return tx8Var;
            default:
                PinLoginDialogFragment pinLoginDialogFragment = (PinLoginDialogFragment) obj2;
                String string = pinLoginDialogFragment.K().getString(rs6.verify_place_holder);
                js3.o(string, "getString(...)");
                String strW = m88.W(((PinBindData) obj).c, string);
                wn2 wn2Var = pinLoginDialogFragment.n1;
                js3.m(wn2Var);
                wn2Var.w.setPlaceholderText(strW);
                return tx8Var;
        }
    }

    public bj2(mb5 mb5Var, is3 is3Var) {
        this.a = 7;
        this.b = mb5Var;
    }
}
