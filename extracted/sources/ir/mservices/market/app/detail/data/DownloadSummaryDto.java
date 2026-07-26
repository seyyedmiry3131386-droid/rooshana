package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadSummaryDto implements Serializable {

    @vo7("backgroundColor")
    private final String backgroundColor;

    @vo7("count")
    private final String count;

    @vo7("foregroundColor")
    private final String foregroundColor;

    @vo7("unitText")
    private final String unitText;

    public DownloadSummaryDto(String str, String str2, String str3, String str4) {
        this.foregroundColor = str;
        this.backgroundColor = str2;
        this.unitText = str3;
        this.count = str4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && DownloadSummaryDto.class.equals(obj.getClass())) {
            DownloadSummaryDto downloadSummaryDto = (DownloadSummaryDto) obj;
            if (js3.i(this.unitText, downloadSummaryDto.unitText) && js3.i(this.count, downloadSummaryDto.count)) {
                return true;
            }
        }
        return false;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getCount() {
        return this.count;
    }

    public final String getForegroundColor() {
        return this.foregroundColor;
    }

    public final String getUnitText() {
        return this.unitText;
    }

    public int hashCode() {
        return Objects.hash(this.unitText, this.count);
    }
}
