package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vi0 {
    public static final char[] a;

    static {
        char[] charArray = "0123456789abcdef".toCharArray();
        js3.o(charArray, "toCharArray(...)");
        a = charArray;
    }

    public static final String a(byte[] bArr, boolean z) {
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        if (!z) {
            return new String(cArr);
        }
        String upperCase = new String(cArr).toUpperCase(Locale.ROOT);
        js3.o(upperCase, "toUpperCase(...)");
        return upperCase;
    }
}
