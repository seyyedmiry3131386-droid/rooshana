package ir.mservices.market.reels.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsDto implements bf5, Serializable {

    @vo7("analyticsEvent")
    private final AnalyticsEventDto analyticsEvent;

    @vo7("eol")
    private final boolean eol;

    @vo7("hintText")
    private final String hintText;

    @vo7("elements")
    private final List<ReelItemDto> items;

    public ReelsDto(AnalyticsEventDto analyticsEventDto, boolean z, String str, List<ReelItemDto> list) {
        js3.p(list, "items");
        this.analyticsEvent = analyticsEventDto;
        this.eol = z;
        this.hintText = str;
        this.items = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReelsDto copy$default(ReelsDto reelsDto, AnalyticsEventDto analyticsEventDto, boolean z, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            analyticsEventDto = reelsDto.analyticsEvent;
        }
        if ((i & 2) != 0) {
            z = reelsDto.eol;
        }
        if ((i & 4) != 0) {
            str = reelsDto.hintText;
        }
        if ((i & 8) != 0) {
            list = reelsDto.items;
        }
        return reelsDto.copy(analyticsEventDto, z, str, list);
    }

    public final AnalyticsEventDto component1() {
        return this.analyticsEvent;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final String component3() {
        return this.hintText;
    }

    public final List<ReelItemDto> component4() {
        return this.items;
    }

    public final ReelsDto copy(AnalyticsEventDto analyticsEventDto, boolean z, String str, List<ReelItemDto> list) {
        js3.p(list, "items");
        return new ReelsDto(analyticsEventDto, z, str, list);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelsDto)) {
            return false;
        }
        ReelsDto reelsDto = (ReelsDto) obj;
        return js3.i(this.analyticsEvent, reelsDto.analyticsEvent) && this.eol == reelsDto.eol && js3.i(this.hintText, reelsDto.hintText) && js3.i(this.items, reelsDto.items);
    }

    public final AnalyticsEventDto getAnalyticsEvent() {
        return this.analyticsEvent;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final String getHintText() {
        return this.hintText;
    }

    public final List<ReelItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        AnalyticsEventDto analyticsEventDto = this.analyticsEvent;
        int iHashCode = (((analyticsEventDto == null ? 0 : analyticsEventDto.hashCode()) * 31) + (this.eol ? 1231 : 1237)) * 31;
        String str = this.hintText;
        return this.items.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ReelsDto(analyticsEvent=" + this.analyticsEvent + ", eol=" + this.eol + ", hintText=" + this.hintText + ", items=" + this.items + ")";
    }
}
