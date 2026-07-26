package com.microsoft.clarity.q;

import defpackage.js3;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {
    public final OutputStream a;
    public long b;

    public b(OutputStream outputStream) {
        js3.p(outputStream, "out");
        this.a = outputStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.b++;
        this.a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        js3.p(bArr, "b");
        this.b += (long) i2;
        this.a.write(bArr, i, i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.b += (long) (bArr != null ? bArr.length : 0);
        this.a.write(bArr);
    }
}
