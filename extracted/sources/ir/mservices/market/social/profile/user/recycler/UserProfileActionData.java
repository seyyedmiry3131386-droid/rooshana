package ir.mservices.market.social.profile.user.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.ProfileMessagingDto;
import ir.mservices.market.social.profile.data.RelationsDto;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileActionData implements MyketRecyclerData, wo2, g32 {
    public static final int f = js6.holder_user_profile_action;
    public final ProfileMessagingDto a;
    public final RelationsDto b;
    public final String c;
    public final v48 d;
    public final fu7 e;

    public UserProfileActionData(ProfileMessagingDto profileMessagingDto, RelationsDto relationsDto, String str, l lVar, i iVar) {
        js3.p(profileMessagingDto, "message");
        js3.p(relationsDto, "relation");
        js3.p(str, "accountKey");
        js3.p(lVar, "relationFlow");
        js3.p(iVar, "resetRelationFlow");
        this.a = profileMessagingDto;
        this.b = relationsDto;
        this.c = str;
        this.d = lVar;
        this.e = iVar;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return f;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileActionData)) {
            return false;
        }
        UserProfileActionData userProfileActionData = (UserProfileActionData) obj;
        return js3.i(this.a, userProfileActionData.a) && js3.i(this.b, userProfileActionData.b) && js3.i(this.c, userProfileActionData.c);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
