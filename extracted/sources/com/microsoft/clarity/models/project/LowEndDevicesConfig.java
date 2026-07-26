package com.microsoft.clarity.models.project;

import defpackage.js3;
import defpackage.yd1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class LowEndDevicesConfig {
    public static final Companion Companion = new Companion(null);
    private final boolean disableRecordings;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final LowEndDevicesConfig fromJson(JSONObject jSONObject) {
            js3.p(jSONObject, "json");
            return new LowEndDevicesConfig(jSONObject.getBoolean("disableRecordings"));
        }

        private Companion() {
        }
    }

    public LowEndDevicesConfig(boolean z) {
        this.disableRecordings = z;
    }

    public final boolean getDisableRecordings() {
        return this.disableRecordings;
    }
}
