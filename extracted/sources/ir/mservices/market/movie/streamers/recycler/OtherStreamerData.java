package ir.mservices.market.movie.streamers.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.movie.streamers.data.StreamerDto;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherStreamerData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_other_streamer;
    public final StreamerDto a;

    public OtherStreamerData(StreamerDto streamerDto) {
        js3.p(streamerDto, "streamerDto");
        this.a = streamerDto;
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
        if (obj instanceof OtherStreamerData) {
            return js3.i(this.a, ((OtherStreamerData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.a.getId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
