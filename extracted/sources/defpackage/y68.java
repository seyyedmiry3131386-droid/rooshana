package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.recycler.StreamerMoviesMoreData;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class y68 extends qg5 {
    public final og5 w;
    public u93 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y68(View view, og5 og5Var) {
        super(view);
        js3.p(og5Var, "onClickListener");
        this.w = og5Var;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        StreamerMoviesMoreData streamerMoviesMoreData = (StreamerMoviesMoreData) myketRecyclerData;
        js3.p(streamerMoviesMoreData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_40) / 2;
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        u93 u93Var = this.x;
        if (u93Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = u93Var.w;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().v;
        myketTextView.setBackground(ea7Var.a());
        u93 u93Var2 = this.x;
        if (u93Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = u93Var2.w;
        js3.o(myketTextView2, "more");
        qg5.v(myketTextView2, this.w, this, streamerMoviesMoreData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof u93) {
            this.x = (u93) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
