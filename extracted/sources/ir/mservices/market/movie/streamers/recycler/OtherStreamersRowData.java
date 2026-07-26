package ir.mservices.market.movie.streamers.recycler;

import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherStreamersRowData extends NestedRecyclerData implements g32, wo2 {
    public static final int i = js6.holder_other_streamer_row;
    public final bz6 g;
    public final String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtherStreamersRowData(bz6 bz6Var, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "recyclerData");
        this.g = bz6Var;
        long j = is3.p + 1;
        is3.p = j;
        this.h = String.valueOf(j);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OtherStreamersRowData)) {
            return false;
        }
        OtherStreamersRowData otherStreamersRowData = (OtherStreamersRowData) obj;
        return js3.i(this.g, otherStreamersRowData.g) && js3.i(this.h, otherStreamersRowData.h);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }
}
