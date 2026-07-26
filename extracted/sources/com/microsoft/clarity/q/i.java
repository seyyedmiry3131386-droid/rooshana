package com.microsoft.clarity.q;

import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Lambda implements dp2 {
    public final /* synthetic */ byte[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(byte[] bArr) {
        super(1);
        this.a = bArr;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws IOException {
        OutputStream outputStream = (OutputStream) obj;
        js3.p(outputStream, "output");
        outputStream.write(this.a);
        return tx8.a;
    }
}
