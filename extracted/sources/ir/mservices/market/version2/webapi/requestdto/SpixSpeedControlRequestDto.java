package ir.mservices.market.version2.webapi.requestdto;

import defpackage.b88;
import defpackage.js3;
import defpackage.no7;
import defpackage.o40;
import defpackage.px3;
import defpackage.rm7;
import defpackage.so7;
import defpackage.to7;
import defpackage.uz0;
import defpackage.vo7;
import defpackage.wq2;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
@so7
public final class SpixSpeedControlRequestDto implements RequestDTO {
    public static final Companion Companion = new Companion(null);

    @vo7("downloadKey")
    private final String downloadKey;

    @vo7("downloadType")
    private final String downloadType;

    @vo7("endDetailStatus")
    private final String endDetailStatus;

    @vo7("endStatus")
    private final String endStatus;

    @vo7("hostName")
    private final String hostName;

    @vo7("isHot")
    private final boolean isHot;

    @vo7("localSize")
    private final long localSize;

    @vo7("neneInsertTs")
    private final long neneInsertTs;

    @vo7("serverSize")
    private final long serverSize;

    @vo7("startDetailStatus")
    private final String startDetailStatus;

    @vo7("startStatus")
    private final String startStatus;

    @vo7("timestamp")
    private final long timestamp;

