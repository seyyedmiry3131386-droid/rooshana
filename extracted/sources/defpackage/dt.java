package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.detail.reivews.recycler.OwnReviewData;
import ir.mservices.market.app.detail.reivews.recycler.ReviewData;
import ir.mservices.market.app.detail.reivews.recycler.c;
import ir.mservices.market.app.detail.subReviews.recycler.SubReviewData;
import ir.mservices.market.app.detail.subReviews.recycler.SubReviewsTitleData;
import ir.mservices.market.app.detail.subReviews.recycler.b;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class dt extends a {
    public by4 l;
    public ft m;
    public ft n;
    public ft o;
    public ft p;
    public ft q;
    public ft r;
    public ft s;
    public ft t;
    public ft u;
    public ft v;

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        if (i == SubReviewData.d) {
            by4 by4Var = this.l;
            if (by4Var == null) {
                js3.V("moreMenuListener");
                throw null;
            }
            ft ftVar = this.m;
            if (ftVar == null) {
                js3.V("onSubReviewLikeClickListener");
                throw null;
            }
            ft ftVar2 = this.n;
            if (ftVar2 == null) {
                js3.V("onSubReviewDislikeClickListener");
                throw null;
            }
            ft ftVar3 = this.o;
            if (ftVar3 != null) {
                return new b(view, by4Var, ftVar, ftVar2, ftVar3);
            }
            js3.V("onSubReviewProfileClickListener");
            throw null;
        }
        if (i != ReviewData.j) {
            if (i == SubReviewsTitleData.b) {
                return new ir.mservices.market.app.detail.subReviews.recycler.a(view);
            }
            if (i != OwnReviewData.i) {
                return null;
            }
            ft ftVar4 = this.t;
            if (ftVar4 == null) {
                js3.V("onRateEditClickListener");
                throw null;
            }
            ft ftVar5 = this.u;
            if (ftVar5 == null) {
                js3.V("onUserReviewDeveloperLikeClickListener");
                throw null;
            }
            ft ftVar6 = this.v;
            if (ftVar6 != null) {
                return new ir.mservices.market.app.detail.reivews.recycler.b(view, ftVar4, null, ftVar5, ftVar6);
            }
            js3.V("onUserReviewDeveloperDislikeClickListener");
            throw null;
        }
        by4 by4Var2 = this.l;
        if (by4Var2 == null) {
            js3.V("moreMenuListener");
            throw null;
        }
        ft ftVar7 = this.s;
        if (ftVar7 == null) {
            js3.V("onReplyClickListener");
            throw null;
        }
        ft ftVar8 = this.q;
        if (ftVar8 == null) {
            js3.V("onReviewLikeClickListener");
            throw null;
        }
        ft ftVar9 = this.p;
        if (ftVar9 == null) {
            js3.V("onReviewDislikeClickListener");
            throw null;
        }
        ft ftVar10 = this.r;
        if (ftVar10 != null) {
            return new c(view, by4Var2, null, ftVar7, ftVar8, ftVar9, ftVar10, null);
        }
        js3.V("onReviewProfileClickListener");
        throw null;
    }
}
