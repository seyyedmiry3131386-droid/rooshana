package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qd2 extends t0 {
    public static int K(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
