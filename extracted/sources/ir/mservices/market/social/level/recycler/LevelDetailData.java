package ir.mservices.market.social.level.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.level.data.XpDetailDto;

/* JADX INFO: loaded from: classes3.dex */
public final class LevelDetailData implements MyketRecyclerData, g32 {
    public static final int b = js6.level_detail;
    public final XpDetailDto a;

    public LevelDetailData(XpDetailDto xpDetailDto) {
        this.a = xpDetailDto;
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
        if (obj instanceof LevelDetailData) {
            return js3.i(this.a, ((LevelDetailData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.a.hashCode());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
