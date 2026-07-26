package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class LocalMessageBoxData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.local_message_box;
    public final int a;
    public final int b;
    public final int c;

    public LocalMessageBoxData(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
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
        if (!(obj instanceof LocalMessageBoxData)) {
            return false;
        }
        LocalMessageBoxData localMessageBoxData = (LocalMessageBoxData) obj;
        return this.a == localMessageBoxData.a && this.b == localMessageBoxData.b && this.c == localMessageBoxData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
