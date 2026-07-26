package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.o40;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryTitleDto implements Serializable {

    @vo7("title")
    private final String title;

    public SummaryTitleDto(String str) {
        this.title = str;
    }

    public static /* synthetic */ SummaryTitleDto copy$default(SummaryTitleDto summaryTitleDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = summaryTitleDto.title;
        }
        return summaryTitleDto.copy(str);
    }

    public final String component1() {
        return this.title;
    }

    public final SummaryTitleDto copy(String str) {
        return new SummaryTitleDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SummaryTitleDto) && js3.i(this.title, ((SummaryTitleDto) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return o40.y("SummaryTitleDto(title=", this.title, ")");
    }
}
