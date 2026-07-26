package ir.mservices.market.app.detail.subReviews.recycler;

import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.v48;
import defpackage.v93;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public v93 w;

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        SubReviewsTitleData subReviewsTitleData = (SubReviewsTitleData) myketRecyclerData;
        js3.p(subReviewsTitleData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new SubReviewTitleViewHolder$onAttach$1(null, this, subReviewsTitleData), 3);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof v93) {
            this.w = (v93) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    @Override // defpackage.qg5
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final void t(SubReviewsTitleData subReviewsTitleData) {
        js3.p(subReviewsTitleData, "data");
        v48 v48Var = subReviewsTitleData.a;
        v93 v93Var = this.w;
        if (v93Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = v93Var.v;
        int iIntValue = ((Number) v48Var.getValue()).intValue();
        View view = this.a;
        myketTextView.setText(iIntValue > 0 ? view.getResources().getString(rs6.sub_review_title_with_count, v48Var.getValue()) : view.getResources().getString(rs6.sub_review_title));
    }
}
