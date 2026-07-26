package defpackage;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.ui.detail.recycler.MovieEpisodeMoreData;

/* JADX INFO: loaded from: classes3.dex */
public final class a35 extends qg5 {
    public final og5 w;
    public x43 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a35(View view, q15 q15Var) {
        super(view);
        js3.p(q15Var, "onClickListener");
        this.w = q15Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        MovieEpisodeMoreData movieEpisodeMoreData = (MovieEpisodeMoreData) myketRecyclerData;
        js3.p(movieEpisodeMoreData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_24);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        x43 x43Var = this.x;
        if (x43Var == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = x43Var.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().v;
        constraintLayout.setBackground(ea7Var.a());
        x43 x43Var2 = this.x;
        if (x43Var2 == null) {
            js3.V("binding");
            throw null;
        }
        x43Var2.w.setTextColor(sj8.b().m);
        x43 x43Var3 = this.x;
        if (x43Var3 == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout2 = x43Var3.v;
        js3.o(constraintLayout2, "layout");
        qg5.v(constraintLayout2, this.w, this, movieEpisodeMoreData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof x43) {
            this.x = (x43) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
