package ir.mservices.market.movie.streamers.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherStreamersMoreData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.holder_more_streamers;
    public final boolean a;

    public OtherStreamersMoreData(boolean z) {
        this.a = z;
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
        if (obj instanceof OtherStreamersMoreData) {
            return this.a == ((OtherStreamersMoreData) obj).a;
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "OtherStreamersMoreData";
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }
}
