package ir.mservices.market.virtualKeyboard.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class VirtualKeyboardItemData implements MyketRecyclerData, g32 {
    public static final int c = js6.virtual_keyboard_item;
    public final String a;
    public final int b;

    public VirtualKeyboardItemData(String str, int i) {
        js3.p(str, "item");
        this.a = str;
        this.b = i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VirtualKeyboardItemData)) {
            return false;
        }
        VirtualKeyboardItemData virtualKeyboardItemData = (VirtualKeyboardItemData) obj;
        return js3.i(this.a, virtualKeyboardItemData.a) && this.b == virtualKeyboardItemData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
