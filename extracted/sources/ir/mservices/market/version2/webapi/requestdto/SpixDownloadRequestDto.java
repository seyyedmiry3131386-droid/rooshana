package ir.mservices.market.version2.webapi.requestdto;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t61;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixDownloadRequestDto implements RequestDTO, Serializable {
    private final String downloadedMd5;
    private final String externalStorage;
    private final Long fileSize;
    private final String fileType;
    private final Boolean forceUpdate;
    private final String host;
    private final Integer installedVersionCode;
    private final String internalStorage;
    private final String ip;
    private final Long localSize;
    private final String message;
    private final Long neneInsertTs;
    private final String packageName;
    private final String patchError;
    private final String refId;
    private final String serverMd5;
    private final Long serverSize;
    private final String type;
    private final String url;
    private final Integer versionCode;

    public SpixDownloadRequestDto(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, Boolean bool, String str7, String str8, String str9, Long l3, String str10, Long l4, String str11, String str12, String str13) {
        js3.p(str2, "fileType");
        js3.p(str3, "type");
        this.packageName = str;
        this.versionCode = num;
        this.installedVersionCode = num2;
        this.fileType = str2;
        this.type = str3;
        this.url = str4;
        this.host = str5;
        this.ip = str6;
        this.localSize = l;
        this.serverSize = l2;
        this.forceUpdate = bool;
        this.message = str7;
        this.downloadedMd5 = str8;
        this.patchError = str9;
        this.fileSize = l3;
        this.refId = str10;
        this.neneInsertTs = l4;
        this.serverMd5 = str11;
        this.internalStorage = str12;
        this.externalStorage = str13;
    }

    public static /* synthetic */ SpixDownloadRequestDto copy$default(SpixDownloadRequestDto spixDownloadRequestDto, String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, Boolean bool, String str7, String str8, String str9, Long l3, String str10, Long l4, String str11, String str12, String str13, int i, Object obj) {
        String str14;
        String str15;
        String str16 = (i & 1) != 0 ? spixDownloadRequestDto.packageName : str;
        Integer num3 = (i & 2) != 0 ? spixDownloadRequestDto.versionCode : num;
        Integer num4 = (i & 4) != 0 ? spixDownloadRequestDto.installedVersionCode : num2;
        String str17 = (i & 8) != 0 ? spixDownloadRequestDto.fileType : str2;
        String str18 = (i & 16) != 0 ? spixDownloadRequestDto.type : str3;
        String str19 = (i & 32) != 0 ? spixDownloadRequestDto.url : str4;
        String str20 = (i & 64) != 0 ? spixDownloadRequestDto.host : str5;
        String str21 = (i & 128) != 0 ? spixDownloadRequestDto.ip : str6;
        Long l5 = (i & 256) != 0 ? spixDownloadRequestDto.localSize : l;
        Long l6 = (i & 512) != 0 ? spixDownloadRequestDto.serverSize : l2;
        Boolean bool2 = (i & 1024) != 0 ? spixDownloadRequestDto.forceUpdate : bool;
        String str22 = (i & 2048) != 0 ? spixDownloadRequestDto.message : str7;
        String str23 = (i & 4096) != 0 ? spixDownloadRequestDto.downloadedMd5 : str8;
        String str24 = (i & 8192) != 0 ? spixDownloadRequestDto.patchError : str9;
        String str25 = str16;
        Long l7 = (i & 16384) != 0 ? spixDownloadRequestDto.fileSize : l3;
        String str26 = (i & 32768) != 0 ? spixDownloadRequestDto.refId : str10;
        Long l8 = (i & 65536) != 0 ? spixDownloadRequestDto.neneInsertTs : l4;
        String str27 = (i & 131072) != 0 ? spixDownloadRequestDto.serverMd5 : str11;
        String str28 = (i & 262144) != 0 ? spixDownloadRequestDto.internalStorage : str12;
        if ((i & 524288) != 0) {
            str15 = str28;
            str14 = spixDownloadRequestDto.externalStorage;
        } else {
            str14 = str13;
            str15 = str28;
        }
        return spixDownloadRequestDto.copy(str25, num3, num4, str17, str18, str19, str20, str21, l5, l6, bool2, str22, str23, str24, l7, str26, l8, str27, str15, str14);
    }

    public final String component1() {
        return this.packageName;
    }

    public final Long component10() {
        return this.serverSize;
    }

    public final Boolean component11() {
        return this.forceUpdate;
    }

    public final String component12() {
        return this.message;
    }

    public final String component13() {
        return this.downloadedMd5;
    }

    public final String component14() {
        return this.patchError;
    }

    public final Long component15() {
        return this.fileSize;
    }

    public final String component16() {
        return this.refId;
    }

    public final Long component17() {
        return this.neneInsertTs;
    }

    public final String component18() {
        return this.serverMd5;
    }

    public final String component19() {
        return this.internalStorage;
    }

    public final Integer component2() {
        return this.versionCode;
    }

    public final String component20() {
        return this.externalStorage;
    }

    public final Integer component3() {
        return this.installedVersionCode;
    }

    public final String component4() {
        return this.fileType;
    }

    public final String component5() {
        return this.type;
    }

    public final String component6() {
        return this.url;
    }

    public final String component7() {
        return this.host;
    }

    public final String component8() {
        return this.ip;
    }

    public final Long component9() {
        return this.localSize;
    }

    public final SpixDownloadRequestDto copy(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Long l, Long l2, Boolean bool, String str7, String str8, String str9, Long l3, String str10, Long l4, String str11, String str12, String str13) {
        js3.p(str2, "fileType");
        js3.p(str3, "type");
        return new SpixDownloadRequestDto(str, num, num2, str2, str3, str4, str5, str6, l, l2, bool, str7, str8, str9, l3, str10, l4, str11, str12, str13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpixDownloadRequestDto)) {
            return false;
        }
        SpixDownloadRequestDto spixDownloadRequestDto = (SpixDownloadRequestDto) obj;
        return js3.i(this.packageName, spixDownloadRequestDto.packageName) && js3.i(this.versionCode, spixDownloadRequestDto.versionCode) && js3.i(this.installedVersionCode, spixDownloadRequestDto.installedVersionCode) && js3.i(this.fileType, spixDownloadRequestDto.fileType) && js3.i(this.type, spixDownloadRequestDto.type) && js3.i(this.url, spixDownloadRequestDto.url) && js3.i(this.host, spixDownloadRequestDto.host) && js3.i(this.ip, spixDownloadRequestDto.ip) && js3.i(this.localSize, spixDownloadRequestDto.localSize) && js3.i(this.serverSize, spixDownloadRequestDto.serverSize) && js3.i(this.forceUpdate, spixDownloadRequestDto.forceUpdate) && js3.i(this.message, spixDownloadRequestDto.message) && js3.i(this.downloadedMd5, spixDownloadRequestDto.downloadedMd5) && js3.i(this.patchError, spixDownloadRequestDto.patchError) && js3.i(this.fileSize, spixDownloadRequestDto.fileSize) && js3.i(this.refId, spixDownloadRequestDto.refId) && js3.i(this.neneInsertTs, spixDownloadRequestDto.neneInsertTs) && js3.i(this.serverMd5, spixDownloadRequestDto.serverMd5) && js3.i(this.internalStorage, spixDownloadRequestDto.internalStorage) && js3.i(this.externalStorage, spixDownloadRequestDto.externalStorage);
    }

    public final String getDownloadedMd5() {
        return this.downloadedMd5;
    }

    public final String getExternalStorage() {
        return this.externalStorage;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final String getFileType() {
        return this.fileType;
    }

    public final Boolean getForceUpdate() {
        return this.forceUpdate;
    }

    public final String getHost() {
        return this.host;
    }

    public final Integer getInstalledVersionCode() {
        return this.installedVersionCode;
    }

    public final String getInternalStorage() {
        return this.internalStorage;
    }

    public final String getIp() {
        return this.ip;
    }

    public final Long getLocalSize() {
        return this.localSize;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Long getNeneInsertTs() {
        return this.neneInsertTs;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPatchError() {
        return this.patchError;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final String getServerMd5() {
        return this.serverMd5;
    }

    public final Long getServerSize() {
        return this.serverSize;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Integer getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        String str = this.packageName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.versionCode;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.installedVersionCode;
        int iK = rm7.k(this.type, rm7.k(this.fileType, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31), 31);
        String str2 = this.url;
        int iHashCode3 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.host;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.ip;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.localSize;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.serverSize;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.forceUpdate;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.message;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.downloadedMd5;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.patchError;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Long l3 = this.fileSize;
        int iHashCode12 = (iHashCode11 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str8 = this.refId;
        int iHashCode13 = (iHashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Long l4 = this.neneInsertTs;
        int iHashCode14 = (iHashCode13 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str9 = this.serverMd5;
        int iHashCode15 = (iHashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.internalStorage;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.externalStorage;
        return iHashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public String toString() {
        String str = this.packageName;
        Integer num = this.versionCode;
        Integer num2 = this.installedVersionCode;
        String str2 = this.fileType;
        String str3 = this.type;
        String str4 = this.url;
        String str5 = this.host;
        String str6 = this.ip;
        Long l = this.localSize;
        Long l2 = this.serverSize;
        Boolean bool = this.forceUpdate;
        String str7 = this.message;
        String str8 = this.downloadedMd5;
        String str9 = this.patchError;
        Long l3 = this.fileSize;
        String str10 = this.refId;
        Long l4 = this.neneInsertTs;
        String str11 = this.serverMd5;
        String str12 = this.internalStorage;
        String str13 = this.externalStorage;
        StringBuilder sb = new StringBuilder("SpixDownloadRequestDto(packageName=");
        sb.append(str);
        sb.append(", versionCode=");
        sb.append(num);
        sb.append(", installedVersionCode=");
        sb.append(num2);
        sb.append(", fileType=");
        sb.append(str2);
        sb.append(", type=");
        o40.I(str3, ", url=", str4, ", host=", sb);
        o40.I(str5, ", ip=", str6, ", localSize=", sb);
        sb.append(l);
        sb.append(", serverSize=");
        sb.append(l2);
        sb.append(", forceUpdate=");
        t61.x(sb, bool, ", message=", str7, ", downloadedMd5=");
        o40.I(str8, ", patchError=", str9, ", fileSize=", sb);
        sb.append(l3);
        sb.append(", refId=");
        sb.append(str10);
        sb.append(", neneInsertTs=");
        sb.append(l4);
        sb.append(", serverMd5=");
        sb.append(str11);
        sb.append(", internalStorage=");
        return dw1.p(str12, ", externalStorage=", str13, ")", sb);
    }
}
