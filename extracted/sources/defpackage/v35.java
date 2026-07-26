package defpackage;

import android.util.TypedValue;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeReelsRowData;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class v35 extends x35 {
    @Override // ir.mservices.market.version2.ui.recycler.a
    public final float D(NestedRecyclerData nestedRecyclerData) {
        js3.p((MovieHomeReelsRowData) nestedRecyclerData, "data");
        TypedValue typedValue = new TypedValue();
        this.a.getResources().getValue(pq6.large_movie_card_count, typedValue, true);
        return typedValue.getFloat();
    }
}
