package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.social.level.recycler.LevelNestedData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.a;

/* JADX INFO: loaded from: classes3.dex */
public final class l54 extends a {
    public int K;

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final l06 A() {
        return new k54(1);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int B() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.a, defpackage.qg5
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void t(LevelNestedData levelNestedData) {
        js3.p(levelNestedData, "data");
        super.t(levelNestedData);
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.horizontal_space_inner) + view.getResources().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.space_xl);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.space_16));
        ea7Var.b = sj8.b().S;
        ea7Var.h = 0;
        view.setBackground(ea7Var.a());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMargins(dimensionPixelSize, 0, dimensionPixelSize, dimensionPixelSize2);
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final PaddingLayoutManager$Padding y(NestedRecyclerData nestedRecyclerData) {
        js3.p((LevelNestedData) nestedRecyclerData, "data");
        return new PaddingLayoutManager$Padding(0, 0, 0, 0);
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final int z() {
        return this.K;
    }
}
