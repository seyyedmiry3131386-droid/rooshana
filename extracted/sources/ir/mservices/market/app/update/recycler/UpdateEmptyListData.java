package ir.mservices.market.app.update.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateEmptyListData implements MyketRecyclerData, wo2, g32 {
    public static final int a = js6.update_empty_list_extension_view;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return UpdateEmptyListData.class.getName().equals(obj != null ? obj.getClass().getName() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(815960811);
    }

    public final int hashCode() {
        return 815960811;
    }
}
