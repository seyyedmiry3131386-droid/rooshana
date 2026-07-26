package ir.mservices.market.app.home.ui.recycler;

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
import defpackage.kb3;
import defpackage.lw;
import defpackage.m;
import defpackage.o23;
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
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends qg5 {
    public static final /* synthetic */ int B = 0;
    public kb3 A;
    public final int w;
    public o23 x;
    public kb3 y;
    public kb3 z;

    public b(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        HomeExtensionReviewData homeExtensionReviewData = (HomeExtensionReviewData) myketRecyclerData;
        js3.p(homeExtensionReviewData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new HomeExtensionReviewViewHolder$onAttach$1(homeExtensionReviewData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new HomeExtensionReviewViewHolder$onAttach$2(homeExtensionReviewData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        HomeExtensionReviewData homeExtensionReviewData = (HomeExtensionReviewData) myketRecyclerData;
        js3.p(homeExtensionReviewData, "data");
        InCompleteReviewDto inCompleteReviewDto = homeExtensionReviewData.a;
        View view = this.a;
        view.getLayoutParams().width = this.w;
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
        MyketRatingBar myketRatingBar = x().A;
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.f, false, view.getResources().getDimensionPixelSize(pq6.space_2));
        myketRatingBar.setRating(homeExtensionReviewData.d);
        myketRatingBar.setUpdateRatingListener(new m(this, homeExtensionReviewData, 19));
        BigTextButton bigTextButton = x().z;
        bigTextButton.setTextColor(sj8.b().c);
        bigTextButton.setIcon(drawableMutate);
        bigTextButton.setText(view.getResources().getString(rs6.write_review));
        MyketTextView myketTextView = x().w;
        myketTextView.setText(inCompleteReviewDto.getTitle());
        myketTextView.setTextColor(sj8.b().m);
        AppIconView appIconView = x().v;
        js3.m(appIconView);
        AppIconView.setImageUrl$default(appIconView, inCompleteReviewDto.getIconPath(), null, false, 6, null);
        appIconView.setErrorImageResId(yq6.icon);
        MyketTextView myketTextView2 = x().x;
        myketTextView2.setText(inCompleteReviewDto.getCategoryName());
        myketTextView2.setTextColor(sj8.b().n);
        ConstraintLayout constraintLayout = x().B;
        js3.o(constraintLayout, "reviewContent");
        qg5.v(constraintLayout, this.z, this, homeExtensionReviewData);
        ConstraintLayout constraintLayout2 = x().y;
        js3.o(constraintLayout2, "content");
        qg5.v(constraintLayout2, this.y, this, homeExtensionReviewData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof o23) {
            this.x = (o23) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final o23 x() {
        o23 o23Var = this.x;
        if (o23Var != null) {
            return o23Var;
        }
        js3.V("binding");
        throw null;
    }
}
