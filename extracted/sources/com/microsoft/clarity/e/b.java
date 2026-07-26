package com.microsoft.clarity.e;

import com.microsoft.clarity.m.d;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends c {
    public final d a;

    public b(d dVar) {
        this.a = dVar;
    }

    @Override // com.microsoft.clarity.e.c
    public final int a() {
        return this.a.a() & 255;
    }

    @Override // com.microsoft.clarity.e.c
    public final int a(byte[] bArr, int i, int i2) throws IOException {
        this.a.a(bArr, i, i2, false);
        return i2;
    }
}
