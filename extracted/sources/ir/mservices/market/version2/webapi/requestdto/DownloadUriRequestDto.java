package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadUriRequestDto implements RequestDTO, Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("baseFile")
    private final DownloadUriChecksumRequestDto baseFile;

    @vo7("currentInstall")
    private final String currentInstall;

    @vo7("currentVersion")
    private final Integer currentVersion;

    @vo7("deviceModel")
    private final String deviceModel;

    @vo7("fileType")
    private final String fileType;

    @vo7("forceUpdate")
    private final boolean forceUpdate;

    @vo7("mainDataFile")
    private final DownloadUriChecksumRequestDto mainDataFile;

    @vo7("manufacturer")
    private final String manufacturer;

    @vo7("packageInstaller")
    private final boolean packageInstaller;

    @vo7("patchDataFile")
    private final DownloadUriChecksumRequestDto patchDataFile;

    @vo7("refId")
    private final String refId;

    @vo7("requestedVersion")
    private final int requestedVersion;

    @vo7("signHash")
    private final String signHash;

    @vo7("splits")
    private final List<DownloadUriChecksumRequestDto> splits;

    public DownloadUriRequestDto(int i, Integer num, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto2, DownloadUriChecksumRequestDto downloadUriChecksumRequestDto3, String str, String str2, String str3, String str4, boolean z, String str5, List<DownloadUriChecksumRequestDto> list, boolean z2, String str6, String str7) {
        js3.p(str, PackageListMetaDataDTO.KEY_ACTION);
        js3.p(str2, "fileType");
        js3.p(str4, "currentInstall");
        this.requestedVersion = i;
        this.currentVersion = num;
        this.baseFile = downloadUriChecksumRequestDto;
        this.mainDataFile = downloadUriChecksumRequestDto2;
        this.patchDataFile = downloadUriChecksumRequestDto3;
        this.action = str;
        this.fileType = str2;
        this.refId = str3;
        this.currentInstall = str4;
        this.forceUpdate = z;
        this.signHash = str5;
        this.splits = list;
        this.packageInstaller = z2;
        this.deviceModel = str6;
        this.manufacturer = str7;
    }

    public final String getAction() {
        return this.action;
    }

    public final DownloadUriChecksumRequestDto getBaseFile() {
        return this.baseFile;
    }

    public final String getCurrentInstall() {
        return this.currentInstall;
    }

    public final Integer getCurrentVersion() {
        return this.currentVersion;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final DownloadUriChecksumRequestDto getMainDataFile() {
        return this.mainDataFile;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final boolean getPackageInstaller() {
        return this.packageInstaller;
    }

    public final DownloadUriChecksumRequestDto getPatchDataFile() {
        return this.patchDataFile;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final int getRequestedVersion() {
        return this.requestedVersion;
    }

    public final String getSignHash() {
        return this.signHash;
    }

    public final List<DownloadUriChecksumRequestDto> getSplits() {
        return this.splits;
    }
}
