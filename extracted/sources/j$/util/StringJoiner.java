package j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class StringJoiner {
    public final String a;
    public final String b;
    public final String c;
    public String[] d;
    public int e;
    public int f;

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Objects.requireNonNull(charSequence2, "The prefix must not be null");
        Objects.requireNonNull(charSequence, "The delimiter must not be null");
        Objects.requireNonNull(charSequence3, "The suffix must not be null");
        this.a = charSequence2.toString();
        this.b = charSequence.toString();
        this.c = charSequence3.toString();
    }

    public static int a(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public final String toString() {
        String[] strArr;
        String[] strArr2 = this.d;
        int i = this.e;
        String str = this.a;
        int length = str.length();
        String str2 = this.c;
        int length2 = str2.length() + length;
        String str3 = this.b;
        if (length2 != 0) {
            char[] cArr = new char[this.f + length2];
            int iA = a(str, cArr, 0);
            if (i > 0) {
                iA = a(strArr2[0], cArr, iA) + iA;
                for (int i2 = 1; i2 < i; i2++) {
                    int iA2 = a(str3, cArr, iA) + iA;
                    iA = a(strArr2[i2], cArr, iA2) + iA2;
                }
            }
            a(str2, cArr, iA);
            return new String(cArr);
        }
        if (this.e > 1) {
            char[] cArr2 = new char[this.f];
            int iA3 = a(this.d[0], cArr2, 0);
            int i3 = 1;
            do {
                int iA4 = a(str3, cArr2, iA3) + iA3;
                iA3 = a(this.d[i3], cArr2, iA4) + iA4;
                strArr = this.d;
                strArr[i3] = null;
                i3++;
            } while (i3 < this.e);
            this.e = 1;
            strArr[0] = new String(cArr2);
        }
        return i == 0 ? "" : strArr2[0];
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.d;
        if (strArr == null) {
            this.d = new String[8];
        } else {
            int i = this.e;
            if (i == strArr.length) {
                this.d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f = this.b.length() + this.f;
        }
        this.f = strValueOf.length() + this.f;
        String[] strArr2 = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }
}
