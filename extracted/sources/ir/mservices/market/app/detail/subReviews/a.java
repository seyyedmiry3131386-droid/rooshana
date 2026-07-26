package ir.mservices.market.app.detail.subReviews;

import androidx.lifecycle.b;
import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ AppSubReviewsFragment a;

    public a(AppSubReviewsFragment appSubReviewsFragment) {
        this.a = appSubReviewsFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        if (commentResultState instanceof CommentResultState.Success) {
            AppSubReviewsFragment appSubReviewsFragment = this.a;
            b.a(appSubReviewsFragment.N()).b(new AppSubReviewsFragment$onViewCreated$2$1$1(commentResultState, appSubReviewsFragment, null));
        }
        return tx8.a;
    }
}
