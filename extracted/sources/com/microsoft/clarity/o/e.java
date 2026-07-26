package com.microsoft.clarity.o;

import com.microsoft.clarity.models.ingest.CollectRequest;
import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends Lambda implements dp2 {
    public final /* synthetic */ CollectRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CollectRequest collectRequest) {
        super(1);
        this.a = collectRequest;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws IOException {
        OutputStream outputStream = (OutputStream) obj;
        js3.p(outputStream, "output");
        this.a.writeToStream(outputStream);
        return tx8.a;
    }
}
