package defpackage;

import ir.mservices.market.app.detail.ui.AppDetailAction;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.common.comment.data.CommentResultState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class wp implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppDetailViewModel b;

    public /* synthetic */ wp(AppDetailViewModel appDetailViewModel, int i) {
        this.a = i;
        this.b = appDetailViewModel;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                if (!(((CommentResultState) obj) instanceof CommentResultState.Success)) {
                    this.b.W(0.0f);
                }
                return tx8.a;
            default:
                AppDetailAction appDetailAction = (AppDetailAction) ((r50) obj);
                boolean z = appDetailAction instanceof AppDetailAction.ReviewAILikeAction;
                AppDetailViewModel appDetailViewModel = this.b;
                if (z) {
                    appDetailViewModel.onReviewAILikeAction((AppDetailAction.ReviewAILikeAction) appDetailAction);
                } else if (appDetailAction instanceof AppDetailAction.DisableNotification) {
                    appDetailViewModel.onDisableNotification((AppDetailAction.DisableNotification) appDetailAction);
                } else if (appDetailAction instanceof AppDetailAction.ShowMoreAIAction) {
                    appDetailViewModel.onShowMoreAIAction((AppDetailAction.ShowMoreAIAction) appDetailAction);
                } else {
                    if (!(appDetailAction instanceof AppDetailAction.InitAction)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    appDetailViewModel.onInitAction((AppDetailAction.InitAction) appDetailAction);
                }
                return tx8.a;
        }
    }
}
