package ir.mservices.market.movie.ui.common;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.reels.data.ReelHomeDto;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHomeReelData implements MyketRecyclerData, g32 {
    public static final int b = js6.reel_card;
    public final ReelHomeDto a;

    public MovieHomeReelData(ReelHomeDto reelHomeDto) {
        js3.p(reelHomeDto, "reelDto");
        this.a = reelHomeDto;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!MovieHomeReelData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.ui.common.MovieHomeReelData");
        return js3.i(this.a, ((MovieHomeReelData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getReelId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
