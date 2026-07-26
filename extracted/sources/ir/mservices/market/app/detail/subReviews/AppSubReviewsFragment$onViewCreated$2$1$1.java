package ir.mservices.market.app.detail.subReviews;

import defpackage.dd;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.yq6;
import ir.mservices.market.common.comment.data.CommentResultState;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import java.util.Locale;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsFragment$onViewCreated$2$1$1", f = "AppSubReviewsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppSubReviewsFragment$onViewCreated$2$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ CommentResultState a;
    public final /* synthetic */ AppSubReviewsFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSubReviewsFragment$onViewCreated$2$1$1(CommentResultState commentResultState, AppSubReviewsFragment appSubReviewsFragment, g51 g51Var) {
        super(2, g51Var);
        this.a = commentResultState;
        this.b = appSubReviewsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppSubReviewsFragment$onViewCreated$2$1$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AppSubReviewsFragment$onViewCreated$2$1$1 appSubReviewsFragment$onViewCreated$2$1$1 = (AppSubReviewsFragment$onViewCreated$2$1$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        appSubReviewsFragment$onViewCreated$2$1$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String lowerCase;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        CommentResultState.Success success = (CommentResultState.Success) this.a;
        String postAction = success.getData().getPostAction();
        if (postAction != null) {
            lowerCase = postAction.toLowerCase(Locale.ROOT);
            js3.o(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        boolean zI = js3.i(lowerCase, ReviewResultDto.REVIEW_POST_ACTION_SURVEY);
        AppSubReviewsFragment appSubReviewsFragment = this.b;
        if (zI) {
            String comment = success.getData().getComment();
            if (comment != null) {
                int i = AppSubReviewsFragment.q1;
                String strL = comment.length() == 0 ? appSubReviewsFragment.L(rs6.professional_review_text) : appSubReviewsFragment.L(rs6.professional_review_text_with_comment);
                js3.m(strL);
                pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_SURVEY", null, 12), null, -1, null, strL, appSubReviewsFragment.L(rs6.start), appSubReviewsFragment.L(rs6.return_change), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
            }
        } else if (js3.i(lowerCase, ReviewResultDto.REVIEW_POST_ACTION_REVIEW)) {
            int i2 = AppSubReviewsFragment.q1;
            pk5.g(appSubReviewsFragment.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(appSubReviewsFragment.V1(), "DIALOG_KEY_MORE_REVIEW", null, 12), null, yq6.success_review_dialog_image, null, appSubReviewsFragment.L(rs6.review_dialog_content), appSubReviewsFragment.L(rs6.review_dialog_commit_btn), appSubReviewsFragment.L(rs6.not_now), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
        }
        return tx8.a;
    }
}
