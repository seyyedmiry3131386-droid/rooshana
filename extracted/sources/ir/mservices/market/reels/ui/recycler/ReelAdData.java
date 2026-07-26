package ir.mservices.market.reels.ui.recycler;

import defpackage.js3;
import defpackage.js6;
import defpackage.v48;
import ir.mservices.market.reels.data.ReelAdDto;
import ir.mservices.market.reels.data.ReelAdType;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelAdData implements BaseReelData {
    public static final int e = js6.reel_ad_item;
    public final v48 a;
    public final ReelAdDto b;
    public boolean c;
    public final ReelAdType d;

    public ReelAdData(l lVar, ReelAdDto reelAdDto, ReelAdType reelAdType) {
        js3.p(lVar, "muteFlow");
        js3.p(reelAdType, "adType");
        this.a = lVar;
        this.b = reelAdDto;
        this.c = false;
        this.d = reelAdType;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return e;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ReelAdData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.reels.ui.recycler.ReelAdData");
        ReelAdData reelAdData = (ReelAdData) obj;
        return js3.i(this.b, reelAdData.b) && this.c == reelAdData.c && this.d == reelAdData.d;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b.getContent().getUrl();
    }

    public final int hashCode() {
        return this.d.hashCode() + (((((this.b.hashCode() * 31) + (((Boolean) this.a.getValue()).booleanValue() ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        return "ReelAdData(muteFlow=" + this.a + ", reelAd=" + this.b + ", isLiked=" + this.c + ", adType=" + this.d + ")";
    }
}
