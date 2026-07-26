package ir.mservices.market.app.detail.ui;

import defpackage.g51;
import defpackage.tx8;
import defpackage.ze2;
import ir.mservices.market.common.comment.data.CommentResultState;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements ze2 {
    public final /* synthetic */ AppDetailFragment a;

    public a(AppDetailFragment appDetailFragment) {
        this.a = appDetailFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        CommentResultState commentResultState = (CommentResultState) obj;
        if (commentResultState instanceof CommentResultState.Success) {
            AppDetailFragment appDetailFragment = this.a;
            androidx.lifecycle.b.a(appDetailFragment.N()).b(new AppDetailFragment$onViewCreated$2$1$1(commentResultState, appDetailFragment, null));
        }
        return tx8.a;
    }
}
