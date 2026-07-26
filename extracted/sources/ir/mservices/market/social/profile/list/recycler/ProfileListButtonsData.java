package ir.mservices.market.social.profile.list.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.LikeSocialListDto;
import ir.mservices.market.social.profile.list.data.SocialMessagingDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListButtonsData implements MyketRecyclerData, wo2, g32 {
    public static final int h = js6.holder_custom_list_buttons;
    public final String a;
    public final ProfileApplicationListDto b;
    public final ProfileMovieListDto c;
    public final SocialMessagingDto d;
    public final boolean e;
    public final xe2 f;
    public LikeSocialListDto g;

    public ProfileListButtonsData(String str, ProfileApplicationListDto profileApplicationListDto, ProfileMovieListDto profileMovieListDto, SocialMessagingDto socialMessagingDto, boolean z, v48 v48Var, int i) {
        profileApplicationListDto = (i & 2) != 0 ? null : profileApplicationListDto;
        profileMovieListDto = (i & 4) != 0 ? null : profileMovieListDto;
        js3.p(str, "title");
        js3.p(v48Var, "likeResultFlow");
        this.a = str;
        this.b = profileApplicationListDto;
        this.c = profileMovieListDto;
        this.d = socialMessagingDto;
        this.e = z;
        this.f = v48Var;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return h;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileListButtonsData)) {
            return false;
        }
        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
        return js3.i(this.b, profileListButtonsData.b) && js3.i(this.c, profileListButtonsData.c) && js3.i(this.a, profileListButtonsData.a);
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
