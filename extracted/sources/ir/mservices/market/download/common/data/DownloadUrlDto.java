package ir.mservices.market.download.common.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.qq1;
import defpackage.sa7;
import defpackage.t61;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.data.install.PostInstall;
import ir.mservices.market.data.install.PreInstall;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadUrlDto implements UrlDto, Serializable {

    @vo7("contentLength")
    private final String contentLength;

    @vo7("contentTtl")
    private final Integer contentTtl;

    @vo7("isDiff")
    private final boolean isDiff;

    @vo7("mainData")
    private final DownloadDataUrlDto mainData;

    @vo7("md5CheckSum")
    private final String md5CheckSum;

    @vo7("patchData")
    private final DownloadDataUrlDto patchData;

    @vo7("postInstall")
    private final String postInstall;

    @vo7("postInstallIntent")
    private final String postInstallIntent;

    @vo7("postInstallPackageName")
    private final String postInstallPackageName;

    @vo7("preInstall")
    private final String preInstall;

    @vo7("split")
    private final List<DownloadDataUrlDto> split;

    @vo7("type")
    private final String type;

    @vo7("uriPath")
    private final String uriPath;

    @vo7("uriServers")
    private final List<String> uriServers;

    public DownloadUrlDto(List<String> list, String str, String str2, String str3, boolean z, String str4, DownloadDataUrlDto downloadDataUrlDto, DownloadDataUrlDto downloadDataUrlDto2, List<DownloadDataUrlDto> list2, String str5, String str6, String str7, String str8, Integer num) {
        this.uriServers = list;
        this.uriPath = str;
        this.contentLength = str2;
        this.md5CheckSum = str3;
        this.isDiff = z;
        this.type = str4;
        this.mainData = downloadDataUrlDto;
        this.patchData = downloadDataUrlDto2;
        this.split = list2;
        this.preInstall = str5;
        this.postInstall = str6;
        this.postInstallIntent = str7;
        this.postInstallPackageName = str8;
        this.contentTtl = num;
    }

    private final String component10() {
        return this.preInstall;
    }

    private final String component11() {
        return this.postInstall;
    }

    private final Integer component14() {
        return this.contentTtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPostInstall$lambda$0() {
        String text = PostInstall.Default.getText();
        js3.o(text, "getText(...)");
        return text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getPreInstall$lambda$0() {
        String text = PreInstall.Default.getText();
        js3.o(text, "getText(...)");
        return text;
    }

    public final List<String> component1() {
        return this.uriServers;
    }

    public final String component12() {
        return this.postInstallIntent;
    }

    public final String component13() {
        return this.postInstallPackageName;
    }

    public final String component2() {
        return this.uriPath;
    }

    public final String component3() {
        return this.contentLength;
    }

    public final String component4() {
        return this.md5CheckSum;
    }

    public final boolean component5() {
        return this.isDiff;
    }

    public final String component6() {
        return this.type;
    }

    public final DownloadDataUrlDto component7() {
        return this.mainData;
    }

    public final DownloadDataUrlDto component8() {
        return this.patchData;
    }

    public final List<DownloadDataUrlDto> component9() {
        return this.split;
    }

    public final DownloadUrlDto copy(List<String> list, String str, String str2, String str3, boolean z, String str4, DownloadDataUrlDto downloadDataUrlDto, DownloadDataUrlDto downloadDataUrlDto2, List<DownloadDataUrlDto> list2, String str5, String str6, String str7, String str8, Integer num) {
        return new DownloadUrlDto(list, str, str2, str3, z, str4, downloadDataUrlDto, downloadDataUrlDto2, list2, str5, str6, str7, str8, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadUrlDto)) {
            return false;
        }
        DownloadUrlDto downloadUrlDto = (DownloadUrlDto) obj;
        return js3.i(this.uriServers, downloadUrlDto.uriServers) && js3.i(this.uriPath, downloadUrlDto.uriPath) && js3.i(this.contentLength, downloadUrlDto.contentLength) && js3.i(this.md5CheckSum, downloadUrlDto.md5CheckSum) && this.isDiff == downloadUrlDto.isDiff && js3.i(this.type, downloadUrlDto.type) && js3.i(this.mainData, downloadUrlDto.mainData) && js3.i(this.patchData, downloadUrlDto.patchData) && js3.i(this.split, downloadUrlDto.split) && js3.i(this.preInstall, downloadUrlDto.preInstall) && js3.i(this.postInstall, downloadUrlDto.postInstall) && js3.i(this.postInstallIntent, downloadUrlDto.postInstallIntent) && js3.i(this.postInstallPackageName, downloadUrlDto.postInstallPackageName) && js3.i(this.contentTtl, downloadUrlDto.contentTtl);
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getContentLength() {
        return this.contentLength;
    }

    public final int getContentTtl() {
        Integer num = this.contentTtl;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final DownloadDataUrlDto getMainData() {
        return this.mainData;
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getMd5CheckSum() {
        return this.md5CheckSum;
    }

    public final DownloadDataUrlDto getPatchData() {
        return this.patchData;
    }

    public final String getPostInstall() {
        return sa7.h(this.postInstall, new qq1(2));
    }

    public final String getPostInstallIntent() {
        return this.postInstallIntent;
    }

    public final String getPostInstallPackageName() {
        return this.postInstallPackageName;
    }

    public final String getPreInstall() {
        return sa7.h(this.preInstall, new qq1(3));
    }

    public final List<DownloadDataUrlDto> getSplit() {
        return this.split;
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getType() {
        return this.type;
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getUriPath() {
        return this.uriPath;
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public List<String> getUriServers() {
        return this.uriServers;
    }

    public int hashCode() {
        List<String> list = this.uriServers;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.uriPath;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contentLength;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.md5CheckSum;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + (this.isDiff ? 1231 : 1237)) * 31;
        String str4 = this.type;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        DownloadDataUrlDto downloadDataUrlDto = this.mainData;
        int iHashCode6 = (iHashCode5 + (downloadDataUrlDto == null ? 0 : downloadDataUrlDto.hashCode())) * 31;
        DownloadDataUrlDto downloadDataUrlDto2 = this.patchData;
        int iHashCode7 = (iHashCode6 + (downloadDataUrlDto2 == null ? 0 : downloadDataUrlDto2.hashCode())) * 31;
        List<DownloadDataUrlDto> list2 = this.split;
        int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str5 = this.preInstall;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.postInstall;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.postInstallIntent;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.postInstallPackageName;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.contentTtl;
        return iHashCode12 + (num != null ? num.hashCode() : 0);
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public boolean isDiff() {
        return this.isDiff;
    }

    public String toString() {
        List<String> list = this.uriServers;
        String str = this.uriPath;
        String str2 = this.contentLength;
        String str3 = this.md5CheckSum;
        boolean z = this.isDiff;
        String str4 = this.type;
        DownloadDataUrlDto downloadDataUrlDto = this.mainData;
        DownloadDataUrlDto downloadDataUrlDto2 = this.patchData;
        List<DownloadDataUrlDto> list2 = this.split;
        String str5 = this.preInstall;
        String str6 = this.postInstall;
        String str7 = this.postInstallIntent;
        String str8 = this.postInstallPackageName;
        Integer num = this.contentTtl;
        StringBuilder sb = new StringBuilder("DownloadUrlDto(uriServers=");
        sb.append(list);
        sb.append(", uriPath=");
        sb.append(str);
        sb.append(", contentLength=");
        o40.I(str2, ", md5CheckSum=", str3, ", isDiff=", sb);
        t61.z(sb, z, ", type=", str4, ", mainData=");
        sb.append(downloadDataUrlDto);
        sb.append(", patchData=");
        sb.append(downloadDataUrlDto2);
        sb.append(", split=");
        sb.append(list2);
        sb.append(", preInstall=");
        sb.append(str5);
        sb.append(", postInstall=");
        o40.I(str6, ", postInstallIntent=", str7, ", postInstallPackageName=", sb);
        sb.append(str8);
        sb.append(", contentTtl=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DownloadUrlDto(List list, String str, String str2, String str3, boolean z, String str4, DownloadDataUrlDto downloadDataUrlDto, DownloadDataUrlDto downloadDataUrlDto2, List list2, String str5, String str6, String str7, String str8, Integer num, int i, yd1 yd1Var) {
        this(list, str, str2, str3, z, str4, (i & 64) != 0 ? null : downloadDataUrlDto, (i & 128) != 0 ? null : downloadDataUrlDto2, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : str8, (i & 8192) != 0 ? null : num);
    }
}
