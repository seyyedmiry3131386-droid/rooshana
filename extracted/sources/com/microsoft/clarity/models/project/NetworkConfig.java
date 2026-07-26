package com.microsoft.clarity.models.project;

import defpackage.js3;
import defpackage.yd1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkConfig {
    public static final Companion Companion = new Companion(null);
    private final boolean allowMeteredNetwork;
    private final Long maxDataVolume;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final NetworkConfig fromJson(JSONObject jSONObject) {
            js3.p(jSONObject, "json");
            return new NetworkConfig(jSONObject.getBoolean("allowMeteredNetwork"), (!jSONObject.has("maxDataVolume") || jSONObject.isNull("maxDataVolume")) ? null : Long.valueOf(jSONObject.getLong("maxDataVolume")));
        }

        private Companion() {
        }
    }

    public NetworkConfig(boolean z, Long l) {
        this.allowMeteredNetwork = z;
        this.maxDataVolume = l;
    }

    public final boolean getAllowMeteredNetwork() {
        return this.allowMeteredNetwork;
    }

    public final Long getMaxDataVolume() {
        return this.maxDataVolume;
    }
}
