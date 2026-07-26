package defpackage;

import ir.mservices.market.app.url.recycler.AppReviewData;
import ir.mservices.market.app.url.recycler.a;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class vr implements ze2 {
    public final /* synthetic */ AppReviewData a;
    public final /* synthetic */ a b;

    public vr(AppReviewData appReviewData, a aVar) {
        this.a = appReviewData;
        this.b = aVar;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        boolean z = commentResultState instanceof CommentResultState.Success;
        a aVar = this.b;
        AppReviewData appReviewData = this.a;
        if (z) {
            CommentResultState.Success success = (CommentResultState.Success) commentResultState;
            appReviewData.f = success.getData().getRate();
            float rate = success.getData().getRate();
            o23 o23Var = aVar.z;
            if (o23Var == null) {
                js3.V("binding");
                throw null;
            }
            o23Var.A.setRating(rate);
        } else if (commentResultState instanceof CommentResultState.Cancel) {
            float f = appReviewData.f;
            o23 o23Var2 = aVar.z;
            if (o23Var2 == null) {
                js3.V("binding");
                throw null;
            }
            o23Var2.A.setRating(f);
        }
        return tx8.a;
    }
}
