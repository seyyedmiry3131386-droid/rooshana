package ir.mservices.market.common.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.DownloadSummaryDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class DownloadSummeryApplicationDto extends ApplicationDTO implements Serializable {

    @vo7("downloadSummary")
    private final DownloadSummaryDto downloadSummary;

    public DownloadSummeryApplicationDto(DownloadSummaryDto downloadSummaryDto) {
        this.downloadSummary = downloadSummaryDto;
    }

    @Override // ir.mservices.market.version2.webapi.responsedto.ApplicationDTO
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return js3.i(this.downloadSummary, ((DownloadSummeryApplicationDto) obj).downloadSummary);
    }

    public final DownloadSummaryDto getDownloadSummary() {
        return this.downloadSummary;
    }

    @Override // ir.mservices.market.version2.webapi.responsedto.ApplicationDTO
    public int hashCode() {
        return getPackageName().hashCode();
    }
}
