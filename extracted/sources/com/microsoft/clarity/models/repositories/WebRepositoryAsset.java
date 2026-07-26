package com.microsoft.clarity.models.repositories;

import com.microsoft.clarity.models.AssetType;
import defpackage.js3;
import defpackage.yd1;

/* JADX INFO: loaded from: classes3.dex */
public final class WebRepositoryAsset extends RepositoryAsset {
    private final String version;

    public /* synthetic */ WebRepositoryAsset(String str, String str2, String str3, int i, yd1 yd1Var) {
        this(str, str2, (i & 4) != 0 ? "all" : str3);
    }

    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebRepositoryAsset(String str, String str2, String str3) {
        super(AssetType.Web, str, str2);
        js3.p(str, "id");
        js3.p(str2, "repositoryPath");
        js3.p(str3, "version");
        this.version = str3;
    }
}
