package ir.mservices.market.movie.data.webapi;

import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummariesDto implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String TYPE_ICON = "Icon";
    public static final String TYPE_TEXT = "Text";

    @vo7("icon")
    private final SummaryIconDto icon;

    @vo7(ConfirmDTO.INPUT_TYPE_TEXT)
    private final SummaryTitleDto text;

    @vo7("type")
    private final String type;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public SummariesDto(String str, SummaryTitleDto summaryTitleDto, SummaryIconDto summaryIconDto) {
        this.type = str;
        this.text = summaryTitleDto;
        this.icon = summaryIconDto;
    }

    public final SummaryIconDto getIcon() {
        return this.icon;
    }

    public final SummaryTitleDto getText() {
        return this.text;
    }

    public final String getType() {
        return this.type;
    }
}
