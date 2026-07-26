package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.app.detail.ui.recycler.CommentMoreData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class vw0 extends qg5 {
    public final og5 w;
    public bm3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(View view, ap apVar) {
        super(view);
        js3.p(apVar, "onClickListener");
        this.w = apVar;
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        CommentMoreData commentMoreData = (CommentMoreData) myketRecyclerData;
        js3.p(commentMoreData, "data");
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_24);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        int dimensionPixelSize3 = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        bm3 bm3Var = this.x;
        if (bm3Var == null) {
            js3.V("binding");
            throw null;
        }
        bm3Var.l.setPadding(dimensionPixelSize3, 0, dimensionPixelSize3, 0);
        bm3 bm3Var2 = this.x;
        if (bm3Var2 == null) {
            js3.V("binding");
            throw null;
        }
        FrameLayout frameLayout = bm3Var2.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().l;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.b().v;
        frameLayout.setBackground(ea7Var.a());
        bm3 bm3Var3 = this.x;
        if (bm3Var3 == null) {
            js3.V("binding");
            throw null;
        }
        bm3Var3.w.setTextColor(sj8.b().m);
        qg5.v(view, this.w, this, commentMoreData);
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof bm3) {
            this.x = (bm3) a79Var;
        } else {
            lw.g(null, "binding is incompatible", null);
        }
    }
}
