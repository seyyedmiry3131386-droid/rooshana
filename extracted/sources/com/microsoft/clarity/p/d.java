package com.microsoft.clarity.p;

import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import java.io.OutputStream;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Lambda implements dp2 {
    public final /* synthetic */ byte[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(byte[] bArr) {
        super(1);
        this.a = bArr;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        OutputStream outputStream = (OutputStream) obj;
        js3.p(outputStream, "outputStream");
        try {
            outputStream.write(this.a);
            tx8 tx8Var = tx8.a;
            outputStream.close();
            return tx8Var;
        } finally {
        }
    }
}
