package com.microsoft.clarity.o;

import com.microsoft.clarity.models.repositories.RepositoryAsset;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.io.OutputStream;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Lambda implements dp2 {
    public final /* synthetic */ RepositoryAsset a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RepositoryAsset repositoryAsset) {
        super(1);
        this.a = repositoryAsset;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        OutputStream outputStream = (OutputStream) obj;
        js3.p(outputStream, "output");
        this.a.writeContentToStream(outputStream);
        return tx8.a;
    }
}
