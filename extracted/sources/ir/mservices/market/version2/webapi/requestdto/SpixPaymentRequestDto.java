package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixPaymentRequestDto implements RequestDTO, Serializable {
    private final String host;
    private final String input;
    private final String message;
    private final String method;
    private final String packageName;
    private final String result;
    private final String type;
    private final int versionCode;

    public SpixPaymentRequestDto(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        js3.p(str, "packageName");
        js3.p(str2, "method");
        js3.p(str3, "type");
        js3.p(str4, "input");
        js3.p(str5, "result");
        js3.p(str6, "message");
        js3.p(str7, "host");
        this.packageName = str;
        this.versionCode = i;
        this.method = str2;
        this.type = str3;
        this.input = str4;
        this.result = str5;
        this.message = str6;
        this.host = str7;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getInput() {
        return this.input;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getType() {
        return this.type;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }
}
