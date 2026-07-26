package com.microsoft.clarity.q;

import defpackage.dp2;
import defpackage.js3;
import defpackage.tx8;
import defpackage.zp0;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends Lambda implements dp2 {
    public final /* synthetic */ String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(1);
        this.a = str;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws IOException {
        OutputStream outputStream = (OutputStream) obj;
        js3.p(outputStream, "output");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, zp0.a);
        try {
            outputStreamWriter.write(this.a);
            tx8 tx8Var = tx8.a;
            outputStreamWriter.close();
            return tx8Var;
        } finally {
        }
    }
}
