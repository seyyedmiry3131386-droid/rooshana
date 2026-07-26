package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeMoviesRowData;
import ir.mservices.market.movie.ui.home.recycler.b;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class r35 extends b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r35(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z, og5 og5Var, og5 og5Var2) {
        super(view, graphicUtils$Dimension, z, og5Var, og5Var2);
        js3.p(graphicUtils$Dimension, "dimension");
        this.Q = (qa3) ((w91) qg5.r()).H0.get();
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieHomeMoviesRowData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.small_movie_card_count, typedValue, true);
        return typedValue.getFloat();
    }
}
