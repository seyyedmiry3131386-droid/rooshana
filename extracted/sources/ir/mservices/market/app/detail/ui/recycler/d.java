package ir.mservices.market.app.detail.ui.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import defpackage.a79;
import defpackage.bt2;
import defpackage.cc7;
import defpackage.cv6;
import defpackage.js3;
import defpackage.lw;
import defpackage.m;
import defpackage.og5;
import defpackage.pq6;
import defpackage.qg5;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.views.MyketRatingBar;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends qg5 {
    public final og5 w;
    public cv6 x;

    public d(View view, og5 og5Var) {
        super(view);
        this.w = og5Var;
    }

    public static final void x(d dVar, float f, AppRatingModuleData appRatingModuleData) {
        MyketRatingBar myketRatingBar = dVar.y().w;
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.e, false, myketRatingBar.getContext().getResources().getDimensionPixelSize(pq6.space_4));
        myketRatingBar.setRating(f);
        myketRatingBar.setUpdateRatingListener(new m(dVar, appRatingModuleData, 1));
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) myketRecyclerData;
        js3.p(appRatingModuleData, "data");
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new AppRatingViewHolder$onAttach$1(appRatingModuleData, this, null), 3);
        bt2.G(cc7.q(view), null, null, new AppRatingViewHolder$onAttach$2(appRatingModuleData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        AppRatingModuleData appRatingModuleData = (AppRatingModuleData) myketRecyclerData;
        js3.p(appRatingModuleData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        y().l.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        y().v.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().q, PorterDuff.Mode.MULTIPLY));
        y().x.setText(appRatingModuleData.d ? view.getResources().getString(rs6.app_rate_module_title) : view.getResources().getString(rs6.first_review_txt));
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof cv6) {
            this.x = (cv6) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final cv6 y() {
        cv6 cv6Var = this.x;
        if (cv6Var != null) {
            return cv6Var;
        }
        js3.V("binding");
        throw null;
    }
}
