package com.microsoft.clarity.models.repositories;

import com.microsoft.clarity.models.AssetType;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public final class TypefaceRepositoryAsset extends RepositoryAsset {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRepositoryAsset(String str, String str2) {
        super(AssetType.Typeface, str, str2);
        js3.p(str, "id");
        js3.p(str2, "repositoryPath");
    }
}
