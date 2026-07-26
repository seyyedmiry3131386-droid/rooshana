package ir.mservices.market.virtualKeyboard.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class VirtualKeyboardRemoveData implements MyketRecyclerData, g32 {
    public static final int a = js6.virtual_keyboard_remove;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof VirtualKeyboardRemoveData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(VirtualKeyboardRemoveData.class.hashCode());
    }

    public final int hashCode() {
        return VirtualKeyboardRemoveData.class.hashCode();
    }
}
