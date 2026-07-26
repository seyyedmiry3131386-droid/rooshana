package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m88 extends l88 {
    public static String R(char[] cArr, int i, int i2) {
        is3.h(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static boolean S(String str, String str2, boolean z) {
        js3.p(str, "<this>");
        js3.p(str2, "suffix");
        return !z ? str.endsWith(str2) : V(str, str2, true, str.length() - str2.length(), 0, str2.length());
    }

    public static boolean T(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static final void U(String str) {
        throw new NumberFormatException(rm7.m('\'', "Invalid number format: '", str));
    }

    public static boolean V(String str, String str2, boolean z, int i, int i2, int i3) {
        js3.p(str, "<this>");
        js3.p(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String W(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = str.charAt(0);
            char[] cArr = new char[i];
            for (int i3 = 0; i3 < i; i3++) {
                cArr[i3] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(str.length() * i);
        if (1 <= i) {
            while (true) {
                sb.append((CharSequence) str);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        String string = sb.toString();
        js3.m(string);
        return string;
    }

    public static String X(String str, String str2, String str3) {
        js3.p(str, "<this>");
        js3.p(str2, "oldValue");
        js3.p(str3, "newValue");
        int iI0 = f88.i0(str, str2, 0, false);
        if (iI0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iI0);
            sb.append(str3);
            i2 = iI0 + length;
            if (iI0 >= str.length()) {
                break;
            }
            iI0 = f88.i0(str, str2, iI0 + i, false);
        } while (iI0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public static boolean Y(int i, String str, String str2, boolean z) {
        js3.p(str, "<this>");
        return !z ? str.startsWith(str2, i) : V(str, str2, z, i, 0, str2.length());
    }

    public static boolean Z(String str, String str2, boolean z) {
        js3.p(str, "<this>");
        js3.p(str2, "prefix");
        return !z ? str.startsWith(str2) : V(str, str2, z, 0, 0, str2.length());
    }

    public static Integer a0(String str) {
        boolean z;
        int i;
        int i2;
        js3.p(str, "<this>");
        js3.q(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (js3.r(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    public static Long b0(int i, String str) {
        boolean z;
        js3.p(str, "<this>");
        js3.q(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (js3.r(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i2 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i2 = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) str.charAt(i2), i);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / ((long) i);
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * ((long) i);
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
