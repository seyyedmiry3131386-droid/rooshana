package defpackage;

import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.app.home.ui.recycler.b;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class mb3 implements ze2 {
    public final /* synthetic */ HomeExtensionReviewData a;
    public final /* synthetic */ b b;

    public mb3(HomeExtensionReviewData homeExtensionReviewData, b bVar) {
        this.a = homeExtensionReviewData;
        this.b = bVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        boolean z = commentResultState instanceof CommentResultState.Success;
        b bVar = this.b;
        HomeExtensionReviewData homeExtensionReviewData = this.a;
        if (z) {
            CommentResultState.Success success = (CommentResultState.Success) commentResultState;
            homeExtensionReviewData.d = success.getData().getRate();
            float rate = success.getData().getRate();
            int i = b.B;
            bVar.x().A.setRating(rate);
        } else if (commentResultState instanceof CommentResultState.Cancel) {
            float f = homeExtensionReviewData.d;
            int i2 = b.B;
            bVar.x().A.setRating(f);
        }
        return tx8.a;
    }
}
