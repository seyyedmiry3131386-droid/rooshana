package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryDto implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_ICON = "Icon";
    public static final String TYPE_RATE = "Rate";
    public static final String TYPE_SIZE = "Size";
    public static final String TYPE_TEXT = "Text";

    @vo7("icon")
    private final SummaryIconDto icon;

    @vo7("rate")
    private final SummaryRateDto rate;

    @vo7("size")
    private final SummarySizeDto size;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final SummaryTextDto text;

    @vo7("type")
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public SummaryDto(String str, SummaryIconDto summaryIconDto, SummaryTextDto summaryTextDto, SummaryRateDto summaryRateDto, SummarySizeDto summarySizeDto) {
        this.type = str;
        this.icon = summaryIconDto;
        this.text = summaryTextDto;
        this.rate = summaryRateDto;
        this.size = summarySizeDto;
    }

    public static /* synthetic */ SummaryDto copy$default(SummaryDto summaryDto, String str, SummaryIconDto summaryIconDto, SummaryTextDto summaryTextDto, SummaryRateDto summaryRateDto, SummarySizeDto summarySizeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryDto.type;
        }
        if ((i & 2) != 0) {
            summaryIconDto = summaryDto.icon;
        }
        if ((i & 4) != 0) {
            summaryTextDto = summaryDto.text;
        }
        if ((i & 8) != 0) {
            summaryRateDto = summaryDto.rate;
        }
        if ((i & 16) != 0) {
            summarySizeDto = summaryDto.size;
        }
        SummarySizeDto summarySizeDto2 = summarySizeDto;
        SummaryTextDto summaryTextDto2 = summaryTextDto;
        return summaryDto.copy(str, summaryIconDto, summaryTextDto2, summaryRateDto, summarySizeDto2);
    }

    public final String component1() {
        return this.type;
    }

    public final SummaryIconDto component2() {
        return this.icon;
    }

    public final SummaryTextDto component3() {
        return this.text;
    }

    public final SummaryRateDto component4() {
        return this.rate;
    }

    public final SummarySizeDto component5() {
        return this.size;
    }

    public final SummaryDto copy(String str, SummaryIconDto summaryIconDto, SummaryTextDto summaryTextDto, SummaryRateDto summaryRateDto, SummarySizeDto summarySizeDto) {
        return new SummaryDto(str, summaryIconDto, summaryTextDto, summaryRateDto, summarySizeDto);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SummaryDto)) {
            return false;
        }
        SummaryDto summaryDto = (SummaryDto) obj;
        return js3.i(this.type, summaryDto.type) && js3.i(this.icon, summaryDto.icon) && js3.i(this.text, summaryDto.text) && js3.i(this.rate, summaryDto.rate) && js3.i(this.size, summaryDto.size);
    }

    public final SummaryIconDto getIcon() {
        return this.icon;
    }

    public final SummaryRateDto getRate() {
        return this.rate;
    }

    public final SummarySizeDto getSize() {
        return this.size;
    }

    public final SummaryTextDto getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        SummaryIconDto summaryIconDto = this.icon;
        int iHashCode2 = (iHashCode + (summaryIconDto == null ? 0 : summaryIconDto.hashCode())) * 31;
        SummaryTextDto summaryTextDto = this.text;
        int iHashCode3 = (iHashCode2 + (summaryTextDto == null ? 0 : summaryTextDto.hashCode())) * 31;
        SummaryRateDto summaryRateDto = this.rate;
        int iHashCode4 = (iHashCode3 + (summaryRateDto == null ? 0 : summaryRateDto.hashCode())) * 31;
        SummarySizeDto summarySizeDto = this.size;
        return iHashCode4 + (summarySizeDto != null ? summarySizeDto.hashCode() : 0);
    }

    public String toString() {
        return "SummaryDto(type=" + this.type + ", icon=" + this.icon + ", text=" + this.text + ", rate=" + this.rate + ", size=" + this.size + ")";
    }
}
