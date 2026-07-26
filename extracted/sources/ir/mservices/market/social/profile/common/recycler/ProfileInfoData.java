package ir.mservices.market.social.profile.common.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.data.AccountDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileInfoData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.holder_own_profile_info;
    public final AccountDto a;
    public boolean b;

    public ProfileInfoData(AccountDto accountDto) {
        js3.p(accountDto, "account");
        this.a = accountDto;
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
        if (obj instanceof ProfileInfoData) {
            return js3.i(this.a, ((ProfileInfoData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "ProfileInfoDataId";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
