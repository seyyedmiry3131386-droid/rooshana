package ir.mservices.market.social.list.common.movie.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.vb7;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMovieData extends SelectableRecyclerData implements g32 {
    public static final int c = js6.holder_social_movie;
    public final MovieDto b;

    public ProfileMovieData(MovieDto movieDto, vb7 vb7Var) {
        super(vb7Var);
        this.b = movieDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.social.list.items.recycler.SelectableRecyclerData
    public final String a() {
        return this.b.getId();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ProfileMovieData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData");
        return js3.i(this.b, ((ProfileMovieData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
