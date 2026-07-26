package ir.mservices.market.reels.home.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.reels.data.ReelHomeDto;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelHomeData implements MyketRecyclerData, g32 {
    public static final int c = js6.reels_home_item_square;
    public static final int d = js6.reels_home_item_rectangle;
    public final ReelHomeDto a;
    public final boolean b;

    public ReelHomeData(ReelHomeDto reelHomeDto, boolean z) {
        js3.p(reelHomeDto, "reelHomeDto");
        this.a = reelHomeDto;
        this.b = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return this.b ? c : d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReelHomeData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.reels.home.ui.recycler.ReelHomeData");
        ReelHomeData reelHomeData = (ReelHomeData) obj;
        return js3.i(this.a, reelHomeData.a) && this.b == reelHomeData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getReelId();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "ReelHomeData(reelHomeDto=" + this.a + ", isSquare=" + this.b + ")";
    }
}
