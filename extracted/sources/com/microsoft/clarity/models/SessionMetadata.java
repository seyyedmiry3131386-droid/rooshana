package com.microsoft.clarity.models;

import defpackage.js3;
import defpackage.yd1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class SessionMetadata {
    public static final Companion Companion = new Companion(null);
    private String botDetectionToken;
    private final String ingestUrl;
    private Long lastUploadedPayloadTimestamp;
    private boolean leanSession;
    private final int localStorageVersion;
    private final String projectId;
    private final String sessionId;
    private final long timestamp;
    private String userId;
    private final String version;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final SessionMetadata fromJson(String str) throws JSONException {
            js3.p(str, "serialized");
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("version");
            js3.o(string, "json.getString(\"version\")");
            String string2 = jSONObject.getString("projectId");
            js3.o(string2, "json.getString(\"projectId\")");
            String string3 = jSONObject.getString("userId");
            js3.o(string3, "json.getString(\"userId\")");
            String string4 = jSONObject.getString("sessionId");
            js3.o(string4, "json.getString(\"sessionId\")");
            long j = jSONObject.getLong("timestamp");
            int i = jSONObject.getInt("localStorageVersion");
            boolean z = jSONObject.getBoolean("leanSession");
            String string5 = jSONObject.getString("ingestUrl");
            js3.o(string5, "json.getString(\"ingestUrl\")");
            long jOptLong = jSONObject.optLong("lastUploadedPayloadTimestamp");
            Long lValueOf = Long.valueOf(jOptLong);
            if (jOptLong <= 0) {
                lValueOf = null;
            }
            return new SessionMetadata(string, string2, string3, string4, j, i, z, string5, lValueOf, jSONObject.optString("botDetectionToken"));
        }

        private Companion() {
        }
    }

    public SessionMetadata(String str, String str2, String str3, String str4, long j, int i, boolean z, String str5, Long l, String str6) {
        js3.p(str, "version");
        js3.p(str2, "projectId");
        js3.p(str3, "userId");
        js3.p(str4, "sessionId");
        js3.p(str5, "ingestUrl");
        this.version = str;
        this.projectId = str2;
        this.userId = str3;
        this.sessionId = str4;
        this.timestamp = j;
        this.localStorageVersion = i;
        this.leanSession = z;
        this.ingestUrl = str5;
        this.lastUploadedPayloadTimestamp = l;
        this.botDetectionToken = str6;
    }

    public final String getBotDetectionToken() {
        return this.botDetectionToken;
    }

    public final String getIngestUrl() {
        return this.ingestUrl;
    }

    public final Long getLastUploadedPayloadTimestamp() {
        return this.lastUploadedPayloadTimestamp;
    }

    public final boolean getLeanSession() {
        return this.leanSession;
    }

    public final int getLocalStorageVersion() {
        return this.localStorageVersion;
    }

    public final String getProjectId() {
        return this.projectId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getVersion() {
        return this.version;
    }

    public final void setBotDetectionToken(String str) {
        this.botDetectionToken = str;
    }

    public final void setLastUploadedPayloadTimestamp(Long l) {
        this.lastUploadedPayloadTimestamp = l;
    }

    public final void setLeanSession(boolean z) {
        this.leanSession = z;
    }

    public final void setUserId(String str) {
        js3.p(str, "<set-?>");
        this.userId = str;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.version);
        jSONObject.put("projectId", this.projectId);
        jSONObject.put("userId", this.userId);
        jSONObject.put("sessionId", this.sessionId);
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("localStorageVersion", this.localStorageVersion);
        jSONObject.put("leanSession", this.leanSession);
        jSONObject.put("ingestUrl", this.ingestUrl);
        jSONObject.putOpt("lastUploadedPayloadTimestamp", this.lastUploadedPayloadTimestamp);
        jSONObject.putOpt("botDetectionToken", this.botDetectionToken);
        String string = jSONObject.toString();
        js3.o(string, "json.toString()");
        return string;
    }

    public /* synthetic */ SessionMetadata(String str, String str2, String str3, String str4, long j, int i, boolean z, String str5, Long l, String str6, int i2, yd1 yd1Var) {
        this(str, str2, str3, str4, j, i, z, str5, (i2 & 256) != 0 ? null : l, (i2 & 512) != 0 ? null : str6);
    }
}
