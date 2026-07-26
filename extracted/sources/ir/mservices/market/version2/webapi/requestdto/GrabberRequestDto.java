package ir.mservices.market.version2.webapi.requestdto;

import defpackage.bl4;
import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class GrabberRequestDto implements RequestDTO, Serializable {
    private final String caller;
    private final String url;

    public GrabberRequestDto(String str, String str2) {
        js3.p(str, "url");
        this.url = str;
        this.caller = str2;
    }

    public final String getCaller() {
        return this.caller;
    }

    public final String getUrl() {
        return this.url;
    }

    public String toString() {
        return bl4.w("GrabberRequestDto(url='", this.url, "', caller=", this.caller, ")");
    }
}
