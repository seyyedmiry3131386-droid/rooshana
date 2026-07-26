package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.reivews.recycler.RateWithoutCommentData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewHeaderData;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.c;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class u87 extends a {
    public lt5 l;
    public wr m;
    public wr n;
    public wr o;
    public wr p;
    public wr q;
    public wr r;
    public wr s;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == ReviewHeaderData.j) {
            v87 v87Var = new v87(view, null, 1);
            v87Var.y = (lw8) ((w91) qg5.r()).E.get();
            return v87Var;
        }
        if (i == AppRatingModuleData.f) {
            wr wrVar = this.r;
            if (wrVar == null) {
                js3.V("onRatingClickListener");
                throw null;
            }
            d dVar = new d(view, wrVar);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = view.getResources().getDimensionPixelSize(pq6.margin_default_v2_half);
            return dVar;
        }
        if (i != ReviewData.j) {
            if (i == RateWithoutCommentData.d) {
                ft1 ft1Var = new ft1(5, view);
                ft1Var.x = (lw8) ((w91) qg5.r()).E.get();
                return ft1Var;
            }
            if (i != AppHorizontalTagsData.c) {
                return null;
            }
            wr wrVar2 = this.s;
            if (wrVar2 != null) {
                return new c(view, wrVar2);
            }
            js3.V("onReviewTagClickListener");
            throw null;
        }
        lt5 lt5Var = this.l;
        if (lt5Var == null) {
            js3.V("moreMenuListener");
            throw null;
        }
        wr wrVar3 = this.q;
        if (wrVar3 == null) {
            js3.V("onReviewShowSubCommentClickListener");
            throw null;
        }
        wr wrVar4 = this.m;
        if (wrVar4 == null) {
            js3.V("onReviewReplyClickListener");
            throw null;
        }
        wr wrVar5 = this.n;
        if (wrVar5 == null) {
            js3.V("onReviewLikeClickListener");
            throw null;
        }
        wr wrVar6 = this.o;
        if (wrVar6 == null) {
            js3.V("onReviewDislikeClickListener");
            throw null;
        }
        wr wrVar7 = this.p;
        if (wrVar7 == null) {
            js3.V("onReviewProfileClickListener");
            throw null;
        }
        if (wrVar3 != null) {
            return new ir.mservices.market.app.detail.reivews.recycler.c(view, lt5Var, wrVar3, wrVar4, wrVar5, wrVar6, wrVar7, wrVar3);
        }
        js3.V("onReviewShowSubCommentClickListener");
        throw null;
    }
}
