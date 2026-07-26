package com.microsoft.clarity.models.observers;

import defpackage.js3;
import defpackage.yd1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ErrorDisplayFrame extends ObservedEvent {
    private String reason;
    private final ScreenMetadata screenMetadata;

    public ErrorDisplayFrame() {
        this(0L, null, null, 7, null);
    }

    public final String getReason() {
        return this.reason;
    }

    public final ScreenMetadata getScreenMetadata() {
        return this.screenMetadata;
    }

    public final void setReason(String str) {
        js3.p(str, "<set-?>");
        this.reason = str;
    }

    public final String toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", getTimestamp());
        jSONObject.put("activityName", this.screenMetadata.getName());
        jSONObject.put("activityId", this.screenMetadata.getActivityHashCode());
        jSONObject.put("reason", this.reason);
        String string = jSONObject.toString();
        js3.o(string, "json.toString()");
        return string;
    }

    public /* synthetic */ ErrorDisplayFrame(long j, ScreenMetadata screenMetadata, String str, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? new ScreenMetadata("", "", 0) : screenMetadata, (i & 4) != 0 ? "" : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorDisplayFrame(long j, ScreenMetadata screenMetadata, String str) {
        super(j);
        js3.p(screenMetadata, "screenMetadata");
        js3.p(str, "reason");
        this.screenMetadata = screenMetadata;
        this.reason = str;
    }
}
