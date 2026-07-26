package ir.mservices.market.social.profile.list.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListEmptyData implements MyketRecyclerData, g32 {
    public static final int d = js6.holder_custom_list_empty;
    public final v48 a;
    public final boolean b;
    public final boolean c;

    public ProfileListEmptyData(l lVar, boolean z, boolean z2) {
        js3.p(lVar, "loadingFlow");
        this.a = lVar;
        this.b = z;
        this.c = z2;
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
        if (!(obj instanceof ProfileListEmptyData)) {
            return false;
        }
        ProfileListEmptyData profileListEmptyData = (ProfileListEmptyData) obj;
        return ((Boolean) this.a.getValue()).booleanValue() == ((Boolean) profileListEmptyData.a.getValue()).booleanValue() && this.b == profileListEmptyData.b && this.c == profileListEmptyData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return ((((((Boolean) this.a.getValue()).booleanValue() ? 1231 : 1237) * 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
