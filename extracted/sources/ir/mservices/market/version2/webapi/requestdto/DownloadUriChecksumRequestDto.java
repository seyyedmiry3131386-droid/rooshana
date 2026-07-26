package ir.mservices.market.version2.webapi.requestdto;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadUriChecksumRequestDto implements RequestDTO, Serializable {

    @vo7("checksum")
    private final String checksum;

    @vo7("fileLength")
    private final long fileLength;

    @vo7(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    public DownloadUriChecksumRequestDto(String str, String str2, long j) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.name = str;
        this.checksum = str2;
        this.fileLength = j;
    }

    public final String getChecksum() {
        return this.checksum;
    }

    public final long getFileLength() {
        return this.fileLength;
    }

    public final String getName() {
        return this.name;
    }
}
