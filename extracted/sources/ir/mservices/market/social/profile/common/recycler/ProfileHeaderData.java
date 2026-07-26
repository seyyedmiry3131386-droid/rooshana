package ir.mservices.market.social.profile.common.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.RelationsDto;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileHeaderData implements MyketRecyclerData, wo2, g32 {
    public static final int e = js6.holder_own_profile_header;
    public final v48 a;
    public final RelationsDto b;
    public final AccountDto c;
    public final int d;

    public ProfileHeaderData(l lVar, RelationsDto relationsDto, AccountDto accountDto, int i) {
        js3.p(lVar, "relationsFlow");
        js3.p(accountDto, "account");
        this.a = lVar;
        this.b = relationsDto;
        this.c = accountDto;
        this.d = i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileHeaderData)) {
            return false;
        }
        ProfileHeaderData profileHeaderData = (ProfileHeaderData) obj;
        return js3.i(this.a, profileHeaderData.a) && this.d == profileHeaderData.d && js3.i(this.c, profileHeaderData.c) && js3.i(this.b, profileHeaderData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "ProfileHeaderDataId";
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + (((this.a.hashCode() * 31) + this.d) * 31)) * 31;
        RelationsDto relationsDto = this.b;
        return iHashCode + (relationsDto != null ? relationsDto.hashCode() : 0);
    }
}
