package com.microsoft.clarity.models.ingest;

import defpackage.dw1;
import defpackage.js3;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AssetCheck {
    private final String hash;
    private final String path;
    private final int type;
    private final String version;

    public AssetCheck(String str, String str2, String str3, int i) {
        this.hash = str;
        this.path = str2;
        this.version = str3;
        this.type = i;
    }

    public static /* synthetic */ AssetCheck copy$default(AssetCheck assetCheck, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = assetCheck.hash;
        }
        if ((i2 & 2) != 0) {
            str2 = assetCheck.path;
        }
        if ((i2 & 4) != 0) {
            str3 = assetCheck.version;
        }
        if ((i2 & 8) != 0) {
            i = assetCheck.type;
        }
        return assetCheck.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.hash;
    }

    public final String component2() {
        return this.path;
    }

    public final String component3() {
        return this.version;
    }

    public final int component4() {
        return this.type;
    }

    public final AssetCheck copy(String str, String str2, String str3, int i) {
        return new AssetCheck(str, str2, str3, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetCheck)) {
            return false;
        }
        AssetCheck assetCheck = (AssetCheck) obj;
        return js3.i(this.hash, assetCheck.hash) && js3.i(this.path, assetCheck.path) && js3.i(this.version, assetCheck.version) && this.type == assetCheck.type;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getPath() {
        return this.path;
    }

    public final int getType() {
        return this.type;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.hash;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.path;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.version;
        return this.type + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toJson() {
        String string = toJsonObject().toString();
        js3.o(string, "toJsonObject().toString()");
        return string;
    }

    public final JSONObject toJsonObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("hash", this.hash);
        jSONObject.put("path", this.path);
        jSONObject.put("version", this.version);
        jSONObject.put("type", this.type);
        return jSONObject;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AssetCheck(hash=");
        sb.append(this.hash);
        sb.append(", path=");
        sb.append(this.path);
        sb.append(", version=");
        sb.append(this.version);
        sb.append(", type=");
        return dw1.q(sb, this.type, ')');
    }
}
