package defpackage;

import android.util.TypedValue;
import android.view.View;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannersRowData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class i35 extends g35 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i35(View view, GraphicUtils$Dimension graphicUtils$Dimension, boolean z) {
        super(view, graphicUtils$Dimension, z);
        js3.p(graphicUtils$Dimension, "dimension");
    }

    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieHomeBannersRowData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.large_movie_banner_card_count, typedValue, true);
        return typedValue.getFloat();
    }
}
