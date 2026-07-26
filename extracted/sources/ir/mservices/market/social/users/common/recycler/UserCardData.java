package ir.mservices.market.social.users.common.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.users.common.data.UserDto;

/* JADX INFO: loaded from: classes3.dex */
public final class UserCardData implements MyketRecyclerData, g32 {
    public static final int c = js6.user_vertical_card;
    public static final int d = js6.user_horizontal_card;
    public final UserDto a;
    public final boolean b;

    public UserCardData(UserDto userDto, boolean z) {
        js3.p(userDto, "user");
        this.a = userDto;
        this.b = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return this.b ? d : c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserCardData)) {
            return false;
        }
        UserCardData userCardData = (UserCardData) obj;
        return js3.i(this.a, userCardData.a) && this.b == userCardData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getAccountKey();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }
}
