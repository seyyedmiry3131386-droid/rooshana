package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nm9 {
    public static final char[] a = "0123456789abcdef".toCharArray();

    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : bArr) {
            char[] cArr = a;
            sb.append(cArr[(b >> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        return sb.toString();
    }
}
