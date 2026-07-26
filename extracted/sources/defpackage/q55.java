package defpackage;

import android.graphics.Color;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.data.webapi.MovieReviewInfoDto;
import ir.mservices.market.movie.ui.detail.review.MovieReviewInfoData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class q55 extends qg5 {
    public final og5 w;
    public final lw8 x;
    public k55 y;

    public q55(View view, q15 q15Var) {
        super(view);
        this.w = q15Var;
        this.x = (lw8) ((w91) qg5.r()).E.get();
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieReviewInfoData movieReviewInfoData = (MovieReviewInfoData) myketRecyclerData;
        js3.p(movieReviewInfoData, "data");
        MovieReviewInfoDto movieReviewInfoDto = movieReviewInfoData.a;
        if (movieReviewInfoDto != null) {
            String rating = movieReviewInfoDto.getRating();
            if (rating != null) {
                MyketTextView myketTextView = x().w;
                lw8 lw8Var = this.x;
                if (lw8Var == null) {
                    js3.V("uiUtils");
                    throw null;
                }
                myketTextView.setText(lw8.e(lw8Var, rating));
            }
            MyketTextView myketTextView2 = x().w;
            Object obj = lw8.b;
            String color = movieReviewInfoDto.getColor();
            int color2 = sj8.b().n;
            try {
                color2 = Color.parseColor(color);
            } catch (Exception unused) {
            }
            myketTextView2.setTextColor(color2);
            x().y.setText(movieReviewInfoDto.getTitle());
            MyketTextView myketTextView3 = x().x;
            js3.m(myketTextView3);
            String subtitle = movieReviewInfoDto.getSubtitle();
            myketTextView3.setVisibility((subtitle == null || f88.n0(subtitle)) ? 8 : 0);
            myketTextView3.setText(movieReviewInfoDto.getSubtitle());
        }
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        x().v.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        View view2 = x().l;
        js3.o(view2, "getRoot(...)");
        qg5.v(view2, this.w, this, movieReviewInfoData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof k55) {
            this.y = (k55) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }

    public final k55 x() {
        k55 k55Var = this.y;
        if (k55Var != null) {
            return k55Var;
        }
        js3.V("binding");
        throw null;
    }
}
