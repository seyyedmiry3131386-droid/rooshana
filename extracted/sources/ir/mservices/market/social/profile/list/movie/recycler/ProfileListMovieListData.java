package ir.mservices.market.social.profile.list.movie.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListMovieListData extends NestedRecyclerData implements wo2, g32 {
    public static final int h = js6.holder_custom_list_movie_list;
    public final ProfileMovieListDto g;

    public ProfileListMovieListData(ProfileMovieListDto profileMovieListDto, bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        this.g = profileMovieListDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
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
        if (obj instanceof ProfileListMovieListData) {
            return js3.i(this.g, ((ProfileListMovieListData) obj).g);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.g.hashCode());
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
