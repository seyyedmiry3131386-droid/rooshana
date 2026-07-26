package ir.mservices.market.social.profile.own.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.ProfileMessagingDto;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnProfileActionData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.holder_own_profile_action;
    public final ProfileMessagingDto a;
    public final v48 b;

    public OwnProfileActionData(ProfileMessagingDto profileMessagingDto, l lVar) {
        js3.p(profileMessagingDto, "message");
        js3.p(lVar, "unreadMessageFlow");
        this.a = profileMessagingDto;
        this.b = lVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnProfileActionData)) {
            return false;
        }
        OwnProfileActionData ownProfileActionData = (OwnProfileActionData) obj;
        return js3.i(this.a, ownProfileActionData.a) && ((Boolean) this.b.getValue()).booleanValue() == ((Boolean) ownProfileActionData.b.getValue()).booleanValue();
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (((Boolean) this.b.getValue()).booleanValue() ? 1231 : 1237);
    }
}
