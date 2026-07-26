package ir.mservices.market.download.common.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.o40;
import defpackage.t61;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadDataUrlDto implements UrlDto, Serializable {

    @vo7("contentLength")
    private final String contentLength;

    @vo7("fileName")
    private final String fileName;

    @vo7("isDiff")
    private final boolean isDiff;

    @vo7("md5CheckSum")
    private final String md5CheckSum;

    @vo7("type")
    private final String type;

    @vo7("uriPath")
    private final String uriPath;

    @vo7("uriServers")
    private final List<String> uriServers;

    public DownloadDataUrlDto(List<String> list, String str, String str2, String str3, boolean z, String str4, String str5) {
        js3.p(str5, "fileName");
        this.uriServers = list;
        this.uriPath = str;
        this.contentLength = str2;
        this.md5CheckSum = str3;
        this.isDiff = z;
        this.type = str4;
        this.fileName = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadDataUrlDto copy$default(DownloadDataUrlDto downloadDataUrlDto, List list, String str, String str2, String str3, boolean z, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = downloadDataUrlDto.uriServers;
        }
        if ((i & 2) != 0) {
            str = downloadDataUrlDto.uriPath;
        }
        if ((i & 4) != 0) {
            str2 = downloadDataUrlDto.contentLength;
        }
        if ((i & 8) != 0) {
            str3 = downloadDataUrlDto.md5CheckSum;
        }
        if ((i & 16) != 0) {
            z = downloadDataUrlDto.isDiff;
        }
        if ((i & 32) != 0) {
            str4 = downloadDataUrlDto.type;
        }
        if ((i & 64) != 0) {
            str5 = downloadDataUrlDto.fileName;
        }
        String str6 = str4;
        String str7 = str5;
        boolean z2 = z;
        String str8 = str2;
        return downloadDataUrlDto.copy(list, str, str8, str3, z2, str6, str7);
    }

    public final List<String> component1() {
        return this.uriServers;
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

    public final String component7() {
        return this.fileName;
    }

    public final DownloadDataUrlDto copy(List<String> list, String str, String str2, String str3, boolean z, String str4, String str5) {
        js3.p(str5, "fileName");
        return new DownloadDataUrlDto(list, str, str2, str3, z, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadDataUrlDto)) {
            return false;
        }
        DownloadDataUrlDto downloadDataUrlDto = (DownloadDataUrlDto) obj;
        return js3.i(this.uriServers, downloadDataUrlDto.uriServers) && js3.i(this.uriPath, downloadDataUrlDto.uriPath) && js3.i(this.contentLength, downloadDataUrlDto.contentLength) && js3.i(this.md5CheckSum, downloadDataUrlDto.md5CheckSum) && this.isDiff == downloadDataUrlDto.isDiff && js3.i(this.type, downloadDataUrlDto.type) && js3.i(this.fileName, downloadDataUrlDto.fileName);
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getContentLength() {
        return this.contentLength;
    }

    public final String getFileName() {
        return this.fileName;
    }

    @Override // ir.mservices.market.download.common.data.UrlDto
    public String getMd5CheckSum() {
        return this.md5CheckSum;
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
        return this.fileName.hashCode() + ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31);
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
        String str5 = this.fileName;
        StringBuilder sb = new StringBuilder("DownloadDataUrlDto(uriServers=");
        sb.append(list);
        sb.append(", uriPath=");
        sb.append(str);
        sb.append(", contentLength=");
        o40.I(str2, ", md5CheckSum=", str3, ", isDiff=", sb);
        t61.z(sb, z, ", type=", str4, ", fileName=");
        return dw1.s(sb, str5, ")");
    }
}
