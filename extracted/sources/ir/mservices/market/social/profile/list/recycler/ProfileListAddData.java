package ir.mservices.market.social.profile.list.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListAddData implements MyketRecyclerData, g32, wo2 {
    public static final int b = js6.holder_custom_list_add;
    public final v48 a;

    public ProfileListAddData(l lVar) {
        js3.p(lVar, "loadingFlow");
        this.a = lVar;
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
        return (obj instanceof ProfileListAddData) && ((Boolean) this.a.getValue()).booleanValue() == ((Boolean) ((ProfileListAddData) obj).a.getValue()).booleanValue();
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "CustomListAddData";
    }

    public final int hashCode() {
        return ((Boolean) this.a.getValue()).booleanValue() ? 1231 : 1237;
    }
}
