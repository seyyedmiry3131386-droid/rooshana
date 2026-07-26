package com.microsoft.clarity.models.telemetry;

import defpackage.bl4;
import defpackage.js3;
import defpackage.yd1;
import j$.util.Objects;
import java.util.NoSuchElementException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorDetails {
    public static final Companion Companion = new Companion(null);
    private final ErrorType errorType;
    private final String message;
    private final String stackTrace;
    private final String timestamp;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ErrorDetails fromJson(String str) throws JSONException {
            js3.p(str, "jsonString");
            JSONObject jSONObject = new JSONObject(str);
            for (ErrorType errorType : ErrorType.values()) {
                if (errorType.ordinal() == jSONObject.getInt("errorType")) {
                    String string = jSONObject.getString("timestamp");
                    js3.o(string, "json.getString(\"timestamp\")");
                    String strOptString = jSONObject.optString("message", "");
                    String strOptString2 = jSONObject.optString("stackTrace", "");
                    js3.o(strOptString2, "json.optString(\"stackTrace\", \"\")");
                    return new ErrorDetails(errorType, string, strOptString, strOptString2);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    public ErrorDetails(ErrorType errorType, String str, String str2, String str3) {
        js3.p(errorType, "errorType");
        js3.p(str, "timestamp");
        js3.p(str3, "stackTrace");
        this.errorType = errorType;
        this.timestamp = str;
        this.message = str2;
        this.stackTrace = str3;
    }

    public static /* synthetic */ ErrorDetails copy$default(ErrorDetails errorDetails, ErrorType errorType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            errorType = errorDetails.errorType;
        }
        if ((i & 2) != 0) {
            str = errorDetails.timestamp;
        }
        if ((i & 4) != 0) {
            str2 = errorDetails.message;
        }
        if ((i & 8) != 0) {
            str3 = errorDetails.stackTrace;
        }
        return errorDetails.copy(errorType, str, str2, str3);
    }

    public final ErrorType component1() {
        return this.errorType;
    }

    public final String component2() {
        return this.timestamp;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.stackTrace;
    }

    public final ErrorDetails copy(ErrorType errorType, String str, String str2, String str3) {
        js3.p(errorType, "errorType");
        js3.p(str, "timestamp");
        js3.p(str3, "stackTrace");
        return new ErrorDetails(errorType, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorDetails)) {
            return false;
        }
        ErrorDetails errorDetails = (ErrorDetails) obj;
        return this.errorType == errorDetails.errorType && js3.i(this.timestamp, errorDetails.timestamp) && js3.i(this.message, errorDetails.message) && js3.i(this.stackTrace, errorDetails.stackTrace);
    }

    public final ErrorType getErrorType() {
        return this.errorType;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getStackTrace() {
        return this.stackTrace;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(this.errorType, this.message, this.stackTrace);
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorType", this.errorType.ordinal());
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("message", this.message);
        jSONObject.put("stackTrace", this.stackTrace);
        String string = jSONObject.toString();
        js3.o(string, "json.toString()");
        return string;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorDetails(errorType=");
        sb.append(this.errorType);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", stackTrace=");
        return bl4.y(sb, this.stackTrace, ')');
    }

    public /* synthetic */ ErrorDetails(ErrorType errorType, String str, String str2, String str3, int i, yd1 yd1Var) {
        this(errorType, str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
    }
}
