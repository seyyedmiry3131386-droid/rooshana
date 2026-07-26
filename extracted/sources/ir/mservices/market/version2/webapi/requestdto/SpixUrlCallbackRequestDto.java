package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixUrlCallbackRequestDto implements RequestDTO, Serializable {
    private final int count;
    private final String host;
    private final int httpStatus;
    private final String ip;
    private final String type;
    private final String url;

    public SpixUrlCallbackRequestDto(String str, String str2, int i, int i2, String str3, String str4) {
        js3.p(str, "type");
        js3.p(str2, "url");
        this.type = str;
        this.url = str2;
        this.httpStatus = i;
        this.count = i2;
        this.host = str3;
        this.ip = str4;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getHost() {
        return this.host;
    }

    public final int getHttpStatus() {
        return this.httpStatus;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }
}
