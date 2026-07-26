package ir.mservices.market.app.detail.reivews;

import androidx.lifecycle.b;
import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ AppReviewsFragment a;

    public a(AppReviewsFragment appReviewsFragment) {
        this.a = appReviewsFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        if (commentResultState instanceof CommentResultState.Success) {
            AppReviewsFragment appReviewsFragment = this.a;
            b.a(appReviewsFragment.N()).b(new AppReviewsFragment$onViewCreated$2$1$1(commentResultState, appReviewsFragment, null));
        }
        return tx8.a;
    }
}
