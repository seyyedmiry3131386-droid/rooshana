package ir.mservices.market.social.profile.own.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.ProfileRequestDto;

/* JADX INFO: loaded from: classes3.dex */
public final class FollowRequestData implements MyketRecyclerData, g32, wo2 {
    public static final int b = js6.holder_own_profile_follow_request;
    public final ProfileRequestDto a;

    public FollowRequestData(ProfileRequestDto profileRequestDto) {
        this.a = profileRequestDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!FollowRequestData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.profile.own.recycler.FollowRequestData");
        return js3.i(((FollowRequestData) obj).a, this.a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
