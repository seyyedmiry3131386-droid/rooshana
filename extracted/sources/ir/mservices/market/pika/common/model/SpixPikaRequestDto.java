package ir.mservices.market.pika.common.model;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixPikaRequestDto implements RequestDTO, Serializable {
    private final String packageName;
    private final long size;
    private final String state;
    private final String title;
    private final int versionCode;

    public SpixPikaRequestDto(String str, int i, String str2, long j, String str3) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        js3.p(str3, "state");
        this.packageName = str;
        this.versionCode = i;
        this.title = str2;
        this.size = j;
        this.state = str3;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getSize() {
        return this.size;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }
}
