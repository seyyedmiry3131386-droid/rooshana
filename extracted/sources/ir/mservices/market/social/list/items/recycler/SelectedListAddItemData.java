package ir.mservices.market.social.list.items.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectedListAddItemData implements MyketRecyclerData, g32, wo2 {
    public static final int b = js6.holder_selected_list_add;
    public final int a;

    public SelectedListAddItemData(int i) {
        this.a = i;
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
        if (obj instanceof SelectedListAddItemData) {
            return this.a == ((SelectedListAddItemData) obj).a;
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "SelectedListAddData";
    }

    public final int hashCode() {
        return this.a;
    }
}
