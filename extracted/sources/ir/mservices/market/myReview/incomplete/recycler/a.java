package ir.mservices.market.myReview.incomplete.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cl3;
import defpackage.d33;
import defpackage.js3;
import defpackage.lw;
import defpackage.m;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public d33 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, cl3 cl3Var, cl3 cl3Var2, cl3 cl3Var3) {
        super(view);
        js3.p(cl3Var, "onAppClickListener");
        js3.p(cl3Var2, "onReviewClickListener");
        this.w = cl3Var;
        this.x = cl3Var2;
        this.y = cl3Var3;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) myketRecyclerData;
        js3.p(inCompleteReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new InCompleteReviewHolder$onAttach$1(inCompleteReviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) myketRecyclerData;
        js3.p(inCompleteReviewData, "inCompleteReviewData");
        InCompleteReviewDto inCompleteReviewDto = inCompleteReviewData.a;
        d33 d33Var = this.z;
        if (d33Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketRatingBar myketRatingBar = d33Var.B;
        int i = sj8.b().c;
        int i2 = MyketRatingBar.f;
        View view = this.a;
        myketRatingBar.setStarStyle(i, i2, false, view.getResources().getDimensionPixelSize(pq6.space_2));
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i3 = yq6.ic_edit;
        try {
            drawable = q39.a(resources, i3, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i3, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i3, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        d33 d33Var2 = this.z;
        if (d33Var2 == null) {
            js3.V("binding");
            throw null;
        }
        BigTextButton bigTextButton = d33Var2.A;
        bigTextButton.setTextColor(sj8.b().c);
        bigTextButton.setText(view.getResources().getString(rs6.write_review));
        bigTextButton.setIcon(drawableMutate);
        d33 d33Var3 = this.z;
        if (d33Var3 == null) {
            js3.V("binding");
            throw null;
        }
        d33Var3.y.setText(inCompleteReviewDto.getCategoryName());
        d33 d33Var4 = this.z;
        if (d33Var4 == null) {
            js3.V("binding");
            throw null;
        }
        d33Var4.w.setData(inCompleteReviewDto.getTotalRating(), inCompleteReviewDto.getDownloadSummaryDTO());
        d33 d33Var5 = this.z;
        if (d33Var5 == null) {
            js3.V("binding");
            throw null;
        }
        d33Var5.x.setText(inCompleteReviewDto.getTitle());
        d33 d33Var6 = this.z;
        if (d33Var6 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = d33Var6.v;
        js3.o(appIconView, "appIcon");
        AppIconView.setImageUrl$default(appIconView, inCompleteReviewDto.getIconPath(), null, false, 6, null);
        d33 d33Var7 = this.z;
        if (d33Var7 == null) {
            js3.V("binding");
            throw null;
        }
        d33Var7.v.setErrorImageResId(yq6.icon);
        d33 d33Var8 = this.z;
        if (d33Var8 == null) {
            js3.V("binding");
            throw null;
        }
        d33Var8.B.setUpdateRatingListener(new m(this, inCompleteReviewData, 23));
        d33 d33Var9 = this.z;
        if (d33Var9 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = d33Var9.C;
        js3.o(constraintLayout, "reviewContent");
        qg5.v(constraintLayout, this.x, this, inCompleteReviewData);
        d33 d33Var10 = this.z;
        if (d33Var10 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = d33Var10.z;
        js3.o(frameLayout, "content");
        qg5.v(frameLayout, this.w, this, inCompleteReviewData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        boolean z = a79Var instanceof d33;
        if (z) {
            this.z = (d33) a79Var;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            lw.g(null, "binding is incompatible", null);
        }
    }
}
