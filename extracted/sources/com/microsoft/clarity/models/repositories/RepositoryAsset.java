package com.microsoft.clarity.models.repositories;

import com.microsoft.clarity.models.AssetType;
import defpackage.js3;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/* JADX INFO: loaded from: classes3.dex */
public class RepositoryAsset {
    private final String id;
    private final String repositoryPath;
    private final AssetType type;

    public RepositoryAsset(AssetType assetType, String str, String str2) {
        js3.p(assetType, "type");
        js3.p(str, "id");
        js3.p(str2, "repositoryPath");
        this.type = assetType;
        this.id = str;
        this.repositoryPath = str2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getRepositoryPath() {
        return this.repositoryPath;
    }

    public final AssetType getType() {
        return this.type;
    }

    public void writeContentToStream(OutputStream outputStream) {
        js3.p(outputStream, "output");
        Files.copy(Paths.get(this.repositoryPath, new String[0]), outputStream);
    }
}
