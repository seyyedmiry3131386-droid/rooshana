package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.review.MovieReviewMoreData;

/* JADX INFO: loaded from: classes3.dex */
public final class r55 extends qg5 {
    public final og5 w;
    public o53 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r55(View view, q15 q15Var) {
        super(view);
        js3.p(q15Var, "onClickListener");
        this.w = q15Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieReviewMoreData movieReviewMoreData = (MovieReviewMoreData) myketRecyclerData;
        js3.p(movieReviewMoreData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_24);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        o53 o53Var = this.x;
        if (o53Var == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = o53Var.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().v;
        constraintLayout.setBackground(ea7Var.a());
        o53 o53Var2 = this.x;
        if (o53Var2 == null) {
            js3.V("binding");
            throw null;
        }
        o53Var2.w.setTextColor(sj8.b().m);
        o53 o53Var3 = this.x;
        if (o53Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout2 = o53Var3.v;
        js3.o(constraintLayout2, "layout");
        qg5.v(constraintLayout2, this.w, this, movieReviewMoreData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof o53) {
            this.x = (o53) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
