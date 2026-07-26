package ir.mservices.market.feedback.data;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackRequestDTO implements RequestDTO {
    private final String body;
    private final String email;
    private final String orderId;
    private final String packageName;
    private final String screenshotFileName;
    private final String subject;

    public FeedbackRequestDTO(String str, String str2, String str3, String str4, String str5, String str6) {
        js3.p(str, "email");
        js3.p(str3, "body");
        this.email = str;
        this.subject = str2;
        this.body = str3;
        this.screenshotFileName = str4;
        this.orderId = str5;
        this.packageName = str6;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getScreenshotFileName() {
        return this.screenshotFileName;
    }

    public final String getSubject() {
        return this.subject;
    }
}