    @vo7("url")
    private final String url;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final px3 serializer() {
            return SpixSpeedControlRequestDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SpixSpeedControlRequestDto(int i, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, boolean z, long j4, to7 to7Var) {
        if (8191 != (i & 8191)) {
            wq2.S(i, 8191, SpixSpeedControlRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.downloadKey = str;
        this.hostName = str2;
        this.timestamp = j;
        this.localSize = j2;
        this.startStatus = str3;
        this.startDetailStatus = str4;
        this.endStatus = str5;
        this.endDetailStatus = str6;
        this.downloadType = str7;
        this.serverSize = j3;
        this.url = str8;
        this.isHot = z;
        this.neneInsertTs = j4;
    }

    public static /* synthetic */ SpixSpeedControlRequestDto copy$default(SpixSpeedControlRequestDto spixSpeedControlRequestDto, String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, boolean z, long j4, int i, Object obj) {
        long j5;
        boolean z2;
        String str9;
        SpixSpeedControlRequestDto spixSpeedControlRequestDto2;
        String str10;
        long j6;
        long j7;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        long j8;
        String str16;
        String str17 = (i & 1) != 0 ? spixSpeedControlRequestDto.downloadKey : str;
        String str18 = (i & 2) != 0 ? spixSpeedControlRequestDto.hostName : str2;
        long j9 = (i & 4) != 0 ? spixSpeedControlRequestDto.timestamp : j;
        long j10 = (i & 8) != 0 ? spixSpeedControlRequestDto.localSize : j2;
        String str19 = (i & 16) != 0 ? spixSpeedControlRequestDto.startStatus : str3;
        String str20 = (i & 32) != 0 ? spixSpeedControlRequestDto.startDetailStatus : str4;
        String str21 = (i & 64) != 0 ? spixSpeedControlRequestDto.endStatus : str5;
        String str22 = (i & 128) != 0 ? spixSpeedControlRequestDto.endDetailStatus : str6;
        String str23 = (i & 256) != 0 ? spixSpeedControlRequestDto.downloadType : str7;
        long j11 = (i & 512) != 0 ? spixSpeedControlRequestDto.serverSize : j3;
        String str24 = (i & 1024) != 0 ? spixSpeedControlRequestDto.url : str8;
        String str25 = str17;
        boolean z3 = (i & 2048) != 0 ? spixSpeedControlRequestDto.isHot : z;
        if ((i & 4096) != 0) {
            z2 = z3;
            j5 = spixSpeedControlRequestDto.neneInsertTs;
            str10 = str18;
            j6 = j9;
            j7 = j10;
            str11 = str19;
            str12 = str20;
            str13 = str21;
            str14 = str22;
            str15 = str23;
            j8 = j11;
            str16 = str24;
            str9 = str25;
            spixSpeedControlRequestDto2 = spixSpeedControlRequestDto;
        } else {
            j5 = j4;
            z2 = z3;
            str9 = str25;
            spixSpeedControlRequestDto2 = spixSpeedControlRequestDto;
            str10 = str18;
            j6 = j9;
            j7 = j10;
            str11 = str19;
            str12 = str20;
            str13 = str21;
            str14 = str22;
            str15 = str23;
            j8 = j11;
            str16 = str24;
        }
        return spixSpeedControlRequestDto2.copy(str9, str10, j6, j7, str11, str12, str13, str14, str15, j8, str16, z2, j5);
    }

    public static final /* synthetic */ void write$Self$MyKet_primaryClientProductMyketRelease(SpixSpeedControlRequestDto spixSpeedControlRequestDto, uz0 uz0Var, no7 no7Var) {
        uz0Var.w(no7Var, 0, spixSpeedControlRequestDto.downloadKey);
        uz0Var.w(no7Var, 1, spixSpeedControlRequestDto.hostName);
        uz0Var.j(no7Var, 2, spixSpeedControlRequestDto.timestamp);
        uz0Var.j(no7Var, 3, spixSpeedControlRequestDto.localSize);
        uz0Var.w(no7Var, 4, spixSpeedControlRequestDto.startStatus);
        b88 b88Var = b88.a;
        uz0Var.z(no7Var, 5, b88Var, spixSpeedControlRequestDto.startDetailStatus);
        uz0Var.w(no7Var, 6, spixSpeedControlRequestDto.endStatus);
        uz0Var.z(no7Var, 7, b88Var, spixSpeedControlRequestDto.endDetailStatus);
        uz0Var.w(no7Var, 8, spixSpeedControlRequestDto.downloadType);
        uz0Var.j(no7Var, 9, spixSpeedControlRequestDto.serverSize);
        uz0Var.w(no7Var, 10, spixSpeedControlRequestDto.url);
        uz0Var.n(no7Var, 11, spixSpeedControlRequestDto.isHot);
        uz0Var.j(no7Var, 12, spixSpeedControlRequestDto.neneInsertTs);
    }

    public final String component1() {
        return this.downloadKey;
    }

    public final long component10() {
        return this.serverSize;
    }

    public final String component11() {
        return this.url;
    }

    public final boolean component12() {
        return this.isHot;
    }

    public final long component13() {
        return this.neneInsertTs;
    }

    public final String component2() {
        return this.hostName;
    }

    public final long component3() {
        return this.timestamp;
    }

    public final long component4() {
        return this.localSize;
    }

    public final String component5() {
        return this.startStatus;
    }

    public final String component6() {
        return this.startDetailStatus;
    }

    public final String component7() {
        return this.endStatus;
    }

    public final String component8() {
        return this.endDetailStatus;
    }

    public final String component9() {
        return this.downloadType;
    }

    public final SpixSpeedControlRequestDto copy(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, boolean z, long j4) {
        js3.p(str, "downloadKey");
        js3.p(str2, "hostName");
        js3.p(str3, "startStatus");
        js3.p(str5, "endStatus");
        js3.p(str7, "downloadType");
        js3.p(str8, "url");
        return new SpixSpeedControlRequestDto(str, str2, j, j2, str3, str4, str5, str6, str7, j3, str8, z, j4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpixSpeedControlRequestDto)) {
            return false;
        }
        SpixSpeedControlRequestDto spixSpeedControlRequestDto = (SpixSpeedControlRequestDto) obj;
        return js3.i(this.downloadKey, spixSpeedControlRequestDto.downloadKey) && js3.i(this.hostName, spixSpeedControlRequestDto.hostName) && this.timestamp == spixSpeedControlRequestDto.timestamp && this.localSize == spixSpeedControlRequestDto.localSize && js3.i(this.startStatus, spixSpeedControlRequestDto.startStatus) && js3.i(this.startDetailStatus, spixSpeedControlRequestDto.startDetailStatus) && js3.i(this.endStatus, spixSpeedControlRequestDto.endStatus) && js3.i(this.endDetailStatus, spixSpeedControlRequestDto.endDetailStatus) && js3.i(this.downloadType, spixSpeedControlRequestDto.downloadType) && this.serverSize == spixSpeedControlRequestDto.serverSize && js3.i(this.url, spixSpeedControlRequestDto.url) && this.isHot == spixSpeedControlRequestDto.isHot && this.neneInsertTs == spixSpeedControlRequestDto.neneInsertTs;
    }

    public final String getDownloadKey() {
        return this.downloadKey;
    }

    public final String getDownloadType() {
        return this.downloadType;
    }

    public final String getEndDetailStatus() {
        return this.endDetailStatus;
    }

    public final String getEndStatus() {
        return this.endStatus;
    }

    public final String getHostName() {
        return this.hostName;
    }

    public final long getLocalSize() {
        return this.localSize;
    }

    public final long getNeneInsertTs() {
        return this.neneInsertTs;
    }

    public final long getServerSize() {
        return this.serverSize;
    }

    public final String getStartDetailStatus() {
        return this.startDetailStatus;
    }

    public final String getStartStatus() {
        return this.startStatus;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int iK = rm7.k(this.hostName, this.downloadKey.hashCode() * 31, 31);
        long j = this.timestamp;
        int i = (iK + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.localSize;
        int iK2 = rm7.k(this.startStatus, (i + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31);
        String str = this.startDetailStatus;
        int iK3 = rm7.k(this.endStatus, (iK2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.endDetailStatus;
        int iK4 = rm7.k(this.downloadType, (iK3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
        long j3 = this.serverSize;
        int iK5 = rm7.k(this.url, (iK4 + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31);
        int i2 = this.isHot ? 1231 : 1237;
        long j4 = this.neneInsertTs;
        return ((iK5 + i2) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final boolean isHot() {
        return this.isHot;
    }

    public String toString() {
        String str = this.downloadKey;
        String str2 = this.hostName;
        long j = this.timestamp;
        long j2 = this.localSize;
        String str3 = this.startStatus;
        String str4 = this.startDetailStatus;
        String str5 = this.endStatus;
        String str6 = this.endDetailStatus;
        String str7 = this.downloadType;
        long j3 = this.serverSize;
        String str8 = this.url;
        boolean z = this.isHot;
        long j4 = this.neneInsertTs;
        StringBuilder sbT = rm7.t("SpixSpeedControlRequestDto(downloadKey=", str, ", hostName=", str2, ", timestamp=");
        sbT.append(j);
        sbT.append(", localSize=");
        sbT.append(j2);
        sbT.append(", startStatus=");
        o40.I(str3, ", startDetailStatus=", str4, ", endStatus=", sbT);
        o40.I(str5, ", endDetailStatus=", str6, ", downloadType=", sbT);
        sbT.append(str7);
        sbT.append(", serverSize=");
        sbT.append(j3);
        sbT.append(", url=");
        sbT.append(str8);
        sbT.append(", isHot=");
        sbT.append(z);
        sbT.append(", neneInsertTs=");
        sbT.append(j4);
        sbT.append(")");
        return sbT.toString();
    }

    public SpixSpeedControlRequestDto(String str, String str2, long j, long j2, String str3, String str4, String str5, String str6, String str7, long j3, String str8, boolean z, long j4) {
        js3.p(str, "downloadKey");
        js3.p(str2, "hostName");
        js3.p(str3, "startStatus");
        js3.p(str5, "endStatus");
        js3.p(str7, "downloadType");
        js3.p(str8, "url");
        this.downloadKey = str;
        this.hostName = str2;
        this.timestamp = j;
        this.localSize = j2;
        this.startStatus = str3;
        this.startDetailStatus = str4;
        this.endStatus = str5;
        this.endDetailStatus = str6;
        this.downloadType = str7;
        this.serverSize = j3;
        this.url = str8;
        this.isHot = z;
        this.neneInsertTs = j4;
    }
}
