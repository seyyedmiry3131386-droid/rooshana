package com.microsoft.clarity.models.display.common;

import com.microsoft.clarity.models.AssetType;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public class Asset {
    private final transient byte[] data;
    private String dataHash;
    private transient AssetType type;

    public Asset(AssetType assetType, byte[] bArr, String str) {
        js3.p(assetType, "type");
        this.type = assetType;
        this.data = bArr;
        this.dataHash = str;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final String getDataHash() {
        return this.dataHash;
    }

    public final AssetType getType() {
        return this.type;
    }

    public final void setDataHash(String str) {
        this.dataHash = str;
    }

    public final void setType(AssetType assetType) {
        js3.p(assetType, "<set-?>");
        this.type = assetType;
    }
}
