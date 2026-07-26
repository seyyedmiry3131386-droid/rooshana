package ir.mservices.market.pika.connect.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaSelectDeviceTitleData implements MyketRecyclerData, g32 {
    public static final int a = js6.pika_select_device_title_holder;

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
        return PikaSelectDeviceTitleData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "PikaSelectDeviceTitleData";
    }

    public final int hashCode() {
        return -648051231;
    }
}
