package ir.mservices.market.common.uploadImage.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadImageDto implements Serializable {

    @vo7("fileName")
    private final String fileName;
    private String filePath;

    @vo7("url")
    private final String url;

    public UploadImageDto(String str, String str2, String str3) {
        js3.p(str3, "filePath");
        this.fileName = str;
        this.url = str2;
        this.filePath = str3;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setFilePath(String str) {
        js3.p(str, "<set-?>");
        this.filePath = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UploadImageDto(String str) {
        this(null, null, str);
        js3.p(str, "filePath");
    }
}
