package defpackage;

import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.CommentFlowViewModel;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.DeveloperSubmitReview;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class lw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public lw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = CommentFlowFragment.P0;
        DeveloperSubmitReview value = ((CommentScenario.SubmitDeveloperStar) obj).getValue();
        CommentFlowFragment commentFlowFragment = this.a;
        DialogDataModel dialogDataModel = new DialogDataModel(commentFlowFragment.I0(), "DIALOG_DEVELOPER_COMMENT", null, 12);
        String packageName = value.getPackageName();
        String comment = value.getComment();
        CommentFlowViewModel commentFlowViewModelG0 = commentFlowFragment.G0();
        String strM = commentFlowViewModelG0.b.m(commentFlowViewModelG0.e);
        js3.o(strM, "getApplicationName(...)");
        pk5.g(commentFlowFragment.C0(), new NavIntentDirections.DeveloperComment(new al1(dialogDataModel, packageName, comment, strM, value.getCommentSource(), value.getRating(), value.isShowEditConfirm())), -1);
        return tx8.a;
    }
}
