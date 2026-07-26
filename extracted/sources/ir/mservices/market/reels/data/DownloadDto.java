package ir.mservices.market.reels.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadDto implements Serializable {

    @vo7("path")
    private final String path;

    public DownloadDto(String str) {
        this.path = str;
    }

    public static /* synthetic */ DownloadDto copy$default(DownloadDto downloadDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = downloadDto.path;
        }
        return downloadDto.copy(str);
    }

    public final String component1() {
        return this.path;
    }

    public final DownloadDto copy(String str) {
        return new DownloadDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DownloadDto) && js3.i(this.path, ((DownloadDto) obj).path);
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        String str = this.path;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return o40.y("DownloadDto(path=", this.path, ")");
    }
}
