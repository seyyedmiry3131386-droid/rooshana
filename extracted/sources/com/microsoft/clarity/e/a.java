package com.microsoft.clarity.e;

import defpackage.bl4;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends c {
    public final byte[] a;
    public int b = 0;

    public a(byte[] bArr) {
        this.a = bArr;
    }

    @Override // com.microsoft.clarity.e.c
    public final int a() {
        int i = this.b;
        byte[] bArr = this.a;
        if (i >= bArr.length) {
            return -1;
        }
        byte b = bArr[i];
        this.b = i + 1;
        return (b + 256) % 256;
    }

    @Override // com.microsoft.clarity.e.c
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.b;
        byte[] bArr2 = this.a;
        if (i3 >= bArr2.length) {
            return -1;
        }
        int iMin = Math.min(i2, bArr2.length - i3);
        System.arraycopy(this.a, this.b, bArr, i, iMin);
        this.b += iMin;
        return iMin;
    }

    public final void a(long j) throws IOException {
        if (j >= 0 && j < this.a.length) {
            this.b = (int) j;
            return;
        }
        throw new IOException(bl4.r(j, "Illegal seek position: "));
    }
}
