package com.microsoft.clarity.models.telemetry;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.yd1;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorReport {
    private final String errorType;
    private final String message;
    private final int pageNum;
    private final String projectId;
    private final String sessionId;
    private final int sourcePlatform;
    private final String stack;
    private final String timestamp;
    private final String userId;
    private final String version;

    public ErrorReport(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2) {
        js3.p(str, "version");
        js3.p(str2, "projectId");
        js3.p(str3, "userId");
        js3.p(str4, "sessionId");
        js3.p(str5, "errorType");
        js3.p(str7, "stack");
        js3.p(str8, "timestamp");
        this.version = str;
        this.projectId = str2;
        this.userId = str3;
        this.sessionId = str4;
        this.pageNum = i;
        this.errorType = str5;
        this.message = str6;
        this.stack = str7;
        this.timestamp = str8;
        this.sourcePlatform = i2;
    }

    public static /* synthetic */ ErrorReport copy$default(ErrorReport errorReport, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = errorReport.version;
        }
        if ((i3 & 2) != 0) {
            str2 = errorReport.projectId;
        }
        if ((i3 & 4) != 0) {
            str3 = errorReport.userId;
        }
        if ((i3 & 8) != 0) {
            str4 = errorReport.sessionId;
        }
        if ((i3 & 16) != 0) {
            i = errorReport.pageNum;
        }
        if ((i3 & 32) != 0) {
            str5 = errorReport.errorType;
        }
        if ((i3 & 64) != 0) {
            str6 = errorReport.message;
        }
        if ((i3 & 128) != 0) {
            str7 = errorReport.stack;
        }
        if ((i3 & 256) != 0) {
            str8 = errorReport.timestamp;
        }
        if ((i3 & 512) != 0) {
            i2 = errorReport.sourcePlatform;
        }
        String str9 = str8;
        int i4 = i2;
        String str10 = str6;
        String str11 = str7;
        int i5 = i;
        String str12 = str5;
        return errorReport.copy(str, str2, str3, str4, i5, str12, str10, str11, str9, i4);
    }

    public final String component1() {
        return this.version;
    }

    public final int component10() {
        return this.sourcePlatform;
    }

    public final String component2() {
        return this.projectId;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.sessionId;
    }

    public final int component5() {
        return this.pageNum;
    }

    public final String component6() {
        return this.errorType;
    }

    public final String component7() {
        return this.message;
    }

    public final String component8() {
        return this.stack;
    }

    public final String component9() {
        return this.timestamp;
    }

    public final ErrorReport copy(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2) {
        js3.p(str, "version");
        js3.p(str2, "projectId");
        js3.p(str3, "userId");
        js3.p(str4, "sessionId");
        js3.p(str5, "errorType");
        js3.p(str7, "stack");
        js3.p(str8, "timestamp");
        return new ErrorReport(str, str2, str3, str4, i, str5, str6, str7, str8, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorReport)) {
            return false;
        }
        ErrorReport errorReport = (ErrorReport) obj;
        return js3.i(this.version, errorReport.version) && js3.i(this.projectId, errorReport.projectId) && js3.i(this.userId, errorReport.userId) && js3.i(this.sessionId, errorReport.sessionId) && this.pageNum == errorReport.pageNum && js3.i(this.errorType, errorReport.errorType) && js3.i(this.message, errorReport.message) && js3.i(this.stack, errorReport.stack) && js3.i(this.timestamp, errorReport.timestamp) && this.sourcePlatform == errorReport.sourcePlatform;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getPageNum() {
        return this.pageNum;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSourcePlatform() {
        return this.sourcePlatform;
    }

    public final String getStack() {
        return this.stack;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iK = rm7.k(this.errorType, (this.pageNum + rm7.k(this.sessionId, rm7.k(this.userId, rm7.k(this.projectId, this.version.hashCode() * 31, 31), 31), 31)) * 31, 31);
        String str = this.message;
        return this.sourcePlatform + rm7.k(this.timestamp, rm7.k(this.stack, (iK + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("v", this.version);
        jSONObject.put("p", this.projectId);
        jSONObject.put("u", this.userId);
        jSONObject.put("s", this.sessionId);
        jSONObject.put("n", this.pageNum);
        jSONObject.put("t", this.errorType);
        jSONObject.put("m", this.message);
        jSONObject.put(ByteArrayResult.AppInfo.IMG_SERIALISED_NAME, this.stack);
        jSONObject.put("i", this.timestamp);
        jSONObject.put(ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME, this.sourcePlatform);
        String string = jSONObject.toString();
        js3.o(string, "json.toString()");
        return string;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorReport(version=");
        sb.append(this.version);
        sb.append(", projectId=");
        sb.append(this.projectId);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", sessionId=");
        sb.append(this.sessionId);
        sb.append(", pageNum=");
        sb.append(this.pageNum);
        sb.append(", errorType=");
        sb.append(this.errorType);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", stack=");
        sb.append(this.stack);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", sourcePlatform=");
        return dw1.q(sb, this.sourcePlatform, ')');
    }

    public /* synthetic */ ErrorReport(String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8, int i2, int i3, yd1 yd1Var) {
        this(str, str2, str3, str4, i, str5, str6, str7, str8, (i3 & 512) != 0 ? 1 : i2);
    }
}
