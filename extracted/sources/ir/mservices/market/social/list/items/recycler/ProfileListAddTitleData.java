package ir.mservices.market.social.list.items.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListAddTitleData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_custom_list_add_title;
    public final l a;

    public ProfileListAddTitleData(l lVar) {
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
        if (!ProfileListAddTitleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.list.items.recycler.ProfileListAddTitleData");
        return js3.i(this.a.getValue(), ((ProfileListAddTitleData) obj).a.getValue());
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        Object value = this.a.getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }
}
