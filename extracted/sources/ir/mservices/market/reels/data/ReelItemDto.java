package ir.mservices.market.reels.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelItemDto implements Serializable {

    @vo7("ads")
    private final ReelAdDto ads;

    @vo7("reel")
    private final ReelDto reel;

    @vo7("type")
    private final String type;

    public ReelItemDto(String str, ReelDto reelDto, ReelAdDto reelAdDto) {
        js3.p(str, "type");
        this.type = str;
        this.reel = reelDto;
        this.ads = reelAdDto;
    }

    public static /* synthetic */ ReelItemDto copy$default(ReelItemDto reelItemDto, String str, ReelDto reelDto, ReelAdDto reelAdDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reelItemDto.type;
        }
        if ((i & 2) != 0) {
            reelDto = reelItemDto.reel;
        }
        if ((i & 4) != 0) {
            reelAdDto = reelItemDto.ads;
        }
        return reelItemDto.copy(str, reelDto, reelAdDto);
    }

    public final String component1() {
        return this.type;
    }

    public final ReelDto component2() {
        return this.reel;
    }

    public final ReelAdDto component3() {
        return this.ads;
    }

    public final ReelItemDto copy(String str, ReelDto reelDto, ReelAdDto reelAdDto) {
        js3.p(str, "type");
        return new ReelItemDto(str, reelDto, reelAdDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelItemDto)) {
            return false;
        }
        ReelItemDto reelItemDto = (ReelItemDto) obj;
        return js3.i(this.type, reelItemDto.type) && js3.i(this.reel, reelItemDto.reel) && js3.i(this.ads, reelItemDto.ads);
    }

    public final ReelAdDto getAds() {
        return this.ads;
    }

    public final ReelDto getReel() {
        return this.reel;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        ReelDto reelDto = this.reel;
        int iHashCode2 = (iHashCode + (reelDto == null ? 0 : reelDto.hashCode())) * 31;
        ReelAdDto reelAdDto = this.ads;
        return iHashCode2 + (reelAdDto != null ? reelAdDto.hashCode() : 0);
    }

    public String toString() {
        return "ReelItemDto(type=" + this.type + ", reel=" + this.reel + ", ads=" + this.ads + ")";
    }
}
