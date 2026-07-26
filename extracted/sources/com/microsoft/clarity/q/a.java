package com.microsoft.clarity.q;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) + ((bArr[i + 2] & 255) << 8) + ((bArr[i + 1] & 255) << 16) + ((bArr[i] & 255) << 24);
    }
}
