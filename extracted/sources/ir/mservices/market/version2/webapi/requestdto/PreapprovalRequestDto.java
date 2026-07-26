package ir.mservices.market.version2.webapi.requestdto;

import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class PreapprovalRequestDto implements RequestDTO {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("currentVersion")
    private final Integer currentVersion;

    @vo7("packageInstaller")
    private final boolean packageInstaller;

    @vo7("refId")
    private final String refId;

    @vo7("requestedVersion")
    private final int requestedVersion;

    public PreapprovalRequestDto(int i, Integer num, String str, String str2, boolean z) {
        this.requestedVersion = i;
        this.currentVersion = num;
        this.refId = str;
        this.action = str2;
        this.packageInstaller = z;
    }

    public final String getAction() {
        return this.action;
    }

    public final Integer getCurrentVersion() {
        return this.currentVersion;
    }

    public final boolean getPackageInstaller() {
        return this.packageInstaller;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final int getRequestedVersion() {
        return this.requestedVersion;
    }
}
