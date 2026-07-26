package defpackage;

import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class ur implements ze2 {
    public final /* synthetic */ d a;
    public final /* synthetic */ AppRatingModuleData b;

    public ur(d dVar, AppRatingModuleData appRatingModuleData) {
        this.a = dVar;
        this.b = appRatingModuleData;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        boolean z = commentResultState instanceof CommentResultState.Success;
        AppRatingModuleData appRatingModuleData = this.b;
        d dVar = this.a;
        if (z) {
            d.x(dVar, ((CommentResultState.Success) commentResultState).getData().getRate(), appRatingModuleData);
        } else {
            d.x(dVar, 0.0f, appRatingModuleData);
        }
        return tx8.a;
    }
}
