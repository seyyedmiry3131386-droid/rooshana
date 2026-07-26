package ir.mservices.market.app.url.recycler;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a79;
import defpackage.b77;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.js3;
import defpackage.lw;
import defpackage.m;
import defpackage.o23;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.s09;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigTextButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends qg5 {
    public final og5 w;
    public final og5 x;
    public final og5 y;
    public o23 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(View view, s09 s09Var, s09 s09Var2, s09 s09Var3) {
        super(view);
        js3.p(s09Var, "onAppClickListener");
        js3.p(s09Var2, "onReviewClickListener");
        this.w = s09Var;
        this.x = s09Var2;
        this.y = s09Var3;
        qg5.r();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppReviewData appReviewData = (AppReviewData) myketRecyclerData;
        js3.p(appReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppReviewHolder$onAttach$1(appReviewData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new AppReviewHolder$onAttach$2(appReviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        AppReviewData appReviewData = (AppReviewData) myketRecyclerData;
        js3.p(appReviewData, "appUnReviewedData");
        InCompleteReviewDto inCompleteReviewDto = appReviewData.b;
        o23 o23Var = this.z;
        if (o23Var == null) {
            js3.V("binding");
            throw null;
        }
        o23Var.C.setVisibility(8);
        View view = this.a;
        Resources resources = view.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_edit;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        o23 o23Var2 = this.z;
        if (o23Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketRatingBar myketRatingBar = o23Var2.A;
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.f, false, view.getResources().getDimensionPixelSize(pq6.space_2));
        myketRatingBar.setRating(appReviewData.f);
        myketRatingBar.setUpdateRatingListener(new m(this, appReviewData, 2));
        o23 o23Var3 = this.z;
        if (o23Var3 == null) {
            js3.V("binding");
            throw null;
        }
        BigTextButton bigTextButton = o23Var3.z;
        bigTextButton.setTextColor(sj8.b().c);
        bigTextButton.setText(view.getResources().getString(rs6.write_review));
        bigTextButton.setIcon(drawableMutate);
        o23 o23Var4 = this.z;
        if (o23Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = o23Var4.w;
        myketTextView.setText(inCompleteReviewDto.getTitle());
        myketTextView.setTextColor(sj8.b().m);
        o23 o23Var5 = this.z;
        if (o23Var5 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = o23Var5.v;
        js3.m(appIconView);
        AppIconView.setImageUrl$default(appIconView, inCompleteReviewDto.getIconPath(), null, false, 6, null);
        appIconView.setErrorImageResId(yq6.icon);
        o23 o23Var6 = this.z;
        if (o23Var6 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = o23Var6.x;
        myketTextView2.setText(inCompleteReviewDto.getCategoryName());
        myketTextView2.setTextColor(sj8.b().n);
        o23 o23Var7 = this.z;
        if (o23Var7 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = o23Var7.B;
        js3.o(constraintLayout, "reviewContent");
        qg5.v(constraintLayout, this.x, this, appReviewData);
        o23 o23Var8 = this.z;
        if (o23Var8 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout2 = o23Var8.y;
        js3.o(constraintLayout2, "content");
        qg5.v(constraintLayout2, this.w, this, appReviewData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof o23) {
            this.z = (o23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
