package ir.mservices.market.myReview.complete.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.f88;
import defpackage.js3;
import defpackage.lw;
import defpackage.nx0;
import defpackage.og5;
import defpackage.q13;
import defpackage.qg5;
import defpackage.sj8;
import defpackage.v7;
import defpackage.w91;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.myReview.complete.data.CompleteReviewDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public static final /* synthetic */ int z = 0;
    public final og5 w;
    public final og5 x;
    public q13 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, nx0 nx0Var, nx0 nx0Var2) {
        super(view);
        js3.p(nx0Var, "onMenuListener");
        js3.p(nx0Var2, "onAppClickListener");
        this.w = nx0Var;
        this.x = nx0Var2;
        w91 w91Var = (w91) qg5.r();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        CompleteReview completeReview = (CompleteReview) myketRecyclerData;
        js3.p(completeReview, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new CompleteReviewHolder$onAttach$1(completeReview, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        CompleteReview completeReview = (CompleteReview) myketRecyclerData;
        js3.p(completeReview, "completeReviewData");
        q13 q13Var = this.y;
        if (q13Var == null) {
            js3.V("binding");
            throw null;
        }
        q13Var.C.setStarStyle(sj8.b().c, MyketRatingBar.g, true, 0);
        CompleteReviewDto completeReviewDto = completeReview.a;
        x(completeReview.d, completeReview.c);
        q13 q13Var2 = this.y;
        if (q13Var2 == null) {
            js3.V("binding");
            throw null;
        }
        q13Var2.y.setText(completeReviewDto.getCategoryName());
        q13 q13Var3 = this.y;
        if (q13Var3 == null) {
            js3.V("binding");
            throw null;
        }
        q13Var3.w.setData(completeReviewDto.getTotalRating(), completeReviewDto.getDownloadSummary());
        q13 q13Var4 = this.y;
        if (q13Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketImageButton myketImageButton = q13Var4.B;
        myketImageButton.getDrawable().mutate().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        myketImageButton.setVisibility(0);
        q13 q13Var5 = this.y;
        if (q13Var5 == null) {
            js3.V("binding");
            throw null;
        }
        q13Var5.x.setText(completeReviewDto.getTitle());
        q13 q13Var6 = this.y;
        if (q13Var6 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = q13Var6.v;
        js3.m(appIconView);
        AppIconView.setImageUrl$default(appIconView, completeReviewDto.getIconPath(), null, false, 6, null);
        appIconView.setErrorImageResId(yq6.icon);
        q13 q13Var7 = this.y;
        if (q13Var7 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = q13Var7.A;
        js3.o(frameLayout, "content");
        qg5.v(frameLayout, this.x, this, completeReview);
        q13 q13Var8 = this.y;
        if (q13Var8 == null) {
            js3.V("binding");
            throw null;
        }
        MyketImageButton myketImageButton2 = q13Var8.B;
        js3.o(myketImageButton2, "more");
        qg5.v(myketImageButton2, this.w, this, completeReview);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        boolean z2 = a79Var instanceof q13;
        if (z2) {
            this.y = (q13) a79Var;
        } else {
            if (z2) {
                throw new NoWhenBranchMatchedException();
            }
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final void x(String str, float f) {
        q13 q13Var = this.y;
        if (q13Var == null) {
            js3.V("binding");
            throw null;
        }
        q13Var.C.setRating(f);
        q13 q13Var2 = this.y;
        if (q13Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = q13Var2.z;
        if (str == null || f88.n0(str)) {
            myketTextView.setVisibility(8);
        } else {
            myketTextView.setVisibility(0);
            MyketTextView.setExpandableText$default(myketTextView, str, null, 6, false, false, new v7(26), 26, null);
        }
    }
}
