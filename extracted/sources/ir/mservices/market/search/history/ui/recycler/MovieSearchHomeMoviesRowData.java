package ir.mservices.market.search.history.ui.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieSearchHomeMoviesRowData extends NestedRecyclerData implements wo2, g32 {
    public static final int i = js6.holder_movie_horizontal_list;
    public final String g;
    public final String h;

    public MovieSearchHomeMoviesRowData(bz6 bz6Var, String str, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        this.g = str;
        long j = is3.p + 1;
        is3.p = j;
        this.h = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieSearchHomeMoviesRowData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.search.history.ui.recycler.MovieSearchHomeMoviesRowData");
        return js3.i(this.g, ((MovieSearchHomeMoviesRowData) obj).g);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.g;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
