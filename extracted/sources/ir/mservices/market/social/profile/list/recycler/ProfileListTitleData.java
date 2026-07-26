package ir.mservices.market.social.profile.list.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListTitleData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.holder_custom_list_title;
    public final String a;
    public final ProfileApplicationListDto b;
    public final ProfileMovieListDto c;

    public ProfileListTitleData(String str, ProfileApplicationListDto profileApplicationListDto, ProfileMovieListDto profileMovieListDto, int i) {
        profileApplicationListDto = (i & 2) != 0 ? null : profileApplicationListDto;
        profileMovieListDto = (i & 4) != 0 ? null : profileMovieListDto;
        js3.p(str, "title");
        this.a = str;
        this.b = profileApplicationListDto;
        this.c = profileMovieListDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileListTitleData)) {
            return false;
        }
        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
        return js3.i(this.b, profileListTitleData.b) && js3.i(this.c, profileListTitleData.c) && js3.i(this.a, profileListTitleData.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String key;
        ProfileApplicationListDto profileApplicationListDto = this.b;
        if (profileApplicationListDto != null && (key = profileApplicationListDto.getKey()) != null) {
            return key;
        }
        ProfileMovieListDto profileMovieListDto = this.c;
        return profileMovieListDto != null ? profileMovieListDto.getKey() : String.valueOf(hashCode());
    }

    public final int hashCode() {
        ProfileApplicationListDto profileApplicationListDto = this.b;
        int iHashCode = (profileApplicationListDto != null ? profileApplicationListDto.hashCode() : 0) * 31;
        ProfileMovieListDto profileMovieListDto = this.c;
        return this.a.hashCode() + ((iHashCode + (profileMovieListDto != null ? profileMovieListDto.hashCode() : 0)) * 31);
    }
}
